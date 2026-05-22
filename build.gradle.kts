// build.gradle.kts (ROOT PROJECT)

plugins {

    id("com.android.application") version "8.8.0" apply false

    id("org.jetbrains.kotlin.android")
        version "2.1.0"
        apply false

    // Google Services
    id("com.google.gms.google-services")
        version "4.4.4"
        apply false

    // Crashlytics
    id("com.google.firebase.crashlytics")
        version "3.0.3"
        apply false
}