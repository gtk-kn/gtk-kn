// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GSocketConnectable
import org.gtkkn.native.gio.g_socket_connectable_enumerate
import org.gtkkn.native.gio.g_socket_connectable_get_type
import org.gtkkn.native.gio.g_socket_connectable_proxy_enumerate

/**
 * Objects that describe one or more potential socket endpoints
 * implement `GSocketConnectable`. Callers can then use
 * [method@Gio.SocketConnectable.enumerate] to get a
 * [class@Gio.SocketAddressEnumerator] to try out each socket address in turn
 * until one succeeds, as shown in the sample code below.
 *
 * ```c
 * MyConnectionType *
 * connect_to_host (const char    *hostname,
 *                  guint16        port,
 *                  GCancellable  *cancellable,
 *                  GError       **error)
 * {
 *   MyConnection *conn = NULL;
 *   GSocketConnectable *addr;
 *   GSocketAddressEnumerator *enumerator;
 *   GSocketAddress *sockaddr;
 *   GError *conn_error = NULL;
 *
 *   addr = g_network_address_new (hostname, port);
 *   enumerator = g_socket_connectable_enumerate (addr);
 *   g_object_unref (addr);
 *
 *   // Try each sockaddr until we succeed. Record the first connection error,
 *   // but not any further ones (since they'll probably be basically the same
 *   // as the first).
 *   while (!conn && (sockaddr = g_socket_address_enumerator_next (enumerator, cancellable, error))
 *     {
 *       conn = connect_to_sockaddr (sockaddr, conn_error ? NULL : &conn_error);
 *       g_object_unref (sockaddr);
 *     }
 *   g_object_unref (enumerator);
 *
 *   if (conn)
 *     {
 *       if (conn_error)
 *         {
 *           // We couldn't connect to the first address, but we succeeded
 *           // in connecting to a later address.
 *           g_error_free (conn_error);
 *         }
 *       return conn;
 *     }
 *   else if (error)
 *     {
 *       /// Either initial lookup failed, or else the caller cancelled us.
 *       if (conn_error)
 *         g_error_free (conn_error);
 *       return NULL;
 *     }
 *   else
 *     {
 *       g_error_propagate (error, conn_error);
 *       return NULL;
 *     }
 * }
 * ```
 *
 * ## Skipped during bindings generation
 *
 * - method `to_string`: C function g_socket_connectable_to_string is ignored
 */
public interface SocketConnectable :
    Interface,
    KGTyped {
    public val gioSocketConnectablePointer: CPointer<GSocketConnectable>

    /**
     * Creates a #GSocketAddressEnumerator for @connectable.
     *
     * @return a new #GSocketAddressEnumerator.
     * @since 2.22
     */
    @GioVersion2_22
    public fun enumerate(): SocketAddressEnumerator =
        g_socket_connectable_enumerate(gioSocketConnectablePointer.reinterpret())!!.run {
            SocketAddressEnumerator(reinterpret())
        }

    /**
     * Creates a #GSocketAddressEnumerator for @connectable that will
     * return a #GProxyAddress for each of its addresses that you must connect
     * to via a proxy.
     *
     * If @connectable does not implement
     * g_socket_connectable_proxy_enumerate(), this will fall back to
     * calling g_socket_connectable_enumerate().
     *
     * @return a new #GSocketAddressEnumerator.
     * @since 2.26
     */
    @GioVersion2_26
    public fun proxyEnumerate(): SocketAddressEnumerator =
        g_socket_connectable_proxy_enumerate(gioSocketConnectablePointer.reinterpret())!!.run {
            SocketAddressEnumerator(reinterpret())
        }

    private data class Wrapper(
        private val pointer: CPointer<GSocketConnectable>,
    ) : SocketConnectable {
        override val gioSocketConnectablePointer: CPointer<GSocketConnectable> = pointer
    }

    public companion object : TypeCompanion<SocketConnectable> {
        override val type: GeneratedInterfaceKGType<SocketConnectable> =
            GeneratedInterfaceKGType(g_socket_connectable_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GSocketConnectable>): SocketConnectable = Wrapper(pointer)
    }
}
