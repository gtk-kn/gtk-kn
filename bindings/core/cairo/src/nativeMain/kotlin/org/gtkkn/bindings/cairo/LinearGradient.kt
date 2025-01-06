// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.cairo.cairo_gobject_pattern_get_type
import org.gtkkn.native.cairo.cairo_pattern_create_linear
import org.gtkkn.native.cairo.cairo_pattern_t
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.gobject.GType

/**
 * ## Skipped during bindings generation
 *
 * - parameter `x0`: x0: Out parameter is not supported
 */
public open class LinearGradient(pointer: CPointer<cairo_pattern_t>) :
    Gradient(pointer.reinterpret()),
    KGTyped {
    public val cairoLinearGradientPointer: CPointer<cairo_pattern_t>
        get() = gPointer.reinterpret()

    public constructor(
        x0: gdouble,
        y0: gdouble,
        x1: gdouble,
        y1: gdouble,
    ) : this(cairo_pattern_create_linear(x0, y0, x1, y1)!!.reinterpret())

    public companion object : TypeCompanion<LinearGradient> {
        override val type: GeneratedClassKGType<LinearGradient> =
            GeneratedClassKGType(cairo_gobject_pattern_get_type()) { LinearGradient(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        /**
         * Get the GType of LinearGradient
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_pattern_get_type()
    }
}
