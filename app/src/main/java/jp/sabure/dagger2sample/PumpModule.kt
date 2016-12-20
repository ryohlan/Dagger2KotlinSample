package jp.sabure.dagger2sample

import dagger.Module
import dagger.Provides

@Module
class PumpModule {
    @Provides
    fun providePump(pump: Thermosiphon): Pump = pump
}