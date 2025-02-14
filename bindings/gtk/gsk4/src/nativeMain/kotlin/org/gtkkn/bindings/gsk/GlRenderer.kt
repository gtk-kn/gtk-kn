// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gsk.annotations.GskVersion4_2
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskGLRenderer
import org.gtkkn.native.gsk.gsk_gl_renderer_get_type
import org.gtkkn.native.gsk.gsk_gl_renderer_new

/**
 * A GL based renderer.
 *
 * See [class@Gsk.Renderer].
 * @since 4.2
 */
@GskVersion4_2
public open class GlRenderer(public val gskGlRendererPointer: CPointer<GskGLRenderer>) :
    Renderer(gskGlRendererPointer.reinterpret()),
    KGTyped {
    init {
        Gsk
    }

    /**
     * Creates a new `GskRenderer` using the new OpenGL renderer.
     *
     * @return a new GL renderer
     * @since 4.2
     */
    public constructor() : this(gsk_gl_renderer_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<GlRenderer> {
        override val type: GeneratedClassKGType<GlRenderer> =
            GeneratedClassKGType(getTypeOrNull()!!) { GlRenderer(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of GLRenderer
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_gl_renderer_get_type()

        /**
         * Gets the GType of from the symbol `gsk_gl_renderer_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gsk_gl_renderer_get_type")
    }
}
