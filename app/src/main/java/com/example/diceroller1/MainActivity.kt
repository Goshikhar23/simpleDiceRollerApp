package com.example.diceroller1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage= findViewById(R.id.dice_image)
        val rollButton: Button = findViewById(R.id.roll_button)
        val clearButton:Button= findViewById(R.id.clear_button)
        clearButton.setOnClickListener { clearImage() }

        rollButton.setOnClickListener{rollDice()

        }

    }
    private fun rollDice(){

        val randomInt= Random().nextInt(6) + 1
        val drawableResource= when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
          }
        diceImage.setImageResource(drawableResource)

    }
    private fun clearImage(){
        diceImage.setImageResource(R.drawable.empty_dice)
    }


}
