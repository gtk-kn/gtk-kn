// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.cairo.cairo_gobject_pattern_get_type
import org.gtkkn.native.cairo.cairo_pattern_add_color_stop_rgb
import org.gtkkn.native.cairo.cairo_pattern_add_color_stop_rgba
import org.gtkkn.native.cairo.cairo_pattern_t
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.gobject.GType
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - parameter `count`: count: Out parameter is not supported
 * - parameter `offset`: offset: Out parameter is not supported
 */
public abstract class Gradient(public val cairoGradientPointer: CPointer<cairo_pattern_t>) :
    Pattern(cairoGradientPointer.reinterpret()),
    KGTyped {
    init {
        Cairo
    }

    public open fun addColorStopRgb(offset: gdouble, red: gdouble, green: gdouble, blue: gdouble): Unit =
        cairo_pattern_add_color_stop_rgb(cairoGradientPointer, offset, red, green, blue)

    public open fun addColorStopRgba(
        offset: gdouble,
        red: gdouble,
        green: gdouble,
        blue: gdouble,
        alpha: gdouble,
    ): Unit = cairo_pattern_add_color_stop_rgba(cairoGradientPointer, offset, red, green, blue, alpha)

    /**
     * The GradientImpl type represents a native instance of the abstract Gradient class.
     *
     * @constructor Creates a new instance of Gradient for the provided [CPointer].
     */
    public class GradientImpl(pointer: CPointer<cairo_pattern_t>) : Gradient(pointer)

    public companion object : TypeCompanion<Gradient> {
        override val type: GeneratedClassKGType<Gradient> =
            GeneratedClassKGType(getTypeOrNull()!!) { GradientImpl(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        /**
         * Get the GType of Gradient
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_pattern_get_type()

        /**
         * Gets the GType of from the symbol `cairo_gobject_pattern_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("cairo_gobject_pattern_get_type")
    }
}
