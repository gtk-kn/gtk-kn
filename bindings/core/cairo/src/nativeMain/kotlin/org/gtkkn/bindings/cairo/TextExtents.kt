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
import org.gtkkn.native.cairo.cairo_text_extents_t
import org.gtkkn.native.glib.gdouble
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

public class TextExtents(
    public val cairoTextExtentsPointer: CPointer<cairo_text_extents_t>,
    cleaner: Cleaner? = null,
) : ProxyInstance(cairoTextExtentsPointer) {
    public var xBearing: gdouble
        get() = cairoTextExtentsPointer.pointed.x_bearing

        @UnsafeFieldSetter
        set(`value`) {
            cairoTextExtentsPointer.pointed.x_bearing = value
        }

    public var yBearing: gdouble
        get() = cairoTextExtentsPointer.pointed.y_bearing

        @UnsafeFieldSetter
        set(`value`) {
            cairoTextExtentsPointer.pointed.y_bearing = value
        }

    public var width: gdouble
        get() = cairoTextExtentsPointer.pointed.width

        @UnsafeFieldSetter
        set(`value`) {
            cairoTextExtentsPointer.pointed.width = value
        }

    public var height: gdouble
        get() = cairoTextExtentsPointer.pointed.height

        @UnsafeFieldSetter
        set(`value`) {
            cairoTextExtentsPointer.pointed.height = value
        }

    public var xAdvance: gdouble
        get() = cairoTextExtentsPointer.pointed.x_advance

        @UnsafeFieldSetter
        set(`value`) {
            cairoTextExtentsPointer.pointed.x_advance = value
        }

    public var yAdvance: gdouble
        get() = cairoTextExtentsPointer.pointed.y_advance

        @UnsafeFieldSetter
        set(`value`) {
            cairoTextExtentsPointer.pointed.y_advance = value
        }

    /**
     * Allocate a new TextExtents.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<cairo_text_extents_t>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to TextExtents and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<cairo_text_extents_t>, Cleaner>,
    ) : this(cairoTextExtentsPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new TextExtents using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<cairo_text_extents_t>().ptr)

    /**
     * Allocate a new TextExtents.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param xBearing
     * @param yBearing
     * @param width
     * @param height
     * @param xAdvance
     * @param yAdvance
     */
    public constructor(
        xBearing: gdouble,
        yBearing: gdouble,
        width: gdouble,
        height: gdouble,
        xAdvance: gdouble,
        yAdvance: gdouble,
    ) : this() {
        this.xBearing = xBearing
        this.yBearing = yBearing
        this.width = width
        this.height = height
        this.xAdvance = xAdvance
        this.yAdvance = yAdvance
    }

    /**
     * Allocate a new TextExtents using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param xBearing
     * @param yBearing
     * @param width
     * @param height
     * @param xAdvance
     * @param yAdvance
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        xBearing: gdouble,
        yBearing: gdouble,
        width: gdouble,
        height: gdouble,
        xAdvance: gdouble,
        yAdvance: gdouble,
        scope: AutofreeScope,
    ) : this(scope) {
        this.xBearing = xBearing
        this.yBearing = yBearing
        this.width = width
        this.height = height
        this.xAdvance = xAdvance
        this.yAdvance = yAdvance
    }

    override fun toString(): String =
        "TextExtents(xBearing=$xBearing, yBearing=$yBearing, width=$width, height=$height, xAdvance=$xAdvance, yAdvance=$yAdvance)"
}
