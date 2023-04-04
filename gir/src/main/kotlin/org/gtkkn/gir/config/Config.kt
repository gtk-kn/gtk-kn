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
    val girPrefixWhitelist: Set<String> = setOf(
        "Adw-1",
        "cairo-",
        "Gdk-4",
        "GdkPixbuf-",
        "Gio-",
        "GLib-",
        "GModule-",
        "GObject-",
        "Graphene-",
        "Gsk-",
        "Gtk-4",
        "HarfBuzz-",
        "Pango-",
        "PangoCairo-",
    ),
    val groupedRepoMap: Map<String, Array<String>> = mapOf(
        "core" to arrayOf(
            "cairo",
            "gdkpixbuf",
            "gio",
            "glib",
            "gmodule",
            "gobject",
            "graphene",
            "harfbuzz",
            "pango",
            "pangocairo",
        ),
        "gtk4" to arrayOf(
            "gdk",
            "gsk",
            "gtk",
        ),
    )
) {
    enum class License {
        LGPL,
        MIT
    }
}
