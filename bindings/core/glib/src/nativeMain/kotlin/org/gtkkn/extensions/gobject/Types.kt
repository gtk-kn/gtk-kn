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
import org.gtkkn.native.gobject.G_TYPE_BOOLEAN
import org.gtkkn.native.gobject.G_TYPE_BOXED
import org.gtkkn.native.gobject.G_TYPE_CHAR
import org.gtkkn.native.gobject.G_TYPE_DOUBLE
import org.gtkkn.native.gobject.G_TYPE_ENUM
import org.gtkkn.native.gobject.G_TYPE_FLAGS
import org.gtkkn.native.gobject.G_TYPE_FLAG_CLASSED
import org.gtkkn.native.gobject.G_TYPE_FLAG_INSTANTIATABLE
import org.gtkkn.native.gobject.G_TYPE_FLOAT
import org.gtkkn.native.gobject.G_TYPE_FUNDAMENTAL_MAX
import org.gtkkn.native.gobject.G_TYPE_INT
import org.gtkkn.native.gobject.G_TYPE_INT64
import org.gtkkn.native.gobject.G_TYPE_INTERFACE
import org.gtkkn.native.gobject.G_TYPE_INVALID
import org.gtkkn.native.gobject.G_TYPE_LONG
import org.gtkkn.native.gobject.G_TYPE_NONE
import org.gtkkn.native.gobject.G_TYPE_OBJECT
import org.gtkkn.native.gobject.G_TYPE_PARAM
import org.gtkkn.native.gobject.G_TYPE_POINTER
import org.gtkkn.native.gobject.G_TYPE_STRING
import org.gtkkn.native.gobject.G_TYPE_UCHAR
import org.gtkkn.native.gobject.G_TYPE_UINT
import org.gtkkn.native.gobject.G_TYPE_UINT64
import org.gtkkn.native.gobject.G_TYPE_ULONG
import org.gtkkn.native.gobject.G_TYPE_VARIANT
import org.gtkkn.native.gobject.g_type_fundamental
import org.gtkkn.native.gobject.g_type_test_flags
import org.gtkkn.native.gobject.guint

/**
 * Contains GType constants and utility methods for type registration and checking.
 */
public object Types {
    // Fundamental Types
    public const val INVALID: GType = G_TYPE_INVALID
    public val NONE: GType = G_TYPE_NONE
    public val INTERFACE: GType = G_TYPE_INTERFACE
    public val CHAR: GType = G_TYPE_CHAR
    public val UCHAR: GType = G_TYPE_UCHAR
    public val BOOLEAN: GType = G_TYPE_BOOLEAN
    public val INT: GType = G_TYPE_INT
    public val UINT: GType = G_TYPE_UINT
    public val LONG: GType = G_TYPE_LONG
    public val ULONG: GType = G_TYPE_ULONG
    public val INT64: GType = G_TYPE_INT64
    public val UINT64: GType = G_TYPE_UINT64
    public val ENUM: GType = G_TYPE_ENUM
    public val FLAGS: GType = G_TYPE_FLAGS
    public val FLOAT: GType = G_TYPE_FLOAT
    public val DOUBLE: GType = G_TYPE_DOUBLE
    public val STRING: GType = G_TYPE_STRING
    public val POINTER: GType = G_TYPE_POINTER
    public val BOXED: GType = G_TYPE_BOXED
    public val PARAM: GType = G_TYPE_PARAM
    public val OBJECT: GType = G_TYPE_OBJECT
    public val VARIANT: GType = G_TYPE_VARIANT

    // Type Checking Methods
    public fun isFundamental(type: GType): Boolean = type <= G_TYPE_FUNDAMENTAL_MAX.toULong()
    public fun isDerived(type: GType): Boolean = type > G_TYPE_FUNDAMENTAL_MAX.toULong()
    public fun isInterface(type: GType): Boolean = g_type_fundamental(type) == INTERFACE
    public fun isClassed(type: GType): Boolean = typeTestFlags(type, G_TYPE_FLAG_CLASSED)
    public fun isInstantiatable(type: GType): Boolean = typeTestFlags(type, G_TYPE_FLAG_INSTANTIATABLE)
    private fun typeTestFlags(type: GType, flags: guint): Boolean = g_type_test_flags(type, flags) != 0
}
