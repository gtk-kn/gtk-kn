// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkNative
import org.gtkkn.native.gtk.GtkRoot
import org.gtkkn.native.gtk.GtkShortcutManager
import org.gtkkn.native.gtk.GtkShortcutsWindow
import org.gtkkn.native.gtk.gtk_shortcuts_window_add_section
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
 * [class@Gtk.Builder], by using the `<child>` tag to populate a
 * `GtkShortcutsWindow` with one or more [class@Gtk.ShortcutsSection] objects,
 * which contain one or more [class@Gtk.ShortcutsGroup] instances, which, in turn,
 * contain [class@Gtk.ShortcutsShortcut] instances.
 *
 * If you need to add a section programmatically, use [method@Gtk.ShortcutsWindow.add_section]
 * instead of [method@Gtk.Window.set_child], as the shortcuts window manages
 * its children directly.
 *
 * # A simple example:
 *
 * ![](gedit-shortcuts.png)
 *
 * This example has as single section. As you can see, the shortcut groups
 * are arranged in columns, and spread across several pages if there are too
 * many to find on a single page.
 *
 * The .ui file for this example can be found [here](https://gitlab.gnome.org/GNOME/gtk/tree/main/demos/gtk-demo/shortcuts-gedit.ui).
 *
 * # An example with multiple views:
 *
 * ![](clocks-shortcuts.png)
 *
 * This example shows a `GtkShortcutsWindow` that has been configured to show only
 * the shortcuts relevant to the "stopwatch" view.
 *
 * The .ui file for this example can be found [here](https://gitlab.gnome.org/GNOME/gtk/tree/main/demos/gtk-demo/shortcuts-clocks.ui).
 *
 * # An example with multiple sections:
 *
 * ![](builder-shortcuts.png)
 *
 * This example shows a `GtkShortcutsWindow` with two sections, "Editor Shortcuts"
 * and "Terminal Shortcuts".
 *
 * The .ui file for this example can be found [here](https://gitlab.gnome.org/GNOME/gtk/tree/main/demos/gtk-demo/shortcuts-builder.ui).
 *
 * # Shortcuts and Gestures
 *
 * The following signals have default keybindings:
 *
 * - [signal@Gtk.ShortcutsWindow::close]
 * - [signal@Gtk.ShortcutsWindow::search]
 *
 * # CSS nodes
 *
 * `GtkShortcutsWindow` has a single CSS node with the name `window` and style
 * class `.shortcuts`.
 *
 * ## Skipped during bindings generation
 *
 * - method `section-name`: Property has no getter nor setter
 * - method `view-name`: Property has no getter nor setter
 */
public open class ShortcutsWindow(public val gtkShortcutsWindowPointer: CPointer<GtkShortcutsWindow>) :
    Window(gtkShortcutsWindowPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    override val gtkNativePointer: CPointer<GtkNative>
        get() = handle.reinterpret()

    override val gtkRootPointer: CPointer<GtkRoot>
        get() = handle.reinterpret()

    override val gtkShortcutManagerPointer: CPointer<GtkShortcutManager>
        get() = handle.reinterpret()

    /**
     * Adds a section to the shortcuts window.
     *
     * This is the programmatic equivalent to using [class@Gtk.Builder] and a
     * `<child>` tag to add the child.
     *
     * Using [method@Gtk.Window.set_child] is not appropriate as the shortcuts
     * window manages its children internally.
     *
     * @param section the `GtkShortcutsSection` to add
     * @since 4.14
     */
    @GtkVersion4_14
    public open fun addSection(section: ShortcutsSection): Unit =
        gtk_shortcuts_window_add_section(gtkShortcutsWindowPointer, section.gtkShortcutsSectionPointer)

    /**
     * Emitted when the user uses a keybinding to close the window.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default binding for this signal is the <kbd>Escape</kbd> key.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onClose(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkShortcutsWindowPointer,
            "close",
            onCloseFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "close" signal. See [onClose].
     */
    public fun emitClose() {
        g_signal_emit_by_name(gtkShortcutsWindowPointer.reinterpret(), "close")
    }

    /**
     * Emitted when the user uses a keybinding to start a search.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * The default binding for this signal is <kbd>Control</kbd>+<kbd>F</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onSearch(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkShortcutsWindowPointer,
            "search",
            onSearchFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "search" signal. See [onSearch].
     */
    public fun emitSearch() {
        g_signal_emit_by_name(gtkShortcutsWindowPointer.reinterpret(), "search")
    }

    public companion object : TypeCompanion<ShortcutsWindow> {
        override val type: GeneratedClassKGType<ShortcutsWindow> =
            GeneratedClassKGType(getTypeOrNull()!!) { ShortcutsWindow(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ShortcutsWindow
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_shortcuts_window_get_type()

        /**
         * Gets the GType of from the symbol `gtk_shortcuts_window_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_shortcuts_window_get_type")
    }
}

private val onCloseFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onSearchFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
