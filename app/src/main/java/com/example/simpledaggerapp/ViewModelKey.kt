package com.example.simpledaggerapp

import androidx.lifecycle.ViewModel
import dagger.MapKey
import javax.inject.Inject
import kotlin.reflect.KClass


    @Target(AnnotationTarget.FUNCTION,AnnotationTarget.PROPERTY_GETTER,AnnotationTarget.PROPERTY_SETTER)
    @kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
    @MapKey
    internal annotation class ViewModelKey (val value: KClass<out ViewModel>) {

}