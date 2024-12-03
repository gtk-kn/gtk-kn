// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GSliceConfig

public enum class SliceConfig(public val nativeValue: GSliceConfig) {
    ALWAYS_MALLOC(GSliceConfig.G_SLICE_CONFIG_ALWAYS_MALLOC),
    BYPASS_MAGAZINES(GSliceConfig.G_SLICE_CONFIG_BYPASS_MAGAZINES),
    WORKING_SET_MSECS(GSliceConfig.G_SLICE_CONFIG_WORKING_SET_MSECS),
    COLOR_INCREMENT(GSliceConfig.G_SLICE_CONFIG_COLOR_INCREMENT),
    CHUNK_SIZES(GSliceConfig.G_SLICE_CONFIG_CHUNK_SIZES),
    CONTENTION_COUNTER(GSliceConfig.G_SLICE_CONFIG_CONTENTION_COUNTER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GSliceConfig): SliceConfig = when (nativeValue) {
            GSliceConfig.G_SLICE_CONFIG_ALWAYS_MALLOC -> ALWAYS_MALLOC
            GSliceConfig.G_SLICE_CONFIG_BYPASS_MAGAZINES -> BYPASS_MAGAZINES
            GSliceConfig.G_SLICE_CONFIG_WORKING_SET_MSECS -> WORKING_SET_MSECS
            GSliceConfig.G_SLICE_CONFIG_COLOR_INCREMENT -> COLOR_INCREMENT
            GSliceConfig.G_SLICE_CONFIG_CHUNK_SIZES -> CHUNK_SIZES
            GSliceConfig.G_SLICE_CONFIG_CONTENTION_COUNTER -> CONTENTION_COUNTER
            else -> error("invalid nativeValue")
        }
    }
}
