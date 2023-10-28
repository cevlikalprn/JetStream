package com.cevlikalprn.jetstream

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun JsProfileImage(
    modifier: Modifier = Modifier,
    image: Int,
    contentDescription: String = "",
    contentScale: ContentScale = ContentScale.Crop,
    shape: Shape = CircleShape,
    borderWidth: Dp = 0.dp,
    borderColor: Color = Color.Transparent
) {
    Image(
        modifier = modifier
            .clip(shape)
            .border(width = borderWidth, color = borderColor, shape = shape),
        painter = painterResource(id = image),
        contentDescription = contentDescription,
        contentScale = contentScale,
    )
}

@Composable
@Preview
fun JsAsyncProfileImage() {
    JsProfileImage(
        modifier = Modifier.size(90.dp),
        image = R.drawable.ic_launcher_background
    )
}