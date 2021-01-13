package com.example.androidarchitecturecomponents

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.startup.AppInitializer
import com.example.androidarchitecturecomponents.appstartup.ExampleLoggerInitializer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // App Startup
        var context = applicationContext
//        appStartup(context)
    }

    private fun appStartup(context: Context) {
        AppInitializer.getInstance(context)
            .initializeComponent(ExampleLoggerInitializer::class.java)
    }


}