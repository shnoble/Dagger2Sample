package com.daya.kotlin.dagger2.sample.car

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {
    var listener: Car? = null
        set(value) {
            field = value
            Log.d(TAG, "remote connected.")
        }

    companion object {
        const val TAG = "Car"
    }
}
