// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GDateMonth
import org.gtkkn.native.glib.GDateMonth.G_DATE_APRIL
import org.gtkkn.native.glib.GDateMonth.G_DATE_AUGUST
import org.gtkkn.native.glib.GDateMonth.G_DATE_BAD_MONTH
import org.gtkkn.native.glib.GDateMonth.G_DATE_DECEMBER
import org.gtkkn.native.glib.GDateMonth.G_DATE_FEBRUARY
import org.gtkkn.native.glib.GDateMonth.G_DATE_JANUARY
import org.gtkkn.native.glib.GDateMonth.G_DATE_JULY
import org.gtkkn.native.glib.GDateMonth.G_DATE_JUNE
import org.gtkkn.native.glib.GDateMonth.G_DATE_MARCH
import org.gtkkn.native.glib.GDateMonth.G_DATE_MAY
import org.gtkkn.native.glib.GDateMonth.G_DATE_NOVEMBER
import org.gtkkn.native.glib.GDateMonth.G_DATE_OCTOBER
import org.gtkkn.native.glib.GDateMonth.G_DATE_SEPTEMBER

/**
 * Enumeration representing a month; values are %G_DATE_JANUARY,
 * %G_DATE_FEBRUARY, etc. %G_DATE_BAD_MONTH is the invalid value.
 */
public enum class DateMonth(
    public val nativeValue: GDateMonth,
) {
    /**
     * invalid value
     */
    BAD_MONTH(G_DATE_BAD_MONTH),

    /**
     * January
     */
    JANUARY(G_DATE_JANUARY),

    /**
     * February
     */
    FEBRUARY(G_DATE_FEBRUARY),

    /**
     * March
     */
    MARCH(G_DATE_MARCH),

    /**
     * April
     */
    APRIL(G_DATE_APRIL),

    /**
     * May
     */
    MAY(G_DATE_MAY),

    /**
     * June
     */
    JUNE(G_DATE_JUNE),

    /**
     * July
     */
    JULY(G_DATE_JULY),

    /**
     * August
     */
    AUGUST(G_DATE_AUGUST),

    /**
     * September
     */
    SEPTEMBER(G_DATE_SEPTEMBER),

    /**
     * October
     */
    OCTOBER(G_DATE_OCTOBER),

    /**
     * November
     */
    NOVEMBER(G_DATE_NOVEMBER),

    /**
     * December
     */
    DECEMBER(G_DATE_DECEMBER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GDateMonth): DateMonth =
            when (nativeValue) {
                G_DATE_BAD_MONTH -> BAD_MONTH
                G_DATE_JANUARY -> JANUARY
                G_DATE_FEBRUARY -> FEBRUARY
                G_DATE_MARCH -> MARCH
                G_DATE_APRIL -> APRIL
                G_DATE_MAY -> MAY
                G_DATE_JUNE -> JUNE
                G_DATE_JULY -> JULY
                G_DATE_AUGUST -> AUGUST
                G_DATE_SEPTEMBER -> SEPTEMBER
                G_DATE_OCTOBER -> OCTOBER
                G_DATE_NOVEMBER -> NOVEMBER
                G_DATE_DECEMBER -> DECEMBER
                else -> error("invalid nativeValue")
            }
    }
}
