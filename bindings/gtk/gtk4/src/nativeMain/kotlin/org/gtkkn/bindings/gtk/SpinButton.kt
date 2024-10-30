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
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkAccessibleRange
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkCellEditable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkEditable
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.GtkScrollType
import org.gtkkn.native.gtk.GtkSpinButton
import org.gtkkn.native.gtk.gtk_spin_button_configure
import org.gtkkn.native.gtk.gtk_spin_button_get_activates_default
import org.gtkkn.native.gtk.gtk_spin_button_get_adjustment
import org.gtkkn.native.gtk.gtk_spin_button_get_climb_rate
import org.gtkkn.native.gtk.gtk_spin_button_get_digits
import org.gtkkn.native.gtk.gtk_spin_button_get_numeric
import org.gtkkn.native.gtk.gtk_spin_button_get_snap_to_ticks
import org.gtkkn.native.gtk.gtk_spin_button_get_type
import org.gtkkn.native.gtk.gtk_spin_button_get_update_policy
import org.gtkkn.native.gtk.gtk_spin_button_get_value
import org.gtkkn.native.gtk.gtk_spin_button_get_value_as_int
import org.gtkkn.native.gtk.gtk_spin_button_get_wrap
import org.gtkkn.native.gtk.gtk_spin_button_new
import org.gtkkn.native.gtk.gtk_spin_button_new_with_range
import org.gtkkn.native.gtk.gtk_spin_button_set_activates_default
import org.gtkkn.native.gtk.gtk_spin_button_set_adjustment
import org.gtkkn.native.gtk.gtk_spin_button_set_climb_rate
import org.gtkkn.native.gtk.gtk_spin_button_set_digits
import org.gtkkn.native.gtk.gtk_spin_button_set_increments
import org.gtkkn.native.gtk.gtk_spin_button_set_numeric
import org.gtkkn.native.gtk.gtk_spin_button_set_range
import org.gtkkn.native.gtk.gtk_spin_button_set_snap_to_ticks
import org.gtkkn.native.gtk.gtk_spin_button_set_update_policy
import org.gtkkn.native.gtk.gtk_spin_button_set_value
import org.gtkkn.native.gtk.gtk_spin_button_set_wrap
import org.gtkkn.native.gtk.gtk_spin_button_spin
import org.gtkkn.native.gtk.gtk_spin_button_update
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

/**
 * A `GtkSpinButton` is an ideal way to allow the user to set the
 * value of some attribute.
 *
 * ![An example GtkSpinButton](spinbutton.png)
 *
 * Rather than having to directly type a number into a `GtkEntry`,
 * `GtkSpinButton` allows the user to click on one of two arrows
 * to increment or decrement the displayed value. A value can still be
 * typed in, with the bonus that it can be checked to ensure it is in a
 * given range.
 *
 * The main properties of a `GtkSpinButton` are through an adjustment.
 * See the [class@Gtk.Adjustment] documentation for more details about
 * an adjustment's properties.
 *
 * Note that `GtkSpinButton` will by default make its entry large enough
 * to accommodate the lower and upper bounds of the adjustment. If this
 * is not desired, the automatic sizing can be turned off by explicitly
 * setting [property@Gtk.Editable:width-chars] to a value != -1.
 *
 * ## Using a GtkSpinButton to get an integer
 *
 * ```c
 * // Provides a function to retrieve an integer value from a GtkSpinButton
 * // and creates a spin button to model percentage values.
 *
 * int
 * grab_int_value (GtkSpinButton *button,
 *                 gpointer       user_data)
 * {
 *   return gtk_spin_button_get_value_as_int (button);
 * }
 *
 * void
 * create_integer_spin_button (void)
 * {
 *
 *   GtkWidget *window, *button;
 *   GtkAdjustment *adjustment;
 *
 *   adjustment = gtk_adjustment_new (50.0, 0.0, 100.0, 1.0, 5.0, 0.0);
 *
 *   window = gtk_window_new ();
 *
 *   // creates the spinbutton, with no decimal places
 *   button = gtk_spin_button_new (adjustment, 1.0, 0);
 *   gtk_window_set_child (GTK_WINDOW (window), button);
 *
 *   gtk_window_present (GTK_WINDOW (window));
 * }
 * ```
 *
 * ## Using a GtkSpinButton to get a floating point value
 *
 * ```c
 * // Provides a function to retrieve a floating point value from a
 * // GtkSpinButton, and creates a high precision spin button.
 *
 * float
 * grab_float_value (GtkSpinButton *button,
 *                   gpointer       user_data)
 * {
 *   return gtk_spin_button_get_value (button);
 * }
 *
 * void
 * create_floating_spin_button (void)
 * {
 *   GtkWidget *window, *button;
 *   GtkAdjustment *adjustment;
 *
 *   adjustment = gtk_adjustment_new (2.500, 0.0, 5.0, 0.001, 0.1, 0.0);
 *
 *   window = gtk_window_new ();
 *
 *   // creates the spinbutton, with three decimal places
 *   button = gtk_spin_button_new (adjustment, 0.001, 3);
 *   gtk_window_set_child (GTK_WINDOW (window), button);
 *
 *   gtk_window_present (GTK_WINDOW (window));
 * }
 * ```
 *
 * # CSS nodes
 *
 * ```
 * spinbutton.horizontal
 * ├── text
 * │    ├── undershoot.left
 * │    ╰── undershoot.right
 * ├── button.down
 * ╰── button.up
 * ```
 *
 * ```
 * spinbutton.vertical
 * ├── button.up
 * ├── text
 * │    ├── undershoot.left
 * │    ╰── undershoot.right
 * ╰── button.down
 * ```
 *
 * `GtkSpinButton`s main CSS node has the name spinbutton. It creates subnodes
 * for the entry and the two buttons, with these names. The button nodes have
 * the style classes .up and .down. The `GtkText` subnodes (if present) are put
 * below the text node. The orientation of the spin button is reflected in
 * the .vertical or .horizontal style class on the main node.
 *
 * # Accessibility
 *
 * `GtkSpinButton` uses the %GTK_ACCESSIBLE_ROLE_SPIN_BUTTON role.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `step`: step: Out parameter is not supported
 * - parameter `min`: min: Out parameter is not supported
 * - signal `input`: Unsupported parameter `new_value` : new_value: Out parameter is not supported
 */
public open class SpinButton(
    pointer: CPointer<GtkSpinButton>,
) : Widget(pointer.reinterpret()),
    AccessibleRange,
    CellEditable,
    Editable,
    Orientable,
    KGTyped {
    public val gtkSpinButtonPointer: CPointer<GtkSpinButton>
        get() = gPointer.reinterpret()

    override val gtkAccessibleRangePointer: CPointer<GtkAccessibleRange>
        get() = gPointer.reinterpret()

    override val gtkCellEditablePointer: CPointer<GtkCellEditable>
        get() = gPointer.reinterpret()

    override val gtkEditablePointer: CPointer<GtkEditable>
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
     * Whether to activate the default widget when the spin button is activated.
     *
     * See [signal@Gtk.SpinButton::activate] for what counts as activation.
     *
     * @since 4.14
     */
    public open var activatesDefault: Boolean
        /**
         * Retrieves the value set by [method@Gtk.SpinButton.set_activates_default].
         *
         * @return true if the spin button will activate the default widget
         * @since 4.14
         */
        get() = gtk_spin_button_get_activates_default(gtkSpinButtonPointer.reinterpret()).asBoolean()

        /**
         * Sets whether activating the spin button will activate the default
         * widget for the window containing the spin button.
         *
         * See [signal@Gtk.SpinButton::activate] for what counts as activation.
         *
         * @param activatesDefault true to activate window’s default widget on activation
         * @since 4.14
         */
        set(
            activatesDefault
        ) = gtk_spin_button_set_activates_default(gtkSpinButtonPointer.reinterpret(), activatesDefault.asGBoolean())

    /**
     * The adjustment that holds the value of the spin button.
     */
    public open var adjustment: Adjustment
        /**
         * Get the adjustment associated with a `GtkSpinButton`.
         *
         * @return the `GtkAdjustment` of @spin_button
         */
        get() =
            gtk_spin_button_get_adjustment(gtkSpinButtonPointer.reinterpret())!!.run {
                Adjustment(reinterpret())
            }

        /**
         * Replaces the `GtkAdjustment` associated with @spin_button.
         *
         * @param adjustment a `GtkAdjustment` to replace the existing adjustment
         */
        set(
            adjustment
        ) =
            gtk_spin_button_set_adjustment(
                gtkSpinButtonPointer.reinterpret(),
                adjustment.gtkAdjustmentPointer.reinterpret()
            )

    /**
     * The acceleration rate when you hold down a button or key.
     */
    public open var climbRate: Double
        /**
         * Returns the acceleration rate for repeated changes.
         *
         * @return the acceleration rate
         */
        get() = gtk_spin_button_get_climb_rate(gtkSpinButtonPointer.reinterpret())

        /**
         * Sets the acceleration rate for repeated changes when you
         * hold down a button or key.
         *
         * @param climbRate the rate of acceleration, must be >= 0
         */
        set(climbRate) = gtk_spin_button_set_climb_rate(gtkSpinButtonPointer.reinterpret(), climbRate)

    /**
     * The number of decimal places to display.
     */
    public open var digits: UInt
        /**
         * Fetches the precision of @spin_button.
         *
         * @return the current precision
         */
        get() = gtk_spin_button_get_digits(gtkSpinButtonPointer.reinterpret())

        /**
         * Set the precision to be displayed by @spin_button.
         *
         * Up to 20 digit precision is allowed.
         *
         * @param digits the number of digits after the decimal point to be
         *   displayed for the spin button’s value
         */
        set(digits) = gtk_spin_button_set_digits(gtkSpinButtonPointer.reinterpret(), digits)

    /**
     * Whether non-numeric characters should be ignored.
     */
    public open var numeric: Boolean
        /**
         * Returns whether non-numeric text can be typed into the spin button.
         *
         * @return true if only numeric text can be entered
         */
        get() = gtk_spin_button_get_numeric(gtkSpinButtonPointer.reinterpret()).asBoolean()

        /**
         * Sets the flag that determines if non-numeric text can be typed
         * into the spin button.
         *
         * @param numeric flag indicating if only numeric entry is allowed
         */
        set(numeric) = gtk_spin_button_set_numeric(gtkSpinButtonPointer.reinterpret(), numeric.asGBoolean())

    /**
     * Whether erroneous values are automatically changed to the spin buttons
     * nearest step increment.
     */
    public open var snapToTicks: Boolean
        /**
         * Returns whether the values are corrected to the nearest step.
         *
         * @return true if values are snapped to the nearest step
         */
        get() = gtk_spin_button_get_snap_to_ticks(gtkSpinButtonPointer.reinterpret()).asBoolean()

        /**
         * Sets the policy as to whether values are corrected to the
         * nearest step increment when a spin button is activated after
         * providing an invalid value.
         *
         * @param snapToTicks a flag indicating if invalid values should be corrected
         */
        set(
            snapToTicks
        ) = gtk_spin_button_set_snap_to_ticks(gtkSpinButtonPointer.reinterpret(), snapToTicks.asGBoolean())

    /**
     * Whether the spin button should update always, or only when the value
     * is acceptable.
     */
    public open var updatePolicy: SpinButtonUpdatePolicy
        /**
         * Gets the update behavior of a spin button.
         *
         * See [method@Gtk.SpinButton.set_update_policy].
         *
         * @return the current update policy
         */
        get() =
            gtk_spin_button_get_update_policy(gtkSpinButtonPointer.reinterpret()).run {
                SpinButtonUpdatePolicy.fromNativeValue(this)
            }

        /**
         * Sets the update behavior of a spin button.
         *
         * This determines whether the spin button is always
         * updated or only when a valid value is set.
         *
         * @param policy a `GtkSpinButtonUpdatePolicy` value
         */
        set(policy) = gtk_spin_button_set_update_policy(gtkSpinButtonPointer.reinterpret(), policy.nativeValue)

    /**
     * The current value.
     */
    public open var `value`: Double
        /**
         * Get the value in the @spin_button.
         *
         * @return the value of @spin_button
         */
        get() = gtk_spin_button_get_value(gtkSpinButtonPointer.reinterpret())

        /**
         * Sets the value of @spin_button.
         *
         * @param value the new value
         */
        set(`value`) = gtk_spin_button_set_value(gtkSpinButtonPointer.reinterpret(), `value`)

    /**
     * Whether a spin button should wrap upon reaching its limits.
     */
    public open var wrap: Boolean
        /**
         * Returns whether the spin button’s value wraps around to the
         * opposite limit when the upper or lower limit of the range is
         * exceeded.
         *
         * @return true if the spin button wraps around
         */
        get() = gtk_spin_button_get_wrap(gtkSpinButtonPointer.reinterpret()).asBoolean()

        /**
         * Sets the flag that determines if a spin button value wraps
         * around to the opposite limit when the upper or lower limit
         * of the range is exceeded.
         *
         * @param wrap a flag indicating if wrapping behavior is performed
         */
        set(wrap) = gtk_spin_button_set_wrap(gtkSpinButtonPointer.reinterpret(), wrap.asGBoolean())

    /**
     * Creates a new `GtkSpinButton`.
     *
     * @param adjustment the `GtkAdjustment` that this spin button should use
     * @param climbRate specifies by how much the rate of change in the value will
     *   accelerate if you continue to hold down an up/down button or arrow key
     * @param digits the number of decimal places to display
     * @return The new `GtkSpinButton`
     */
    public constructor(
        adjustment: Adjustment? = null,
        climbRate: Double,
        digits: UInt,
    ) : this(gtk_spin_button_new(adjustment?.gtkAdjustmentPointer?.reinterpret(), climbRate, digits)!!.reinterpret())

    /**
     * Creates a new `GtkSpinButton` with the given properties.
     *
     * This is a convenience constructor that allows creation
     * of a numeric `GtkSpinButton` without manually creating
     * an adjustment. The value is initially set to the minimum
     * value and a page increment of 10 * @step is the default.
     * The precision of the spin button is equivalent to the
     * precision of @step.
     *
     * Note that the way in which the precision is derived works
     * best if @step is a power of ten. If the resulting precision
     * is not suitable for your needs, use
     * [method@Gtk.SpinButton.set_digits] to correct it.
     *
     * @param min Minimum allowable value
     * @param max Maximum allowable value
     * @param step Increment added or subtracted by spinning the widget
     * @return The new `GtkSpinButton`
     */
    public constructor(
        min: Double,
        max: Double,
        step: Double,
    ) : this(gtk_spin_button_new_with_range(min, max, step)!!.reinterpret())

    /**
     * Changes the properties of an existing spin button.
     *
     * The adjustment, climb rate, and number of decimal places
     * are updated accordingly.
     *
     * @param adjustment a `GtkAdjustment` to replace the spin button’s
     *   existing adjustment, or null to leave its current adjustment unchanged
     * @param climbRate the new climb rate
     * @param digits the number of decimal places to display in the spin button
     */
    public open fun configure(
        adjustment: Adjustment? = null,
        climbRate: Double,
        digits: UInt,
    ): Unit =
        gtk_spin_button_configure(
            gtkSpinButtonPointer.reinterpret(),
            adjustment?.gtkAdjustmentPointer?.reinterpret(),
            climbRate,
            digits
        )

    /**
     * Retrieves the value set by [method@Gtk.SpinButton.set_activates_default].
     *
     * @return true if the spin button will activate the default widget
     * @since 4.14
     */
    public open fun getActivatesDefault(): Boolean =
        gtk_spin_button_get_activates_default(gtkSpinButtonPointer.reinterpret()).asBoolean()

    /**
     * Get the adjustment associated with a `GtkSpinButton`.
     *
     * @return the `GtkAdjustment` of @spin_button
     */
    public open fun getAdjustment(): Adjustment =
        gtk_spin_button_get_adjustment(gtkSpinButtonPointer.reinterpret())!!.run {
            Adjustment(reinterpret())
        }

    /**
     * Returns the acceleration rate for repeated changes.
     *
     * @return the acceleration rate
     */
    public open fun getClimbRate(): Double = gtk_spin_button_get_climb_rate(gtkSpinButtonPointer.reinterpret())

    /**
     * Fetches the precision of @spin_button.
     *
     * @return the current precision
     */
    public open fun getDigits(): UInt = gtk_spin_button_get_digits(gtkSpinButtonPointer.reinterpret())

    /**
     * Returns whether non-numeric text can be typed into the spin button.
     *
     * @return true if only numeric text can be entered
     */
    public open fun getNumeric(): Boolean = gtk_spin_button_get_numeric(gtkSpinButtonPointer.reinterpret()).asBoolean()

    /**
     * Returns whether the values are corrected to the nearest step.
     *
     * @return true if values are snapped to the nearest step
     */
    public open fun getSnapToTicks(): Boolean =
        gtk_spin_button_get_snap_to_ticks(gtkSpinButtonPointer.reinterpret()).asBoolean()

    /**
     * Gets the update behavior of a spin button.
     *
     * See [method@Gtk.SpinButton.set_update_policy].
     *
     * @return the current update policy
     */
    public open fun getUpdatePolicy(): SpinButtonUpdatePolicy =
        gtk_spin_button_get_update_policy(gtkSpinButtonPointer.reinterpret()).run {
            SpinButtonUpdatePolicy.fromNativeValue(this)
        }

    /**
     * Get the value in the @spin_button.
     *
     * @return the value of @spin_button
     */
    public open fun getValue(): Double = gtk_spin_button_get_value(gtkSpinButtonPointer.reinterpret())

    /**
     * Get the value @spin_button represented as an integer.
     *
     * @return the value of @spin_button
     */
    public open fun getValueAsInt(): Int = gtk_spin_button_get_value_as_int(gtkSpinButtonPointer.reinterpret())

    /**
     * Returns whether the spin button’s value wraps around to the
     * opposite limit when the upper or lower limit of the range is
     * exceeded.
     *
     * @return true if the spin button wraps around
     */
    public open fun getWrap(): Boolean = gtk_spin_button_get_wrap(gtkSpinButtonPointer.reinterpret()).asBoolean()

    /**
     * Sets whether activating the spin button will activate the default
     * widget for the window containing the spin button.
     *
     * See [signal@Gtk.SpinButton::activate] for what counts as activation.
     *
     * @param activatesDefault true to activate window’s default widget on activation
     * @since 4.14
     */
    public open fun setActivatesDefault(activatesDefault: Boolean): Unit =
        gtk_spin_button_set_activates_default(gtkSpinButtonPointer.reinterpret(), activatesDefault.asGBoolean())

    /**
     * Replaces the `GtkAdjustment` associated with @spin_button.
     *
     * @param adjustment a `GtkAdjustment` to replace the existing adjustment
     */
    public open fun setAdjustment(adjustment: Adjustment): Unit =
        gtk_spin_button_set_adjustment(
            gtkSpinButtonPointer.reinterpret(),
            adjustment.gtkAdjustmentPointer.reinterpret()
        )

    /**
     * Sets the acceleration rate for repeated changes when you
     * hold down a button or key.
     *
     * @param climbRate the rate of acceleration, must be >= 0
     */
    public open fun setClimbRate(climbRate: Double): Unit =
        gtk_spin_button_set_climb_rate(gtkSpinButtonPointer.reinterpret(), climbRate)

    /**
     * Set the precision to be displayed by @spin_button.
     *
     * Up to 20 digit precision is allowed.
     *
     * @param digits the number of digits after the decimal point to be
     *   displayed for the spin button’s value
     */
    public open fun setDigits(digits: UInt): Unit =
        gtk_spin_button_set_digits(gtkSpinButtonPointer.reinterpret(), digits)

    /**
     * Sets the step and page increments for spin_button.
     *
     * This affects how quickly the value changes when
     * the spin button’s arrows are activated.
     *
     * @param step increment applied for a button 1 press.
     * @param page increment applied for a button 2 press.
     */
    public open fun setIncrements(
        step: Double,
        page: Double,
    ): Unit = gtk_spin_button_set_increments(gtkSpinButtonPointer.reinterpret(), step, page)

    /**
     * Sets the flag that determines if non-numeric text can be typed
     * into the spin button.
     *
     * @param numeric flag indicating if only numeric entry is allowed
     */
    public open fun setNumeric(numeric: Boolean): Unit =
        gtk_spin_button_set_numeric(gtkSpinButtonPointer.reinterpret(), numeric.asGBoolean())

    /**
     * Sets the minimum and maximum allowable values for @spin_button.
     *
     * If the current value is outside this range, it will be adjusted
     * to fit within the range, otherwise it will remain unchanged.
     *
     * @param min minimum allowable value
     * @param max maximum allowable value
     */
    public open fun setRange(
        min: Double,
        max: Double,
    ): Unit = gtk_spin_button_set_range(gtkSpinButtonPointer.reinterpret(), min, max)

    /**
     * Sets the policy as to whether values are corrected to the
     * nearest step increment when a spin button is activated after
     * providing an invalid value.
     *
     * @param snapToTicks a flag indicating if invalid values should be corrected
     */
    public open fun setSnapToTicks(snapToTicks: Boolean): Unit =
        gtk_spin_button_set_snap_to_ticks(gtkSpinButtonPointer.reinterpret(), snapToTicks.asGBoolean())

    /**
     * Sets the update behavior of a spin button.
     *
     * This determines whether the spin button is always
     * updated or only when a valid value is set.
     *
     * @param policy a `GtkSpinButtonUpdatePolicy` value
     */
    public open fun setUpdatePolicy(policy: SpinButtonUpdatePolicy): Unit =
        gtk_spin_button_set_update_policy(gtkSpinButtonPointer.reinterpret(), policy.nativeValue)

    /**
     * Sets the value of @spin_button.
     *
     * @param value the new value
     */
    public open fun setValue(`value`: Double): Unit =
        gtk_spin_button_set_value(gtkSpinButtonPointer.reinterpret(), `value`)

    /**
     * Sets the flag that determines if a spin button value wraps
     * around to the opposite limit when the upper or lower limit
     * of the range is exceeded.
     *
     * @param wrap a flag indicating if wrapping behavior is performed
     */
    public open fun setWrap(wrap: Boolean): Unit =
        gtk_spin_button_set_wrap(gtkSpinButtonPointer.reinterpret(), wrap.asGBoolean())

    /**
     * Increment or decrement a spin button’s value in a specified
     * direction by a specified amount.
     *
     * @param direction a `GtkSpinType` indicating the direction to spin
     * @param increment step increment to apply in the specified direction
     */
    public open fun spin(
        direction: SpinType,
        increment: Double,
    ): Unit = gtk_spin_button_spin(gtkSpinButtonPointer.reinterpret(), direction.nativeValue, increment)

    /**
     * Manually force an update of the spin button.
     */
    public open fun update(): Unit = gtk_spin_button_update(gtkSpinButtonPointer.reinterpret())

    /**
     * Emitted when the spin button is activated.
     *
     * The keybindings for this signal are all forms of the <kbd>Enter</kbd> key.
     *
     * If the <kbd>Enter</kbd> key results in the value being committed to the
     * spin button, then activation does not occur until <kbd>Enter</kbd> is
     * pressed again.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 4.14
     */
    public fun connectActivate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "activate",
            connectActivateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the user initiates a value change.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control the cursor
     * programmatically.
     *
     * The default bindings for this signal are Up/Down and PageUp/PageDown.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `scroll` a `GtkScrollType` to specify the speed and amount of change
     */
    public fun connectChangeValue(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (scroll: ScrollType) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "change-value",
            connectChangeValueFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted to tweak the formatting of the value for display.
     *
     * ```c
     * // show leading zeros
     * static gboolean
     * on_output (GtkSpinButton *spin,
     *            gpointer       data)
     * {
     *    char *text;
     *    int value;
     *
     *    value = gtk_spin_button_get_value_as_int (spin);
     *    text = g_strdup_printf ("%02d", value);
     *    gtk_editable_set_text (GTK_EDITABLE (spin), text):
     *    g_free (text);
     *
     *    return TRUE;
     * }
     * ```
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Returns true if the value has been displayed
     */
    public fun connectOutput(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "output",
            connectOutputFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the value is changed.
     *
     * Also see the [signal@Gtk.SpinButton::output] signal.
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

    /**
     * Emitted right after the spinbutton wraps from its maximum
     * to its minimum value or vice-versa.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectWrapped(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "wrapped",
            connectWrappedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<SpinButton> {
        override val type: GeneratedClassKGType<SpinButton> =
            GeneratedClassKGType(gtk_spin_button_get_type()) { SpinButton(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectActivateFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectChangeValueFunc: CPointer<CFunction<(GtkScrollType) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            scroll: GtkScrollType,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(scroll: ScrollType) -> Unit>().get().invoke(
            scroll.run {
                ScrollType.fromNativeValue(this)
            }
        )
    }.reinterpret()

private val connectOutputFunc: CPointer<CFunction<() -> Int>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<() -> Boolean>()
            .get()
            .invoke()
            .asGBoolean()
    }.reinterpret()

private val connectValueChangedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectWrappedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()
