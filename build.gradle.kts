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
import com.diffplug.gradle.spotless.SpotlessTask
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask
import org.jetbrains.kotlin.gradle.tasks.KotlinNativeCompile
import tasks.RevertBindingsTask

plugins {
    // Prevent loading the Kotlin Gradle plugin multiple times
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    id("config-conventions")
    id("spotless-conventions")
    id("versions-conventions")
    id("dokka-conventions")
}

subprojects {
    tasks.withType<KotlinCompilationTask<*>>().configureEach {
        compilerOptions {
            extraWarnings.set(true)
            // Workaround for https://youtrack.jetbrains.com/issue/KT-73556
            freeCompilerArgs.add("-Xsuppress-warning=UNUSED_ANONYMOUS_PARAMETER")
        }
    }
}

tasks {
    withType<SpotlessTask> {
        mustRunAfter("gir:run")
    }
    register("generateBindings") {
        dependsOn(":gir:run")
        dependsOn("spotlessApply")
        group = BasePlugin.BUILD_GROUP
    }
    register("compile") {
        description = "Compiles all K/N compilations in subprojects"
        subprojects
            .map(Project::getTasks)
            .map<_, TaskCollection<KotlinNativeCompile>>(TaskContainer::withType)
            .forEach(::dependsOn)
    }
    register<RevertBindingsTask>("revertBindings")
    withType<Wrapper> {
        description = "Regenerates the Gradle Wrapper files"
        distributionType = Wrapper.DistributionType.ALL
        gradleVersion = libs.versions.gradle.get()
    }
}

@Suppress("UNCHECKED_CAST")
val bindingLibs = gradle.extra["bindingLibs"] as List<Map<String, String>>

dependencies {
    bindingLibs.forEach { library ->
        dokka(project("bindings:${library["module"]}"))
    }
    dokka(projects.coroutines)
}
