/*
 * Copyright (c) 2023 gtk-kt
 *
 * This file is part of gtk-kt.
 * gtk-kt is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kt is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kt. If not, see https://www.gnu.org/licenses/.
 */

@Suppress("DSL_SCOPE_VIOLATION") //https://github.com/gradle/gradle/issues/22797
plugins {
    alias(libs.plugins.kotlin.multiplatform)
    id("detekt-conventions")
}

kotlin {
    val hostOs = System.getProperty("os.name")
    val nativeTarget = when {
        hostOs == "Linux" -> linuxX64("native")
        else -> throw GradleException("Host OS is not supported in Kotlin/Native.")
    }
    sourceSets {
        val nativeMain by getting {
            dependencies {
                // Import from project
                implementation(project(":bindings:gtk4:gtk"))
                implementation(project(":bindings:adw"))
                // Import from mavenLocal
                // implementation("org.gtkkn:gtk4:0.0.1-SNAPSHOT")
                implementation(libs.kotlin.logging.linux.x64)
            }
        }
    }

    nativeTarget.apply {
        binaries {
            executable {
                entryPoint = "org.gtkkn.samples.gtk.playground.main"
            }
        }
    }
}
