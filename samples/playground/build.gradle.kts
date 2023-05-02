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

import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    id("detekt-conventions")
    id("org.gtkkn.gtk")
}

@OptIn(ExperimentalKotlinGradlePluginApi::class)
kotlin {
    targetHierarchy.default()
    linuxX64 {
        binaries {
            executable {
                entryPoint = "org.gtkkn.samples.playground.main"
            }
        }
    }
    sourceSets {
        named("nativeMain") {
            dependencies {
                // Import from project
                implementation(project(":bindings:gtk:gtk4"))
                implementation(project(":bindings:core:gdkpixbuf"))
                implementation(project(":bindings:adwaita"))
//                implementation(project(":bindings:gtksource"))
                // Import from mavenLocal
                // implementation("org.gtkkn:gtk4:0.0.1-SNAPSHOT")
                implementation(libs.kotlin.logging.linux.x64)
            }
        }
    }
}

gtk {
    schemasInstallDir.set(File("${System.getProperty("user.home")}/.local/share/glib-2.0/schemas/"))
    baseOutputDir.set(layout.buildDirectory.dir("gtk/"))
    gresources {
        main {
            manifest.set(projectDir.resolve("src/gresources/main/gresource.xml"))
            embed(kotlin.linuxX64().compilations.named("main"))
        }
        register("custom") {
            // This is detected by convention and does not have to be set up explicitly
            manifest.set(projectDir.resolve("src/gresources/custom/whatever.gresource.xml"))
        }
    }
    gschemas {
        main {
            preinstall(kotlin.linuxX64().compilations.named("main"))
        }
        register("custom") {
            // This is detected by convention and does not have to be set up explicitly
            manifest.set(projectDir.resolve("src/gschemas/custom.gschema.xml"))
        }
    }
}
