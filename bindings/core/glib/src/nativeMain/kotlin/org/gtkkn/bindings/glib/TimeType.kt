// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GTimeType
import org.gtkkn.native.glib.GTimeType.G_TIME_TYPE_DAYLIGHT
import org.gtkkn.native.glib.GTimeType.G_TIME_TYPE_STANDARD
import org.gtkkn.native.glib.GTimeType.G_TIME_TYPE_UNIVERSAL

/**
 * Disambiguates a given time in two ways.
 *
 * First, specifies if the given time is in universal or local time.
 *
 * Second, if the time is in local time, specifies if it is local
 * standard time or local daylight time.  This is important for the case
 * where the same local time occurs twice (during daylight savings time
 * transitions, for example).
 */
public enum class TimeType(
    public val nativeValue: GTimeType,
) {
    /**
     * the time is in local standard time
     */
    STANDARD(G_TIME_TYPE_STANDARD),

    /**
     * the time is in local daylight time
     */
    DAYLIGHT(G_TIME_TYPE_DAYLIGHT),

    /**
     * the time is in UTC
     */
    UNIVERSAL(G_TIME_TYPE_UNIVERSAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTimeType): TimeType =
            when (nativeValue) {
                G_TIME_TYPE_STANDARD -> STANDARD
                G_TIME_TYPE_DAYLIGHT -> DAYLIGHT
                G_TIME_TYPE_UNIVERSAL -> UNIVERSAL
                else -> error("invalid nativeValue")
            }
    }
}
