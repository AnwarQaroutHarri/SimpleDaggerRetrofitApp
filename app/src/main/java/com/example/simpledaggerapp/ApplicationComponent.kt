package com.example.simpledaggerapp

import android.app.Application
import com.example.simpledaggerapp.APIs.RetrofitInstanceModule
import com.example.simpledaggerapp.ViewModels.Main.MainActivityViewModel
import com.example.simpledaggerapp.ViewModels.General.ViewModelModule
import com.example.simpledaggerapp.ui.ActivityBuilder
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [RetrofitInstanceModule::class, ViewModelModule::class, AndroidSupportInjectionModule::class, ActivityBuilder::class])
interface ApplicationComponent : AndroidInjector<MyApplication> {


    fun getMainViewModel() : MainActivityViewModel

    //fun inject(activity: MainActivity)

    //fun myViewModel() : InjectableViewModelFactory<MainActivityViewModel>



    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application: Application): Builder
        fun build(): ApplicationComponent
    }







   // fun getRetrofitInstance() : RetrofitInstanceModule

}