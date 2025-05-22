package com.example.myfirstapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
@Preview
fun BoxLayout() {
    Box(
        modifier = Modifier.fillMaxSize(),
        /**
         * Dimensionamos si queremos en la izquierda
         * en la derecha o al centro o mas
         *  Ademas siempre que tengamos un contentAlignment
         *  necesito tener las llaves , ya que el atributo modifica
         *  al atributo que este adentro
         */
        contentAlignment = Alignment.Center

    ) {
        Box(
            modifier = Modifier
                .size(50.dp)
//                .width(100.dp)
//                .height(50.dp)
                .background(Color.Red)
                .verticalScroll(rememberScrollState())
        ) {
            Text(
                text =
                    """
                 Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus metus mi, bibendum ut faucibus at, vulputate id enim. Phasellus ultricies augue a sem congue luctus. In pharetra sed purus a efficitur. Suspendisse varius, eros vitae tristique aliquet, nunc orci sollicitudin neque, ut tincidunt velit turpis nec odio. Phasellus elementum ut dolor nec finibus. Donec imperdiet tortor lectus, et dapibus urna consequat et. Cras ac massa magna. Integer sit amet metus aliquet, porta arcu et, aliquam sapien. Aenean finibus vehicula rutrum. Praesent ante arcu, vulputate sed pellentesque et, vestibulum nec eros. Vestibulum eleifend enim neque, id congue tellus posuere at. Mauris vitae lacus urna.

                 Vivamus id semper dui, non aliquet est. Ut quis massa ut orci congue volutpat in ac lacus. Fusce auctor facilisis porttitor. Vivamus pharetra lacus porttitor ligula tincidunt tristique. Pellentesque consectetur neque a sagittis tempus. Aenean neque nibh, elementum non orci eget, pharetra laoreet sapien. Sed in felis ante. In eget nibh ullamcorper, blandit erat sed, porttitor mi. Proin a justo augue.

                 Interdum et malesuada fames ac ante ipsum primis in faucibus. In a ullamcorper ex, id tempus sapien. In pulvinar scelerisque consectetur. In hac habitasse platea dictumst. Pellentesque placerat ac lacus ac ultrices. Cras ut ultrices libero. Maecenas auctor mi magna. Integer sed iaculis risus. Duis urna ligula, cursus et tincidunt vel, facilisis quis lacus. Maecenas turpis risus, commodo non accumsan vitae, malesuada in quam. Proin aliquam sapien eget nisi vestibulum finibus. Maecenas vehicula sem ex. Maecenas hendrerit tincidunt luctus. Aenean facilisis aliquam vulputate. Nullam quis sem sed nibh consequat laoreet non ac sapien. Nullam mollis neque quis semper eleifend.
            """.trimIndent()
            )
        }
    }
}
