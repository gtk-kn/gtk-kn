// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitPermissionRequest
import org.gtkkn.native.webkit.webkit_permission_request_allow
import org.gtkkn.native.webkit.webkit_permission_request_deny
import org.gtkkn.native.webkit.webkit_permission_request_get_type
import kotlin.Unit

/**
 * A permission request.
 *
 * There are situations where an embedder would need to ask the user
 * for permission to do certain types of operations, such as switching
 * to fullscreen mode or reporting the user's location through the
 * standard Geolocation API. In those cases, WebKit will emit a
 * #WebKitWebView::permission-request signal with a
 * #WebKitPermissionRequest object attached to it.
 */
public interface PermissionRequest :
    Proxy,
    KGTyped {
    public val webkitPermissionRequestPointer: CPointer<WebKitPermissionRequest>

    /**
     * Allow the action which triggered this request.
     */
    public fun allow(): Unit = webkit_permission_request_allow(webkitPermissionRequestPointer)

    /**
     * Deny the action which triggered this request.
     */
    public fun deny(): Unit = webkit_permission_request_deny(webkitPermissionRequestPointer)

    /**
     * The PermissionRequestImpl type represents a native instance of the PermissionRequest interface.
     *
     * @constructor Creates a new instance of PermissionRequest for the provided [CPointer].
     */
    public data class PermissionRequestImpl(
        override val webkitPermissionRequestPointer: CPointer<WebKitPermissionRequest>,
    ) : Object(webkitPermissionRequestPointer.reinterpret()),
        PermissionRequest

    public companion object : TypeCompanion<PermissionRequest> {
        override val type: GeneratedInterfaceKGType<PermissionRequest> =
            GeneratedInterfaceKGType(getTypeOrNull("webkit_permission_request_get_type")!!) {
                PermissionRequestImpl(it.reinterpret())
            }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of PermissionRequest
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_permission_request_get_type()
    }
}
