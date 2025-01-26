
pluginManagement {
    repositories {
        maven(url = "https://s01.oss.sonatype.org/content/repositories/snapshots/")
        mavenLocal()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        maven(url = "https://s01.oss.sonatype.org/content/repositories/snapshots/")
        mavenLocal()
        mavenCentral()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

rootProject.name = "integration-tests"

