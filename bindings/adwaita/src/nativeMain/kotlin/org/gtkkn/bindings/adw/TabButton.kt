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
import org.gtkkn.bindings.gtk.Actionable
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwTabButton
import org.gtkkn.native.adw.adw_tab_button_get_type
import org.gtkkn.native.adw.adw_tab_button_get_view
import org.gtkkn.native.adw.adw_tab_button_new
import org.gtkkn.native.adw.adw_tab_button_set_view
import org.gtkkn.native.gobject.g_signal_connect_data
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
public class TabButton(
    pointer: CPointer<AdwTabButton>,
) : Widget(pointer.reinterpret()), Actionable, KGTyped {
    public val adwTabButtonPointer: CPointer<AdwTabButton>
        get() = gPointer.reinterpret()

    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The view the tab button displays.
     *
     * @since 1.3
     */
    public var view: TabView?
        /**
         * Gets the tab view @self displays.
         *
         * @return the tab view
         * @since 1.3
         */
        get() =
            adw_tab_button_get_view(adwTabButtonPointer.reinterpret())?.run {
                TabView(reinterpret())
            }

        /**
         * Sets the tab view to display.
         *
         * @param view a tab view
         * @since 1.3
         */
        set(view) =
            adw_tab_button_set_view(
                adwTabButtonPointer.reinterpret(),
                view?.adwTabViewPointer?.reinterpret()
            )

    /**
     * Creates a new `AdwTabButton`.
     *
     * @return the newly created `AdwTabButton`
     * @since 1.3
     */
    public constructor() : this(adw_tab_button_new()!!.reinterpret())

    /**
     * Gets the tab view @self displays.
     *
     * @return the tab view
     * @since 1.3
     */
    public fun getView(): TabView? =
        adw_tab_button_get_view(adwTabButtonPointer.reinterpret())?.run {
            TabView(reinterpret())
        }

    /**
     * Sets the tab view to display.
     *
     * @param view a tab view
     * @since 1.3
     */
    public fun setView(view: TabView? = null): Unit =
        adw_tab_button_set_view(
            adwTabButtonPointer.reinterpret(),
            view?.adwTabViewPointer?.reinterpret()
        )

    /**
     * Emitted to animate press then release.
     *
     * This is an action signal. Applications should never connect to this signal,
     * but use the [signal@TabButton::clicked] signal.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.3
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
     * Emitted when the button has been activated (pressed and released).
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.3
     */
    public fun connectClicked(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "clicked",
            connectClickedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<TabButton> {
        override val type: GeneratedClassKGType<TabButton> =
            GeneratedClassKGType(adw_tab_button_get_type()) { TabButton(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}

private val connectActivateFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectClickedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()
