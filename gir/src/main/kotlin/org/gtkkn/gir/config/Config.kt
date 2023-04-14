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

package org.gtkkn.gir.config

import io.github.oshai.Level
import java.io.File

data class Config(
    val girBaseDir: File,
    val outputDir: File,
    val logLevel: Level,
    val skipFormat: Boolean,
    val bindingLicense: License,
    val libraries: List<Library>
) {
    enum class License {
        LGPL,
        MIT
    }

    data class Library(
        val name: String,
        val module: String,
        val girPrefix: String,
    )

    fun matchesGirFile(file: File): Boolean =
        file.extension == "gir" && libraries.any { file.name.startsWith(it.girPrefix) }
}

/**
 * Json representation of the gtkkn.json config file.
 */
data class GtkknJsonConfig(
    val girBaseDir: String,
    val outputDir: String,
    val logLevel: String,
    val skipFormat: Boolean,
    val bindingLicense: String,
    val libraries: List<Config.Library>,
    val ignoredLibraries: List<Config.Library>,
)
