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

import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.konan.target.KonanTarget
import java.nio.file.Files

plugins {
    id("native-library-conventions")
    id("publishing-conventions")
}

val optInAnnotationsFile = file("${rootProject.projectDir}/bindings/optInAnnotations.txt")

val girTask = tasks.getByPath(":gir:run")

val mingwPath = File(System.getenv("MINGW64_DIR") ?: "C:/msys64/mingw64")

kotlin {
    targets.withType<KotlinNativeTarget> {
        compilations["main"].apply {
            cinterops.create(project.name) {
                // https://youtrack.jetbrains.com/issue/KT-43501/Static-linking-to-some-libraries-with-libc-calls-causes-linker-errors#focus=Comments-27-4543529.0-0
                when (konanTarget) {
                    KonanTarget.LINUX_X64 -> includeDirs.headerFilterOnly(
                        "/usr/include",
                        "/usr/include/x86_64-linux-gnu",
                    )

                    KonanTarget.MACOS_X64 -> includeDirs.headerFilterOnly("/opt/local/include", "/usr/local/include")
                    KonanTarget.MINGW_X64 -> includeDirs(mingwPath.resolve("include"))
                    else -> logger.error("Unsupported Konan target $konanTarget")
                }
            }
        }

        compilations.forEach { compilation ->
            compilation.compileTaskProvider {
                mustRunAfter(girTask)
            }

            // Configure the language settings to opt in to generated annotations for all source sets
            if (optInAnnotationsFile.exists()) {
                val optInAnnotations = Files.readAllLines(optInAnnotationsFile.toPath()).filter { it.isNotBlank() }
                compilation.defaultSourceSet.languageSettings {
                    optInAnnotations.forEach { annotationFqName -> optIn(annotationFqName) }
                }
            }
        }

        tasks.named("${name}SourcesJar") {
            mustRunAfter(girTask)
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
}
