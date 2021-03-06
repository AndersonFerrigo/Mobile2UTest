package com.example.mobile2utest.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInitializer {
    fun init() {
        Retrofit.Builder()
            .baseUrl("http://192.168.0.3:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}