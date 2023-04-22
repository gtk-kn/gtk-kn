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

import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.logging.LogLevel
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.Nested
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.TaskAction
import java.io.ByteArrayOutputStream

abstract class NativeTask : DefaultTask() {
    @get:Input
    abstract val executable: Property<String>

    @get:Internal
    @get:Optional
    abstract val workingDir: DirectoryProperty

    @get:Input
    abstract val args: ListProperty<String>

    @get:Nested
    abstract val packages: ToolingPackages

    /**
     * Added utility for extending classes to prepend some arguments before [args]
     */
    protected open fun prependArgs(): List<String> = emptyList()

    protected open fun processOutput(output: String) {}

    @TaskAction
    fun run() {
        project.checkTooling(executable.get(), true, packages)
        ByteArrayOutputStream().use { outputStream ->
            project.exec {
                logging.captureStandardOutput(LogLevel.INFO)
                logging.captureStandardError(LogLevel.ERROR)
                executable = this@NativeTask.executable.get()
                workingDir = this@NativeTask.workingDir.asFile.getOrElse(temporaryDir)
                args = prependArgs() + this@NativeTask.args.get()
                standardOutput = outputStream
            }
            outputStream.toString()
        }.let(::processOutput)
    }
}
