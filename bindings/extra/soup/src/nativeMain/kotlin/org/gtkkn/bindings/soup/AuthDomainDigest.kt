// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupAuthDomainDigest
import org.gtkkn.native.soup.soup_auth_domain_digest_encode_password
import org.gtkkn.native.soup.soup_auth_domain_digest_get_type
import org.gtkkn.native.soup.soup_auth_domain_digest_set_auth_callback
import kotlin.String
import kotlin.Unit

/**
 * Server-side "Digest" authentication.
 *
 * #SoupAuthDomainDigest handles the server side of HTTP "Digest"
 * authentication.
 *
 * ## Skipped during bindings generation
 *
 * - method `auth-callback`: Property has no getter
 * - method `auth-data`: Property has no getter nor setter
 * - constructor `new`: Varargs parameter is not supported
 */
public class AuthDomainDigest(pointer: CPointer<SoupAuthDomainDigest>) :
    AuthDomain(pointer.reinterpret()),
    KGTyped {
    public val soupAuthDomainDigestPointer: CPointer<SoupAuthDomainDigest>
        get() = gPointer.reinterpret()

    /**
     * Sets the callback that @domain will use to authenticate incoming
     * requests.
     *
     * For each request containing authorization, @domain will
     * invoke the callback, and then either accept or reject the request
     * based on @callback's return value.
     *
     * You can also set the auth callback by setting the
     * [property@AuthDomainDigest:auth-callback] and
     * [property@AuthDomainDigest:auth-data] properties, which can also be used to
     * set the callback at construct time.
     *
     * @param callback the callback
     */
    public fun setAuthCallback(callback: AuthDomainDigestAuthCallback): Unit =
        soup_auth_domain_digest_set_auth_callback(
            soupAuthDomainDigestPointer.reinterpret(),
            AuthDomainDigestAuthCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    public companion object : TypeCompanion<AuthDomainDigest> {
        override val type: GeneratedClassKGType<AuthDomainDigest> =
            GeneratedClassKGType(soup_auth_domain_digest_get_type()) { AuthDomainDigest(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Encodes the username/realm/password triplet for Digest
         * authentication.
         *
         * That is, it returns a stringified MD5 hash of
         * @username, @realm, and @password concatenated together. This is
         * the form that is needed as the return value of
         * #SoupAuthDomainDigest's auth handler.
         *
         * For security reasons, you should store the encoded hash, rather
         * than storing the cleartext password itself and calling this method
         * only when you need to verify it. This way, if your server is
         * compromised, the attackers will not gain access to cleartext
         * passwords which might also be usable at other sites. (Note also
         * that the encoded password returned by this method is identical to
         * the encoded password stored in an Apache .htdigest file.)
         *
         * @param username a username
         * @param realm an auth realm name
         * @param password the password for @username in @realm
         * @return the encoded password
         */
        public fun encodePassword(username: String, realm: String, password: String): String =
            soup_auth_domain_digest_encode_password(username, realm, password)?.toKString()
                ?: error("Expected not null string")

        /**
         * Get the GType of AuthDomainDigest
         *
         * @return the GType
         */
        public fun getType(): GType = soup_auth_domain_digest_get_type()
    }
}
