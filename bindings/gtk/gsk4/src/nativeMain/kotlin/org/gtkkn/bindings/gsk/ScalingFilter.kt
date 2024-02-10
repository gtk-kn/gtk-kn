// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import org.gtkkn.native.gsk.GskScalingFilter
import org.gtkkn.native.gsk.GskScalingFilter.GSK_SCALING_FILTER_LINEAR
import org.gtkkn.native.gsk.GskScalingFilter.GSK_SCALING_FILTER_NEAREST
import org.gtkkn.native.gsk.GskScalingFilter.GSK_SCALING_FILTER_TRILINEAR

/**
 * The filters used when scaling texture data.
 *
 * The actual implementation of each filter is deferred to the
 * rendering pipeline.
 */
public enum class ScalingFilter(
    public val nativeValue: GskScalingFilter,
) {
    /**
     * linear interpolation filter
     */
    LINEAR(GSK_SCALING_FILTER_LINEAR),

    /**
     * nearest neighbor interpolation filter
     */
    NEAREST(GSK_SCALING_FILTER_NEAREST),

    /**
     * linear interpolation along each axis,
     *   plus mipmap generation, with linear interpolation along the mipmap
     *   levels
     */
    TRILINEAR(GSK_SCALING_FILTER_TRILINEAR),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GskScalingFilter): ScalingFilter =
            when (nativeValue) {
                GSK_SCALING_FILTER_LINEAR -> LINEAR
                GSK_SCALING_FILTER_NEAREST -> NEAREST
                GSK_SCALING_FILTER_TRILINEAR -> TRILINEAR
                else -> error("invalid nativeValue")
            }
    }
}
