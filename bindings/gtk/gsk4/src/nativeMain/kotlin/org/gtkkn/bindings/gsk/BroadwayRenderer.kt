// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gsk.GskBroadwayRenderer
import org.gtkkn.native.gsk.gsk_broadway_renderer_get_type
import org.gtkkn.native.gsk.gsk_broadway_renderer_new

public open class BroadwayRenderer(
    pointer: CPointer<GskBroadwayRenderer>,
) : Renderer(pointer.reinterpret()),
    KGTyped {
    public val gskBroadwayRendererPointer: CPointer<GskBroadwayRenderer>
        get() = gPointer.reinterpret()

    /**
     * Creates a new Broadway renderer.
     *
     * The Broadway renderer is the default renderer for the broadway backend.
     * It will only work with broadway surfaces, otherwise it will fail the
     * call to gsk_renderer_realize().
     *
     * This function is only available when GTK was compiled with Broadway
     * support.
     *
     * @return a new Broadway renderer.
     */
    public constructor() : this(gsk_broadway_renderer_new()!!.reinterpret())

    public companion object : TypeCompanion<BroadwayRenderer> {
        override val type: GeneratedClassKGType<BroadwayRenderer> =
            GeneratedClassKGType(gsk_broadway_renderer_get_type()) { BroadwayRenderer(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }
    }
}
