import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

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

plugins {
    id("native-library-conventions")
    id("publishing-conventions")
}

val girTask = tasks.getByPath(":gir:run")

kotlin {
    targets.withType<KotlinNativeTarget> {
        compilations["main"].apply {
            cinterops.create(project.name)
            compileTaskProvider {
                dependsOn(girTask)
            }
        }

        tasks.named("${name}SourcesJar") {
            dependsOn(girTask)
        }
    }
}

tasks {
    val cleanBindings by registering(Delete::class) {
        group = BasePlugin.BUILD_GROUP
        delete("${projectDir}/src/nativeMain/kotlin/org/gtkkn/bindings/*")
    }
    clean { dependsOn(cleanBindings) }
    girTask.outputs.dir("$projectDir/src/nativeMain/kotlin/org/gtkkn/bindings")
}
