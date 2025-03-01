// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gdk.GdkMemoryTexture
import org.gtkkn.native.gdk.GdkPaintable
import org.gtkkn.native.gdk.gdk_memory_texture_get_type
import org.gtkkn.native.gdk.gdk_memory_texture_new
import org.gtkkn.native.gio.GIcon
import org.gtkkn.native.gio.GLoadableIcon
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.gobject.GType

/**
 * A `GdkTexture` representing image data in memory.
 */
public open class MemoryTexture(public val gdkMemoryTexturePointer: CPointer<GdkMemoryTexture>) :
    Texture(gdkMemoryTexturePointer.reinterpret()),
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

    /**
     * Creates a new texture for a blob of image data.
     *
     * The `GBytes` must contain @stride × @height pixels
     * in the given format.
     *
     * @param width the width of the texture
     * @param height the height of the texture
     * @param format the format of the data
     * @param bytes the `GBytes` containing the pixel data
     * @param stride rowstride for the data
     * @return A newly-created `GdkTexture`
     */
    public constructor(
        width: gint,
        height: gint,
        format: MemoryFormat,
        bytes: Bytes,
        stride: gsize,
    ) : this(
        gdk_memory_texture_new(width, height, format.nativeValue, bytes.glibBytesPointer, stride)!!.reinterpret()
    ) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<MemoryTexture> {
        override val type: GeneratedClassKGType<MemoryTexture> =
            GeneratedClassKGType(getTypeOrNull()!!) { MemoryTexture(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of MemoryTexture
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_memory_texture_get_type()

        /**
         * Gets the GType of from the symbol `gdk_memory_texture_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gdk_memory_texture_get_type")
    }
}
