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
package org.gtkkn.gradle.plugin.config

import org.gradle.api.Project
import org.gradle.api.tasks.Copy
import org.gradle.kotlin.dsl.named
import org.gtkkn.gradle.plugin.ext.GtkKotlinNativeCompilationExt
import org.gtkkn.gradle.plugin.ext.GtkKotlinNativeTargetExt
import org.gtkkn.gradle.plugin.ext.gtk
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import org.jetbrains.kotlin.konan.target.KonanTarget
import java.io.File

internal fun Project.attachTarget(target: KotlinNativeTarget) {
    val targetGtk = GtkKotlinNativeTargetExt.register(gtk, target)
    target.compilations.all {
        GtkKotlinNativeCompilationExt.register(targetGtk, this).apply {
            val processResources = tasks.named<Copy>(processResourcesTaskName)

            val defaultGResourceManifest = processResources
                .map(Copy::getDestinationDir)
                .map(File::listFiles)
                .map { d -> d.singleOrNull { f -> f.name.endsWith("gresource.xml") } as File }
                .run { layout.file(this) }

            resourceBundles.register("default") {
                manifest.convention(defaultGResourceManifest)
            }

            val defaultGSchemaManifest = processResources
                .map(Copy::getDestinationDir)
                .map(File::listFiles)
                .map { d -> d.singleOrNull { f -> f.name.endsWith("gschema.xml") } as File }
                .run { layout.file(this) }

            schemaBundles.register("default") {
                manifest.convention(defaultGSchemaManifest)
            }
        }
    }
}

internal inline val KotlinNativeTarget.gtkSupported
    get() = when (this.konanTarget) {
        KonanTarget.LINUX_X64 -> true

        KonanTarget.LINUX_ARM32_HFP,
        KonanTarget.LINUX_ARM64,
        KonanTarget.LINUX_MIPS32,
        KonanTarget.LINUX_MIPSEL32,
        KonanTarget.MACOS_ARM64,
        KonanTarget.MACOS_X64,
        KonanTarget.MINGW_X64,
        KonanTarget.MINGW_X86 -> false

        else -> false
    }
