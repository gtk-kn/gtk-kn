/*
 * Copyright (c) 2024 gtk-kn
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

class GtkPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        GtkKnExt.register(project)
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

            project.afterEvaluate {
                project.gtkKn.entryPoint.orNull?.let { entryPoint ->
                    nativeTarget.binaries {
                        executable {
                            this.entryPoint = entryPoint
                        }
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
