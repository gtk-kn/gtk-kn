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
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gio.GOutputVector
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.gsize
import kotlin.String

/**
 * Structure used for scatter/gather data output.
 * You generally pass in an array of #GOutputVectors
 * and the operation will use all the buffers as if they were
 * one buffer.
 * @since 2.22
 */
@GioVersion2_22
public class OutputVector(public val gioOutputVectorPointer: CPointer<GOutputVector>) :
    ProxyInstance(gioOutputVectorPointer) {
    /**
     * Pointer to a buffer of data to read.
     */
    public var buffer: gpointer
        get() = gioOutputVectorPointer.pointed.buffer!!

        @UnsafeFieldSetter
        set(`value`) {
            gioOutputVectorPointer.pointed.buffer = value
        }

    /**
     * the size of @buffer.
     */
    public var size: gsize
        get() = gioOutputVectorPointer.pointed.size

        @UnsafeFieldSetter
        set(`value`) {
            gioOutputVectorPointer.pointed.size = value
        }

    /**
     * Allocate a new OutputVector.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GOutputVector>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new OutputVector using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GOutputVector>().ptr)

    /**
     * Allocate a new OutputVector.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param buffer Pointer to a buffer of data to read.
     * @param size the size of @buffer.
     */
    public constructor(buffer: gpointer, size: gsize) : this() {
        this.buffer = buffer
        this.size = size
    }

    /**
     * Allocate a new OutputVector using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param buffer Pointer to a buffer of data to read.
     * @param size the size of @buffer.
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

    override fun toString(): String = "OutputVector(buffer=$buffer, size=$size)"
}
