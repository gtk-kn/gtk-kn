/*
 * Copyright (c) 2024 gtk-kn
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kn. If not, see https://www.gnu.org/licenses/.
 */

import com.diffplug.gradle.spotless.SpotlessTask
import com.github.gmazzo.buildconfig.BuildConfigTask
import io.gitlab.arturbosch.detekt.Detekt

/*
 * Copyright (c) 2023 gtk-kn
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kn. If not, see https://www.gnu.org/licenses/.
 */

plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    alias(libs.plugins.gradle.publish)
    alias(libs.plugins.buildConfig)
    id("publishing-conventions")
    id("config-conventions")
    id("detekt-conventions")
    id("spotless-conventions")
}

version = config.versions.gradlePlugin.get()

gradlePlugin {
    website = config.website.get()
    vcsUrl = config.vcsUrl.get()
    plugins {
        register("gtk") {
            id = "org.gtkkn.gtk"
            displayName = "GTK Gradle Plugin"
            description = "GTK Gradle plugin for easy configuration"
            tags = listOf("ui-framework")
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
    forClass("Versions") {
        buildConfigField("String", "common", "\"${config.versions.common.get()}\"")
        buildConfigField("String", "gradlePlugin", "\"${config.versions.gradlePlugin.get()}\"")
        buildConfigField("String", "gtk4", "\"${config.versions.gtk4.get()}\"")
    }
}

detekt {
    config.from(files("$rootDir/../config/detekt/detekt.yml"))
}

tasks {
    val spotlessTasks = withType<SpotlessTask> {
        mustRunAfter(withType<BuildConfigTask>())
    }
    withType<Detekt> {
        mustRunAfter(spotlessTasks)
    }
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
