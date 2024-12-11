// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupAuthDomainBasic
import org.gtkkn.native.soup.soup_auth_domain_basic_get_type
import org.gtkkn.native.soup.soup_auth_domain_basic_set_auth_callback
import kotlin.Unit

/**
 * Server-side "Basic" authentication.
 *
 * #SoupAuthDomainBasic handles the server side of HTTP "Basic" (ie,
 * cleartext password) authentication.
 *
 * ## Skipped during bindings generation
 *
 * - method `auth-callback`: Property has no getter
 * - method `auth-data`: Property has no getter nor setter
 * - constructor `new`: Varargs parameter is not supported
 */
public class AuthDomainBasic(pointer: CPointer<SoupAuthDomainBasic>) :
    AuthDomain(pointer.reinterpret()),
    KGTyped {
    public val soupAuthDomainBasicPointer: CPointer<SoupAuthDomainBasic>
        get() = gPointer.reinterpret()

    /**
     * Sets the callback that @domain will use to authenticate incoming
     * requests.
     *
     * For each request containing authorization, @domain will invoke the callback,
     * and then either accept or reject the request based on @callback's return
     * value.
     *
     * You can also set the auth callback by setting the
     * [property@AuthDomainBasic:auth-callback] and
     * [property@AuthDomainBasic:auth-data] properties, which can also be used to
     * set the callback at construct time.
     *
     * @param callback the callback
     */
    public fun setAuthCallback(callback: AuthDomainBasicAuthCallback): Unit = soup_auth_domain_basic_set_auth_callback(
        soupAuthDomainBasicPointer.reinterpret(),
        AuthDomainBasicAuthCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer(),
        staticStableRefDestroy.reinterpret()
    )

    public companion object : TypeCompanion<AuthDomainBasic> {
        override val type: GeneratedClassKGType<AuthDomainBasic> =
            GeneratedClassKGType(soup_auth_domain_basic_get_type()) { AuthDomainBasic(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of AuthDomainBasic
         *
         * @return the GType
         */
        public fun getType(): GType = soup_auth_domain_basic_get_type()
    }
}
