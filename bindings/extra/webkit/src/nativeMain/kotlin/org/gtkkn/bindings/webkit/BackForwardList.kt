// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.webkit.WebKitBackForwardList
import org.gtkkn.native.webkit.WebKitBackForwardListItem
import org.gtkkn.native.webkit.webkit_back_forward_list_get_back_item
import org.gtkkn.native.webkit.webkit_back_forward_list_get_back_list
import org.gtkkn.native.webkit.webkit_back_forward_list_get_back_list_with_limit
import org.gtkkn.native.webkit.webkit_back_forward_list_get_current_item
import org.gtkkn.native.webkit.webkit_back_forward_list_get_forward_item
import org.gtkkn.native.webkit.webkit_back_forward_list_get_forward_list
import org.gtkkn.native.webkit.webkit_back_forward_list_get_forward_list_with_limit
import org.gtkkn.native.webkit.webkit_back_forward_list_get_length
import org.gtkkn.native.webkit.webkit_back_forward_list_get_nth_item
import org.gtkkn.native.webkit.webkit_back_forward_list_get_type
import kotlin.ULong
import kotlin.Unit

/**
 * List of visited pages.
 *
 * WebKitBackForwardList maintains a list of visited pages used to
 * navigate to recent pages. Items are inserted in the list in the
 * order they are visited.
 *
 * WebKitBackForwardList also maintains the notion of the current item
 * (which is always at index 0), the preceding item (which is at index -1),
 * and the following item (which is at index 1).
 * Methods webkit_web_view_go_back() and webkit_web_view_go_forward() move
 * the current item backward or forward by one. Method
 * webkit_web_view_go_to_back_forward_list_item() sets the current item to the
 * specified item. All other methods returning #WebKitBackForwardListItem<!-- -->s
 * do not change the value of the current item, they just return the requested
 * item or items.
 */
public class BackForwardList(public val webkitBackForwardListPointer: CPointer<WebKitBackForwardList>) :
    Object(webkitBackForwardListPointer.reinterpret()),
    KGTyped {
    init {
        WebKit
    }

    /**
     * Returns the item that precedes the current item.
     *
     * @return the #WebKitBackForwardListItem
     *    preceding the current item or null.
     */
    public fun getBackItem(): BackForwardListItem? =
        webkit_back_forward_list_get_back_item(webkitBackForwardListPointer)?.run {
            InstanceCache.get(this, true) { BackForwardListItem(reinterpret()) }!!
        }

    /**
     * Obtain the list of items preceding the current one.
     *
     * @return a #GList of
     *    items preceding the current item.
     */
    public fun getBackList(): List = webkit_back_forward_list_get_back_list(webkitBackForwardListPointer)!!.run {
        List(this)
    }

    /**
     * Obtain a list up to some number of items preceding the current one.
     *
     * @param limit the number of items to retrieve
     * @return a #GList of
     *    items preceding the current item limited by @limit.
     */
    public fun getBackListWithLimit(limit: guint): List =
        webkit_back_forward_list_get_back_list_with_limit(webkitBackForwardListPointer, limit)!!.run {
            List(this)
        }

    /**
     * Returns the current item in @back_forward_list.
     *
     * @return a #WebKitBackForwardListItem
     *    or null if @back_forward_list is empty.
     */
    public fun getCurrentItem(): BackForwardListItem? =
        webkit_back_forward_list_get_current_item(webkitBackForwardListPointer)?.run {
            InstanceCache.get(this, true) { BackForwardListItem(reinterpret()) }!!
        }

    /**
     * Returns the item that follows the current item.
     *
     * @return the #WebKitBackForwardListItem
     *    following the current item or null.
     */
    public fun getForwardItem(): BackForwardListItem? =
        webkit_back_forward_list_get_forward_item(webkitBackForwardListPointer)?.run {
            InstanceCache.get(this, true) { BackForwardListItem(reinterpret()) }!!
        }

    /**
     * Obtain the list of items following the current one.
     *
     * @return a #GList of
     *    items following the current item.
     */
    public fun getForwardList(): List = webkit_back_forward_list_get_forward_list(webkitBackForwardListPointer)!!.run {
        List(this)
    }

    /**
     * Obtain a list up to some number of items following the current one.
     *
     * @param limit the number of items to retrieve
     * @return a #GList of
     *    items following the current item limited by @limit.
     */
    public fun getForwardListWithLimit(limit: guint): List =
        webkit_back_forward_list_get_forward_list_with_limit(webkitBackForwardListPointer, limit)!!.run {
            List(this)
        }

    /**
     * Obtain the amount of items in the list.
     *
     * @return the length of @back_forward_list.
     */
    public fun getLength(): guint = webkit_back_forward_list_get_length(webkitBackForwardListPointer)

    /**
     * Returns the item at a given index relative to the current item.
     *
     * @param index the index of the item
     * @return the #WebKitBackForwardListItem
     *    located at the specified index relative to the current item or null.
     */
    public fun getNthItem(index: gint): BackForwardListItem? =
        webkit_back_forward_list_get_nth_item(webkitBackForwardListPointer, index)?.run {
            InstanceCache.get(this, true) { BackForwardListItem(reinterpret()) }!!
        }

    /**
     * This signal is emitted when @back_forward_list changes. This happens
     * when the current item is updated, a new item is added or one or more
     * items are removed. Note that both @item_added and @items_removed can
     * null when only the current item is updated. Items are only removed
     * when the list is cleared or the maximum items limit is reached.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `itemAdded` the #WebKitBackForwardListItem added or null; `itemsRemoved` a #GList of #WebKitBackForwardListItem<!-- -->s
     */
    public fun onChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (itemAdded: BackForwardListItem?, itemsRemoved: gpointer?) -> Unit,
    ): ULong = g_signal_connect_data(
        webkitBackForwardListPointer,
        "changed",
        onChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "changed" signal. See [onChanged].
     *
     * @param itemAdded the #WebKitBackForwardListItem added or null
     * @param itemsRemoved a #GList of #WebKitBackForwardListItem<!-- -->s
     */
    public fun emitChanged(itemAdded: BackForwardListItem?, itemsRemoved: gpointer?) {
        g_signal_emit_by_name(
            webkitBackForwardListPointer.reinterpret(),
            "changed",
            itemAdded?.webkitBackForwardListItemPointer,
            itemsRemoved
        )
    }

    public companion object : TypeCompanion<BackForwardList> {
        override val type: GeneratedClassKGType<BackForwardList> =
            GeneratedClassKGType(getTypeOrNull()!!) { BackForwardList(it.reinterpret()) }

        init {
            WebKitTypeProvider.register()
        }

        /**
         * Get the GType of BackForwardList
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_back_forward_list_get_type()

        /**
         * Gets the GType of from the symbol `webkit_back_forward_list_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("webkit_back_forward_list_get_type")
    }
}

private val onChangedFunc:
    CPointer<CFunction<(CPointer<WebKitBackForwardListItem>?, gpointer?) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            itemAdded: CPointer<WebKitBackForwardListItem>?,
            itemsRemoved: gpointer?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                itemAdded: BackForwardListItem?,
                itemsRemoved: gpointer?,
            ) -> Unit
            >().get().invoke(
            itemAdded?.run {
                InstanceCache.get(this, false) { BackForwardListItem(reinterpret()) }!!
            },
            itemsRemoved
        )
    }
        .reinterpret()
