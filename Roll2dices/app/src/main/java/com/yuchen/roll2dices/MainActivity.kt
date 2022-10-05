package com.yuchen.roll2dices

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        roll2Dice()

        // button
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { roll2Dice() }
    }

    private fun roll2Dice() {
        val dice = Dice(6)

        val dicePoint = dice.roll()
        val drawableResource = when (dicePoint) {
            1    -> R.drawable.dice_1
            2    -> R.drawable.dice_2
            3    -> R.drawable.dice_3
            4    -> R.drawable.dice_4
            5    -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val diceImage : ImageView = findViewById(R.id.imageView)
        diceImage.setImageResource(drawableResource)

        val dicePoint2 = dice.roll()
        val drawableResource2 = when (dicePoint2) {
            1    -> R.drawable.dice_1
            2    -> R.drawable.dice_2
            3    -> R.drawable.dice_3
            4    -> R.drawable.dice_4
            5    -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val diceImage2 : ImageView = findViewById(R.id.imageView2)
        diceImage2.setImageResource(drawableResource2)

        val diceSum: TextView = findViewById(R.id.textView)
        diceSum.text = (dicePoint + dicePoint2).toString()
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
