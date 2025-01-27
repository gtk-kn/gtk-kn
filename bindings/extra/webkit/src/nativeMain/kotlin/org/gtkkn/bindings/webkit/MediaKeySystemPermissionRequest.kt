// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitMediaKeySystemPermissionRequest
import org.gtkkn.native.webkit.WebKitPermissionRequest
import org.gtkkn.native.webkit.webkit_media_key_system_permission_request_get_type

/**
 * A permission request for using an EME Content Decryption Module.
 *
 * WebKitMediaKeySystemPermissionRequest represents a request for permission to decide whether
 * WebKit should use the given CDM to access protected media when requested through the
 * MediaKeySystem API.
 *
 * When a WebKitMediaKeySystemPermissionRequest is not handled by the user,
 * it is denied by default.
 *
 * When handling this permission request the application may perform additional installation of the
 * requested CDM, unless it is already present on the host system.
 */
public class MediaKeySystemPermissionRequest(
    public val webkitMediaKeySystemPermissionRequestPointer: CPointer<WebKitMediaKeySystemPermissionRequest>,
) : Object(webkitMediaKeySystemPermissionRequestPointer.reinterpret()),
    PermissionRequest,
    KGTyped {
    override val webkitPermissionRequestPointer: CPointer<WebKitPermissionRequest>
        get() = handle.reinterpret()

    public companion object : TypeCompanion<MediaKeySystemPermissionRequest> {
        override val type: GeneratedClassKGType<MediaKeySystemPermissionRequest> =
            GeneratedClassKGType(getTypeOrNull("webkit_media_key_system_permission_request_get_type")!!) {
                MediaKeySystemPermissionRequest(it.reinterpret())
            }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of MediaKeySystemPermissionRequest
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_media_key_system_permission_request_get_type()
    }
}
