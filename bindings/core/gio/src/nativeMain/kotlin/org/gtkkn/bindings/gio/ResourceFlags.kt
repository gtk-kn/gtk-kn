// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GResourceFlags
import org.gtkkn.native.gio.G_RESOURCE_FLAGS_COMPRESSED
import org.gtkkn.native.gio.G_RESOURCE_FLAGS_NONE

/**
 * GResourceFlags give information about a particular file inside a resource
 * bundle.
 * @since 2.32
 */
public class ResourceFlags(
    public val mask: GResourceFlags,
) : Bitfield<ResourceFlags> {
    override infix fun or(other: ResourceFlags): ResourceFlags = ResourceFlags(mask or other.mask)

    @GioVersion2_32
    public companion object {
        /**
         * No flags set.
         */
        public val NONE: ResourceFlags = ResourceFlags(G_RESOURCE_FLAGS_NONE)

        /**
         * The file is compressed.
         */
        public val COMPRESSED: ResourceFlags = ResourceFlags(G_RESOURCE_FLAGS_COMPRESSED)
    }
}
