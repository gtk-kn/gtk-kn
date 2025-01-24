// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_30
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitPermissionRequest
import org.gtkkn.native.webkit.WebKitWebsiteDataAccessPermissionRequest
import org.gtkkn.native.webkit.webkit_website_data_access_permission_request_get_current_domain
import org.gtkkn.native.webkit.webkit_website_data_access_permission_request_get_requesting_domain
import org.gtkkn.native.webkit.webkit_website_data_access_permission_request_get_type
import kotlin.String

/**
 * A permission request for accessing website data from third-party domains.
 *
 * WebKitWebsiteDataAccessPermissionRequest represents a request for
 * permission to allow a third-party domain access its cookies.
 *
 * When a WebKitWebsiteDataAccessPermissionRequest is not handled by the user,
 * it is denied by default.
 * @since 2.30
 */
@WebKitVersion2_30
public class WebsiteDataAccessPermissionRequest(
    public val webkitWebsiteDataAccessPermissionRequestPointer: CPointer<WebKitWebsiteDataAccessPermissionRequest>,
) : Object(webkitWebsiteDataAccessPermissionRequestPointer.reinterpret()),
    PermissionRequest,
    KGTyped {
    override val webkitPermissionRequestPointer: CPointer<WebKitPermissionRequest>
        get() = handle.reinterpret()

    /**
     * Get the current domain being browsed.
     *
     * @return the current domain name
     * @since 2.30
     */
    @WebKitVersion2_30
    public fun getCurrentDomain(): String = webkit_website_data_access_permission_request_get_current_domain(
        webkitWebsiteDataAccessPermissionRequestPointer
    )?.toKString()
        ?: error("Expected not null string")

    /**
     * Get the domain requesting permission to access its cookies while browsing the current domain.
     *
     * @return the requesting domain name
     * @since 2.30
     */
    @WebKitVersion2_30
    public fun getRequestingDomain(): String = webkit_website_data_access_permission_request_get_requesting_domain(
        webkitWebsiteDataAccessPermissionRequestPointer
    )?.toKString()
        ?: error("Expected not null string")

    public companion object : TypeCompanion<WebsiteDataAccessPermissionRequest> {
        override val type: GeneratedClassKGType<WebsiteDataAccessPermissionRequest> =
            GeneratedClassKGType(webkit_website_data_access_permission_request_get_type()) {
                WebsiteDataAccessPermissionRequest(it.reinterpret())
            }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of WebsiteDataAccessPermissionRequest
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_website_data_access_permission_request_get_type()
    }
}
