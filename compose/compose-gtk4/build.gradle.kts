import java.nio.file.Files

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
    id("native-library-conventions")
    id("publishing-conventions")
    id("detekt-conventions")
    alias(libs.plugins.kotlin.compose)
}

version = config.versions.compose.get()

val optInAnnotationsFile = file("${rootProject.projectDir}/bindings/optInAnnotations.txt")

kotlin {
    sourceSets {
        nativeMain {
            dependencies {
                api(projects.bindings.gtk.gtk4)
                api(projects.coroutines)
                api(libs.compose.runtime)
            }
        }
        all {
            // Configure the language settings to opt in to generated annotations for all source sets
            if (optInAnnotationsFile.exists()) {
                val optInAnnotations = Files.readAllLines(optInAnnotationsFile.toPath()).filter { it.isNotBlank() }
                languageSettings { optInAnnotations.forEach { annotationFqName -> optIn(annotationFqName) } }
            }
        }
    }
}
