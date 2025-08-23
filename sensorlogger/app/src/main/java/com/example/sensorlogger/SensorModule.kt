package com.example.sensorlogger

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SensorModule {

    @Provides
    @Singleton
    fun provideGyroScopeSensor(app: SensorLoggerApp): MeasurableSensor{
        return gyroscopeSensor(app)
    }
}