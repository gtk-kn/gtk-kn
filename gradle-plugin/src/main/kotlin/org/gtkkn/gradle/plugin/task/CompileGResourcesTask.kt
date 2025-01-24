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

import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputFile
import org.gtkkn.gradle.plugin.utils.provider

@Suppress("LeakingThis")
abstract class CompileGResourcesTask : GtkTask() {
    /**
     * The directories to load files referenced in FILE from
     */
    @get:InputDirectory
    abstract val sourceDir: DirectoryProperty

    /**
     * *.gresource.xml file
     */
    @get:InputFile
    abstract val manifest: RegularFileProperty

    /**
     * Name of the output file
     */
    @get:OutputFile
    abstract val target: RegularFileProperty

    /**
     * Generate output in the format selected for by the target filename extension
     */
    @get:Input
    @get:Optional
    abstract val generate: Property<Boolean>

    /**
     * Generate source header
     */
    @get:Input
    @get:Optional
    abstract val generateHeader: Property<Boolean>

    /**
     * Generate source code used to link in the resource file into your code
     */
    @get:Input
    @get:Optional
    abstract val generateSource: Property<Boolean>

    /**
     *  Generate dependency list
     */
    @get:Input
    @get:Optional
    abstract val generateDependencies: Property<Boolean>

    /**
     * Name of the dependency file to generate
     */
    @get:OutputFile
    @get:Optional
    abstract val dependencyFile: RegularFileProperty

    /**
     * Include phony targets in the generated dependency file
     */
    @get:Input
    @get:Optional
    abstract val generatePhonyTargets: Property<Boolean>

    /**
     * Don’t automatically create and register resource
     */
    @get:Input
    @get:Optional
    abstract val manualRegister: Property<Boolean>

    /**
     * Don’t export functions; declare them G_GNUC_INTERNAL
     */
    @get:Input
    @get:Optional
    abstract val internal: Property<Boolean>

    /**
     *  Don’t embed resource data in the C file; assume it’s linked externally instead
     */
    @get:Input
    @get:Optional
    abstract val externalData: Property<Boolean>

    /**
     * C identifier name used for the generated source code
     */
    @get:Input
    @get:Optional
    abstract val cName: Property<String>

    /**
     * The target C compiler
     */
    @get:Input
    @get:Optional
    abstract val compiler: Property<String>

    init {
        description = "Compiles gresources via native glib-compile-resources toolchain"
        onlyIf { manifest.asFile.orNull?.exists() == true }

        executable.convention("glib-compile-resources")
        packages.glibDefaults()
        args.convention(
            provider {
                buildList {
                    val target = target.get().asFile
                    target.parentFile.mkdirs()
                    add("--target=${target.absolutePath}")
                    add("--sourcedir=${sourceDir.get().asFile.absolutePath}")
                    if (generate.getOrElse(false)) add("--generate")
                    if (generateHeader.getOrElse(false)) add("--generate-header")
                    if (generateSource.getOrElse(false)) add("--generate-source")
                    if (generateDependencies.getOrElse(false)) add("--generate-dependencies")
                    if (dependencyFile.isPresent) add("--dependency-file=${dependencyFile.get().asFile.absolutePath}")
                    if (generatePhonyTargets.getOrElse(false)) add("--generate-phony-targets")
                    if (manualRegister.getOrElse(false)) add("--manual-register")
                    if (internal.getOrElse(false)) add("--internal")
                    if (externalData.getOrElse(false)) add("--external-data")
                    if (cName.isPresent) add("--c-name=${cName.get()}")
                    if (compiler.isPresent) add("--compiler=${compiler.get()}")
                    add(manifest.get().asFile.absolutePath)
                }
            },
        )
    }
}
