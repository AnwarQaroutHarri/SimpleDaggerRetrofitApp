package com.example.simpledaggerapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {



    /*
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory) : ViewModelProvider.Factory

     */


    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel::class)
    abstract fun splashViewModel(viewModel: MainActivityViewModel): ViewModel



}