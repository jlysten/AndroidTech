package com.example.com.androidtech

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class ActivityB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)


        val customListView = findViewById<ListView>(R.id.custom_listView)


        val colorList : ArrayList<Color> = ArrayList()

        colorList.add(Color(R.drawable.ic_launcher_foreground, "Football", "aaaaaaa"))
        colorList.add(Color(R.drawable.ic_launcher_foreground, "Cricket", "bbbbbbb"))
        colorList.add(Color(R.drawable.ic_launcher_foreground, "Tennis", "ccccccc"))
        colorList.add(Color(R.drawable.ic_launcher_foreground, "Badminton", "ddddddd"))
        colorList.add(Color(R.drawable.ic_launcher_foreground, "Swimming", "eeeeeee"))
        colorList.add(Color(R.drawable.ic_launcher_foreground, "TableTennis", "aaaaaaa"))
        colorList.add(Color(R.drawable.ic_launcher_foreground, "AB", "bbbbbbb"))
        colorList.add(Color(R.drawable.ic_launcher_foreground, "AC", "ccccccc"))
        colorList.add(Color(R.drawable.ic_launcher_foreground, "AD", "ddddddd"))
        colorList.add(Color(R.drawable.ic_launcher_foreground, "AE", "eeeeeee"))
        colorList.add(Color(R.drawable.ic_launcher_foreground, "AA", "aaaaaaa"))
        colorList.add(Color(R.drawable.ic_launcher_foreground, "AB", "bbbbbbb"))
        colorList.add(Color(R.drawable.ic_launcher_foreground, "AC", "ccccccc"))
        colorList.add(Color(R.drawable.ic_launcher_foreground, "AD", "ddddddd"))
        colorList.add(Color(R.drawable.ic_launcher_foreground, "AE", "eeeeeee"))
        colorList.add(Color(R.drawable.ic_launcher_foreground, "AA", "aaaaaaa"))
        colorList.add(Color(R.drawable.ic_launcher_foreground, "AB", "bbbbbbb"))
        colorList.add(Color(R.drawable.ic_launcher_foreground, "AC", "ccccccc"))
        colorList.add(Color(R.drawable.ic_launcher_foreground, "AD", "ddddddd"))
        colorList.add(Color(R.drawable.ic_launcher_foreground, "AE", "eeeeeee"))


        val customAdapter = CustomAdapter(this, 0, colorList)
        customListView.adapter = customAdapter

    }
}
