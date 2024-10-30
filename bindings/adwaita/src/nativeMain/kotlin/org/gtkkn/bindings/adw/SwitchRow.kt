// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwSwitchRow
import org.gtkkn.native.adw.adw_switch_row_get_active
import org.gtkkn.native.adw.adw_switch_row_get_type
import org.gtkkn.native.adw.adw_switch_row_new
import org.gtkkn.native.adw.adw_switch_row_set_active
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.Unit

/**
 * A [class@Gtk.ListBoxRow] used to represent two states.
 *
 * <picture>
 *   <source srcset="switch-row-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="switch-row.png" alt="switch-row">
 * </picture>
 *
 * The `AdwSwitchRow` widget contains a [class@Gtk.Switch] that allows the user
 * to select between two states: "on" or "off". When activated, the row will
 * invert its active state.
 *
 * The user can control the switch by activating the row or by dragging on the
 * switch handle.
 *
 * See [class@Gtk.Switch] for details.
 *
 * Example of an `AdwSwitchRow` UI definition:
 * ```xml
 * <object class="AdwSwitchRow">
 *   <property name="title" translatable="yes">Switch Row</property>
 *   <signal name="notify::active" handler="switch_row_notify_active_cb"/>
 * </object>
 * ```
 *
 * The [property@SwitchRow:active] property should be connected to in order to
 * monitor changes to the active state.
 * @since 1.4
 */
public class SwitchRow(
    pointer: CPointer<AdwSwitchRow>,
) : ActionRow(pointer.reinterpret()),
    KGTyped {
    public val adwSwitchRowPointer: CPointer<AdwSwitchRow>
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
     * Whether the switch row is in the "on" or "off" position.
     *
     * @since 1.4
     */
    public var active: Boolean
        /**
         * Gets whether @self is in its "on" or "off" position.
         *
         * @return whether @self is active or not
         * @since 1.4
         */
        get() = adw_switch_row_get_active(adwSwitchRowPointer.reinterpret()).asBoolean()

        /**
         * Sets whether @self is in its "on" or "off" position
         *
         * @param isActive whether @self should be active
         * @since 1.4
         */
        set(isActive) = adw_switch_row_set_active(adwSwitchRowPointer.reinterpret(), isActive.asGBoolean())

    /**
     * Creates a new `AdwSwitchRow`.
     *
     * @return the newly created `AdwSwitchRow`
     * @since 1.4
     */
    public constructor() : this(adw_switch_row_new()!!.reinterpret())

    /**
     * Gets whether @self is in its "on" or "off" position.
     *
     * @return whether @self is active or not
     * @since 1.4
     */
    public fun getActive(): Boolean = adw_switch_row_get_active(adwSwitchRowPointer.reinterpret()).asBoolean()

    /**
     * Sets whether @self is in its "on" or "off" position
     *
     * @param isActive whether @self should be active
     * @since 1.4
     */
    public fun setActive(isActive: Boolean): Unit =
        adw_switch_row_set_active(adwSwitchRowPointer.reinterpret(), isActive.asGBoolean())

    public companion object : TypeCompanion<SwitchRow> {
        override val type: GeneratedClassKGType<SwitchRow> =
            GeneratedClassKGType(adw_switch_row_get_type()) { SwitchRow(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}