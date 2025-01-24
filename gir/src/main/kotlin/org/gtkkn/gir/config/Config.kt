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

package org.gtkkn.gir.config

import io.github.oshai.kotlinlogging.Level
import kotlinx.serialization.Serializable
import java.io.File

data class Config(
    val girBaseDir: File,
    val outputDir: File,
    val gradlePluginDir: File,
    val logLevel: Level,
    val skipFormat: Boolean,
    val libraries: List<Library>
) {
    @Serializable
    data class Library(
        val name: String,
        val module: String,
        val girPrefix: String,
        val platforms: String? = null,
    )

    fun matchesGirFile(file: File): Boolean =
        file.extension == "gir" && libraries.any { file.name.startsWith(it.girPrefix) }
}

/**
 * Json representation of the gtkkn.json config file.
 */
@Serializable
data class GtkKnJsonConfig(
    val girBaseDir: String? = null,
    val outputDir: String,
    val gradlePluginDir: String,
    val logLevel: String,
    val skipFormat: Boolean,
    val libraries: List<Config.Library>,
    val ignoredLibraries: List<Config.Library> = emptyList(),
)
