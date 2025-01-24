// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_42
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitClipboardPermissionRequest
import org.gtkkn.native.webkit.WebKitPermissionRequest
import org.gtkkn.native.webkit.webkit_clipboard_permission_request_get_type

/**
 * A permission request for reading clipboard contents.
 *
 * WebKitClipboardPermissionRequest represents a request for
 * permission to decide whether WebKit can access the clipboard to read
 * its contents through the Async Clipboard API.
 *
 * When a WebKitClipboardPermissionRequest is not handled by the user,
 * it is denied by default.
 * @since 2.42
 */
@WebKitVersion2_42
public class ClipboardPermissionRequest(
    public val webkitClipboardPermissionRequestPointer: CPointer<WebKitClipboardPermissionRequest>,
) : Object(webkitClipboardPermissionRequestPointer.reinterpret()),
    PermissionRequest,
    KGTyped {
    override val webkitPermissionRequestPointer: CPointer<WebKitPermissionRequest>
        get() = handle.reinterpret()

    public companion object : TypeCompanion<ClipboardPermissionRequest> {
        override val type: GeneratedClassKGType<ClipboardPermissionRequest> =
            GeneratedClassKGType(webkit_clipboard_permission_request_get_type()) {
                ClipboardPermissionRequest(it.reinterpret())
            }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of ClipboardPermissionRequest
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_clipboard_permission_request_get_type()
    }
}
