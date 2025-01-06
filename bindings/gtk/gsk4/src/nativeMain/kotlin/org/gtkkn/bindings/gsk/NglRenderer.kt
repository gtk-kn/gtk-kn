// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskRenderer
import org.gtkkn.native.gsk.gsk_ngl_renderer_get_type
import org.gtkkn.native.gsk.gsk_ngl_renderer_new

public open class NglRenderer(pointer: CPointer<GskRenderer>) :
    Renderer(pointer.reinterpret()),
    KGTyped {
    public val gskNglRendererPointer: CPointer<GskRenderer>
        get() = gPointer.reinterpret()

    public constructor() : this(gsk_ngl_renderer_new()!!.reinterpret())

    public companion object : TypeCompanion<NglRenderer> {
        override val type: GeneratedClassKGType<NglRenderer> =
            GeneratedClassKGType(gsk_ngl_renderer_get_type()) { NglRenderer(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of NglRenderer
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_ngl_renderer_get_type()
    }
}
