package com.cevlikalprn.jetstream

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cevlikalprn.jetstream.theme.ImdbColor
import com.cevlikalprn.jetstream.spacer.JsHeightSmallSpacer

@Composable
fun JsMovieItemTemplate(
    modifier: Modifier = Modifier,
    thumbnail: String?,
    title: String?,
    titleTextColor: Color = Color.White,
    titleFontSize: TextUnit = TextUnit.Unspecified,
    year: Int?,
    yearColor: Color = Color.White,
    yearFontSize: TextUnit = TextUnit.Unspecified,
    imdbRate: String?,
    imdbRateColor: Color = ImdbColor,
    imdbRateFontSize: TextUnit = TextUnit.Unspecified,
    detailsBackgroundShadowColor: Color = Color.Black,
    detailsBackgroundShadowAlpha: Float = 0.8F
) {
    Box(modifier = modifier) {
        MovieThumbnail()
        Column(
            modifier = Modifier
                .background(
                    detailsBackgroundShadowColor
                        .copy(
                            alpha = detailsBackgroundShadowAlpha
                        )
                )
                .align(Alignment.BottomCenter)
                .padding(horizontal = 8.dp, vertical = 12.dp)
        ) {
            MovieTitle(text = title, textColor = titleTextColor, fontSize = titleFontSize)
            JsHeightSmallSpacer()
            MovieDetailsRow(
                year = year,
                imdbRate = imdbRate,
                yearColor = yearColor,
                imdbRateColor = imdbRateColor,
                yearFontSize = yearFontSize,
                imdbRateFontSize = imdbRateFontSize
            )
        }
    }

}

@Composable
private fun MovieThumbnail() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Red)
    )
}

@Composable
private fun MovieTitle(
    text: String?,
    textColor: Color,
    fontSize: TextUnit
) {
    Text(text = text.orEmpty(), color = textColor, fontSize = fontSize)
}

@Composable
private fun MovieDetailsRow(
    year: Int?,
    imdbRate: String?,
    yearColor: Color,
    imdbRateColor: Color,
    yearFontSize: TextUnit,
    imdbRateFontSize: TextUnit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = year?.toString().orEmpty(), color = yearColor, fontSize = yearFontSize)
        Text(text = imdbRate.orEmpty(), color = imdbRateColor, fontSize = imdbRateFontSize)
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
fun JsMovieItemTemplatePreview() {
    JsMovieItemTemplate(
        modifier = Modifier.size(width = 250.dp, height = 350.dp),
        thumbnail = null,
        title = "Lord of the Rings",
        titleTextColor = Color.White,
        titleFontSize = 14.sp,
        year = 2023,
        yearColor = Color.White,
        yearFontSize = 12.sp,
        imdbRate = "8.9",
        imdbRateFontSize = 12.sp
    )
}