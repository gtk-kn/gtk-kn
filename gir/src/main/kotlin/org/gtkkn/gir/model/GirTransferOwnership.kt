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

package org.gtkkn.gir.model

/**
 * Transfer of ownership attribute used by many elements.
 */
enum class GirTransferOwnership {
    /**
     * The recipient does not own the value.
     */
    NONE,

    /**
     * The recipient owns the container but not the value (for arrays or lists for example).
     */
    CONTAINER,

    /**
     * Te recipient owns the entire value. For details, see
     * https://gi.readthedocs.io/en/latest/annotations/giannotations.html#memory-and-lifecycle-management.
     */
    FULL;

    companion object {
        fun fromString(str: String): GirTransferOwnership = when (str) {
            "none" -> NONE
            "container" -> CONTAINER
            "full" -> FULL
            else -> error("String '$str' is not a valid TransferOwnership value")
        }
    }
}
