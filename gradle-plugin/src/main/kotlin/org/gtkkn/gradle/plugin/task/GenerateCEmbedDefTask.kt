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
    abstract val target: RegularFileProperty

    init {
        description = "Generates cinterop def file for embedding c source"
        target.convention(project.layout.projectDirectory.file(temporaryDir.resolve("cEmbed.def").absolutePath))
        packageName.convention("${BuildConfig.group}.embed.c")
        onlyIf { source.asFile.get().exists() }
    }

    @TaskAction
    fun run() {
        target.asFile.get().writeText(
            buildString {
                appendLine("package = ${packageName.get()}")
                appendLine("headerFilter = ''")
                if (compilerOpts.isPresent) appendLine("compilerOpts = ${compilerOpts.get()}")
                appendLine("---")
                appendLine("#include \"${source.asFile.get().absolutePath}\"")
            },
        )
    }
}
