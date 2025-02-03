// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gdk.GdkPixbufAnimation
import org.gtkkn.native.gdk.gdk_pixbuf_non_anim_get_type
import org.gtkkn.native.gdk.gdk_pixbuf_non_anim_new
import org.gtkkn.native.gobject.GType

public open class PixbufNonAnim(public val gdkPixbufNonAnimPointer: CPointer<GdkPixbufAnimation>) :
    PixbufAnimation(gdkPixbufNonAnimPointer.reinterpret()),
    KGTyped {
    init {
        GdkPixbuf
    }

    public constructor(pixbuf: Pixbuf) : this(gdk_pixbuf_non_anim_new(pixbuf.gdkPixbufPointer)!!) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<PixbufNonAnim> {
        override val type: GeneratedClassKGType<PixbufNonAnim> =
            GeneratedClassKGType(getTypeOrNull()!!) { PixbufNonAnim(it.reinterpret()) }

        init {
            GdkPixbufTypeProvider.register()
        }

        /**
         * Get the GType of PixbufNonAnim
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_pixbuf_non_anim_get_type()

        /**
         * Gets the GType of from the symbol `gdk_pixbuf_non_anim_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gdk_pixbuf_non_anim_get_type")
    }
}
