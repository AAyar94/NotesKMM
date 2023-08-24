plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version("8.1.1").apply(false)
    id("com.android.library").version("8.1.1").apply(false)
    id("com.squareup.sqldelight").version("1.5.5").apply(false)
    id("com.google.dagger.hilt.android").version("2.46").apply(false)
    kotlin("android").version("1.8.21").apply(false)
    kotlin("multiplatform").version("1.8.21").apply(false)
}
subprojects {
    tasks.withType<JavaCompile> {
        var java_version = JavaVersion.VERSION_17 // Chang
        sourceCompatibility = java_version.toString()
        targetCompatibility = java_version.toString()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
