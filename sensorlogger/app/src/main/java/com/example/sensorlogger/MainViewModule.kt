package com.example.sensorlogger;

import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
class MainViewModule @Inject constructor(
    private val gyroscopeSensor: gyroscopeSensor
) : ViewModel(){

    init {
        gyroscopeSensor.startListening()
        gyroscopeSensor.setOnValuesChangedListener { values -> {
            val x = values[0]
            val y = values[1]
            val z = values[2]
        } }
    }
}
