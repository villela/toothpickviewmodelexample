package com.matheusvillela.toothpickviewmodelexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val viewModel = obtainViewModel(MainViewModel::class.java)
        val view = findViewById<TextView>(R.id.main_activity_text)
        view.text = viewModel.text
    }
}