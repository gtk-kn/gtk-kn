// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GTimeType

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
public enum class TimeType(public val nativeValue: GTimeType) {
    /**
     * the time is in local standard time
     */
    STANDARD(GTimeType.G_TIME_TYPE_STANDARD),

    /**
     * the time is in local daylight time
     */
    DAYLIGHT(GTimeType.G_TIME_TYPE_DAYLIGHT),

    /**
     * the time is in UTC
     */
    UNIVERSAL(GTimeType.G_TIME_TYPE_UNIVERSAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTimeType): TimeType = when (nativeValue) {
            GTimeType.G_TIME_TYPE_STANDARD -> STANDARD
            GTimeType.G_TIME_TYPE_DAYLIGHT -> DAYLIGHT
            GTimeType.G_TIME_TYPE_UNIVERSAL -> UNIVERSAL
            else -> error("invalid nativeValue")
        }
    }
}
