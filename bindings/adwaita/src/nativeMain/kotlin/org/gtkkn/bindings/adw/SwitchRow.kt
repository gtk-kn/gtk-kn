// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.adw.annotations.AdwVersion1_4
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwSwitchRow
import org.gtkkn.native.adw.adw_switch_row_get_active
import org.gtkkn.native.adw.adw_switch_row_get_type
import org.gtkkn.native.adw.adw_switch_row_new
import org.gtkkn.native.adw.adw_switch_row_set_active
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean

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
@AdwVersion1_4
public class SwitchRow(public val adwSwitchRowPointer: CPointer<AdwSwitchRow>) :
    ActionRow(adwSwitchRowPointer.reinterpret()),
    KGTyped {
    init {
        Adw
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Whether the switch row is in the "on" or "off" position.
     *
     * @since 1.4
     */
    @AdwVersion1_4
    public var active: Boolean
        /**
         * Gets whether @self is in its "on" or "off" position.
         *
         * @return whether @self is active or not
         * @since 1.4
         */
        get() = adw_switch_row_get_active(adwSwitchRowPointer).asBoolean()

        /**
         * Sets whether @self is in its "on" or "off" position
         *
         * @param isActive whether @self should be active
         * @since 1.4
         */
        @AdwVersion1_4
        set(isActive) = adw_switch_row_set_active(adwSwitchRowPointer, isActive.asGBoolean())

    /**
     * Creates a new `AdwSwitchRow`.
     *
     * @return the newly created `AdwSwitchRow`
     * @since 1.4
     */
    public constructor() : this(adw_switch_row_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<SwitchRow> {
        override val type: GeneratedClassKGType<SwitchRow> =
            GeneratedClassKGType(getTypeOrNull()!!) { SwitchRow(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of SwitchRow
         *
         * @return the GType
         */
        public fun getType(): GType = adw_switch_row_get_type()

        /**
         * Gets the GType of from the symbol `adw_switch_row_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_switch_row_get_type")
    }
}
