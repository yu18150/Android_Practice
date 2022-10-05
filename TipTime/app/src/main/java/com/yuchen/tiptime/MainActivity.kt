package com.yuchen.tiptime

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.yuchen.tiptime.databinding.ActivityMainBinding
import java.text.NumberFormat
import kotlin.math.ceil

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calculateButton.setOnClickListener {
            calculateTip()
            // stringToDoubleTest()
        }
    }

    private fun stringToDoubleTest() {
        val numberString = "9876"
        val chineseString = "陳宇翔"
        val englishString = "zxcv"
        Log.d("tt", "${chineseString.toDoubleOrNull()}")
    }


    private fun calculateTip() {
        val stringInTextField = binding.costOfService.text.toString()
        // if (stringInTextField == null) { return }

        var cost = stringInTextField.toDoubleOrNull()
        // if (cost == null) { cost = 0.0 }
        if (cost == null) {
            binding.tipResult.text = ""
            return
        }
        val tipPercentage = when (binding.tipOptions.checkedRadioButtonId) {
            R.id.option_twenty_percent   -> 0.2
            R.id.option_eighteen_percent -> 0.18
            else                         -> 0.15
        }
        var tip = cost * tipPercentage

        if (binding.roundUpSwitch.isChecked) {
            // round up
            tip = ceil(tip)
        }

        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.tipResult.text = getString(R.string.tip_amount, formattedTip)


    }
}