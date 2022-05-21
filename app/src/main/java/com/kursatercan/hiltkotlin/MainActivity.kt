package com.kursatercan.hiltkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject //field injection
    lateinit var lars : Musician

    @Inject
    lateinit var myClass : ClassExample

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lars.sing()

        println(myClass.myFunction())
        println(myClass.secondFunction())
    /*
        val instrument = Instrument()
        val band = Band()
        var james = Musician(instrument,band)
        james.sing()

     */
    }
}

@AndroidEntryPoint
class FragmentExample() : Fragment(){
    @Inject
    lateinit var kirk : Musician
}