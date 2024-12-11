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
import org.jetbrains.dokka.gradle.AbstractDokkaTask
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask
import org.jetbrains.kotlin.gradle.tasks.KotlinNativeCompile

plugins {
    // Prevent loading the Kotlin Gradle plugin multiple times
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.dokka)
    id("config-conventions")
    id("spotless-conventions")
    id("versions-conventions")
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
    dokkaHtmlMultiModule {
        outputDirectory.set(rootDir.resolve("docs/dokka"))
    }
    withType<AbstractDokkaTask> {
        notCompatibleWithConfigurationCache("https://github.com/Kotlin/dokka/issues/2231")
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
    register("revertBindings") {
        group = BasePlugin.BUILD_GROUP
        description = "Reverts changes and removes untracked files in all /src/nativeMain/kotlin/org/gtkkn/bindings " +
            "directories within the bindings/ directory using Git."

        notCompatibleWithConfigurationCache(
            "This task executes external Git commands during the execution phase, which is not supported by " +
                "Gradle's configuration cache.",
        )

        doLast {
            // Collect paths to revert
            val bindingPaths = file("bindings")
                .walkTopDown()
                .filter { dir ->
                    dir.isDirectory && dir.path.endsWith("/src/nativeMain/kotlin/org/gtkkn/bindings")
                }
                .map { it.relativeTo(rootDir).path }
                .filter { path ->
                    // Check if the path is tracked by Git during the execution phase
                    val result = exec {
                        commandLine("git", "ls-files", "--error-unmatch", path)
                        isIgnoreExitValue = true
                    }
                    result.exitValue == 0 // Only include paths that are tracked
                }
                .toList()

            if (bindingPaths.isEmpty()) {
                logger.lifecycle("No bindings directories found to revert.")
                return@doLast
            }

            // Execute the git command to reset changes and clean untracked files
            bindingPaths.forEach { path ->
                // Unstage any staged changes
                exec {
                    commandLine("git", "restore", "--staged", "--worktree", path)
                }
                // Remove untracked files and directories
                exec {
                    commandLine("git", "clean", "-fd", "--", path)
                }
            }

            logger.lifecycle("Reverted changes in the following paths:\n${bindingPaths.joinToString("\n")}")
        }
    }
    withType<Wrapper> {
        description = "Regenerates the Gradle Wrapper files"
        distributionType = Wrapper.DistributionType.ALL
        gradleVersion = libs.versions.gradle.get()
    }
}
