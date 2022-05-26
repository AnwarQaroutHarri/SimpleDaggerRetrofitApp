package com.example.simpledaggerapp.ui.Main

import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.*
import com.example.simpledaggerapp.ViewModels.Main.MainActivityViewModel
import com.example.simpledaggerapp.R
import com.example.simpledaggerapp.ViewModels.General.ViewModelFactory
import com.example.simpledaggerapp.databinding.ActivityMainBinding
import dagger.android.support.DaggerAppCompatActivity
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

        viewModel.myResponse.observe(this, Observer { response ->
            Log.d("results",response.body)
            binding.textView.text = response.body.toString()
        })
    }



}