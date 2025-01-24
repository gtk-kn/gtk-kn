/*
 * Copyright (c) 2025 gtk-kn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
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
