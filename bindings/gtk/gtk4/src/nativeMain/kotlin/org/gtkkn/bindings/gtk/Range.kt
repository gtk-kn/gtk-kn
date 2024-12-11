// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gdk.Rectangle
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.gboolean
import org.gtkkn.native.gobject.gdouble
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkAccessibleRange
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.GtkRange
import org.gtkkn.native.gtk.GtkScrollType
import org.gtkkn.native.gtk.gtk_range_get_adjustment
import org.gtkkn.native.gtk.gtk_range_get_fill_level
import org.gtkkn.native.gtk.gtk_range_get_flippable
import org.gtkkn.native.gtk.gtk_range_get_inverted
import org.gtkkn.native.gtk.gtk_range_get_range_rect
import org.gtkkn.native.gtk.gtk_range_get_restrict_to_fill_level
import org.gtkkn.native.gtk.gtk_range_get_round_digits
import org.gtkkn.native.gtk.gtk_range_get_show_fill_level
import org.gtkkn.native.gtk.gtk_range_get_slider_size_fixed
import org.gtkkn.native.gtk.gtk_range_get_type
import org.gtkkn.native.gtk.gtk_range_get_value
import org.gtkkn.native.gtk.gtk_range_set_adjustment
import org.gtkkn.native.gtk.gtk_range_set_fill_level
import org.gtkkn.native.gtk.gtk_range_set_flippable
import org.gtkkn.native.gtk.gtk_range_set_increments
import org.gtkkn.native.gtk.gtk_range_set_inverted
import org.gtkkn.native.gtk.gtk_range_set_range
import org.gtkkn.native.gtk.gtk_range_set_restrict_to_fill_level
import org.gtkkn.native.gtk.gtk_range_set_round_digits
import org.gtkkn.native.gtk.gtk_range_set_show_fill_level
import org.gtkkn.native.gtk.gtk_range_set_slider_size_fixed
import org.gtkkn.native.gtk.gtk_range_set_value
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkRange` is the common base class for widgets which visualize an
 * adjustment.
 *
 * Widgets that are derived from `GtkRange` include
 * [class@Gtk.Scale] and [class@Gtk.Scrollbar].
 *
 * Apart from signals for monitoring the parameters of the adjustment,
 * `GtkRange` provides properties and methods for setting a
 * “fill level” on range widgets. See [method@Gtk.Range.set_fill_level].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `slider_start`: slider_start: Out parameter is not supported
 */
public open class Range(pointer: CPointer<GtkRange>) :
    Widget(pointer.reinterpret()),
    AccessibleRange,
    Orientable,
    KGTyped {
    public val gtkRangePointer: CPointer<GtkRange>
        get() = gPointer.reinterpret()

    override val gtkAccessibleRangePointer: CPointer<GtkAccessibleRange>
        get() = gPointer.reinterpret()

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The adjustment that is controlled by the range.
     */
    public open var adjustment: Adjustment
        /**
         * Get the adjustment which is the “model” object for `GtkRange`.
         *
         * @return a `GtkAdjustment`
         */
        get() = gtk_range_get_adjustment(gtkRangePointer.reinterpret())!!.run {
            Adjustment(reinterpret())
        }

        /**
         * Sets the adjustment to be used as the “model” object for the `GtkRange`
         *
         * The adjustment indicates the current range value, the minimum and
         * maximum range values, the step/page increments used for keybindings
         * and scrolling, and the page size.
         *
         * The page size is normally 0 for `GtkScale` and nonzero for `GtkScrollbar`,
         * and indicates the size of the visible area of the widget being scrolled.
         * The page size affects the size of the scrollbar slider.
         *
         * @param adjustment a `GtkAdjustment`
         */
        set(
            adjustment
        ) = gtk_range_set_adjustment(gtkRangePointer.reinterpret(), adjustment.gtkAdjustmentPointer.reinterpret())

    /**
     * The fill level (e.g. prebuffering of a network stream).
     */
    public open var fillLevel: gdouble
        /**
         * Gets the current position of the fill level indicator.
         *
         * @return The current fill level
         */
        get() = gtk_range_get_fill_level(gtkRangePointer.reinterpret())

        /**
         * Set the new position of the fill level indicator.
         *
         * The “fill level” is probably best described by its most prominent
         * use case, which is an indicator for the amount of pre-buffering in
         * a streaming media player. In that use case, the value of the range
         * would indicate the current play position, and the fill level would
         * be the position up to which the file/stream has been downloaded.
         *
         * This amount of prebuffering can be displayed on the range’s trough
         * and is themeable separately from the trough. To enable fill level
         * display, use [method@Gtk.Range.set_show_fill_level]. The range defaults
         * to not showing the fill level.
         *
         * Additionally, it’s possible to restrict the range’s slider position
         * to values which are smaller than the fill level. This is controlled
         * by [method@Gtk.Range.set_restrict_to_fill_level] and is by default
         * enabled.
         *
         * @param fillLevel the new position of the fill level indicator
         */
        set(fillLevel) = gtk_range_set_fill_level(gtkRangePointer.reinterpret(), fillLevel)

    /**
     * If true, the direction in which the slider moves is inverted.
     */
    public open var inverted: Boolean
        /**
         * Gets whether the range is inverted.
         *
         * See [method@Gtk.Range.set_inverted].
         *
         * @return true if the range is inverted
         */
        get() = gtk_range_get_inverted(gtkRangePointer.reinterpret()).asBoolean()

        /**
         * Sets whether to invert the range.
         *
         * Ranges normally move from lower to higher values as the
         * slider moves from top to bottom or left to right. Inverted
         * ranges have higher values at the top or on the right rather
         * than on the bottom or left.
         *
         * @param setting true to invert the range
         */
        set(setting) = gtk_range_set_inverted(gtkRangePointer.reinterpret(), setting.asGBoolean())

    /**
     * Controls whether slider movement is restricted to an
     * upper boundary set by the fill level.
     */
    public open var restrictToFillLevel: Boolean
        /**
         * Gets whether the range is restricted to the fill level.
         *
         * @return true if @range is restricted to the fill level.
         */
        get() = gtk_range_get_restrict_to_fill_level(gtkRangePointer.reinterpret()).asBoolean()

        /**
         * Sets whether the slider is restricted to the fill level.
         *
         * See [method@Gtk.Range.set_fill_level] for a general description
         * of the fill level concept.
         *
         * @param restrictToFillLevel Whether the fill level restricts slider movement.
         */
        set(
            restrictToFillLevel
        ) = gtk_range_set_restrict_to_fill_level(gtkRangePointer.reinterpret(), restrictToFillLevel.asGBoolean())

    /**
     * The number of digits to round the value to when
     * it changes.
     *
     * See [signal@Gtk.Range::change-value].
     */
    public open var roundDigits: gint
        /**
         * Gets the number of digits to round the value to when
         * it changes.
         *
         * See [signal@Gtk.Range::change-value].
         *
         * @return the number of digits to round to
         */
        get() = gtk_range_get_round_digits(gtkRangePointer.reinterpret())

        /**
         * Sets the number of digits to round the value to when
         * it changes.
         *
         * See [signal@Gtk.Range::change-value].
         *
         * @param roundDigits the precision in digits, or -1
         */
        set(roundDigits) = gtk_range_set_round_digits(gtkRangePointer.reinterpret(), roundDigits)

    /**
     * Controls whether fill level indicator graphics are displayed
     * on the trough.
     */
    public open var showFillLevel: Boolean
        /**
         * Gets whether the range displays the fill level graphically.
         *
         * @return true if @range shows the fill level.
         */
        get() = gtk_range_get_show_fill_level(gtkRangePointer.reinterpret()).asBoolean()

        /**
         * Sets whether a graphical fill level is show on the trough.
         *
         * See [method@Gtk.Range.set_fill_level] for a general description
         * of the fill level concept.
         *
         * @param showFillLevel Whether a fill level indicator graphics is shown.
         */
        set(showFillLevel) = gtk_range_set_show_fill_level(gtkRangePointer.reinterpret(), showFillLevel.asGBoolean())

    /**
     * Gets whether the `GtkRange` respects text direction.
     *
     * See [method@Gtk.Range.set_flippable].
     *
     * @return true if the range is flippable
     */
    public open fun getFlippable(): Boolean = gtk_range_get_flippable(gtkRangePointer.reinterpret()).asBoolean()

    /**
     * This function returns the area that contains the range’s trough,
     * in coordinates relative to @range's origin.
     *
     * This function is useful mainly for `GtkRange` subclasses.
     *
     * @param rangeRect return location for the range rectangle
     */
    public open fun getRangeRect(rangeRect: Rectangle): Unit =
        gtk_range_get_range_rect(gtkRangePointer.reinterpret(), rangeRect.gdkRectanglePointer.reinterpret())

    /**
     * This function is useful mainly for `GtkRange` subclasses.
     *
     * See [method@Gtk.Range.set_slider_size_fixed].
     *
     * @return whether the range’s slider has a fixed size.
     */
    public open fun getSliderSizeFixed(): Boolean =
        gtk_range_get_slider_size_fixed(gtkRangePointer.reinterpret()).asBoolean()

    /**
     * Gets the current value of the range.
     *
     * @return current value of the range.
     */
    public open fun getValue(): gdouble = gtk_range_get_value(gtkRangePointer.reinterpret())

    /**
     * Sets whether the `GtkRange` respects text direction.
     *
     * If a range is flippable, it will switch its direction
     * if it is horizontal and its direction is %GTK_TEXT_DIR_RTL.
     *
     * See [method@Gtk.Widget.get_direction].
     *
     * @param flippable true to make the range flippable
     */
    public open fun setFlippable(flippable: Boolean): Unit =
        gtk_range_set_flippable(gtkRangePointer.reinterpret(), flippable.asGBoolean())

    /**
     * Sets the step and page sizes for the range.
     *
     * The step size is used when the user clicks the `GtkScrollbar`
     * arrows or moves a `GtkScale` via arrow keys. The page size
     * is used for example when moving via Page Up or Page Down keys.
     *
     * @param step step size
     * @param page page size
     */
    public open fun setIncrements(step: gdouble, page: gdouble): Unit =
        gtk_range_set_increments(gtkRangePointer.reinterpret(), step, page)

    /**
     * Sets the allowable values in the `GtkRange`.
     *
     * The range value is clamped to be between @min and @max.
     * (If the range has a non-zero page size, it is clamped
     * between @min and @max - page-size.)
     *
     * @param min minimum range value
     * @param max maximum range value
     */
    public open fun setRange(min: gdouble, max: gdouble): Unit =
        gtk_range_set_range(gtkRangePointer.reinterpret(), min, max)

    /**
     * Sets whether the range’s slider has a fixed size, or a size that
     * depends on its adjustment’s page size.
     *
     * This function is useful mainly for `GtkRange` subclasses.
     *
     * @param sizeFixed true to make the slider size constant
     */
    public open fun setSliderSizeFixed(sizeFixed: Boolean): Unit =
        gtk_range_set_slider_size_fixed(gtkRangePointer.reinterpret(), sizeFixed.asGBoolean())

    /**
     * Sets the current value of the range.
     *
     * If the value is outside the minimum or maximum range values,
     * it will be clamped to fit inside them. The range emits the
     * [signal@Gtk.Range::value-changed] signal if the value changes.
     *
     * @param value new value of the range
     */
    public open fun setValue(`value`: gdouble): Unit = gtk_range_set_value(gtkRangePointer.reinterpret(), `value`)

    /**
     * Emitted before clamping a value, to give the application a
     * chance to adjust the bounds.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `value` the value before we clamp
     */
    public fun connectAdjustBounds(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (`value`: gdouble) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "adjust-bounds",
        connectAdjustBoundsFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when a scroll action is performed on a range.
     *
     * It allows an application to determine the type of scroll event
     * that occurred and the resultant new value. The application can
     * handle the event itself and return true to prevent further
     * processing. Or, by returning false, it can pass the event to
     * other handlers until the default GTK handler is reached.
     *
     * The value parameter is unrounded. An application that overrides
     * the ::change-value signal is responsible for clamping the value
     * to the desired number of decimal digits; the default GTK
     * handler clamps the value based on [property@Gtk.Range:round-digits].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `scroll` the type of scroll action that was performed; `value` the new value resulting from the scroll action. Returns true to prevent other handlers from being invoked for
     *     the signal, false to propagate the signal further
     */
    public fun connectChangeValue(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (scroll: ScrollType, `value`: gdouble) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "change-value",
        connectChangeValueFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Virtual function that moves the slider.
     *
     * Used for keybindings.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `step` how to move the slider
     */
    public fun connectMoveSlider(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (step: ScrollType) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "move-slider",
        connectMoveSliderFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when the range value changes.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectValueChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "value-changed",
            connectValueChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Range> {
        override val type: GeneratedClassKGType<Range> =
            GeneratedClassKGType(gtk_range_get_type()) { Range(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Range
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_range_get_type()
    }
}

private val connectAdjustBoundsFunc: CPointer<CFunction<(gdouble) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        `value`: gdouble,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(`value`: gdouble) -> Unit>().get().invoke(`value`)
}
    .reinterpret()

private val connectChangeValueFunc: CPointer<CFunction<(GtkScrollType, gdouble) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            scroll: GtkScrollType,
            `value`: gdouble,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(scroll: ScrollType, `value`: gdouble) -> Boolean>().get().invoke(
            scroll.run {
                ScrollType.fromNativeValue(this)
            },
            `value`
        ).asGBoolean()
    }
        .reinterpret()

private val connectMoveSliderFunc: CPointer<CFunction<(GtkScrollType) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        step: GtkScrollType,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(step: ScrollType) -> Unit>().get().invoke(
        step.run {
            ScrollType.fromNativeValue(this)
        }
    )
}
    .reinterpret()

private val connectValueChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
