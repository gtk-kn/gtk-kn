// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GDateMonth

/**
 * Enumeration representing a month; values are %G_DATE_JANUARY,
 * %G_DATE_FEBRUARY, etc. %G_DATE_BAD_MONTH is the invalid value.
 */
public enum class DateMonth(public val nativeValue: GDateMonth) {
    /**
     * invalid value
     */
    BAD_MONTH(GDateMonth.G_DATE_BAD_MONTH),

    /**
     * January
     */
    JANUARY(GDateMonth.G_DATE_JANUARY),

    /**
     * February
     */
    FEBRUARY(GDateMonth.G_DATE_FEBRUARY),

    /**
     * March
     */
    MARCH(GDateMonth.G_DATE_MARCH),

    /**
     * April
     */
    APRIL(GDateMonth.G_DATE_APRIL),

    /**
     * May
     */
    MAY(GDateMonth.G_DATE_MAY),

    /**
     * June
     */
    JUNE(GDateMonth.G_DATE_JUNE),

    /**
     * July
     */
    JULY(GDateMonth.G_DATE_JULY),

    /**
     * August
     */
    AUGUST(GDateMonth.G_DATE_AUGUST),

    /**
     * September
     */
    SEPTEMBER(GDateMonth.G_DATE_SEPTEMBER),

    /**
     * October
     */
    OCTOBER(GDateMonth.G_DATE_OCTOBER),

    /**
     * November
     */
    NOVEMBER(GDateMonth.G_DATE_NOVEMBER),

    /**
     * December
     */
    DECEMBER(GDateMonth.G_DATE_DECEMBER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GDateMonth): DateMonth = when (nativeValue) {
            GDateMonth.G_DATE_BAD_MONTH -> BAD_MONTH
            GDateMonth.G_DATE_JANUARY -> JANUARY
            GDateMonth.G_DATE_FEBRUARY -> FEBRUARY
            GDateMonth.G_DATE_MARCH -> MARCH
            GDateMonth.G_DATE_APRIL -> APRIL
            GDateMonth.G_DATE_MAY -> MAY
            GDateMonth.G_DATE_JUNE -> JUNE
            GDateMonth.G_DATE_JULY -> JULY
            GDateMonth.G_DATE_AUGUST -> AUGUST
            GDateMonth.G_DATE_SEPTEMBER -> SEPTEMBER
            GDateMonth.G_DATE_OCTOBER -> OCTOBER
            GDateMonth.G_DATE_NOVEMBER -> NOVEMBER
            GDateMonth.G_DATE_DECEMBER -> DECEMBER
            else -> error("invalid nativeValue")
        }
    }
}
