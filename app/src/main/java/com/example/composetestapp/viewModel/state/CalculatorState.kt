package com.example.composetestapp.viewModel.state

import com.example.composetestapp.logic.CalculatorOperation

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null
)
