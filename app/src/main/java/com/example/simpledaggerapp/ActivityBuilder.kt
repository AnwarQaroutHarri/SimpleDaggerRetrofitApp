package com.example.simpledaggerapp


import dagger.android.ContributesAndroidInjector
import dagger.Module

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [ViewModelModule::class])
    abstract fun contributeMainActivity(): MainActivity

}