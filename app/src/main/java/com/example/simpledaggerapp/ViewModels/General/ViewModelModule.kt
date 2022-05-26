package com.example.simpledaggerapp.ViewModels.General

import androidx.lifecycle.ViewModel
import com.example.simpledaggerapp.ViewModels.Main.MainActivityViewModel
import dagger.Binds
import dagger.Module
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