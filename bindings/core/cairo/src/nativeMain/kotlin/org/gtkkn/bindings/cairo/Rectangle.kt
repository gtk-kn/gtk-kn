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
import org.gtkkn.native.cairo.cairo_gobject_rectangle_get_type
import org.gtkkn.native.cairo.cairo_rectangle_t
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.gobject.GType
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

public class Rectangle(public val cairoRectanglePointer: CPointer<cairo_rectangle_t>, cleaner: Cleaner? = null) :
    ProxyInstance(cairoRectanglePointer) {
    public var x: gdouble
        get() = cairoRectanglePointer.pointed.x

        @UnsafeFieldSetter
        set(`value`) {
            cairoRectanglePointer.pointed.x = value
        }

    public var y: gdouble
        get() = cairoRectanglePointer.pointed.y

        @UnsafeFieldSetter
        set(`value`) {
            cairoRectanglePointer.pointed.y = value
        }

    public var width: gdouble
        get() = cairoRectanglePointer.pointed.width

        @UnsafeFieldSetter
        set(`value`) {
            cairoRectanglePointer.pointed.width = value
        }

    public var height: gdouble
        get() = cairoRectanglePointer.pointed.height

        @UnsafeFieldSetter
        set(`value`) {
            cairoRectanglePointer.pointed.height = value
        }

    /**
     * Allocate a new Rectangle.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<cairo_rectangle_t>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Rectangle and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<cairo_rectangle_t>, Cleaner>,
    ) : this(cairoRectanglePointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Rectangle using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<cairo_rectangle_t>().ptr)

    /**
     * Allocate a new Rectangle.
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
        x: gdouble,
        y: gdouble,
        width: gdouble,
        height: gdouble,
    ) : this() {
        this.x = x
        this.y = y
        this.width = width
        this.height = height
    }

    /**
     * Allocate a new Rectangle using the provided [AutofreeScope].
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
        x: gdouble,
        y: gdouble,
        width: gdouble,
        height: gdouble,
        scope: AutofreeScope,
    ) : this(scope) {
        this.x = x
        this.y = y
        this.width = width
        this.height = height
    }

    override fun toString(): String = "Rectangle(x=$x, y=$y, width=$width, height=$height)"

    public companion object {
        /**
         * Get the GType of Rectangle
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_rectangle_get_type()
    }
}
