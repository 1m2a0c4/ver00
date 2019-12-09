package com.example.ver00

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var flag = "null"

        val buttonUp = findViewById<Button>(R.id.up) as Button
        val buttonDown = findViewById<Button>(R.id.down) as Button


        buttonDown.setOnClickListener(){
            flag = "down"
        }

        buttonUp.setOnClickListener(){
            flag = "up"
        }

        when(flag){
            "up"->{

            }
        }
    }
}






