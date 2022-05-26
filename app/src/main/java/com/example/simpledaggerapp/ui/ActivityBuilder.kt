package com.example.simpledaggerapp.ui


import com.example.simpledaggerapp.ui.Main.MainActivity
import dagger.android.ContributesAndroidInjector
import dagger.Module

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity

}