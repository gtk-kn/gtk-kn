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
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkNative
import org.gtkkn.native.gtk.GtkRoot
import org.gtkkn.native.gtk.GtkShortcutManager
import org.gtkkn.native.gtk.GtkShortcutsWindow
import org.gtkkn.native.gtk.gtk_shortcuts_window_get_type
import kotlin.ULong
import kotlin.Unit

/**
 * A `GtkShortcutsWindow` shows information about the keyboard shortcuts
 * and gestures of an application.
 *
 * The shortcuts can be grouped, and you can have multiple sections in this
 * window, corresponding to the major modes of your application.
 *
 * Additionally, the shortcuts can be filtered by the current view, to avoid
 * showing information that is not relevant in the current application context.
 *
 * The recommended way to construct a `GtkShortcutsWindow` is with
 * [class@Gtk.Builder], by populating a `GtkShortcutsWindow` with one or
 * more `GtkShortcutsSection` objects, which contain `GtkShortcutsGroups`
 * that in turn contain objects of class `GtkShortcutsShortcut`.
 *
 * # A simple example:
 *
 * ![](gedit-shortcuts.png)
 *
 * This example has as single section. As you can see, the shortcut groups
 * are arranged in columns, and spread across several pages if there are too
 * many to find on a single page.
 *
 * The .ui file for this example can be found
 * [here](https://gitlab.gnome.org/GNOME/gtk/tree/main/demos/gtk-demo/shortcuts-gedit.ui).
 *
 * # An example with multiple views:
 *
 * ![](clocks-shortcuts.png)
 *
 * This example shows a `GtkShortcutsWindow` that has been configured to show only
 * the shortcuts relevant to the "stopwatch" view.
 *
 * The .ui file for this example can be found
 * [here](https://gitlab.gnome.org/GNOME/gtk/tree/main/demos/gtk-demo/shortcuts-clocks.ui).
 *
 * # An example with multiple sections:
 *
 * ![](builder-shortcuts.png)
 *
 * This example shows a `GtkShortcutsWindow` with two sections, "Editor Shortcuts"
 * and "Terminal Shortcuts".
 *
 * The .ui file for this example can be found
 * [here](https://gitlab.gnome.org/GNOME/gtk/tree/main/demos/gtk-demo/shortcuts-builder.ui).
 *
 * ## Skipped during bindings generation
 *
 * - method `section-name`: Property has no getter nor setter
 * - method `view-name`: Property has no getter nor setter
 */
public open class ShortcutsWindow(
    pointer: CPointer<GtkShortcutsWindow>,
) : Window(pointer.reinterpret()), KGTyped {
    public val gtkShortcutsWindowPointer: CPointer<GtkShortcutsWindow>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    override val gtkNativePointer: CPointer<GtkNative>
        get() = gPointer.reinterpret()

    override val gtkRootPointer: CPointer<GtkRoot>
        get() = gPointer.reinterpret()

    override val gtkShortcutManagerPointer: CPointer<GtkShortcutManager>
        get() = gPointer.reinterpret()

    /**
     * Emitted when the user uses a keybinding to close the window.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default binding for this signal is the Escape key.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectClose(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "close",
            connectCloseFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the user uses a keybinding to start a search.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default binding for this signal is Control-F.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectSearch(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "search",
            connectSearchFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<ShortcutsWindow> {
        override val type: GeneratedClassKGType<ShortcutsWindow> =
            GeneratedClassKGType(gtk_shortcuts_window_get_type()) {
                ShortcutsWindow(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectCloseFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectSearchFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()
