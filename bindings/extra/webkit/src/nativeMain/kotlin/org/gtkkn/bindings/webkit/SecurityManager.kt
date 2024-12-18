// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitSecurityManager
import org.gtkkn.native.webkit.webkit_security_manager_get_type
import org.gtkkn.native.webkit.webkit_security_manager_register_uri_scheme_as_cors_enabled
import org.gtkkn.native.webkit.webkit_security_manager_register_uri_scheme_as_display_isolated
import org.gtkkn.native.webkit.webkit_security_manager_register_uri_scheme_as_empty_document
import org.gtkkn.native.webkit.webkit_security_manager_register_uri_scheme_as_local
import org.gtkkn.native.webkit.webkit_security_manager_register_uri_scheme_as_no_access
import org.gtkkn.native.webkit.webkit_security_manager_register_uri_scheme_as_secure
import org.gtkkn.native.webkit.webkit_security_manager_uri_scheme_is_cors_enabled
import org.gtkkn.native.webkit.webkit_security_manager_uri_scheme_is_display_isolated
import org.gtkkn.native.webkit.webkit_security_manager_uri_scheme_is_empty_document
import org.gtkkn.native.webkit.webkit_security_manager_uri_scheme_is_local
import org.gtkkn.native.webkit.webkit_security_manager_uri_scheme_is_no_access
import org.gtkkn.native.webkit.webkit_security_manager_uri_scheme_is_secure
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Controls security settings in a #WebKitWebContext.
 *
 * The #WebKitSecurityManager defines security settings for URI
 * schemes in a #WebKitWebContext. Get it from the context with
 * webkit_web_context_get_security_manager(), and use it to register a
 * URI scheme with a certain security level, or to check if it already
 * has it.
 */
public class SecurityManager(pointer: CPointer<WebKitSecurityManager>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val webkitSecurityManagerPointer: CPointer<WebKitSecurityManager>
        get() = gPointer.reinterpret()

    /**
     * Register @scheme as a CORS (Cross-origin resource sharing) enabled scheme.
     *
     * This means that CORS requests are allowed. See W3C CORS specification
     * http://www.w3.org/TR/cors/.
     *
     * @param scheme a URI scheme
     */
    public fun registerUriSchemeAsCorsEnabled(scheme: String): Unit =
        webkit_security_manager_register_uri_scheme_as_cors_enabled(webkitSecurityManagerPointer.reinterpret(), scheme)

    /**
     * Register @scheme as a display isolated scheme.
     *
     * This means that pages cannot
     * display these URIs unless they are from the same scheme.
     *
     * @param scheme a URI scheme
     */
    public fun registerUriSchemeAsDisplayIsolated(scheme: String): Unit =
        webkit_security_manager_register_uri_scheme_as_display_isolated(
            webkitSecurityManagerPointer.reinterpret(),
            scheme
        )

    /**
     * Register @scheme as an empty document scheme.
     *
     * This means that
     * they are allowed to commit synchronously.
     *
     * @param scheme a URI scheme
     */
    public fun registerUriSchemeAsEmptyDocument(scheme: String): Unit =
        webkit_security_manager_register_uri_scheme_as_empty_document(
            webkitSecurityManagerPointer.reinterpret(),
            scheme
        )

    /**
     * Register @scheme as a local scheme.
     *
     * This means that other non-local pages
     * cannot link to or access URIs of this scheme.
     *
     * @param scheme a URI scheme
     */
    public fun registerUriSchemeAsLocal(scheme: String): Unit =
        webkit_security_manager_register_uri_scheme_as_local(webkitSecurityManagerPointer.reinterpret(), scheme)

    /**
     * Register @scheme as a no-access scheme.
     *
     * This means that pages loaded
     * with this URI scheme cannot access pages loaded with any other URI scheme.
     *
     * @param scheme a URI scheme
     */
    public fun registerUriSchemeAsNoAccess(scheme: String): Unit =
        webkit_security_manager_register_uri_scheme_as_no_access(webkitSecurityManagerPointer.reinterpret(), scheme)

    /**
     * Register @scheme as a secure scheme.
     *
     * This means that mixed
     * content warnings won't be generated for this scheme when
     * included by an HTTPS page.
     *
     * @param scheme a URI scheme
     */
    public fun registerUriSchemeAsSecure(scheme: String): Unit =
        webkit_security_manager_register_uri_scheme_as_secure(webkitSecurityManagerPointer.reinterpret(), scheme)

    /**
     * Whether @scheme is considered as a CORS enabled scheme.
     *
     * See also webkit_security_manager_register_uri_scheme_as_cors_enabled().
     *
     * @param scheme a URI scheme
     * @return true if @scheme is a CORS enabled scheme or false otherwise.
     */
    public fun uriSchemeIsCorsEnabled(scheme: String): Boolean = webkit_security_manager_uri_scheme_is_cors_enabled(
        webkitSecurityManagerPointer.reinterpret(),
        scheme
    ).asBoolean()

    /**
     * Whether @scheme is considered as a display isolated scheme.
     *
     * See also webkit_security_manager_register_uri_scheme_as_display_isolated().
     *
     * @param scheme a URI scheme
     * @return true if @scheme is a display isolated scheme or false otherwise.
     */
    public fun uriSchemeIsDisplayIsolated(scheme: String): Boolean =
        webkit_security_manager_uri_scheme_is_display_isolated(
            webkitSecurityManagerPointer.reinterpret(),
            scheme
        ).asBoolean()

    /**
     * Whether @scheme is considered as an empty document scheme.
     *
     * See also webkit_security_manager_register_uri_scheme_as_empty_document().
     *
     * @param scheme a URI scheme
     * @return true if @scheme is an empty document scheme or false otherwise.
     */
    public fun uriSchemeIsEmptyDocument(scheme: String): Boolean = webkit_security_manager_uri_scheme_is_empty_document(
        webkitSecurityManagerPointer.reinterpret(),
        scheme
    ).asBoolean()

    /**
     * Whether @scheme is considered as a local scheme.
     *
     * See also webkit_security_manager_register_uri_scheme_as_local().
     *
     * @param scheme a URI scheme
     * @return true if @scheme is a local scheme or false otherwise.
     */
    public fun uriSchemeIsLocal(scheme: String): Boolean =
        webkit_security_manager_uri_scheme_is_local(webkitSecurityManagerPointer.reinterpret(), scheme).asBoolean()

    /**
     * Whether @scheme is considered as a no-access scheme.
     *
     * See also webkit_security_manager_register_uri_scheme_as_no_access().
     *
     * @param scheme a URI scheme
     * @return true if @scheme is a no-access scheme or false otherwise.
     */
    public fun uriSchemeIsNoAccess(scheme: String): Boolean =
        webkit_security_manager_uri_scheme_is_no_access(webkitSecurityManagerPointer.reinterpret(), scheme).asBoolean()

    /**
     * Whether @scheme is considered as a secure scheme.
     *
     * See also webkit_security_manager_register_uri_scheme_as_secure().
     *
     * @param scheme a URI scheme
     * @return true if @scheme is a secure scheme or false otherwise.
     */
    public fun uriSchemeIsSecure(scheme: String): Boolean =
        webkit_security_manager_uri_scheme_is_secure(webkitSecurityManagerPointer.reinterpret(), scheme).asBoolean()

    public companion object : TypeCompanion<SecurityManager> {
        override val type: GeneratedClassKGType<SecurityManager> =
            GeneratedClassKGType(webkit_security_manager_get_type()) { SecurityManager(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of SecurityManager
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_security_manager_get_type()
    }
}
