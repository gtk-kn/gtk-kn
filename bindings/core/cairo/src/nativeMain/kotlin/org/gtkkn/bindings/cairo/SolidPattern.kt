// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.cairo.cairo_gobject_surface_get_type
import org.gtkkn.native.cairo.cairo_pattern_create_rgb
import org.gtkkn.native.cairo.cairo_pattern_create_rgba
import org.gtkkn.native.cairo.cairo_pattern_t
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.gobject.GType

/**
 * ## Skipped during bindings generation
 *
 * - parameter `red`: red: Out parameter is not supported
 */
public open class SolidPattern(pointer: CPointer<cairo_pattern_t>) :
    Pattern(pointer.reinterpret()),
    KGTyped {
    public val cairoSolidPatternPointer: CPointer<cairo_pattern_t>
        get() = gPointer.reinterpret()

    public constructor(
        red: gdouble,
        green: gdouble,
        blue: gdouble,
    ) : this(cairo_pattern_create_rgb(red, green, blue)!!.reinterpret())

    public constructor(
        red: gdouble,
        green: gdouble,
        blue: gdouble,
        alpha: gdouble,
    ) : this(cairo_pattern_create_rgba(red, green, blue, alpha)!!.reinterpret())

    public companion object : TypeCompanion<SolidPattern> {
        override val type: GeneratedClassKGType<SolidPattern> =
            GeneratedClassKGType(cairo_gobject_surface_get_type()) { SolidPattern(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        /**
         * Get the GType of SolidPattern
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_surface_get_type()
    }
}
