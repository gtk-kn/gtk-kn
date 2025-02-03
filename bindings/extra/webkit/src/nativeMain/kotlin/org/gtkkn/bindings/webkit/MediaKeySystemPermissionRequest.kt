// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
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
    init {
        WebKit
    }

    override val webkitPermissionRequestPointer: CPointer<WebKitPermissionRequest>
        get() = handle.reinterpret()

    public companion object : TypeCompanion<MediaKeySystemPermissionRequest> {
        override val type: GeneratedClassKGType<MediaKeySystemPermissionRequest> =
            GeneratedClassKGType(getTypeOrNull()!!) { MediaKeySystemPermissionRequest(it.reinterpret()) }

        init {
            WebKitTypeProvider.register()
        }

        /**
         * Get the GType of MediaKeySystemPermissionRequest
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_media_key_system_permission_request_get_type()

        /**
         * Gets the GType of from the symbol `webkit_media_key_system_permission_request_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("webkit_media_key_system_permission_request_get_type")
    }
}
