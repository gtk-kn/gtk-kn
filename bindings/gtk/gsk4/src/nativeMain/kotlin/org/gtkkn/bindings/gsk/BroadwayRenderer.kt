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
import org.gtkkn.native.gsk.GskBroadwayRenderer
import org.gtkkn.native.gsk.gsk_broadway_renderer_get_type
import org.gtkkn.native.gsk.gsk_broadway_renderer_new

public open class BroadwayRenderer(public val gskBroadwayRendererPointer: CPointer<GskBroadwayRenderer>) :
    Renderer(gskBroadwayRendererPointer.reinterpret()),
    KGTyped {
    init {
        Gsk
    }

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
    public constructor() : this(gsk_broadway_renderer_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<BroadwayRenderer> {
        override val type: GeneratedClassKGType<BroadwayRenderer> =
            GeneratedClassKGType(getTypeOrNull()!!) { BroadwayRenderer(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of BroadwayRenderer
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_broadway_renderer_get_type()

        /**
         * Gets the GType of from the symbol `gsk_broadway_renderer_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gsk_broadway_renderer_get_type")
    }
}
