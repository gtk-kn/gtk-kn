// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_18
import org.gtkkn.native.gio.GEmblemOrigin
import org.gtkkn.native.gio.GEmblemOrigin.G_EMBLEM_ORIGIN_DEVICE
import org.gtkkn.native.gio.GEmblemOrigin.G_EMBLEM_ORIGIN_LIVEMETADATA
import org.gtkkn.native.gio.GEmblemOrigin.G_EMBLEM_ORIGIN_TAG
import org.gtkkn.native.gio.GEmblemOrigin.G_EMBLEM_ORIGIN_UNKNOWN

/**
 * GEmblemOrigin is used to add information about the origin of the emblem
 * to #GEmblem.
 * @since 2.18
 */
@GioVersion2_18
public enum class EmblemOrigin(
    public val nativeValue: GEmblemOrigin,
) {
    /**
     * Emblem of unknown origin
     */
    UNKNOWN(G_EMBLEM_ORIGIN_UNKNOWN),

    /**
     * Emblem adds device-specific information
     */
    DEVICE(G_EMBLEM_ORIGIN_DEVICE),

    /**
     * Emblem depicts live metadata, such as "readonly"
     */
    LIVEMETADATA(G_EMBLEM_ORIGIN_LIVEMETADATA),

    /**
     * Emblem comes from a user-defined tag, e.g. set by nautilus (in the future)
     */
    TAG(G_EMBLEM_ORIGIN_TAG),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GEmblemOrigin): EmblemOrigin =
            when (nativeValue) {
                G_EMBLEM_ORIGIN_UNKNOWN -> UNKNOWN
                G_EMBLEM_ORIGIN_DEVICE -> DEVICE
                G_EMBLEM_ORIGIN_LIVEMETADATA -> LIVEMETADATA
                G_EMBLEM_ORIGIN_TAG -> TAG
                else -> error("invalid nativeValue")
            }
    }
}
