// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gio.GInputVector
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.gsize
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * Structure used for scatter/gather data input.
 * You generally pass in an array of #GInputVectors
 * and the operation will store the read data starting in the
 * first buffer, switching to the next as needed.
 * @since 2.22
 */
@GioVersion2_22
public class InputVector(public val gioInputVectorPointer: CPointer<GInputVector>, cleaner: Cleaner? = null) :
    ProxyInstance(gioInputVectorPointer) {
    /**
     * Pointer to a buffer where data will be written.
     */
    public var buffer: gpointer
        get() = gioInputVectorPointer.pointed.buffer!!

        @UnsafeFieldSetter
        set(`value`) {
            gioInputVectorPointer.pointed.buffer = value
        }

    /**
     * the available size in @buffer.
     */
    public var size: gsize
        get() = gioInputVectorPointer.pointed.size

        @UnsafeFieldSetter
        set(`value`) {
            gioInputVectorPointer.pointed.size = value
        }

    /**
     * Allocate a new InputVector.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GInputVector>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to InputVector and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GInputVector>, Cleaner>,
    ) : this(gioInputVectorPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new InputVector using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GInputVector>().ptr)

    /**
     * Allocate a new InputVector.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param buffer Pointer to a buffer where data will be written.
     * @param size the available size in @buffer.
     */
    public constructor(buffer: gpointer, size: gsize) : this() {
        this.buffer = buffer
        this.size = size
    }

    /**
     * Allocate a new InputVector using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param buffer Pointer to a buffer where data will be written.
     * @param size the available size in @buffer.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        buffer: gpointer,
        size: gsize,
        scope: AutofreeScope,
    ) : this(scope) {
        this.buffer = buffer
        this.size = size
    }

    override fun toString(): String = "InputVector(buffer=$buffer, size=$size)"
}
