// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gsk.GskCairoRenderer
import org.gtkkn.native.gsk.gsk_cairo_renderer_get_type
import org.gtkkn.native.gsk.gsk_cairo_renderer_new

/**
 * A GSK renderer that is using cairo.
 *
 * Since it is using cairo, this renderer cannot support
 * 3D transformations.
 */
public open class CairoRenderer(
    pointer: CPointer<GskCairoRenderer>,
) : Renderer(pointer.reinterpret()),
    KGTyped {
    public val gskCairoRendererPointer: CPointer<GskCairoRenderer>
        get() = gPointer.reinterpret()

    /**
     * Creates a new Cairo renderer.
     *
     * The Cairo renderer is the fallback renderer drawing in ways similar
     * to how GTK 3 drew its content. Its primary use is as comparison tool.
     *
     * The Cairo renderer is incomplete. It cannot render 3D transformed
     * content and will instead render an error marker. Its usage should be
     * avoided.
     *
     * @return a new Cairo renderer.
     */
    public constructor() : this(gsk_cairo_renderer_new()!!.reinterpret())

    public companion object : TypeCompanion<CairoRenderer> {
        override val type: GeneratedClassKGType<CairoRenderer> =
            GeneratedClassKGType(gsk_cairo_renderer_get_type()) { CairoRenderer(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }
    }
}
