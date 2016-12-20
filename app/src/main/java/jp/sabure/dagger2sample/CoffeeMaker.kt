package jp.sabure.dagger2sample

import android.util.Log
import dagger.Lazy
import javax.inject.Inject

class CoffeeMaker {
    private val heater: Lazy<Heater>
    private val pump: Pump

    @Inject
    constructor(heater: Lazy<Heater>, pump: Pump) {
        this.heater = heater
        this.pump = pump
    }

    fun brew() {
        heater.get().on()
        pump.pump()
        Log.e("coffee", " [_]P coffee! [_]P ")
        heater.get().off()
    }
}