// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkPixbufAnimationIter
import org.gtkkn.native.gdk.gdk_pixbuf_simple_anim_iter_get_type
import org.gtkkn.native.gobject.GType

public open class PixbufSimpleAnimIter(public val gdkPixbufSimpleAnimIterPointer: CPointer<GdkPixbufAnimationIter>) :
    PixbufAnimationIter(gdkPixbufSimpleAnimIterPointer.reinterpret()),
    KGTyped {
    public companion object : TypeCompanion<PixbufSimpleAnimIter> {
        override val type: GeneratedClassKGType<PixbufSimpleAnimIter> =
            GeneratedClassKGType(gdk_pixbuf_simple_anim_iter_get_type()) { PixbufSimpleAnimIter(it.reinterpret()) }

        init {
            GdkpixbufTypeProvider.register()
        }

        /**
         * Get the GType of PixbufSimpleAnimIter
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_pixbuf_simple_anim_iter_get_type()
    }
}
