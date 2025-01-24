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

package org.gtkkn.gir.parser.metadata

@Suppress("UseDataClass")
class Argument(
    val expression: Expression,
    val sourceReference: SourceReference? = null,
    var used: Boolean = false
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Argument

        if (used != other.used) return false
        if (expression != other.expression) return false
        if (sourceReference != other.sourceReference) return false

        return true
    }

    override fun hashCode(): Int {
        var result = used.hashCode()
        result = 31 * result + expression.hashCode()
        result = 31 * result + (sourceReference?.hashCode() ?: 0)
        return result
    }
}
