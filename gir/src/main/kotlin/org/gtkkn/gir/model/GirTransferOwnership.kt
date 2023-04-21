/*
 * Copyright (c) 2023 gtk-kn
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

package org.gtkkn.gir.model

/**
 * Enum used by many elements for the transfer of ownership, with for example, a returned value.
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
    FULL,
    ;

    companion object {
        fun fromString(str: String): GirTransferOwnership = when (str) {
            "none" -> NONE
            "container" -> CONTAINER
            "full" -> FULL
            else -> error("String '$str' is not a valid TransferOwnership value")
        }
    }
}
