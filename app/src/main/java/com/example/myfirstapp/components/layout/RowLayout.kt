package com.example.myfirstapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.LayoutModifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun RowLayout(modifier: Modifier = Modifier) {
    Row(modifier = modifier.fillMaxSize().horizontalScroll(rememberScrollState())) {
        Text("Hola 1", modifier
            .background(Color.Red))
        Text("Hola 2", modifier
            .background(Color.Cyan))
        Text("Hola 3", modifier
            .background(Color.Blue))
        Text("Hola 4", modifier
            .background(Color.Gray))
        Text("Hola 1", modifier
            .background(Color.Red))
        Text("Hola 2", modifier
            .background(Color.Cyan))
        Text("Hola 3", modifier
            .background(Color.Blue))
        Text("Hola 4", modifier
            .background(Color.Gray))
        Text("Hola 1", modifier
            .background(Color.Red))
        Text("Hola 2", modifier
            .background(Color.Cyan))
        Text("Hola 3", modifier
            .background(Color.Blue))
        Text("Hola 4", modifier
            .background(Color.Gray))
        Text("Hola 1", modifier
            .background(Color.Red))
        Text("Hola 2", modifier
            .background(Color.Cyan))
        Text("Hola 3", modifier
            .background(Color.Blue))
        Text("Hola 4", modifier
            .background(Color.Gray))
        Text("Hola 1", modifier
            .background(Color.Red))
        Text("Hola 2", modifier
            .background(Color.Cyan))
        Text("Hola 3", modifier
            .background(Color.Blue))
        Text("Hola 4", modifier
            .background(Color.Gray))
        Text("Hola 1", modifier
            .background(Color.Red))
        Text("Hola 2", modifier
            .background(Color.Cyan))
        Text("Hola 3", modifier
            .background(Color.Blue))
        Text("Hola 4", modifier
            .background(Color.Gray))
        Text("Hola 1", modifier
            .background(Color.Red))
        Text("Hola 2", modifier
            .background(Color.Cyan))
        Text("Hola 3", modifier
            .background(Color.Blue))
        Text("Hola 4", modifier
            .background(Color.Gray))
        Text("Hola 1", modifier
            .background(Color.Red))
        Text("Hola 2", modifier
            .background(Color.Cyan))
        Text("Hola 3", modifier
            .background(Color.Blue))
        Text("Hola 4", modifier
            .background(Color.Gray))

    }
}