package com.example.android.diceroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //        initializing variables after setContentView
        diceImage = dice_image // this is from xml

        val rollButton = roll_button
//        rollButton.text = getString(R.string.lets_roll) // to change text dinamically

        rollButton.setOnClickListener {
//            Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }

    }

    private fun rollDice() {
        //        result_text.text = randomInt.toString()

        val drawableResource = when(Random.nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }
}
