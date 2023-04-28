/*
 * Copyright (c) 2023 gtk-kn
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

package org.gtkkn.gradle.plugin.ext

import org.gradle.api.Project
import org.gradle.api.file.DirectoryProperty
import org.gradle.kotlin.dsl.getByType
import org.gtkkn.gradle.plugin.utils.maybeCreate

interface GtkExt : GtkKotlinNativeCompilationExt {
    /**
     * Where to place intermediate outputs of various plugin tasks
     */
    val baseOutputDir: DirectoryProperty

    companion object {
        internal fun register(project: Project) = project.extensions.maybeCreate<GtkExt>("gtk") {
            schemasInstallDir.convention(
                project.layout.projectDirectory
                    .dir("${System.getProperty("user.home")}/.local/share/glib-2.0/schemas/"),
            )
            baseOutputDir.convention(project.layout.buildDirectory.dir("gtk/"))
            embedResources.convention(true)
        }
    }
}

internal inline val Project.gtk: GtkExt get() = extensions.getByType()
