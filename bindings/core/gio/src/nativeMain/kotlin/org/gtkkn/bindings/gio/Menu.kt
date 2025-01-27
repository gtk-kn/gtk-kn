// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.bindings.gio.annotations.GioVersion2_38
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GMenu
import org.gtkkn.native.gio.g_menu_append
import org.gtkkn.native.gio.g_menu_append_item
import org.gtkkn.native.gio.g_menu_append_section
import org.gtkkn.native.gio.g_menu_append_submenu
import org.gtkkn.native.gio.g_menu_freeze
import org.gtkkn.native.gio.g_menu_get_type
import org.gtkkn.native.gio.g_menu_insert
import org.gtkkn.native.gio.g_menu_insert_item
import org.gtkkn.native.gio.g_menu_insert_section
import org.gtkkn.native.gio.g_menu_insert_submenu
import org.gtkkn.native.gio.g_menu_new
import org.gtkkn.native.gio.g_menu_prepend
import org.gtkkn.native.gio.g_menu_prepend_item
import org.gtkkn.native.gio.g_menu_prepend_section
import org.gtkkn.native.gio.g_menu_prepend_submenu
import org.gtkkn.native.gio.g_menu_remove
import org.gtkkn.native.gio.g_menu_remove_all
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.String
import kotlin.Unit

/**
 * `GMenu` is a simple implementation of [class@Gio.MenuModel].
 * You populate a `GMenu` by adding [class@Gio.MenuItem] instances to it.
 *
 * There are some convenience functions to allow you to directly
 * add items (avoiding [class@Gio.MenuItem]) for the common cases. To add
 * a regular item, use [method@Gio.Menu.insert]. To add a section, use
 * [method@Gio.Menu.insert_section]. To add a submenu, use
 * [method@Gio.Menu.insert_submenu].
 * @since 2.32
 */
@GioVersion2_32
public open class Menu(public val gioMenuPointer: CPointer<GMenu>) :
    MenuModel(gioMenuPointer.reinterpret()),
    KGTyped {
    /**
     * Creates a new #GMenu.
     *
     * The new menu has no items.
     *
     * @return a new #GMenu
     * @since 2.32
     */
    public constructor() : this(g_menu_new()!!.reinterpret())

    /**
     * Convenience function for appending a normal menu item to the end of
     * @menu.  Combine g_menu_item_new() and g_menu_insert_item() for a more
     * flexible alternative.
     *
     * @param label the section label, or null
     * @param detailedAction the detailed action string, or null
     * @since 2.32
     */
    @GioVersion2_32
    public open fun append(label: String? = null, detailedAction: String? = null): Unit =
        g_menu_append(gioMenuPointer, label, detailedAction)

    /**
     * Appends @item to the end of @menu.
     *
     * See g_menu_insert_item() for more information.
     *
     * @param item a #GMenuItem to append
     * @since 2.32
     */
    @GioVersion2_32
    public open fun appendItem(item: MenuItem): Unit = g_menu_append_item(gioMenuPointer, item.gioMenuItemPointer)

    /**
     * Convenience function for appending a section menu item to the end of
     * @menu.  Combine g_menu_item_new_section() and g_menu_insert_item() for a
     * more flexible alternative.
     *
     * @param label the section label, or null
     * @param section a #GMenuModel with the items of the section
     * @since 2.32
     */
    @GioVersion2_32
    public open fun appendSection(label: String? = null, section: MenuModel): Unit =
        g_menu_append_section(gioMenuPointer, label, section.gioMenuModelPointer)

    /**
     * Convenience function for appending a submenu menu item to the end of
     * @menu.  Combine g_menu_item_new_submenu() and g_menu_insert_item() for a
     * more flexible alternative.
     *
     * @param label the section label, or null
     * @param submenu a #GMenuModel with the items of the submenu
     * @since 2.32
     */
    @GioVersion2_32
    public open fun appendSubmenu(label: String? = null, submenu: MenuModel): Unit =
        g_menu_append_submenu(gioMenuPointer, label, submenu.gioMenuModelPointer)

    /**
     * Marks @menu as frozen.
     *
     * After the menu is frozen, it is an error to attempt to make any
     * changes to it.  In effect this means that the #GMenu API must no
     * longer be used.
     *
     * This function causes g_menu_model_is_mutable() to begin returning
     * false, which has some positive performance implications.
     *
     * @since 2.32
     */
    @GioVersion2_32
    public open fun freeze(): Unit = g_menu_freeze(gioMenuPointer)

    /**
     * Convenience function for inserting a normal menu item into @menu.
     * Combine g_menu_item_new() and g_menu_insert_item() for a more flexible
     * alternative.
     *
     * @param position the position at which to insert the item
     * @param label the section label, or null
     * @param detailedAction the detailed action string, or null
     * @since 2.32
     */
    @GioVersion2_32
    public open fun insert(position: gint, label: String? = null, detailedAction: String? = null): Unit =
        g_menu_insert(gioMenuPointer, position, label, detailedAction)

    /**
     * Inserts @item into @menu.
     *
     * The "insertion" is actually done by copying all of the attribute and
     * link values of @item and using them to form a new item within @menu.
     * As such, @item itself is not really inserted, but rather, a menu item
     * that is exactly the same as the one presently described by @item.
     *
     * This means that @item is essentially useless after the insertion
     * occurs.  Any changes you make to it are ignored unless it is inserted
     * again (at which point its updated values will be copied).
     *
     * You should probably just free @item once you're done.
     *
     * There are many convenience functions to take care of common cases.
     * See g_menu_insert(), g_menu_insert_section() and
     * g_menu_insert_submenu() as well as "prepend" and "append" variants of
     * each of these functions.
     *
     * @param position the position at which to insert the item
     * @param item the #GMenuItem to insert
     * @since 2.32
     */
    @GioVersion2_32
    public open fun insertItem(position: gint, item: MenuItem): Unit =
        g_menu_insert_item(gioMenuPointer, position, item.gioMenuItemPointer)

    /**
     * Convenience function for inserting a section menu item into @menu.
     * Combine g_menu_item_new_section() and g_menu_insert_item() for a more
     * flexible alternative.
     *
     * @param position the position at which to insert the item
     * @param label the section label, or null
     * @param section a #GMenuModel with the items of the section
     * @since 2.32
     */
    @GioVersion2_32
    public open fun insertSection(position: gint, label: String? = null, section: MenuModel): Unit =
        g_menu_insert_section(gioMenuPointer, position, label, section.gioMenuModelPointer)

    /**
     * Convenience function for inserting a submenu menu item into @menu.
     * Combine g_menu_item_new_submenu() and g_menu_insert_item() for a more
     * flexible alternative.
     *
     * @param position the position at which to insert the item
     * @param label the section label, or null
     * @param submenu a #GMenuModel with the items of the submenu
     * @since 2.32
     */
    @GioVersion2_32
    public open fun insertSubmenu(position: gint, label: String? = null, submenu: MenuModel): Unit =
        g_menu_insert_submenu(gioMenuPointer, position, label, submenu.gioMenuModelPointer)

    /**
     * Convenience function for prepending a normal menu item to the start
     * of @menu.  Combine g_menu_item_new() and g_menu_insert_item() for a more
     * flexible alternative.
     *
     * @param label the section label, or null
     * @param detailedAction the detailed action string, or null
     * @since 2.32
     */
    @GioVersion2_32
    public open fun prepend(label: String? = null, detailedAction: String? = null): Unit =
        g_menu_prepend(gioMenuPointer, label, detailedAction)

    /**
     * Prepends @item to the start of @menu.
     *
     * See g_menu_insert_item() for more information.
     *
     * @param item a #GMenuItem to prepend
     * @since 2.32
     */
    @GioVersion2_32
    public open fun prependItem(item: MenuItem): Unit = g_menu_prepend_item(gioMenuPointer, item.gioMenuItemPointer)

    /**
     * Convenience function for prepending a section menu item to the start
     * of @menu.  Combine g_menu_item_new_section() and g_menu_insert_item() for
     * a more flexible alternative.
     *
     * @param label the section label, or null
     * @param section a #GMenuModel with the items of the section
     * @since 2.32
     */
    @GioVersion2_32
    public open fun prependSection(label: String? = null, section: MenuModel): Unit =
        g_menu_prepend_section(gioMenuPointer, label, section.gioMenuModelPointer)

    /**
     * Convenience function for prepending a submenu menu item to the start
     * of @menu.  Combine g_menu_item_new_submenu() and g_menu_insert_item() for
     * a more flexible alternative.
     *
     * @param label the section label, or null
     * @param submenu a #GMenuModel with the items of the submenu
     * @since 2.32
     */
    @GioVersion2_32
    public open fun prependSubmenu(label: String? = null, submenu: MenuModel): Unit =
        g_menu_prepend_submenu(gioMenuPointer, label, submenu.gioMenuModelPointer)

    /**
     * Removes an item from the menu.
     *
     * @position gives the index of the item to remove.
     *
     * It is an error if position is not in range the range from 0 to one
     * less than the number of items in the menu.
     *
     * It is not possible to remove items by identity since items are added
     * to the menu simply by copying their links and attributes (ie:
     * identity of the item itself is not preserved).
     *
     * @param position the position of the item to remove
     * @since 2.32
     */
    @GioVersion2_32
    public open fun remove(position: gint): Unit = g_menu_remove(gioMenuPointer, position)

    /**
     * Removes all items in the menu.
     *
     * @since 2.38
     */
    @GioVersion2_38
    public open fun removeAll(): Unit = g_menu_remove_all(gioMenuPointer)

    public companion object : TypeCompanion<Menu> {
        override val type: GeneratedClassKGType<Menu> =
            GeneratedClassKGType(getTypeOrNull("g_menu_get_type")!!) { Menu(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of Menu
         *
         * @return the GType
         */
        public fun getType(): GType = g_menu_get_type()
    }
}
