package com.daya.kotlin.dagger2.sample.dagger

import com.daya.kotlin.dagger2.sample.car.DieselEngine
import com.daya.kotlin.dagger2.sample.car.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {

    /*@Binds
    abstract fun provideHorsePower(@Named("HorsePower") horsePower: Int): Int

    @Binds
    abstract fun provideEngineCapacity(@Named("EngineCapacity") engineCapacity: Int): Int*/

    @Binds
    abstract fun bindEngine(engine: DieselEngine): Engine
}