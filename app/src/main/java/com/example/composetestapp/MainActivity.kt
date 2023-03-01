package com.example.composetestapp

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.composetestapp.ui.Calculator
import com.example.composetestapp.ui.MediumGray
import com.example.composetestapp.viewModel.CalculatorViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel = viewModel<CalculatorViewModel>()
            val state = viewModel.state
            val buttonSpacing = 8.dp
            Calculator(
                state = state, onAction = viewModel::onAction,
                modifier = Modifier
                    .fillMaxSize()
                    .background(MediumGray)
                    .padding(16.dp),
                buttonSpacing = buttonSpacing
            )
        }
    }
}


