// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GSliceConfig
import org.gtkkn.native.glib.GSliceConfig.G_SLICE_CONFIG_ALWAYS_MALLOC
import org.gtkkn.native.glib.GSliceConfig.G_SLICE_CONFIG_BYPASS_MAGAZINES
import org.gtkkn.native.glib.GSliceConfig.G_SLICE_CONFIG_CHUNK_SIZES
import org.gtkkn.native.glib.GSliceConfig.G_SLICE_CONFIG_COLOR_INCREMENT
import org.gtkkn.native.glib.GSliceConfig.G_SLICE_CONFIG_CONTENTION_COUNTER
import org.gtkkn.native.glib.GSliceConfig.G_SLICE_CONFIG_WORKING_SET_MSECS

public enum class SliceConfig(
    public val nativeValue: GSliceConfig,
) {
    ALWAYS_MALLOC(G_SLICE_CONFIG_ALWAYS_MALLOC),
    BYPASS_MAGAZINES(G_SLICE_CONFIG_BYPASS_MAGAZINES),
    WORKING_SET_MSECS(G_SLICE_CONFIG_WORKING_SET_MSECS),
    COLOR_INCREMENT(G_SLICE_CONFIG_COLOR_INCREMENT),
    CHUNK_SIZES(G_SLICE_CONFIG_CHUNK_SIZES),
    CONTENTION_COUNTER(G_SLICE_CONFIG_CONTENTION_COUNTER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GSliceConfig): SliceConfig =
            when (nativeValue) {
                G_SLICE_CONFIG_ALWAYS_MALLOC -> ALWAYS_MALLOC
                G_SLICE_CONFIG_BYPASS_MAGAZINES -> BYPASS_MAGAZINES
                G_SLICE_CONFIG_WORKING_SET_MSECS -> WORKING_SET_MSECS
                G_SLICE_CONFIG_COLOR_INCREMENT -> COLOR_INCREMENT
                G_SLICE_CONFIG_CHUNK_SIZES -> CHUNK_SIZES
                G_SLICE_CONFIG_CONTENTION_COUNTER -> CONTENTION_COUNTER
                else -> error("invalid nativeValue")
            }
    }
}
