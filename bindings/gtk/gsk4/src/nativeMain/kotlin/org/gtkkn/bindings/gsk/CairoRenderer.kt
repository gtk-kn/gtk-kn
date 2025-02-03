// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskCairoRenderer
import org.gtkkn.native.gsk.gsk_cairo_renderer_get_type
import org.gtkkn.native.gsk.gsk_cairo_renderer_new

/**
 * A GSK renderer that is using cairo.
 *
 * Since it is using cairo, this renderer cannot support
 * 3D transformations.
 */
public open class CairoRenderer(public val gskCairoRendererPointer: CPointer<GskCairoRenderer>) :
    Renderer(gskCairoRendererPointer.reinterpret()),
    KGTyped {
    init {
        Gsk
    }

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
    public constructor() : this(gsk_cairo_renderer_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<CairoRenderer> {
        override val type: GeneratedClassKGType<CairoRenderer> =
            GeneratedClassKGType(getTypeOrNull()!!) { CairoRenderer(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of CairoRenderer
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_cairo_renderer_get_type()

        /**
         * Gets the GType of from the symbol `gsk_cairo_renderer_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gsk_cairo_renderer_get_type")
    }
}
