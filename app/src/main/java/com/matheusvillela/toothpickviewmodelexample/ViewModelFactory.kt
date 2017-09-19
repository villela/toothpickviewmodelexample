package com.matheusvillela.toothpickviewmodelexample

import android.app.Application
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import toothpick.Toothpick
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ViewModelFactory : ViewModelProvider.NewInstanceFactory {
    private val app: Application

    @Inject
    constructor(app: Application) : super() {
        this.app = app
    }

    override fun <T : ViewModel> create(modelClass: Class<T>) =
            Toothpick.openScope(app).getInstance(modelClass) as T

}