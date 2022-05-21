package com.kursatercan.hiltkotlin

import javax.inject.Inject

class SecondInterfaceImpl @Inject constructor() : MyInterface {
    override fun myPrintFunction(): String {
        return "My Second implementor"
    }
}