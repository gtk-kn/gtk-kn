// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.native.pango.PangoBaselineShift
import org.gtkkn.native.pango.PangoBaselineShift.PANGO_BASELINE_SHIFT_NONE
import org.gtkkn.native.pango.PangoBaselineShift.PANGO_BASELINE_SHIFT_SUBSCRIPT
import org.gtkkn.native.pango.PangoBaselineShift.PANGO_BASELINE_SHIFT_SUPERSCRIPT

/**
 * An enumeration that affects baseline shifts between runs.
 * @since 1.50
 */
public enum class BaselineShift(
    public val nativeValue: PangoBaselineShift,
) {
    /**
     * Leave the baseline unchanged
     */
    NONE(PANGO_BASELINE_SHIFT_NONE),

    /**
     * Shift the baseline to the superscript position,
     *   relative to the previous run
     */
    SUPERSCRIPT(PANGO_BASELINE_SHIFT_SUPERSCRIPT),

    /**
     * Shift the baseline to the subscript position,
     *   relative to the previous run
     */
    SUBSCRIPT(PANGO_BASELINE_SHIFT_SUBSCRIPT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoBaselineShift): BaselineShift =
            when (nativeValue) {
                PANGO_BASELINE_SHIFT_NONE -> NONE
                PANGO_BASELINE_SHIFT_SUPERSCRIPT -> SUPERSCRIPT
                PANGO_BASELINE_SHIFT_SUBSCRIPT -> SUBSCRIPT
                else -> error("invalid nativeValue")
            }
    }
}
