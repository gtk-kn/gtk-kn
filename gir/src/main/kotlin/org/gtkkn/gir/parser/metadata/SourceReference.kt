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

package org.gtkkn.gir.parser.metadata

data class SourceReference(val source: String?, val begin: SourceLocation?, val end: SourceLocation?) {
    override fun toString(): String {
        if (source == null || begin == null || end == null) {
            return "SourceReference: Missing details (file, begin, or end)"
        }
        val snippet = source.substring(begin.pos, end.pos)
        return "SourceReference: Line ${begin.line}:${begin.column} to ${end.line}:${end.column}, " +
            "Snippet=\"${snippet}\""
    }
}
