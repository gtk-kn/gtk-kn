// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Event
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_40
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_8
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitContextMenu
import org.gtkkn.native.webkit.webkit_context_menu_append
import org.gtkkn.native.webkit.webkit_context_menu_first
import org.gtkkn.native.webkit.webkit_context_menu_get_event
import org.gtkkn.native.webkit.webkit_context_menu_get_item_at_position
import org.gtkkn.native.webkit.webkit_context_menu_get_items
import org.gtkkn.native.webkit.webkit_context_menu_get_n_items
import org.gtkkn.native.webkit.webkit_context_menu_get_type
import org.gtkkn.native.webkit.webkit_context_menu_get_user_data
import org.gtkkn.native.webkit.webkit_context_menu_insert
import org.gtkkn.native.webkit.webkit_context_menu_last
import org.gtkkn.native.webkit.webkit_context_menu_move_item
import org.gtkkn.native.webkit.webkit_context_menu_new
import org.gtkkn.native.webkit.webkit_context_menu_new_with_items
import org.gtkkn.native.webkit.webkit_context_menu_prepend
import org.gtkkn.native.webkit.webkit_context_menu_remove
import org.gtkkn.native.webkit.webkit_context_menu_remove_all
import org.gtkkn.native.webkit.webkit_context_menu_set_user_data
import kotlin.Unit

/**
 * Represents the context menu in a #WebKitWebView.
 *
 * #WebKitContextMenu represents a context menu containing
 * #WebKitContextMenuItem<!-- -->s in a #WebKitWebView.
 *
 * When a #WebKitWebView is about to display the context menu, it
 * emits the #WebKitWebView::context-menu signal, which has the
 * #WebKitContextMenu as an argument. You can modify it, adding new
 * submenus that you can create with webkit_context_menu_new(), adding
 * new #WebKitContextMenuItem<!-- -->s with
 * webkit_context_menu_prepend(), webkit_context_menu_append() or
 * webkit_context_menu_insert(), maybe after having removed the
 * existing ones with webkit_context_menu_remove_all().
 */
public class ContextMenu(pointer: CPointer<WebKitContextMenu>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val webkitContextMenuPointer: CPointer<WebKitContextMenu>
        get() = gPointer.reinterpret()

    /**
     * Creates a new #WebKitContextMenu object.
     *
     * Creates a new #WebKitContextMenu object to be used as a submenu of an existing
     * #WebKitContextMenu. The context menu of a #WebKitWebView is created by the view
     * and passed as an argument of #WebKitWebView::context-menu signal.
     * To add items to the menu use webkit_context_menu_prepend(),
     * webkit_context_menu_append() or webkit_context_menu_insert().
     * See also webkit_context_menu_new_with_items() to create a #WebKitContextMenu with
     * a list of initial items.
     *
     * @return The newly created #WebKitContextMenu object
     */
    public constructor() : this(webkit_context_menu_new()!!.reinterpret())

    /**
     * Creates a new #WebKitContextMenu object with the given items.
     *
     * Creates a new #WebKitContextMenu object to be used as a submenu of an existing
     * #WebKitContextMenu with the given initial items.
     * See also webkit_context_menu_new()
     *
     * @param items a #GList of #WebKitContextMenuItem
     * @return The newly created #WebKitContextMenu object
     */
    public constructor(items: List) : this(webkit_context_menu_new_with_items(items.gPointer)!!.reinterpret())

    /**
     * Adds @item at the end of the @menu.
     *
     * @param item the #WebKitContextMenuItem to add
     */
    public fun append(item: ContextMenuItem): Unit =
        webkit_context_menu_append(webkitContextMenuPointer, item.webkitContextMenuItemPointer)

    /**
     * Gets the first item in the @menu.
     *
     * @return the first #WebKitContextMenuItem of @menu,
     *    or null if the #WebKitContextMenu is empty.
     */
    public fun first(): ContextMenuItem = webkit_context_menu_first(webkitContextMenuPointer)!!.run {
        ContextMenuItem(this)
    }

    /**
     * Gets the #GdkEvent that triggered the context menu. This function only returns a valid
     * #GdkEvent when called for a #WebKitContextMenu passed to #WebKitWebView::context-menu
     * signal; in all other cases, null is returned.
     *
     * The returned #GdkEvent is expected to be one of the following types:
     * <itemizedlist>
     * <listitem><para>
     * a #GdkEventButton of type %GDK_BUTTON_PRESS when the context menu was triggered with mouse.
     * </para></listitem>
     * <listitem><para>
     * a #GdkEventKey of type %GDK_KEY_PRESS if the keyboard was used to show the menu.
     * </para></listitem>
     * <listitem><para>
     * a generic #GdkEvent of type %GDK_NOTHING when the #GtkWidget::popup-menu signal was used to show the context menu.
     * </para></listitem>
     * </itemizedlist>
     *
     * @return the menu event or null.
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun getEvent(): Event = webkit_context_menu_get_event(webkitContextMenuPointer)!!.run {
        Event(this)
    }

    /**
     * Gets the item at the given position in the @menu.
     *
     * @param position the position of the item, counting from 0
     * @return the #WebKitContextMenuItem at position @position in @menu,
     *    or null if the position is off the end of the @menu.
     */
    public fun getItemAtPosition(position: guint): ContextMenuItem =
        webkit_context_menu_get_item_at_position(webkitContextMenuPointer, position)!!.run {
            ContextMenuItem(this)
        }

    /**
     * Returns the item list of @menu.
     *
     * @return a #GList of
     *    #WebKitContextMenuItem<!-- -->s
     */
    public fun getItems(): List = webkit_context_menu_get_items(webkitContextMenuPointer)!!.run {
        List(this)
    }

    /**
     * Gets the length of the @menu.
     *
     * @return the number of #WebKitContextMenuItem<!-- -->s in @menu
     */
    public fun getNItems(): guint = webkit_context_menu_get_n_items(webkitContextMenuPointer)

    /**
     * Gets the user data of @menu.
     *
     * This function can be used from the UI Process to get user data previously set
     * from the Web Process with webkit_context_menu_set_user_data().
     *
     * @return the user data of @menu, or null if @menu doesn't have user data
     * @since 2.8
     */
    @WebKitVersion2_8
    public fun getUserData(): Variant = webkit_context_menu_get_user_data(webkitContextMenuPointer)!!.run {
        Variant(this)
    }

    /**
     * Inserts @item into the @menu at the given position.
     *
     * If @position is negative, or is larger than the number of items
     * in the #WebKitContextMenu, the item is added on to the end of
     * the @menu. The first position is 0.
     *
     * @param item the #WebKitContextMenuItem to add
     * @param position the position to insert the item
     */
    public fun insert(item: ContextMenuItem, position: gint): Unit =
        webkit_context_menu_insert(webkitContextMenuPointer, item.webkitContextMenuItemPointer, position)

    /**
     * Gets the last item in the @menu.
     *
     * @return the last #WebKitContextMenuItem of @menu,
     *    or null if the #WebKitContextMenu is empty.
     */
    public fun last(): ContextMenuItem = webkit_context_menu_last(webkitContextMenuPointer)!!.run {
        ContextMenuItem(this)
    }

    /**
     * Moves @item to the given position in the @menu.
     *
     * If @position is negative, or is larger than the number of items
     * in the #WebKitContextMenu, the item is added on to the end of
     * the @menu.
     * The first position is 0.
     *
     * @param item the #WebKitContextMenuItem to add
     * @param position the new position to move the item
     */
    public fun moveItem(item: ContextMenuItem, position: gint): Unit =
        webkit_context_menu_move_item(webkitContextMenuPointer, item.webkitContextMenuItemPointer, position)

    /**
     * Adds @item at the beginning of the @menu.
     *
     * @param item the #WebKitContextMenuItem to add
     */
    public fun prepend(item: ContextMenuItem): Unit =
        webkit_context_menu_prepend(webkitContextMenuPointer, item.webkitContextMenuItemPointer)

    /**
     * Removes @item from the @menu.
     *
     * See also webkit_context_menu_remove_all() to remove all items.
     *
     * @param item the #WebKitContextMenuItem to remove
     */
    public fun remove(item: ContextMenuItem): Unit =
        webkit_context_menu_remove(webkitContextMenuPointer, item.webkitContextMenuItemPointer)

    /**
     * Removes all items of the @menu.
     */
    public fun removeAll(): Unit = webkit_context_menu_remove_all(webkitContextMenuPointer)

    /**
     * Sets user data to @menu.
     *
     * This function can be used from a Web Process extension to set user data
     * that can be retrieved from the UI Process using webkit_context_menu_get_user_data().
     * If the @user_data #GVariant is floating, it is consumed.
     *
     * @param userData a #GVariant
     * @since 2.8
     */
    @WebKitVersion2_8
    public fun setUserData(userData: Variant): Unit =
        webkit_context_menu_set_user_data(webkitContextMenuPointer, userData.gPointer)

    public companion object : TypeCompanion<ContextMenu> {
        override val type: GeneratedClassKGType<ContextMenu> =
            GeneratedClassKGType(webkit_context_menu_get_type()) { ContextMenu(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of ContextMenu
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_context_menu_get_type()
    }
}
