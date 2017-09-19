package com.matheusvillela.toothpickviewmodelexample

import android.app.Application
import toothpick.smoothie.module.SmoothieApplicationModule


class AppModule(application: Application) : SmoothieApplicationModule(application) {
    init {
        this.bind(Application::class.java).toInstance(application)
        this.bind(String::class.java).toInstance("Hello World")
    }
}