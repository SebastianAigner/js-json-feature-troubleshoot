plugins {
    kotlin("js") version "1.3.50"
    id("kotlinx-serialization") version "1.3.50"
}

group = "io.sebi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
    maven("https://kotlin.bintray.com/kotlin-js-wrappers/")
}

kotlin {
    target {
        browser()
    }
    sourceSets.main {
        dependencies {
            val ktorVersion = "1.2.4"
            implementation(kotlin("stdlib-js"))
            implementation("org.jetbrains.kotlinx:kotlinx-html-js:0.6.12")
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:1.3.1")
            implementation("io.ktor:ktor-client-core:$ktorVersion")
            implementation("io.ktor:ktor-client-js:$ktorVersion")
            implementation("io.ktor:ktor-client-json:$ktorVersion")
            implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-js:0.13.0")
        }
    }
}