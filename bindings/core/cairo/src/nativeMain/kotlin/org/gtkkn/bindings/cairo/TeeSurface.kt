// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_10
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.cairo.cairo_gobject_surface_get_type
import org.gtkkn.native.cairo.cairo_surface_t
import org.gtkkn.native.cairo.cairo_tee_surface_add
import org.gtkkn.native.cairo.cairo_tee_surface_create
import org.gtkkn.native.cairo.cairo_tee_surface_remove
import org.gtkkn.native.gobject.GType
import kotlin.Unit

/**
 *
 * @since 1.10
 */
@CairoVersion1_10
public open class TeeSurface(public val cairoTeeSurfacePointer: CPointer<cairo_surface_t>) :
    Surface(cairoTeeSurfacePointer.reinterpret()),
    KGTyped {
    public open fun add(target: Surface): Unit =
        cairo_tee_surface_add(cairoTeeSurfacePointer, target.cairoSurfacePointer)

    public open fun remove(target: Surface): Unit =
        cairo_tee_surface_remove(cairoTeeSurfacePointer, target.cairoSurfacePointer)

    public companion object : TypeCompanion<TeeSurface> {
        override val type: GeneratedClassKGType<TeeSurface> =
            GeneratedClassKGType(cairo_gobject_surface_get_type()) { TeeSurface(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        public fun create(primary: Surface): TeeSurface = cairo_tee_surface_create(primary.cairoSurfacePointer)!!.run {
            TeeSurface(reinterpret())
        }

        /**
         * Get the GType of TeeSurface
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_surface_get_type()
    }
}
