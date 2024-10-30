// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.Adjustment
import org.gtkkn.bindings.gtk.Editable
import org.gtkkn.bindings.gtk.SpinButtonUpdatePolicy
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
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
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkEditable
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.UInt
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
public class SpinRow(
    pointer: CPointer<AdwSpinRow>,
) : ActionRow(pointer.reinterpret()),
    Editable,
    KGTyped {
    public val adwSpinRowPointer: CPointer<AdwSpinRow>
        get() = gPointer.reinterpret()

    override val gtkEditablePointer: CPointer<GtkEditable>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The acceleration rate when you hold down a button or key.
     *
     * @since 1.4
     */
    public var climbRate: Double
        /**
         * Gets the acceleration rate when you hold down a button or key.
         *
         * @return the acceleration rate when you hold down a button or key
         * @since 1.4
         */
        get() = adw_spin_row_get_climb_rate(adwSpinRowPointer.reinterpret())

        /**
         * Sets the acceleration rate when you hold down a button or key.
         *
         * @param climbRate the acceleration rate when you hold down a button or key
         * @since 1.4
         */
        set(climbRate) = adw_spin_row_set_climb_rate(adwSpinRowPointer.reinterpret(), climbRate)

    /**
     * The number of decimal places to display.
     *
     * @since 1.4
     */
    public var digits: UInt
        /**
         * Gets the number of decimal places to display.
         *
         * @return the number of decimal places to display
         * @since 1.4
         */
        get() = adw_spin_row_get_digits(adwSpinRowPointer.reinterpret())

        /**
         * Sets the number of decimal places to display.
         *
         * @param digits the number of decimal places to display
         * @since 1.4
         */
        set(digits) = adw_spin_row_set_digits(adwSpinRowPointer.reinterpret(), digits)

    /**
     * Whether non-numeric characters should be ignored.
     *
     * @since 1.4
     */
    public var numeric: Boolean
        /**
         * Gets whether non-numeric characters should be ignored.
         *
         * @return whether non-numeric characters should be ignored.
         * @since 1.4
         */
        get() = adw_spin_row_get_numeric(adwSpinRowPointer.reinterpret()).asBoolean()

        /**
         * Sets whether non-numeric characters should be ignored.
         *
         * @param numeric whether non-numeric characters should be ignored
         * @since 1.4
         */
        set(numeric) = adw_spin_row_set_numeric(adwSpinRowPointer.reinterpret(), numeric.asGBoolean())

    /**
     * Whether invalid values are snapped to the nearest step increment.
     *
     * @since 1.4
     */
    public var snapToTicks: Boolean
        /**
         * Gets whether invalid values are snapped to nearest step increment.
         *
         * @return whether invalid values are snapped to the nearest step increment
         * @since 1.4
         */
        get() = adw_spin_row_get_snap_to_ticks(adwSpinRowPointer.reinterpret()).asBoolean()

        /**
         * Sets whether invalid values are snapped to the nearest step increment.
         *
         * @param snapToTicks whether invalid values are snapped to the nearest step increment
         * @since 1.4
         */
        set(snapToTicks) = adw_spin_row_set_snap_to_ticks(adwSpinRowPointer.reinterpret(), snapToTicks.asGBoolean())

    /**
     * The policy for updating the spin row.
     *
     * The options are always, or only when the value is invalid.
     *
     * @since 1.4
     */
    public var updatePolicy: SpinButtonUpdatePolicy
        /**
         * Gets the policy for updating the spin row.
         *
         * @return the policy for updating the spin row
         * @since 1.4
         */
        get() =
            adw_spin_row_get_update_policy(adwSpinRowPointer.reinterpret()).run {
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
        set(policy) = adw_spin_row_set_update_policy(adwSpinRowPointer.reinterpret(), policy.nativeValue)

    /**
     * The current value.
     *
     * @since 1.4
     */
    public var `value`: Double
        /**
         * Gets the current value.
         *
         * @return the current value
         * @since 1.4
         */
        get() = adw_spin_row_get_value(adwSpinRowPointer.reinterpret())

        /**
         * Sets the current value.
         *
         * @param value a new value
         * @since 1.4
         */
        set(`value`) = adw_spin_row_set_value(adwSpinRowPointer.reinterpret(), `value`)

    /**
     * Whether the spin row should wrap upon reaching its limits.
     *
     * @since 1.4
     */
    public var wrap: Boolean
        /**
         * Gets whether the spin row should wrap upon reaching its limits.
         *
         * @return whether the spin row should wrap upon reaching its limits
         * @since 1.4
         */
        get() = adw_spin_row_get_wrap(adwSpinRowPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the spin row should wrap upon reaching its limits.
         *
         * @param wrap whether the spin row should wrap upon reaching its limits
         * @since 1.4
         */
        set(wrap) = adw_spin_row_set_wrap(adwSpinRowPointer.reinterpret(), wrap.asGBoolean())

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
        climbRate: Double,
        digits: UInt,
    ) : this(adw_spin_row_new(adjustment?.gtkAdjustmentPointer?.reinterpret(), climbRate, digits)!!.reinterpret())

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
        min: Double,
        max: Double,
        step: Double,
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
    public fun configure(
        adjustment: Adjustment? = null,
        climbRate: Double,
        digits: UInt,
    ): Unit =
        adw_spin_row_configure(
            adwSpinRowPointer.reinterpret(),
            adjustment?.gtkAdjustmentPointer?.reinterpret(),
            climbRate,
            digits
        )

    /**
     * Gets the adjustment that holds the value for the spin row.
     *
     * @return the adjustment that holds the spin row's value
     * @since 1.4
     */
    public fun getAdjustment(): Adjustment =
        adw_spin_row_get_adjustment(adwSpinRowPointer.reinterpret())!!.run {
            Adjustment(reinterpret())
        }

    /**
     * Gets the acceleration rate when you hold down a button or key.
     *
     * @return the acceleration rate when you hold down a button or key
     * @since 1.4
     */
    public fun getClimbRate(): Double = adw_spin_row_get_climb_rate(adwSpinRowPointer.reinterpret())

    /**
     * Gets the number of decimal places to display.
     *
     * @return the number of decimal places to display
     * @since 1.4
     */
    public fun getDigits(): UInt = adw_spin_row_get_digits(adwSpinRowPointer.reinterpret())

    /**
     * Gets whether non-numeric characters should be ignored.
     *
     * @return whether non-numeric characters should be ignored.
     * @since 1.4
     */
    public fun getNumeric(): Boolean = adw_spin_row_get_numeric(adwSpinRowPointer.reinterpret()).asBoolean()

    /**
     * Gets whether invalid values are snapped to nearest step increment.
     *
     * @return whether invalid values are snapped to the nearest step increment
     * @since 1.4
     */
    public fun getSnapToTicks(): Boolean = adw_spin_row_get_snap_to_ticks(adwSpinRowPointer.reinterpret()).asBoolean()

    /**
     * Gets the policy for updating the spin row.
     *
     * @return the policy for updating the spin row
     * @since 1.4
     */
    public fun getUpdatePolicy(): SpinButtonUpdatePolicy =
        adw_spin_row_get_update_policy(adwSpinRowPointer.reinterpret()).run {
            SpinButtonUpdatePolicy.fromNativeValue(this)
        }

    /**
     * Gets the current value.
     *
     * @return the current value
     * @since 1.4
     */
    public fun getValue(): Double = adw_spin_row_get_value(adwSpinRowPointer.reinterpret())

    /**
     * Gets whether the spin row should wrap upon reaching its limits.
     *
     * @return whether the spin row should wrap upon reaching its limits
     * @since 1.4
     */
    public fun getWrap(): Boolean = adw_spin_row_get_wrap(adwSpinRowPointer.reinterpret()).asBoolean()

    /**
     * Sets the adjustment that holds the value for the spin row.
     *
     * @param adjustment an adjustment
     * @since 1.4
     */
    public fun setAdjustment(adjustment: Adjustment? = null): Unit =
        adw_spin_row_set_adjustment(adwSpinRowPointer.reinterpret(), adjustment?.gtkAdjustmentPointer?.reinterpret())

    /**
     * Sets the acceleration rate when you hold down a button or key.
     *
     * @param climbRate the acceleration rate when you hold down a button or key
     * @since 1.4
     */
    public fun setClimbRate(climbRate: Double): Unit =
        adw_spin_row_set_climb_rate(adwSpinRowPointer.reinterpret(), climbRate)

    /**
     * Sets the number of decimal places to display.
     *
     * @param digits the number of decimal places to display
     * @since 1.4
     */
    public fun setDigits(digits: UInt): Unit = adw_spin_row_set_digits(adwSpinRowPointer.reinterpret(), digits)

    /**
     * Sets whether non-numeric characters should be ignored.
     *
     * @param numeric whether non-numeric characters should be ignored
     * @since 1.4
     */
    public fun setNumeric(numeric: Boolean): Unit =
        adw_spin_row_set_numeric(adwSpinRowPointer.reinterpret(), numeric.asGBoolean())

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
    public fun setRange(
        min: Double,
        max: Double,
    ): Unit = adw_spin_row_set_range(adwSpinRowPointer.reinterpret(), min, max)

    /**
     * Sets whether invalid values are snapped to the nearest step increment.
     *
     * @param snapToTicks whether invalid values are snapped to the nearest step increment
     * @since 1.4
     */
    public fun setSnapToTicks(snapToTicks: Boolean): Unit =
        adw_spin_row_set_snap_to_ticks(adwSpinRowPointer.reinterpret(), snapToTicks.asGBoolean())

    /**
     * Sets the policy for updating the spin row.
     *
     * The options are always, or only when the value is invalid.
     *
     * @param policy the policy for updating the spin row
     * @since 1.4
     */
    public fun setUpdatePolicy(policy: SpinButtonUpdatePolicy): Unit =
        adw_spin_row_set_update_policy(adwSpinRowPointer.reinterpret(), policy.nativeValue)

    /**
     * Sets the current value.
     *
     * @param value a new value
     * @since 1.4
     */
    public fun setValue(`value`: Double): Unit = adw_spin_row_set_value(adwSpinRowPointer.reinterpret(), `value`)

    /**
     * Sets whether the spin row should wrap upon reaching its limits.
     *
     * @param wrap whether the spin row should wrap upon reaching its limits
     * @since 1.4
     */
    public fun setWrap(wrap: Boolean): Unit = adw_spin_row_set_wrap(adwSpinRowPointer.reinterpret(), wrap.asGBoolean())

    /**
     * Manually force an update of the spin row.
     *
     * @since 1.4
     */
    public fun update(): Unit = adw_spin_row_update(adwSpinRowPointer.reinterpret())

    /**
     * Emitted to tweak the formatting of the value for display.
     *
     * See [signal@Gtk.SpinButton::output].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Returns `TRUE` if the value has been displayed
     * @since 1.4
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
     * Emitted right after the spinbutton wraps.
     *
     * See [signal@Gtk.SpinButton::wrapped].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.4
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

    public companion object : TypeCompanion<SpinRow> {
        override val type: GeneratedClassKGType<SpinRow> =
            GeneratedClassKGType(adw_spin_row_get_type()) { SpinRow(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}

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

private val connectWrappedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()