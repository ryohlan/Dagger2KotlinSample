package jp.sabure.dagger2sample

import android.util.Log
import javax.inject.Inject


class Thermosiphon : Pump {
    private val heater: Heater

    @Inject
    constructor(heater: Heater) {
        this.heater = heater
    }

    override fun pump() {
        if (heater.isHot()) {
            Log.d(this.javaClass.simpleName, "pumping")
        }
    }
}
