package com.example.goldenscreenshot.ui.button

import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Alignment
import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import com.example.goldenscreenshot.ui.components.button.GoldenScreenShotButton
import com.example.goldenscreenshot.ui.theme.GoldenScreenshotTheme
import org.junit.Rule
import org.junit.Test

class PaparazziButtonTest {
    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = DeviceConfig.PIXEL_6_PRO,
    )

    @Test
    fun buttonSnapshot() {
        paparazzi.snapshot {
            GoldenScreenshotTheme {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    GoldenScreenShotButton(
                        onClick = {},
                        text = "Sample",
                    )
                }
            }
        }
    }
}
