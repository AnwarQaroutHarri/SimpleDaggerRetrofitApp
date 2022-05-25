package com.example.simpledaggerapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.simpledaggerapp.Models.Post
import com.example.simpledaggerapp.Repositories.JSONPlaceHolderPostApiRepository
import dagger.multibindings.IntKey
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Response
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(private val jsonPlaceHolderPostApiRepository: JSONPlaceHolderPostApiRepository) : ViewModel() {


    val myResponse: MutableLiveData<Call<Post>> = MutableLiveData()

    fun getPost(){
        viewModelScope.launch {
            val response = jsonPlaceHolderPostApiRepository.getPost()
            myResponse.value = response
        }
    }
}