// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

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
import org.gtkkn.native.pango.PangoRectangle
import kotlin.String

/**
 * The `PangoRectangle` structure represents a rectangle.
 *
 * `PangoRectangle` is frequently used to represent the logical or ink
 * extents of a single glyph or section of text. (See, for instance,
 * [method@Pango.Font.get_glyph_extents].)
 */
public class Rectangle(public val pangoRectanglePointer: CPointer<PangoRectangle>) :
    ProxyInstance(pangoRectanglePointer) {
    /**
     * X coordinate of the left side of the rectangle.
     */
    public var x: gint
        get() = pangoRectanglePointer.pointed.x

        @UnsafeFieldSetter
        set(`value`) {
            pangoRectanglePointer.pointed.x = value
        }

    /**
     * Y coordinate of the the top side of the rectangle.
     */
    public var y: gint
        get() = pangoRectanglePointer.pointed.y

        @UnsafeFieldSetter
        set(`value`) {
            pangoRectanglePointer.pointed.y = value
        }

    /**
     * width of the rectangle.
     */
    public var width: gint
        get() = pangoRectanglePointer.pointed.width

        @UnsafeFieldSetter
        set(`value`) {
            pangoRectanglePointer.pointed.width = value
        }

    /**
     * height of the rectangle.
     */
    public var height: gint
        get() = pangoRectanglePointer.pointed.height

        @UnsafeFieldSetter
        set(`value`) {
            pangoRectanglePointer.pointed.height = value
        }

    /**
     * Allocate a new Rectangle.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<PangoRectangle>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new Rectangle using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<PangoRectangle>().ptr)

    /**
     * Allocate a new Rectangle.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param x X coordinate of the left side of the rectangle.
     * @param y Y coordinate of the the top side of the rectangle.
     * @param width width of the rectangle.
     * @param height height of the rectangle.
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
     * Allocate a new Rectangle using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param x X coordinate of the left side of the rectangle.
     * @param y Y coordinate of the the top side of the rectangle.
     * @param width width of the rectangle.
     * @param height height of the rectangle.
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

    override fun toString(): String = "Rectangle(x=$x, y=$y, width=$width, height=$height)"
}
