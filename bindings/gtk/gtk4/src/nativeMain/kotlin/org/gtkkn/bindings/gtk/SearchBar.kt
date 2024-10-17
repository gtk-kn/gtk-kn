// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
 *
 * ## Skipped during bindings generation
 *
 * - method `search-mode-enabled`: Property has no getter nor setter
 */
public open class SearchBar(
    pointer: CPointer<GtkSearchBar>,
) : Widget(pointer.reinterpret()), KGTyped {
    public val gtkSearchBarPointer: CPointer<GtkSearchBar>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The child widget.
     */
    public open var child: Widget?
        /**
         * Gets the child widget of @bar.
         *
         * @return the child widget of @bar
         */
        get() =
            gtk_search_bar_get_child(gtkSearchBarPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the child widget of @bar.
         *
         * @param child the child widget
         */
        set(child) =
            gtk_search_bar_set_child(
                gtkSearchBarPointer.reinterpret(),
                child?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * The key capture widget.
     */
    public open var keyCaptureWidget: Widget?
        /**
         * Gets the widget that @bar is capturing key events from.
         *
         * @return The key capture widget.
         */
        get() =
            gtk_search_bar_get_key_capture_widget(gtkSearchBarPointer.reinterpret())?.run {
                Widget(reinterpret())
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
        set(widget) =
            gtk_search_bar_set_key_capture_widget(
                gtkSearchBarPointer.reinterpret(),
                widget?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * Whether to show the close button in the search bar.
     */
    public open var showCloseButton: Boolean
        /**
         * Returns whether the close button is shown.
         *
         * @return whether the close button is shown
         */
        get() = gtk_search_bar_get_show_close_button(gtkSearchBarPointer.reinterpret()).asBoolean()

        /**
         * Shows or hides the close button.
         *
         * Applications that already have a “search” toggle button should not
         * show a close button in their search bar, as it duplicates the role
         * of the toggle button.
         *
         * @param visible whether the close button will be shown or not
         */
        set(visible) =
            gtk_search_bar_set_show_close_button(
                gtkSearchBarPointer.reinterpret(),
                visible.asGBoolean()
            )

    /**
     * Creates a `GtkSearchBar`.
     *
     * You will need to tell it about which widget is going to be your text
     * entry using [method@Gtk.SearchBar.connect_entry].
     *
     * @return a new `GtkSearchBar`
     */
    public constructor() : this(gtk_search_bar_new()!!.reinterpret())

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
        gtk_search_bar_connect_entry(
            gtkSearchBarPointer.reinterpret(),
            entry.gtkEditablePointer
        )

    /**
     * Gets the child widget of @bar.
     *
     * @return the child widget of @bar
     */
    public open fun getChild(): Widget? =
        gtk_search_bar_get_child(gtkSearchBarPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets the widget that @bar is capturing key events from.
     *
     * @return The key capture widget.
     */
    public open fun getKeyCaptureWidget(): Widget? =
        gtk_search_bar_get_key_capture_widget(gtkSearchBarPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Returns whether the search mode is on or off.
     *
     * @return whether search mode is toggled on
     */
    public open fun getSearchMode(): Boolean =
        gtk_search_bar_get_search_mode(gtkSearchBarPointer.reinterpret()).asBoolean()

    /**
     * Returns whether the close button is shown.
     *
     * @return whether the close button is shown
     */
    public open fun getShowCloseButton(): Boolean =
        gtk_search_bar_get_show_close_button(gtkSearchBarPointer.reinterpret()).asBoolean()

    /**
     * Sets the child widget of @bar.
     *
     * @param child the child widget
     */
    public open fun setChild(child: Widget? = null): Unit =
        gtk_search_bar_set_child(
            gtkSearchBarPointer.reinterpret(),
            child?.gtkWidgetPointer?.reinterpret()
        )

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
    public open fun setKeyCaptureWidget(widget: Widget? = null): Unit =
        gtk_search_bar_set_key_capture_widget(
            gtkSearchBarPointer.reinterpret(),
            widget?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * Switches the search mode on or off.
     *
     * @param searchMode the new state of the search mode
     */
    public open fun setSearchMode(searchMode: Boolean): Unit =
        gtk_search_bar_set_search_mode(
            gtkSearchBarPointer.reinterpret(),
            searchMode.asGBoolean()
        )

    /**
     * Shows or hides the close button.
     *
     * Applications that already have a “search” toggle button should not
     * show a close button in their search bar, as it duplicates the role
     * of the toggle button.
     *
     * @param visible whether the close button will be shown or not
     */
    public open fun setShowCloseButton(visible: Boolean): Unit =
        gtk_search_bar_set_show_close_button(
            gtkSearchBarPointer.reinterpret(),
            visible.asGBoolean()
        )

    public companion object : TypeCompanion<SearchBar> {
        override val type: GeneratedClassKGType<SearchBar> =
            GeneratedClassKGType(gtk_search_bar_get_type()) { SearchBar(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
