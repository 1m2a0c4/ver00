package com.example.ver00

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var flag = "null"

        val buttonUp = findViewById<Button>(R.id.up) as Button
        val buttonDown = findViewById<Button>(R.id.down) as Button
        val buttonRight = findViewById<Button>(R.id.right) as Button
        val buttonLeft = findViewById<Button>(R.id.left) as Button




        buttonDown.setOnClickListener() {
            flag = "down"
            val messageView: TextView = findViewById(R.id.textV)
            messageView.text = flag
        }

        buttonUp.setOnClickListener() {
            flag = "up"
            val messageView: TextView = findViewById(R.id.textV)
            messageView.text = flag
        }

        buttonRight.setOnClickListener() {
            flag = "right"
            val messageView: TextView = findViewById(R.id.textV)
            messageView.text = flag
        }

        buttonLeft.setOnClickListener() {
            flag = "left"
            val messageView: TextView = findViewById(R.id.textV)
            messageView.text = flag
        }


       /*
        val messageView: TextView = findViewById(R.id.textV)

        messageView.text =
            when (flag) {
                "up" ->
                    "up"

                "down" ->
                    "down"

                else ->
                    "無効な操作"
            }

        */
    }
}







