// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SOUP_SERVER_LISTEN_HTTPS
import org.gtkkn.native.soup.SOUP_SERVER_LISTEN_IPV4_ONLY
import org.gtkkn.native.soup.SOUP_SERVER_LISTEN_IPV6_ONLY
import org.gtkkn.native.soup.SoupServerListenOptions
import org.gtkkn.native.soup.soup_server_listen_options_get_type

/**
 * Options to pass to [method@Server.listen], etc.
 *
 * %SOUP_SERVER_LISTEN_IPV4_ONLY and %SOUP_SERVER_LISTEN_IPV6_ONLY
 * only make sense with [method@Server.listen_all] and
 * [method@Server.listen_local], not plain [method@Server.listen] (which
 * simply listens on whatever kind of socket you give it). And you
 * cannot specify both of them in a single call.
 */
public class ServerListenOptions(public val mask: SoupServerListenOptions) : Bitfield<ServerListenOptions> {
    override infix fun or(other: ServerListenOptions): ServerListenOptions = ServerListenOptions(mask or other.mask)

    public companion object {
        /**
         * Listen for https connections rather
         *   than plain http.
         */
        public val HTTPS: ServerListenOptions = ServerListenOptions(SOUP_SERVER_LISTEN_HTTPS)

        /**
         * Only listen on IPv4 interfaces.
         */
        public val IPV4_ONLY: ServerListenOptions =
            ServerListenOptions(SOUP_SERVER_LISTEN_IPV4_ONLY)

        /**
         * Only listen on IPv6 interfaces.
         */
        public val IPV6_ONLY: ServerListenOptions =
            ServerListenOptions(SOUP_SERVER_LISTEN_IPV6_ONLY)

        /**
         * Get the GType of ServerListenOptions
         *
         * @return the GType
         */
        public fun getType(): GType = soup_server_listen_options_get_type()
    }
}
