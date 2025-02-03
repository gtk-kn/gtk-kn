// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_8
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitNotificationPermissionRequest
import org.gtkkn.native.webkit.WebKitPermissionRequest
import org.gtkkn.native.webkit.webkit_notification_permission_request_get_type

/**
 * A permission request for displaying web notifications.
 *
 * WebKitNotificationPermissionRequest represents a request for
 * permission to decide whether WebKit should provide the user with
 * notifications through the Web Notification API.
 *
 * When a WebKitNotificationPermissionRequest is not handled by the user,
 * it is denied by default.
 * @since 2.8
 */
@WebKitVersion2_8
public class NotificationPermissionRequest(
    public val webkitNotificationPermissionRequestPointer: CPointer<WebKitNotificationPermissionRequest>,
) : Object(webkitNotificationPermissionRequestPointer.reinterpret()),
    PermissionRequest,
    KGTyped {
    init {
        WebKit
    }

    override val webkitPermissionRequestPointer: CPointer<WebKitPermissionRequest>
        get() = handle.reinterpret()

    public companion object : TypeCompanion<NotificationPermissionRequest> {
        override val type: GeneratedClassKGType<NotificationPermissionRequest> =
            GeneratedClassKGType(getTypeOrNull()!!) { NotificationPermissionRequest(it.reinterpret()) }

        init {
            WebKitTypeProvider.register()
        }

        /**
         * Get the GType of NotificationPermissionRequest
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_notification_permission_request_get_type()

        /**
         * Gets the GType of from the symbol `webkit_notification_permission_request_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("webkit_notification_permission_request_get_type")
    }
}
