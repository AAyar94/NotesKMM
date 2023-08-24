plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.aayar94.noteskmm.android"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.aayar94.noteskmm.android"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.7"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
        isCoreLibraryDesugaringEnabled = true
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    dependencies {
        implementation(project(":shared"))
        implementation("androidx.compose.ui:ui:1.5.0")
        implementation("androidx.compose.ui:ui-tooling:1.5.0")
        implementation("androidx.compose.ui:ui-tooling-preview:1.5.0")
        implementation("androidx.compose.foundation:foundation:1.5.0")
        implementation("androidx.compose.material:material:1.5.0")
        implementation("androidx.activity:activity-compose:1.7.2")

        coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.0.3")

        implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.4.0")

        implementation("com.google.dagger:hilt-android:2.47")
        kapt("com.google.dagger:hilt-android-compiler:2.44.2")
        kapt("androidx.hilt:hilt-compiler:1.0.0")
        implementation("androidx.hilt:hilt-navigation-compose:1.0.0")
    }
}