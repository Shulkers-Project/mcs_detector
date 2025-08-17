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
    applicationDefaultJvmArgs = listOf("-Dfile.encoding=UTF-8", "-Dconsole.encoding=UTF-8")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.github.ajalt.clikt:clikt:5.0.1")
    implementation("com.github.ajalt.mordant:mordant:3.0.2")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<JavaExec> {
    systemProperty("file.encoding", "UTF-8")
    systemProperty("console.encoding", "UTF-8")
}

kotlin {
    jvmToolchain(21)
}

graalvmNative {
    binaries {
        all {
            buildArgs.add("-H:+AddAllCharsets")
        }
    }
}