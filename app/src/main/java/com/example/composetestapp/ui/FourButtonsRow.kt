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
internal fun FourButtonsRow(
    leftButtonSymbol: String,
    middleLeftButtonSymbol: String,
    middleRightButtonSymbol: String,
    rightButtonSymbol: String,
    leftButtonBackground: Color,
    middleLeftButtonBackground: Color,
    middleRightButtonBackground: Color,
    rightButtonBackground: Color,
    leftButtonAction: CalculatorAction,
    middleLeftButtonAction: CalculatorAction,
    middleRightButtonAction: CalculatorAction,
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
                .aspectRatio(1f)
                .weight(1f)
        ) {
            onAction(leftButtonAction)
        }
        CalculatorButton(
            symbol = middleLeftButtonSymbol,
            modifier = Modifier
                .background(middleLeftButtonBackground)
                .aspectRatio(1f)
                .weight(1f)
        ) {
            onAction(middleLeftButtonAction)
        }
        CalculatorButton(
            symbol = middleRightButtonSymbol,
            modifier = Modifier
                .background(middleRightButtonBackground)
                .aspectRatio(1f)
                .weight(1f)
        ) {
            onAction(middleRightButtonAction)
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