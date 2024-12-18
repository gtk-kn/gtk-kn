// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskGLRenderer
import org.gtkkn.native.gsk.gsk_gl_renderer_get_type
import org.gtkkn.native.gsk.gsk_gl_renderer_new

public open class GlRenderer(pointer: CPointer<GskGLRenderer>) :
    Renderer(pointer.reinterpret()),
    KGTyped {
    public val gskGLRendererPointer: CPointer<GskGLRenderer>
        get() = gPointer.reinterpret()

    /**
     * Creates a new `GskRenderer` using the new OpenGL renderer.
     *
     * @return a new GL renderer
     * @since 4.2
     */
    public constructor() : this(gsk_gl_renderer_new()!!.reinterpret())

    public companion object : TypeCompanion<GlRenderer> {
        override val type: GeneratedClassKGType<GlRenderer> =
            GeneratedClassKGType(gsk_gl_renderer_get_type()) { GlRenderer(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of GLRenderer
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_gl_renderer_get_type()
    }
}
