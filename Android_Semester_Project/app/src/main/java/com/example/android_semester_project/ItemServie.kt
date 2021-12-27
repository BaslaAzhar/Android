package com.example.android_semester_project
import com.example.recyclerview.MyCustomeApi
import retrofit2.Call
import retrofit2.http.GET
interface ItemServie {
    @GET("ID")
    fun getID () : Call<List<MyCustomeApi>>
}