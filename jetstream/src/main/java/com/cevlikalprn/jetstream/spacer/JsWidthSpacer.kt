package com.cevlikalprn.jetstream.spacer

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun JsWidthSpacer(space: Dp) {
    Spacer(modifier = Modifier.width(space))
}

@Composable
fun JsWidthExtraSmallSpacer() {
    JsWidthSpacer(2.dp)
}

@Composable
fun JsWidthSmallSpacer() {
    JsWidthSpacer(4.dp)
}

@Composable
fun JsWidthMediumSpacer() {
    JsWidthSpacer(8.dp)
}

@Composable
fun JsWidthExtraMediumSpacer() {
    JsWidthSpacer(16.dp)
}

@Composable
fun JsWidthLargeSpacer() {
    JsWidthSpacer(space = 24.dp)
}

@Composable
fun JsWidthExtraLargeSpacer() {
    JsWidthSpacer(space = 32.dp)
}