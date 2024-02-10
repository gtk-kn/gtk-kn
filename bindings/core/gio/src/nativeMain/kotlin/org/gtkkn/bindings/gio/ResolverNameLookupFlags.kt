// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GResolverNameLookupFlags
import org.gtkkn.native.gio.G_RESOLVER_NAME_LOOKUP_FLAGS_DEFAULT
import org.gtkkn.native.gio.G_RESOLVER_NAME_LOOKUP_FLAGS_IPV4_ONLY
import org.gtkkn.native.gio.G_RESOLVER_NAME_LOOKUP_FLAGS_IPV6_ONLY

/**
 * Flags to modify lookup behavior.
 * @since 2.60
 */
public class ResolverNameLookupFlags(
    public val mask: GResolverNameLookupFlags,
) : Bitfield<ResolverNameLookupFlags> {
    override infix fun or(other: ResolverNameLookupFlags): ResolverNameLookupFlags =
        ResolverNameLookupFlags(mask or other.mask)

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
    }
}
