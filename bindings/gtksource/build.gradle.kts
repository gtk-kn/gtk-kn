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
    id("bindings-library-conventions")
}

version = "0.0.1-SNAPSHOT"
publishing.publications.withType<MavenPublication> {
    artifactId = "gtksource"
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
                api(project(":bindings:common"))
                api(project(":bindings:gtk4:gtk"))
                // transitive
                api(project(":bindings:gtk4:gdk"))
                api(project(":bindings:gtk4:gsk"))
                api(project(":bindings:core:gobject"))
                api(project(":bindings:core:glib"))
                api(project(":bindings:core:gio"))
                api(project(":bindings:core:gdkpixbuf"))
                api(project(":bindings:core:cairo"))
                api(project(":bindings:core:pango"))
                api(project(":bindings:core:harfbuzz"))
                api(project(":bindings:core:graphene"))
            }
        }
        val nativeTest by getting
    }

    // native main for testing
    nativeTarget.apply {
        val main by compilations.getting
        val gtksource by main.cinterops.creating
    }
}
