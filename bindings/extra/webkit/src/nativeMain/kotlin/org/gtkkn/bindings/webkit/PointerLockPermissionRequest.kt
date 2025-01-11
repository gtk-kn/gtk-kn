// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_28
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
    override val webkitPermissionRequestPointer: CPointer<WebKitPermissionRequest>
        get() = handle.reinterpret()

    public companion object : TypeCompanion<PointerLockPermissionRequest> {
        override val type: GeneratedClassKGType<PointerLockPermissionRequest> =
            GeneratedClassKGType(webkit_pointer_lock_permission_request_get_type()) {
                PointerLockPermissionRequest(it.reinterpret())
            }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of PointerLockPermissionRequest
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_pointer_lock_permission_request_get_type()
    }
}
