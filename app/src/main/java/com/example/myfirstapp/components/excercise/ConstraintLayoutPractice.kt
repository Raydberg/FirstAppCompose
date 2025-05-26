package com.example.myfirstapp.components.excercise

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.LayoutModifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
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

@Composable
fun ConstraintExampleGuide(modifier: Modifier) {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val boxRed = createRef()


// Una guia es un componente invisible para podernos enganchar a ese componente
//        val topGuide = createGuidelineFromTop(25.dp)
        val topGuide = createGuidelineFromTop(0.1f) //-> porcentajes

        Box(
            Modifier
                .size(150.dp)
                .background(Color.Red)
                .constrainAs(boxRed) {
                    top.linkTo(topGuide)
                })

    }
}


@Composable
fun ConstraintBarrier(modifier: Modifier) {
    ConstraintLayout() {
        val (boxRed, boxYellow, boxCyan) = createRefs()
        val barrier = createEndBarrier(boxYellow, boxRed)
        Box(
            Modifier
                .size(65.dp)
                .background(Color.Red)
                .constrainAs(boxRed) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                })
        Box(
            Modifier
                .size(20.dp)
                .background(Color.Yellow)
                .constrainAs(boxYellow) {
                    top.linkTo(boxRed.bottom, margin = 40.dp)
                    start.linkTo(parent.start, margin = 32.dp)
                })
        Box(
            Modifier
                .size(70.dp)
                .background(Color.Cyan)
                .constrainAs(boxCyan) {
                    start.linkTo(barrier)
                })
    }
}

@Preview
@Composable
fun ConstraintChain(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier.fillMaxSize()) {
        val (boxRed, boxYellow, boxCyan) = createRefs()
        Box(
            Modifier
                .size(65.dp)
                .background(Color.Red)
                .constrainAs(boxRed) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(boxYellow.top)
                })
        Box(
            Modifier
                .size(65.dp)
                .background(Color.Yellow)
                .constrainAs(boxYellow) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(boxRed.bottom)
                    bottom.linkTo(boxCyan.top)
                })
        Box(
            Modifier
                .size(65.dp)
                .background(Color.Cyan)
                .constrainAs(boxCyan) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(boxYellow.bottom)
                    bottom.linkTo(parent.bottom)
                })

        createVerticalChain(boxRed, boxYellow, boxCyan, chainStyle = ChainStyle.SpreadInside)

    }
}