// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.cairo.cairo_gobject_surface_get_type
import org.gtkkn.native.cairo.cairo_pattern_create_for_surface
import org.gtkkn.native.cairo.cairo_pattern_t
import org.gtkkn.native.gobject.GType

/**
 * ## Skipped during bindings generation
 *
 * - parameter `surface`: surface: Out parameter is not supported
 */
public open class SurfacePattern(pointer: CPointer<cairo_pattern_t>) :
    Pattern(pointer.reinterpret()),
    KGTyped {
    public val cairoSurfacePatternPointer: CPointer<cairo_pattern_t>
        get() = gPointer.reinterpret()

    public constructor(surface: Surface) : this(
        cairo_pattern_create_for_surface(surface.gPointer.reinterpret())!!.reinterpret()
    )

    public companion object : TypeCompanion<SurfacePattern> {
        override val type: GeneratedClassKGType<SurfacePattern> =
            GeneratedClassKGType(cairo_gobject_surface_get_type()) { SurfacePattern(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        /**
         * Get the GType of SurfacePattern
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_surface_get_type()
    }
}
