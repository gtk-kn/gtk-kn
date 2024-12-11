// This is a generated file. Do not modify.
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
public class WebsiteDataAccessPermissionRequest(pointer: CPointer<WebKitWebsiteDataAccessPermissionRequest>) :
    Object(pointer.reinterpret()),
    PermissionRequest,
    KGTyped {
    public val webkitWebsiteDataAccessPermissionRequestPointer:
        CPointer<WebKitWebsiteDataAccessPermissionRequest>
        get() = gPointer.reinterpret()

    override val webkitPermissionRequestPointer: CPointer<WebKitPermissionRequest>
        get() = gPointer.reinterpret()

    /**
     * Get the current domain being browsed.
     *
     * @return the current domain name
     * @since 2.30
     */
    @WebKitVersion2_30
    public fun getCurrentDomain(): String = webkit_website_data_access_permission_request_get_current_domain(
        webkitWebsiteDataAccessPermissionRequestPointer.reinterpret()
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
        webkitWebsiteDataAccessPermissionRequestPointer.reinterpret()
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
