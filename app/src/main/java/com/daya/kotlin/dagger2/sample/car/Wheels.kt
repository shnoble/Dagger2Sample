package com.daya.kotlin.dagger2.sample.car

import android.util.Log
import javax.inject.Inject

class Wheels @Inject constructor(val rims: Rims, val tires: Tires) {
    init {
        Log.d(TAG, "wheels created.")
    }

    companion object {
        const val TAG = "Car"
    }
}
