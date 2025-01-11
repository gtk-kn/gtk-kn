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
public abstract class Gradient(public val cairoGradientPointer: CPointer<cairo_pattern_t>) :
    Pattern(cairoGradientPointer.reinterpret()),
    KGTyped {
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
            GeneratedClassKGType(cairo_gobject_pattern_get_type()) { GradientImpl(it.reinterpret()) }

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
