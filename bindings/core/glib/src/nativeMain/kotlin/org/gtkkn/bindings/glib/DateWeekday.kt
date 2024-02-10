// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GDateWeekday
import org.gtkkn.native.glib.GDateWeekday.G_DATE_BAD_WEEKDAY
import org.gtkkn.native.glib.GDateWeekday.G_DATE_FRIDAY
import org.gtkkn.native.glib.GDateWeekday.G_DATE_MONDAY
import org.gtkkn.native.glib.GDateWeekday.G_DATE_SATURDAY
import org.gtkkn.native.glib.GDateWeekday.G_DATE_SUNDAY
import org.gtkkn.native.glib.GDateWeekday.G_DATE_THURSDAY
import org.gtkkn.native.glib.GDateWeekday.G_DATE_TUESDAY
import org.gtkkn.native.glib.GDateWeekday.G_DATE_WEDNESDAY

/**
 * Enumeration representing a day of the week; %G_DATE_MONDAY,
 * %G_DATE_TUESDAY, etc. %G_DATE_BAD_WEEKDAY is an invalid weekday.
 */
public enum class DateWeekday(
    public val nativeValue: GDateWeekday,
) {
    /**
     * invalid value
     */
    BAD_WEEKDAY(G_DATE_BAD_WEEKDAY),

    /**
     * Monday
     */
    MONDAY(G_DATE_MONDAY),

    /**
     * Tuesday
     */
    TUESDAY(G_DATE_TUESDAY),

    /**
     * Wednesday
     */
    WEDNESDAY(G_DATE_WEDNESDAY),

    /**
     * Thursday
     */
    THURSDAY(G_DATE_THURSDAY),

    /**
     * Friday
     */
    FRIDAY(G_DATE_FRIDAY),

    /**
     * Saturday
     */
    SATURDAY(G_DATE_SATURDAY),

    /**
     * Sunday
     */
    SUNDAY(G_DATE_SUNDAY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GDateWeekday): DateWeekday =
            when (nativeValue) {
                G_DATE_BAD_WEEKDAY -> BAD_WEEKDAY
                G_DATE_MONDAY -> MONDAY
                G_DATE_TUESDAY -> TUESDAY
                G_DATE_WEDNESDAY -> WEDNESDAY
                G_DATE_THURSDAY -> THURSDAY
                G_DATE_FRIDAY -> FRIDAY
                G_DATE_SATURDAY -> SATURDAY
                G_DATE_SUNDAY -> SUNDAY
                else -> error("invalid nativeValue")
            }
    }
}
