// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GTcpConnection
import org.gtkkn.native.gio.g_tcp_connection_get_graceful_disconnect
import org.gtkkn.native.gio.g_tcp_connection_get_type
import org.gtkkn.native.gio.g_tcp_connection_set_graceful_disconnect
import kotlin.Boolean
import kotlin.Unit

/**
 * This is the subclass of [class@Gio.SocketConnection] that is created
 * for TCP/IP sockets.
 * @since 2.22
 */
public open class TcpConnection(
    pointer: CPointer<GTcpConnection>,
) : SocketConnection(pointer.reinterpret()), KGTyped {
    public val gioTcpConnectionPointer: CPointer<GTcpConnection>
        get() = gPointer.reinterpret()

    /**
     * Whether [method@Gio.IOStream.close] does a graceful disconnect.
     *
     * @since 2.22
     */
    public open var gracefulDisconnect: Boolean
        /**
         * Checks if graceful disconnects are used. See
         * g_tcp_connection_set_graceful_disconnect().
         *
         * @return true if graceful disconnect is used on close, false otherwise
         * @since 2.22
         */
        get() =
            g_tcp_connection_get_graceful_disconnect(gioTcpConnectionPointer.reinterpret()).asBoolean()

        /**
         * This enables graceful disconnects on close. A graceful disconnect
         * means that we signal the receiving end that the connection is terminated
         * and wait for it to close the connection before closing the connection.
         *
         * A graceful disconnect means that we can be sure that we successfully sent
         * all the outstanding data to the other end, or get an error reported.
         * However, it also means we have to wait for all the data to reach the
         * other side and for it to acknowledge this by closing the socket, which may
         * take a while. For this reason it is disabled by default.
         *
         * @param gracefulDisconnect Whether to do graceful disconnects or not
         * @since 2.22
         */
        set(gracefulDisconnect) =
            g_tcp_connection_set_graceful_disconnect(
                gioTcpConnectionPointer.reinterpret(),
                gracefulDisconnect.asGBoolean()
            )

    /**
     * Checks if graceful disconnects are used. See
     * g_tcp_connection_set_graceful_disconnect().
     *
     * @return true if graceful disconnect is used on close, false otherwise
     * @since 2.22
     */
    public open fun getGracefulDisconnect(): Boolean =
        g_tcp_connection_get_graceful_disconnect(gioTcpConnectionPointer.reinterpret()).asBoolean()

    /**
     * This enables graceful disconnects on close. A graceful disconnect
     * means that we signal the receiving end that the connection is terminated
     * and wait for it to close the connection before closing the connection.
     *
     * A graceful disconnect means that we can be sure that we successfully sent
     * all the outstanding data to the other end, or get an error reported.
     * However, it also means we have to wait for all the data to reach the
     * other side and for it to acknowledge this by closing the socket, which may
     * take a while. For this reason it is disabled by default.
     *
     * @param gracefulDisconnect Whether to do graceful disconnects or not
     * @since 2.22
     */
    public open fun setGracefulDisconnect(gracefulDisconnect: Boolean): Unit =
        g_tcp_connection_set_graceful_disconnect(
            gioTcpConnectionPointer.reinterpret(),
            gracefulDisconnect.asGBoolean()
        )

    public companion object : TypeCompanion<TcpConnection> {
        override val type: GeneratedClassKGType<TcpConnection> =
            GeneratedClassKGType(g_tcp_connection_get_type()) {
                TcpConnection(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }
    }
}
