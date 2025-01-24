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

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    id("detekt-conventions")
    id("org.gtkkn.application")
}

gtkKn {
    entryPoint = "org.gtkkn.samples.playground.main"
    targetLibraryVersions.putAll(mapOf("gio" to "2.28", "glib" to "2.26", "gtk" to "4.10"))
}

kotlin {
    sourceSets {
        nativeMain {
            dependencies {
                // Import from project
                implementation(projects.bindings.adwaita)
                // Import from mavenLocal
                // implementation("org.gtkkn:adwaita-${gtkKn.platformSuffix.get()}:0.0.3-SNAPSHOT")
            }
        }
    }
}
