// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.cstr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkFileChooser
import org.gtkkn.native.gtk.GtkFileChooserWidget
import org.gtkkn.native.gtk.gtk_file_chooser_widget_get_type
import org.gtkkn.native.gtk.gtk_file_chooser_widget_new
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkFileChooserWidget` is a widget for choosing files.
 *
 * It exposes the [iface@Gtk.FileChooser] interface, and you should
 * use the methods of this interface to interact with the
 * widget.
 *
 * # CSS nodes
 *
 * `GtkFileChooserWidget` has a single CSS node with name filechooser.
 *
 * ## Skipped during bindings generation
 *
 * - method `search-mode`: Property has no getter nor setter
 * - method `show-time`: Property has no getter nor setter
 * - method `subtitle`: Property has no getter nor setter
 */
public open class FileChooserWidget(public val gtkFileChooserWidgetPointer: CPointer<GtkFileChooserWidget>) :
    Widget(gtkFileChooserWidgetPointer.reinterpret()),
    FileChooser,
    KGTyped {
    override val gtkFileChooserPointer: CPointer<GtkFileChooser>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Creates a new `GtkFileChooserWidget`.
     *
     * This is a file chooser widget that can be embedded in custom
     * windows, and it is the same widget that is used by
     * `GtkFileChooserDialog`.
     *
     * @param action Open or save mode for the widget
     * @return a new `GtkFileChooserWidget`
     */
    public constructor(
        action: FileChooserAction,
    ) : this(gtk_file_chooser_widget_new(action.nativeValue)!!.reinterpret())

    /**
     * Emitted when the user asks for it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * This is used to make the file chooser show the user's Desktop
     * folder in the file list.
     *
     * The default binding for this signal is <kbd>Alt</kbd>-<kbd>D</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onDesktopFolder(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkFileChooserWidgetPointer,
            "desktop-folder",
            onDesktopFolderFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "desktop-folder" signal. See [onDesktopFolder].
     */
    public fun emitDesktopFolder() {
        g_signal_emit_by_name(gtkFileChooserWidgetPointer.reinterpret(), "desktop-folder")
    }

    /**
     * Emitted when the user asks for it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * This is used to make the file chooser go to a child of the
     * current folder in the file hierarchy. The subfolder that will
     * be used is displayed in the path bar widget of the file chooser.
     * For example, if the path bar is showing "/foo/bar/baz", with bar
     * currently displayed, then this will cause the file chooser to
     * switch to the "baz" subfolder.
     *
     * The default binding for this signal is <kbd>Alt</kbd>-<kbd>Down</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onDownFolder(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkFileChooserWidgetPointer,
            "down-folder",
            onDownFolderFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "down-folder" signal. See [onDownFolder].
     */
    public fun emitDownFolder() {
        g_signal_emit_by_name(gtkFileChooserWidgetPointer.reinterpret(), "down-folder")
    }

    /**
     * Emitted when the user asks for it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * This is used to make the file chooser show the user's home
     * folder in the file list.
     *
     * The default binding for this signal is <kbd>Alt</kbd>-<kbd>Home</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onHomeFolder(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkFileChooserWidgetPointer,
            "home-folder",
            onHomeFolderFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "home-folder" signal. See [onHomeFolder].
     */
    public fun emitHomeFolder() {
        g_signal_emit_by_name(gtkFileChooserWidgetPointer.reinterpret(), "home-folder")
    }

    /**
     * Emitted when the user asks for it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * This is used to make the file chooser show a "Location" prompt which
     * the user can use to manually type the name of the file he wishes to select.
     *
     * The default bindings for this signal are <kbd>Control</kbd>-<kbd>L</kbd>
     * with a @path string of "" (the empty string). It is also bound to
     * <kbd>/</kbd> with a @path string of "`/`" (a slash):  this lets you
     * type `/` and immediately type a path name. On Unix systems, this is
     * bound to <kbd>~</kbd> (tilde) with a @path string of "~" itself for
     * access to home directories.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `path` a string that gets put in the text entry for the file name
     */
    public fun onLocationPopup(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (path: String) -> Unit): ULong =
        g_signal_connect_data(
            gtkFileChooserWidgetPointer,
            "location-popup",
            onLocationPopupFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "location-popup" signal. See [onLocationPopup].
     *
     * @param path a string that gets put in the text entry for the file name
     */
    public fun emitLocationPopup(path: String) {
        g_signal_emit_by_name(gtkFileChooserWidgetPointer.reinterpret(), "location-popup", path.cstr)
    }

    /**
     * Emitted when the user asks for it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * This is used to make the file chooser show a "Location" prompt
     * when the user pastes into a `GtkFileChooserWidget`.
     *
     * The default binding for this signal is <kbd>Control</kbd>-<kbd>V</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onLocationPopupOnPaste(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkFileChooserWidgetPointer,
            "location-popup-on-paste",
            onLocationPopupOnPasteFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "location-popup-on-paste" signal. See [onLocationPopupOnPaste].
     */
    public fun emitLocationPopupOnPaste() {
        g_signal_emit_by_name(gtkFileChooserWidgetPointer.reinterpret(), "location-popup-on-paste")
    }

    /**
     * Emitted when the user asks for it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * This is used to toggle the visibility of a "Location" prompt
     * which the user can use to manually type the name of the file
     * he wishes to select.
     *
     * The default binding for this signal is <kbd>Control</kbd>-<kbd>L</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onLocationTogglePopup(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkFileChooserWidgetPointer,
            "location-toggle-popup",
            onLocationTogglePopupFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "location-toggle-popup" signal. See [onLocationTogglePopup].
     */
    public fun emitLocationTogglePopup() {
        g_signal_emit_by_name(gtkFileChooserWidgetPointer.reinterpret(), "location-toggle-popup")
    }

    /**
     * Emitted when the user asks for it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * This is used to move the focus to the places sidebar.
     *
     * The default binding for this signal is <kbd>Alt</kbd>-<kbd>P</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onPlacesShortcut(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkFileChooserWidgetPointer,
            "places-shortcut",
            onPlacesShortcutFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "places-shortcut" signal. See [onPlacesShortcut].
     */
    public fun emitPlacesShortcut() {
        g_signal_emit_by_name(gtkFileChooserWidgetPointer.reinterpret(), "places-shortcut")
    }

    /**
     * Emitted when the user asks for it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * This is used to make the file chooser switch to the bookmark
     * specified in the @bookmark_index parameter. For example, if
     * you have three bookmarks, you can pass 0, 1, 2 to this signal
     * to switch to each of them, respectively.
     *
     * The default binding for this signal is <kbd>Alt</kbd>-<kbd>1</kbd>,
     * <kbd>Alt</kbd>-<kbd>2</kbd>, etc. until <kbd>Alt</kbd>-<kbd>0</kbd>.
     * Note that in the default binding, that <kbd>Alt</kbd>-<kbd>1</kbd> is
     * actually defined to switch to the bookmark at index 0, and so on
     * successively.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `bookmarkIndex` the number of the bookmark to switch to
     */
    public fun onQuickBookmark(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (bookmarkIndex: gint) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkFileChooserWidgetPointer,
        "quick-bookmark",
        onQuickBookmarkFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "quick-bookmark" signal. See [onQuickBookmark].
     *
     * @param bookmarkIndex the number of the bookmark to switch to
     */
    public fun emitQuickBookmark(bookmarkIndex: gint) {
        g_signal_emit_by_name(gtkFileChooserWidgetPointer.reinterpret(), "quick-bookmark", bookmarkIndex)
    }

    /**
     * Emitted when the user asks for it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * This is used to make the file chooser show the Recent location.
     *
     * The default binding for this signal is <kbd>Alt</kbd>-<kbd>R</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onRecentShortcut(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkFileChooserWidgetPointer,
            "recent-shortcut",
            onRecentShortcutFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "recent-shortcut" signal. See [onRecentShortcut].
     */
    public fun emitRecentShortcut() {
        g_signal_emit_by_name(gtkFileChooserWidgetPointer.reinterpret(), "recent-shortcut")
    }

    /**
     * Emitted when the user asks for it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * This is used to make the file chooser show the search entry.
     *
     * The default binding for this signal is <kbd>Alt</kbd>-<kbd>S</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onSearchShortcut(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkFileChooserWidgetPointer,
            "search-shortcut",
            onSearchShortcutFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "search-shortcut" signal. See [onSearchShortcut].
     */
    public fun emitSearchShortcut() {
        g_signal_emit_by_name(gtkFileChooserWidgetPointer.reinterpret(), "search-shortcut")
    }

    /**
     * Emitted when the user asks for it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * This is used to make the file chooser display hidden files.
     *
     * The default binding for this signal is <kbd>Control</kbd>-<kbd>H</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onShowHidden(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkFileChooserWidgetPointer,
            "show-hidden",
            onShowHiddenFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "show-hidden" signal. See [onShowHidden].
     */
    public fun emitShowHidden() {
        g_signal_emit_by_name(gtkFileChooserWidgetPointer.reinterpret(), "show-hidden")
    }

    /**
     * Emitted when the user asks for it.
     *
     * This is a [keybinding signal](class.SignalAction.html).
     *
     * This is used to make the file chooser go to the parent
     * of the current folder in the file hierarchy.
     *
     * The default binding for this signal is <kbd>Alt</kbd>-<kbd>Up</kbd>.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onUpFolder(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkFileChooserWidgetPointer,
            "up-folder",
            onUpFolderFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "up-folder" signal. See [onUpFolder].
     */
    public fun emitUpFolder() {
        g_signal_emit_by_name(gtkFileChooserWidgetPointer.reinterpret(), "up-folder")
    }

    public companion object : TypeCompanion<FileChooserWidget> {
        override val type: GeneratedClassKGType<FileChooserWidget> =
            GeneratedClassKGType(gtk_file_chooser_widget_get_type()) { FileChooserWidget(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of FileChooserWidget
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_file_chooser_widget_get_type()
    }
}

private val onDesktopFolderFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onDownFolderFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onHomeFolderFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onLocationPopupFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            path: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                path: String,
            ) -> Unit
            >().get().invoke(path?.toKString() ?: error("Expected not null string"))
    }
        .reinterpret()

private val onLocationPopupOnPasteFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onLocationTogglePopupFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onPlacesShortcutFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onQuickBookmarkFunc: CPointer<CFunction<(gint) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        bookmarkIndex: gint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(bookmarkIndex: gint) -> Unit>().get().invoke(bookmarkIndex)
}
    .reinterpret()

private val onRecentShortcutFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onSearchShortcutFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onShowHiddenFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onUpFolderFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
