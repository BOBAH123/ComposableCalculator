package com.example.composetestapp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetestapp.logic.CalculatorAction
import com.example.composetestapp.logic.CalculatorOperation
import com.example.composetestapp.viewModel.state.CalculatorState

@Composable
fun Calculator(
    state: CalculatorState,
    buttonSpacing: Dp = 8.dp,
    modifier: Modifier = Modifier,
    onAction: (CalculatorAction) -> Unit
) {
    Box(modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Text(
                text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontSize = 80.sp,
                color = Color.White,
                fontWeight = FontWeight.Light,
                maxLines = 2
            )
            ThreeButtonsRow(
                leftButtonSymbol = "AC",
                middleButtonSymbol = "Del",
                rightButtonSymbol = "/",
                leftButtonAction = CalculatorAction.Clear,
                middleButtonAction = CalculatorAction.Delete,
                rightButtonAction = CalculatorAction.Operation(CalculatorOperation.Divide),
                leftButtonBackground = LightGray,
                middleButtonBackground = LightGray,
                rightButtonBackground = Orange,
                onAction = onAction,
                buttonSpacing = buttonSpacing
            )
            FourButtonsRow(
                leftButtonSymbol = "7",
                middleLeftButtonSymbol = "8",
                middleRightButtonSymbol = "9",
                rightButtonSymbol = "x",
                leftButtonAction = CalculatorAction.Number(7),
                middleLeftButtonAction = CalculatorAction.Number(8),
                middleRightButtonAction = CalculatorAction.Number(9),
                rightButtonAction = CalculatorAction.Operation(CalculatorOperation.Multiply),
                leftButtonBackground = Color.DarkGray,
                middleLeftButtonBackground = Color.DarkGray,
                middleRightButtonBackground = Color.DarkGray,
                rightButtonBackground = Orange,
                onAction = onAction,
                buttonSpacing = buttonSpacing
            )
            FourButtonsRow(
                leftButtonSymbol = "4",
                middleLeftButtonSymbol = "5",
                middleRightButtonSymbol = "6",
                rightButtonSymbol = "-",
                leftButtonAction = CalculatorAction.Number(4),
                middleLeftButtonAction = CalculatorAction.Number(5),
                middleRightButtonAction = CalculatorAction.Number(6),
                rightButtonAction = CalculatorAction.Operation(CalculatorOperation.Subtract),
                leftButtonBackground = Color.DarkGray,
                middleLeftButtonBackground = Color.DarkGray,
                middleRightButtonBackground = Color.DarkGray,
                rightButtonBackground = Orange,
                onAction = onAction,
                buttonSpacing = buttonSpacing
            )
            FourButtonsRow(
                leftButtonSymbol = "1",
                middleLeftButtonSymbol = "2",
                middleRightButtonSymbol = "3",
                rightButtonSymbol = "+",
                leftButtonAction = CalculatorAction.Number(1),
                middleLeftButtonAction = CalculatorAction.Number(2),
                middleRightButtonAction = CalculatorAction.Number(3),
                rightButtonAction = CalculatorAction.Operation(CalculatorOperation.Add),
                leftButtonBackground = Color.DarkGray,
                middleLeftButtonBackground = Color.DarkGray,
                middleRightButtonBackground = Color.DarkGray,
                rightButtonBackground = Orange,
                onAction = onAction,
                buttonSpacing = buttonSpacing
            )
            ThreeButtonsRow(
                leftButtonSymbol = "0",
                middleButtonSymbol = ".",
                rightButtonSymbol = "=",
                leftButtonBackground = Color.DarkGray,
                middleButtonBackground = Color.DarkGray,
                rightButtonBackground = Color.DarkGray,
                leftButtonAction = CalculatorAction.Number(0),
                middleButtonAction = CalculatorAction.Decimal,
                rightButtonAction = CalculatorAction.Calculate,
                onAction = onAction,
                buttonSpacing = buttonSpacing
            )
        }
    }
}

