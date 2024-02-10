// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkListItem
import org.gtkkn.native.gtk.gtk_list_item_get_activatable
import org.gtkkn.native.gtk.gtk_list_item_get_child
import org.gtkkn.native.gtk.gtk_list_item_get_item
import org.gtkkn.native.gtk.gtk_list_item_get_position
import org.gtkkn.native.gtk.gtk_list_item_get_selectable
import org.gtkkn.native.gtk.gtk_list_item_get_selected
import org.gtkkn.native.gtk.gtk_list_item_get_type
import org.gtkkn.native.gtk.gtk_list_item_set_activatable
import org.gtkkn.native.gtk.gtk_list_item_set_child
import org.gtkkn.native.gtk.gtk_list_item_set_selectable
import kotlin.Boolean
import kotlin.UInt
import kotlin.Unit

/**
 * `GtkListItem` is used by list widgets to represent items in a `GListModel`.
 *
 * The `GtkListItem`s are managed by the list widget (with its factory)
 * and cannot be created by applications, but they need to be populated
 * by application code. This is done by calling [method@Gtk.ListItem.set_child].
 *
 * `GtkListItem`s exist in 2 stages:
 *
 * 1. The unbound stage where the listitem is not currently connected to
 *    an item in the list. In that case, the [property@Gtk.ListItem:item]
 *    property is set to null.
 *
 * 2. The bound stage where the listitem references an item from the list.
 *    The [property@Gtk.ListItem:item] property is not null.
 */
public open class ListItem(
    pointer: CPointer<GtkListItem>,
) : Object(pointer.reinterpret()), KGTyped {
    public val gtkListItemPointer: CPointer<GtkListItem>
        get() = gPointer.reinterpret()

    /**
     * If the item can be activated by the user.
     */
    public open var activatable: Boolean
        /**
         * Checks if a list item has been set to be activatable via
         * gtk_list_item_set_activatable().
         *
         * @return true if the item is activatable
         */
        get() = gtk_list_item_get_activatable(gtkListItemPointer.reinterpret()).asBoolean()

        /**
         * Sets @self to be activatable.
         *
         * If an item is activatable, double-clicking on the item, using
         * the Return key or calling gtk_widget_activate() will activate
         * the item. Activating instructs the containing view to handle
         * activation. `GtkListView` for example will be emitting the
         * [signal@Gtk.ListView::activate] signal.
         *
         * By default, list items are activatable.
         *
         * @param activatable if the item should be activatable
         */
        set(activatable) =
            gtk_list_item_set_activatable(
                gtkListItemPointer.reinterpret(),
                activatable.asGBoolean()
            )

    /**
     * Widget used for display.
     */
    public open var child: Widget?
        /**
         * Gets the child previously set via gtk_list_item_set_child() or
         * null if none was set.
         *
         * @return The child
         */
        get() =
            gtk_list_item_get_child(gtkListItemPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the child to be used for this listitem.
         *
         * This function is typically called by applications when
         * setting up a listitem so that the widget can be reused when
         * binding it multiple times.
         *
         * @param child The list item's child or null to unset
         */
        set(child) =
            gtk_list_item_set_child(
                gtkListItemPointer.reinterpret(),
                child?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * Displayed item.
     */
    public open val item: Object?
        /**
         * Gets the model item that associated with @self.
         *
         * If @self is unbound, this function returns null.
         *
         * @return The item displayed
         */
        get() =
            gtk_list_item_get_item(gtkListItemPointer.reinterpret())?.run {
                Object(reinterpret())
            }

    /**
     * Position of the item.
     */
    public open val position: UInt
        /**
         * Gets the position in the model that @self currently displays.
         *
         * If @self is unbound, %GTK_INVALID_LIST_POSITION is returned.
         *
         * @return The position of this item
         */
        get() = gtk_list_item_get_position(gtkListItemPointer.reinterpret())

    /**
     * If the item can be selected by the user.
     */
    public open var selectable: Boolean
        /**
         * Checks if a list item has been set to be selectable via
         * gtk_list_item_set_selectable().
         *
         * Do not confuse this function with [method@Gtk.ListItem.get_selected].
         *
         * @return true if the item is selectable
         */
        get() = gtk_list_item_get_selectable(gtkListItemPointer.reinterpret()).asBoolean()

        /**
         * Sets @self to be selectable.
         *
         * If an item is selectable, clicking on the item or using the keyboard
         * will try to select or unselect the item. If this succeeds is up to
         * the model to determine, as it is managing the selected state.
         *
         * Note that this means that making an item non-selectable has no
         * influence on the selected state at all. A non-selectable item
         * may still be selected.
         *
         * By default, list items are selectable. When rebinding them to
         * a new item, they will also be reset to be selectable by GTK.
         *
         * @param selectable if the item should be selectable
         */
        set(selectable) =
            gtk_list_item_set_selectable(
                gtkListItemPointer.reinterpret(),
                selectable.asGBoolean()
            )

    /**
     * If the item is currently selected.
     */
    public open val selected: Boolean
        /**
         * Checks if the item is displayed as selected.
         *
         * The selected state is maintained by the liste widget and its model
         * and cannot be set otherwise.
         *
         * @return true if the item is selected.
         */
        get() = gtk_list_item_get_selected(gtkListItemPointer.reinterpret()).asBoolean()

    /**
     * Checks if a list item has been set to be activatable via
     * gtk_list_item_set_activatable().
     *
     * @return true if the item is activatable
     */
    public open fun getActivatable(): Boolean =
        gtk_list_item_get_activatable(gtkListItemPointer.reinterpret()).asBoolean()

    /**
     * Gets the child previously set via gtk_list_item_set_child() or
     * null if none was set.
     *
     * @return The child
     */
    public open fun getChild(): Widget? =
        gtk_list_item_get_child(gtkListItemPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets the model item that associated with @self.
     *
     * If @self is unbound, this function returns null.
     *
     * @return The item displayed
     */
    public open fun getItem(): Object? =
        gtk_list_item_get_item(gtkListItemPointer.reinterpret())?.run {
            Object(reinterpret())
        }

    /**
     * Gets the position in the model that @self currently displays.
     *
     * If @self is unbound, %GTK_INVALID_LIST_POSITION is returned.
     *
     * @return The position of this item
     */
    public open fun getPosition(): UInt = gtk_list_item_get_position(gtkListItemPointer.reinterpret())

    /**
     * Checks if a list item has been set to be selectable via
     * gtk_list_item_set_selectable().
     *
     * Do not confuse this function with [method@Gtk.ListItem.get_selected].
     *
     * @return true if the item is selectable
     */
    public open fun getSelectable(): Boolean =
        gtk_list_item_get_selectable(gtkListItemPointer.reinterpret()).asBoolean()

    /**
     * Checks if the item is displayed as selected.
     *
     * The selected state is maintained by the liste widget and its model
     * and cannot be set otherwise.
     *
     * @return true if the item is selected.
     */
    public open fun getSelected(): Boolean = gtk_list_item_get_selected(gtkListItemPointer.reinterpret()).asBoolean()

    /**
     * Sets @self to be activatable.
     *
     * If an item is activatable, double-clicking on the item, using
     * the Return key or calling gtk_widget_activate() will activate
     * the item. Activating instructs the containing view to handle
     * activation. `GtkListView` for example will be emitting the
     * [signal@Gtk.ListView::activate] signal.
     *
     * By default, list items are activatable.
     *
     * @param activatable if the item should be activatable
     */
    public open fun setActivatable(activatable: Boolean): Unit =
        gtk_list_item_set_activatable(
            gtkListItemPointer.reinterpret(),
            activatable.asGBoolean()
        )

    /**
     * Sets the child to be used for this listitem.
     *
     * This function is typically called by applications when
     * setting up a listitem so that the widget can be reused when
     * binding it multiple times.
     *
     * @param child The list item's child or null to unset
     */
    public open fun setChild(child: Widget? = null): Unit =
        gtk_list_item_set_child(
            gtkListItemPointer.reinterpret(),
            child?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * Sets @self to be selectable.
     *
     * If an item is selectable, clicking on the item or using the keyboard
     * will try to select or unselect the item. If this succeeds is up to
     * the model to determine, as it is managing the selected state.
     *
     * Note that this means that making an item non-selectable has no
     * influence on the selected state at all. A non-selectable item
     * may still be selected.
     *
     * By default, list items are selectable. When rebinding them to
     * a new item, they will also be reset to be selectable by GTK.
     *
     * @param selectable if the item should be selectable
     */
    public open fun setSelectable(selectable: Boolean): Unit =
        gtk_list_item_set_selectable(gtkListItemPointer.reinterpret(), selectable.asGBoolean())

    public companion object : TypeCompanion<ListItem> {
        override val type: GeneratedClassKGType<ListItem> =
            GeneratedClassKGType(gtk_list_item_get_type()) { ListItem(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
