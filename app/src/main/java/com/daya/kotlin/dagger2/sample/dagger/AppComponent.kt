package com.daya.kotlin.dagger2.sample.dagger

import com.daya.kotlin.dagger2.sample.car.Driver
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {
    val driver: Driver
}