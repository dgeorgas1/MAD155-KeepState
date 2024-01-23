package com.example.keepstate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var textView2: TextView
    lateinit var textView3: TextView
    lateinit var textView4: TextView
    lateinit var buttonSubmit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        textView2 = findViewById(R.id.textView2)
        textView3 = findViewById(R.id.textView3)
        textView4 = findViewById(R.id.textView4)
        buttonSubmit = findViewById(R.id.buttonSubmit)

        buttonSubmit.setOnClickListener {
            textView.setText("Button Has Been Clicked!")
            textView2.setText("Android II")
            textView3.setText("Keep State Assignment")
            textView4.setText("Dan Georgas")
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putString("save_1", textView.text.toString())
        outState.putString("save_2", textView2.text.toString())
        outState.putString("save_3", textView3.text.toString())
        outState.putString("save_4", textView4.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        textView.setText(savedInstanceState.getString("save_1"))
        textView2.setText(savedInstanceState.getString("save_2"))
        textView3.setText(savedInstanceState.getString("save_3"))
        textView4.setText(savedInstanceState.getString("save_4"))
    }
}