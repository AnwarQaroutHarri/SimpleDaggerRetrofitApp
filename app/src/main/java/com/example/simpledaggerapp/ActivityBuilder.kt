package com.example.simpledaggerapp


import dagger.android.ContributesAndroidInjector
import dagger.Module

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity

}