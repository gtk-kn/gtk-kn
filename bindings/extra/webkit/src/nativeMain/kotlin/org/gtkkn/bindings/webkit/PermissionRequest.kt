// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
    Interface,
    KGTyped {
    public val webkitPermissionRequestPointer: CPointer<WebKitPermissionRequest>

    /**
     * Allow the action which triggered this request.
     */
    public fun allow(): Unit = webkit_permission_request_allow(webkitPermissionRequestPointer.reinterpret())

    /**
     * Deny the action which triggered this request.
     */
    public fun deny(): Unit = webkit_permission_request_deny(webkitPermissionRequestPointer.reinterpret())

    private data class Wrapper(
        private val pointer: CPointer<WebKitPermissionRequest>,
    ) : PermissionRequest {
        override val webkitPermissionRequestPointer: CPointer<WebKitPermissionRequest> = pointer
    }

    public companion object : TypeCompanion<PermissionRequest> {
        override val type: GeneratedInterfaceKGType<PermissionRequest> =
            GeneratedInterfaceKGType(webkit_permission_request_get_type()) { Wrapper(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<WebKitPermissionRequest>): PermissionRequest = Wrapper(pointer)
    }
}
