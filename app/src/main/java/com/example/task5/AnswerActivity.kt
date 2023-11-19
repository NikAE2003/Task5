package com.example.task5

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

const val EXTRA_ANSWER = "Answer"

class AnswerActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

        textView = findViewById(R.id.textView_answer)
        val answer = intent.getIntExtra(EXTRA_ANSWER, 0)
        textView.setText("Оплатить = $answer рублей")
    }

    companion object{
        fun newIntent(pakageContext: Context, answer: Int): Intent {
            return Intent(pakageContext, AnswerActivity::class.java).apply{
                putExtra(EXTRA_ANSWER, answer)
            }
        }
    }
}