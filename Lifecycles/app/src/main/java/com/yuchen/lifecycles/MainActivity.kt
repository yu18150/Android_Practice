package com.yuchen.lifecycles

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("yutest", "onCreate")
    }

    override fun onStart() {
        super.onStart()

        Log.d("yutest", "onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.d("yutest", "onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.d("yutest", "onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.d("yutest", "onStop")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d("yutest", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("yutest", "onDestroy")
    }
}
