package com.example.simpledaggerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.*
import com.example.simpledaggerapp.Models.Post
import com.example.simpledaggerapp.Repositories.JSONPlaceHolderPostApiRepository
import com.example.simpledaggerapp.databinding.ActivityMainBinding
import dagger.android.DaggerActivity
import dagger.android.support.DaggerAppCompatActivity
import org.intellij.lang.annotations.JdkConstants
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {


    @Inject
    lateinit var viewModelFactory: ViewModelFactory



    /*
    @Inject
    lateinit var viewModel : MainActivityViewModel

     */


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        val viewModel : MainActivityViewModel = viewModelFactory.create(MainActivityViewModel::class.java)

        viewModel.getPost()
        viewModel.myResponse.observe(this, Observer { response ->
            response.enqueue(object : Callback<Post> {
                override fun onResponse(call: Call<Post>?, response: Response<Post>?) {
                    Log.d("Response", "--------- ${response?.body().toString()}")
                    println("................. ${response?.body().toString()}")
                    binding.textView.text = response?.body().toString()
                }

                override fun onFailure(call: Call<Post>?, t: Throwable?) {
                    Log.d("Response", "unsuccessful")
                }
            })

        })
    }



}