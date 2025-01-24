// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.cairo.cairo_path_t
import org.gtkkn.native.glib.gint
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * ## Skipped during bindings generation
 *
 * - field `data`: Field with not-pointer record/union cairo_path_data_t is not supported
 */
public class Path(public val cairoPathPointer: CPointer<cairo_path_t>, cleaner: Cleaner? = null) :
    ProxyInstance(cairoPathPointer) {
    public var status: Status
        get() = cairoPathPointer.pointed.status.run {
            Status.fromNativeValue(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            cairoPathPointer.pointed.status = value.nativeValue
        }

    public var numData: gint
        get() = cairoPathPointer.pointed.num_data

        @UnsafeFieldSetter
        set(`value`) {
            cairoPathPointer.pointed.num_data = value
        }

    /**
     * Allocate a new Path.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<cairo_path_t>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Path and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<cairo_path_t>, Cleaner>,
    ) : this(cairoPathPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Path using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<cairo_path_t>().ptr)

    /**
     * Allocate a new Path.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param status
     * @param numData
     */
    public constructor(status: Status, numData: gint) : this() {
        this.status = status
        this.numData = numData
    }

    /**
     * Allocate a new Path using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param status
     * @param numData
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        status: Status,
        numData: gint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.status = status
        this.numData = numData
    }

    override fun toString(): String = "Path(status=$status, numData=$numData)"
}
