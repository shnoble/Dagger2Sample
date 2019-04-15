package com.daya.kotlin.dagger2.sample.dagger

import com.daya.kotlin.dagger2.sample.car.Engine
import com.daya.kotlin.dagger2.sample.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule() {

    /*@Binds
    abstract fun provideHorsePower(@Named("HorsePower") horsePower: Int): Int

    @Binds
    abstract fun provideEngineCapacity(@Named("EngineCapacity") engineCapacity: Int): Int*/

    @Binds
    abstract fun bindEngine(engine: PetrolEngine): Engine
}