package com.example.composetestapp.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.composetestapp.logic.CalculatorAction

@Composable
internal fun ThreeButtonsRow(
    leftButtonSymbol: String,
    middleButtonSymbol: String,
    rightButtonSymbol: String,
    leftButtonBackground: Color,
    middleButtonBackground: Color,
    rightButtonBackground: Color,
    leftButtonAction: CalculatorAction,
    middleButtonAction: CalculatorAction,
    rightButtonAction: CalculatorAction,
    onAction: (CalculatorAction) -> Unit,
    buttonSpacing: Dp = 8.dp
) {
    Row(
        Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
    ) {
        CalculatorButton(
            symbol = leftButtonSymbol,
            modifier = Modifier
                .background(leftButtonBackground)
                .aspectRatio(2f)
                .weight(2f)
        ) {
            onAction(leftButtonAction)
        }
        CalculatorButton(
            symbol = middleButtonSymbol,
            modifier = Modifier
                .background(middleButtonBackground)
                .aspectRatio(1f)
                .weight(1f)
        ) {
            onAction(middleButtonAction)
        }
        CalculatorButton(
            symbol = rightButtonSymbol,
            modifier = Modifier
                .background(rightButtonBackground)
                .aspectRatio(1f)
                .weight(1f)
        ) {
            onAction(rightButtonAction)
        }
    }
}