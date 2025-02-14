// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkSearchBar
import org.gtkkn.native.gtk.gtk_search_bar_connect_entry
import org.gtkkn.native.gtk.gtk_search_bar_get_child
import org.gtkkn.native.gtk.gtk_search_bar_get_key_capture_widget
import org.gtkkn.native.gtk.gtk_search_bar_get_search_mode
import org.gtkkn.native.gtk.gtk_search_bar_get_show_close_button
import org.gtkkn.native.gtk.gtk_search_bar_get_type
import org.gtkkn.native.gtk.gtk_search_bar_new
import org.gtkkn.native.gtk.gtk_search_bar_set_child
import org.gtkkn.native.gtk.gtk_search_bar_set_key_capture_widget
import org.gtkkn.native.gtk.gtk_search_bar_set_search_mode
import org.gtkkn.native.gtk.gtk_search_bar_set_show_close_button
import kotlin.Boolean
import kotlin.Unit

/**
 * `GtkSearchBar` is a container made to have a search entry.
 *
 * ![An example GtkSearchBar](search-bar.png)
 *
 * It can also contain additional widgets, such as drop-down menus,
 * or buttons.  The search bar would appear when a search is started
 * through typing on the keyboard, or the application’s search mode
 * is toggled on.
 *
 * For keyboard presses to start a search, the search bar must be told
 * of a widget to capture key events from through
 * [method@Gtk.SearchBar.set_key_capture_widget]. This widget will
 * typically be the top-level window, or a parent container of the
 * search bar. Common shortcuts such as Ctrl+F should be handled as an
 * application action, or through the menu items.
 *
 * You will also need to tell the search bar about which entry you
 * are using as your search entry using [method@Gtk.SearchBar.connect_entry].
 *
 * ## Creating a search bar
 *
 * The following example shows you how to create a more complex search
 * entry.
 *
 * [A simple example](https://gitlab.gnome.org/GNOME/gtk/tree/main/examples/search-bar.c)
 *
 * # Shortcuts and Gestures
 *
 * `GtkSearchBar` supports the following keyboard shortcuts:
 *
 * - <kbd>Escape</kbd> hides the search bar.
 *
 * # CSS nodes
 *
 * ```
 * searchbar
 * ╰── revealer
 *     ╰── box
 *          ├── [child]
 *          ╰── [button.close]
 * ```
 *
 * `GtkSearchBar` has a main CSS node with name searchbar. It has a child
 * node with name revealer that contains a node with name box. The box node
 * contains both the CSS node of the child widget as well as an optional button
 * node which gets the .close style class applied.
 *
 * # Accessibility
 *
 * `GtkSearchBar` uses the %GTK_ACCESSIBLE_ROLE_SEARCH role.
 */
public open class SearchBar(public val gtkSearchBarPointer: CPointer<GtkSearchBar>) :
    Widget(gtkSearchBarPointer.reinterpret()),
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

    /**
     * The child widget.
     */
    public open var child: Widget?
        /**
         * Gets the child widget of @bar.
         *
         * @return the child widget of @bar
         */
        get() = gtk_search_bar_get_child(gtkSearchBarPointer)?.run {
            InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
        }

        /**
         * Sets the child widget of @bar.
         *
         * @param child the child widget
         */
        set(child) = gtk_search_bar_set_child(gtkSearchBarPointer, child?.gtkWidgetPointer)

    /**
     * The key capture widget.
     */
    public open var keyCaptureWidget: Widget?
        /**
         * Gets the widget that @bar is capturing key events from.
         *
         * @return The key capture widget.
         */
        get() = gtk_search_bar_get_key_capture_widget(gtkSearchBarPointer)?.run {
            InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
        }

        /**
         * Sets @widget as the widget that @bar will capture key events
         * from.
         *
         * If key events are handled by the search bar, the bar will
         * be shown, and the entry populated with the entered text.
         *
         * Note that despite the name of this function, the events
         * are only 'captured' in the bubble phase, which means that
         * editable child widgets of @widget will receive text input
         * before it gets captured. If that is not desired, you can
         * capture and forward the events yourself with
         * [method@Gtk.EventControllerKey.forward].
         *
         * @param widget a `GtkWidget`
         */
        set(widget) = gtk_search_bar_set_key_capture_widget(gtkSearchBarPointer, widget?.gtkWidgetPointer)

    /**
     * Whether the search mode is on and the search bar shown.
     */
    public open var searchModeEnabled: Boolean
        /**
         * Returns whether the search mode is on or off.
         *
         * @return whether search mode is toggled on
         */
        get() = gtk_search_bar_get_search_mode(gtkSearchBarPointer).asBoolean()

        /**
         * Switches the search mode on or off.
         *
         * @param searchMode the new state of the search mode
         */
        set(searchMode) = gtk_search_bar_set_search_mode(gtkSearchBarPointer, searchMode.asGBoolean())

    /**
     * Whether to show the close button in the search bar.
     */
    public open var showCloseButton: Boolean
        /**
         * Returns whether the close button is shown.
         *
         * @return whether the close button is shown
         */
        get() = gtk_search_bar_get_show_close_button(gtkSearchBarPointer).asBoolean()

        /**
         * Shows or hides the close button.
         *
         * Applications that already have a “search” toggle button should not
         * show a close button in their search bar, as it duplicates the role
         * of the toggle button.
         *
         * @param visible whether the close button will be shown or not
         */
        set(visible) = gtk_search_bar_set_show_close_button(gtkSearchBarPointer, visible.asGBoolean())

    /**
     * Creates a `GtkSearchBar`.
     *
     * You will need to tell it about which widget is going to be your text
     * entry using [method@Gtk.SearchBar.connect_entry].
     *
     * @return a new `GtkSearchBar`
     */
    public constructor() : this(gtk_search_bar_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Connects the `GtkEditable` widget passed as the one to be used in
     * this search bar.
     *
     * The entry should be a descendant of the search bar. Calling this
     * function manually is only required if the entry isn’t the direct
     * child of the search bar (as in our main example).
     *
     * @param entry a `GtkEditable`
     */
    public open fun connectEntry(entry: Editable): Unit =
        gtk_search_bar_connect_entry(gtkSearchBarPointer, entry.gtkEditablePointer)

    public companion object : TypeCompanion<SearchBar> {
        override val type: GeneratedClassKGType<SearchBar> =
            GeneratedClassKGType(getTypeOrNull()!!) { SearchBar(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of SearchBar
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_search_bar_get_type()

        /**
         * Gets the GType of from the symbol `gtk_search_bar_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_search_bar_get_type")
    }
}
