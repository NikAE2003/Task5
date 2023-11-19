package com.example.task5

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AnswerActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

        textView = findViewById(R.id.textView_answer)
        textView.setText("Hello world!!!")
    }
}