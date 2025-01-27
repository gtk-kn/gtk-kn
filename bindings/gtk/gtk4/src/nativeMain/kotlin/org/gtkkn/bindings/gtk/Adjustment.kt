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
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.InitiallyUnowned
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAdjustment
import org.gtkkn.native.gtk.gtk_adjustment_clamp_page
import org.gtkkn.native.gtk.gtk_adjustment_configure
import org.gtkkn.native.gtk.gtk_adjustment_get_lower
import org.gtkkn.native.gtk.gtk_adjustment_get_minimum_increment
import org.gtkkn.native.gtk.gtk_adjustment_get_page_increment
import org.gtkkn.native.gtk.gtk_adjustment_get_page_size
import org.gtkkn.native.gtk.gtk_adjustment_get_step_increment
import org.gtkkn.native.gtk.gtk_adjustment_get_type
import org.gtkkn.native.gtk.gtk_adjustment_get_upper
import org.gtkkn.native.gtk.gtk_adjustment_get_value
import org.gtkkn.native.gtk.gtk_adjustment_new
import org.gtkkn.native.gtk.gtk_adjustment_set_lower
import org.gtkkn.native.gtk.gtk_adjustment_set_page_increment
import org.gtkkn.native.gtk.gtk_adjustment_set_page_size
import org.gtkkn.native.gtk.gtk_adjustment_set_step_increment
import org.gtkkn.native.gtk.gtk_adjustment_set_upper
import org.gtkkn.native.gtk.gtk_adjustment_set_value
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkAdjustment` is a model for a numeric value.
 *
 * The `GtkAdjustment` has an associated lower and upper bound.
 * It also contains step and page increments, and a page size.
 *
 * Adjustments are used within several GTK widgets, including
 * [class@Gtk.SpinButton], [class@Gtk.Viewport], [class@Gtk.Scrollbar]
 * and [class@Gtk.Scale].
 *
 * The `GtkAdjustment` object does not update the value itself. Instead
 * it is left up to the owner of the `GtkAdjustment` to control the value.
 */
public open class Adjustment(public val gtkAdjustmentPointer: CPointer<GtkAdjustment>) :
    InitiallyUnowned(gtkAdjustmentPointer.reinterpret()),
    KGTyped {
    /**
     * The minimum value of the adjustment.
     */
    public open var lower: gdouble
        /**
         * Retrieves the minimum value of the adjustment.
         *
         * @return The current minimum value of the adjustment
         */
        get() = gtk_adjustment_get_lower(gtkAdjustmentPointer)

        /**
         * Sets the minimum value of the adjustment.
         *
         * When setting multiple adjustment properties via their individual
         * setters, multiple [signal@Gtk.Adjustment::changed] signals will
         * be emitted. However, since the emission of the
         * [signal@Gtk.Adjustment::changed] signal is tied to the emission
         * of the ::notify signals of the changed properties, it’s possible
         * to compress the [signal@Gtk.Adjustment::changed] signals into one
         * by calling g_object_freeze_notify() and g_object_thaw_notify()
         * around the calls to the individual setters.
         *
         * Alternatively, using a single g_object_set() for all the properties
         * to change, or using [method@Gtk.Adjustment.configure] has the same effect.
         *
         * @param lower the new minimum value
         */
        set(lower) = gtk_adjustment_set_lower(gtkAdjustmentPointer, lower)

    /**
     * The page increment of the adjustment.
     */
    public open var pageIncrement: gdouble
        /**
         * Retrieves the page increment of the adjustment.
         *
         * @return The current page increment of the adjustment
         */
        get() = gtk_adjustment_get_page_increment(gtkAdjustmentPointer)

        /**
         * Sets the page increment of the adjustment.
         *
         * See [method@Gtk.Adjustment.set_lower] about how to compress
         * multiple emissions of the [signal@Gtk.Adjustment::changed]
         * signal when setting multiple adjustment properties.
         *
         * @param pageIncrement the new page increment
         */
        set(pageIncrement) = gtk_adjustment_set_page_increment(gtkAdjustmentPointer, pageIncrement)

    /**
     * The page size of the adjustment.
     *
     * Note that the page-size is irrelevant and should be set to zero
     * if the adjustment is used for a simple scalar value, e.g. in a
     * `GtkSpinButton`.
     */
    public open var pageSize: gdouble
        /**
         * Retrieves the page size of the adjustment.
         *
         * @return The current page size of the adjustment
         */
        get() = gtk_adjustment_get_page_size(gtkAdjustmentPointer)

        /**
         * Sets the page size of the adjustment.
         *
         * See [method@Gtk.Adjustment.set_lower] about how to compress
         * multiple emissions of the [signal@Gtk.Adjustment::changed]
         * signal when setting multiple adjustment properties.
         *
         * @param pageSize the new page size
         */
        set(pageSize) = gtk_adjustment_set_page_size(gtkAdjustmentPointer, pageSize)

    /**
     * The step increment of the adjustment.
     */
    public open var stepIncrement: gdouble
        /**
         * Retrieves the step increment of the adjustment.
         *
         * @return The current step increment of the adjustment.
         */
        get() = gtk_adjustment_get_step_increment(gtkAdjustmentPointer)

        /**
         * Sets the step increment of the adjustment.
         *
         * See [method@Gtk.Adjustment.set_lower] about how to compress
         * multiple emissions of the [signal@Gtk.Adjustment::changed]
         * signal when setting multiple adjustment properties.
         *
         * @param stepIncrement the new step increment
         */
        set(stepIncrement) = gtk_adjustment_set_step_increment(gtkAdjustmentPointer, stepIncrement)

    /**
     * The maximum value of the adjustment.
     *
     * Note that values will be restricted by `upper - page-size` if the page-size
     * property is nonzero.
     */
    public open var upper: gdouble
        /**
         * Retrieves the maximum value of the adjustment.
         *
         * @return The current maximum value of the adjustment
         */
        get() = gtk_adjustment_get_upper(gtkAdjustmentPointer)

        /**
         * Sets the maximum value of the adjustment.
         *
         * Note that values will be restricted by `upper - page-size`
         * if the page-size property is nonzero.
         *
         * See [method@Gtk.Adjustment.set_lower] about how to compress
         * multiple emissions of the [signal@Gtk.Adjustment::changed]
         * signal when setting multiple adjustment properties.
         *
         * @param upper the new maximum value
         */
        set(upper) = gtk_adjustment_set_upper(gtkAdjustmentPointer, upper)

    /**
     * The value of the adjustment.
     */
    public open var `value`: gdouble
        /**
         * Gets the current value of the adjustment.
         *
         * @return The current value of the adjustment
         */
        get() = gtk_adjustment_get_value(gtkAdjustmentPointer)

        /**
         * Sets the `GtkAdjustment` value.
         *
         * The value is clamped to lie between [property@Gtk.Adjustment:lower]
         * and [property@Gtk.Adjustment:upper].
         *
         * Note that for adjustments which are used in a `GtkScrollbar`,
         * the effective range of allowed values goes from
         * [property@Gtk.Adjustment:lower] to
         * [property@Gtk.Adjustment:upper] - [property@Gtk.Adjustment:page-size].
         *
         * @param value the new value
         */
        set(`value`) = gtk_adjustment_set_value(gtkAdjustmentPointer, `value`)

    /**
     * Creates a new `GtkAdjustment`.
     *
     * @param value the initial value
     * @param lower the minimum value
     * @param upper the maximum value
     * @param stepIncrement the step increment
     * @param pageIncrement the page increment
     * @param pageSize the page size
     * @return a new `GtkAdjustment`
     */
    public constructor(
        `value`: gdouble,
        lower: gdouble,
        upper: gdouble,
        stepIncrement: gdouble,
        pageIncrement: gdouble,
        pageSize: gdouble,
    ) : this(gtk_adjustment_new(`value`, lower, upper, stepIncrement, pageIncrement, pageSize)!!.reinterpret())

    /**
     * Updates the value property to ensure that the range
     * between @lower and @upper is in the current page.
     *
     * The current page goes from `value` to `value` + `page-size`.
     * If the range is larger than the page size, then only the
     * start of it will be in the current page.
     *
     * A [signal@Gtk.Adjustment::value-changed] signal will be emitted
     * if the value is changed.
     *
     * @param lower the lower value
     * @param upper the upper value
     */
    public open fun clampPage(lower: gdouble, upper: gdouble): Unit =
        gtk_adjustment_clamp_page(gtkAdjustmentPointer, lower, upper)

    /**
     * Sets all properties of the adjustment at once.
     *
     * Use this function to avoid multiple emissions of the
     * [signal@Gtk.Adjustment::changed] signal. See
     * [method@Gtk.Adjustment.set_lower] for an alternative
     * way of compressing multiple emissions of
     * [signal@Gtk.Adjustment::changed] into one.
     *
     * @param value the new value
     * @param lower the new minimum value
     * @param upper the new maximum value
     * @param stepIncrement the new step increment
     * @param pageIncrement the new page increment
     * @param pageSize the new page size
     */
    public open fun configure(
        `value`: gdouble,
        lower: gdouble,
        upper: gdouble,
        stepIncrement: gdouble,
        pageIncrement: gdouble,
        pageSize: gdouble,
    ): Unit =
        gtk_adjustment_configure(gtkAdjustmentPointer, `value`, lower, upper, stepIncrement, pageIncrement, pageSize)

    /**
     * Gets the smaller of step increment and page increment.
     *
     * @return the minimum increment of @adjustment
     */
    public open fun getMinimumIncrement(): gdouble = gtk_adjustment_get_minimum_increment(gtkAdjustmentPointer)

    /**
     * Emitted when one or more of the `GtkAdjustment` properties have been
     * changed.
     *
     * Note that the [property@Gtk.Adjustment:value] property is
     * covered by the [signal@Gtk.Adjustment::value-changed] signal.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkAdjustmentPointer,
            "changed",
            onChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "changed" signal. See [onChanged].
     */
    public fun emitChanged() {
        g_signal_emit_by_name(gtkAdjustmentPointer.reinterpret(), "changed")
    }

    /**
     * Emitted when the value has been changed.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onValueChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkAdjustmentPointer,
            "value-changed",
            onValueChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "value-changed" signal. See [onValueChanged].
     */
    public fun emitValueChanged() {
        g_signal_emit_by_name(gtkAdjustmentPointer.reinterpret(), "value-changed")
    }

    public companion object : TypeCompanion<Adjustment> {
        override val type: GeneratedClassKGType<Adjustment> =
            GeneratedClassKGType(getTypeOrNull("gtk_adjustment_get_type")!!) { Adjustment(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Adjustment
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_adjustment_get_type()
    }
}

private val onChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onValueChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
