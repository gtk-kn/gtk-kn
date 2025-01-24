// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_60
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GResolverNameLookupFlags
import org.gtkkn.native.gio.G_RESOLVER_NAME_LOOKUP_FLAGS_DEFAULT
import org.gtkkn.native.gio.G_RESOLVER_NAME_LOOKUP_FLAGS_IPV4_ONLY
import org.gtkkn.native.gio.G_RESOLVER_NAME_LOOKUP_FLAGS_IPV6_ONLY
import org.gtkkn.native.gio.g_resolver_name_lookup_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags to modify lookup behavior.
 * @since 2.60
 */
public class ResolverNameLookupFlags(public val mask: GResolverNameLookupFlags) : Bitfield<ResolverNameLookupFlags> {
    override infix fun or(other: ResolverNameLookupFlags): ResolverNameLookupFlags = ResolverNameLookupFlags(
        mask or other.mask
    )

    @GioVersion2_60
    public companion object {
        /**
         * default behavior (same as g_resolver_lookup_by_name())
         */
        public val DEFAULT: ResolverNameLookupFlags =
            ResolverNameLookupFlags(G_RESOLVER_NAME_LOOKUP_FLAGS_DEFAULT)

        /**
         * only resolve ipv4 addresses
         */
        public val IPV4_ONLY: ResolverNameLookupFlags =
            ResolverNameLookupFlags(G_RESOLVER_NAME_LOOKUP_FLAGS_IPV4_ONLY)

        /**
         * only resolve ipv6 addresses
         */
        public val IPV6_ONLY: ResolverNameLookupFlags =
            ResolverNameLookupFlags(G_RESOLVER_NAME_LOOKUP_FLAGS_IPV6_ONLY)

        /**
         * Get the GType of ResolverNameLookupFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_resolver_name_lookup_flags_get_type()
    }
}
