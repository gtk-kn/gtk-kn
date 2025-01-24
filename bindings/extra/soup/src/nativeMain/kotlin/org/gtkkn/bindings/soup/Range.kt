// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gint64
import org.gtkkn.native.soup.SoupRange
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * Represents a byte range as used in the Range header.
 *
 * If @end is non-negative, then @start and @end represent the bounds
 * of of the range, counting from 0. (Eg, the first 500 bytes would be
 * represented as @start = 0 and @end = 499.)
 *
 * If @end is -1 and @start is non-negative, then this represents a
 * range starting at @start and ending with the last byte of the
 * requested resource body. (Eg, all but the first 500 bytes would be
 * @start = 500, and @end = -1.)
 *
 * If @end is -1 and @start is negative, then it represents a "suffix
 * range", referring to the last -@start bytes of the resource body.
 * (Eg, the last 500 bytes would be @start = -500 and @end = -1.)
 */
public class Range(public val soupRangePointer: CPointer<SoupRange>, cleaner: Cleaner? = null) :
    ProxyInstance(soupRangePointer) {
    /**
     * the start of the range
     */
    public var start: gint64
        get() = soupRangePointer.pointed.start

        @UnsafeFieldSetter
        set(`value`) {
            soupRangePointer.pointed.start = value
        }

    /**
     * the end of the range
     */
    public var end: gint64
        get() = soupRangePointer.pointed.end

        @UnsafeFieldSetter
        set(`value`) {
            soupRangePointer.pointed.end = value
        }

    /**
     * Allocate a new Range.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<SoupRange>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Range and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<SoupRange>, Cleaner>,
    ) : this(soupRangePointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Range using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<SoupRange>().ptr)

    /**
     * Allocate a new Range.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param start the start of the range
     * @param end the end of the range
     */
    public constructor(start: gint64, end: gint64) : this() {
        this.start = start
        this.end = end
    }

    /**
     * Allocate a new Range using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param start the start of the range
     * @param end the end of the range
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        start: gint64,
        end: gint64,
        scope: AutofreeScope,
    ) : this(scope) {
        this.start = start
        this.end = end
    }

    override fun toString(): String = "Range(start=$start, end=$end)"
}
