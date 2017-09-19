package com.matheusvillela.toothpickviewmodelexample

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import javax.inject.Inject


class MainViewModel @Inject constructor(app: Application, val text: String) : AndroidViewModel(app)