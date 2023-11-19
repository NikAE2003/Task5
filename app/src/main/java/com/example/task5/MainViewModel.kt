package com.example.task5

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var selectedRadioButtonId = R.id.radioButton_size9x12
    var count = 0

    fun getCost(selectedRadioButton: Int, photoCount: Int): Int {

        selectedRadioButtonId = selectedRadioButton
        count = photoCount

        return when (selectedRadioButtonId) {
            R.id.radioButton_size9x12 -> 100 * count
            R.id.radioButton_size10x15 -> 150 * count
            R.id.radioButton_size18x24 -> 200 * count
            else -> 0
        }
    }
}