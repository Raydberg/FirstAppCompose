package com.example.myfirstapp.components.excercise

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.LayoutModifier
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun ConstraintLayoutPractice(modifier: Modifier) {
    ConstraintLayout(modifier.fillMaxSize()) {
        val (
            boxGray,
            boxMagenta,
            boxGreen,
            boxBlack,
            boxRed,
            boxBlue,
            boxYellow,
            boxCyan,
            boxDarkGray
        ) = createRefs()

        Box(
            modifier
                .background(Color.Blue)
                .size(175.dp)
                .constrainAs(boxBlue) {
                    top.linkTo(boxYellow.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )

        Box(
            modifier
                .background(Color.Gray)
                .size(75.dp)
                .constrainAs(boxGray) {
                    end.linkTo(boxYellow.start)
                    top.linkTo(boxYellow.bottom)
                }
        )
        Box(
            modifier
                .background(Color.Magenta)
                .size(75.dp)
                .constrainAs(boxMagenta) {
                    bottom.linkTo(boxYellow.top)
                    end.linkTo(boxYellow.start)
                }
        )
        Box(
            modifier
                .background(Color.Green)
                .size(75.dp)
                .constrainAs(boxGreen) {
                    bottom.linkTo(boxYellow.top)
                    start.linkTo(boxYellow.end)
                }
        )
        Box(
            modifier
                .background(Color.Red)
                .size(75.dp)
                .constrainAs(boxRed) {
                    top.linkTo(boxYellow.bottom)
                    start.linkTo(boxYellow.end)
                }
        )

        Box(
            modifier
                .background(Color.Black)
                .size(75.dp)
                .constrainAs(boxBlack) {
                    end.linkTo(boxDarkGray.start)
                    top.linkTo(parent.top)
                    bottom.linkTo(boxYellow.top)
                    start.linkTo(boxCyan.end)
                }
        )
        Box(
            modifier
                .background(Color.Yellow)
                .size(75.dp)
                .constrainAs(boxYellow) {
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                }
        )
        Box(
            modifier
                .background(Color.Cyan)
                .size(175.dp)
                .constrainAs(boxCyan) {
                    bottom.linkTo(boxMagenta.top)
                    end.linkTo(boxMagenta.end)
                }
        )
        Box(
            modifier
                .background(Color.DarkGray)
                .size(175.dp)
                .constrainAs(boxDarkGray) {
                    bottom.linkTo(boxGreen.top)
                    start.linkTo(boxGreen.start)
                }
        )
    }
}