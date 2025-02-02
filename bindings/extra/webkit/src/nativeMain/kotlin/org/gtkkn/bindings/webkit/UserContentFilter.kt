// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_24
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitUserContentFilter
import org.gtkkn.native.webkit.webkit_user_content_filter_get_identifier
import org.gtkkn.native.webkit.webkit_user_content_filter_get_type
import org.gtkkn.native.webkit.webkit_user_content_filter_ref
import org.gtkkn.native.webkit.webkit_user_content_filter_unref
import kotlin.String
import kotlin.Unit

/**
 * A compiled set of rules which applied to resource loads.
 * @since 2.24
 */
@WebKitVersion2_24
public class UserContentFilter(public val webkitUserContentFilterPointer: CPointer<WebKitUserContentFilter>) :
    ProxyInstance(webkitUserContentFilterPointer) {
    /**
     * Obtain the identifier previously used to save the @user_content_filter.
     *
     * Obtain the identifier previously used to save the @user_content_filter in the
     * #WebKitUserContentFilterStore.
     *
     * @return the identifier for the filter
     * @since 2.24
     */
    @WebKitVersion2_24
    public fun getIdentifier(): String =
        webkit_user_content_filter_get_identifier(webkitUserContentFilterPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Atomically increments the reference count of @user_content_filter by one.
     *
     * This function is MT-safe and may be called from any thread.
     *
     * @return the @user_content_filter passed in.
     * @since 2.24
     */
    @WebKitVersion2_24
    public fun ref(): UserContentFilter = webkit_user_content_filter_ref(webkitUserContentFilterPointer)!!.run {
        UserContentFilter(this)
    }

    /**
     * Atomically decrements the reference count of @user_content_filter by one.
     *
     * If the reference count drops to 0, all the memory allocated by the
     * #WebKitUserContentFilter is released. This function is MT-safe and may
     * be called from any thread.
     *
     * @since 2.24
     */
    @WebKitVersion2_24
    public fun unref(): Unit = webkit_user_content_filter_unref(webkitUserContentFilterPointer)

    public companion object {
        /**
         * Get the GType of UserContentFilter
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_user_content_filter_get_type()
    }
}
