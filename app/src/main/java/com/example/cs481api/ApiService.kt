package com.example.cs481api

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("todos")
    fun getPosts(): Call<MutableList<PostModel>>

}

