// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_18
import org.gtkkn.native.gio.GEmblemOrigin

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
    UNKNOWN(GEmblemOrigin.G_EMBLEM_ORIGIN_UNKNOWN),

    /**
     * Emblem adds device-specific information
     */
    DEVICE(GEmblemOrigin.G_EMBLEM_ORIGIN_DEVICE),

    /**
     * Emblem depicts live metadata, such as "readonly"
     */
    LIVEMETADATA(GEmblemOrigin.G_EMBLEM_ORIGIN_LIVEMETADATA),

    /**
     * Emblem comes from a user-defined tag, e.g. set by nautilus (in the future)
     */
    TAG(GEmblemOrigin.G_EMBLEM_ORIGIN_TAG),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GEmblemOrigin): EmblemOrigin =
            when (nativeValue) {
                GEmblemOrigin.G_EMBLEM_ORIGIN_UNKNOWN -> UNKNOWN
                GEmblemOrigin.G_EMBLEM_ORIGIN_DEVICE -> DEVICE
                GEmblemOrigin.G_EMBLEM_ORIGIN_LIVEMETADATA -> LIVEMETADATA
                GEmblemOrigin.G_EMBLEM_ORIGIN_TAG -> TAG
                else -> error("invalid nativeValue")
            }
    }
}
