package com.example.sensorlogger

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SensorModule {

    @Provides
    @Singleton
    fun provideGyroscopeSensor(
        @ApplicationContext context: Context
    ): MeasurableSensor {
        return GyroscopeSensor(context)
    }
}
