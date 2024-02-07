package com.example.goldenscreenshot.ui.util.annotations

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    name = "Device - Nexus 7",
    device = Devices.NEXUS_7,
)
@Preview(
    name = "Device - Small Phone",
    heightDp = 480,
    widthDp = 240,
)
annotation class PreviewDevices

@Preview(
    fontScale = 0.5F,
    name = "Font - Small",
)
@Preview(
    fontScale = 1F,
    name = "Font - Standard",
)
@Preview(
    fontScale = 1.5F,
    name = "Font - Large",
)
annotation class PreviewFontScales

@Preview(
    name = "Theme - Dark",
    uiMode = UI_MODE_NIGHT_YES,
)
@Preview(
    name = "Theme - Light",
    uiMode = UI_MODE_NIGHT_NO,
)
annotation class PreviewThemes

@PreviewDevices
@PreviewFontScales
@PreviewThemes
annotation class PreviewAllVariants
