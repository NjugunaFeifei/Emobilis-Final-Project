package com.example.finalproject

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class ViewDoctorsActivity : AppCompatActivity() {
    lateinit var mListDoctors:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_doctors)
        mListDoctors = findViewById(R.id.mListDoctors)
        var doctors:ArrayList<Doctor> = ArrayList()
        var myAdapter = CarsAdapter(applicationContext,doctors)
        var progress = ProgressDialog(this)
        progress.setTitle("Loading")
        progress.setMessage("Please wait...")

        //Access the table in the database

        var my_db = FirebaseDatabase.getInstance().reference.child("Doctors")
        //Start retrieving data
        progress.show()
        my_db.addValueEventListener(object: ValueEventListener {
            override fun onDataChange(p0: DataSnapshot) {
                //Get the data and put it on the arraylist users
                doctors.clear()
                for (snap in p0.children){
                    var doctor = snap.getValue(Doctor::class.java)
                    doctors.add(doctor!!)
                }
                //Notify the adapter that data has changed
                myAdapter.notifyDataSetChanged()
                progress.dismiss()
            }

            override fun onCancelled(p0: DatabaseError) {
                progress.dismiss()
                Toast.makeText(applicationContext,"DB Locked",Toast.LENGTH_LONG).show()
            }
        })

        mListDoctors.adapter = myAdapter


    }

}