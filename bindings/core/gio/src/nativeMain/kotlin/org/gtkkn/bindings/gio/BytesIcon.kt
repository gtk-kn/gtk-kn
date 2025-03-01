// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_38
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GBytesIcon
import org.gtkkn.native.gio.GIcon
import org.gtkkn.native.gio.GLoadableIcon
import org.gtkkn.native.gio.g_bytes_icon_get_bytes
import org.gtkkn.native.gio.g_bytes_icon_get_type
import org.gtkkn.native.gio.g_bytes_icon_new
import org.gtkkn.native.gobject.GType

/**
 * `GBytesIcon` specifies an image held in memory in a common format (usually
 * PNG) to be used as icon.
 * @since 2.38
 */
@GioVersion2_38
public open class BytesIcon(public val gioBytesIconPointer: CPointer<GBytesIcon>) :
    Object(gioBytesIconPointer.reinterpret()),
    Icon,
    LoadableIcon,
    KGTyped {
    init {
        Gio
    }

    override val gioIconPointer: CPointer<GIcon>
        get() = handle.reinterpret()

    override val gioLoadableIconPointer: CPointer<GLoadableIcon>
        get() = handle.reinterpret()

    /**
     * The bytes containing the icon.
     */
    public open val bytes: Bytes
        /**
         * Gets the #GBytes associated with the given @icon.
         *
         * @return a #GBytes.
         * @since 2.38
         */
        get() = g_bytes_icon_get_bytes(gioBytesIconPointer)!!.run {
            Bytes(this)
        }

    /**
     * Creates a new icon for a bytes.
     *
     * This cannot fail, but loading and interpreting the bytes may fail later on
     * (for example, if g_loadable_icon_load() is called) if the image is invalid.
     *
     * @param bytes a #GBytes.
     * @return a #GIcon for the given
     *   @bytes.
     * @since 2.38
     */
    public constructor(bytes: Bytes) : this(g_bytes_icon_new(bytes.glibBytesPointer)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<BytesIcon> {
        override val type: GeneratedClassKGType<BytesIcon> =
            GeneratedClassKGType(getTypeOrNull()!!) { BytesIcon(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of BytesIcon
         *
         * @return the GType
         */
        public fun getType(): GType = g_bytes_icon_get_type()

        /**
         * Gets the GType of from the symbol `g_bytes_icon_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_bytes_icon_get_type")
    }
}
