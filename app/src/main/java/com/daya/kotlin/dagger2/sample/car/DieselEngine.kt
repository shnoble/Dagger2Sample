package com.daya.kotlin.dagger2.sample.car

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class DieselEngine
@Inject constructor(
    @Named("HorsePower") val horsePower: Int,
    @Named("EngineCapacity") val engineCapacity: Int
) : Engine {

    override fun start() {
        Log.d(TAG, """
            Diesel engine started.
            HorsePower: $horsePower
            EngineCapacity: $engineCapacity
        """.trimIndent())
    }

    companion object {
        const val TAG = "Car"
    }
}