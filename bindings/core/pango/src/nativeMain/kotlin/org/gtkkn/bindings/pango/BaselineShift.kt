// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import org.gtkkn.bindings.pango.annotations.PangoVersion1_50
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoBaselineShift
import org.gtkkn.native.pango.pango_baseline_shift_get_type

/**
 * An enumeration that affects baseline shifts between runs.
 * @since 1.50
 */
@PangoVersion1_50
public enum class BaselineShift(public val nativeValue: PangoBaselineShift) {
    /**
     * Leave the baseline unchanged
     */
    NONE(PangoBaselineShift.PANGO_BASELINE_SHIFT_NONE),

    /**
     * Shift the baseline to the superscript position,
     *   relative to the previous run
     */
    SUPERSCRIPT(PangoBaselineShift.PANGO_BASELINE_SHIFT_SUPERSCRIPT),

    /**
     * Shift the baseline to the subscript position,
     *   relative to the previous run
     */
    SUBSCRIPT(PangoBaselineShift.PANGO_BASELINE_SHIFT_SUBSCRIPT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoBaselineShift): BaselineShift = when (nativeValue) {
            PangoBaselineShift.PANGO_BASELINE_SHIFT_NONE -> NONE
            PangoBaselineShift.PANGO_BASELINE_SHIFT_SUPERSCRIPT -> SUPERSCRIPT
            PangoBaselineShift.PANGO_BASELINE_SHIFT_SUBSCRIPT -> SUBSCRIPT
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of BaselineShift
         *
         * @return the GType
         */
        public fun getType(): GType = pango_baseline_shift_get_type()
    }
}
