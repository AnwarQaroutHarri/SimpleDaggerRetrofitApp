package com.example.simpledaggerapp

import android.app.Application
import com.google.gson.internal.UnsafeAllocator.create
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.HasAndroidInjector
import io.reactivex.observers.TestObserver.create

class MyApplication : DaggerApplication()  {
    lateinit var appComponent : ApplicationComponent


    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
         appComponent = DaggerApplicationComponent.builder().application(this).build()
        return appComponent
    }


    /*

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerApplicationComponent.builder().application(this).build()
    }

     */


    /* override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
         return DaggerApplicationComponent.builder().application(this).build()
     }

     */

}