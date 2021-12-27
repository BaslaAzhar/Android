package com.example.android_semester_project
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class productServiceBuilder {
    object ServiceBuilder{
        private const val URL = "https://disease.sh/v2/"
        //CREATE HTTP CLIENT
        private val okHttp =OkHttpClient.Builder()

        private val builder =Retrofit.Builder().baseUrl(URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttp.build())

        //create retrofit Instance
        private val retrofit = builder.build()

        fun <T> buildService (serviceType :Class<T>):T{
            return retrofit.create(serviceType)
        }

    }
}