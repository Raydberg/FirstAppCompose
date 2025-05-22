package com.example.myfirstapp.components.excercise

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*;
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun LayoutPractice(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        Box(
            modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Text("Ejemplo 1")
        }
        Spacer(modifier.height(20.dp))
        Row(
            modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            Box(
                modifier
                    .weight(1f)
                    .background(Color.Red)
                    .fillMaxHeight(),
                contentAlignment = Alignment.Center
            ) { Text("Ejemplo 2") }
            /**
             * Si ponemos el height , no pasa nada ya que no estamos en un alto
             * estamos en un ancho asi que tendria que ser el width
             */
            Spacer(modifier.width(10.dp))
            Box(
                modifier
                    .weight(1f)
                    .background(Color.Green)
                    .fillMaxHeight(), contentAlignment = Alignment.Center
            )
            { Text("Ejemplo 3") }
        }
        Box(
            modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Magenta),
            contentAlignment = Alignment.Center
        ) {
            Text("Ejemplo 4")
        }

    }
}
