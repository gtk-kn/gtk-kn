// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GResourceLookupFlags
import org.gtkkn.native.gio.G_RESOURCE_LOOKUP_FLAGS_NONE

/**
 * GResourceLookupFlags determine how resource path lookups are handled.
 * @since 2.32
 */
public class ResourceLookupFlags(
    public val mask: GResourceLookupFlags,
) : Bitfield<ResourceLookupFlags> {
    override infix fun or(other: ResourceLookupFlags): ResourceLookupFlags = ResourceLookupFlags(mask or other.mask)

    @GioVersion2_32
    public companion object {
        /**
         * No flags set.
         */
        public val NONE: ResourceLookupFlags = ResourceLookupFlags(G_RESOURCE_LOOKUP_FLAGS_NONE)
    }
}
