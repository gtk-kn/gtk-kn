// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.bindings.gio.annotations.GioVersion2_48
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GSocketConnectable
import org.gtkkn.native.gio.g_socket_connectable_enumerate
import org.gtkkn.native.gio.g_socket_connectable_get_type
import org.gtkkn.native.gio.g_socket_connectable_proxy_enumerate
import org.gtkkn.native.gio.g_socket_connectable_to_string
import org.gtkkn.native.gobject.GType
import kotlin.String

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
 */
public interface SocketConnectable :
    Proxy,
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
        g_socket_connectable_enumerate(gioSocketConnectablePointer)!!.run {
            InstanceCache.get(this, true) { SocketAddressEnumerator.SocketAddressEnumeratorImpl(reinterpret()) }!!
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
        g_socket_connectable_proxy_enumerate(gioSocketConnectablePointer)!!.run {
            InstanceCache.get(this, true) { SocketAddressEnumerator.SocketAddressEnumeratorImpl(reinterpret()) }!!
        }

    /**
     * Format a #GSocketConnectable as a string. This is a human-readable format for
     * use in debugging output, and is not a stable serialization format. It is not
     * suitable for use in user interfaces as it exposes too much information for a
     * user.
     *
     * If the #GSocketConnectable implementation does not support string formatting,
     * the implementation’s type name will be returned as a fallback.
     *
     * @return the formatted string
     * @since 2.48
     */
    @GioVersion2_48
    public fun toStringSocketConnectable(): String =
        g_socket_connectable_to_string(gioSocketConnectablePointer)?.toKString() ?: error("Expected not null string")

    /**
     * The SocketConnectableImpl type represents a native instance of the SocketConnectable interface.
     *
     * @constructor Creates a new instance of SocketConnectable for the provided [CPointer].
     */
    public class SocketConnectableImpl(gioSocketConnectablePointer: CPointer<GSocketConnectable>) :
        Object(gioSocketConnectablePointer.reinterpret()),
        SocketConnectable {
        init {
            Gio
        }

        override val gioSocketConnectablePointer: CPointer<GSocketConnectable> =
            gioSocketConnectablePointer
    }

    public companion object : TypeCompanion<SocketConnectable> {
        override val type: GeneratedInterfaceKGType<SocketConnectable> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { SocketConnectableImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of SocketConnectable
         *
         * @return the GType
         */
        public fun getType(): GType = g_socket_connectable_get_type()

        /**
         * Gets the GType of from the symbol `g_socket_connectable_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_socket_connectable_get_type")
    }
}
