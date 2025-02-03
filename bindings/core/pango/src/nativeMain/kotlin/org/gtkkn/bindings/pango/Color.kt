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
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.pango.annotations.PangoVersion1_16
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.guint16
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoColor
import org.gtkkn.native.pango.pango_color_copy
import org.gtkkn.native.pango.pango_color_free
import org.gtkkn.native.pango.pango_color_get_type
import org.gtkkn.native.pango.pango_color_parse
import org.gtkkn.native.pango.pango_color_to_string
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * The `PangoColor` structure is used to
 * represent a color in an uncalibrated RGB color-space.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `alpha`: alpha: Out parameter is not supported
 */
public class Color(public val pangoColorPointer: CPointer<PangoColor>) : ProxyInstance(pangoColorPointer) {
    /**
     * value of red component
     */
    public var red: guint16
        get() = pangoColorPointer.pointed.red

        @UnsafeFieldSetter
        set(`value`) {
            pangoColorPointer.pointed.red = value
        }

    /**
     * value of green component
     */
    public var green: guint16
        get() = pangoColorPointer.pointed.green

        @UnsafeFieldSetter
        set(`value`) {
            pangoColorPointer.pointed.green = value
        }

    /**
     * value of blue component
     */
    public var blue: guint16
        get() = pangoColorPointer.pointed.blue

        @UnsafeFieldSetter
        set(`value`) {
            pangoColorPointer.pointed.blue = value
        }

    /**
     * Allocate a new Color.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<PangoColor>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new Color using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<PangoColor>().ptr)

    /**
     * Allocate a new Color.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param red value of red component
     * @param green value of green component
     * @param blue value of blue component
     */
    public constructor(
        red: guint16,
        green: guint16,
        blue: guint16,
    ) : this() {
        this.red = red
        this.green = green
        this.blue = blue
    }

    /**
     * Allocate a new Color using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param red value of red component
     * @param green value of green component
     * @param blue value of blue component
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        red: guint16,
        green: guint16,
        blue: guint16,
        scope: AutofreeScope,
    ) : this(scope) {
        this.red = red
        this.green = green
        this.blue = blue
    }

    /**
     * Creates a copy of @src.
     *
     * The copy should be freed with [method@Pango.Color.free].
     * Primarily used by language bindings, not that useful
     * otherwise (since colors can just be copied by assignment
     * in C).
     *
     * @return the newly allocated `PangoColor`,
     *   which should be freed with [method@Pango.Color.free]
     */
    public fun copy(): Color? = pango_color_copy(pangoColorPointer)?.run {
        Color(this)
    }

    /**
     * Frees a color allocated by [method@Pango.Color.copy].
     */
    public fun free(): Unit = pango_color_free(pangoColorPointer)

    /**
     * Fill in the fields of a color from a string specification.
     *
     * The string can either one of a large set of standard names.
     * (Taken from the CSS Color [specification](https://www.w3.org/TR/css-color-4/#named-colors),
     * or it can be a value in the form `#rgb`, `#rrggbb`,
     * `#rrrgggbbb` or `#rrrrggggbbbb`, where `r`, `g` and `b`
     * are hex digits of the red, green, and blue components
     * of the color, respectively. (White in the four forms is
     * `#fff`, `#ffffff`, `#fffffffff` and `#ffffffffffff`.)
     *
     * @param spec a string specifying the new color
     * @return true if parsing of the specifier succeeded,
     *   otherwise false
     */
    public fun parse(spec: String): Boolean = pango_color_parse(pangoColorPointer, spec).asBoolean()

    /**
     * Returns a textual specification of @color.
     *
     * The string is in the hexadecimal form `#rrrrggggbbbb`,
     * where `r`, `g` and `b` are hex digits representing the
     * red, green, and blue components respectively.
     *
     * @return a newly-allocated text string that must
     *   be freed with g_free().
     * @since 1.16
     */
    @Suppress("POTENTIALLY_NON_REPORTED_ANNOTATION")
    @PangoVersion1_16
    override fun toString(): String =
        pango_color_to_string(pangoColorPointer)?.toKString() ?: error("Expected not null string")

    public companion object {
        /**
         * Get the GType of Color
         *
         * @return the GType
         */
        public fun getType(): GType = pango_color_get_type()
    }
}
