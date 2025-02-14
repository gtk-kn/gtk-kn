// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GDoubleIEEE754
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.guint
import kotlin.String

/**
 * The #GFloatIEEE754 and #GDoubleIEEE754 unions are used to access the sign,
 * mantissa and exponent of IEEE floats and doubles. These unions are defined
 * as appropriate for a given platform. IEEE floats and doubles are supported
 * (used for storage) by at least Intel, PPC and Sparc.
 */
public class DoubleIeee754(public val glibDoubleIeee754Pointer: CPointer<GDoubleIEEE754>) :
    ProxyInstance(glibDoubleIeee754Pointer) {
    /**
     * the double value
     */
    public var vDouble: gdouble
        get() = glibDoubleIeee754Pointer.pointed.v_double

        @UnsafeFieldSetter
        set(`value`) {
            glibDoubleIeee754Pointer.pointed.v_double = value
        }

    public var mantissaLow: guint
        get() = glibDoubleIeee754Pointer.pointed.mpn.mantissa_low

        @UnsafeFieldSetter
        set(`value`) {
            glibDoubleIeee754Pointer.pointed.mpn.mantissa_low = value
        }

    public var mantissaHigh: guint
        get() = glibDoubleIeee754Pointer.pointed.mpn.mantissa_high

        @UnsafeFieldSetter
        set(`value`) {
            glibDoubleIeee754Pointer.pointed.mpn.mantissa_high = value
        }

    public var biasedExponent: guint
        get() = glibDoubleIeee754Pointer.pointed.mpn.biased_exponent

        @UnsafeFieldSetter
        set(`value`) {
            glibDoubleIeee754Pointer.pointed.mpn.biased_exponent = value
        }

    public var sign: guint
        get() = glibDoubleIeee754Pointer.pointed.mpn.sign

        @UnsafeFieldSetter
        set(`value`) {
            glibDoubleIeee754Pointer.pointed.mpn.sign = value
        }

    /**
     * Allocate a new DoubleIeee754.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GDoubleIEEE754>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new DoubleIeee754 using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GDoubleIEEE754>().ptr)

    /**
     * Allocate a new DoubleIeee754.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param vDouble the double value
     * @param mantissaLow
     * @param mantissaHigh
     * @param biasedExponent
     * @param sign
     */
    public constructor(
        vDouble: gdouble,
        mantissaLow: guint,
        mantissaHigh: guint,
        biasedExponent: guint,
        sign: guint,
    ) : this() {
        this.vDouble = vDouble
        this.mantissaLow = mantissaLow
        this.mantissaHigh = mantissaHigh
        this.biasedExponent = biasedExponent
        this.sign = sign
    }

    /**
     * Allocate a new DoubleIeee754 using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param vDouble the double value
     * @param mantissaLow
     * @param mantissaHigh
     * @param biasedExponent
     * @param sign
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        vDouble: gdouble,
        mantissaLow: guint,
        mantissaHigh: guint,
        biasedExponent: guint,
        sign: guint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.vDouble = vDouble
        this.mantissaLow = mantissaLow
        this.mantissaHigh = mantissaHigh
        this.biasedExponent = biasedExponent
        this.sign = sign
    }

    override fun toString(): String =
        "DoubleIeee754(vDouble=$vDouble, mantissaLow=$mantissaLow, mantissaHigh=$mantissaHigh, biasedExponent=$biasedExponent, sign=$sign)"
}
