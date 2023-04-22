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
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction
import org.gtkkn.gradle.plugin.BuildConfig

@Suppress("LeakingThis")
abstract class GenerateCEmbedDefTask : DefaultTask() {
    @get:InputFile
    abstract val source: RegularFileProperty

    @get:Input
    @get:Optional
    abstract val compilerOpts: Property<String>

    @get:Input
    abstract val packageName: Property<String>

    @get:OutputFile
    abstract val output: RegularFileProperty

    init {
        description = "Generates cinterop def file for embedding c source"
        output.convention(project.layout.projectDirectory.file(temporaryDir.resolve("cEmbed.def").absolutePath))
        packageName.convention("${BuildConfig.group}.embed.c")
        onlyIf { source.asFile.get().exists() }
    }

    @TaskAction
    fun run() {
        output.asFile.get().writeText(
            buildString {
                appendLine("package = ${packageName.get()}")
                if (compilerOpts.isPresent) appendLine("compilerOpts = ${compilerOpts.get()}")
                appendLine("---")
                appendLine("#include \"${source.asFile.get().absolutePath}\"")
            },
        )
    }
}
