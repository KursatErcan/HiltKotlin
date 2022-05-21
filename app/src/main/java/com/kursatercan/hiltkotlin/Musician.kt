package com.kursatercan.hiltkotlin

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
//constructor injection
@ActivityScoped
class Musician @Inject constructor(instrument: Instrument, band: Band){
    fun sing(){
        println("working")
    }
}