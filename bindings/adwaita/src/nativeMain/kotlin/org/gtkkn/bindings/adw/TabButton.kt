// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.adw.annotations.AdwVersion1_3
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.Actionable
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwTabButton
import org.gtkkn.native.adw.adw_tab_button_get_type
import org.gtkkn.native.adw.adw_tab_button_get_view
import org.gtkkn.native.adw.adw_tab_button_new
import org.gtkkn.native.adw.adw_tab_button_set_view
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.ULong
import kotlin.Unit

/**
 * A button that displays the number of [class@TabView] pages.
 *
 * <picture>
 *   <source srcset="tab-button-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="tab-button.png" alt="tab-button">
 * </picture>
 *
 * `AdwTabButton` is a button that displays the number of pages in a given
 * `AdwTabView`, as well as whether one of the inactive pages needs attention.
 *
 * It's intended to be used as a visible indicator when there's no visible tab
 * bar, typically opening an [class@TabOverview] on click, e.g. via the
 * `overview.open` action name:
 *
 * ```xml
 * <object class="AdwTabButton">
 *   <property name="view">view</property>
 *   <property name="action-name">overview.open</property>
 * </object>
 * ```
 *
 * ## CSS nodes
 *
 * `AdwTabButton` has a main CSS node with name `tabbutton`.
 *
 * # Accessibility
 *
 * `AdwTabButton` uses the `GTK_ACCESSIBLE_ROLE_BUTTON` role.
 * @since 1.3
 */
@AdwVersion1_3
public class TabButton(public val adwTabButtonPointer: CPointer<AdwTabButton>) :
    Widget(adwTabButtonPointer.reinterpret()),
    Actionable,
    KGTyped {
    init {
        Adw
    }

    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The view the tab button displays.
     *
     * @since 1.3
     */
    @AdwVersion1_3
    public var view: TabView?
        /**
         * Gets the tab view @self displays.
         *
         * @return the tab view
         * @since 1.3
         */
        get() = adw_tab_button_get_view(adwTabButtonPointer)?.run {
            InstanceCache.get(this, true) { TabView(reinterpret()) }!!
        }

        /**
         * Sets the tab view to display.
         *
         * @param view a tab view
         * @since 1.3
         */
        @AdwVersion1_3
        set(view) = adw_tab_button_set_view(adwTabButtonPointer, view?.adwTabViewPointer)

    /**
     * Creates a new `AdwTabButton`.
     *
     * @return the newly created `AdwTabButton`
     * @since 1.3
     */
    public constructor() : this(adw_tab_button_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Emitted to animate press then release.
     *
     * This is an action signal. Applications should never connect to this signal,
     * but use the [signal@TabButton::clicked] signal.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.3
     */
    @AdwVersion1_3
    public fun onActivate(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            adwTabButtonPointer,
            "activate",
            onActivateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "activate" signal. See [onActivate].
     *
     * @since 1.3
     */
    @AdwVersion1_3
    public fun emitActivate() {
        g_signal_emit_by_name(adwTabButtonPointer.reinterpret(), "activate")
    }

    /**
     * Emitted when the button has been activated (pressed and released).
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.3
     */
    @AdwVersion1_3
    public fun onClicked(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            adwTabButtonPointer,
            "clicked",
            onClickedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "clicked" signal. See [onClicked].
     *
     * @since 1.3
     */
    @AdwVersion1_3
    public fun emitClicked() {
        g_signal_emit_by_name(adwTabButtonPointer.reinterpret(), "clicked")
    }

    public companion object : TypeCompanion<TabButton> {
        override val type: GeneratedClassKGType<TabButton> =
            GeneratedClassKGType(getTypeOrNull()!!) { TabButton(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of TabButton
         *
         * @return the GType
         */
        public fun getType(): GType = adw_tab_button_get_type()

        /**
         * Gets the GType of from the symbol `adw_tab_button_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_tab_button_get_type")
    }
}

private val onActivateFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onClickedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
