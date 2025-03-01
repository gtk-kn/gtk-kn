// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.gtk.GtkRequestedSize
import kotlin.String

/**
 * Represents a request of a screen object in a given orientation. These
 * are primarily used in container implementations when allocating a natural
 * size for children calling. See [func@distribute_natural_allocation].
 */
public class RequestedSize(public val gtkRequestedSizePointer: CPointer<GtkRequestedSize>) :
    ProxyInstance(gtkRequestedSizePointer) {
    /**
     * A client pointer
     */
    public var `data`: gpointer
        get() = gtkRequestedSizePointer.pointed.data!!

        @UnsafeFieldSetter
        set(`value`) {
            gtkRequestedSizePointer.pointed.data = value
        }

    /**
     * The minimum size needed for allocation in a given orientation
     */
    public var minimumSize: gint
        get() = gtkRequestedSizePointer.pointed.minimum_size

        @UnsafeFieldSetter
        set(`value`) {
            gtkRequestedSizePointer.pointed.minimum_size = value
        }

    /**
     * The natural size for allocation in a given orientation
     */
    public var naturalSize: gint
        get() = gtkRequestedSizePointer.pointed.natural_size

        @UnsafeFieldSetter
        set(`value`) {
            gtkRequestedSizePointer.pointed.natural_size = value
        }

    /**
     * Allocate a new RequestedSize.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GtkRequestedSize>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new RequestedSize using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GtkRequestedSize>().ptr)

    /**
     * Allocate a new RequestedSize.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param data A client pointer
     * @param minimumSize The minimum size needed for allocation in a given orientation
     * @param naturalSize The natural size for allocation in a given orientation
     */
    public constructor(
        `data`: gpointer,
        minimumSize: gint,
        naturalSize: gint,
    ) : this() {
        this.data = data
        this.minimumSize = minimumSize
        this.naturalSize = naturalSize
    }

    /**
     * Allocate a new RequestedSize using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param data A client pointer
     * @param minimumSize The minimum size needed for allocation in a given orientation
     * @param naturalSize The natural size for allocation in a given orientation
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        `data`: gpointer,
        minimumSize: gint,
        naturalSize: gint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.data = data
        this.minimumSize = minimumSize
        this.naturalSize = naturalSize
    }

    override fun toString(): String = "RequestedSize(data=$data, minimumSize=$minimumSize, naturalSize=$naturalSize)"
}
