// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskScalingFilter
import org.gtkkn.native.gsk.gsk_scaling_filter_get_type

/**
 * The filters used when scaling texture data.
 *
 * The actual implementation of each filter is deferred to the
 * rendering pipeline.
 */
public enum class ScalingFilter(public val nativeValue: GskScalingFilter) {
    /**
     * linear interpolation filter
     */
    LINEAR(GskScalingFilter.GSK_SCALING_FILTER_LINEAR),

    /**
     * nearest neighbor interpolation filter
     */
    NEAREST(GskScalingFilter.GSK_SCALING_FILTER_NEAREST),

    /**
     * linear interpolation along each axis,
     *   plus mipmap generation, with linear interpolation along the mipmap
     *   levels
     */
    TRILINEAR(GskScalingFilter.GSK_SCALING_FILTER_TRILINEAR),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GskScalingFilter): ScalingFilter = when (nativeValue) {
            GskScalingFilter.GSK_SCALING_FILTER_LINEAR -> LINEAR
            GskScalingFilter.GSK_SCALING_FILTER_NEAREST -> NEAREST
            GskScalingFilter.GSK_SCALING_FILTER_TRILINEAR -> TRILINEAR
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of ScalingFilter
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_scaling_filter_get_type()
    }
}
