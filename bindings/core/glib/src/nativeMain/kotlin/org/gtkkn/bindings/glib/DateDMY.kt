// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GDateDMY

/**
 * This enumeration isn't used in the API, but may be useful if you need
 * to mark a number as a day, month, or year.
 */
public enum class DateDMY(
    public val nativeValue: GDateDMY,
) {
    /**
     * a day
     */
    DAY(GDateDMY.G_DATE_DAY),

    /**
     * a month
     */
    MONTH(GDateDMY.G_DATE_MONTH),

    /**
     * a year
     */
    YEAR(GDateDMY.G_DATE_YEAR),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GDateDMY): DateDMY =
            when (nativeValue) {
                GDateDMY.G_DATE_DAY -> DAY
                GDateDMY.G_DATE_MONTH -> MONTH
                GDateDMY.G_DATE_YEAR -> YEAR
                else -> error("invalid nativeValue")
            }
    }
}
