package com.example.goldenscreenshot.ui.components.text

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.goldenscreenshot.ui.theme.GoldenScreenshotTheme
import com.example.goldenscreenshot.ui.util.annotations.PreviewThemes

@Composable
fun Header(
    text: String,
) {
    Text(
        text = text,
        color = MaterialTheme.colorScheme.onBackground,
        style = MaterialTheme.typography.headlineLarge,
    )
}

@PreviewThemes
@Composable
private fun HeaderPreview() {
    GoldenScreenshotTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            Header(
                text = "Header",
            )
        }
    }
}
