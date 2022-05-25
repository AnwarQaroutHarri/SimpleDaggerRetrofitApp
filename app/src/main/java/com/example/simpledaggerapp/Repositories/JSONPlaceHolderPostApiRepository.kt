package com.example.simpledaggerapp.Repositories

import com.example.simpledaggerapp.APIs.JSONPlaceHolderPostAPI
import com.example.simpledaggerapp.Models.Post
import retrofit2.Call
import javax.inject.Inject

class JSONPlaceHolderPostApiRepository @Inject constructor() {

    @Inject
     lateinit var retrofitInstance: JSONPlaceHolderPostAPI

    fun getPost() : Call<Post> {
        return retrofitInstance.getPost()
    }
}