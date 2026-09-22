plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.retrosnake"
    compileSdk = 36
    defaultConfig {
        applicationId = "com.retrosnake"
        minSdk = 23
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }
}