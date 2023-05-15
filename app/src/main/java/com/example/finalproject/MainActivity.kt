package com.example.finalproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var mTitle: TextView
    lateinit var mText: TextView
    lateinit var mContent: TextView
    lateinit var mWords: TextView
    lateinit var mAsthma: Button
    lateinit var mAllergies: Button
    lateinit var mUlcers: Button
    lateinit var mStomach: Button
    lateinit var mConversions: Button
    lateinit var mCrumps: Button
    lateinit var mAddDoctors:Button
    lateinit var mViewDoctors: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTitle = findViewById(R.id.mTvTitle)
        mText = findViewById(R.id.mTvText)
        mWords = findViewById(R.id.mTvtext)
        mContent = findViewById(R.id.mTvcontent)
        mAllergies = findViewById(R.id.mBtnAllergies)
        mAsthma = findViewById(R.id.mBtnAsthma)
        mConversions = findViewById(R.id.mBtnConversions)
        mCrumps = findViewById(R.id.mBtnCrumps)
        mStomach = findViewById(R.id.mBtnStomach)
        mUlcers = findViewById(R.id.mBtnUlcers)
        mAddDoctors = findViewById(R.id.mBtnAddDoctors)
        mViewDoctors = findViewById(R.id.mBtnViewDoctors)

        mAsthma.setOnClickListener {
            val asthma = Intent(this, AsthmaWebsiteActivity::class.java)
            startActivity(asthma)
        }
        mAllergies.setOnClickListener {
            val allergies = Intent(this, AllergiesWebsiteActivity::class.java)
            startActivity(allergies)
        }
        mUlcers.setOnClickListener {
            val ulcers = Intent(this, UlcersWebsiteActivity::class.java)
            startActivity(ulcers)
        }
        mStomach.setOnClickListener {
            val stomach = Intent(this, StomachWebsiteActivity::class.java)
            startActivity(stomach)
        }
        mConversions.setOnClickListener {
            val conversions = Intent(this, ConvulsionsWebsiteActivity::class.java)
            startActivity(conversions)
        }
        mCrumps.setOnClickListener {
            val crumps = Intent(this, CrumpsWebsiteActivity::class.java)
            startActivity(crumps)
        }
        mAddDoctors.setOnClickListener {
            val addDoctor = Intent(this, AddDoctorsActivity::class.java)
            startActivity(addDoctor)
        }
        mViewDoctors.setOnClickListener {
            val viewDoctor = Intent(this, ViewDoctorsActivity::class.java)
            startActivity(viewDoctor)
        }
    }
}