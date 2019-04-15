package com.daya.kotlin.dagger2.sample.car

import android.util.Log
import com.daya.kotlin.dagger2.sample.PerActivity
import javax.inject.Inject

@PerActivity
class Car @Inject constructor(val engine: Engine, val wheels: Wheels, val driver: Driver) {
    init {
        Log.d(TAG, "car1 created.")
    }

    @Inject
    fun enableRemote(remote: Remote) {
        remote.listener = this
    }

    fun drive() {
        engine.start()
        Log.d(TAG, """
            $this + drives + $driver
        """.trimIndent())
    }

    companion object {
        const val TAG = "Car"
    }
}