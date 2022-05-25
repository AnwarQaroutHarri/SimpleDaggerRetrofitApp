package com.example.simpledaggerapp.APIs

import com.example.simpledaggerapp.Models.Post
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface JSONPlaceHolderPostAPI  {

    @GET("posts/1")
    fun getPost() : Call<Post>
}