// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_8
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
public class UserMediaPermissionRequest(pointer: CPointer<WebKitUserMediaPermissionRequest>) :
    Object(pointer.reinterpret()),
    PermissionRequest,
    KGTyped {
    public val webkitUserMediaPermissionRequestPointer: CPointer<WebKitUserMediaPermissionRequest>
        get() = gPointer.reinterpret()

    override val webkitPermissionRequestPointer: CPointer<WebKitPermissionRequest>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<UserMediaPermissionRequest> {
        override val type: GeneratedClassKGType<UserMediaPermissionRequest> =
            GeneratedClassKGType(webkit_user_media_permission_request_get_type()) {
                UserMediaPermissionRequest(it.reinterpret())
            }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of UserMediaPermissionRequest
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_user_media_permission_request_get_type()
    }
}
