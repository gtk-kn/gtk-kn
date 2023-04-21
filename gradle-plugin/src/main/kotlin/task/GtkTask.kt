/*
 * Copyright (c) 2023 gtk-kt
 *
 * This file is part of gtk-kt.
 * gtk-kt is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kt is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kt. If not, see https://www.gnu.org/licenses/.
 */

package org.gtkkn.gradle.plugin.task

import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.Nested
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.TaskAction

abstract class GtkTask : DefaultTask() {
    companion object {
        const val GROUP = "gtk"
    }

    init {
        group = GROUP
    }

    @get:Input
    abstract val executable: Property<String>

    @get:Internal
    @get:Optional
    abstract val workingDir: DirectoryProperty

    @get:Nested
    abstract val packages: ToolingPackages

    abstract fun provideArguments(): List<String>

    @TaskAction
    fun run() {
        checkTooling(executable.get(), true, packages)
        project.exec {
            executable = this@GtkTask.executable.get()
            workingDir = this@GtkTask.workingDir.asFile.getOrElse(temporaryDir)
            args = this@GtkTask.provideArguments()
        }
    }
}
