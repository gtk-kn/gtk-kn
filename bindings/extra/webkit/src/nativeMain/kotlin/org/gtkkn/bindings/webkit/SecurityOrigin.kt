// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_16
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.webkit.WebKitSecurityOrigin
import org.gtkkn.native.webkit.webkit_security_origin_get_host
import org.gtkkn.native.webkit.webkit_security_origin_get_port
import org.gtkkn.native.webkit.webkit_security_origin_get_protocol
import org.gtkkn.native.webkit.webkit_security_origin_new
import org.gtkkn.native.webkit.webkit_security_origin_new_for_uri
import org.gtkkn.native.webkit.webkit_security_origin_ref
import org.gtkkn.native.webkit.webkit_security_origin_unref
import kotlin.String
import kotlin.UShort
import kotlin.Unit

/**
 * A security boundary for websites.
 *
 * #WebKitSecurityOrigin is a representation of a security domain
 * defined by websites. A security origin consists of a protocol, a
 * hostname, and an optional port number.
 *
 * Resources with the same security origin can generally access each
 * other for client-side scripting or database access. When comparing
 * origins, beware that if both protocol and host are null, the origins
 * should not be treated as equal.
 *
 * ## Skipped during bindings generation
 *
 * - method `to_string`: C function webkit_security_origin_to_string is ignored
 *
 * @since 2.16
 */
@WebKitVersion2_16
public class SecurityOrigin(
    pointer: CPointer<WebKitSecurityOrigin>,
) : Record {
    public val webkitSecurityOriginPointer: CPointer<WebKitSecurityOrigin> = pointer

    /**
     * Gets the hostname of @origin.
     *
     * It is reasonable for this to be null
     * if its protocol does not require a host component.
     *
     * @return The host of the #WebKitSecurityOrigin
     * @since 2.16
     */
    @WebKitVersion2_16
    public fun getHost(): String? =
        webkit_security_origin_get_host(webkitSecurityOriginPointer.reinterpret())?.toKString()

    /**
     * Gets the port of @origin.
     *
     * This function will always return 0 if the
     * port is the default port for the given protocol. For example,
     * http://example.com has the same security origin as
     * http://example.com:80, and this function will return 0 for a
     * #WebKitSecurityOrigin constructed from either URI.
     *
     * @return The port of the #WebKitSecurityOrigin.
     * @since 2.16
     */
    @WebKitVersion2_16
    public fun getPort(): UShort = webkit_security_origin_get_port(webkitSecurityOriginPointer.reinterpret())

    /**
     * Gets the protocol of @origin.
     *
     * @return The protocol of the #WebKitSecurityOrigin
     * @since 2.16
     */
    @WebKitVersion2_16
    public fun getProtocol(): String? =
        webkit_security_origin_get_protocol(webkitSecurityOriginPointer.reinterpret())?.toKString()

    /**
     * Atomically increments the reference count of @origin by one.
     *
     * This function is MT-safe and may be called from any thread.
     *
     * @return The passed #WebKitSecurityOrigin
     * @since 2.16
     */
    @WebKitVersion2_16
    public fun ref(): SecurityOrigin =
        webkit_security_origin_ref(webkitSecurityOriginPointer.reinterpret())!!.run {
            SecurityOrigin(reinterpret())
        }

    /**
     * Atomically decrements the reference count of @origin by one.
     *
     * If the reference count drops to 0, all memory allocated by
     * #WebKitSecurityOrigin is released. This function is MT-safe and may be
     * called from any thread.
     *
     * @since 2.16
     */
    @WebKitVersion2_16
    public fun unref(): Unit = webkit_security_origin_unref(webkitSecurityOriginPointer.reinterpret())

    public companion object : RecordCompanion<SecurityOrigin, WebKitSecurityOrigin> {
        /**
         * Create a new security origin from the provided protocol, host and
         * port.
         *
         * @param protocol The protocol for the new origin
         * @param host The host for the new origin
         * @param port The port number for the new origin, or 0 to indicate the
         *        default port for @protocol
         * @return A #WebKitSecurityOrigin.
         * @since 2.16
         */
        public fun new(
            protocol: String,
            host: String,
            port: UShort,
        ): SecurityOrigin = SecurityOrigin(webkit_security_origin_new(protocol, host, port)!!.reinterpret())

        /**
         * Create a new security origin from the provided.
         *
         * Create a new security origin from the provided URI. Components of
         * @uri other than protocol, host, and port do not affect the created
         * #WebKitSecurityOrigin.
         *
         * @param uri The URI for the new origin
         * @return A #WebKitSecurityOrigin.
         * @since 2.16
         */
        public fun newForUri(uri: String): SecurityOrigin =
            SecurityOrigin(webkit_security_origin_new_for_uri(uri)!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): SecurityOrigin =
            SecurityOrigin(pointer.reinterpret())
    }
}