// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gio.Menu
import org.gtkkn.bindings.gio.SimpleActionGroup
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.he.HeTab
import org.gtkkn.native.he.HeTabSwitcher
import org.gtkkn.native.he.he_tab_switcher_get_actions
import org.gtkkn.native.he.he_tab_switcher_get_allow_closing
import org.gtkkn.native.he.he_tab_switcher_get_allow_drag
import org.gtkkn.native.he.he_tab_switcher_get_allow_duplicate_tabs
import org.gtkkn.native.he.he_tab_switcher_get_allow_new_window
import org.gtkkn.native.he.he_tab_switcher_get_allow_pinning
import org.gtkkn.native.he.he_tab_switcher_get_current
import org.gtkkn.native.he.he_tab_switcher_get_menu
import org.gtkkn.native.he.he_tab_switcher_get_n_tabs
import org.gtkkn.native.he.he_tab_switcher_get_tab_bar_behavior
import org.gtkkn.native.he.he_tab_switcher_get_tab_position
import org.gtkkn.native.he.he_tab_switcher_get_tabs
import org.gtkkn.native.he.he_tab_switcher_get_type
import org.gtkkn.native.he.he_tab_switcher_insert_tab
import org.gtkkn.native.he.he_tab_switcher_new
import org.gtkkn.native.he.he_tab_switcher_remove_tab
import org.gtkkn.native.he.he_tab_switcher_set_allow_closing
import org.gtkkn.native.he.he_tab_switcher_set_allow_drag
import org.gtkkn.native.he.he_tab_switcher_set_allow_duplicate_tabs
import org.gtkkn.native.he.he_tab_switcher_set_allow_new_window
import org.gtkkn.native.he.he_tab_switcher_set_allow_pinning
import org.gtkkn.native.he.he_tab_switcher_set_current
import org.gtkkn.native.he.he_tab_switcher_set_tab_bar_behavior
import kotlin.Boolean
import kotlin.Int
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `n-tabs`: Property has no getter nor setter
 * - method `tabs`: Property has no getter nor setter
 * - method `tab-bar-behavior`: Property has no getter nor setter
 * - method `allow-duplicate-tabs`: Property has no getter nor setter
 * - method `allow-drag`: Property has no getter nor setter
 * - method `allow-pinning`: Property has no getter nor setter
 * - method `allow-closing`: Property has no getter nor setter
 * - method `allow-new-window`: Property has no getter nor setter
 * - method `current`: Property has no getter nor setter
 * - method `menu`: Property has no getter nor setter
 * - method `actions`: Property has no getter nor setter
 */
public open class TabSwitcher(
    pointer: CPointer<HeTabSwitcher>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heTabSwitcherPointer: CPointer<HeTabSwitcher>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    public constructor() : this(he_tab_switcher_new()!!.reinterpret())

    public open fun getNTabs(): Int = he_tab_switcher_get_n_tabs(heTabSwitcherPointer.reinterpret())

    public open fun getTabs(): List =
        he_tab_switcher_get_tabs(heTabSwitcherPointer.reinterpret())!!.run {
            List(reinterpret())
        }

    public open fun getTabBarBehavior(): TabSwitcherTabBarBehavior =
        he_tab_switcher_get_tab_bar_behavior(heTabSwitcherPointer.reinterpret()).run {
            TabSwitcherTabBarBehavior.fromNativeValue(this)
        }

    /**
     *
     *
     * @param value
     */
    public open fun setTabBarBehavior(`value`: TabSwitcherTabBarBehavior): Unit =
        he_tab_switcher_set_tab_bar_behavior(
            heTabSwitcherPointer.reinterpret(),
            `value`.nativeValue
        )

    /**
     *
     *
     * @param tab
     */
    public open fun getTabPosition(tab: Tab): Int =
        he_tab_switcher_get_tab_position(
            heTabSwitcherPointer.reinterpret(),
            tab.heTabPointer.reinterpret()
        )

    public open fun getAllowDuplicateTabs(): Boolean =
        he_tab_switcher_get_allow_duplicate_tabs(heTabSwitcherPointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     */
    public open fun setAllowDuplicateTabs(`value`: Boolean): Unit =
        he_tab_switcher_set_allow_duplicate_tabs(
            heTabSwitcherPointer.reinterpret(),
            `value`.asGBoolean()
        )

    public open fun getAllowDrag(): Boolean =
        he_tab_switcher_get_allow_drag(heTabSwitcherPointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     */
    public open fun setAllowDrag(`value`: Boolean): Unit =
        he_tab_switcher_set_allow_drag(heTabSwitcherPointer.reinterpret(), `value`.asGBoolean())

    public open fun getAllowPinning(): Boolean =
        he_tab_switcher_get_allow_pinning(heTabSwitcherPointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     */
    public open fun setAllowPinning(`value`: Boolean): Unit =
        he_tab_switcher_set_allow_pinning(
            heTabSwitcherPointer.reinterpret(),
            `value`.asGBoolean()
        )

    public open fun getAllowClosing(): Boolean =
        he_tab_switcher_get_allow_closing(heTabSwitcherPointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     */
    public open fun setAllowClosing(`value`: Boolean): Unit =
        he_tab_switcher_set_allow_closing(
            heTabSwitcherPointer.reinterpret(),
            `value`.asGBoolean()
        )

    public open fun getAllowNewWindow(): Boolean =
        he_tab_switcher_get_allow_new_window(heTabSwitcherPointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     */
    public open fun setAllowNewWindow(`value`: Boolean): Unit =
        he_tab_switcher_set_allow_new_window(
            heTabSwitcherPointer.reinterpret(),
            `value`.asGBoolean()
        )

    public open fun getCurrent(): Tab =
        he_tab_switcher_get_current(heTabSwitcherPointer.reinterpret())!!.run {
            Tab(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setCurrent(`value`: Tab): Unit =
        he_tab_switcher_set_current(
            heTabSwitcherPointer.reinterpret(),
            `value`.heTabPointer.reinterpret()
        )

    /**
     *
     *
     * @param tab
     * @param index
     */
    public open fun insertTab(
        tab: Tab,
        index: Int,
    ): UInt =
        he_tab_switcher_insert_tab(
            heTabSwitcherPointer.reinterpret(),
            tab.heTabPointer.reinterpret(),
            index
        )

    /**
     *
     *
     * @param tab
     */
    public open fun removeTab(tab: Tab): Unit =
        he_tab_switcher_remove_tab(
            heTabSwitcherPointer.reinterpret(),
            tab.heTabPointer.reinterpret()
        )

    public open fun getMenu(): Menu =
        he_tab_switcher_get_menu(heTabSwitcherPointer.reinterpret())!!.run {
            Menu(reinterpret())
        }

    public open fun getActions(): SimpleActionGroup =
        he_tab_switcher_get_actions(heTabSwitcherPointer.reinterpret())!!.run {
            SimpleActionGroup(reinterpret())
        }

    /**
     *
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `tab`
     */
    public fun connectTabAdded(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (tab: Tab) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "tab-added",
            connectTabAddedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     *
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `tab`
     */
    public fun connectTabRemoved(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (tab: Tab) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "tab-removed",
            connectTabRemovedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     *
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `oldTab` ; `newTab`
     */
    public fun connectTabSwitched(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (oldTab: Tab?, newTab: Tab) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "tab-switched",
            connectTabSwitchedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     *
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `tab`
     */
    public fun connectTabMoved(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (tab: Tab) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "tab-moved",
            connectTabMovedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     *
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `duplicatedTab`
     */
    public fun connectTabDuplicated(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (duplicatedTab: Tab) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "tab-duplicated",
            connectTabDuplicatedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     *
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectNewTabRequested(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "new-tab-requested",
            connectNewTabRequestedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     *
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `tab`
     */
    public fun connectCloseTabRequested(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (tab: Tab) -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "close-tab-requested",
            connectCloseTabRequestedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<TabSwitcher> {
        override val type: GeneratedClassKGType<TabSwitcher> =
            GeneratedClassKGType(he_tab_switcher_get_type()) { TabSwitcher(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}

private val connectTabAddedFunc: CPointer<CFunction<(CPointer<HeTab>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            tab: CPointer<HeTab>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(tab: Tab) -> Unit>().get().invoke(
            tab!!.run {
                Tab(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectTabRemovedFunc: CPointer<CFunction<(CPointer<HeTab>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            tab: CPointer<HeTab>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(tab: Tab) -> Unit>().get().invoke(
            tab!!.run {
                Tab(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectTabSwitchedFunc: CPointer<CFunction<(CPointer<HeTab>?, CPointer<HeTab>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            oldTab: CPointer<HeTab>?,
            newTab: CPointer<HeTab>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(oldTab: Tab?, newTab: Tab) -> Unit>().get().invoke(
            oldTab?.run {
                Tab(reinterpret())
            },
            newTab!!.run {
                Tab(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectTabMovedFunc: CPointer<CFunction<(CPointer<HeTab>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            tab: CPointer<HeTab>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(tab: Tab) -> Unit>().get().invoke(
            tab!!.run {
                Tab(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectTabDuplicatedFunc: CPointer<CFunction<(CPointer<HeTab>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            duplicatedTab: CPointer<HeTab>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(duplicatedTab: Tab) -> Unit>().get().invoke(
            duplicatedTab!!.run {
                Tab(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectNewTabRequestedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectCloseTabRequestedFunc: CPointer<CFunction<(CPointer<HeTab>) -> Int>> =
    staticCFunction {
            _: COpaquePointer,
            tab: CPointer<HeTab>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(tab: Tab) -> Boolean>().get().invoke(
            tab!!.run {
                Tab(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()
