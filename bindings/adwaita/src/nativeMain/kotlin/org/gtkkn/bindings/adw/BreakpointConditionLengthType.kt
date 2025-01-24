// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.native.adw.AdwBreakpointConditionLengthType
import org.gtkkn.native.adw.adw_breakpoint_condition_length_type_get_type
import org.gtkkn.native.gobject.GType

/**
 * Describes length types for [struct@BreakpointCondition].
 *
 * See [ctor@BreakpointCondition.new_length].
 *
 * New values may be added to this enumeration over time.
 * @since 1.4
 */
@AdwVersion1_4
public enum class BreakpointConditionLengthType(public val nativeValue: AdwBreakpointConditionLengthType) {
    /**
     * true if the width is greater than or
     *   equal to the condition value
     */
    MIN_WIDTH(AdwBreakpointConditionLengthType.ADW_BREAKPOINT_CONDITION_MIN_WIDTH),

    /**
     * true if the width is less than or
     *   equal to the condition value
     */
    MAX_WIDTH(AdwBreakpointConditionLengthType.ADW_BREAKPOINT_CONDITION_MAX_WIDTH),

    /**
     * true if the height is greater than or
     *   equal to the condition value
     */
    MIN_HEIGHT(AdwBreakpointConditionLengthType.ADW_BREAKPOINT_CONDITION_MIN_HEIGHT),

    /**
     * true if the height is less than or
     *   equal to the condition value
     */
    MAX_HEIGHT(AdwBreakpointConditionLengthType.ADW_BREAKPOINT_CONDITION_MAX_HEIGHT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwBreakpointConditionLengthType): BreakpointConditionLengthType =
            when (nativeValue) {
                AdwBreakpointConditionLengthType.ADW_BREAKPOINT_CONDITION_MIN_WIDTH -> MIN_WIDTH
                AdwBreakpointConditionLengthType.ADW_BREAKPOINT_CONDITION_MAX_WIDTH -> MAX_WIDTH
                AdwBreakpointConditionLengthType.ADW_BREAKPOINT_CONDITION_MIN_HEIGHT -> MIN_HEIGHT
                AdwBreakpointConditionLengthType.ADW_BREAKPOINT_CONDITION_MAX_HEIGHT -> MAX_HEIGHT
                else -> error("invalid nativeValue")
            }

        /**
         * Get the GType of BreakpointConditionLengthType
         *
         * @return the GType
         */
        public fun getType(): GType = adw_breakpoint_condition_length_type_get_type()
    }
}
