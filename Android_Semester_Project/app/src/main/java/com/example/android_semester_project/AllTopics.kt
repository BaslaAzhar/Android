package com.example.android_semester_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_all_topics.*

class AllTopics : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_topics)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val arrayList = ArrayList<Model1>()
        arrayList.add(Model1(id = 1, title="Buy Ladies Dresses"))
        arrayList.add(Model1(id = 2, title="Buy Ladies Shoes"))
        arrayList.add(Model1(id = 3, title="Buy Bags"))
        arrayList.add(Model1(id = 4, title="Buy Abayas"))
        arrayList.add(Model1(id = 5, title="Buy Perfumes"))
        arrayList.add(Model1(id = 6, title="Buy Cosmetics"))
        arrayList.add(Model1(id = 7, title="Buy Jewelry"))



        val myAdapter = MyAdapter1(arrayList, this)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = myAdapter
    }


    override fun onSupportNavigateUp(): Boolean {
        super.onBackPressed()
        return true
    }

    fun onBackPressedBtn(view: android.view.View){
        val intent = Intent(this@AllTopics, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ResultProfileBinding.inflate(layoutInflater)
        val view: View = binding.getRoot()
        setContentView(view)
    }
}