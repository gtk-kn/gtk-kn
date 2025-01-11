// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.annotations.GLibVersion2_10
import org.gtkkn.bindings.glib.annotations.GLibVersion2_56
import org.gtkkn.bindings.glib.annotations.GLibVersion2_6
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
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
import org.gtkkn.native.glib.g_date_get_day
import org.gtkkn.native.glib.g_date_get_day_of_year
import org.gtkkn.native.glib.g_date_get_days_in_month
import org.gtkkn.native.glib.g_date_get_iso8601_week_of_year
import org.gtkkn.native.glib.g_date_get_julian
import org.gtkkn.native.glib.g_date_get_monday_week_of_year
import org.gtkkn.native.glib.g_date_get_monday_weeks_in_year
import org.gtkkn.native.glib.g_date_get_month
import org.gtkkn.native.glib.g_date_get_sunday_week_of_year
import org.gtkkn.native.glib.g_date_get_sunday_weeks_in_year
import org.gtkkn.native.glib.g_date_get_weekday
import org.gtkkn.native.glib.g_date_get_year
import org.gtkkn.native.glib.g_date_is_first_of_month
import org.gtkkn.native.glib.g_date_is_last_of_month
import org.gtkkn.native.glib.g_date_is_leap_year
import org.gtkkn.native.glib.g_date_new
import org.gtkkn.native.glib.g_date_new_dmy
import org.gtkkn.native.glib.g_date_new_julian
import org.gtkkn.native.glib.g_date_order
import org.gtkkn.native.glib.g_date_set_day
import org.gtkkn.native.glib.g_date_set_dmy
import org.gtkkn.native.glib.g_date_set_julian
import org.gtkkn.native.glib.g_date_set_month
import org.gtkkn.native.glib.g_date_set_parse
import org.gtkkn.native.glib.g_date_set_time
import org.gtkkn.native.glib.g_date_set_time_t
import org.gtkkn.native.glib.g_date_set_time_val
import org.gtkkn.native.glib.g_date_set_year
import org.gtkkn.native.glib.g_date_subtract_days
import org.gtkkn.native.glib.g_date_subtract_months
import org.gtkkn.native.glib.g_date_subtract_years
import org.gtkkn.native.glib.g_date_valid
import org.gtkkn.native.glib.g_date_valid_day
import org.gtkkn.native.glib.g_date_valid_dmy
import org.gtkkn.native.glib.g_date_valid_julian
import org.gtkkn.native.glib.g_date_valid_month
import org.gtkkn.native.glib.g_date_valid_weekday
import org.gtkkn.native.glib.g_date_valid_year
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.glib.guint8
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_date_get_type
import kotlin.Boolean
import kotlin.Long
import kotlin.String
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
 * - parameter `tm`: Unsupported pointer to primitive type
 */
public class Date(public val glibDatePointer: CPointer<GDate>) : ProxyInstance(glibDatePointer) {
    /**
     * the Julian representation of the date
     */
    public var julianDays: guint
        get() = glibDatePointer.pointed.julian_days

        @UnsafeFieldSetter
        set(`value`) {
            glibDatePointer.pointed.julian_days = value
        }

    /**
     * this bit is set if @julian_days is valid
     */
    public var julian: guint
        get() = glibDatePointer.pointed.julian

        @UnsafeFieldSetter
        set(`value`) {
            glibDatePointer.pointed.julian = value
        }

    /**
     * this is set if @day, @month and @year are valid
     */
    public var dmy: guint
        get() = glibDatePointer.pointed.dmy

        @UnsafeFieldSetter
        set(`value`) {
            glibDatePointer.pointed.dmy = value
        }

    /**
     * the day of the day-month-year representation of the date,
     *   as a number between 1 and 31
     */
    public var day: guint
        get() = glibDatePointer.pointed.day

        @UnsafeFieldSetter
        set(`value`) {
            glibDatePointer.pointed.day = value
        }

    /**
     * the month of the day-month-year representation of the date,
     *   as a number between 1 and 12
     */
    public var month: guint
        get() = glibDatePointer.pointed.month

        @UnsafeFieldSetter
        set(`value`) {
            glibDatePointer.pointed.month = value
        }

    /**
     * the year of the day-month-year representation of the date
     */
    public var year: guint
        get() = glibDatePointer.pointed.year

        @UnsafeFieldSetter
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
    public fun addDays(nDays: guint): Unit = g_date_add_days(glibDatePointer, nDays)

    /**
     * Increments a date by some number of months.
     * If the day of the month is greater than 28,
     * this routine may change the day of the month
     * (because the destination month may not have
     * the current day in it). The date must be valid.
     *
     * @param nMonths number of months to move forward
     */
    public fun addMonths(nMonths: guint): Unit = g_date_add_months(glibDatePointer, nMonths)

    /**
     * Increments a date by some number of years.
     * If the date is February 29, and the destination
     * year is not a leap year, the date will be changed
     * to February 28. The date must be valid.
     *
     * @param nYears number of years to move forward
     */
    public fun addYears(nYears: guint): Unit = g_date_add_years(glibDatePointer, nYears)

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
    public fun clamp(minDate: Date, maxDate: Date): Unit =
        g_date_clamp(glibDatePointer, minDate.glibDatePointer, maxDate.glibDatePointer)

    /**
     * Initializes one or more #GDate structs to a safe but invalid
     * state. The cleared dates will not represent an existing date, but will
     * not contain garbage. Useful to init a date declared on the stack.
     * Validity can be tested with g_date_valid().
     *
     * @param nDates number of dates to clear
     */
    public fun clear(nDates: guint): Unit = g_date_clear(glibDatePointer, nDates)

    /**
     * qsort()-style comparison function for dates.
     * Both dates must be valid.
     *
     * @param rhs second date to compare
     * @return 0 for equal, less than zero if @lhs is less than @rhs,
     *     greater than zero if @lhs is greater than @rhs
     */
    public fun compare(rhs: Date): gint = g_date_compare(glibDatePointer, rhs.glibDatePointer)

    /**
     * Copies a GDate to a newly-allocated GDate. If the input was invalid
     * (as determined by g_date_valid()), the invalid state will be copied
     * as is into the new object.
     *
     * @return a newly-allocated #GDate initialized from @date
     * @since 2.56
     */
    @GLibVersion2_56
    public fun copy(): Date = g_date_copy(glibDatePointer)!!.run {
        Date(this)
    }

    /**
     * Computes the number of days between two dates.
     * If @date2 is prior to @date1, the returned value is negative.
     * Both dates must be valid.
     *
     * @param date2 the second date
     * @return the number of days between @date1 and @date2
     */
    public fun daysBetween(date2: Date): gint = g_date_days_between(glibDatePointer, date2.glibDatePointer)

    /**
     * Frees a #GDate returned from g_date_new().
     */
    public fun free(): Unit = g_date_free(glibDatePointer)

    /**
     * Returns the day of the month. The date must be valid.
     *
     * @return day of the month
     */
    public fun getDay(): DateDay = g_date_get_day(glibDatePointer)

    /**
     * Returns the day of the year, where Jan 1 is the first day of the
     * year. The date must be valid.
     *
     * @return day of the year
     */
    public fun getDayOfYear(): guint = g_date_get_day_of_year(glibDatePointer)

    /**
     * Returns the week of the year, where weeks are interpreted according
     * to ISO 8601.
     *
     * @return ISO 8601 week number of the year.
     * @since 2.6
     */
    @GLibVersion2_6
    public fun getIso8601WeekOfYear(): guint = g_date_get_iso8601_week_of_year(glibDatePointer)

    /**
     * Returns the Julian day or "serial number" of the #GDate. The
     * Julian day is simply the number of days since January 1, Year 1; i.e.,
     * January 1, Year 1 is Julian day 1; January 2, Year 1 is Julian day 2,
     * etc. The date must be valid.
     *
     * @return Julian day
     */
    public fun getJulian(): guint = g_date_get_julian(glibDatePointer)

    /**
     * Returns the week of the year, where weeks are understood to start on
     * Monday. If the date is before the first Monday of the year, return 0.
     * The date must be valid.
     *
     * @return week of the year
     */
    public fun getMondayWeekOfYear(): guint = g_date_get_monday_week_of_year(glibDatePointer)

    /**
     * Returns the month of the year. The date must be valid.
     *
     * @return month of the year as a #GDateMonth
     */
    public fun getMonth(): DateMonth = g_date_get_month(glibDatePointer).run {
        DateMonth.fromNativeValue(this)
    }

    /**
     * Returns the week of the year during which this date falls, if
     * weeks are understood to begin on Sunday. The date must be valid.
     * Can return 0 if the day is before the first Sunday of the year.
     *
     * @return week number
     */
    public fun getSundayWeekOfYear(): guint = g_date_get_sunday_week_of_year(glibDatePointer)

    /**
     * Returns the day of the week for a #GDate. The date must be valid.
     *
     * @return day of the week as a #GDateWeekday.
     */
    public fun getWeekday(): DateWeekday = g_date_get_weekday(glibDatePointer).run {
        DateWeekday.fromNativeValue(this)
    }

    /**
     * Returns the year of a #GDate. The date must be valid.
     *
     * @return year in which the date falls
     */
    public fun getYear(): DateYear = g_date_get_year(glibDatePointer)

    /**
     * Returns true if the date is on the first of a month.
     * The date must be valid.
     *
     * @return true if the date is the first of the month
     */
    public fun isFirstOfMonth(): Boolean = g_date_is_first_of_month(glibDatePointer).asBoolean()

    /**
     * Returns true if the date is the last day of the month.
     * The date must be valid.
     *
     * @return true if the date is the last day of the month
     */
    public fun isLastOfMonth(): Boolean = g_date_is_last_of_month(glibDatePointer).asBoolean()

    /**
     * Checks if @date1 is less than or equal to @date2,
     * and swap the values if this is not the case.
     *
     * @param date2 the second date
     */
    public fun order(date2: Date): Unit = g_date_order(glibDatePointer, date2.glibDatePointer)

    /**
     * Sets the day of the month for a #GDate. If the resulting
     * day-month-year triplet is invalid, the date will be invalid.
     *
     * @param day day to set
     */
    public fun setDay(day: DateDay): Unit = g_date_set_day(glibDatePointer, day)

    /**
     * Sets the value of a #GDate from a day, month, and year.
     * The day-month-year triplet must be valid; if you aren't
     * sure it is, call g_date_valid_dmy() to check before you
     * set it.
     *
     * @param day day
     * @param month month
     * @param y year
     */
    public fun setDmy(day: DateDay, month: DateMonth, y: DateYear): Unit =
        g_date_set_dmy(glibDatePointer, day, month.nativeValue, y)

    /**
     * Sets the value of a #GDate from a Julian day number.
     *
     * @param julianDate Julian day number (days since January 1, Year 1)
     */
    public fun setJulian(julianDate: guint): Unit = g_date_set_julian(glibDatePointer, julianDate)

    /**
     * Sets the month of the year for a #GDate.  If the resulting
     * day-month-year triplet is invalid, the date will be invalid.
     *
     * @param month month to set
     */
    public fun setMonth(month: DateMonth): Unit = g_date_set_month(glibDatePointer, month.nativeValue)

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
    public fun setParse(str: String): Unit = g_date_set_parse(glibDatePointer, str)

    /**
     * Sets the value of a date from a #GTime value.
     * The time to date conversion is done using the user's current timezone.
     *
     * @param time #GTime value to set.
     */
    public fun setTime(time: Time): Unit = g_date_set_time(glibDatePointer, time)

    /**
     * Sets the value of a date to the date corresponding to a time
     * specified as a time_t. The time to date conversion is done using
     * the user's current timezone.
     *
     * To set the value of a date to the current day, you could write:
     * |[<!-- language="C" -->
     *  time_t now = time (NULL);
     *  if (now == (time_t) -1)
     *    // handle the error
     *  g_date_set_time_t (date, now);
     * ]|
     *
     * @param timet time_t value to set
     * @since 2.10
     */
    @GLibVersion2_10
    public fun setTimeT(timet: Long): Unit = g_date_set_time_t(glibDatePointer, timet)

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
    public fun setTimeVal(timeval: TimeVal): Unit = g_date_set_time_val(glibDatePointer, timeval.glibTimeValPointer)

    /**
     * Sets the year for a #GDate. If the resulting day-month-year
     * triplet is invalid, the date will be invalid.
     *
     * @param year year to set
     */
    public fun setYear(year: DateYear): Unit = g_date_set_year(glibDatePointer, year)

    /**
     * Moves a date some number of days into the past.
     * To move by weeks, just move by weeks*7 days.
     * The date must be valid.
     *
     * @param nDays number of days to move
     */
    public fun subtractDays(nDays: guint): Unit = g_date_subtract_days(glibDatePointer, nDays)

    /**
     * Moves a date some number of months into the past.
     * If the current day of the month doesn't exist in
     * the destination month, the day of the month
     * may change. The date must be valid.
     *
     * @param nMonths number of months to move
     */
    public fun subtractMonths(nMonths: guint): Unit = g_date_subtract_months(glibDatePointer, nMonths)

    /**
     * Moves a date some number of years into the past.
     * If the current day doesn't exist in the destination
     * year (i.e. it's February 29 and you move to a non-leap-year)
     * then the day is changed to February 29. The date
     * must be valid.
     *
     * @param nYears number of years to move
     */
    public fun subtractYears(nYears: guint): Unit = g_date_subtract_years(glibDatePointer, nYears)

    /**
     * Returns true if the #GDate represents an existing day. The date must not
     * contain garbage; it should have been initialized with g_date_clear()
     * if it wasn't allocated by one of the g_date_new() variants.
     *
     * @return Whether the date is valid
     */
    public fun valid(): Boolean = g_date_valid(glibDatePointer).asBoolean()

    override fun toString(): String =
        "Date(julianDays=$julianDays, julian=$julian, dmy=$dmy, day=$day, month=$month, year=$year)"

    public companion object {
        /**
         * Allocates a #GDate and initializes
         * it to a safe state. The new date will
         * be cleared (as if you'd called g_date_clear()) but invalid (it won't
         * represent an existing day). Free the return value with g_date_free().
         *
         * @return a newly-allocated #GDate
         */
        public fun new(): Date = Date(g_date_new()!!)

        /**
         * Create a new #GDate representing the given day-month-year triplet.
         *
         * The triplet you pass in must represent a valid date. Use g_date_valid_dmy()
         * if needed to validate it. The returned #GDate is guaranteed to be non-null
         * and valid.
         *
         * @param day day of the month
         * @param month month of the year
         * @param year year
         * @return a newly-allocated #GDate
         *   initialized with @day, @month, and @year
         */
        public fun newDmy(day: DateDay, month: DateMonth, year: DateYear): Date =
            Date(g_date_new_dmy(day, month.nativeValue, year)!!.reinterpret())

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
        public fun newJulian(julianDay: guint): Date = Date(g_date_new_julian(julianDay)!!.reinterpret())

        /**
         * Returns the number of days in a month, taking leap
         * years into account.
         *
         * @param month month
         * @param year year
         * @return number of days in @month during the @year
         */
        public fun getDaysInMonth(month: DateMonth, year: DateYear): guint8 =
            g_date_get_days_in_month(month.nativeValue, year)

        /**
         * Returns the number of weeks in the year, where weeks
         * are taken to start on Monday. Will be 52 or 53. The
         * date must be valid. (Years always have 52 7-day periods,
         * plus 1 or 2 extra days depending on whether it's a leap
         * year. This function is basically telling you how many
         * Mondays are in the year, i.e. there are 53 Mondays if
         * one of the extra days happens to be a Monday.)
         *
         * @param year a year
         * @return number of Mondays in the year
         */
        public fun getMondayWeeksInYear(year: DateYear): guint8 = g_date_get_monday_weeks_in_year(year)

        /**
         * Returns the number of weeks in the year, where weeks
         * are taken to start on Sunday. Will be 52 or 53. The
         * date must be valid. (Years always have 52 7-day periods,
         * plus 1 or 2 extra days depending on whether it's a leap
         * year. This function is basically telling you how many
         * Sundays are in the year, i.e. there are 53 Sundays if
         * one of the extra days happens to be a Sunday.)
         *
         * @param year year to count weeks in
         * @return the number of weeks in @year
         */
        public fun getSundayWeeksInYear(year: DateYear): guint8 = g_date_get_sunday_weeks_in_year(year)

        /**
         * Returns true if the year is a leap year.
         *
         * For the purposes of this function, leap year is every year
         * divisible by 4 unless that year is divisible by 100. If it
         * is divisible by 100 it would be a leap year only if that year
         * is also divisible by 400.
         *
         * @param year year to check
         * @return true if the year is a leap year
         */
        public fun isLeapYear(year: DateYear): Boolean = g_date_is_leap_year(year).asBoolean()

        /**
         * Returns true if the day of the month is valid (a day is valid if it's
         * between 1 and 31 inclusive).
         *
         * @param day day to check
         * @return true if the day is valid
         */
        public fun validDay(day: DateDay): Boolean = g_date_valid_day(day).asBoolean()

        /**
         * Returns true if the day-month-year triplet forms a valid, existing day
         * in the range of days #GDate understands (Year 1 or later, no more than
         * a few thousand years in the future).
         *
         * @param day day
         * @param month month
         * @param year year
         * @return true if the date is a valid one
         */
        public fun validDmy(day: DateDay, month: DateMonth, year: DateYear): Boolean =
            g_date_valid_dmy(day, month.nativeValue, year).asBoolean()

        /**
         * Returns true if the Julian day is valid. Anything greater than zero
         * is basically a valid Julian, though there is a 32-bit limit.
         *
         * @param julianDate Julian day to check
         * @return true if the Julian day is valid
         */
        public fun validJulian(julianDate: guint): Boolean = g_date_valid_julian(julianDate).asBoolean()

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

        /**
         * Returns true if the year is valid. Any year greater than 0 is valid,
         * though there is a 16-bit limit to what #GDate will understand.
         *
         * @param year year
         * @return true if the year is valid
         */
        public fun validYear(year: DateYear): Boolean = g_date_valid_year(year).asBoolean()

        /**
         * Get the GType of Date
         *
         * @return the GType
         */
        public fun getType(): GType = g_date_get_type()
    }
}
