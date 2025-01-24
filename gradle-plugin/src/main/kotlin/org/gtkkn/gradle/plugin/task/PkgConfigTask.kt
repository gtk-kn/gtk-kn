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

import org.gradle.api.file.ProjectLayout
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputFile
import org.gtkkn.gradle.plugin.utils.provider
import javax.inject.Inject

@Suppress("LeakingThis")
abstract class PkgConfigTask : NativeTask() {
    /**
     * Native library name to lookup configs for
     *
     * e.g.: `gio-2.0`
     */
    @get:Input
    abstract val library: Property<String>

    /**
     * If `--libs` option should be passed
     */
    @get:Input
    @get:Optional
    abstract val libs: Property<Boolean>

    /**
     * If `--cflags` option should be passed
     */
    @get:Input
    @get:Optional
    abstract val cFlags: Property<Boolean>

    /**
     * File where to write pkg-config output
     */
    @get:OutputFile
    abstract val target: RegularFileProperty

    @get:Inject
    protected abstract val layout: ProjectLayout

    init {
        description = "Runs pkg-config on a given library"
        target.convention(
            provider { temporaryDir.resolve("pkg-config.txt") }.run { layout.file(this) },
        )
        executable.convention("pkg-config")
        packages.apply {
            arch.set("pkgconf")
            brew.set("pkgconf")
            debian.set("pkg-config")
            fedora.set("pkgconf")
        }
        args.convention(
            provider {
                buildList {
                    if (libs.getOrElse(false)) add("--libs")
                    if (cFlags.getOrElse(false)) add("--cflags")
                    add(library.get())
                }
            },
        )
    }

    override fun processOutput(output: String) {
        super.processOutput(output)
        target.asFile.get().writeText(output)
    }
}
