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
import org.gtkkn.native.webkit.WebKitPermissionRequest
import org.gtkkn.native.webkit.WebKitUserMediaPermissionRequest
import org.gtkkn.native.webkit.webkit_user_media_permission_request_get_type

/**
 * A permission request for accessing user's audio/video devices.
 *
 * WebKitUserMediaPermissionRequest represents a request for
 * permission to decide whether WebKit should be allowed to access the user's
 * audio and video source devices when requested through the getUserMedia API.
 *
 * When a WebKitUserMediaPermissionRequest is not handled by the user,
 * it is denied by default.
 *
 * ## Skipped during bindings generation
 *
 * - method `is-for-audio-device`: Property has no getter nor setter
 * - method `is-for-video-device`: Property has no getter nor setter
 *
 * @since 2.8
 */
@WebKitVersion2_8
public class UserMediaPermissionRequest(
    public val webkitUserMediaPermissionRequestPointer: CPointer<WebKitUserMediaPermissionRequest>,
) : Object(webkitUserMediaPermissionRequestPointer.reinterpret()),
    PermissionRequest,
    KGTyped {
    init {
        WebKit
    }

    override val webkitPermissionRequestPointer: CPointer<WebKitPermissionRequest>
        get() = handle.reinterpret()

    public companion object : TypeCompanion<UserMediaPermissionRequest> {
        override val type: GeneratedClassKGType<UserMediaPermissionRequest> =
            GeneratedClassKGType(getTypeOrNull()!!) { UserMediaPermissionRequest(it.reinterpret()) }

        init {
            WebKitTypeProvider.register()
        }

        /**
         * Get the GType of UserMediaPermissionRequest
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_user_media_permission_request_get_type()

        /**
         * Gets the GType of from the symbol `webkit_user_media_permission_request_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("webkit_user_media_permission_request_get_type")
    }
}
