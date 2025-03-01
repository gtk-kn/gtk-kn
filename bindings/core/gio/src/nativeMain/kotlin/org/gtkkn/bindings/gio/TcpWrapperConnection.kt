// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GTcpWrapperConnection
import org.gtkkn.native.gio.g_tcp_wrapper_connection_get_base_io_stream
import org.gtkkn.native.gio.g_tcp_wrapper_connection_get_type
import org.gtkkn.native.gio.g_tcp_wrapper_connection_new
import org.gtkkn.native.gobject.GType

/**
 * A `GTcpWrapperConnection` can be used to wrap a [class@Gio.IOStream] that is
 * based on a [class@Gio.Socket], but which is not actually a
 * [class@Gio.SocketConnection]. This is used by [class@Gio.SocketClient] so
 * that it can always return a [class@Gio.SocketConnection], even when the
 * connection it has actually created is not directly a
 * [class@Gio.SocketConnection].
 * @since 2.28
 */
@GioVersion2_28
public open class TcpWrapperConnection(public val gioTcpWrapperConnectionPointer: CPointer<GTcpWrapperConnection>) :
    TcpConnection(gioTcpWrapperConnectionPointer.reinterpret()),
    KGTyped {
    init {
        Gio
    }

    /**
     * The wrapped [class@Gio.IOStream].
     *
     * @since 2.28
     */
    @GioVersion2_28
    public open val baseIoStream: IoStream
        /**
         * Gets @conn's base #GIOStream
         *
         * @return @conn's base #GIOStream
         */
        get() = g_tcp_wrapper_connection_get_base_io_stream(gioTcpWrapperConnectionPointer)!!.run {
            InstanceCache.get(this, true) { IoStream.IoStreamImpl(reinterpret()) }!!
        }

    /**
     * Wraps @base_io_stream and @socket together as a #GSocketConnection.
     *
     * @param baseIoStream the #GIOStream to wrap
     * @param socket the #GSocket associated with @base_io_stream
     * @return the new #GSocketConnection.
     * @since 2.28
     */
    public constructor(
        baseIoStream: IoStream,
        socket: Socket,
    ) : this(g_tcp_wrapper_connection_new(baseIoStream.gioIoStreamPointer, socket.gioSocketPointer)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<TcpWrapperConnection> {
        override val type: GeneratedClassKGType<TcpWrapperConnection> =
            GeneratedClassKGType(getTypeOrNull()!!) { TcpWrapperConnection(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of TcpWrapperConnection
         *
         * @return the GType
         */
        public fun getType(): GType = g_tcp_wrapper_connection_get_type()

        /**
         * Gets the GType of from the symbol `g_tcp_wrapper_connection_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_tcp_wrapper_connection_get_type")
    }
}
