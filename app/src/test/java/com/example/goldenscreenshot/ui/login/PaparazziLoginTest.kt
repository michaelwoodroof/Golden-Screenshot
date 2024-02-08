package com.example.goldenscreenshot.ui.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import com.example.goldenscreenshot.ui.components.button.GoldenScreenShotButton
import com.example.goldenscreenshot.ui.login.LoginScreen
import com.example.goldenscreenshot.ui.theme.GoldenScreenshotTheme
import org.junit.Rule
import org.junit.Test

class PaparazziLoginTest {
    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = DeviceConfig.PIXEL_6_PRO,
    )

    @Test
    fun loginScreenLightSnapshot() {
        paparazzi.snapshot {
            GoldenScreenshotTheme {
                LoginScreen()
            }
        }
    }

    @Test
    fun loginScreenDarkSnapshot() {
        paparazzi.snapshot {
            GoldenScreenshotTheme(
                darkTheme = true,
            ) {
                LoginScreen()
            }
        }
    }
}
