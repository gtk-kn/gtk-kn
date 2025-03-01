// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
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
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
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
public open class Calendar(public val gtkCalendarPointer: CPointer<GtkCalendar>) :
    Widget(gtkCalendarPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

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
        get() = gtk_calendar_get_day(gtkCalendarPointer)

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
        set(day) = gtk_calendar_set_day(gtkCalendarPointer, day)

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
        get() = gtk_calendar_get_month(gtkCalendarPointer)

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
        set(month) = gtk_calendar_set_month(gtkCalendarPointer, month)

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
        get() = gtk_calendar_get_show_day_names(gtkCalendarPointer).asBoolean()

        /**
         * Sets whether the calendar shows day names.
         *
         * @param value Whether to show day names above the day numbers
         */
        set(`value`) = gtk_calendar_set_show_day_names(gtkCalendarPointer, `value`.asGBoolean())

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
        get() = gtk_calendar_get_show_heading(gtkCalendarPointer).asBoolean()

        /**
         * Sets whether the calendar should show a heading.
         *
         * The heading contains the current year and month as well as
         * buttons for changing both.
         *
         * @param value Whether to show the heading in the calendar
         */
        set(`value`) = gtk_calendar_set_show_heading(gtkCalendarPointer, `value`.asGBoolean())

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
        get() = gtk_calendar_get_show_week_numbers(gtkCalendarPointer).asBoolean()

        /**
         * Sets whether week numbers are shown in the calendar.
         *
         * @param value whether to show week numbers on the left of the days
         */
        set(`value`) = gtk_calendar_set_show_week_numbers(gtkCalendarPointer, `value`.asGBoolean())

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
        get() = gtk_calendar_get_year(gtkCalendarPointer)

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
        set(year) = gtk_calendar_set_year(gtkCalendarPointer, year)

    /**
     * Creates a new calendar, with the current date being selected.
     *
     * @return a newly `GtkCalendar` widget
     */
    public constructor() : this(gtk_calendar_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Remove all visual markers.
     */
    public open fun clearMarks(): Unit = gtk_calendar_clear_marks(gtkCalendarPointer)

    /**
     * Returns a `GDateTime` representing the shown
     * year, month and the selected day.
     *
     * The returned date is in the local time zone.
     *
     * @return the `GDateTime` representing the shown date
     */
    public open fun getDate(): DateTime = gtk_calendar_get_date(gtkCalendarPointer)!!.run {
        DateTime(this)
    }

    /**
     * Returns if the @day of the @calendar is already marked.
     *
     * @param day the day number between 1 and 31.
     * @return whether the day is marked.
     */
    public open fun getDayIsMarked(day: guint): Boolean =
        gtk_calendar_get_day_is_marked(gtkCalendarPointer, day).asBoolean()

    /**
     * Places a visual marker on a particular day of the current month.
     *
     * @param day the day number to mark between 1 and 31.
     */
    public open fun markDay(day: guint): Unit = gtk_calendar_mark_day(gtkCalendarPointer, day)

    /**
     * Switches to @date's year and month and select its day.
     *
     * @param date a `GDateTime` representing the day to select
     */
    public open fun selectDay(date: DateTime): Unit =
        gtk_calendar_select_day(gtkCalendarPointer, date.glibDateTimePointer)

    /**
     * Removes the visual marker from a particular day.
     *
     * @param day the day number to unmark between 1 and 31.
     */
    public open fun unmarkDay(day: guint): Unit = gtk_calendar_unmark_day(gtkCalendarPointer, day)

    /**
     * Emitted when the user selects a day.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onDaySelected(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkCalendarPointer,
            "day-selected",
            onDaySelectedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "day-selected" signal. See [onDaySelected].
     */
    public fun emitDaySelected() {
        g_signal_emit_by_name(gtkCalendarPointer.reinterpret(), "day-selected")
    }

    /**
     * Emitted when the user switched to the next month.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onNextMonth(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkCalendarPointer,
            "next-month",
            onNextMonthFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "next-month" signal. See [onNextMonth].
     */
    public fun emitNextMonth() {
        g_signal_emit_by_name(gtkCalendarPointer.reinterpret(), "next-month")
    }

    /**
     * Emitted when user switched to the next year.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onNextYear(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkCalendarPointer,
            "next-year",
            onNextYearFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "next-year" signal. See [onNextYear].
     */
    public fun emitNextYear() {
        g_signal_emit_by_name(gtkCalendarPointer.reinterpret(), "next-year")
    }

    /**
     * Emitted when the user switched to the previous month.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onPrevMonth(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkCalendarPointer,
            "prev-month",
            onPrevMonthFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "prev-month" signal. See [onPrevMonth].
     */
    public fun emitPrevMonth() {
        g_signal_emit_by_name(gtkCalendarPointer.reinterpret(), "prev-month")
    }

    /**
     * Emitted when user switched to the previous year.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onPrevYear(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkCalendarPointer,
            "prev-year",
            onPrevYearFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "prev-year" signal. See [onPrevYear].
     */
    public fun emitPrevYear() {
        g_signal_emit_by_name(gtkCalendarPointer.reinterpret(), "prev-year")
    }

    public companion object : TypeCompanion<Calendar> {
        override val type: GeneratedClassKGType<Calendar> =
            GeneratedClassKGType(getTypeOrNull()!!) { Calendar(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Calendar
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_calendar_get_type()

        /**
         * Gets the GType of from the symbol `gtk_calendar_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_calendar_get_type")
    }
}

private val onDaySelectedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onNextMonthFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onNextYearFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onPrevMonthFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onPrevYearFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
