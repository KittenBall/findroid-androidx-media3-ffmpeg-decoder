// See https://github.com/google/ExoPlayer/issues/6339
if (gradle is ExtensionAware) {
    val extension = gradle as ExtensionAware
    extension.extra["androidxMediaRoot"] = file("media").absolutePath
    extension.extra["androidxMediaModulePrefix"] = "media3-"
    apply(from = File(extension.extra["androidxMediaRoot"].toString(), "core_settings.gradle"))
}

include(":exoplayer-ffmpeg-extension")
