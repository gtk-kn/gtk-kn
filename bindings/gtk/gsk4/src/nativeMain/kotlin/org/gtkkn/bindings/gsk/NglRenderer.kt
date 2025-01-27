// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskRenderer
import org.gtkkn.native.gsk.gsk_ngl_renderer_get_type
import org.gtkkn.native.gsk.gsk_ngl_renderer_new

public open class NglRenderer(public val gskNglRendererPointer: CPointer<GskRenderer>) :
    Renderer(gskNglRendererPointer.reinterpret()),
    KGTyped {
    public constructor() : this(gsk_ngl_renderer_new()!!.reinterpret())

    public companion object : TypeCompanion<NglRenderer> {
        override val type: GeneratedClassKGType<NglRenderer> =
            GeneratedClassKGType(getTypeOrNull("gsk_ngl_renderer_get_type")!!) { NglRenderer(it.reinterpret()) }

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
