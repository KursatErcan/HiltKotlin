package com.kursatercan.hiltkotlin

import javax.inject.Inject

class MyInterfaceImpl @Inject constructor() : MyInterface {
    override fun myPrintFunction(): String {
        return "My interface implementor"
    }
}