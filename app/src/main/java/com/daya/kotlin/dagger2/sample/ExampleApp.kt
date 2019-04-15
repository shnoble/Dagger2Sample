package com.daya.kotlin.dagger2.sample

import android.app.Application
import com.daya.kotlin.dagger2.sample.dagger.AppComponent
import com.daya.kotlin.dagger2.sample.dagger.DaggerAppComponent

class ExampleApp : Application() {
    lateinit var component: AppComponent

    override fun onCreate() {
        super.onCreate()

        component = DaggerAppComponent.create()
    }
}