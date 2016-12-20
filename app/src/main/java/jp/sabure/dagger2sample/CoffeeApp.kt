package jp.sabure.dagger2sample

import dagger.Component
import javax.inject.Singleton

class CoffeeApp {
    @Singleton
    @Component(modules = arrayOf(DripCoffeeModule::class))
    interface Coffee {
        fun maker(): CoffeeMaker
    }
}