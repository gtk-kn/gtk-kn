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
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputDirectory
import org.gtkkn.gradle.plugin.utils.provider

@Suppress("LeakingThis")
abstract class CompileGSchemasTask : GtkTask() {
    @get:InputDirectory
    abstract val sourceDir: DirectoryProperty

    /**
     * Where to store the gschemas.compiled file
     */
    @get:OutputDirectory
    @get:Optional
    abstract val targetDir: DirectoryProperty

    /**
     * Do not abort on any errors in schemas
     */
    @get:Input
    @get:Optional
    abstract val lax: Property<Boolean>

    /**
     * Do not write the gschema.compiled file
     */
    @get:Input
    @get:Optional
    abstract val dryRun: Property<Boolean>

    /**
     * Do not enforce key name restrictions
     */
    @get:Input
    @get:Optional
    abstract val allowAnyName: Property<Boolean>

    init {
        description = "Compiles gschema via native glib-compile-schemas toolchain"
        onlyIf { sourceDir.asFile.get().exists() }

        executable.convention("glib-compile-schemas")
        packages.glibDefaults()
        targetDir.convention(sourceDir)
        args.convention(
            provider {
                buildList {
                    val target = targetDir.asFile.get()
                    target.mkdirs()
                    add("--targetdir=${target.absolutePath}")
                    if (!lax.getOrElse(false)) add("--strict")
                    if (dryRun.getOrElse(false)) add("--dry-run")
                    if (allowAnyName.getOrElse(false)) add("--allow-any-name")
                    add(sourceDir.get().asFile.absolutePath)
                }
            },
        )
    }
}
