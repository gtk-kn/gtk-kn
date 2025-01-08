// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_2
import org.gtkkn.bindings.cairo.annotations.CairoVersion1_6
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.cairo.cairo_gobject_surface_get_type
import org.gtkkn.native.cairo.cairo_ps_surface_create
import org.gtkkn.native.cairo.cairo_ps_surface_dsc_begin_page_setup
import org.gtkkn.native.cairo.cairo_ps_surface_dsc_begin_setup
import org.gtkkn.native.cairo.cairo_ps_surface_dsc_comment
import org.gtkkn.native.cairo.cairo_ps_surface_get_eps
import org.gtkkn.native.cairo.cairo_ps_surface_restrict_to_level
import org.gtkkn.native.cairo.cairo_ps_surface_set_eps
import org.gtkkn.native.cairo.cairo_ps_surface_set_size
import org.gtkkn.native.cairo.cairo_surface_t
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 *
 * @since 1.2
 */
@CairoVersion1_2
public open class PsSurface(pointer: CPointer<cairo_surface_t>) :
    Surface(pointer.reinterpret()),
    KGTyped {
    public val cairoPsSurfacePointer: CPointer<cairo_surface_t>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param level
     * @since 1.6
     */
    @CairoVersion1_6
    public open fun restrictToLevel(level: PsLevel): Unit =
        cairo_ps_surface_restrict_to_level(cairoPsSurfacePointer, level.nativeValue)

    /**
     *
     *
     * @param eps
     * @since 1.6
     */
    @CairoVersion1_6
    public open fun setEps(eps: Boolean): Unit = cairo_ps_surface_set_eps(cairoPsSurfacePointer, eps.asGBoolean())

    /**
     *
     *
     * @since 1.6
     */
    @CairoVersion1_6
    public open fun getEps(): Boolean = cairo_ps_surface_get_eps(cairoPsSurfacePointer).asBoolean()

    public open fun setSize(widthInPoints: gdouble, heightInPoints: gdouble): Unit =
        cairo_ps_surface_set_size(cairoPsSurfacePointer, widthInPoints, heightInPoints)

    public open fun dscBeginSetup(): Unit = cairo_ps_surface_dsc_begin_setup(cairoPsSurfacePointer)

    public open fun dscBeginPageSetup(): Unit = cairo_ps_surface_dsc_begin_page_setup(cairoPsSurfacePointer)

    public open fun dscComment(comment: String): Unit = cairo_ps_surface_dsc_comment(cairoPsSurfacePointer, comment)

    public companion object : TypeCompanion<PsSurface> {
        override val type: GeneratedClassKGType<PsSurface> =
            GeneratedClassKGType(cairo_gobject_surface_get_type()) { PsSurface(it.reinterpret()) }

        init {
            CairoTypeProvider.register()
        }

        public fun create(filename: String?, widthInPoints: gdouble, heightInPoints: gdouble): PsSurface =
            cairo_ps_surface_create(filename, widthInPoints, heightInPoints)!!.run {
                PsSurface(reinterpret())
            }

        /**
         * Get the GType of PSSurface
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_surface_get_type()
    }
}
