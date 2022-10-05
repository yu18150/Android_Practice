package com.yuchen.debugging

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "hsiang"

class MainActivity : AppCompatActivity() {
    // private val helloTextView: TextView by lazy { findViewById(R.id.division_textview) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    // private val helloTextView: TextView = findViewById(R.id.division_textview)

    override fun onStart() {
        super.onStart()

        val helloTextView: TextView = findViewById(R.id.division_textview)
        helloTextView.text = "Hello, debugging!"
    }

    override fun onResume() {
        super.onResume()

        division()
        logging()
    }

    private fun division() {
        val numerator = 60
        var denominator = 4
        repeat(4) {
            Thread.sleep(3000)
            Log.d(TAG, "${numerator / denominator}")
            // findViewById<TextView>(R.id.division_textview).setText("${numerator / denominator}")
            denominator--
        }
    }

    private fun logging() {
        Log.e(TAG, "ERROR: a serious error like an app crash")
        Log.w(TAG, "WARN: warns about the potential for serious errors")
        Log.i(TAG, "INFO: reporting technical information, such as an operation succeeding")
        Log.d(TAG, "DEBUG: reporting technical information useful for debugging")
        println("hahaha")
        Log.v(TAG, "VERBOSE: more verbose than DEBUG logs")
    }
}
