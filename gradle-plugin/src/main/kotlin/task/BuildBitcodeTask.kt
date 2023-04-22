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
                .compilerDirectory.resolve("bin/run_konan")
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
                        ?.map(Directory::getAsFile)
                        ?.map(File::getAbsolutePath)
                        ?.map { "-I$it" }
                        ?.forEach(::add)

                    add("-c")
                    input.asFile.get()
                        .let(File::getAbsolutePath)
                        .let(::add)

                    add("-o")
                    output.asFile.get()
                        .also { it.parentFile.mkdirs() }
                        .let(File::getAbsolutePath)
                        .let(::add)
                }
            },
        )
    }
}
