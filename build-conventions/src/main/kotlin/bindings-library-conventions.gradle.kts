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

import io.gitlab.arturbosch.detekt.Detekt
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import java.nio.file.Files

plugins {
    id("native-library-conventions")
    id("publishing-conventions")
}

val optInAnnotationsFile = file("${rootProject.projectDir}/bindings/optInAnnotations.txt")

val girTask = tasks.getByPath(":gir:run")

kotlin {
    targets.withType<KotlinNativeTarget> {
        compilations["main"].apply {
            val defFile = file("src/nativeInterop/cinterop/${project.name}.def")
            if (defFile.exists()) {
                cinterops.create(project.name)
            }
        }

        compilations.forEach { compilation ->
            compilation.compileTaskProvider {
                mustRunAfter(girTask)
            }
        }

        tasks.named("${name}SourcesJar") {
            mustRunAfter(girTask)
        }
    }
    sourceSets {
        all {
            // Configure the language settings to opt in to generated annotations for all source sets
            if (optInAnnotationsFile.exists()) {
                val optInAnnotations = Files.readAllLines(optInAnnotationsFile.toPath()).filter { it.isNotBlank() }
                languageSettings { optInAnnotations.forEach { annotationFqName -> optIn(annotationFqName) } }
            }
            languageSettings.optIn("org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter")
        }
    }
}

tasks {
    val bindings = fileTree("${projectDir}/src/nativeMain/kotlin/org/gtkkn/bindings/")
    val cleanBindings by registering(Delete::class) {
        group = BasePlugin.BUILD_GROUP
        delete(bindings, optInAnnotationsFile)
    }
    girTask.outputs.files(bindings)

    withType<Detekt>().configureEach {
        // Use a custom exclude Spec
        exclude { fileChecked ->
            val filePath = fileChecked.file.toPath()
            // Check if the file is within the bindings directory
            filePath.startsWith(bindings.dir.toPath())
        }
    }
}
