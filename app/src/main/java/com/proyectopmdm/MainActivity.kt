package com.proyectopmdm

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    }
}

//Style URL mapbox : mapbox://styles/joelpitavidal/cm42zsuoi006e01s6ad5l4nt7
//Access token : sk.eyJ1Ijoiam9lbHBpdGF2aWRhbCIsImEiOiJjbTQ1a2Rtd3cwbG4yMmtzNDJ3ZWUwZ2I1In0.RHJ994dwjALgNRlU-c5gZg