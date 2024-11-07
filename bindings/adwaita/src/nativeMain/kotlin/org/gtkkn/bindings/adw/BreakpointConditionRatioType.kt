// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.native.adw.AdwBreakpointConditionRatioType

/**
 * Describes ratio types for [struct@BreakpointCondition].
 *
 * See [ctor@BreakpointCondition.new_ratio].
 *
 * New values may be added to this enumeration over time.
 * @since 1.4
 */
@AdwVersion1_4
public enum class BreakpointConditionRatioType(
    public val nativeValue: AdwBreakpointConditionRatioType,
) {
    /**
     * true if the aspect ratio is
     *   greater than or equal to the condition value
     */
    MIN_ASPECT_RATIO(AdwBreakpointConditionRatioType.ADW_BREAKPOINT_CONDITION_MIN_ASPECT_RATIO),

    /**
     * true if the aspect ratio is
     *   less than or equal to the condition value
     */
    MAX_ASPECT_RATIO(AdwBreakpointConditionRatioType.ADW_BREAKPOINT_CONDITION_MAX_ASPECT_RATIO),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwBreakpointConditionRatioType): BreakpointConditionRatioType =
            when (nativeValue) {
                AdwBreakpointConditionRatioType.ADW_BREAKPOINT_CONDITION_MIN_ASPECT_RATIO -> MIN_ASPECT_RATIO
                AdwBreakpointConditionRatioType.ADW_BREAKPOINT_CONDITION_MAX_ASPECT_RATIO -> MAX_ASPECT_RATIO
                else -> error("invalid nativeValue")
            }
    }
}
