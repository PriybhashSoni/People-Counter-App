package com.pys.peoplecounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val button=findViewById<Button>(R.id.button)
        val text=findViewById<TextView>(R.id.textView)
        var counter=0
        button.setOnClickListener {
            counter+=1
            text.text="total count is"+counter.toString()
            Toast.makeText(this, "its a toast", Toast.LENGTH_SHORT).show()
        }
    }
}