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

package org.gtkkn.gir.ext

fun String.capitalized() = replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }

/**
 * Escapes the string by doubling every backslash.
 *
 * @return A new string with all backslashes doubled.
 */
fun String.escape(): String = this.replace("\\", "\\\\")

/**
 * Compresses the string by converting doubled backslashes back to single backslashes.
 *
 * @return A new string with doubled backslashes replaced by single backslashes.
 */
fun String.compress(): String = this.replace("\\\\", "\\")

/**
 * Converts a nullable String to a strict Boolean value, recognizing:
 *   - Truthy strings: {"1", "true", "t", "yes", "y", "on"} (case-insensitive)
 *   - Falsy strings:  {null, "0", "false", "f", "no", "n", "off"} (case-insensitive)
 * Throws [IllegalArgumentException] if the string is not recognized.
 */
fun String?.parseBoolean(): Boolean {
    // Define our recognized sets of "true" and "false" strings.
    val trueValues = setOf("1", "true", "t", "yes", "y", "on")
    val falseValues = setOf("0", "false", "f", "no", "n", "off")

    // Null is considered false.
    if (this == null) {
        return false
    }

    // Normalize: trim whitespace and convert to lower-case.
    val normalized = this.trim().lowercase()

    return when (normalized) {
        in trueValues -> true
        in falseValues -> false
        else -> throw IllegalArgumentException("Unrecognized boolean value: '$this'")
    }
}
