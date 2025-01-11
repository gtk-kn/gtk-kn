// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
            IoStream.IoStreamImpl(this)
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
    ) : this(g_tcp_wrapper_connection_new(baseIoStream.gioIoStreamPointer, socket.gioSocketPointer)!!.reinterpret())

    public companion object : TypeCompanion<TcpWrapperConnection> {
        override val type: GeneratedClassKGType<TcpWrapperConnection> =
            GeneratedClassKGType(g_tcp_wrapper_connection_get_type()) { TcpWrapperConnection(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of TcpWrapperConnection
         *
         * @return the GType
         */
        public fun getType(): GType = g_tcp_wrapper_connection_get_type()
    }
}
