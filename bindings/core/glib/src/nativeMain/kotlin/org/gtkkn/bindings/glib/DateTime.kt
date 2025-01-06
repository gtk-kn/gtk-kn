// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.annotations.GLibVersion2_26
import org.gtkkn.bindings.glib.annotations.GLibVersion2_58
import org.gtkkn.bindings.glib.annotations.GLibVersion2_62
import org.gtkkn.bindings.glib.annotations.GLibVersion2_80
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.GDateTime
import org.gtkkn.native.glib.g_date_time_add
import org.gtkkn.native.glib.g_date_time_add_days
import org.gtkkn.native.glib.g_date_time_add_full
import org.gtkkn.native.glib.g_date_time_add_hours
import org.gtkkn.native.glib.g_date_time_add_minutes
import org.gtkkn.native.glib.g_date_time_add_months
import org.gtkkn.native.glib.g_date_time_add_seconds
import org.gtkkn.native.glib.g_date_time_add_weeks
import org.gtkkn.native.glib.g_date_time_add_years
import org.gtkkn.native.glib.g_date_time_compare
import org.gtkkn.native.glib.g_date_time_difference
import org.gtkkn.native.glib.g_date_time_equal
import org.gtkkn.native.glib.g_date_time_format
import org.gtkkn.native.glib.g_date_time_format_iso8601
import org.gtkkn.native.glib.g_date_time_get_day_of_month
import org.gtkkn.native.glib.g_date_time_get_day_of_week
import org.gtkkn.native.glib.g_date_time_get_day_of_year
import org.gtkkn.native.glib.g_date_time_get_hour
import org.gtkkn.native.glib.g_date_time_get_microsecond
import org.gtkkn.native.glib.g_date_time_get_minute
import org.gtkkn.native.glib.g_date_time_get_month
import org.gtkkn.native.glib.g_date_time_get_second
import org.gtkkn.native.glib.g_date_time_get_seconds
import org.gtkkn.native.glib.g_date_time_get_timezone
import org.gtkkn.native.glib.g_date_time_get_timezone_abbreviation
import org.gtkkn.native.glib.g_date_time_get_utc_offset
import org.gtkkn.native.glib.g_date_time_get_week_numbering_year
import org.gtkkn.native.glib.g_date_time_get_week_of_year
import org.gtkkn.native.glib.g_date_time_get_year
import org.gtkkn.native.glib.g_date_time_hash
import org.gtkkn.native.glib.g_date_time_is_daylight_savings
import org.gtkkn.native.glib.g_date_time_new
import org.gtkkn.native.glib.g_date_time_new_from_iso8601
import org.gtkkn.native.glib.g_date_time_new_from_timeval_local
import org.gtkkn.native.glib.g_date_time_new_from_timeval_utc
import org.gtkkn.native.glib.g_date_time_new_from_unix_local
import org.gtkkn.native.glib.g_date_time_new_from_unix_local_usec
import org.gtkkn.native.glib.g_date_time_new_from_unix_utc
import org.gtkkn.native.glib.g_date_time_new_from_unix_utc_usec
import org.gtkkn.native.glib.g_date_time_new_local
import org.gtkkn.native.glib.g_date_time_new_now
import org.gtkkn.native.glib.g_date_time_new_now_local
import org.gtkkn.native.glib.g_date_time_new_now_utc
import org.gtkkn.native.glib.g_date_time_new_utc
import org.gtkkn.native.glib.g_date_time_ref
import org.gtkkn.native.glib.g_date_time_to_local
import org.gtkkn.native.glib.g_date_time_to_timeval
import org.gtkkn.native.glib.g_date_time_to_timezone
import org.gtkkn.native.glib.g_date_time_to_unix
import org.gtkkn.native.glib.g_date_time_to_unix_usec
import org.gtkkn.native.glib.g_date_time_to_utc
import org.gtkkn.native.glib.g_date_time_unref
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gint64
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_date_time_get_type
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * `GDateTime` is a structure that combines a Gregorian date and time
 * into a single structure.
 *
 * `GDateTime` provides many conversion and methods to manipulate dates and times.
 * Time precision is provided down to microseconds and the time can range
 * (proleptically) from 0001-01-01 00:00:00 to 9999-12-31 23:59:59.999999.
 * `GDateTime` follows POSIX time in the sense that it is oblivious to leap
 * seconds.
 *
 * `GDateTime` is an immutable object; once it has been created it cannot
 * be modified further. All modifiers will create a new `GDateTime`.
 * Nearly all such functions can fail due to the date or time going out
 * of range, in which case null will be returned.
 *
 * `GDateTime` is reference counted: the reference count is increased by calling
 * [method@GLib.DateTime.ref] and decreased by calling [method@GLib.DateTime.unref].
 * When the reference count drops to 0, the resources allocated by the `GDateTime`
 * structure are released.
 *
 * Many parts of the API may produce non-obvious results. As an
 * example, adding two months to January 31st will yield March 31st
 * whereas adding one month and then one month again will yield either
 * March 28th or March 29th.  Also note that adding 24 hours is not
 * always the same as adding one day (since days containing daylight
 * savings time transitions are either 23 or 25 hours in length).
 *
 * ## Skipped during bindings generation
 *
 * - parameter `year`: year: Out parameter is not supported
 *
 * @since 2.26
 */
@GLibVersion2_26
public class DateTime(pointer: CPointer<GDateTime>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GDateTime> = pointer

    /**
     * Creates a copy of @datetime and adds the specified timespan to the copy.
     *
     * @param timespan a #GTimeSpan
     * @return the newly created #GDateTime which
     *   should be freed with g_date_time_unref(), or null
     * @since 2.26
     */
    @GLibVersion2_26
    public fun add(timespan: TimeSpan): DateTime? = g_date_time_add(gPointer.reinterpret(), timespan)?.run {
        DateTime(reinterpret())
    }

    /**
     * Creates a copy of @datetime and adds the specified number of days to the
     * copy. Add negative values to subtract days.
     *
     * @param days the number of days
     * @return the newly created #GDateTime which
     *   should be freed with g_date_time_unref(), or null
     * @since 2.26
     */
    @GLibVersion2_26
    public fun addDays(days: gint): DateTime? = g_date_time_add_days(gPointer.reinterpret(), days)?.run {
        DateTime(reinterpret())
    }

    /**
     * Creates a new #GDateTime adding the specified values to the current date and
     * time in @datetime. Add negative values to subtract.
     *
     * @param years the number of years to add
     * @param months the number of months to add
     * @param days the number of days to add
     * @param hours the number of hours to add
     * @param minutes the number of minutes to add
     * @param seconds the number of seconds to add
     * @return the newly created #GDateTime which
     *   should be freed with g_date_time_unref(), or null
     * @since 2.26
     */
    @GLibVersion2_26
    public fun addFull(
        years: gint,
        months: gint,
        days: gint,
        hours: gint,
        minutes: gint,
        seconds: gdouble,
    ): DateTime? = g_date_time_add_full(gPointer.reinterpret(), years, months, days, hours, minutes, seconds)?.run {
        DateTime(reinterpret())
    }

    /**
     * Creates a copy of @datetime and adds the specified number of hours.
     * Add negative values to subtract hours.
     *
     * @param hours the number of hours to add
     * @return the newly created #GDateTime which
     *   should be freed with g_date_time_unref(), or null
     * @since 2.26
     */
    @GLibVersion2_26
    public fun addHours(hours: gint): DateTime? = g_date_time_add_hours(gPointer.reinterpret(), hours)?.run {
        DateTime(reinterpret())
    }

    /**
     * Creates a copy of @datetime adding the specified number of minutes.
     * Add negative values to subtract minutes.
     *
     * @param minutes the number of minutes to add
     * @return the newly created #GDateTime which
     *   should be freed with g_date_time_unref(), or null
     * @since 2.26
     */
    @GLibVersion2_26
    public fun addMinutes(minutes: gint): DateTime? = g_date_time_add_minutes(gPointer.reinterpret(), minutes)?.run {
        DateTime(reinterpret())
    }

    /**
     * Creates a copy of @datetime and adds the specified number of months to the
     * copy. Add negative values to subtract months.
     *
     * The day of the month of the resulting #GDateTime is clamped to the number
     * of days in the updated calendar month. For example, if adding 1 month to
     * 31st January 2018, the result would be 28th February 2018. In 2020 (a leap
     * year), the result would be 29th February.
     *
     * @param months the number of months
     * @return the newly created #GDateTime which
     *   should be freed with g_date_time_unref(), or null
     * @since 2.26
     */
    @GLibVersion2_26
    public fun addMonths(months: gint): DateTime? = g_date_time_add_months(gPointer.reinterpret(), months)?.run {
        DateTime(reinterpret())
    }

    /**
     * Creates a copy of @datetime and adds the specified number of seconds.
     * Add negative values to subtract seconds.
     *
     * @param seconds the number of seconds to add
     * @return the newly created #GDateTime which
     *   should be freed with g_date_time_unref(), or null
     * @since 2.26
     */
    @GLibVersion2_26
    public fun addSeconds(seconds: gdouble): DateTime? = g_date_time_add_seconds(gPointer.reinterpret(), seconds)?.run {
        DateTime(reinterpret())
    }

    /**
     * Creates a copy of @datetime and adds the specified number of weeks to the
     * copy. Add negative values to subtract weeks.
     *
     * @param weeks the number of weeks
     * @return the newly created #GDateTime which
     *   should be freed with g_date_time_unref(), or null
     * @since 2.26
     */
    @GLibVersion2_26
    public fun addWeeks(weeks: gint): DateTime? = g_date_time_add_weeks(gPointer.reinterpret(), weeks)?.run {
        DateTime(reinterpret())
    }

    /**
     * Creates a copy of @datetime and adds the specified number of years to the
     * copy. Add negative values to subtract years.
     *
     * As with g_date_time_add_months(), if the resulting date would be 29th
     * February on a non-leap year, the day will be clamped to 28th February.
     *
     * @param years the number of years
     * @return the newly created #GDateTime which
     *   should be freed with g_date_time_unref(), or null
     * @since 2.26
     */
    @GLibVersion2_26
    public fun addYears(years: gint): DateTime? = g_date_time_add_years(gPointer.reinterpret(), years)?.run {
        DateTime(reinterpret())
    }

    /**
     * A comparison function for #GDateTimes that is suitable
     * as a #GCompareFunc. Both #GDateTimes must be non-null.
     *
     * @param dt2 second #GDateTime to compare
     * @return -1, 0 or 1 if @dt1 is less than, equal to or greater
     *   than @dt2.
     * @since 2.26
     */
    @GLibVersion2_26
    public fun compare(dt2: DateTime): gint = g_date_time_compare(gPointer.reinterpret(), dt2.gPointer.reinterpret())

    /**
     * Calculates the difference in time between @end and @begin.  The
     * #GTimeSpan that is returned is effectively @end - @begin (ie:
     * positive if the first parameter is larger).
     *
     * @param begin a #GDateTime
     * @return the difference between the two #GDateTime, as a time
     *   span expressed in microseconds.
     * @since 2.26
     */
    @GLibVersion2_26
    public fun difference(begin: DateTime): TimeSpan =
        g_date_time_difference(gPointer.reinterpret(), begin.gPointer.reinterpret())

    /**
     * Checks to see if @dt1 and @dt2 are equal.
     *
     * Equal here means that they represent the same moment after converting
     * them to the same time zone.
     *
     * @param dt2 a #GDateTime
     * @return true if @dt1 and @dt2 are equal
     * @since 2.26
     */
    @GLibVersion2_26
    public fun equal(dt2: DateTime): Boolean =
        g_date_time_equal(gPointer.reinterpret(), dt2.gPointer.reinterpret()).asBoolean()

    /**
     * Creates a newly allocated string representing the requested @format.
     *
     * The format strings understood by this function are a subset of the
     * `strftime()` format language as specified by C99.  The `%D`, `%U` and `%W`
     * conversions are not supported, nor is the `E` modifier.  The GNU
     * extensions `%k`, `%l`, `%s` and `%P` are supported, however, as are the
     * `0`, `_` and `-` modifiers. The Python extension `%f` is also supported.
     *
     * In contrast to `strftime()`, this function always produces a UTF-8
     * string, regardless of the current locale.  Note that the rendering of
     * many formats is locale-dependent and may not match the `strftime()`
     * output exactly.
     *
     * The following format specifiers are supported:
     *
     * - `%a`: the abbreviated weekday name according to the current locale
     * - `%A`: the full weekday name according to the current locale
     * - `%b`: the abbreviated month name according to the current locale
     * - `%B`: the full month name according to the current locale
     * - `%c`: the preferred date and time representation for the current locale
     * - `%C`: the century number (year/100) as a 2-digit integer (00-99)
     * - `%d`: the day of the month as a decimal number (range 01 to 31)
     * - `%e`: the day of the month as a decimal number (range 1 to 31);
     *   single digits are preceded by a figure space (U+2007)
     * - `%F`: equivalent to `%Y-%m-%d` (the ISO 8601 date format)
     * - `%g`: the last two digits of the ISO 8601 week-based year as a
     *   decimal number (00-99). This works well with `%V` and `%u`.
     * - `%G`: the ISO 8601 week-based year as a decimal number. This works
     *   well with `%V` and `%u`.
     * - `%h`: equivalent to `%b`
     * - `%H`: the hour as a decimal number using a 24-hour clock (range 00 to 23)
     * - `%I`: the hour as a decimal number using a 12-hour clock (range 01 to 12)
     * - `%j`: the day of the year as a decimal number (range 001 to 366)
     * - `%k`: the hour (24-hour clock) as a decimal number (range 0 to 23);
     *   single digits are preceded by a figure space (U+2007)
     * - `%l`: the hour (12-hour clock) as a decimal number (range 1 to 12);
     *   single digits are preceded by a figure space (U+2007)
     * - `%m`: the month as a decimal number (range 01 to 12)
     * - `%M`: the minute as a decimal number (range 00 to 59)
     * - `%f`: the microsecond as a decimal number (range 000000 to 999999)
     * - `%p`: either ‘AM’ or ‘PM’ according to the given time value, or the
     *   corresponding  strings for the current locale.  Noon is treated as
     *   ‘PM’ and midnight as ‘AM’. Use of this format specifier is discouraged, as
     *   many locales have no concept of AM/PM formatting. Use `%c` or `%X` instead.
     * - `%P`: like `%p` but lowercase: ‘am’ or ‘pm’ or a corresponding string for
     *   the current locale. Use of this format specifier is discouraged, as
     *   many locales have no concept of AM/PM formatting. Use `%c` or `%X` instead.
     * - `%r`: the time in a.m. or p.m. notation. Use of this format specifier is
     *   discouraged, as many locales have no concept of AM/PM formatting. Use `%c`
     *   or `%X` instead.
     * - `%R`: the time in 24-hour notation (`%H:%M`)
     * - `%s`: the number of seconds since the Epoch, that is, since 1970-01-01
     *   00:00:00 UTC
     * - `%S`: the second as a decimal number (range 00 to 60)
     * - `%t`: a tab character
     * - `%T`: the time in 24-hour notation with seconds (`%H:%M:%S`)
     * - `%u`: the ISO 8601 standard day of the week as a decimal, range 1 to 7,
     *    Monday being 1. This works well with `%G` and `%V`.
     * - `%V`: the ISO 8601 standard week number of the current year as a decimal
     *   number, range 01 to 53, where week 1 is the first week that has at
     *   least 4 days in the new year. See g_date_time_get_week_of_year().
     *   This works well with `%G` and `%u`.
     * - `%w`: the day of the week as a decimal, range 0 to 6, Sunday being 0.
     *   This is not the ISO 8601 standard format — use `%u` instead.
     * - `%x`: the preferred date representation for the current locale without
     *   the time
     * - `%X`: the preferred time representation for the current locale without
     *   the date
     * - `%y`: the year as a decimal number without the century
     * - `%Y`: the year as a decimal number including the century
     * - `%z`: the time zone as an offset from UTC (`+hhmm`)
     * - `%:z`: the time zone as an offset from UTC (`+hh:mm`).
     *   This is a gnulib `strftime()` extension. Since: 2.38
     * - `%::z`: the time zone as an offset from UTC (`+hh:mm:ss`). This is a
     *   gnulib `strftime()` extension. Since: 2.38
     * - `%:::z`: the time zone as an offset from UTC, with `:` to necessary
     *   precision (e.g., `-04`, `+05:30`). This is a gnulib `strftime()` extension. Since: 2.38
     * - `%Z`: the time zone or name or abbreviation
     * - `%%`: a literal `%` character
     *
     * Some conversion specifications can be modified by preceding the
     * conversion specifier by one or more modifier characters.
     *
     * The following modifiers are supported for many of the numeric
     * conversions:
     *
     * - `O`: Use alternative numeric symbols, if the current locale supports those.
     * - `_`: Pad a numeric result with spaces. This overrides the default padding
     *   for the specifier.
     * - `-`: Do not pad a numeric result. This overrides the default padding
     *   for the specifier.
     * - `0`: Pad a numeric result with zeros. This overrides the default padding
     *   for the specifier.
     *
     * The following modifiers are supported for many of the alphabetic conversions:
     *
     * - `^`: Use upper case if possible. This is a gnulib `strftime()` extension.
     *   Since: 2.80
     * - `#`: Use opposite case if possible. This is a gnulib `strftime()`
     *   extension. Since: 2.80
     *
     * Additionally, when `O` is used with `B`, `b`, or `h`, it produces the alternative
     * form of a month name. The alternative form should be used when the month
     * name is used without a day number (e.g., standalone). It is required in
     * some languages (Baltic, Slavic, Greek, and more) due to their grammatical
     * rules. For other languages there is no difference. `%OB` is a GNU and BSD
     * `strftime()` extension expected to be added to the future POSIX specification,
     * `%Ob` and `%Oh` are GNU `strftime()` extensions. Since: 2.56
     *
     * Since GLib 2.80, when `E` is used with `%c`, `%C`, `%x`, `%X`, `%y` or `%Y`,
     * the date is formatted using an alternate era representation specific to the
     * locale. This is typically used for the Thai solar calendar or Japanese era
     * names, for example.
     *
     * - `%Ec`: the preferred date and time representation for the current locale,
     *   using the alternate era representation
     * - `%EC`: the name of the era
     * - `%Ex`: the preferred date representation for the current locale without
     *   the time, using the alternate era representation
     * - `%EX`: the preferred time representation for the current locale without
     *   the date, using the alternate era representation
     * - `%Ey`: the year since the beginning of the era denoted by the `%EC`
     *   specifier
     * - `%EY`: the full alternative year representation
     *
     * @param format a valid UTF-8 string, containing the format for the
     *          #GDateTime
     * @return a newly allocated string formatted to
     *    the requested format or null in the case that there was an error (such
     *    as a format specifier not being supported in the current locale). The
     *    string should be freed with g_free().
     * @since 2.26
     */
    @GLibVersion2_26
    public fun format(format: String): String? = g_date_time_format(gPointer.reinterpret(), format)?.toKString()

    /**
     * Format @datetime in [ISO 8601 format](https://en.wikipedia.org/wiki/ISO_8601),
     * including the date, time and time zone, and return that as a UTF-8 encoded
     * string.
     *
     * Since GLib 2.66, this will output to sub-second precision if needed.
     *
     * @return a newly allocated string formatted in
     *   ISO 8601 format or null in the case that there was an error. The string
     *   should be freed with g_free().
     * @since 2.62
     */
    @GLibVersion2_62
    public fun formatIso8601(): String? = g_date_time_format_iso8601(gPointer.reinterpret())?.toKString()

    /**
     * Retrieves the day of the month represented by @datetime in the gregorian
     * calendar.
     *
     * @return the day of the month
     * @since 2.26
     */
    @GLibVersion2_26
    public fun getDayOfMonth(): gint = g_date_time_get_day_of_month(gPointer.reinterpret())

    /**
     * Retrieves the ISO 8601 day of the week on which @datetime falls (1 is
     * Monday, 2 is Tuesday... 7 is Sunday).
     *
     * @return the day of the week
     * @since 2.26
     */
    @GLibVersion2_26
    public fun getDayOfWeek(): gint = g_date_time_get_day_of_week(gPointer.reinterpret())

    /**
     * Retrieves the day of the year represented by @datetime in the Gregorian
     * calendar.
     *
     * @return the day of the year
     * @since 2.26
     */
    @GLibVersion2_26
    public fun getDayOfYear(): gint = g_date_time_get_day_of_year(gPointer.reinterpret())

    /**
     * Retrieves the hour of the day represented by @datetime
     *
     * @return the hour of the day
     * @since 2.26
     */
    @GLibVersion2_26
    public fun getHour(): gint = g_date_time_get_hour(gPointer.reinterpret())

    /**
     * Retrieves the microsecond of the date represented by @datetime
     *
     * @return the microsecond of the second
     * @since 2.26
     */
    @GLibVersion2_26
    public fun getMicrosecond(): gint = g_date_time_get_microsecond(gPointer.reinterpret())

    /**
     * Retrieves the minute of the hour represented by @datetime
     *
     * @return the minute of the hour
     * @since 2.26
     */
    @GLibVersion2_26
    public fun getMinute(): gint = g_date_time_get_minute(gPointer.reinterpret())

    /**
     * Retrieves the month of the year represented by @datetime in the Gregorian
     * calendar.
     *
     * @return the month represented by @datetime
     * @since 2.26
     */
    @GLibVersion2_26
    public fun getMonth(): gint = g_date_time_get_month(gPointer.reinterpret())

    /**
     * Retrieves the second of the minute represented by @datetime
     *
     * @return the second represented by @datetime
     * @since 2.26
     */
    @GLibVersion2_26
    public fun getSecond(): gint = g_date_time_get_second(gPointer.reinterpret())

    /**
     * Retrieves the number of seconds since the start of the last minute,
     * including the fractional part.
     *
     * @return the number of seconds
     * @since 2.26
     */
    @GLibVersion2_26
    public fun getSeconds(): gdouble = g_date_time_get_seconds(gPointer.reinterpret())

    /**
     * Get the time zone for this @datetime.
     *
     * @return the time zone
     * @since 2.58
     */
    @GLibVersion2_58
    public fun getTimezone(): TimeZone = g_date_time_get_timezone(gPointer.reinterpret())!!.run {
        TimeZone(reinterpret())
    }

    /**
     * Determines the time zone abbreviation to be used at the time and in
     * the time zone of @datetime.
     *
     * For example, in Toronto this is currently "EST" during the winter
     * months and "EDT" during the summer months when daylight savings
     * time is in effect.
     *
     * @return the time zone abbreviation. The returned
     *          string is owned by the #GDateTime and it should not be
     *          modified or freed
     * @since 2.26
     */
    @GLibVersion2_26
    public fun getTimezoneAbbreviation(): String =
        g_date_time_get_timezone_abbreviation(gPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Determines the offset to UTC in effect at the time and in the time
     * zone of @datetime.
     *
     * The offset is the number of microseconds that you add to UTC time to
     * arrive at local time for the time zone (ie: negative numbers for time
     * zones west of GMT, positive numbers for east).
     *
     * If @datetime represents UTC time, then the offset is always zero.
     *
     * @return the number of microseconds that should be added to UTC to
     *          get the local time
     * @since 2.26
     */
    @GLibVersion2_26
    public fun getUtcOffset(): TimeSpan = g_date_time_get_utc_offset(gPointer.reinterpret())

    /**
     * Returns the ISO 8601 week-numbering year in which the week containing
     * @datetime falls.
     *
     * This function, taken together with g_date_time_get_week_of_year() and
     * g_date_time_get_day_of_week() can be used to determine the full ISO
     * week date on which @datetime falls.
     *
     * This is usually equal to the normal Gregorian year (as returned by
     * g_date_time_get_year()), except as detailed below:
     *
     * For Thursday, the week-numbering year is always equal to the usual
     * calendar year.  For other days, the number is such that every day
     * within a complete week (Monday to Sunday) is contained within the
     * same week-numbering year.
     *
     * For Monday, Tuesday and Wednesday occurring near the end of the year,
     * this may mean that the week-numbering year is one greater than the
     * calendar year (so that these days have the same week-numbering year
     * as the Thursday occurring early in the next year).
     *
     * For Friday, Saturday and Sunday occurring near the start of the year,
     * this may mean that the week-numbering year is one less than the
     * calendar year (so that these days have the same week-numbering year
     * as the Thursday occurring late in the previous year).
     *
     * An equivalent description is that the week-numbering year is equal to
     * the calendar year containing the majority of the days in the current
     * week (Monday to Sunday).
     *
     * Note that January 1 0001 in the proleptic Gregorian calendar is a
     * Monday, so this function never returns 0.
     *
     * @return the ISO 8601 week-numbering year for @datetime
     * @since 2.26
     */
    @GLibVersion2_26
    public fun getWeekNumberingYear(): gint = g_date_time_get_week_numbering_year(gPointer.reinterpret())

    /**
     * Returns the ISO 8601 week number for the week containing @datetime.
     * The ISO 8601 week number is the same for every day of the week (from
     * Moday through Sunday).  That can produce some unusual results
     * (described below).
     *
     * The first week of the year is week 1.  This is the week that contains
     * the first Thursday of the year.  Equivalently, this is the first week
     * that has more than 4 of its days falling within the calendar year.
     *
     * The value 0 is never returned by this function.  Days contained
     * within a year but occurring before the first ISO 8601 week of that
     * year are considered as being contained in the last week of the
     * previous year.  Similarly, the final days of a calendar year may be
     * considered as being part of the first ISO 8601 week of the next year
     * if 4 or more days of that week are contained within the new year.
     *
     * @return the ISO 8601 week number for @datetime.
     * @since 2.26
     */
    @GLibVersion2_26
    public fun getWeekOfYear(): gint = g_date_time_get_week_of_year(gPointer.reinterpret())

    /**
     * Retrieves the year represented by @datetime in the Gregorian calendar.
     *
     * @return the year represented by @datetime
     * @since 2.26
     */
    @GLibVersion2_26
    public fun getYear(): gint = g_date_time_get_year(gPointer.reinterpret())

    /**
     * Hashes @datetime into a #guint, suitable for use within #GHashTable.
     *
     * @return a #guint containing the hash
     * @since 2.26
     */
    @GLibVersion2_26
    public fun hash(): guint = g_date_time_hash(gPointer.reinterpret())

    /**
     * Determines if daylight savings time is in effect at the time and in
     * the time zone of @datetime.
     *
     * @return true if daylight savings time is in effect
     * @since 2.26
     */
    @GLibVersion2_26
    public fun isDaylightSavings(): Boolean = g_date_time_is_daylight_savings(gPointer.reinterpret()).asBoolean()

    /**
     * Atomically increments the reference count of @datetime by one.
     *
     * @return the #GDateTime with the reference count increased
     * @since 2.26
     */
    @GLibVersion2_26
    public fun ref(): DateTime = g_date_time_ref(gPointer.reinterpret())!!.run {
        DateTime(reinterpret())
    }

    /**
     * Creates a new #GDateTime corresponding to the same instant in time as
     * @datetime, but in the local time zone.
     *
     * This call is equivalent to calling g_date_time_to_timezone() with the
     * time zone returned by g_time_zone_new_local().
     *
     * @return the newly created #GDateTime which
     *   should be freed with g_date_time_unref(), or null
     * @since 2.26
     */
    @GLibVersion2_26
    public fun toLocal(): DateTime? = g_date_time_to_local(gPointer.reinterpret())?.run {
        DateTime(reinterpret())
    }

    /**
     * Stores the instant in time that @datetime represents into @tv.
     *
     * The time contained in a #GTimeVal is always stored in the form of
     * seconds elapsed since 1970-01-01 00:00:00 UTC, regardless of the time
     * zone associated with @datetime.
     *
     * On systems where 'long' is 32bit (ie: all 32bit systems and all
     * Windows systems), a #GTimeVal is incapable of storing the entire
     * range of values that #GDateTime is capable of expressing.  On those
     * systems, this function returns false to indicate that the time is
     * out of range.
     *
     * On systems where 'long' is 64bit, this function never fails.
     *
     * @param tv a #GTimeVal to modify
     * @return true if successful, else false
     * @since 2.26
     */
    @GLibVersion2_26
    public fun toTimeval(tv: TimeVal): Boolean =
        g_date_time_to_timeval(gPointer.reinterpret(), tv.gPointer.reinterpret()).asBoolean()

    /**
     * Create a new #GDateTime corresponding to the same instant in time as
     * @datetime, but in the time zone @tz.
     *
     * This call can fail in the case that the time goes out of bounds.  For
     * example, converting 0001-01-01 00:00:00 UTC to a time zone west of
     * Greenwich will fail (due to the year 0 being out of range).
     *
     * @param tz the new #GTimeZone
     * @return the newly created #GDateTime which
     *   should be freed with g_date_time_unref(), or null
     * @since 2.26
     */
    @GLibVersion2_26
    public fun toTimezone(tz: TimeZone): DateTime? =
        g_date_time_to_timezone(gPointer.reinterpret(), tz.gPointer.reinterpret())?.run {
            DateTime(reinterpret())
        }

    /**
     * Gives the Unix time corresponding to @datetime, rounding down to the
     * nearest second.
     *
     * Unix time is the number of seconds that have elapsed since 1970-01-01
     * 00:00:00 UTC, regardless of the time zone associated with @datetime.
     *
     * @return the Unix time corresponding to @datetime
     * @since 2.26
     */
    @GLibVersion2_26
    public fun toUnix(): gint64 = g_date_time_to_unix(gPointer.reinterpret())

    /**
     * Gives the Unix time corresponding to @datetime, in microseconds.
     *
     * Unix time is the number of microseconds that have elapsed since 1970-01-01
     * 00:00:00 UTC, regardless of the time zone associated with @datetime.
     *
     * @return the Unix time corresponding to @datetime
     * @since 2.80
     */
    @GLibVersion2_80
    public fun toUnixUsec(): gint64 = g_date_time_to_unix_usec(gPointer.reinterpret())

    /**
     * Creates a new #GDateTime corresponding to the same instant in time as
     * @datetime, but in UTC.
     *
     * This call is equivalent to calling g_date_time_to_timezone() with the
     * time zone returned by g_time_zone_new_utc().
     *
     * @return the newly created #GDateTime which
     *   should be freed with g_date_time_unref(), or null
     * @since 2.26
     */
    @GLibVersion2_26
    public fun toUtc(): DateTime? = g_date_time_to_utc(gPointer.reinterpret())?.run {
        DateTime(reinterpret())
    }

    /**
     * Atomically decrements the reference count of @datetime by one.
     *
     * When the reference count reaches zero, the resources allocated by
     * @datetime are freed
     *
     * @since 2.26
     */
    @GLibVersion2_26
    public fun unref(): Unit = g_date_time_unref(gPointer.reinterpret())

    public companion object {
        /**
         * Creates a new #GDateTime corresponding to the given date and time in
         * the time zone @tz.
         *
         * The @year must be between 1 and 9999, @month between 1 and 12 and @day
         * between 1 and 28, 29, 30 or 31 depending on the month and the year.
         *
         * @hour must be between 0 and 23 and @minute must be between 0 and 59.
         *
         * @seconds must be at least 0.0 and must be strictly less than 60.0.
         * It will be rounded down to the nearest microsecond.
         *
         * If the given time is not representable in the given time zone (for
         * example, 02:30 on March 14th 2010 in Toronto, due to daylight savings
         * time) then the time will be rounded up to the nearest existing time
         * (in this case, 03:00).  If this matters to you then you should verify
         * the return value for containing the same as the numbers you gave.
         *
         * In the case that the given time is ambiguous in the given time zone
         * (for example, 01:30 on November 7th 2010 in Toronto, due to daylight
         * savings time) then the time falling within standard (ie:
         * non-daylight) time is taken.
         *
         * It not considered a programmer error for the values to this function
         * to be out of range, but in the case that they are, the function will
         * return null.
         *
         * You should release the return value by calling g_date_time_unref()
         * when you are done with it.
         *
         * @param tz a #GTimeZone
         * @param year the year component of the date
         * @param month the month component of the date
         * @param day the day component of the date
         * @param hour the hour component of the date
         * @param minute the minute component of the date
         * @param seconds the number of seconds past the minute
         * @return a new #GDateTime, or null
         * @since 2.26
         */
        public fun new(
            tz: TimeZone,
            year: gint,
            month: gint,
            day: gint,
            hour: gint,
            minute: gint,
            seconds: gdouble,
        ): DateTime? = DateTime(
            g_date_time_new(tz.gPointer.reinterpret(), year, month, day, hour, minute, seconds)!!.reinterpret()
        )

        /**
         * Creates a #GDateTime corresponding to the given
         * [ISO 8601 formatted string](https://en.wikipedia.org/wiki/ISO_8601)
         * @text. ISO 8601 strings of the form <date><sep><time><tz> are supported, with
         * some extensions from [RFC 3339](https://tools.ietf.org/html/rfc3339) as
         * mentioned below.
         *
         * Note that as #GDateTime "is oblivious to leap seconds", leap seconds information
         * in an ISO-8601 string will be ignored, so a `23:59:60` time would be parsed as
         * `23:59:59`.
         *
         * <sep> is the separator and can be either 'T', 't' or ' '. The latter two
         * separators are an extension from
         * [RFC 3339](https://tools.ietf.org/html/rfc3339#section-5.6).
         *
         * <date> is in the form:
         *
         * - `YYYY-MM-DD` - Year/month/day, e.g. 2016-08-24.
         * - `YYYYMMDD` - Same as above without dividers.
         * - `YYYY-DDD` - Ordinal day where DDD is from 001 to 366, e.g. 2016-237.
         * - `YYYYDDD` - Same as above without dividers.
         * - `YYYY-Www-D` - Week day where ww is from 01 to 52 and D from 1-7,
         *   e.g. 2016-W34-3.
         * - `YYYYWwwD` - Same as above without dividers.
         *
         * <time> is in the form:
         *
         * - `hh:mm:ss(.sss)` - Hours, minutes, seconds (subseconds), e.g. 22:10:42.123.
         * - `hhmmss(.sss)` - Same as above without dividers.
         *
         * <tz> is an optional timezone suffix of the form:
         *
         * - `Z` - UTC.
         * - `+hh:mm` or `-hh:mm` - Offset from UTC in hours and minutes, e.g. +12:00.
         * - `+hh` or `-hh` - Offset from UTC in hours, e.g. +12.
         *
         * If the timezone is not provided in @text it must be provided in @default_tz
         * (this field is otherwise ignored).
         *
         * This call can fail (returning null) if @text is not a valid ISO 8601
         * formatted string.
         *
         * You should release the return value by calling g_date_time_unref()
         * when you are done with it.
         *
         * @param text an ISO 8601 formatted time string.
         * @param defaultTz a #GTimeZone to use if the text doesn't contain a
         *                          timezone, or null.
         * @return a new #GDateTime, or null
         * @since 2.56
         */
        public fun newFromIso8601(text: String, defaultTz: TimeZone? = null): DateTime? =
            DateTime(g_date_time_new_from_iso8601(text, defaultTz?.gPointer?.reinterpret())!!.reinterpret())

        /**
         * Creates a #GDateTime corresponding to the given #GTimeVal @tv in the
         * local time zone.
         *
         * The time contained in a #GTimeVal is always stored in the form of
         * seconds elapsed since 1970-01-01 00:00:00 UTC, regardless of the
         * local time offset.
         *
         * This call can fail (returning null) if @tv represents a time outside
         * of the supported range of #GDateTime.
         *
         * You should release the return value by calling g_date_time_unref()
         * when you are done with it.
         *
         * @param tv a #GTimeVal
         * @return a new #GDateTime, or null
         * @since 2.26
         */
        public fun newFromTimevalLocal(tv: TimeVal): DateTime? =
            DateTime(g_date_time_new_from_timeval_local(tv.gPointer.reinterpret())!!.reinterpret())

        /**
         * Creates a #GDateTime corresponding to the given #GTimeVal @tv in UTC.
         *
         * The time contained in a #GTimeVal is always stored in the form of
         * seconds elapsed since 1970-01-01 00:00:00 UTC.
         *
         * This call can fail (returning null) if @tv represents a time outside
         * of the supported range of #GDateTime.
         *
         * You should release the return value by calling g_date_time_unref()
         * when you are done with it.
         *
         * @param tv a #GTimeVal
         * @return a new #GDateTime, or null
         * @since 2.26
         */
        public fun newFromTimevalUtc(tv: TimeVal): DateTime? =
            DateTime(g_date_time_new_from_timeval_utc(tv.gPointer.reinterpret())!!.reinterpret())

        /**
         * Creates a #GDateTime corresponding to the given Unix time @t in the
         * local time zone.
         *
         * Unix time is the number of seconds that have elapsed since 1970-01-01
         * 00:00:00 UTC, regardless of the local time offset.
         *
         * This call can fail (returning null) if @t represents a time outside
         * of the supported range of #GDateTime.
         *
         * You should release the return value by calling g_date_time_unref()
         * when you are done with it.
         *
         * @param t the Unix time
         * @return a new #GDateTime, or null
         * @since 2.26
         */
        public fun newFromUnixLocal(t: gint64): DateTime? = DateTime(g_date_time_new_from_unix_local(t)!!.reinterpret())

        /**
         * Creates a [struct@GLib.DateTime] corresponding to the given Unix time @t in the
         * local time zone.
         *
         * Unix time is the number of microseconds that have elapsed since 1970-01-01
         * 00:00:00 UTC, regardless of the local time offset.
         *
         * This call can fail (returning `NULL`) if @t represents a time outside
         * of the supported range of #GDateTime.
         *
         * You should release the return value by calling [method@GLib.DateTime.unref]
         * when you are done with it.
         *
         * @param usecs the Unix time in microseconds
         * @return a new [struct@GLib.DateTime], or `NULL`
         * @since 2.80
         */
        public fun newFromUnixLocalUsec(usecs: gint64): DateTime? =
            DateTime(g_date_time_new_from_unix_local_usec(usecs)!!.reinterpret())

        /**
         * Creates a #GDateTime corresponding to the given Unix time @t in UTC.
         *
         * Unix time is the number of seconds that have elapsed since 1970-01-01
         * 00:00:00 UTC.
         *
         * This call can fail (returning null) if @t represents a time outside
         * of the supported range of #GDateTime.
         *
         * You should release the return value by calling g_date_time_unref()
         * when you are done with it.
         *
         * @param t the Unix time
         * @return a new #GDateTime, or null
         * @since 2.26
         */
        public fun newFromUnixUtc(t: gint64): DateTime? = DateTime(g_date_time_new_from_unix_utc(t)!!.reinterpret())

        /**
         * Creates a [struct@GLib.DateTime] corresponding to the given Unix time @t in UTC.
         *
         * Unix time is the number of microseconds that have elapsed since 1970-01-01
         * 00:00:00 UTC.
         *
         * This call can fail (returning `NULL`) if @t represents a time outside
         * of the supported range of #GDateTime.
         *
         * You should release the return value by calling [method@GLib.DateTime.unref]
         * when you are done with it.
         *
         * @param usecs the Unix time in microseconds
         * @return a new [struct@GLib.DateTime], or `NULL`
         * @since 2.80
         */
        public fun newFromUnixUtcUsec(usecs: gint64): DateTime? =
            DateTime(g_date_time_new_from_unix_utc_usec(usecs)!!.reinterpret())

        /**
         * Creates a new #GDateTime corresponding to the given date and time in
         * the local time zone.
         *
         * This call is equivalent to calling g_date_time_new() with the time
         * zone returned by g_time_zone_new_local().
         *
         * @param year the year component of the date
         * @param month the month component of the date
         * @param day the day component of the date
         * @param hour the hour component of the date
         * @param minute the minute component of the date
         * @param seconds the number of seconds past the minute
         * @return a #GDateTime, or null
         * @since 2.26
         */
        public fun newLocal(
            year: gint,
            month: gint,
            day: gint,
            hour: gint,
            minute: gint,
            seconds: gdouble,
        ): DateTime? = DateTime(g_date_time_new_local(year, month, day, hour, minute, seconds)!!.reinterpret())

        /**
         * Creates a #GDateTime corresponding to this exact instant in the given
         * time zone @tz.  The time is as accurate as the system allows, to a
         * maximum accuracy of 1 microsecond.
         *
         * This function will always succeed unless GLib is still being used after the
         * year 9999.
         *
         * You should release the return value by calling g_date_time_unref()
         * when you are done with it.
         *
         * @param tz a #GTimeZone
         * @return a new #GDateTime, or null
         * @since 2.26
         */
        public fun newNow(tz: TimeZone): DateTime? =
            DateTime(g_date_time_new_now(tz.gPointer.reinterpret())!!.reinterpret())

        /**
         * Creates a #GDateTime corresponding to this exact instant in the local
         * time zone.
         *
         * This is equivalent to calling g_date_time_new_now() with the time
         * zone returned by g_time_zone_new_local().
         *
         * @return a new #GDateTime, or null
         * @since 2.26
         */
        public fun newNowLocal(): DateTime? = DateTime(g_date_time_new_now_local()!!.reinterpret())

        /**
         * Creates a #GDateTime corresponding to this exact instant in UTC.
         *
         * This is equivalent to calling g_date_time_new_now() with the time
         * zone returned by g_time_zone_new_utc().
         *
         * @return a new #GDateTime, or null
         * @since 2.26
         */
        public fun newNowUtc(): DateTime? = DateTime(g_date_time_new_now_utc()!!.reinterpret())

        /**
         * Creates a new #GDateTime corresponding to the given date and time in
         * UTC.
         *
         * This call is equivalent to calling g_date_time_new() with the time
         * zone returned by g_time_zone_new_utc().
         *
         * @param year the year component of the date
         * @param month the month component of the date
         * @param day the day component of the date
         * @param hour the hour component of the date
         * @param minute the minute component of the date
         * @param seconds the number of seconds past the minute
         * @return a #GDateTime, or null
         * @since 2.26
         */
        public fun newUtc(year: gint, month: gint, day: gint, hour: gint, minute: gint, seconds: gdouble): DateTime? =
            DateTime(g_date_time_new_utc(year, month, day, hour, minute, seconds)!!.reinterpret())

        /**
         * Get the GType of DateTime
         *
         * @return the GType
         */
        public fun getType(): GType = g_date_time_get_type()
    }
}
