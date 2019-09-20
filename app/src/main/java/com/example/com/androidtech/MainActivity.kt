package com.example.com.androidtech

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {


    private val array = arrayOf("Clothing", "Accessories", "Electronics", "Home", "Outdoors", "Sports")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        Log.e(TAG, "onCreate")

        val listView = findViewById<ListView>(R.id.listView)

        //If you want to set some data on the listView, you need adapter....

        val myListViewAdapter = ArrayAdapter(this, R.layout.listeview_item, array)
        listView.adapter = myListViewAdapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val colorClicked = listView.getItemAtPosition(position) as String
            if (colorClicked == array[5]) startActivity(Intent(this, ActivityB::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy")
    }

    /*override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        when (requestCode) {
            1 -> {
                if (grantResults.isEmpty() || grantResults[0] != PackageManager.PERMISSION_GRANTED) {
                    // user denied the permissions
                    Toast.makeText(this, "User denied the permission", Toast.LENGTH_LONG).show()


                } else {
                    //user granted the permission
                    startActivity(Intent(this, ActivityB::class.java))
                }
            }
        }
    }

    private fun isLocationPermissionGranted(): Boolean {
        return ContextCompat.checkSelfPermission(
            this,
            Manifest.permission.ACCESS_FINE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED
    }


    //Requests location Permission
    *//**/
    /**
     * 1. ContextCompat
     * 2. Package Manager
     * 3. Activity Compat
     *//**//*
    private fun askForLocationPermission() {
        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION), 1)
    }


    fun whatsappMock() {
        button.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(""))
            intent.putExtra("", "")
            startActivity(intent)
        }
    }*/

    companion object {
        private const val TAG = "Demo"
    }
}
