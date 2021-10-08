package com.yoochangwonspro.airbnb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.naver.maps.map.MapView

class MainActivity : AppCompatActivity() {

    private val mapView: MapView by lazy {
        findViewById(R.id.mapView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}