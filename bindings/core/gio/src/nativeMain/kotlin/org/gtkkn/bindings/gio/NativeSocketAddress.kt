// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_46
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GNativeSocketAddress
import org.gtkkn.native.gio.GSocketConnectable
import org.gtkkn.native.gio.g_native_socket_address_get_type
import org.gtkkn.native.gio.g_native_socket_address_new
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.gobject.GType

/**
 * A socket address of some unknown native type.
 *
 * This corresponds to a general `struct sockaddr` of a type not otherwise
 * handled by GLib.
 * @since 2.46
 */
@GioVersion2_46
public open class NativeSocketAddress(public val gioNativeSocketAddressPointer: CPointer<GNativeSocketAddress>) :
    SocketAddress(gioNativeSocketAddressPointer.reinterpret()),
    KGTyped {
    init {
        Gio
    }

    override val gioSocketConnectablePointer: CPointer<GSocketConnectable>
        get() = handle.reinterpret()

    /**
     * Creates a new #GNativeSocketAddress for @native and @len.
     *
     * @param native a native address object
     * @param len the length of @native, in bytes
     * @return a new #GNativeSocketAddress
     * @since 2.46
     */
    public constructor(
        native: gpointer? = null,
        len: gsize,
    ) : this(g_native_socket_address_new(native, len)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<NativeSocketAddress> {
        override val type: GeneratedClassKGType<NativeSocketAddress> =
            GeneratedClassKGType(getTypeOrNull()!!) { NativeSocketAddress(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of NativeSocketAddress
         *
         * @return the GType
         */
        public fun getType(): GType = g_native_socket_address_get_type()

        /**
         * Gets the GType of from the symbol `g_native_socket_address_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_native_socket_address_get_type")
    }
}
