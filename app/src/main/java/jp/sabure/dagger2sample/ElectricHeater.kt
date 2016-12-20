package jp.sabure.dagger2sample

import android.util.Log

class ElectricHeater : Heater {
    var heating: Boolean = false

    override fun on() {
        Log.e(this.javaClass.simpleName, "~ ~ ~ heating ~ ~ ~")
        heating = true
    }

    override fun off() {
        heating = false
    }

    override fun isHot(): Boolean = heating
}