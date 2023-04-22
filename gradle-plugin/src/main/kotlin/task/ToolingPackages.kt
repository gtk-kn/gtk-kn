/*
 * Copyright (c) 2023 gtk-kn
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
