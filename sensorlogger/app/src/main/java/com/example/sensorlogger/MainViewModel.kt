package com.example.sensorlogger;

import androidx.lifecycle.ViewModel;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

@HiltViewModel
class MainViewModel @Inject constructor(
    private val gyroscopeSensor: MeasurableSensor
) : ViewModel(){

    private val _gyroValues = MutableStateFlow(Triple(0f, 0f, 0f))
    val gyroValues: StateFlow<Triple<Float, Float, Float>> = _gyroValues

    init {
        gyroscopeSensor.startListening()
        gyroscopeSensor.setOnValuesChangedListener { values -> {
            println(values[0])
            println(values[1])
            println(values[2])
            val x = values[0]
            val y = values[1]
            val z = values[2]
            _gyroValues.value = Triple(x, y, z)
        } }
    }
}
