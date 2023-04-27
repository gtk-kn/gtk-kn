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

import org.gradle.api.file.Directory
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputFile
import org.gtkkn.gradle.plugin.utils.provider
import org.jetbrains.kotlin.gradle.utils.NativeCompilerDownloader
import org.jetbrains.kotlin.konan.target.KonanTarget
import java.io.File

@Suppress("LeakingThis")
abstract class BuildBitcodeTask : NativeTask() {
    @get:InputFile
    abstract val konan: RegularFileProperty

    @get:Input
    abstract val target: Property<KonanTarget>

    @get:InputFile
    abstract val input: RegularFileProperty

    @get:OutputFile
    abstract val output: RegularFileProperty

    @get:InputFiles
    @get:Optional
    abstract val includes: ListProperty<Directory>

    init {
        description = "Compiles a given file to LLVM IR via konan"

        konan.convention {
            NativeCompilerDownloader(project)
                .compilerDirectory
                .resolve("bin/run_konan")
        }
        executable.convention(konan.asFile.map(File::getAbsolutePath))
        args.convention(
            provider {
                buildList {
                    add("clang")
                    add("clang")
                    add(target.get().name)
                    add("-emit-llvm")

                    includes.orNull
                        ?.asSequence()
                        ?.map(Directory::getAsFile)
                        ?.map(File::getAbsolutePath)
                        ?.map { "-I$it" }
                        ?.forEach(::add)

                    add("-c")
                    input.asFile.get()
                        .absolutePath
                        .also(::add)

                    add("-o")
                    output.asFile.get()
                        .also { it.parentFile.mkdirs() }
                        .absolutePath
                        .also(::add)
                }
            },
        )
    }
}
