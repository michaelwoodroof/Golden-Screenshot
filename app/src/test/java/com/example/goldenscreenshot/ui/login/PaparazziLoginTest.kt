package com.example.goldenscreenshot.ui.login

import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
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
