// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GSocketConnectable
import org.gtkkn.native.gio.GUnixSocketAddress
import org.gtkkn.native.gio.g_unix_socket_address_abstract_names_supported
import org.gtkkn.native.gio.g_unix_socket_address_get_address_type
import org.gtkkn.native.gio.g_unix_socket_address_get_is_abstract
import org.gtkkn.native.gio.g_unix_socket_address_get_path
import org.gtkkn.native.gio.g_unix_socket_address_get_path_len
import org.gtkkn.native.gio.g_unix_socket_address_get_type
import org.gtkkn.native.gio.g_unix_socket_address_new
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.String

/**
 * Support for UNIX-domain (also known as local) sockets, corresponding to
 * `struct sockaddr_un`.
 *
 * UNIX domain sockets are generally visible in the filesystem.
 * However, some systems support abstract socket names which are not
 * visible in the filesystem and not affected by the filesystem
 * permissions, visibility, etc. Currently this is only supported
 * under Linux. If you attempt to use abstract sockets on other
 * systems, function calls may return `G_IO_ERROR_NOT_SUPPORTED`
 * errors. You can use [func@Gio.UnixSocketAddress.abstract_names_supported]
 * to see if abstract names are supported.
 *
 * Since GLib 2.72, `GUnixSocketAddress` is available on all platforms. It
 * requires underlying system support (such as Windows 10 with `AF_UNIX`) at
 * run time.
 *
 * Before GLib 2.72, `<gio/gunixsocketaddress.h>` belonged to the UNIX-specific
 * GIO interfaces, thus you had to use the `gio-unix-2.0.pc` pkg-config file
 * when using it. This is no longer necessary since GLib 2.72.
 *
 * ## Skipped during bindings generation
 *
 * - method `abstract`: Property has no getter nor setter
 * - method `path-as-array`: Property has no getter nor setter
 * - parameter `path`: Array parameter of type gchar is not supported
 * - parameter `path`: Array parameter of type gchar is not supported
 */
public open class UnixSocketAddress(public val gioUnixSocketAddressPointer: CPointer<GUnixSocketAddress>) :
    SocketAddress(gioUnixSocketAddressPointer.reinterpret()),
    KGTyped {
    init {
        Gio
    }

    override val gioSocketConnectablePointer: CPointer<GSocketConnectable>
        get() = handle.reinterpret()

    /**
     * The type of Unix socket address.
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val addressType: UnixSocketAddressType
        /**
         * Gets @address's type.
         *
         * @return a #GUnixSocketAddressType
         * @since 2.26
         */
        get() = g_unix_socket_address_get_address_type(gioUnixSocketAddressPointer).run {
            UnixSocketAddressType.fromNativeValue(this)
        }

    /**
     * Unix socket path.
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open val path: String
        /**
         * Gets @address's path, or for abstract sockets the "name".
         *
         * Guaranteed to be zero-terminated, but an abstract socket
         * may contain embedded zeros, and thus you should use
         * g_unix_socket_address_get_path_len() to get the true length
         * of this string.
         *
         * @return the path for @address
         * @since 2.22
         */
        get() = g_unix_socket_address_get_path(gioUnixSocketAddressPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Creates a new #GUnixSocketAddress for @path.
     *
     * To create abstract socket addresses, on systems that support that,
     * use g_unix_socket_address_new_abstract().
     *
     * @param path the socket path
     * @return a new #GUnixSocketAddress
     * @since 2.22
     */
    public constructor(path: String) : this(g_unix_socket_address_new(path)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated.
     *
     * Use g_unix_socket_address_get_address_type()
     * ---
     *
     * Tests if @address is abstract.
     *
     * @return true if the address is abstract, false otherwise
     * @since 2.22
     */
    @GioVersion2_22
    public open fun getIsAbstract(): Boolean =
        g_unix_socket_address_get_is_abstract(gioUnixSocketAddressPointer).asBoolean()

    /**
     * Gets the length of @address's path.
     *
     * For details, see g_unix_socket_address_get_path().
     *
     * @return the length of the path
     * @since 2.22
     */
    @GioVersion2_22
    public open fun getPathLen(): gsize = g_unix_socket_address_get_path_len(gioUnixSocketAddressPointer)

    public companion object : TypeCompanion<UnixSocketAddress> {
        override val type: GeneratedClassKGType<UnixSocketAddress> =
            GeneratedClassKGType(getTypeOrNull()!!) { UnixSocketAddress(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Checks if abstract UNIX domain socket names are supported.
         *
         * @return true if supported, false otherwise
         * @since 2.22
         */
        @GioVersion2_22
        public fun abstractNamesSupported(): Boolean = g_unix_socket_address_abstract_names_supported().asBoolean()

        /**
         * Get the GType of UnixSocketAddress
         *
         * @return the GType
         */
        public fun getType(): GType = g_unix_socket_address_get_type()

        /**
         * Gets the GType of from the symbol `g_unix_socket_address_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_unix_socket_address_get_type")
    }
}
