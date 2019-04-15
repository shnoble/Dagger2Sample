package com.daya.kotlin.dagger2.sample.dagger

import com.daya.kotlin.dagger2.sample.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object DriverModule {
    @Provides
    @Singleton
    @JvmStatic
    fun provideDriver(): Driver {
        return Driver()
    }
}