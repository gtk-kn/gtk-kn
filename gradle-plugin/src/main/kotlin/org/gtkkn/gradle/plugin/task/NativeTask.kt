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

package org.gtkkn.gradle.plugin.task

import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.logging.LogLevel
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.Nested
import org.gradle.api.tasks.TaskAction
import org.gradle.internal.os.OperatingSystem
import org.gradle.process.ExecOperations
import java.io.ByteArrayOutputStream
import java.io.File
import javax.inject.Inject

abstract class NativeTask : DefaultTask() {
    @get:Input
    abstract val executable: Property<String>

    @get:Internal
    abstract val workingDir: DirectoryProperty

    @get:Input
    abstract val args: ListProperty<String>

    @get:Nested
    abstract val packages: ToolingPackages

    @get:Inject
    protected abstract val execOperations: ExecOperations

    /**
     * Added utility for extending classes to prepend some arguments before [args]
     */
    protected open fun prependArgs(): List<String> = emptyList()

    protected open fun processOutput(output: String) {}

    @TaskAction
    fun run() {
        checkTooling(executable.get(), true, packages)
        ByteArrayOutputStream().use { outputStream ->
            execOperations.exec {
                logging.captureStandardOutput(LogLevel.INFO)
                logging.captureStandardError(LogLevel.ERROR)
                executable = this@NativeTask.executable.get()
                workingDir = this@NativeTask.workingDir.asFile.getOrElse(temporaryDir)
                args = prependArgs() + this@NativeTask.args.get()
                standardOutput = outputStream
            }
            outputStream.toString()
        }.also(::processOutput)
    }

    private fun checkTooling(executable: String, assert: Boolean, toolingPackages: ToolingPackages) {
        val onPath = isExecutableOnPath(executable)
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

    private fun isExecutableOnPath(executable: String): Boolean {
        val paths = System.getenv("PATH").split(File.pathSeparator)
        val os = OperatingSystem.current()

        // On Windows, executables may have extensions like .exe, .bat, .cmd
        val executableNames = if (os.isWindows) {
            val pathExt = System.getenv("PATHEXT")?.split(';') ?: listOf(".exe", ".bat", ".cmd")
            pathExt.map { ext -> "$executable$ext" }
        } else {
            listOf(executable)
        }

        return paths.any { dir ->
            executableNames.any { name ->
                val file = File(dir, name)
                file.exists() && file.canExecute()
            }
        }
    }
}
