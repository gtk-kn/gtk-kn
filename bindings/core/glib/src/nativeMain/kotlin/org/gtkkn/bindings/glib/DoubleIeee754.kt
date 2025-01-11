// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GDoubleIEEE754
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.guint
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

public class DoubleIeee754(public val glibDoubleIeee754Pointer: CPointer<GDoubleIEEE754>, cleaner: Cleaner? = null) :
    ProxyInstance(glibDoubleIeee754Pointer) {
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
    public constructor() : this(
        nativeHeap.alloc<GDoubleIEEE754>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to DoubleIeee754 and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GDoubleIEEE754>, Cleaner>,
    ) : this(glibDoubleIeee754Pointer = pair.first, cleaner = pair.second)

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
     * @param vDouble
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
     * @param vDouble
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
