package com.example.finalproject


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class CarsAdapter(var context: Context, var data:ArrayList<Doctor>):BaseAdapter() {
    private class ViewHolder(row:View?){
        var mTxtModel:TextView
        var mTxtColor:TextView
        var mImage:ImageView
        init {
            this.mTxtModel = row?.findViewById(R.id.mEdtName2) as TextView
            this.mTxtColor = row?.findViewById(R.id.mEdtProfession2) as TextView
            this.mImage = row?.findViewById(R.id.imgView) as ImageView
        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View?
        var viewHolder:ViewHolder
        if (convertView == null){
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.view_doctors_list,parent,false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var item:Doctor = getItem(position) as Doctor
        viewHolder.mTxtModel.text = item.name
        viewHolder.mTxtColor.text = item.profession
        Glide.with(context).load(item.image).into(viewHolder.mImage)
        return view as View
    }

    override fun getItem(position: Int): Any {
        return  data.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return data.count()
    }
}