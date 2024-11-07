// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.atk.annotations.AtkVersion1_12
import org.gtkkn.bindings.atk.annotations.AtkVersion2_12
import org.gtkkn.bindings.glib.SList
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkValue
import org.gtkkn.native.atk.atk_value_get_current_value
import org.gtkkn.native.atk.atk_value_get_increment
import org.gtkkn.native.atk.atk_value_get_maximum_value
import org.gtkkn.native.atk.atk_value_get_minimum_increment
import org.gtkkn.native.atk.atk_value_get_minimum_value
import org.gtkkn.native.atk.atk_value_get_range
import org.gtkkn.native.atk.atk_value_get_sub_ranges
import org.gtkkn.native.atk.atk_value_get_type
import org.gtkkn.native.atk.atk_value_set_current_value
import org.gtkkn.native.atk.atk_value_set_value
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * The ATK interface implemented by valuators and components which display or select a value from a bounded range of values.
 *
 * #AtkValue should be implemented for components which either display
 * a value from a bounded range, or which allow the user to specify a
 * value from a bounded range, or both. For instance, most sliders and
 * range controls, as well as dials, should have #AtkObject
 * representations which implement #AtkValue on the component's
 * behalf. #AtKValues may be read-only, in which case attempts to
 * alter the value return would fail.
 *
 * <refsect1 id="current-value-text">
 * <title>On the subject of current value text</title>
 * <para>
 * In addition to providing the current value, implementors can
 * optionally provide an end-user-consumable textual description
 * associated with this value. This description should be included
 * when the numeric value fails to convey the full, on-screen
 * representation seen by users.
 * </para>
 *
 * <example>
 * <title>Password strength</title>
 * A password strength meter whose value changes as the user types
 * their new password. Red is used for values less than 4.0, yellow
 * for values between 4.0 and 7.0, and green for values greater than
 * 7.0. In this instance, value text should be provided by the
 * implementor. Appropriate value text would be "weak", "acceptable,"
 * and "strong" respectively.
 * </example>
 *
 * A level bar whose value changes to reflect the battery charge. The
 * color remains the same regardless of the charge and there is no
 * on-screen text reflecting the fullness of the battery. In this
 * case, because the position within the bar is the only indication
 * the user has of the current charge, value text should not be
 * provided by the implementor.
 *
 * <refsect2 id="implementor-notes">
 * <title>Implementor Notes</title>
 * <para>
 * Implementors should bear in mind that assistive technologies will
 * likely prefer the value text provided over the numeric value when
 * presenting a widget's value. As a result, strings not intended for
 * end users should not be exposed in the value text, and strings
 * which are exposed should be localized. In the case of widgets which
 * display value text on screen, for instance through a separate label
 * in close proximity to the value-displaying widget, it is still
 * expected that implementors will expose the value text using the
 * above API.
 * </para>
 *
 * <para>
 * #AtkValue should NOT be implemented for widgets whose displayed
 * value is not reflective of a meaningful amount. For instance, a
 * progress pulse indicator whose value alternates between 0.0 and 1.0
 * to indicate that some process is still taking place should not
 * implement #AtkValue because the current value does not reflect
 * progress towards completion.
 * </para>
 * </refsect2>
 * </refsect1>
 *
 * <refsect1 id="ranges">
 * <title>On the subject of ranges</title>
 * <para>
 * In addition to providing the minimum and maximum values,
 * implementors can optionally provide details about subranges
 * associated with the widget. These details should be provided by the
 * implementor when both of the following are communicated visually to
 * the end user:
 * </para>
 * <itemizedlist>
 *   <listitem>The existence of distinct ranges such as "weak",
 *   "acceptable", and "strong" indicated by color, bar tick marks,
 *   and/or on-screen text.</listitem>
 *   <listitem>Where the current value stands within a given subrange,
 *   for instance illustrating progression from very "weak" towards
 *   nearly "acceptable" through changes in shade and/or position on
 *   the bar within the "weak" subrange.</listitem>
 * </itemizedlist>
 * <para>
 * If both of the above do not apply to the widget, it should be
 * sufficient to expose the numeric value, along with the value text
 * if appropriate, to make the widget accessible.
 * </para>
 *
 * <refsect2 id="ranges-implementor-notes">
 * <title>Implementor Notes</title>
 * <para>
 * If providing subrange details is deemed necessary, all possible
 * values of the widget are expected to fall within one of the
 * subranges defined by the implementor.
 * </para>
 * </refsect2>
 * </refsect1>
 *
 * <refsect1 id="localization">
 * <title>On the subject of localization of end-user-consumable text
 * values</title>
 * <para>
 * Because value text and subrange descriptors are human-consumable,
 * implementors are expected to provide localized strings which can be
 * directly presented to end users via their assistive technology. In
 * order to simplify this for implementors, implementors can use
 * atk_value_type_get_localized_name() with the following
 * already-localized constants for commonly-needed values can be used:
 * </para>
 *
 * <itemizedlist>
 *   <listitem>ATK_VALUE_VERY_WEAK</listitem>
 *   <listitem>ATK_VALUE_WEAK</listitem>
 *   <listitem>ATK_VALUE_ACCEPTABLE</listitem>
 *   <listitem>ATK_VALUE_STRONG</listitem>
 *   <listitem>ATK_VALUE_VERY_STRONG</listitem>
 *   <listitem>ATK_VALUE_VERY_LOW</listitem>
 *   <listitem>ATK_VALUE_LOW</listitem>
 *   <listitem>ATK_VALUE_MEDIUM</listitem>
 *   <listitem>ATK_VALUE_HIGH</listitem>
 *   <listitem>ATK_VALUE_VERY_HIGH</listitem>
 *   <listitem>ATK_VALUE_VERY_BAD</listitem>
 *   <listitem>ATK_VALUE_BAD</listitem>
 *   <listitem>ATK_VALUE_GOOD</listitem>
 *   <listitem>ATK_VALUE_VERY_GOOD</listitem>
 *   <listitem>ATK_VALUE_BEST</listitem>
 *   <listitem>ATK_VALUE_SUBSUBOPTIMAL</listitem>
 *   <listitem>ATK_VALUE_SUBOPTIMAL</listitem>
 *   <listitem>ATK_VALUE_OPTIMAL</listitem>
 * </itemizedlist>
 * <para>
 * Proposals for additional constants, along with their use cases,
 * should be submitted to the GNOME Accessibility Team.
 * </para>
 * </refsect1>
 *
 * <refsect1 id="changes">
 * <title>On the subject of changes</title>
 * <para>
 * Note that if there is a textual description associated with the new
 * numeric value, that description should be included regardless of
 * whether or not it has also changed.
 * </para>
 * </refsect1>
 *
 * ## Skipped during bindings generation
 *
 * - parameter `value`: value: Out parameter is not supported
 */
public interface Value :
    Interface,
    KGTyped {
    public val atkValuePointer: CPointer<AtkValue>

    /**
     * Gets the value of this object.
     *
     * @param value a #GValue representing the current accessible value
     */
    public fun getCurrentValue(`value`: org.gtkkn.bindings.gobject.Value): Unit =
        atk_value_get_current_value(atkValuePointer.reinterpret(), `value`.gobjectValuePointer)

    /**
     * Gets the minimum increment by which the value of this object may be
     * changed.  If zero, the minimum increment is undefined, which may
     * mean that it is limited only by the floating point precision of the
     * platform.
     *
     * @return the minimum increment by which the value of this
     * object may be changed. zero if undefined.
     * @since 2.12
     */
    @AtkVersion2_12
    public fun getIncrement(): Double = atk_value_get_increment(atkValuePointer.reinterpret())

    /**
     * Gets the maximum value of this object.
     *
     * @param value a #GValue representing the maximum accessible value
     */
    public fun getMaximumValue(`value`: org.gtkkn.bindings.gobject.Value): Unit =
        atk_value_get_maximum_value(atkValuePointer.reinterpret(), `value`.gobjectValuePointer)

    /**
     * Gets the minimum increment by which the value of this object may be changed.  If zero,
     * the minimum increment is undefined, which may mean that it is limited only by the
     * floating point precision of the platform.
     *
     * @param value a #GValue representing the minimum increment by which the accessible value may be changed
     * @since 1.12
     */
    @AtkVersion1_12
    public fun getMinimumIncrement(`value`: org.gtkkn.bindings.gobject.Value): Unit =
        atk_value_get_minimum_increment(atkValuePointer.reinterpret(), `value`.gobjectValuePointer)

    /**
     * Gets the minimum value of this object.
     *
     * @param value a #GValue representing the minimum accessible value
     */
    public fun getMinimumValue(`value`: org.gtkkn.bindings.gobject.Value): Unit =
        atk_value_get_minimum_value(atkValuePointer.reinterpret(), `value`.gobjectValuePointer)

    /**
     * Gets the range of this object.
     *
     * @return a newly allocated #AtkRange
     * that represents the minimum, maximum and descriptor (if available)
     * of @obj. NULL if that range is not defined.
     * @since 2.12
     */
    @AtkVersion2_12
    public fun getRange(): Range? =
        atk_value_get_range(atkValuePointer.reinterpret())?.run {
            Range(reinterpret())
        }

    /**
     * Gets the list of subranges defined for this object. See #AtkValue
     * introduction for examples of subranges and when to expose them.
     *
     * @return an #GSList of
     * #AtkRange which each of the subranges defined for this object. Free
     * the returns list with g_slist_free().
     * @since 2.12
     */
    @AtkVersion2_12
    public fun getSubRanges(): SList =
        atk_value_get_sub_ranges(atkValuePointer.reinterpret())!!.run {
            SList(reinterpret())
        }

    /**
     * Sets the value of this object.
     *
     * @param value a #GValue which is the desired new accessible value.
     * @return true if new value is successfully set, false otherwise.
     */
    public fun setCurrentValue(`value`: org.gtkkn.bindings.gobject.Value): Boolean =
        atk_value_set_current_value(atkValuePointer.reinterpret(), `value`.gobjectValuePointer).asBoolean()

    /**
     * Sets the value of this object.
     *
     * This method is intended to provide a way to change the value of the
     * object. In any case, it is possible that the value can't be
     * modified (ie: a read-only component). If the value changes due this
     * call, it is possible that the text could change, and will trigger
     * an #AtkValue::value-changed signal emission.
     *
     * Note for implementors: the deprecated atk_value_set_current_value()
     * method returned TRUE or FALSE depending if the value was assigned
     * or not. In the practice several implementors were not able to
     * decide it, and returned TRUE in any case. For that reason it is not
     * required anymore to return if the value was properly assigned or
     * not.
     *
     * @param newValue a double which is the desired new accessible value.
     * @since 2.12
     */
    @AtkVersion2_12
    public fun setValue(newValue: Double): Unit = atk_value_set_value(atkValuePointer.reinterpret(), newValue)

    /**
     * The 'value-changed' signal is emitted when the current value
     * that represent the object changes. @value is the numerical
     * representation of this new value.  @text is the human
     * readable text alternative of @value, and can be NULL if it is
     * not available. Note that if there is a textual description
     * associated with the new numeric value, that description
     * should be included regardless of whether or not it has also
     * changed.
     *
     * Example: a password meter whose value changes as the user
     * types their new password. Appropiate value text would be
     * "weak", "acceptable" and "strong".
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `value` the new value in a numerical form.; `text` human readable text alternative (also called
     * description) of this object. NULL if not available.
     * @since 2.12
     */
    @AtkVersion2_12
    public fun connectValueChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (`value`: Double, text: String) -> Unit,
    ): ULong =
        g_signal_connect_data(
            atkValuePointer.reinterpret(),
            "value-changed",
            connectValueChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    private data class Wrapper(
        private val pointer: CPointer<AtkValue>,
    ) : Value {
        override val atkValuePointer: CPointer<AtkValue> = pointer
    }

    public companion object : TypeCompanion<Value> {
        override val type: GeneratedInterfaceKGType<Value> =
            GeneratedInterfaceKGType(atk_value_get_type()) { Wrapper(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<AtkValue>): Value = Wrapper(pointer)
    }
}

private val connectValueChangedFunc: CPointer<CFunction<(Double, CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            `value`: Double,
            text: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(`value`: Double, text: String) -> Unit>().get().invoke(
            `value`,
            text?.toKString() ?: error("Expected not null string")
        )
    }.reinterpret()
