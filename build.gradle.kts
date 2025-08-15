plugins {
    kotlin("jvm") version "2.2.0"
    id("application")
    id("org.graalvm.buildtools.native") version "0.11.0"
}

group = "dev.crystaworld"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
    mainClass.set("dev.crystaworld.MainKt")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.github.ajalt.clikt:clikt:5.0.1")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}