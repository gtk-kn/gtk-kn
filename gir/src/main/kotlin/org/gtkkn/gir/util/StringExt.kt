/*
 * Copyright (c) 2024 gtk-kn
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

package org.gtkkn.gir.util

import java.util.Locale

fun String.toCamelCase(): String {
    if (isCamelCase()) {
        return this
    }
    if (isSnakeCase()) {
        return snakeToCamelCase()
    }
    if (isPascalCase()) {
        return replaceFirstChar { it.lowercase(Locale.ROOT) }
    }
    error("Unrecognized case '$this'")
}

fun String.toPascalCase(): String {
    if (isPascalCase()) {
        return this
    }
    if (isSnakeCase()) {
        return snakeToPascalCase()
    }
    if (isCamelCase()) {
        return replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.ROOT) else it.toString() }
    }
    error("Unrecognized case '$this'")
}

fun String.isCamelCase(): Boolean = matches(Regex("^[a-z]+(?:[A-Z][a-z0-9]*)*\$"))

fun String.isPascalCase(): Boolean = matches(Regex("^[A-Z][a-zA-Z0-9]*\$"))

fun String.isSnakeCase(): Boolean = matches(Regex("[a-z0-9]+(_[a-z0-9]+)*"))

private fun String.snakeToPascalCase(): String {
    val words = this.split("_").map { str ->
        str.replaceFirstChar { char ->
            if (char.isLowerCase()) char.titlecase(Locale.ROOT) else char.toString()
        }
    }
    return words.joinToString("")
}

private fun String.snakeToCamelCase(): String {
    val words = this.split("_").mapIndexed { index, str ->
        if (index > 0) {
            str.replaceFirstChar { char ->
                if (char.isLowerCase()) {
                    char.titlecase(Locale.ROOT)
                } else {
                    char.toString()
                }
            }
        } else {
            str
        }
    }
    return words.joinToString("")
}
