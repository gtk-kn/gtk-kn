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
 * Direction of the parameter.
 */
enum class GirDirection {
    /**
     * Goes into the callable.
     */
    IN,

    /**
     * For output parameters from the callable (reference in C++, var in Pascal, etc...).
     */
    OUT,

    /**
     * For both (like a pre-allocated structure which will be filled-in by the callable).
     */
    IN_OUT;

    companion object {
        fun fromString(str: String): GirDirection = when (str) {
            "in" -> IN
            "out" -> OUT
            "inout" -> IN_OUT
            else -> error("String '$str' is not a valid Direction value")
        }
    }
}
