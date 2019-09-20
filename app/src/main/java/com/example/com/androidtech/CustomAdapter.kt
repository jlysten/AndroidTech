package com.example.com.androidtech

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import java.util.ArrayList

class CustomAdapter( context: Context, resource: Int, colorList: ArrayList<Color>) : ArrayAdapter<Color>(context, resource, colorList) {

    private var colors = colorList

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {

        var list = convertView
        if (list == null)list = LayoutInflater.from(context).inflate(R.layout.custom_listview_item,parent,false)


        val currentColor = colors[position]

        val image = list?.findViewById<ImageView>(R.id.custom_listview_image)
        image?.setImageResource(currentColor.image)


        val title = list?.findViewById<TextView>(R.id.title)
        title?.text = currentColor.title


        val body = list?.findViewById<TextView>(R.id.body)
        body?.text = currentColor.body

        return list
    }
}