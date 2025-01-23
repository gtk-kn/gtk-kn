import org.gradle.internal.os.OperatingSystem

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

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    id("detekt-conventions")
}

kotlin {
    val hostOs = OperatingSystem.current()
    val isArm64 = System.getProperty("os.arch") == "aarch64"
    val nativeTarget = when {
        hostOs.isLinux && !isArm64 -> linuxX64()
        hostOs.isMacOsX && isArm64 -> macosArm64()
        else -> throw GradleException("Host OS '${hostOs}' is not supported by gtk-kn.")
    }
    nativeTarget.apply {
        binaries {
            executable {
                entryPoint = "org.gtkkn.samples.gtk.widgets.main"
            }
        }
    }
    sourceSets {
        nativeMain {
            dependencies {
                // Import from project
                implementation(projects.bindings.gtk.gtk4)
                // Import from mavenLocal
                // implementation("org.gtkkn:gtk4:0.0.1-SNAPSHOT")
            }
        }
        configureEach {
            languageSettings {
                // Opt in to the required annotations
                optIn("org.gtkkn.bindings.gio.annotations.GioVersion2_28")
                optIn("org.gtkkn.bindings.gio.annotations.GioVersion2_44")
                optIn("org.gtkkn.bindings.gobject.annotations.GObjectVersion2_26")
                optIn("org.gtkkn.bindings.gtk.annotations.GtkVersion4_6")
            }
        }
    }
}
