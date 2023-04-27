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

import org.gradle.api.Project
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional
import org.gradle.internal.os.OperatingSystem
import java.io.InputStream
import java.io.OutputStream

interface ToolingPackages {
    @get:Input
    @get:Optional
    val fedora: Property<String>

    @get:Input
    @get:Optional
    val debian: Property<String>

    @get:Input
    @get:Optional
    val arch: Property<String>
}

internal fun ToolingPackages.glibDefaults() {
    fedora.convention("glib2-devel")
    debian.convention("libglib2.0-dev")
    arch.convention("glib2-devel")
}

@Suppress("UseIfInsteadOfWhen")
internal fun ToolingPackages.installInstructions() = when {
    OperatingSystem.current().isLinux -> """
        Fedora: ${fedora.map { "dnf install $it" }.getOrElse("N/A")}
        Debian: ${debian.map { "apt install $it" }.getOrElse("N/A")}
        Arch:   ${arch.map { "pacman -S $it" }.getOrElse("N/A")}
    """.trimIndent()

    else -> """
        Operating system not supported by gtkkn
    """.trimIndent()
}

internal fun Project.checkTooling(executable: String, assert: Boolean, toolingPackages: ToolingPackages) {
    val onPath = exec {
        isIgnoreExitValue = true
        standardInput = InputStream.nullInputStream()
        standardOutput = OutputStream.nullOutputStream()
        errorOutput = OutputStream.nullOutputStream()
        this.executable = "which"
        args(executable)
    }.exitValue == 0
    if (!onPath) {
        val message = """
            GTK tool $executable missing on PATH
            Install the following package to fix it

        """.trimIndent() + toolingPackages.installInstructions()
        if (assert) {
            error(message)
        } else {
            logger.warn(message)
        }
    } else {
        logger.info("GTK tool $executable is present on PATH")
    }
}
