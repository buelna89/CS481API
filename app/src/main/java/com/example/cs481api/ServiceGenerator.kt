package com.example.cs481api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ServiceGenerator {

    private val client = OkHttpClient.Builder().build()

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(MoshiConverterFactory.create())
        .client(client)
        .build()
        //.create(APIInterface::class.java)

        fun <T> buildService(service: Class <T>): T {
            return retrofit.create(service)
    }
}