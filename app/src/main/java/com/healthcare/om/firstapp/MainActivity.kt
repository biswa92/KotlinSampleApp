package com.healthcare.om.firstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var container = "Apple"
        Toast.makeText(MainActivity@this,container,Toast.LENGTH_SHORT).show()


    }
}
