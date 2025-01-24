// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GDateWeekday

/**
 * Enumeration representing a day of the week; %G_DATE_MONDAY,
 * %G_DATE_TUESDAY, etc. %G_DATE_BAD_WEEKDAY is an invalid weekday.
 */
public enum class DateWeekday(public val nativeValue: GDateWeekday) {
    /**
     * invalid value
     */
    BAD_WEEKDAY(GDateWeekday.G_DATE_BAD_WEEKDAY),

    /**
     * Monday
     */
    MONDAY(GDateWeekday.G_DATE_MONDAY),

    /**
     * Tuesday
     */
    TUESDAY(GDateWeekday.G_DATE_TUESDAY),

    /**
     * Wednesday
     */
    WEDNESDAY(GDateWeekday.G_DATE_WEDNESDAY),

    /**
     * Thursday
     */
    THURSDAY(GDateWeekday.G_DATE_THURSDAY),

    /**
     * Friday
     */
    FRIDAY(GDateWeekday.G_DATE_FRIDAY),

    /**
     * Saturday
     */
    SATURDAY(GDateWeekday.G_DATE_SATURDAY),

    /**
     * Sunday
     */
    SUNDAY(GDateWeekday.G_DATE_SUNDAY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GDateWeekday): DateWeekday = when (nativeValue) {
            GDateWeekday.G_DATE_BAD_WEEKDAY -> BAD_WEEKDAY
            GDateWeekday.G_DATE_MONDAY -> MONDAY
            GDateWeekday.G_DATE_TUESDAY -> TUESDAY
            GDateWeekday.G_DATE_WEDNESDAY -> WEDNESDAY
            GDateWeekday.G_DATE_THURSDAY -> THURSDAY
            GDateWeekday.G_DATE_FRIDAY -> FRIDAY
            GDateWeekday.G_DATE_SATURDAY -> SATURDAY
            GDateWeekday.G_DATE_SUNDAY -> SUNDAY
            else -> error("invalid nativeValue")
        }
    }
}
