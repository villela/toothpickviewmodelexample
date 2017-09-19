package com.matheusvillela.toothpickviewmodelexample

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProviders
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import toothpick.Toothpick


fun <T : ViewModel> AppCompatActivity.obtainViewModel(viewModelClass: Class<T>): T =
        ViewModelProviders.of(this, Toothpick.openScope(application)
                .getInstance(ViewModelFactory::class.java))
                .get(viewModelClass)

fun <T : ViewModel> Fragment.obtainViewModel(viewModelClass: Class<T>) =
        ViewModelProviders.of(this, Toothpick.openScope(activity.application)
                .getInstance(ViewModelFactory::class.java))
                .get(viewModelClass)