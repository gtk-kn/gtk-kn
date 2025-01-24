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

import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.Optional
import org.gradle.internal.os.OperatingSystem

interface ToolingPackages {
    @get:Input
    @get:Optional
    val arch: Property<String>

    @get:Input
    @get:Optional
    val brew: Property<String>

    @get:Input
    @get:Optional
    val debian: Property<String>

    @get:Input
    @get:Optional
    val fedora: Property<String>
}

internal fun ToolingPackages.glibDefaults() {
    arch.convention("glib2-devel")
    brew.convention("glib")
    debian.convention("libglib2.0-dev")
    fedora.convention("glib2-devel")
}

@Suppress("UseIfInsteadOfWhen")
internal fun ToolingPackages.installInstructions() = when {
    OperatingSystem.current().isLinux -> """
        Arch:   ${arch.map { "pacman -S $it" }.getOrElse("N/A")}
        Debian: ${debian.map { "apt install $it" }.getOrElse("N/A")}
        Fedora: ${fedora.map { "dnf install $it" }.getOrElse("N/A")}
    """.trimIndent()

    OperatingSystem.current().isMacOsX -> """
        ${brew.map { "brew install $it" }.getOrElse("N/A")}
    """.trimIndent()

    else -> """
        Operating system not supported by gtkkn
    """.trimIndent()
}
