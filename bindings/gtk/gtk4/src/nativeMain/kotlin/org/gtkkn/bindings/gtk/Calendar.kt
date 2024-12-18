// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.glib.DateTime
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gobject.guint
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkCalendar
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.gtk_calendar_clear_marks
import org.gtkkn.native.gtk.gtk_calendar_get_date
import org.gtkkn.native.gtk.gtk_calendar_get_day
import org.gtkkn.native.gtk.gtk_calendar_get_day_is_marked
import org.gtkkn.native.gtk.gtk_calendar_get_month
import org.gtkkn.native.gtk.gtk_calendar_get_show_day_names
import org.gtkkn.native.gtk.gtk_calendar_get_show_heading
import org.gtkkn.native.gtk.gtk_calendar_get_show_week_numbers
import org.gtkkn.native.gtk.gtk_calendar_get_type
import org.gtkkn.native.gtk.gtk_calendar_get_year
import org.gtkkn.native.gtk.gtk_calendar_mark_day
import org.gtkkn.native.gtk.gtk_calendar_new
import org.gtkkn.native.gtk.gtk_calendar_select_day
import org.gtkkn.native.gtk.gtk_calendar_set_day
import org.gtkkn.native.gtk.gtk_calendar_set_month
import org.gtkkn.native.gtk.gtk_calendar_set_show_day_names
import org.gtkkn.native.gtk.gtk_calendar_set_show_heading
import org.gtkkn.native.gtk.gtk_calendar_set_show_week_numbers
import org.gtkkn.native.gtk.gtk_calendar_set_year
import org.gtkkn.native.gtk.gtk_calendar_unmark_day
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkCalendar` is a widget that displays a Gregorian calendar, one month
 * at a time.
 *
 * ![An example GtkCalendar](calendar.png)
 *
 * A `GtkCalendar` can be created with [ctor@Gtk.Calendar.new].
 *
 * The date that is currently displayed can be altered with
 * [method@Gtk.Calendar.select_day].
 *
 * To place a visual marker on a particular day, use
 * [method@Gtk.Calendar.mark_day] and to remove the marker,
 * [method@Gtk.Calendar.unmark_day]. Alternative, all
 * marks can be cleared with [method@Gtk.Calendar.clear_marks].
 *
 * The selected date can be retrieved from a `GtkCalendar` using
 * [method@Gtk.Calendar.get_date].
 *
 * Users should be aware that, although the Gregorian calendar is the
 * legal calendar in most countries, it was adopted progressively
 * between 1582 and 1929. Display before these dates is likely to be
 * historically incorrect.
 *
 * # CSS nodes
 *
 * ```
 * calendar.view
 * ├── header
 * │   ├── button
 * │   ├── stack.month
 * │   ├── button
 * │   ├── button
 * │   ├── label.year
 * │   ╰── button
 * ╰── grid
 *     ╰── label[.day-name][.week-number][.day-number][.other-month][.today]
 * ```
 *
 * `GtkCalendar` has a main node with name calendar. It contains a subnode
 * called header containing the widgets for switching between years and months.
 *
 * The grid subnode contains all day labels, including week numbers on the left
 * (marked with the .week-number css class) and day names on top (marked with the
 * .day-name css class).
 *
 * Day labels that belong to the previous or next month get the .other-month
 * style class. The label of the current day get the .today style class.
 *
 * Marked day labels get the :selected state assigned.
 */
public open class Calendar(pointer: CPointer<GtkCalendar>) :
    Widget(pointer.reinterpret()),
    KGTyped {
    public val gtkCalendarPointer: CPointer<GtkCalendar>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The selected day (as a number between 1 and 31).
     */
    public open var day: gint
        /**
         * Gets the day of the selected date.
         *
         * @return the day of the selected date.
         * @since 4.14
         */
        get() = gtk_calendar_get_day(gtkCalendarPointer.reinterpret())

        /**
         * Sets the day for the selected date.
         *
         * The new date must be valid. For example, setting 31 for the day when the
         * month is February, fails.
         *
         * @param day The desired day for the selected date (as a number between 1 and 31).
         * @since 4.14
         */
        @GtkVersion4_14
        set(day) = gtk_calendar_set_day(gtkCalendarPointer.reinterpret(), day)

    /**
     * The selected month (as a number between 0 and 11).
     *
     * This property gets initially set to the current month.
     */
    public open var month: gint
        /**
         * Gets the month of the selected date.
         *
         * @return The month of the selected date (as a number between 0 and 11).
         * @since 4.14
         */
        get() = gtk_calendar_get_month(gtkCalendarPointer.reinterpret())

        /**
         * Sets the month for the selected date.
         *
         * The new date must be valid. For example, setting 1 (February) for the month
         * when the day is 31, fails.
         *
         * @param month The desired month for the selected date (as a number between 0 and 11).
         * @since 4.14
         */
        @GtkVersion4_14
        set(month) = gtk_calendar_set_month(gtkCalendarPointer.reinterpret(), month)

    /**
     * Determines whether day names are displayed.
     */
    public open var showDayNames: Boolean
        /**
         * Returns whether @self is currently showing the names
         * of the week days.
         *
         * This is the value of the [property@Gtk.Calendar:show-day-names]
         * property.
         *
         * @return Whether the calendar shows day names.
         */
        get() = gtk_calendar_get_show_day_names(gtkCalendarPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the calendar shows day names.
         *
         * @param value Whether to show day names above the day numbers
         */
        set(`value`) = gtk_calendar_set_show_day_names(gtkCalendarPointer.reinterpret(), `value`.asGBoolean())

    /**
     * Determines whether a heading is displayed.
     */
    public open var showHeading: Boolean
        /**
         * Returns whether @self is currently showing the heading.
         *
         * This is the value of the [property@Gtk.Calendar:show-heading]
         * property.
         *
         * @return Whether the calendar is showing a heading.
         */
        get() = gtk_calendar_get_show_heading(gtkCalendarPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the calendar should show a heading.
         *
         * The heading contains the current year and month as well as
         * buttons for changing both.
         *
         * @param value Whether to show the heading in the calendar
         */
        set(`value`) = gtk_calendar_set_show_heading(gtkCalendarPointer.reinterpret(), `value`.asGBoolean())

    /**
     * Determines whether week numbers are displayed.
     */
    public open var showWeekNumbers: Boolean
        /**
         * Returns whether @self is showing week numbers right
         * now.
         *
         * This is the value of the [property@Gtk.Calendar:show-week-numbers]
         * property.
         *
         * @return Whether the calendar is showing week numbers.
         */
        get() = gtk_calendar_get_show_week_numbers(gtkCalendarPointer.reinterpret()).asBoolean()

        /**
         * Sets whether week numbers are shown in the calendar.
         *
         * @param value whether to show week numbers on the left of the days
         */
        set(`value`) = gtk_calendar_set_show_week_numbers(gtkCalendarPointer.reinterpret(), `value`.asGBoolean())

    /**
     * The selected year.
     *
     * This property gets initially set to the current year.
     */
    public open var year: gint
        /**
         * Gets the year of the selected date.
         *
         * @return the year of the selected date.
         * @since 4.14
         */
        get() = gtk_calendar_get_year(gtkCalendarPointer.reinterpret())

        /**
         * Sets the year for the selected date.
         *
         * The new date must be valid. For example, setting 2023 for the year when then
         * the date is 2024-02-29, fails.
         *
         * @param year The desired year for the selected date (within [struct@GLib.DateTime]
         *   limits, i.e. from 0001 to 9999).
         * @since 4.14
         */
        @GtkVersion4_14
        set(year) = gtk_calendar_set_year(gtkCalendarPointer.reinterpret(), year)

    /**
     * Creates a new calendar, with the current date being selected.
     *
     * @return a newly `GtkCalendar` widget
     */
    public constructor() : this(gtk_calendar_new()!!.reinterpret())

    /**
     * Remove all visual markers.
     */
    public open fun clearMarks(): Unit = gtk_calendar_clear_marks(gtkCalendarPointer.reinterpret())

    /**
     * Returns a `GDateTime` representing the shown
     * year, month and the selected day.
     *
     * The returned date is in the local time zone.
     *
     * @return the `GDateTime` representing the shown date
     */
    public open fun getDate(): DateTime = gtk_calendar_get_date(gtkCalendarPointer.reinterpret())!!.run {
        DateTime(reinterpret())
    }

    /**
     * Returns if the @day of the @calendar is already marked.
     *
     * @param day the day number between 1 and 31.
     * @return whether the day is marked.
     */
    public open fun getDayIsMarked(day: guint): Boolean =
        gtk_calendar_get_day_is_marked(gtkCalendarPointer.reinterpret(), day).asBoolean()

    /**
     * Places a visual marker on a particular day of the current month.
     *
     * @param day the day number to mark between 1 and 31.
     */
    public open fun markDay(day: guint): Unit = gtk_calendar_mark_day(gtkCalendarPointer.reinterpret(), day)

    /**
     * Switches to @date's year and month and select its day.
     *
     * @param date a `GDateTime` representing the day to select
     */
    public open fun selectDay(date: DateTime): Unit =
        gtk_calendar_select_day(gtkCalendarPointer.reinterpret(), date.glibDateTimePointer.reinterpret())

    /**
     * Removes the visual marker from a particular day.
     *
     * @param day the day number to unmark between 1 and 31.
     */
    public open fun unmarkDay(day: guint): Unit = gtk_calendar_unmark_day(gtkCalendarPointer.reinterpret(), day)

    /**
     * Emitted when the user selects a day.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectDaySelected(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "day-selected",
            connectDaySelectedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the user switched to the next month.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectNextMonth(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "next-month",
            connectNextMonthFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when user switched to the next year.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectNextYear(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "next-year",
            connectNextYearFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the user switched to the previous month.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectPrevMonth(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "prev-month",
            connectPrevMonthFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when user switched to the previous year.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectPrevYear(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "prev-year",
            connectPrevYearFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Calendar> {
        override val type: GeneratedClassKGType<Calendar> =
            GeneratedClassKGType(gtk_calendar_get_type()) { Calendar(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Calendar
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_calendar_get_type()
    }
}

private val connectDaySelectedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectNextMonthFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectNextYearFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectPrevMonthFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectPrevYearFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
