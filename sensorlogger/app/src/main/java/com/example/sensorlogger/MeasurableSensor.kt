package com.example.sensorlogger

abstract class MeasurableSensor (
    protected val sensorType: Int
) {
    protected var onSensorValuesChanged: ((List<Float>) -> Unit)? = null

    abstract var doesSensorExist: Boolean

    abstract fun startListening()
    abstract fun stopListening()

    fun setOnValuesChangedListener(listener: (List<Float>) -> Unit){
        onSensorValuesChanged = listener
    }
}