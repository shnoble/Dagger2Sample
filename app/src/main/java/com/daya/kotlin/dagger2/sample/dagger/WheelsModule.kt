package com.daya.kotlin.dagger2.sample.dagger

import com.daya.kotlin.dagger2.sample.car.Rims
import com.daya.kotlin.dagger2.sample.car.Tires
import com.daya.kotlin.dagger2.sample.car.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {
    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    @Provides
    fun provideTiers(): Tires {
        val tiers = Tires()
        tiers.inflate()
        return tiers
    }

    @Provides
    fun provideWheels(rims: Rims, tires: Tires) =
        Wheels(rims, tires)
}