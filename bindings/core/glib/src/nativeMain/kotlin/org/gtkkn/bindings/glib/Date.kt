// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.annotations.GLibVersion2_10
import org.gtkkn.bindings.glib.annotations.GLibVersion2_56
import org.gtkkn.bindings.glib.annotations.GLibVersion2_6
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GDate
import org.gtkkn.native.glib.g_date_add_days
import org.gtkkn.native.glib.g_date_add_months
import org.gtkkn.native.glib.g_date_add_years
import org.gtkkn.native.glib.g_date_clamp
import org.gtkkn.native.glib.g_date_clear
import org.gtkkn.native.glib.g_date_compare
import org.gtkkn.native.glib.g_date_copy
import org.gtkkn.native.glib.g_date_days_between
import org.gtkkn.native.glib.g_date_free
import org.gtkkn.native.glib.g_date_get_day_of_year
import org.gtkkn.native.glib.g_date_get_iso8601_week_of_year
import org.gtkkn.native.glib.g_date_get_julian
import org.gtkkn.native.glib.g_date_get_monday_week_of_year
import org.gtkkn.native.glib.g_date_get_month
import org.gtkkn.native.glib.g_date_get_sunday_week_of_year
import org.gtkkn.native.glib.g_date_get_weekday
import org.gtkkn.native.glib.g_date_is_first_of_month
import org.gtkkn.native.glib.g_date_is_last_of_month
import org.gtkkn.native.glib.g_date_new
import org.gtkkn.native.glib.g_date_new_julian
import org.gtkkn.native.glib.g_date_order
import org.gtkkn.native.glib.g_date_set_julian
import org.gtkkn.native.glib.g_date_set_month
import org.gtkkn.native.glib.g_date_set_parse
import org.gtkkn.native.glib.g_date_set_time_val
import org.gtkkn.native.glib.g_date_subtract_days
import org.gtkkn.native.glib.g_date_subtract_months
import org.gtkkn.native.glib.g_date_subtract_years
import org.gtkkn.native.glib.g_date_valid
import org.gtkkn.native.glib.g_date_valid_julian
import org.gtkkn.native.glib.g_date_valid_month
import org.gtkkn.native.glib.g_date_valid_weekday
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.Unit

/**
 * `GDate` is a struct for calendrical calculations.
 *
 * The `GDate` data structure represents a day between January 1, Year 1,
 * and sometime a few thousand years in the future (right now it will go
 * to the year 65535 or so, but [method@GLib.Date.set_parse] only parses up to the
 * year 8000 or so - just count on "a few thousand"). `GDate` is meant to
 * represent everyday dates, not astronomical dates or historical dates
 * or ISO timestamps or the like. It extrapolates the current Gregorian
 * calendar forward and backward in time; there is no attempt to change
 * the calendar to match time periods or locations. `GDate` does not store
 * time information; it represents a day.
 *
 * The `GDate` implementation has several nice features; it is only a
 * 64-bit struct, so storing large numbers of dates is very efficient. It
 * can keep both a Julian and day-month-year representation of the date,
 * since some calculations are much easier with one representation or the
 * other. A Julian representation is simply a count of days since some
 * fixed day in the past; for #GDate the fixed day is January 1, 1 AD.
 * ("Julian" dates in the #GDate API aren't really Julian dates in the
 * technical sense; technically, Julian dates count from the start of the
 * Julian period, Jan 1, 4713 BC).
 *
 * `GDate` is simple to use. First you need a "blank" date; you can get a
 * dynamically allocated date from [ctor@GLib.Date.new], or you can declare an
 * automatic variable or array and initialize it by calling [method@GLib.Date.clear].
 * A cleared date is safe; it's safe to call [method@GLib.Date.set_dmy] and the other
 * mutator functions to initialize the value of a cleared date. However, a cleared date
 * is initially invalid, meaning that it doesn't represent a day that exists.
 * It is undefined to call any of the date calculation routines on an invalid date.
 * If you obtain a date from a user or other unpredictable source, you should check
 * its validity with the [method@GLib.Date.valid] predicate. [method@GLib.Date.valid]
 * is also used to check for errors with [method@GLib.Date.set_parse] and other functions
 * that can fail. Dates can be invalidated by calling [method@GLib.Date.clear] again.
 *
 * It is very important to use the API to access the `GDate` struct. Often only the
 * day-month-year or only the Julian representation is valid. Sometimes neither is valid.
 * Use the API.
 *
 * GLib also features `GDateTime` which represents a precise time.
 *
 * ## Skipped during bindings generation
 *
 * - method `get_day`: Return type DateDay is unsupported
 * - method `get_year`: Return type DateYear is unsupported
 * - parameter `day`: DateDay
 * - parameter `day`: DateDay
 * - parameter `time_`: Time
 * - parameter `timet`: time_t
 * - parameter `year`: DateYear
 * - parameter `tm`: gpointer
 * - parameter `day`: DateDay
 * - parameter `year`: DateYear
 * - parameter `year`: DateYear
 * - parameter `year`: DateYear
 * - parameter `year`: DateYear
 * - function `strftime`: C function g_date_strftime is ignored
 * - parameter `day`: DateDay
 * - parameter `day`: DateDay
 * - parameter `year`: DateYear
 */
public class Date(
    pointer: CPointer<GDate>,
) : Record {
    public val glibDatePointer: CPointer<GDate> = pointer

    /**
     * the Julian representation of the date
     */
    public var julianDays: UInt
        get() = glibDatePointer.pointed.julian_days
        set(`value`) {
            glibDatePointer.pointed.julian_days = value
        }

    /**
     * this bit is set if @julian_days is valid
     */
    public var julian: UInt
        get() = glibDatePointer.pointed.julian
        set(`value`) {
            glibDatePointer.pointed.julian = value
        }

    /**
     * this is set if @day, @month and @year are valid
     */
    public var dmy: UInt
        get() = glibDatePointer.pointed.dmy
        set(`value`) {
            glibDatePointer.pointed.dmy = value
        }

    /**
     * the day of the day-month-year representation of the date,
     *   as a number between 1 and 31
     */
    public var day: UInt
        get() = glibDatePointer.pointed.day
        set(`value`) {
            glibDatePointer.pointed.day = value
        }

    /**
     * the month of the day-month-year representation of the date,
     *   as a number between 1 and 12
     */
    public var month: UInt
        get() = glibDatePointer.pointed.month
        set(`value`) {
            glibDatePointer.pointed.month = value
        }

    /**
     * the year of the day-month-year representation of the date
     */
    public var year: UInt
        get() = glibDatePointer.pointed.year
        set(`value`) {
            glibDatePointer.pointed.year = value
        }

    /**
     * Increments a date some number of days.
     * To move forward by weeks, add weeks*7 days.
     * The date must be valid.
     *
     * @param nDays number of days to move the date forward
     */
    public fun addDays(nDays: UInt): Unit = g_date_add_days(glibDatePointer.reinterpret(), nDays)

    /**
     * Increments a date by some number of months.
     * If the day of the month is greater than 28,
     * this routine may change the day of the month
     * (because the destination month may not have
     * the current day in it). The date must be valid.
     *
     * @param nMonths number of months to move forward
     */
    public fun addMonths(nMonths: UInt): Unit = g_date_add_months(glibDatePointer.reinterpret(), nMonths)

    /**
     * Increments a date by some number of years.
     * If the date is February 29, and the destination
     * year is not a leap year, the date will be changed
     * to February 28. The date must be valid.
     *
     * @param nYears number of years to move forward
     */
    public fun addYears(nYears: UInt): Unit = g_date_add_years(glibDatePointer.reinterpret(), nYears)

    /**
     * If @date is prior to @min_date, sets @date equal to @min_date.
     * If @date falls after @max_date, sets @date equal to @max_date.
     * Otherwise, @date is unchanged.
     * Either of @min_date and @max_date may be null.
     * All non-null dates must be valid.
     *
     * @param minDate minimum accepted value for @date
     * @param maxDate maximum accepted value for @date
     */
    public fun clamp(
        minDate: Date,
        maxDate: Date,
    ): Unit = g_date_clamp(glibDatePointer.reinterpret(), minDate.glibDatePointer, maxDate.glibDatePointer)

    /**
     * Initializes one or more #GDate structs to a safe but invalid
     * state. The cleared dates will not represent an existing date, but will
     * not contain garbage. Useful to init a date declared on the stack.
     * Validity can be tested with g_date_valid().
     *
     * @param nDates number of dates to clear
     */
    public fun clear(nDates: UInt): Unit = g_date_clear(glibDatePointer.reinterpret(), nDates)

    /**
     * qsort()-style comparison function for dates.
     * Both dates must be valid.
     *
     * @param rhs second date to compare
     * @return 0 for equal, less than zero if @lhs is less than @rhs,
     *     greater than zero if @lhs is greater than @rhs
     */
    public fun compare(rhs: Date): Int = g_date_compare(glibDatePointer.reinterpret(), rhs.glibDatePointer)

    /**
     * Copies a GDate to a newly-allocated GDate. If the input was invalid
     * (as determined by g_date_valid()), the invalid state will be copied
     * as is into the new object.
     *
     * @return a newly-allocated #GDate initialized from @date
     * @since 2.56
     */
    @GLibVersion2_56
    public fun copy(): Date =
        g_date_copy(glibDatePointer.reinterpret())!!.run {
            Date(reinterpret())
        }

    /**
     * Computes the number of days between two dates.
     * If @date2 is prior to @date1, the returned value is negative.
     * Both dates must be valid.
     *
     * @param date2 the second date
     * @return the number of days between @date1 and @date2
     */
    public fun daysBetween(date2: Date): Int = g_date_days_between(glibDatePointer.reinterpret(), date2.glibDatePointer)

    /**
     * Frees a #GDate returned from g_date_new().
     */
    public fun free(): Unit = g_date_free(glibDatePointer.reinterpret())

    /**
     * Returns the day of the year, where Jan 1 is the first day of the
     * year. The date must be valid.
     *
     * @return day of the year
     */
    public fun getDayOfYear(): UInt = g_date_get_day_of_year(glibDatePointer.reinterpret())

    /**
     * Returns the week of the year, where weeks are interpreted according
     * to ISO 8601.
     *
     * @return ISO 8601 week number of the year.
     * @since 2.6
     */
    @GLibVersion2_6
    public fun getIso8601WeekOfYear(): UInt = g_date_get_iso8601_week_of_year(glibDatePointer.reinterpret())

    /**
     * Returns the Julian day or "serial number" of the #GDate. The
     * Julian day is simply the number of days since January 1, Year 1; i.e.,
     * January 1, Year 1 is Julian day 1; January 2, Year 1 is Julian day 2,
     * etc. The date must be valid.
     *
     * @return Julian day
     */
    public fun getJulian(): UInt = g_date_get_julian(glibDatePointer.reinterpret())

    /**
     * Returns the week of the year, where weeks are understood to start on
     * Monday. If the date is before the first Monday of the year, return 0.
     * The date must be valid.
     *
     * @return week of the year
     */
    public fun getMondayWeekOfYear(): UInt = g_date_get_monday_week_of_year(glibDatePointer.reinterpret())

    /**
     * Returns the month of the year. The date must be valid.
     *
     * @return month of the year as a #GDateMonth
     */
    public fun getMonth(): DateMonth =
        g_date_get_month(glibDatePointer.reinterpret()).run {
            DateMonth.fromNativeValue(this)
        }

    /**
     * Returns the week of the year during which this date falls, if
     * weeks are understood to begin on Sunday. The date must be valid.
     * Can return 0 if the day is before the first Sunday of the year.
     *
     * @return week number
     */
    public fun getSundayWeekOfYear(): UInt = g_date_get_sunday_week_of_year(glibDatePointer.reinterpret())

    /**
     * Returns the day of the week for a #GDate. The date must be valid.
     *
     * @return day of the week as a #GDateWeekday.
     */
    public fun getWeekday(): DateWeekday =
        g_date_get_weekday(glibDatePointer.reinterpret()).run {
            DateWeekday.fromNativeValue(this)
        }

    /**
     * Returns true if the date is on the first of a month.
     * The date must be valid.
     *
     * @return true if the date is the first of the month
     */
    public fun isFirstOfMonth(): Boolean = g_date_is_first_of_month(glibDatePointer.reinterpret()).asBoolean()

    /**
     * Returns true if the date is the last day of the month.
     * The date must be valid.
     *
     * @return true if the date is the last day of the month
     */
    public fun isLastOfMonth(): Boolean = g_date_is_last_of_month(glibDatePointer.reinterpret()).asBoolean()

    /**
     * Checks if @date1 is less than or equal to @date2,
     * and swap the values if this is not the case.
     *
     * @param date2 the second date
     */
    public fun order(date2: Date): Unit = g_date_order(glibDatePointer.reinterpret(), date2.glibDatePointer)

    /**
     * Sets the value of a #GDate from a Julian day number.
     *
     * @param julianDate Julian day number (days since January 1, Year 1)
     */
    public fun setJulian(julianDate: UInt): Unit = g_date_set_julian(glibDatePointer.reinterpret(), julianDate)

    /**
     * Sets the month of the year for a #GDate.  If the resulting
     * day-month-year triplet is invalid, the date will be invalid.
     *
     * @param month month to set
     */
    public fun setMonth(month: DateMonth): Unit = g_date_set_month(glibDatePointer.reinterpret(), month.nativeValue)

    /**
     * Parses a user-inputted string @str, and try to figure out what date it
     * represents, taking the [current locale][setlocale] into account. If the
     * string is successfully parsed, the date will be valid after the call.
     * Otherwise, it will be invalid. You should check using g_date_valid()
     * to see whether the parsing succeeded.
     *
     * This function is not appropriate for file formats and the like; it
     * isn't very precise, and its exact behavior varies with the locale.
     * It's intended to be a heuristic routine that guesses what the user
     * means by a given string (and it does work pretty well in that
     * capacity).
     *
     * @param str string to parse
     */
    public fun setParse(str: String): Unit = g_date_set_parse(glibDatePointer.reinterpret(), str)

    /**
     * Sets the value of a date from a #GTimeVal value.  Note that the
     * @tv_usec member is ignored, because #GDate can't make use of the
     * additional precision.
     *
     * The time to date conversion is done using the user's current timezone.
     *
     * @param timeval #GTimeVal value to set
     * @since 2.10
     */
    @GLibVersion2_10
    public fun setTimeVal(timeval: TimeVal): Unit =
        g_date_set_time_val(glibDatePointer.reinterpret(), timeval.glibTimeValPointer)

    /**
     * Moves a date some number of days into the past.
     * To move by weeks, just move by weeks*7 days.
     * The date must be valid.
     *
     * @param nDays number of days to move
     */
    public fun subtractDays(nDays: UInt): Unit = g_date_subtract_days(glibDatePointer.reinterpret(), nDays)

    /**
     * Moves a date some number of months into the past.
     * If the current day of the month doesn't exist in
     * the destination month, the day of the month
     * may change. The date must be valid.
     *
     * @param nMonths number of months to move
     */
    public fun subtractMonths(nMonths: UInt): Unit = g_date_subtract_months(glibDatePointer.reinterpret(), nMonths)

    /**
     * Moves a date some number of years into the past.
     * If the current day doesn't exist in the destination
     * year (i.e. it's February 29 and you move to a non-leap-year)
     * then the day is changed to February 29. The date
     * must be valid.
     *
     * @param nYears number of years to move
     */
    public fun subtractYears(nYears: UInt): Unit = g_date_subtract_years(glibDatePointer.reinterpret(), nYears)

    /**
     * Returns true if the #GDate represents an existing day. The date must not
     * contain garbage; it should have been initialized with g_date_clear()
     * if it wasn't allocated by one of the g_date_new() variants.
     *
     * @return Whether the date is valid
     */
    public fun valid(): Boolean = g_date_valid(glibDatePointer.reinterpret()).asBoolean()

    public companion object : RecordCompanion<Date, GDate> {
        /**
         * Allocates a #GDate and initializes
         * it to a safe state. The new date will
         * be cleared (as if you'd called g_date_clear()) but invalid (it won't
         * represent an existing day). Free the return value with g_date_free().
         *
         * @return a newly-allocated #GDate
         */
        public fun new(): Date = Date(g_date_new()!!.reinterpret())

        /**
         * Create a new #GDate representing the given Julian date.
         *
         * The @julian_day you pass in must be valid. Use g_date_valid_julian() if
         * needed to validate it. The returned #GDate is guaranteed to be non-null and
         * valid.
         *
         * @param julianDay days since January 1, Year 1
         * @return a newly-allocated #GDate initialized
         *   with @julian_day
         */
        public fun newJulian(julianDay: UInt): Date = Date(g_date_new_julian(julianDay)!!.reinterpret())

        /**
         * Returns true if the Julian day is valid. Anything greater than zero
         * is basically a valid Julian, though there is a 32-bit limit.
         *
         * @param julianDate Julian day to check
         * @return true if the Julian day is valid
         */
        public fun validJulian(julianDate: UInt): Boolean = g_date_valid_julian(julianDate).asBoolean()

        /**
         * Returns true if the month value is valid. The 12 #GDateMonth
         * enumeration values are the only valid months.
         *
         * @param month month
         * @return true if the month is valid
         */
        public fun validMonth(month: DateMonth): Boolean = g_date_valid_month(month.nativeValue).asBoolean()

        /**
         * Returns true if the weekday is valid. The seven #GDateWeekday enumeration
         * values are the only valid weekdays.
         *
         * @param weekday weekday
         * @return true if the weekday is valid
         */
        public fun validWeekday(weekday: DateWeekday): Boolean = g_date_valid_weekday(weekday.nativeValue).asBoolean()

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Date = Date(pointer.reinterpret())
    }
}
