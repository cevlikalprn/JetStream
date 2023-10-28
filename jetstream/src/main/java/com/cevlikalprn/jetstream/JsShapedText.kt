package com.cevlikalprn.jetstream

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp

@Composable
fun JsShapedText(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color,
    fontSize: TextUnit = TextUnit.Unspecified,
    shape: Shape = RoundedCornerShape(6.dp),
    shapeColor: Color,
    textAlign: TextAlign = TextAlign.Center
) {
    Text(
        modifier = modifier
            .background(color = shapeColor, shape = shape)
            .padding(vertical = 4.dp, horizontal = 12.dp),
        text = text,
        color = textColor,
        fontSize = fontSize,
        textAlign = textAlign
    )
}

@Composable
@Preview
fun JsShapedTextPreview() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)) {
        JsShapedText(
            modifier = Modifier.weight(1f),
            text = "Edit Profile",
            textColor = Color.White,
            shapeColor = Color.LightGray
        )
        Spacer(modifier = Modifier.padding(8.dp))
        JsShapedText(
            modifier = Modifier.weight(1f),
            text = "Edit Profile",
            textColor = Color.White,
            shapeColor = Color.LightGray
        )
    }
}