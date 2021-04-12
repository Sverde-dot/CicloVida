package com.example.ciclovida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Estado","onCreate")
    }

    override fun onStart() {
        super.onStart()

        Log.d("Estado","onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.d("Estado","onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.d("Estado","en pausa")
    }

    override fun onStop() {
        super.onStop()

        Log.d("Estado","en segundo plano")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("Estado","fue destruida")
    }
}