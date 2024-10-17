// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import org.gtkkn.native.adw.AdwBreakpointConditionLengthType
import org.gtkkn.native.adw.AdwBreakpointConditionLengthType.ADW_BREAKPOINT_CONDITION_MAX_HEIGHT
import org.gtkkn.native.adw.AdwBreakpointConditionLengthType.ADW_BREAKPOINT_CONDITION_MAX_WIDTH
import org.gtkkn.native.adw.AdwBreakpointConditionLengthType.ADW_BREAKPOINT_CONDITION_MIN_HEIGHT
import org.gtkkn.native.adw.AdwBreakpointConditionLengthType.ADW_BREAKPOINT_CONDITION_MIN_WIDTH

/**
 * Describes length types for [struct@BreakpointCondition].
 *
 * See [ctor@BreakpointCondition.new_length].
 *
 * New values may be added to this enumeration over time.
 * @since 1.4
 */
public enum class BreakpointConditionLengthType(
    public val nativeValue: AdwBreakpointConditionLengthType,
) {
    /**
     * true if the width is greater than or
     *   equal to the condition value
     */
    MIN_WIDTH(ADW_BREAKPOINT_CONDITION_MIN_WIDTH),

    /**
     * true if the width is less than or
     *   equal to the condition value
     */
    MAX_WIDTH(ADW_BREAKPOINT_CONDITION_MAX_WIDTH),

    /**
     * true if the height is greater than or
     *   equal to the condition value
     */
    MIN_HEIGHT(ADW_BREAKPOINT_CONDITION_MIN_HEIGHT),

    /**
     * true if the height is less than or
     *   equal to the condition value
     */
    MAX_HEIGHT(ADW_BREAKPOINT_CONDITION_MAX_HEIGHT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwBreakpointConditionLengthType): BreakpointConditionLengthType =
            when (nativeValue) {
                ADW_BREAKPOINT_CONDITION_MIN_WIDTH -> MIN_WIDTH
                ADW_BREAKPOINT_CONDITION_MAX_WIDTH -> MAX_WIDTH
                ADW_BREAKPOINT_CONDITION_MIN_HEIGHT -> MIN_HEIGHT
                ADW_BREAKPOINT_CONDITION_MAX_HEIGHT -> MAX_HEIGHT
                else -> error("invalid nativeValue")
            }
    }
}
