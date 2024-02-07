package com.example.goldenscreenshot.ui.components.button

import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.goldenscreenshot.ui.constants.Constants.Size.MAX_WIDTH
import com.example.goldenscreenshot.ui.constants.Constants.Size.MIN_HEIGHT
import com.example.goldenscreenshot.ui.theme.GoldenScreenshotTheme
import com.example.goldenscreenshot.ui.util.annotations.PreviewThemes

@Composable
fun GoldenScreenShotButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String,
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .defaultMinSize(
                minHeight = MIN_HEIGHT,
            )
            .sizeIn(
                maxWidth = MAX_WIDTH,
            )
            .fillMaxWidth(),
    ) {
        Text(
            text = text,
        )
    }
}

@PreviewThemes
@Composable
private fun GoldenScreenShotButtonPreview() {
    GoldenScreenshotTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            GoldenScreenShotButton(
                onClick = {},
                text = "Example",
            )
        }
    }
}

