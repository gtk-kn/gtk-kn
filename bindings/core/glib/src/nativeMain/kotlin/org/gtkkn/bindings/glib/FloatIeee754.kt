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
import org.gtkkn.native.glib.GFloatIEEE754
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.glib.guint
import kotlin.String

public class FloatIeee754(public val glibFloatIeee754Pointer: CPointer<GFloatIEEE754>) :
    ProxyInstance(glibFloatIeee754Pointer) {
    public var vFloat: gfloat
        get() = glibFloatIeee754Pointer.pointed.v_float

        @UnsafeFieldSetter
        set(`value`) {
            glibFloatIeee754Pointer.pointed.v_float = value
        }

    public var mantissa: guint
        get() = glibFloatIeee754Pointer.pointed.mpn.mantissa

        @UnsafeFieldSetter
        set(`value`) {
            glibFloatIeee754Pointer.pointed.mpn.mantissa = value
        }

    public var biasedExponent: guint
        get() = glibFloatIeee754Pointer.pointed.mpn.biased_exponent

        @UnsafeFieldSetter
        set(`value`) {
            glibFloatIeee754Pointer.pointed.mpn.biased_exponent = value
        }

    public var sign: guint
        get() = glibFloatIeee754Pointer.pointed.mpn.sign

        @UnsafeFieldSetter
        set(`value`) {
            glibFloatIeee754Pointer.pointed.mpn.sign = value
        }

    /**
     * Allocate a new FloatIeee754.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GFloatIEEE754>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new FloatIeee754 using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GFloatIEEE754>().ptr)

    /**
     * Allocate a new FloatIeee754.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param vFloat
     * @param mantissa
     * @param biasedExponent
     * @param sign
     */
    public constructor(
        vFloat: gfloat,
        mantissa: guint,
        biasedExponent: guint,
        sign: guint,
    ) : this() {
        this.vFloat = vFloat
        this.mantissa = mantissa
        this.biasedExponent = biasedExponent
        this.sign = sign
    }

    /**
     * Allocate a new FloatIeee754 using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param vFloat
     * @param mantissa
     * @param biasedExponent
     * @param sign
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        vFloat: gfloat,
        mantissa: guint,
        biasedExponent: guint,
        sign: guint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.vFloat = vFloat
        this.mantissa = mantissa
        this.biasedExponent = biasedExponent
        this.sign = sign
    }

    override fun toString(): String =
        "FloatIeee754(vFloat=$vFloat, mantissa=$mantissa, biasedExponent=$biasedExponent, sign=$sign)"
}
