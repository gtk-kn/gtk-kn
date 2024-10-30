// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GTcpWrapperConnection
import org.gtkkn.native.gio.g_tcp_wrapper_connection_get_base_io_stream
import org.gtkkn.native.gio.g_tcp_wrapper_connection_get_type
import org.gtkkn.native.gio.g_tcp_wrapper_connection_new

/**
 * A `GTcpWrapperConnection` can be used to wrap a [class@Gio.IOStream] that is
 * based on a [class@Gio.Socket], but which is not actually a
 * [class@Gio.SocketConnection]. This is used by [class@Gio.SocketClient] so
 * that it can always return a [class@Gio.SocketConnection], even when the
 * connection it has actually created is not directly a
 * [class@Gio.SocketConnection].
 * @since 2.28
 */
public open class TcpWrapperConnection(
    pointer: CPointer<GTcpWrapperConnection>,
) : TcpConnection(pointer.reinterpret()),
    KGTyped {
    public val gioTcpWrapperConnectionPointer: CPointer<GTcpWrapperConnection>
        get() = gPointer.reinterpret()

    /**
     * The wrapped [class@Gio.IOStream].
     *
     * @since 2.28
     */
    public open val baseIoStream: IOStream
        /**
         * Gets @conn's base #GIOStream
         *
         * @return @conn's base #GIOStream
         */
        get() =
            g_tcp_wrapper_connection_get_base_io_stream(gioTcpWrapperConnectionPointer.reinterpret())!!.run {
                IOStream(reinterpret())
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
        baseIoStream: IOStream,
        socket: Socket,
    ) : this(
        g_tcp_wrapper_connection_new(
            baseIoStream.gioIOStreamPointer.reinterpret(),
            socket.gioSocketPointer.reinterpret()
        )!!.reinterpret()
    )

    /**
     * Gets @conn's base #GIOStream
     *
     * @return @conn's base #GIOStream
     */
    public open fun getBaseIoStream(): IOStream =
        g_tcp_wrapper_connection_get_base_io_stream(gioTcpWrapperConnectionPointer.reinterpret())!!.run {
            IOStream(reinterpret())
        }

    public companion object : TypeCompanion<TcpWrapperConnection> {
        override val type: GeneratedClassKGType<TcpWrapperConnection> =
            GeneratedClassKGType(g_tcp_wrapper_connection_get_type()) { TcpWrapperConnection(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }
    }
}
