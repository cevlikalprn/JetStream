package com.cevlikalprn.jetstream.util

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun JsHeightSpacer(space: Dp) {
    Spacer(modifier = Modifier.height(space))
}

@Composable
fun JsHeightExtraSmallSpacer() {
    JsHeightSpacer(2.dp)
}

@Composable
fun JsHeightSmallSpacer() {
    JsHeightSpacer(4.dp)
}

@Composable
fun JsHeightMediumSpacer() {
    JsHeightSpacer(8.dp)
}

@Composable
fun JsHeightExtraMediumSpacer() {
    JsHeightSpacer(16.dp)
}

@Composable
fun JsHeightLargeSpacer() {
    JsHeightSpacer(space = 24.dp)
}

@Composable
fun JsHeightExtraLargeSpacer() {
    JsHeightSpacer(space = 32.dp)
}