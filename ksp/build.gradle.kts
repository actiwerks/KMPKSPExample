@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    kotlin("multiplatform")
}

kotlin {

    jvm()

    sourceSets {

        val jvmMain by getting {
            dependencies {
                implementation(libs.ksp.processor.api)
            }
            kotlin.srcDir("src/main/kotlin")
            resources.srcDir("src/main/resources")
        }

    }
}