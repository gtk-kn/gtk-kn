// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.adw.AdwBreakpointCondition
import org.gtkkn.native.adw.adw_breakpoint_condition_copy
import org.gtkkn.native.adw.adw_breakpoint_condition_free
import org.gtkkn.native.adw.adw_breakpoint_condition_get_type
import org.gtkkn.native.adw.adw_breakpoint_condition_new_and
import org.gtkkn.native.adw.adw_breakpoint_condition_new_length
import org.gtkkn.native.adw.adw_breakpoint_condition_new_or
import org.gtkkn.native.adw.adw_breakpoint_condition_new_ratio
import org.gtkkn.native.adw.adw_breakpoint_condition_parse
import org.gtkkn.native.adw.adw_breakpoint_condition_to_string
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Describes condition for an [class@Breakpoint].
 * @since 1.4
 */
@AdwVersion1_4
public class BreakpointCondition(public val adwBreakpointConditionPointer: CPointer<AdwBreakpointCondition>) :
    ProxyInstance(adwBreakpointConditionPointer) {
    /**
     * Creates a condition that triggers when either @condition_1 or @condition_2 is
     * true.
     *
     * @param condition1 first condition
     * @param condition2 second condition
     * @return the newly created condition
     * @since 1.4
     */
    public constructor(
        condition1: BreakpointCondition,
        condition2: BreakpointCondition,
    ) : this(
        adw_breakpoint_condition_new_or(
            condition1.adwBreakpointConditionPointer,
            condition2.adwBreakpointConditionPointer
        )!!
    ) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Creates a condition that triggers on length changes.
     *
     * @param type the length type
     * @param value the length value
     * @param unit the length unit
     * @return the newly created condition
     * @since 1.4
     */
    public constructor(
        type: BreakpointConditionLengthType,
        `value`: gdouble,
        unit: LengthUnit,
    ) : this(adw_breakpoint_condition_new_length(type.nativeValue, `value`, unit.nativeValue)!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Creates a condition that triggers on ratio changes.
     *
     * The ratio is represented as @width divided by @height.
     *
     * @param type the ratio type
     * @param width ratio width
     * @param height ratio height
     * @return the newly created condition
     * @since 1.4
     */
    public constructor(
        type: BreakpointConditionRatioType,
        width: gint,
        height: gint,
    ) : this(adw_breakpoint_condition_new_ratio(type.nativeValue, width, height)!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Copies @self.
     *
     * @return a copy of @self
     * @since 1.4
     */
    @AdwVersion1_4
    public fun copy(): BreakpointCondition = adw_breakpoint_condition_copy(adwBreakpointConditionPointer)!!.run {
        BreakpointCondition(this)
    }

    /**
     * Frees @self.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public fun free(): Unit = adw_breakpoint_condition_free(adwBreakpointConditionPointer)

    /**
     * Returns a textual representation of @self.
     *
     * The returned string can be parsed by [func@BreakpointCondition.parse].
     *
     * @return A newly allocated text string
     * @since 1.4
     */
    @Suppress("POTENTIALLY_NON_REPORTED_ANNOTATION")
    @AdwVersion1_4
    override fun toString(): String = adw_breakpoint_condition_to_string(adwBreakpointConditionPointer)?.toKString()
        ?: error("Expected not null string")

    public companion object {
        /**
         * Creates a condition that triggers when @condition_1 and @condition_2 are both
         * true.
         *
         * @param condition1 first condition
         * @param condition2 second condition
         * @return the newly created condition
         * @since 1.4
         */
        public fun and(condition1: BreakpointCondition, condition2: BreakpointCondition): BreakpointCondition =
            BreakpointCondition(
                adw_breakpoint_condition_new_and(
                    condition1.adwBreakpointConditionPointer,
                    condition2.adwBreakpointConditionPointer
                )!!
            ).apply {
                MemoryCleaner.setBoxedType(this, getType(), owned = true)
            }

        /**
         * Parses a condition from a string.
         *
         * Length conditions are specified as `<type>: <value>[<unit>]`, where:
         *
         * - `<type>` can be `min-width`, `max-width`, `min-height` or `max-height`
         * - `<value>` is a fractional number
         * - `<unit>` can be `px`, `pt` or `sp`
         *
         * If the unit is omitted, `px` is assumed.
         *
         * See [ctor@BreakpointCondition.new_length].
         *
         * Examples:
         *
         * - `min-width: 500px`
         * - `min-height: 400pt`
         * - `max-width: 100sp`
         * - `max-height: 500`
         *
         * Ratio conditions are specified as `<type>: <width>[/<height>]`, where:
         *
         * - `<type>` can be `min-aspect-ratio` or `max-aspect-ratio`
         * - `<width>` and `<height>` are integer numbers
         *
         * See [ctor@BreakpointCondition.new_ratio].
         *
         * The ratio is represented as `<width>` divided by `<height>`.
         *
         * If `<height>` is omitted, it's assumed to be 1.
         *
         * Examples:
         *
         * - `min-aspect-ratio: 4/3`
         * - `max-aspect-ratio: 1`
         *
         * The logical operators `and`, `or` can be used to compose a complex condition
         * as follows:
         *
         * - `<condition> and <condition>`: the condition is true when both
         *   `<condition>`s are true, same as when using
         *   [ctor@BreakpointCondition.new_and]
         * - `<condition> or <condition>`: the condition is true when either of the
         *   `<condition>`s is true, same as when using
         *   [ctor@BreakpointCondition.new_or]
         *
         * Examples:
         *
         * - `min-width: 400px and max-aspect-ratio: 4/3`
         * - `max-width: 360sp or max-width: 360px`
         *
         * Conditions can be further nested using parentheses, for example:
         *
         * - `min-width: 400px and (max-aspect-ratio: 4/3 or max-height: 400px)`
         *
         * If parentheses are omitted, the first operator takes priority.
         *
         * @param str the string specifying the condition
         * @return the parsed condition
         * @since 1.4
         */
        @AdwVersion1_4
        public fun parse(str: String): BreakpointCondition = adw_breakpoint_condition_parse(str)!!.run {
            BreakpointCondition(this)
        }

        /**
         * Get the GType of BreakpointCondition
         *
         * @return the GType
         */
        public fun getType(): GType = adw_breakpoint_condition_get_type()
    }
}
