package com.example.android_semester_project

import android.animation.LayoutTransition
import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Build.VERSION_CODES
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.ActionBar
import androidx.core.view.isVisible

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkImplementation_Btn.setOnClickListener {
            val intent = Intent(this, AllTopics::class.java)
            startActivity(intent)
            finish()
        }


        var detailsText: TextView? = null
        val layout: LinearLayout? = null

        //actionBar?.setTitle("Android Implementation")
        supportActionBar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#146775")))
        supportActionBar!!.setTitle("Android Implementation")



    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }





}



