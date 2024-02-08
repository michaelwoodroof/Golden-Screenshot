package com.example.goldenscreenshot.ui.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.goldenscreenshot.R
import com.example.goldenscreenshot.ui.components.button.GoldenScreenShotButton
import com.example.goldenscreenshot.ui.components.text.Description
import com.example.goldenscreenshot.ui.components.text.Header
import com.example.goldenscreenshot.ui.components.textfield.GoldenScreenShotTextField
import com.example.goldenscreenshot.ui.constants.Constants.Padding
import com.example.goldenscreenshot.ui.theme.GoldenScreenshotTheme
import com.example.goldenscreenshot.ui.util.annotations.PreviewThemes

@Composable
fun LoginScreen() {
    Row(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .fillMaxSize()
            .padding(Padding.LARGE),
        horizontalArrangement = Arrangement.Center,
    ) {
        Column {
            Header(text = stringResource(id = R.string.login_header))
            Spacer(modifier = Modifier.height(Padding.MEDIUM))
            Description(text = stringResource(id = R.string.login_description))
            Description(text = "Sample 2")
            Spacer(modifier = Modifier.height(Padding.MEDIUM))
            GoldenScreenShotTextField(
                value = "",
                onValueChange = {}
            )
            Spacer(modifier = Modifier.height(Padding.MEDIUM))
            GoldenScreenShotTextField(
                value = "",
                onValueChange = {},
            )
            Spacer(modifier = Modifier.weight(1f))
            GoldenScreenShotButton(
                onClick = {},
                text = stringResource(id = R.string.login_button_text),
            )
        }
    }
}

@PreviewThemes
@Composable
private fun LoginScreenPreview() {
    GoldenScreenshotTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            LoginScreen()
        }
    }
}
