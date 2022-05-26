package com.example.simpledaggerapp.APIs

import com.example.simpledaggerapp.Models.PostModel
import retrofit2.Call
import retrofit2.http.GET

interface JSONPlaceHolderPostAPI  {

    @GET("posts/1")
    fun getPost() : Call<PostModel>


}