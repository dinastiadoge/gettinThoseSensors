package com.example.sensorlogger

import android.content.Context
import android.content.pm.PackageManager
import android.hardware.Sensor

data class gyroscopeSensor (
    val context: Context
) : AndroidSensor(
    context = context,
    sensorFeature = PackageManager.FEATURE_SENSOR_GYROSCOPE,
    sensorType = Sensor.TYPE_GYROSCOPE
)