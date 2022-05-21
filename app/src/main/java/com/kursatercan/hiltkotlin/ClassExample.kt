package com.kursatercan.hiltkotlin

import com.google.gson.Gson
import javax.inject.Inject

class ClassExample @Inject constructor(@FirstImplementor private val myInterfaceImpl: MyInterface,
                                       private val gson : Gson,
                                        @SecondImplementor private val mySecondImpl: MyInterface) {

    fun myFunction(): String{
        return "Working: ${myInterfaceImpl.myPrintFunction()}"
    }

    fun secondFunction() : String{
        return "Working: ${mySecondImpl.myPrintFunction()}"
    }
}