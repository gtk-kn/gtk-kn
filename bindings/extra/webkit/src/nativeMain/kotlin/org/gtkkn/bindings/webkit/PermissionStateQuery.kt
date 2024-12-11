// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_40
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitPermissionStateQuery
import org.gtkkn.native.webkit.webkit_permission_state_query_finish
import org.gtkkn.native.webkit.webkit_permission_state_query_get_name
import org.gtkkn.native.webkit.webkit_permission_state_query_get_security_origin
import org.gtkkn.native.webkit.webkit_permission_state_query_get_type
import org.gtkkn.native.webkit.webkit_permission_state_query_ref
import org.gtkkn.native.webkit.webkit_permission_state_query_unref
import kotlin.String
import kotlin.Unit

/**
 * This query represents a user's choice to allow or deny access to "powerful features" of the
 * platform, as specified in the [Permissions W3C
 * Specification](https://w3c.github.io/permissions/).
 *
 * When signalled by the #WebKitWebView through the `query-permission-state` signal, the application
 * has to eventually respond, via `webkit_permission_state_query_finish()`, whether it grants,
 * denies or requests a dedicated permission prompt for the given query.
 *
 * When a #WebKitPermissionStateQuery is not handled by the user, the user-agent is instructed to
 * `prompt` the user for the given permission.
 */
public class PermissionStateQuery(pointer: CPointer<WebKitPermissionStateQuery>) : ProxyInstance(pointer) {
    public val webkitPermissionStateQueryPointer: CPointer<WebKitPermissionStateQuery> = pointer

    /**
     * Notify the web-engine of the selected permission state for the given query. This function should
     * only be called as a response to the `WebKitWebView::query-permission-state` signal.
     *
     * @param state a #WebKitPermissionState
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun finish(state: PermissionState): Unit =
        webkit_permission_state_query_finish(webkitPermissionStateQueryPointer.reinterpret(), state.nativeValue)

    /**
     * Get the permission name for which access is being queried.
     *
     * @return the permission name for @query
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun getName(): String =
        webkit_permission_state_query_get_name(webkitPermissionStateQueryPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Get the permission origin for which access is being queried.
     *
     * @return A #WebKitSecurityOrigin representing the origin from which the
     * @query was emitted.
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun getSecurityOrigin(): SecurityOrigin =
        webkit_permission_state_query_get_security_origin(webkitPermissionStateQueryPointer.reinterpret())!!.run {
            SecurityOrigin(reinterpret())
        }

    /**
     * Atomically increments the reference count of @query by one.
     *
     * This function is MT-safe and may be called from any thread.
     *
     * @return The passed #WebKitPermissionStateQuery
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun ref(): PermissionStateQuery =
        webkit_permission_state_query_ref(webkitPermissionStateQueryPointer.reinterpret())!!.run {
            PermissionStateQuery(reinterpret())
        }

    /**
     * Atomically decrements the reference count of @query by one.
     *
     * If the reference count drops to 0, all memory allocated by #WebKitPermissionStateQuery is
     * released. This function is MT-safe and may be called from any thread.
     *
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun unref(): Unit = webkit_permission_state_query_unref(webkitPermissionStateQueryPointer.reinterpret())

    public companion object {
        /**
         * Get the GType of PermissionStateQuery
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_permission_state_query_get_type()
    }
}
