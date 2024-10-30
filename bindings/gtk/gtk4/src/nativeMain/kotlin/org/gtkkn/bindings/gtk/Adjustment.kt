// This is a generated file. Do not modify.
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
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
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
import kotlin.Double
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
public open class Adjustment(
    pointer: CPointer<GtkAdjustment>,
) : InitiallyUnowned(pointer.reinterpret()),
    KGTyped {
    public val gtkAdjustmentPointer: CPointer<GtkAdjustment>
        get() = gPointer.reinterpret()

    /**
     * The minimum value of the adjustment.
     */
    public open var lower: Double
        /**
         * Retrieves the minimum value of the adjustment.
         *
         * @return The current minimum value of the adjustment
         */
        get() = gtk_adjustment_get_lower(gtkAdjustmentPointer.reinterpret())

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
        set(lower) = gtk_adjustment_set_lower(gtkAdjustmentPointer.reinterpret(), lower)

    /**
     * The page increment of the adjustment.
     */
    public open var pageIncrement: Double
        /**
         * Retrieves the page increment of the adjustment.
         *
         * @return The current page increment of the adjustment
         */
        get() = gtk_adjustment_get_page_increment(gtkAdjustmentPointer.reinterpret())

        /**
         * Sets the page increment of the adjustment.
         *
         * See [method@Gtk.Adjustment.set_lower] about how to compress
         * multiple emissions of the [signal@Gtk.Adjustment::changed]
         * signal when setting multiple adjustment properties.
         *
         * @param pageIncrement the new page increment
         */
        set(pageIncrement) = gtk_adjustment_set_page_increment(gtkAdjustmentPointer.reinterpret(), pageIncrement)

    /**
     * The page size of the adjustment.
     *
     * Note that the page-size is irrelevant and should be set to zero
     * if the adjustment is used for a simple scalar value, e.g. in a
     * `GtkSpinButton`.
     */
    public open var pageSize: Double
        /**
         * Retrieves the page size of the adjustment.
         *
         * @return The current page size of the adjustment
         */
        get() = gtk_adjustment_get_page_size(gtkAdjustmentPointer.reinterpret())

        /**
         * Sets the page size of the adjustment.
         *
         * See [method@Gtk.Adjustment.set_lower] about how to compress
         * multiple emissions of the [signal@Gtk.Adjustment::changed]
         * signal when setting multiple adjustment properties.
         *
         * @param pageSize the new page size
         */
        set(pageSize) = gtk_adjustment_set_page_size(gtkAdjustmentPointer.reinterpret(), pageSize)

    /**
     * The step increment of the adjustment.
     */
    public open var stepIncrement: Double
        /**
         * Retrieves the step increment of the adjustment.
         *
         * @return The current step increment of the adjustment.
         */
        get() = gtk_adjustment_get_step_increment(gtkAdjustmentPointer.reinterpret())

        /**
         * Sets the step increment of the adjustment.
         *
         * See [method@Gtk.Adjustment.set_lower] about how to compress
         * multiple emissions of the [signal@Gtk.Adjustment::changed]
         * signal when setting multiple adjustment properties.
         *
         * @param stepIncrement the new step increment
         */
        set(stepIncrement) = gtk_adjustment_set_step_increment(gtkAdjustmentPointer.reinterpret(), stepIncrement)

    /**
     * The maximum value of the adjustment.
     *
     * Note that values will be restricted by `upper - page-size` if the page-size
     * property is nonzero.
     */
    public open var upper: Double
        /**
         * Retrieves the maximum value of the adjustment.
         *
         * @return The current maximum value of the adjustment
         */
        get() = gtk_adjustment_get_upper(gtkAdjustmentPointer.reinterpret())

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
        set(upper) = gtk_adjustment_set_upper(gtkAdjustmentPointer.reinterpret(), upper)

    /**
     * The value of the adjustment.
     */
    public open var `value`: Double
        /**
         * Gets the current value of the adjustment.
         *
         * @return The current value of the adjustment
         */
        get() = gtk_adjustment_get_value(gtkAdjustmentPointer.reinterpret())

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
        set(`value`) = gtk_adjustment_set_value(gtkAdjustmentPointer.reinterpret(), `value`)

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
        `value`: Double,
        lower: Double,
        upper: Double,
        stepIncrement: Double,
        pageIncrement: Double,
        pageSize: Double,
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
    public open fun clampPage(
        lower: Double,
        upper: Double,
    ): Unit = gtk_adjustment_clamp_page(gtkAdjustmentPointer.reinterpret(), lower, upper)

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
        `value`: Double,
        lower: Double,
        upper: Double,
        stepIncrement: Double,
        pageIncrement: Double,
        pageSize: Double,
    ): Unit =
        gtk_adjustment_configure(
            gtkAdjustmentPointer.reinterpret(),
            `value`,
            lower,
            upper,
            stepIncrement,
            pageIncrement,
            pageSize
        )

    /**
     * Retrieves the minimum value of the adjustment.
     *
     * @return The current minimum value of the adjustment
     */
    public open fun getLower(): Double = gtk_adjustment_get_lower(gtkAdjustmentPointer.reinterpret())

    /**
     * Gets the smaller of step increment and page increment.
     *
     * @return the minimum increment of @adjustment
     */
    public open fun getMinimumIncrement(): Double =
        gtk_adjustment_get_minimum_increment(gtkAdjustmentPointer.reinterpret())

    /**
     * Retrieves the page increment of the adjustment.
     *
     * @return The current page increment of the adjustment
     */
    public open fun getPageIncrement(): Double = gtk_adjustment_get_page_increment(gtkAdjustmentPointer.reinterpret())

    /**
     * Retrieves the page size of the adjustment.
     *
     * @return The current page size of the adjustment
     */
    public open fun getPageSize(): Double = gtk_adjustment_get_page_size(gtkAdjustmentPointer.reinterpret())

    /**
     * Retrieves the step increment of the adjustment.
     *
     * @return The current step increment of the adjustment.
     */
    public open fun getStepIncrement(): Double = gtk_adjustment_get_step_increment(gtkAdjustmentPointer.reinterpret())

    /**
     * Retrieves the maximum value of the adjustment.
     *
     * @return The current maximum value of the adjustment
     */
    public open fun getUpper(): Double = gtk_adjustment_get_upper(gtkAdjustmentPointer.reinterpret())

    /**
     * Gets the current value of the adjustment.
     *
     * @return The current value of the adjustment
     */
    public open fun getValue(): Double = gtk_adjustment_get_value(gtkAdjustmentPointer.reinterpret())

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
    public open fun setLower(lower: Double): Unit = gtk_adjustment_set_lower(gtkAdjustmentPointer.reinterpret(), lower)

    /**
     * Sets the page increment of the adjustment.
     *
     * See [method@Gtk.Adjustment.set_lower] about how to compress
     * multiple emissions of the [signal@Gtk.Adjustment::changed]
     * signal when setting multiple adjustment properties.
     *
     * @param pageIncrement the new page increment
     */
    public open fun setPageIncrement(pageIncrement: Double): Unit =
        gtk_adjustment_set_page_increment(gtkAdjustmentPointer.reinterpret(), pageIncrement)

    /**
     * Sets the page size of the adjustment.
     *
     * See [method@Gtk.Adjustment.set_lower] about how to compress
     * multiple emissions of the [signal@Gtk.Adjustment::changed]
     * signal when setting multiple adjustment properties.
     *
     * @param pageSize the new page size
     */
    public open fun setPageSize(pageSize: Double): Unit =
        gtk_adjustment_set_page_size(gtkAdjustmentPointer.reinterpret(), pageSize)

    /**
     * Sets the step increment of the adjustment.
     *
     * See [method@Gtk.Adjustment.set_lower] about how to compress
     * multiple emissions of the [signal@Gtk.Adjustment::changed]
     * signal when setting multiple adjustment properties.
     *
     * @param stepIncrement the new step increment
     */
    public open fun setStepIncrement(stepIncrement: Double): Unit =
        gtk_adjustment_set_step_increment(gtkAdjustmentPointer.reinterpret(), stepIncrement)

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
    public open fun setUpper(upper: Double): Unit = gtk_adjustment_set_upper(gtkAdjustmentPointer.reinterpret(), upper)

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
    public open fun setValue(`value`: Double): Unit =
        gtk_adjustment_set_value(gtkAdjustmentPointer.reinterpret(), `value`)

    /**
     * Emitted when one or more of the `GtkAdjustment` properties have been
     * changed.
     *
     * Note that the [property@Gtk.Adjustment:value] property is
     * covered by the [signal@Gtk.Adjustment::value-changed] signal.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "changed",
            connectChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the value has been changed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectValueChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "value-changed",
            connectValueChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Adjustment> {
        override val type: GeneratedClassKGType<Adjustment> =
            GeneratedClassKGType(gtk_adjustment_get_type()) { Adjustment(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectChangedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectValueChangedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()
