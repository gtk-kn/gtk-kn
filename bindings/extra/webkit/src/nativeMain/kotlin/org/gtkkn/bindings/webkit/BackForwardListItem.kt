// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.InitiallyUnowned
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitBackForwardListItem
import org.gtkkn.native.webkit.webkit_back_forward_list_item_get_original_uri
import org.gtkkn.native.webkit.webkit_back_forward_list_item_get_title
import org.gtkkn.native.webkit.webkit_back_forward_list_item_get_type
import org.gtkkn.native.webkit.webkit_back_forward_list_item_get_uri
import kotlin.String

/**
 * One item of the #WebKitBackForwardList.
 *
 * A history item is part of the #WebKitBackForwardList and consists
 * out of a title and a URI.
 */
public class BackForwardListItem(public val webkitBackForwardListItemPointer: CPointer<WebKitBackForwardListItem>) :
    InitiallyUnowned(webkitBackForwardListItemPointer.reinterpret()),
    KGTyped {
    /**
     * Obtain the original URI of the item.
     *
     * See also webkit_back_forward_list_item_get_uri().
     *
     * @return the original URI of @list_item or null
     *    when the original URI is empty.
     */
    public fun getOriginalUri(): String =
        webkit_back_forward_list_item_get_original_uri(webkitBackForwardListItemPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Obtain the title of the item.
     *
     * @return the page title of @list_item or null
     *    when the title is empty.
     */
    public fun getTitle(): String =
        webkit_back_forward_list_item_get_title(webkitBackForwardListItemPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Obtain the URI of the item.
     *
     * This URI may differ from the original URI if the page was,
     * for example, redirected to a new location.
     * See also webkit_back_forward_list_item_get_original_uri().
     *
     * @return the URI of @list_item or null
     *    when the URI is empty.
     */
    public fun getUri(): String = webkit_back_forward_list_item_get_uri(webkitBackForwardListItemPointer)?.toKString()
        ?: error("Expected not null string")

    public companion object : TypeCompanion<BackForwardListItem> {
        override val type: GeneratedClassKGType<BackForwardListItem> =
            GeneratedClassKGType(webkit_back_forward_list_item_get_type()) { BackForwardListItem(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of BackForwardListItem
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_back_forward_list_item_get_type()
    }
}
