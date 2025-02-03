// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_14
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gdk.GdkDmabufTexture
import org.gtkkn.native.gdk.GdkPaintable
import org.gtkkn.native.gdk.gdk_dmabuf_texture_get_type
import org.gtkkn.native.gio.GIcon
import org.gtkkn.native.gio.GLoadableIcon
import org.gtkkn.native.gobject.GType

/**
 * A `GdkTexture` representing a DMA buffer.
 *
 * To create a `GdkDmabufTexture`, use the auxiliary
 * [class@Gdk.DmabufTextureBuilder] object.
 *
 * Dma-buf textures can only be created on Linux.
 * @since 4.14
 */
@GdkVersion4_14
public open class DmabufTexture(public val gdkDmabufTexturePointer: CPointer<GdkDmabufTexture>) :
    Texture(gdkDmabufTexturePointer.reinterpret()),
    KGTyped {
    init {
        Gdk
    }

    override val gdkPaintablePointer: CPointer<GdkPaintable>
        get() = handle.reinterpret()

    override val gioIconPointer: CPointer<GIcon>
        get() = handle.reinterpret()

    override val gioLoadableIconPointer: CPointer<GLoadableIcon>
        get() = handle.reinterpret()

    public companion object : TypeCompanion<DmabufTexture> {
        override val type: GeneratedClassKGType<DmabufTexture> =
            GeneratedClassKGType(getTypeOrNull()!!) { DmabufTexture(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of DmabufTexture
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_dmabuf_texture_get_type()

        /**
         * Gets the GType of from the symbol `gdk_dmabuf_texture_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gdk_dmabuf_texture_get_type")
    }
}
