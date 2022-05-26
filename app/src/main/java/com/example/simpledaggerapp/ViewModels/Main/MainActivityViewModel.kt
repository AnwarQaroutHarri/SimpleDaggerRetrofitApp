package com.example.simpledaggerapp.ViewModels.Main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.simpledaggerapp.Models.PostModel
import com.example.simpledaggerapp.Repositories.JSONPlaceHolderPostApiRepository
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(private val jsonPlaceHolderPostApiRepository: JSONPlaceHolderPostApiRepository) : ViewModel() {


    val myResponse: LiveData<PostModel>
        get() = jsonPlaceHolderPostApiRepository._postLiveData

    init {
        jsonPlaceHolderPostApiRepository.getPost()
    }



}