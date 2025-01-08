// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.annotations.GLibVersion2_26
import org.gtkkn.bindings.glib.annotations.GLibVersion2_58
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.GTimeZone
import org.gtkkn.native.glib.g_time_zone_find_interval
import org.gtkkn.native.glib.g_time_zone_get_abbreviation
import org.gtkkn.native.glib.g_time_zone_get_identifier
import org.gtkkn.native.glib.g_time_zone_get_offset
import org.gtkkn.native.glib.g_time_zone_is_dst
import org.gtkkn.native.glib.g_time_zone_new
import org.gtkkn.native.glib.g_time_zone_new_identifier
import org.gtkkn.native.glib.g_time_zone_new_local
import org.gtkkn.native.glib.g_time_zone_new_offset
import org.gtkkn.native.glib.g_time_zone_new_utc
import org.gtkkn.native.glib.g_time_zone_ref
import org.gtkkn.native.glib.g_time_zone_unref
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gint64
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_time_zone_get_type
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A `GTimeZone` represents a time zone, at no particular point in time.
 *
 * The `GTimeZone` struct is refcounted and immutable.
 *
 * Each time zone has an identifier (for example, ‘Europe/London’) which is
 * platform dependent. See [ctor@GLib.TimeZone.new] for information on the
 * identifier formats. The identifier of a time zone can be retrieved using
 * [method@GLib.TimeZone.get_identifier].
 *
 * A time zone contains a number of intervals. Each interval has an abbreviation
 * to describe it (for example, ‘PDT’), an offset to UTC and a flag indicating
 * if the daylight savings time is in effect during that interval. A time zone
 * always has at least one interval — interval 0. Note that interval abbreviations
 * are not the same as time zone identifiers (apart from ‘UTC’), and cannot be
 * passed to [ctor@GLib.TimeZone.new].
 *
 * Every UTC time is contained within exactly one interval, but a given
 * local time may be contained within zero, one or two intervals (due to
 * incontinuities associated with daylight savings time).
 *
 * An interval may refer to a specific period of time (eg: the duration
 * of daylight savings time during 2010) or it may refer to many periods
 * of time that share the same properties (eg: all periods of daylight
 * savings time).  It is also possible (usually for political reasons)
 * that some properties (like the abbreviation) change between intervals
 * without other properties changing.
 *
 * ## Skipped during bindings generation
 *
 * - method `adjust_time`: In/Out parameter is not supported
 *
 * @since 2.26
 */
@GLibVersion2_26
public class TimeZone(pointer: CPointer<GTimeZone>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GTimeZone> = pointer

    /**
     * Finds an interval within @tz that corresponds to the given @time_.
     * The meaning of @time_ depends on @type.
     *
     * If @type is %G_TIME_TYPE_UNIVERSAL then this function will always
     * succeed (since universal time is monotonic and continuous).
     *
     * Otherwise @time_ is treated as local time.  The distinction between
     * %G_TIME_TYPE_STANDARD and %G_TIME_TYPE_DAYLIGHT is ignored except in
     * the case that the given @time_ is ambiguous.  In Toronto, for example,
     * 01:30 on November 7th 2010 occurred twice (once inside of daylight
     * savings time and the next, an hour later, outside of daylight savings
     * time).  In this case, the different value of @type would result in a
     * different interval being returned.
     *
     * It is still possible for this function to fail.  In Toronto, for
     * example, 02:00 on March 14th 2010 does not exist (due to the leap
     * forward to begin daylight savings time).  -1 is returned in that
     * case.
     *
     * @param type the #GTimeType of @time_
     * @param time a number of seconds since January 1, 1970
     * @return the interval containing @time_, or -1 in case of failure
     * @since 2.26
     */
    @GLibVersion2_26
    public fun findInterval(type: TimeType, time: gint64): gint =
        g_time_zone_find_interval(gPointer, type.nativeValue, time)

    /**
     * Determines the time zone abbreviation to be used during a particular
     * @interval of time in the time zone @tz.
     *
     * For example, in Toronto this is currently "EST" during the winter
     * months and "EDT" during the summer months when daylight savings time
     * is in effect.
     *
     * @param interval an interval within the timezone
     * @return the time zone abbreviation, which belongs to @tz
     * @since 2.26
     */
    @GLibVersion2_26
    public fun getAbbreviation(interval: gint): String =
        g_time_zone_get_abbreviation(gPointer, interval)?.toKString() ?: error("Expected not null string")

    /**
     * Get the identifier of this #GTimeZone, as passed to g_time_zone_new().
     * If the identifier passed at construction time was not recognised, `UTC` will
     * be returned. If it was null, the identifier of the local timezone at
     * construction time will be returned.
     *
     * The identifier will be returned in the same format as provided at
     * construction time: if provided as a time offset, that will be returned by
     * this function.
     *
     * @return identifier for this timezone
     * @since 2.58
     */
    @GLibVersion2_58
    public fun getIdentifier(): String =
        g_time_zone_get_identifier(gPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Determines the offset to UTC in effect during a particular @interval
     * of time in the time zone @tz.
     *
     * The offset is the number of seconds that you add to UTC time to
     * arrive at local time for @tz (ie: negative numbers for time zones
     * west of GMT, positive numbers for east).
     *
     * @param interval an interval within the timezone
     * @return the number of seconds that should be added to UTC to get the
     *          local time in @tz
     * @since 2.26
     */
    @GLibVersion2_26
    public fun getOffset(interval: gint): gint = g_time_zone_get_offset(gPointer, interval)

    /**
     * Determines if daylight savings time is in effect during a particular
     * @interval of time in the time zone @tz.
     *
     * @param interval an interval within the timezone
     * @return true if daylight savings time is in effect
     * @since 2.26
     */
    @GLibVersion2_26
    public fun isDst(interval: gint): Boolean = g_time_zone_is_dst(gPointer, interval).asBoolean()

    /**
     * Increases the reference count on @tz.
     *
     * @return a new reference to @tz.
     * @since 2.26
     */
    @GLibVersion2_26
    public fun ref(): TimeZone = g_time_zone_ref(gPointer)!!.run {
        TimeZone(this)
    }

    /**
     * Decreases the reference count on @tz.
     *
     * @since 2.26
     */
    @GLibVersion2_26
    public fun unref(): Unit = g_time_zone_unref(gPointer)

    public companion object {
        /**
         * A version of g_time_zone_new_identifier() which returns the UTC time zone
         * if @identifier could not be parsed or loaded.
         *
         * If you need to check whether @identifier was loaded successfully, use
         * g_time_zone_new_identifier().
         *
         * @param identifier a timezone identifier
         * @return the requested timezone
         * @since 2.26
         */
        public fun new(identifier: String? = null): TimeZone = TimeZone(g_time_zone_new(identifier)!!.reinterpret())

        /**
         * Creates a #GTimeZone corresponding to @identifier. If @identifier cannot be
         * parsed or loaded, null is returned.
         *
         * @identifier can either be an RFC3339/ISO 8601 time offset or
         * something that would pass as a valid value for the `TZ` environment
         * variable (including null).
         *
         * In Windows, @identifier can also be the unlocalized name of a time
         * zone for standard time, for example "Pacific Standard Time".
         *
         * Valid RFC3339 time offsets are `"Z"` (for UTC) or
         * `"±hh:mm"`.  ISO 8601 additionally specifies
         * `"±hhmm"` and `"±hh"`.  Offsets are
         * time values to be added to Coordinated Universal Time (UTC) to get
         * the local time.
         *
         * In UNIX, the `TZ` environment variable typically corresponds
         * to the name of a file in the zoneinfo database, an absolute path to a file
         * somewhere else, or a string in
         * "std offset [dst [offset],start[/time],end[/time]]" (POSIX) format.
         * There  are  no spaces in the specification. The name of standard
         * and daylight savings time zone must be three or more alphabetic
         * characters. Offsets are time values to be added to local time to
         * get Coordinated Universal Time (UTC) and should be
         * `"[±]hh[[:]mm[:ss]]"`.  Dates are either
         * `"Jn"` (Julian day with n between 1 and 365, leap
         * years not counted), `"n"` (zero-based Julian day
         * with n between 0 and 365) or `"Mm.w.d"` (day d
         * (0 <= d <= 6) of week w (1 <= w <= 5) of month m (1 <= m <= 12), day
         * 0 is a Sunday).  Times are in local wall clock time, the default is
         * 02:00:00.
         *
         * In Windows, the "tzn[+|–]hh[:mm[:ss]][dzn]" format is used, but also
         * accepts POSIX format.  The Windows format uses US rules for all time
         * zones; daylight savings time is 60 minutes behind the standard time
         * with date and time of change taken from Pacific Standard Time.
         * Offsets are time values to be added to the local time to get
         * Coordinated Universal Time (UTC).
         *
         * g_time_zone_new_local() calls this function with the value of the
         * `TZ` environment variable. This function itself is independent of
         * the value of `TZ`, but if @identifier is null then `/etc/localtime`
         * will be consulted to discover the correct time zone on UNIX and the
         * registry will be consulted or GetTimeZoneInformation() will be used
         * to get the local time zone on Windows.
         *
         * If intervals are not available, only time zone rules from `TZ`
         * environment variable or other means, then they will be computed
         * from year 1900 to 2037.  If the maximum year for the rules is
         * available and it is greater than 2037, then it will followed
         * instead.
         *
         * See
         * [RFC3339 §5.6](http://tools.ietf.org/html/rfc3339#section-5.6)
         * for a precise definition of valid RFC3339 time offsets
         * (the `time-offset` expansion) and ISO 8601 for the
         * full list of valid time offsets.  See
         * [The GNU C Library manual](http://www.gnu.org/s/libc/manual/html_node/TZ-Variable.html)
         * for an explanation of the possible
         * values of the `TZ` environment variable. See
         * [Microsoft Time Zone Index Values](http://msdn.microsoft.com/en-us/library/ms912391%28v=winembedded.11%29.aspx)
         * for the list of time zones on Windows.
         *
         * You should release the return value by calling g_time_zone_unref()
         * when you are done with it.
         *
         * @param identifier a timezone identifier
         * @return the requested timezone, or null on
         *     failure
         * @since 2.68
         */
        public fun newIdentifier(identifier: String? = null): TimeZone? =
            TimeZone(g_time_zone_new_identifier(identifier)!!.reinterpret())

        /**
         * Creates a #GTimeZone corresponding to local time.  The local time
         * zone may change between invocations to this function; for example,
         * if the system administrator changes it.
         *
         * This is equivalent to calling g_time_zone_new() with the value of
         * the `TZ` environment variable (including the possibility of null).
         *
         * You should release the return value by calling g_time_zone_unref()
         * when you are done with it.
         *
         * @return the local timezone
         * @since 2.26
         */
        public fun newLocal(): TimeZone = TimeZone(g_time_zone_new_local()!!)

        /**
         * Creates a #GTimeZone corresponding to the given constant offset from UTC,
         * in seconds.
         *
         * This is equivalent to calling g_time_zone_new() with a string in the form
         * `[+|-]hh[:mm[:ss]]`.
         *
         * It is possible for this function to fail if @seconds is too big (greater than
         * 24 hours), in which case this function will return the UTC timezone for
         * backwards compatibility. To detect failures like this, use
         * g_time_zone_new_identifier() directly.
         *
         * @param seconds offset to UTC, in seconds
         * @return a timezone at the given offset from UTC, or UTC on
         *   failure
         * @since 2.58
         */
        public fun newOffset(seconds: gint): TimeZone = TimeZone(g_time_zone_new_offset(seconds)!!.reinterpret())

        /**
         * Creates a #GTimeZone corresponding to UTC.
         *
         * This is equivalent to calling g_time_zone_new() with a value like
         * "Z", "UTC", "+00", etc.
         *
         * You should release the return value by calling g_time_zone_unref()
         * when you are done with it.
         *
         * @return the universal timezone
         * @since 2.26
         */
        public fun newUtc(): TimeZone = TimeZone(g_time_zone_new_utc()!!)

        /**
         * Get the GType of TimeZone
         *
         * @return the GType
         */
        public fun getType(): GType = g_time_zone_get_type()
    }
}
