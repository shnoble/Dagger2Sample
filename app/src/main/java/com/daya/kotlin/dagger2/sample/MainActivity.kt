package com.daya.kotlin.dagger2.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.daya.kotlin.dagger2.sample.car.Car
import com.daya.kotlin.dagger2.sample.dagger.DaggerActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerActivityComponent.builder()
            .horsePower(100)
            .engineCapacity(1400)
            .appComponent((application as ExampleApp).component)
            .build()
        component.inject(this)
        car1.drive()
        car2.drive()
    }
}
