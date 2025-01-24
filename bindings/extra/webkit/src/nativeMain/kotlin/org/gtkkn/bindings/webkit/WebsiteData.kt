// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_16
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.guint64
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitWebsiteData
import org.gtkkn.native.webkit.webkit_website_data_get_name
import org.gtkkn.native.webkit.webkit_website_data_get_size
import org.gtkkn.native.webkit.webkit_website_data_get_type
import org.gtkkn.native.webkit.webkit_website_data_get_types
import org.gtkkn.native.webkit.webkit_website_data_ref
import org.gtkkn.native.webkit.webkit_website_data_unref
import kotlin.String
import kotlin.Unit

/**
 * Data stored locally by a web site.
 *
 * WebKitWebsiteData represents data stored in the client by a particular website.
 * A website is normally a set of URLs grouped by domain name. You can get the website name,
 * which is usually the domain, with webkit_website_data_get_name().
 * Documents loaded from the file system, like file:// URIs, are all grouped in the same WebKitWebsiteData
 * with the name "Local files".
 *
 * A website can store different types of data in the client side. #WebKitWebsiteDataTypes is an enum containing
 * all the possible data types; use webkit_website_data_get_types() to get the bitmask of data types.
 * It's also possible to know the size of the data stored for some of the #WebKitWebsiteDataTypes by using
 * webkit_website_data_get_size().
 *
 * A list of WebKitWebsiteData can be retrieved with webkit_website_data_manager_fetch(). See #WebKitWebsiteDataManager
 * for more information.
 * @since 2.16
 */
@WebKitVersion2_16
public class WebsiteData(public val webkitWebsiteDataPointer: CPointer<WebKitWebsiteData>) :
    ProxyInstance(webkitWebsiteDataPointer) {
    /**
     * Gets the name of #WebKitWebsiteData.
     *
     * This is the website name, normally represented by
     * a domain or host name. All local documents are grouped in the same #WebKitWebsiteData using
     * the name "Local files".
     *
     * @return the website name of @website_data.
     * @since 2.16
     */
    @WebKitVersion2_16
    public fun getName(): String =
        webkit_website_data_get_name(webkitWebsiteDataPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the size of the data of types @types in a #WebKitWebsiteData.
     *
     * Note that currently the data size is only known for %WEBKIT_WEBSITE_DATA_DISK_CACHE data type
     * so for all other types 0 will be returned.
     *
     * @param types a bitmask  of #WebKitWebsiteDataTypes
     * @return the size of @website_data for the given @types.
     * @since 2.16
     */
    @WebKitVersion2_16
    public fun getSize(types: WebsiteDataTypes): guint64 =
        webkit_website_data_get_size(webkitWebsiteDataPointer, types.mask)

    /**
     * Gets the types of data stored in the client for a #WebKitWebsiteData.
     *
     * These are the
     * types actually present, not the types queried with webkit_website_data_manager_fetch().
     *
     * @return a bitmask of #WebKitWebsiteDataTypes in @website_data
     * @since 2.16
     */
    @WebKitVersion2_16
    public fun getTypes(): WebsiteDataTypes = webkit_website_data_get_types(webkitWebsiteDataPointer).run {
        WebsiteDataTypes(this)
    }

    /**
     * Atomically increments the reference count of @website_data by one.
     *
     * This function is MT-safe and may be called from any thread.
     *
     * @return The passed #WebKitWebsiteData
     * @since 2.16
     */
    @WebKitVersion2_16
    public fun ref(): WebsiteData = webkit_website_data_ref(webkitWebsiteDataPointer)!!.run {
        WebsiteData(this)
    }

    /**
     * Atomically decrements the reference count of @website_data by one.
     *
     * If the reference count drops to 0, all memory allocated by
     * #WebKitWebsiteData is released. This function is MT-safe and may be
     * called from any thread.
     *
     * @since 2.16
     */
    @WebKitVersion2_16
    public fun unref(): Unit = webkit_website_data_unref(webkitWebsiteDataPointer)

    public companion object {
        /**
         * Get the GType of WebsiteData
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_website_data_get_type()
    }
}
