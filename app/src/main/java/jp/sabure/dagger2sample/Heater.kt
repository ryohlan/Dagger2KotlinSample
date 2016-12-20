package jp.sabure.dagger2sample

interface Heater {
    fun on()
    fun off()
    fun isHot(): Boolean
}