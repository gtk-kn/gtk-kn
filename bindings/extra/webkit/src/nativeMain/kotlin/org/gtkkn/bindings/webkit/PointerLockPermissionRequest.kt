// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_28
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitPermissionRequest
import org.gtkkn.native.webkit.WebKitPointerLockPermissionRequest
import org.gtkkn.native.webkit.webkit_pointer_lock_permission_request_get_type

/**
 * A permission request for locking the pointer.
 *
 * WebKitPointerLockPermissionRequest represents a request for
 * permission to decide whether WebKit can lock the pointer device when
 * requested by web content.
 *
 * When a WebKitPointerLockPermissionRequest is not handled by the user,
 * it is allowed by default.
 * @since 2.28
 */
@WebKitVersion2_28
public class PointerLockPermissionRequest(
    public val webkitPointerLockPermissionRequestPointer: CPointer<WebKitPointerLockPermissionRequest>,
) : Object(webkitPointerLockPermissionRequestPointer.reinterpret()),
    PermissionRequest,
    KGTyped {
    init {
        WebKit
    }

    override val webkitPermissionRequestPointer: CPointer<WebKitPermissionRequest>
        get() = handle.reinterpret()

    public companion object : TypeCompanion<PointerLockPermissionRequest> {
        override val type: GeneratedClassKGType<PointerLockPermissionRequest> =
            GeneratedClassKGType(getTypeOrNull()!!) { PointerLockPermissionRequest(it.reinterpret()) }

        init {
            WebKitTypeProvider.register()
        }

        /**
         * Get the GType of PointerLockPermissionRequest
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_pointer_lock_permission_request_get_type()

        /**
         * Gets the GType of from the symbol `webkit_pointer_lock_permission_request_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("webkit_pointer_lock_permission_request_get_type")
    }
}
