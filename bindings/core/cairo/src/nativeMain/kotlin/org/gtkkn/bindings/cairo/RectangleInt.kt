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
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.cairo.cairo_gobject_rectangle_int_get_type
import org.gtkkn.native.cairo.cairo_rectangle_int_t
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.String

public class RectangleInt(public val cairoRectangleIntPointer: CPointer<cairo_rectangle_int_t>) :
    ProxyInstance(cairoRectangleIntPointer) {
    public var x: gint
        get() = cairoRectangleIntPointer.pointed.x

        @UnsafeFieldSetter
        set(`value`) {
            cairoRectangleIntPointer.pointed.x = value
        }

    public var y: gint
        get() = cairoRectangleIntPointer.pointed.y

        @UnsafeFieldSetter
        set(`value`) {
            cairoRectangleIntPointer.pointed.y = value
        }

    public var width: gint
        get() = cairoRectangleIntPointer.pointed.width

        @UnsafeFieldSetter
        set(`value`) {
            cairoRectangleIntPointer.pointed.width = value
        }

    public var height: gint
        get() = cairoRectangleIntPointer.pointed.height

        @UnsafeFieldSetter
        set(`value`) {
            cairoRectangleIntPointer.pointed.height = value
        }

    /**
     * Allocate a new RectangleInt.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<cairo_rectangle_int_t>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new RectangleInt using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<cairo_rectangle_int_t>().ptr)

    /**
     * Allocate a new RectangleInt.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param x
     * @param y
     * @param width
     * @param height
     */
    public constructor(
        x: gint,
        y: gint,
        width: gint,
        height: gint,
    ) : this() {
        this.x = x
        this.y = y
        this.width = width
        this.height = height
    }

    /**
     * Allocate a new RectangleInt using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param x
     * @param y
     * @param width
     * @param height
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        x: gint,
        y: gint,
        width: gint,
        height: gint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.x = x
        this.y = y
        this.width = width
        this.height = height
    }

    override fun toString(): String = "RectangleInt(x=$x, y=$y, width=$width, height=$height)"

    public companion object {
        /**
         * Get the GType of RectangleInt
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_rectangle_int_get_type()
    }
}
