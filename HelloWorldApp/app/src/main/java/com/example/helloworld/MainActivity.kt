package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        findViewById<Button>(R.id.button).setOnClickListener {
            Log.i("Shahina", "Tapped on button to change the text color")

                findViewById<TextView>(R.id.textView).setTextColor( getResources().getColor(R.color.codePathGreen))


        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            Log.i("Shahina", "Tapped on button to change the background color")
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.teal_200))
        }
    }
}