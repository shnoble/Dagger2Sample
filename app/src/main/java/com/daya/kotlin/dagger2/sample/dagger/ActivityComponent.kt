package com.daya.kotlin.dagger2.sample.dagger

import com.daya.kotlin.dagger2.sample.MainActivity
import com.daya.kotlin.dagger2.sample.PerActivity
import com.daya.kotlin.dagger2.sample.car.Car
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

@PerActivity
@Component(dependencies = [AppComponent::class], modules = [WheelsModule::class, DieselEngineModule::class])
interface ActivityComponent {
    val car: Car

    fun inject(activity: MainActivity)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun horsePower(@Named("HorsePower") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named("EngineCapacity") engineCapacity: Int): Builder

        fun appComponent(component: AppComponent): Builder

        fun build(): ActivityComponent
    }
}
