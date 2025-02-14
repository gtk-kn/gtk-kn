// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import org.gtkkn.bindings.gdk.annotations.GdkVersion4_16
import org.gtkkn.native.gdk.GdkCicpRange
import org.gtkkn.native.gdk.gdk_cicp_range_get_type
import org.gtkkn.native.gobject.GType

/**
 * The values of this enumeration describe whether image data uses
 * the full range of 8-bit values.
 *
 * In digital broadcasting, it is common to reserve the lowest and
 * highest values. Typically the allowed values for the narrow range
 * are 16-235 for Y and 16-240 for u,v (when dealing with YUV data).
 * @since 4.16
 */
@GdkVersion4_16
public enum class CicpRange(public val nativeValue: GdkCicpRange) {
    /**
     * The values use the range of 16-235 (for Y) and 16-240 for u and v.
     */
    NARROW(GdkCicpRange.GDK_CICP_RANGE_NARROW),

    /**
     * The values use the full range.
     */
    FULL(GdkCicpRange.GDK_CICP_RANGE_FULL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkCicpRange): CicpRange = when (nativeValue) {
            GdkCicpRange.GDK_CICP_RANGE_NARROW -> NARROW
            GdkCicpRange.GDK_CICP_RANGE_FULL -> FULL
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of CicpRange
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_cicp_range_get_type()
    }
}
