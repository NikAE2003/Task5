package com.example.task5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import androidx.lifecycle.ViewModelProvider
import android.widget.Toast as Toast

class MainActivity : AppCompatActivity() {

    private lateinit var radioGroup: RadioGroup
    private lateinit var editNumberCount: EditText
    private lateinit var button_ok: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        radioGroup = findViewById(R.id.radioGroup)
        editNumberCount = findViewById(R.id.editNumber_count)
        button_ok = findViewById(R.id.button_ok)

        radioGroup.check(viewModel.selectedRadioButtonId)
        editNumberCount.setText(viewModel.count.toString())

        button_ok.setOnClickListener {
            val cost = viewModel.getCost(radioGroup.checkedRadioButtonId, editNumberCount.text.toString().toInt())
            Toast.makeText(this, "$cost", Toast.LENGTH_SHORT).show()
        }
    }
}

