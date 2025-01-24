/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: MIT
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import org.gradle.internal.os.OperatingSystem

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
