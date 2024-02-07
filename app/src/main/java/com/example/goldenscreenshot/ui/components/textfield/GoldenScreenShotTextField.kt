package com.example.goldenscreenshot.ui.components.textfield

import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.goldenscreenshot.ui.constants.Constants.Size.MAX_WIDTH
import com.example.goldenscreenshot.ui.constants.Constants.Size.MIN_HEIGHT
import com.example.goldenscreenshot.ui.theme.GoldenScreenshotTheme
import com.example.goldenscreenshot.ui.util.annotations.PreviewThemes

@Composable
fun GoldenScreenShotTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier
            .defaultMinSize(
                minHeight = MIN_HEIGHT,
            )
            .sizeIn(
                maxWidth = MAX_WIDTH,
            )
            .fillMaxWidth(),
    )
}

@PreviewThemes
@Composable
private fun GoldenScreenShotTextFieldPreview() {
    GoldenScreenshotTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            GoldenScreenShotTextField(
                value = "Sample",
                onValueChange = {},
            )
        }
    }
}

