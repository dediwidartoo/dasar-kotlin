package com.dediwidarto.tasbih

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_toast.setOnClickListener{ v-> Toast.makeText(this, "Toast ini lho ya", Toast.LENGTH_SHORT).show()}
        button_count.setOnClickListener{
            count++
            show_count.text = count.toString()
        }
        button_reset.setOnClickListener{
            count = 0
            show_count.text = count.toString()
        }
    }
}
