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

package org.gtkkn.extensions.gobject

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.G_TYPE_FLAG_CLASSED
import org.gtkkn.native.gobject.G_TYPE_FLAG_INSTANTIATABLE
import org.gtkkn.native.gobject.g_type_fundamental
import org.gtkkn.native.gobject.g_type_test_flags
import org.gtkkn.native.gobject.guint

/**
 * Contains GType constants and utility methods for type registration and checking.
 */
public object Types {
    private const val FUNDAMENTAL_SHIFT: UInt = 2u
    private val FUNDAMENTAL_MAX: ULong = 255uL shl FUNDAMENTAL_SHIFT.toInt()

    // Fundamental Types
    public const val INVALID: GType = 0uL
    public val NONE: GType = 1uL shl FUNDAMENTAL_SHIFT.toInt()
    public val INTERFACE: GType = 2uL shl FUNDAMENTAL_SHIFT.toInt()
    public val CHAR: GType = 3uL shl FUNDAMENTAL_SHIFT.toInt()
    public val UCHAR: GType = 4uL shl FUNDAMENTAL_SHIFT.toInt()
    public val BOOLEAN: GType = 5uL shl FUNDAMENTAL_SHIFT.toInt()
    public val INT: GType = 6uL shl FUNDAMENTAL_SHIFT.toInt()
    public val UINT: GType = 7uL shl FUNDAMENTAL_SHIFT.toInt()
    public val LONG: GType = 8uL shl FUNDAMENTAL_SHIFT.toInt()
    public val ULONG: GType = 9uL shl FUNDAMENTAL_SHIFT.toInt()
    public val INT64: GType = 10uL shl FUNDAMENTAL_SHIFT.toInt()
    public val UINT64: GType = 11uL shl FUNDAMENTAL_SHIFT.toInt()
    public val ENUM: GType = 12uL shl FUNDAMENTAL_SHIFT.toInt()
    public val FLAGS: GType = 13uL shl FUNDAMENTAL_SHIFT.toInt()
    public val FLOAT: GType = 14uL shl FUNDAMENTAL_SHIFT.toInt()
    public val DOUBLE: GType = 15uL shl FUNDAMENTAL_SHIFT.toInt()
    public val STRING: GType = 16uL shl FUNDAMENTAL_SHIFT.toInt()
    public val POINTER: GType = 17uL shl FUNDAMENTAL_SHIFT.toInt()
    public val BOXED: GType = 18uL shl FUNDAMENTAL_SHIFT.toInt()
    public val PARAM: GType = 19uL shl FUNDAMENTAL_SHIFT.toInt()
    public val OBJECT: GType = 20uL shl FUNDAMENTAL_SHIFT.toInt()
    public val VARIANT: GType = 21uL shl FUNDAMENTAL_SHIFT.toInt()

    // Type Checking Methods
    public fun isFundamental(type: GType): Boolean = type <= FUNDAMENTAL_MAX
    public fun isDerived(type: GType): Boolean = type > FUNDAMENTAL_MAX
    public fun isInterface(type: GType): Boolean = g_type_fundamental(type) == Types.INTERFACE
    public fun isClassed(type: GType): Boolean = typeTestFlags(type, G_TYPE_FLAG_CLASSED)
    public fun isInstantiatable(type: GType): Boolean = typeTestFlags(type, G_TYPE_FLAG_INSTANTIATABLE)
    private fun typeTestFlags(type: GType, flags: guint): Boolean = g_type_test_flags(type, flags) != 0
}
