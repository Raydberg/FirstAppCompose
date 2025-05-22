package com.example.myfirstapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.LayoutModifier
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun ConstraintBasicLayout(modifier: Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        // Para crear los ids
        val (boxRed, boxGray, boxGreen, boxMagenta, boxYellow) = createRefs();
        // Para solo un id
//        val boxReds = createRef();

        Box(
            modifier
                .size(150.dp)
                .background(Color.Red)
                .constrainAs(boxRed) {
                    top.linkTo(boxYellow.bottom)
                    start.linkTo(boxYellow.end)
                }
        )
        Box(
            modifier
                .size(150.dp)
                .background(Color.Gray)
                .constrainAs(boxGray) {
                    end.linkTo(boxYellow.start)
                    top.linkTo(boxYellow.bottom)
                }
        )
        Box(
            modifier
                .size(150.dp)
                .background(Color.Green)
                .constrainAs(boxGreen) {
                    start.linkTo(boxYellow.end)
                    bottom.linkTo(boxYellow.top)
                }
        )
        Box(
            modifier
                .size(150.dp)
                .background(Color.Magenta)
                .constrainAs(boxMagenta) {
                    bottom.linkTo(boxYellow.top)
                    end.linkTo(boxYellow.start)
                }
        )
        Box(
            modifier
                .size(150.dp)
                .background(Color.Yellow)
                .constrainAs(boxYellow) {
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                }
        )
    }
}