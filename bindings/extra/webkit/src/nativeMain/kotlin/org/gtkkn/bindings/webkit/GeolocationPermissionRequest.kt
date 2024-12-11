// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitGeolocationPermissionRequest
import org.gtkkn.native.webkit.WebKitPermissionRequest
import org.gtkkn.native.webkit.webkit_geolocation_permission_request_get_type

/**
 * A permission request for sharing the user's location.
 *
 * WebKitGeolocationPermissionRequest represents a request for
 * permission to decide whether WebKit should provide the user's
 * location to a website when requested through the Geolocation API.
 *
 * When a WebKitGeolocationPermissionRequest is not handled by the user,
 * it is denied by default.
 *
 * When embedding web views in your application, you *must* configure an
 * application identifier to allow web content to use geolocation services.
 * The identifier *must* match the name of the `.desktop` file which describes
 * the application, sans the suffix.
 *
 * If your application uses #GApplication (or any subclass like
 * #GtkApplication), WebKit will automatically use the identifier returned by
 * g_application_get_application_id(). This is the recommended approach for
 * enabling geolocation in applications.
 *
 * If an identifier cannot be obtained through #GApplication, the value
 * returned by g_get_prgname() will be used instead as a fallback. For
 * programs which cannot use #GApplication, calling g_set_prgname() early
 * during initialization is needed when the name of the executable on disk
 * does not match the name of a valid `.desktop` file.
 */
public class GeolocationPermissionRequest(pointer: CPointer<WebKitGeolocationPermissionRequest>) :
    Object(pointer.reinterpret()),
    PermissionRequest,
    KGTyped {
    public val webkitGeolocationPermissionRequestPointer:
        CPointer<WebKitGeolocationPermissionRequest>
        get() = gPointer.reinterpret()

    override val webkitPermissionRequestPointer: CPointer<WebKitPermissionRequest>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<GeolocationPermissionRequest> {
        override val type: GeneratedClassKGType<GeolocationPermissionRequest> =
            GeneratedClassKGType(webkit_geolocation_permission_request_get_type()) {
                GeolocationPermissionRequest(it.reinterpret())
            }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of GeolocationPermissionRequest
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_geolocation_permission_request_get_type()
    }
}
