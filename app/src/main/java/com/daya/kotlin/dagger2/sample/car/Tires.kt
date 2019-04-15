package com.daya.kotlin.dagger2.sample.car

import android.util.Log

class Tires {
    init {
        Log.d(TAG, "tires created.")
    }

    fun inflate() {
        Log.d(TAG, "tires inflated.")
    }

    companion object {
        const val TAG = "Car"
    }
}


