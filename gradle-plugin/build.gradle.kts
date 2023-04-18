plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    id("publishing-conventions")
    id("detekt-conventions")
    id("com.gradle.plugin-publish") version "0.21.0"
    id("com.github.johnrengelman.shadow") version "7.0.0"
    id("com.github.gmazzo.buildconfig") version "3.1.0"
}


repositories {
    gradlePluginPortal()
    mavenCentral()
}

pluginBundle {
    website = "http://gtk-kn.org/"
    vcsUrl = "https://gitlab.com/gtk-kn/gtk-kn.git"
    tags = listOf("ui-framework")
}

gradlePlugin {
    plugins {
        register("gtk") {
            id = "org.gtkkn.gtk"
            displayName = "GTK Gradle Plugin"
            description = "GTK Gradle plugin for easy configuration"
            implementationClass = "org.gtkkn.gradle.plugin.GtkPlugin"
        }
    }
}

buildConfig {
    packageName("org.gtkkn.gradle.plugin")
    useKotlinOutput {
        internalVisibility = true
    }
    buildConfigField("String", "group", "\"${project.group}\"")
    buildConfigField("String", "version", "\"${config.version.get()}\"")
    buildConfigField("String", "versionBindingsGtk4", "\"${config.versionBindingsGtk4.get()}\"")
}

dependencies {
    compileOnly(gradleApi())
    compileOnly(localGroovy())
    compileOnly(kotlin("gradle-plugin-api"))
    compileOnly(kotlin("gradle-plugin"))
    compileOnly(kotlin("native-utils"))

    testImplementation(gradleTestKit())
    testImplementation(kotlin("gradle-plugin-api"))
}
