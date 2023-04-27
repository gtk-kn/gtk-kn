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

package org.gtkkn.gradle.plugin.task

import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputFile
import org.gtkkn.gradle.plugin.utils.provider

@Suppress("LeakingThis")
abstract class PkgConfigTask : NativeTask() {
    /**
     * Native library name to lookup configs for
     *
     * e.g.: `gio-2.0`
     */
    @get:Input
    abstract val library: Property<String>

    /**
     * If `--libs` option should be passed
     */
    @get:Input
    @get:Optional
    abstract val libs: Property<Boolean>

    /**
     * If `--cflags` option should be passed
     */
    @get:Input
    @get:Optional
    abstract val cFlags: Property<Boolean>

    /**
     * File where to write pkg-config output
     */
    @get:OutputFile
    abstract val target: RegularFileProperty

    init {
        description = "Runs pkg-config on a given library"
        target.convention(
            provider { temporaryDir.resolve("pkg-config.txt") }.run { project.layout.file(this) },
        )
        executable.convention("pkg-config")
        packages.apply {
            fedora.set("pkgconf")
            debian.set("pkg-config")
            arch.set("pkgconf")
        }
        args.convention(
            provider {
                buildList {
                    if (libs.getOrElse(false)) add("--libs")
                    if (cFlags.getOrElse(false)) add("--cflags")
                    add(library.get())
                }
            },
        )
    }

    override fun processOutput(output: String) {
        super.processOutput(output)
        target.asFile.get().writeText(output)
    }
}
