// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
public open class Gradient(pointer: CPointer<cairo_pattern_t>) :
    Pattern(pointer.reinterpret()),
    KGTyped {
    public val cairoGradientPointer: CPointer<cairo_pattern_t>
        get() = gPointer.reinterpret()

    public open fun addColorStopRgb(offset: gdouble, red: gdouble, green: gdouble, blue: gdouble): Unit =
        cairo_pattern_add_color_stop_rgb(cairoGradientPointer.reinterpret(), offset, red, green, blue)

    public open fun addColorStopRgba(
        offset: gdouble,
        red: gdouble,
        green: gdouble,
        blue: gdouble,
        alpha: gdouble,
    ): Unit = cairo_pattern_add_color_stop_rgba(cairoGradientPointer.reinterpret(), offset, red, green, blue, alpha)

    public companion object : TypeCompanion<Gradient> {
        override val type: GeneratedClassKGType<Gradient> =
            GeneratedClassKGType(cairo_gobject_pattern_get_type()) { Gradient(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        /**
         * Get the GType of Gradient
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_pattern_get_type()
    }
}
