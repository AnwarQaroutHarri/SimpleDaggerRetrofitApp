package com.example.simpledaggerapp.Repositories

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.simpledaggerapp.APIs.JSONPlaceHolderPostAPI
import com.example.simpledaggerapp.Models.PostModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class JSONPlaceHolderPostApiRepository @Inject constructor() {

    @Inject
     lateinit var retrofitInstance: JSONPlaceHolderPostAPI

     private var postLiveData = MutableLiveData<PostModel>()
    val _postLiveData : LiveData<PostModel>
    get() = postLiveData



    fun getPost() {
        Log.d("anwar","fuck")
        val response = retrofitInstance.getPost()
        response.enqueue(object : Callback<PostModel> {

            override fun onResponse(call: Call<PostModel>, response: Response<PostModel>) {
                Log.d("Response", "--------- ${response.body().toString()}")
                println("................. ${response.body().toString()}")
                postLiveData.postValue(response.body())
            }

            override fun onFailure(call: Call<PostModel>, t: Throwable) {
                Log.d("Response", "unsuccessful")
            }
        })
    }
}