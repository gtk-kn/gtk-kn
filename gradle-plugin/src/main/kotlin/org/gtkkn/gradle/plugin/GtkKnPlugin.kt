/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
 */

package org.gtkkn.gradle.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.internal.os.OperatingSystem
import org.gradle.kotlin.dsl.getByType
import org.gtkkn.gradle.plugin.config.dependencyResolutionConfig
import org.gtkkn.gradle.plugin.ext.GtkKnExt
import org.gtkkn.gradle.plugin.ext.gtkKn
import org.gtkkn.gradle.plugin.utils.configureOptInAnnotations
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension

class GtkKnPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val gtkKnExt = GtkKnExt.register(project)
        project.dependencyResolutionConfig()

        project.pluginManager.withPlugin("org.jetbrains.kotlin.multiplatform") {
            val kotlin = project.extensions.getByType<KotlinMultiplatformExtension>()

            // Detect host OS and architecture
            val hostOs = OperatingSystem.current()
            val isArm64 = System.getProperty("os.arch") == "aarch64"

            val nativeTarget = when {
                hostOs.isLinux && !isArm64 -> kotlin.linuxX64()
                hostOs.isMacOsX && isArm64 -> kotlin.macosArm64()
                else -> error("Host OS '$hostOs' is not supported by gtk-kn.")
            }

            gtkKnExt.platformSuffix.set(nativeTarget.name.replace("_", "").lowercase())

            project.afterEvaluate {
                nativeTarget.binaries {
                    executable {
                        project.gtkKn.entryPoint.orNull?.let { entryPoint = it }
                        // Ignore unresolved symbols in object files to handle dependencies built with different native
                        // library versions.
                        // https://gtk-kn.org/user-guide/gradle-plugin/#ignoring-unresolved-symbols-in-object-files
                        freeCompilerArgs += listOf("-linker-option", "--unresolved-symbols=ignore-in-object-files")
                    }
                }
            }
        }

        // 3. Defer only the logic that truly needs afterEvaluate
        project.afterEvaluate {
            configureOptInAnnotations(project)
        }
    }

    companion object {
        const val TASK_GROUP = "gtkkn"
    }
}
