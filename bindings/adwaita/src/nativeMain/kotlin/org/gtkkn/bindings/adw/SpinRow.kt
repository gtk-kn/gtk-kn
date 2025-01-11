// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.Adjustment
import org.gtkkn.bindings.gtk.Editable
import org.gtkkn.bindings.gtk.SpinButtonUpdatePolicy
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwSpinRow
import org.gtkkn.native.adw.adw_spin_row_configure
import org.gtkkn.native.adw.adw_spin_row_get_adjustment
import org.gtkkn.native.adw.adw_spin_row_get_climb_rate
import org.gtkkn.native.adw.adw_spin_row_get_digits
import org.gtkkn.native.adw.adw_spin_row_get_numeric
import org.gtkkn.native.adw.adw_spin_row_get_snap_to_ticks
import org.gtkkn.native.adw.adw_spin_row_get_type
import org.gtkkn.native.adw.adw_spin_row_get_update_policy
import org.gtkkn.native.adw.adw_spin_row_get_value
import org.gtkkn.native.adw.adw_spin_row_get_wrap
import org.gtkkn.native.adw.adw_spin_row_new
import org.gtkkn.native.adw.adw_spin_row_new_with_range
import org.gtkkn.native.adw.adw_spin_row_set_adjustment
import org.gtkkn.native.adw.adw_spin_row_set_climb_rate
import org.gtkkn.native.adw.adw_spin_row_set_digits
import org.gtkkn.native.adw.adw_spin_row_set_numeric
import org.gtkkn.native.adw.adw_spin_row_set_range
import org.gtkkn.native.adw.adw_spin_row_set_snap_to_ticks
import org.gtkkn.native.adw.adw_spin_row_set_update_policy
import org.gtkkn.native.adw.adw_spin_row_set_value
import org.gtkkn.native.adw.adw_spin_row_set_wrap
import org.gtkkn.native.adw.adw_spin_row_update
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkEditable
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * An [class@ActionRow] with an embedded spin button.
 *
 * <picture>
 *   <source srcset="spin-row-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="spin-row.png" alt="spin-row">
 * </picture>
 *
 * Example of an `AdwSpinRow` UI definition:
 *
 * ```xml
 * <object class="AdwSpinRow">
 *   <property name="title" translatable="yes">Spin Row</property>
 *   <property name="adjustment">
 *     <object class="GtkAdjustment">
 *       <property name="lower">0</property>
 *       <property name="upper">100</property>
 *       <property name="value">50</property>
 *       <property name="page-increment">10</property>
 *       <property name="step-increment">1</property>
 *     </object>
 *   </property>
 * </object>
 * ```
 *
 * See [class@Gtk.SpinButton] for details.
 *
 * ## CSS nodes
 *
 * `AdwSpinRow` has the same structure as [class@ActionRow], as well as the
 * `.spin` style class on the main node.
 *
 * ## Skipped during bindings generation
 *
 * - method `adjustment`: Property TypeInfo of getter and setter do not match
 * - signal `input`: Unsupported parameter `new_value` : new_value: Out parameter is not supported
 *
 * @since 1.4
 */
@AdwVersion1_4
public class SpinRow(public val adwSpinRowPointer: CPointer<AdwSpinRow>) :
    ActionRow(adwSpinRowPointer.reinterpret()),
    Editable,
    KGTyped {
    override val gtkEditablePointer: CPointer<GtkEditable>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The acceleration rate when you hold down a button or key.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var climbRate: gdouble
        /**
         * Gets the acceleration rate when you hold down a button or key.
         *
         * @return the acceleration rate when you hold down a button or key
         * @since 1.4
         */
        get() = adw_spin_row_get_climb_rate(adwSpinRowPointer)

        /**
         * Sets the acceleration rate when you hold down a button or key.
         *
         * @param climbRate the acceleration rate when you hold down a button or key
         * @since 1.4
         */
        @AdwVersion1_4
        set(climbRate) = adw_spin_row_set_climb_rate(adwSpinRowPointer, climbRate)

    /**
     * The number of decimal places to display.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var digits: guint
        /**
         * Gets the number of decimal places to display.
         *
         * @return the number of decimal places to display
         * @since 1.4
         */
        get() = adw_spin_row_get_digits(adwSpinRowPointer)

        /**
         * Sets the number of decimal places to display.
         *
         * @param digits the number of decimal places to display
         * @since 1.4
         */
        @AdwVersion1_4
        set(digits) = adw_spin_row_set_digits(adwSpinRowPointer, digits)

    /**
     * Whether non-numeric characters should be ignored.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var numeric: Boolean
        /**
         * Gets whether non-numeric characters should be ignored.
         *
         * @return whether non-numeric characters should be ignored.
         * @since 1.4
         */
        get() = adw_spin_row_get_numeric(adwSpinRowPointer).asBoolean()

        /**
         * Sets whether non-numeric characters should be ignored.
         *
         * @param numeric whether non-numeric characters should be ignored
         * @since 1.4
         */
        @AdwVersion1_4
        set(numeric) = adw_spin_row_set_numeric(adwSpinRowPointer, numeric.asGBoolean())

    /**
     * Whether invalid values are snapped to the nearest step increment.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var snapToTicks: Boolean
        /**
         * Gets whether invalid values are snapped to nearest step increment.
         *
         * @return whether invalid values are snapped to the nearest step increment
         * @since 1.4
         */
        get() = adw_spin_row_get_snap_to_ticks(adwSpinRowPointer).asBoolean()

        /**
         * Sets whether invalid values are snapped to the nearest step increment.
         *
         * @param snapToTicks whether invalid values are snapped to the nearest step increment
         * @since 1.4
         */
        @AdwVersion1_4
        set(snapToTicks) = adw_spin_row_set_snap_to_ticks(adwSpinRowPointer, snapToTicks.asGBoolean())

    /**
     * The policy for updating the spin row.
     *
     * The options are always, or only when the value is invalid.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var updatePolicy: SpinButtonUpdatePolicy
        /**
         * Gets the policy for updating the spin row.
         *
         * @return the policy for updating the spin row
         * @since 1.4
         */
        get() = adw_spin_row_get_update_policy(adwSpinRowPointer).run {
            SpinButtonUpdatePolicy.fromNativeValue(this)
        }

        /**
         * Sets the policy for updating the spin row.
         *
         * The options are always, or only when the value is invalid.
         *
         * @param policy the policy for updating the spin row
         * @since 1.4
         */
        @AdwVersion1_4
        set(policy) = adw_spin_row_set_update_policy(adwSpinRowPointer, policy.nativeValue)

    /**
     * The current value.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var `value`: gdouble
        /**
         * Gets the current value.
         *
         * @return the current value
         * @since 1.4
         */
        get() = adw_spin_row_get_value(adwSpinRowPointer)

        /**
         * Sets the current value.
         *
         * @param value a new value
         * @since 1.4
         */
        @AdwVersion1_4
        set(`value`) = adw_spin_row_set_value(adwSpinRowPointer, `value`)

    /**
     * Whether the spin row should wrap upon reaching its limits.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var wrap: Boolean
        /**
         * Gets whether the spin row should wrap upon reaching its limits.
         *
         * @return whether the spin row should wrap upon reaching its limits
         * @since 1.4
         */
        get() = adw_spin_row_get_wrap(adwSpinRowPointer).asBoolean()

        /**
         * Sets whether the spin row should wrap upon reaching its limits.
         *
         * @param wrap whether the spin row should wrap upon reaching its limits
         * @since 1.4
         */
        @AdwVersion1_4
        set(wrap) = adw_spin_row_set_wrap(adwSpinRowPointer, wrap.asGBoolean())

    /**
     * Creates a new `AdwSpinRow`.
     *
     * @param adjustment the adjustment that this spin row should use
     * @param climbRate the rate the value changes when holding a button or key
     * @param digits the number of decimal places to display
     * @return the newly created `AdwSpinRow`
     * @since 1.4
     */
    public constructor(
        adjustment: Adjustment? = null,
        climbRate: gdouble,
        digits: guint,
    ) : this(adw_spin_row_new(adjustment?.gtkAdjustmentPointer, climbRate, digits)!!.reinterpret())

    /**
     * Creates a new `AdwSpinRow` with the given properties.
     *
     * This is a convenience constructor that allows creation of a numeric
     * `AdwSpinRow` without manually creating an adjustment. The value is initially
     * set to the minimum value and a page increment of 10 * @step is the default.
     * The precision of the spin row is equivalent to the precisions of @step.
     *
     * ::: note
     *     The way in which the precision is derived works best if @step is a power
     *     of ten. If the resulting precision is not suitable for your needs, use
     *     [method@SpinRow.set_digits] to correct it.
     *
     * @param min minimum allowable value
     * @param max maximum allowable value
     * @param step increment added or subtracted by spinning the widget
     * @return the new `AdwSpinRow`
     * @since 1.4
     */
    public constructor(
        min: gdouble,
        max: gdouble,
        step: gdouble,
    ) : this(adw_spin_row_new_with_range(min, max, step)!!.reinterpret())

    /**
     * Changes the properties of an existing spin row.
     *
     * The adjustment, climb rate, and number of decimal places are updated
     * accordingly.
     *
     * @param adjustment the adjustment that this spin row should use
     * @param climbRate the new climb rate
     * @param digits the number of decimal places to display
     * @since 1.4
     */
    @AdwVersion1_4
    public fun configure(adjustment: Adjustment? = null, climbRate: gdouble, digits: guint): Unit =
        adw_spin_row_configure(adwSpinRowPointer, adjustment?.gtkAdjustmentPointer, climbRate, digits)

    /**
     * Gets the adjustment that holds the value for the spin row.
     *
     * @return the adjustment that holds the spin row's value
     * @since 1.4
     */
    @AdwVersion1_4
    public fun getAdjustment(): Adjustment = adw_spin_row_get_adjustment(adwSpinRowPointer)!!.run {
        Adjustment(this)
    }

    /**
     * Sets the adjustment that holds the value for the spin row.
     *
     * @param adjustment an adjustment
     * @since 1.4
     */
    @AdwVersion1_4
    public fun setAdjustment(adjustment: Adjustment? = null): Unit =
        adw_spin_row_set_adjustment(adwSpinRowPointer, adjustment?.gtkAdjustmentPointer)

    /**
     * Sets the minimum and maximum allowable values for @self.
     *
     * If the current value is outside this range, it will be adjusted
     * to fit within the range, otherwise it will remain unchanged.
     *
     * @param min minimum allowable value
     * @param max maximum allowable value
     * @since 1.4
     */
    @AdwVersion1_4
    public fun setRange(min: gdouble, max: gdouble): Unit = adw_spin_row_set_range(adwSpinRowPointer, min, max)

    /**
     * Manually force an update of the spin row.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public fun update(): Unit = adw_spin_row_update(adwSpinRowPointer)

    /**
     * Emitted to tweak the formatting of the value for display.
     *
     * See [signal@Gtk.SpinButton::output].
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Returns `TRUE` if the value has been displayed
     * @since 1.4
     */
    @AdwVersion1_4
    public fun onOutput(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Boolean): ULong =
        g_signal_connect_data(
            adwSpinRowPointer,
            "output",
            onOutputFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted right after the spinbutton wraps.
     *
     * See [signal@Gtk.SpinButton::wrapped].
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.4
     */
    @AdwVersion1_4
    public fun onWrapped(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            adwSpinRowPointer,
            "wrapped",
            onWrappedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "wrapped" signal. See [onWrapped].
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public fun emitWrapped() {
        g_signal_emit_by_name(adwSpinRowPointer.reinterpret(), "wrapped")
    }

    public companion object : TypeCompanion<SpinRow> {
        override val type: GeneratedClassKGType<SpinRow> =
            GeneratedClassKGType(adw_spin_row_get_type()) { SpinRow(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of SpinRow
         *
         * @return the GType
         */
        public fun getType(): GType = adw_spin_row_get_type()
    }
}

private val onOutputFunc: CPointer<CFunction<() -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
}
    .reinterpret()

private val onWrappedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
