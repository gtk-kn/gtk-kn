// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_44
import org.gtkkn.bindings.gio.annotations.GioVersion2_46
import org.gtkkn.bindings.glib.CompareDataFunc
import org.gtkkn.bindings.glib.CompareDataFuncFunc
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.gio.GListStore
import org.gtkkn.native.gio.g_list_store_append
import org.gtkkn.native.gio.g_list_store_get_type
import org.gtkkn.native.gio.g_list_store_insert
import org.gtkkn.native.gio.g_list_store_insert_sorted
import org.gtkkn.native.gio.g_list_store_new
import org.gtkkn.native.gio.g_list_store_remove
import org.gtkkn.native.gio.g_list_store_remove_all
import org.gtkkn.native.gio.g_list_store_sort
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import kotlin.Unit

/**
 * `GListStore` is a simple implementation of [iface@Gio.ListModel] that stores
 * all items in memory.
 *
 * It provides insertions, deletions, and lookups in logarithmic time
 * with a fast path for the common case of iterating the list linearly.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `position`: position: Out parameter is not supported
 * - parameter `equal_func`: GLib.EqualFunc
 * - parameter `position`: position: Out parameter is not supported
 * - parameter `additions`: Array parameter of type GObject.Object is not supported
 * - method `item-type`: Property has no getter nor setter
 * - method `n-items`: Property has no getter nor setter
 */
public open class ListStore(public val gioListStorePointer: CPointer<GListStore>) :
    Object(gioListStorePointer.reinterpret()),
    ListModel,
    KGTyped {
    init {
        Gio
    }

    override val gioListModelPointer: CPointer<GListModel>
        get() = handle.reinterpret()

    /**
     * Creates a new #GListStore with items of type @item_type. @item_type
     * must be a subclass of #GObject.
     *
     * @param itemType the #GType of items in the list
     * @return a new #GListStore
     * @since 2.44
     */
    public constructor(itemType: GType) : this(g_list_store_new(itemType)!!) {
        InstanceCache.put(this)
    }

    /**
     * Appends @item to @store. @item must be of type #GListStore:item-type.
     *
     * This function takes a ref on @item.
     *
     * Use g_list_store_splice() to append multiple items at the same time
     * efficiently.
     *
     * @param item the new item
     * @since 2.44
     */
    @GioVersion2_44
    public open fun append(item: Object): Unit =
        g_list_store_append(gioListStorePointer, item.gobjectObjectPointer.reinterpret())

    /**
     * Inserts @item into @store at @position. @item must be of type
     * #GListStore:item-type or derived from it. @position must be smaller
     * than the length of the list, or equal to it to append.
     *
     * This function takes a ref on @item.
     *
     * Use g_list_store_splice() to insert multiple items at the same time
     * efficiently.
     *
     * @param position the position at which to insert the new item
     * @param item the new item
     * @since 2.44
     */
    @GioVersion2_44
    public open fun insert(position: guint, item: Object): Unit =
        g_list_store_insert(gioListStorePointer, position, item.gobjectObjectPointer.reinterpret())

    /**
     * Inserts @item into @store at a position to be determined by the
     * @compare_func.
     *
     * The list must already be sorted before calling this function or the
     * result is undefined.  Usually you would approach this by only ever
     * inserting items by way of this function.
     *
     * This function takes a ref on @item.
     *
     * @param item the new item
     * @param compareFunc pairwise comparison function for sorting
     * @return the position at which @item was inserted
     * @since 2.44
     */
    @GioVersion2_44
    public open fun insertSorted(item: Object, compareFunc: CompareDataFunc): guint = g_list_store_insert_sorted(
        gioListStorePointer,
        item.gobjectObjectPointer.reinterpret(),
        CompareDataFuncFunc.reinterpret(),
        StableRef.create(compareFunc).asCPointer()
    )

    /**
     * Removes the item from @store that is at @position. @position must be
     * smaller than the current length of the list.
     *
     * Use g_list_store_splice() to remove multiple items at the same time
     * efficiently.
     *
     * @param position the position of the item that is to be removed
     * @since 2.44
     */
    @GioVersion2_44
    public open fun remove(position: guint): Unit = g_list_store_remove(gioListStorePointer, position)

    /**
     * Removes all items from @store.
     *
     * @since 2.44
     */
    @GioVersion2_44
    public open fun removeAll(): Unit = g_list_store_remove_all(gioListStorePointer)

    /**
     * Sort the items in @store according to @compare_func.
     *
     * @param compareFunc pairwise comparison function for sorting
     * @since 2.46
     */
    @GioVersion2_46
    public open fun sort(compareFunc: CompareDataFunc): Unit = g_list_store_sort(
        gioListStorePointer,
        CompareDataFuncFunc.reinterpret(),
        StableRef.create(compareFunc).asCPointer()
    )

    public companion object : TypeCompanion<ListStore> {
        override val type: GeneratedClassKGType<ListStore> =
            GeneratedClassKGType(getTypeOrNull()!!) { ListStore(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of ListStore
         *
         * @return the GType
         */
        public fun getType(): GType = g_list_store_get_type()

        /**
         * Gets the GType of from the symbol `g_list_store_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_list_store_get_type")
    }
}
