package com.example.simpledaggerapp.APIs

import com.example.simpledaggerapp.util.Constants.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class RetrofitInstanceModule {

    @Singleton
    @Provides
    fun provideRetrofitInstance() : JSONPlaceHolderPostAPI {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(JSONPlaceHolderPostAPI::class.java)
    }

}