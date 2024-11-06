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
    alias(libs.plugins.kotlin.multiplatform)
    id("detekt-conventions")
    id("org.gtkkn.gtk")
}

kotlin {
    applyDefaultHierarchyTemplate()
    linuxX64 {
        binaries {
            executable {
                entryPoint = "org.gtkkn.samples.playground.main"
            }
        }
        gtk {
            targetLibraryVersions.put("gtk", "4.10")
            targetLibraryVersions.put("gio", "2.28")
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
