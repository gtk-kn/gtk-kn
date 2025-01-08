// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupAuthDomain
import org.gtkkn.native.soup.soup_auth_domain_accepts
import org.gtkkn.native.soup.soup_auth_domain_add_path
import org.gtkkn.native.soup.soup_auth_domain_challenge
import org.gtkkn.native.soup.soup_auth_domain_check_password
import org.gtkkn.native.soup.soup_auth_domain_covers
import org.gtkkn.native.soup.soup_auth_domain_get_realm
import org.gtkkn.native.soup.soup_auth_domain_get_type
import org.gtkkn.native.soup.soup_auth_domain_remove_path
import org.gtkkn.native.soup.soup_auth_domain_set_filter
import org.gtkkn.native.soup.soup_auth_domain_set_generic_auth_callback
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Server-side authentication.
 *
 * A #SoupAuthDomain manages authentication for all or part of a
 * [class@Server]. To make a server require authentication, first create
 * an appropriate subclass of #SoupAuthDomain, and then add it to the
 * server with [method@Server.add_auth_domain].
 *
 * In order for an auth domain to have any effect, you must add one or more
 * paths to it (via [method@AuthDomain.add_path]). To require authentication for
 * all ordinary requests, add the path `"/"`. (Note that this does not include
 * the special `"*"` URI (eg, "OPTIONS *"), which must be added as a separate
 * path if you want to cover it.)
 *
 * If you need greater control over which requests should and shouldn't be
 * authenticated, add paths covering everything you *might* want authenticated,
 * and then use a filter ([method@AuthDomain.set_filter] to bypass
 * authentication for those requests that don't need it.
 *
 * ## Skipped during bindings generation
 *
 * - method `filter`: Property has no getter
 * - method `filter-data`: Property has no getter nor setter
 * - method `generic-auth-callback`: Property has no getter
 * - method `generic-auth-data`: Property has no getter nor setter
 * - method `proxy`: Property has no getter nor setter
 */
public open class AuthDomain(pointer: CPointer<SoupAuthDomain>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val soupAuthDomainPointer: CPointer<SoupAuthDomain>
        get() = gPointer.reinterpret()

    /**
     * The realm of this auth domain.
     */
    public open val realm: String
        /**
         * Gets the realm name associated with @domain.
         *
         * @return @domain's realm
         */
        get() = soup_auth_domain_get_realm(soupAuthDomainPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Checks if @msg contains appropriate authorization for @domain to
     * accept it.
     *
     * Mirroring [method@AuthDomain.covers], this does not check whether or not
     * @domain *cares* if @msg is authorized.
     *
     * This is used by [class@Server] internally and is probably of no use to
     * anyone else.
     *
     * @param msg a #SoupServerMessage
     * @return the username that @msg has authenticated
     *   as, if in fact it has authenticated. null otherwise.
     */
    public open fun accepts(msg: ServerMessage): String? =
        soup_auth_domain_accepts(soupAuthDomainPointer, msg.soupServerMessagePointer)?.toKString()

    /**
     * Adds @path to @domain.
     *
     * Requests under @path on @domain's server will require authentication (unless
     * overridden by [method@AuthDomain.remove_path] or
     * [method@AuthDomain.set_filter]).
     *
     * @param path the path to add to @domain
     */
    public open fun addPath(path: String): Unit = soup_auth_domain_add_path(soupAuthDomainPointer, path)

    /**
     * Adds a "WWW-Authenticate" or "Proxy-Authenticate" header to @msg.
     *
     * It requests that the client authenticate, and sets @msg's status accordingly.
     *
     * This is used by [class@Server] internally and is probably of no use to
     * anyone else.
     *
     * @param msg a #SoupServerMessage
     */
    public open fun challenge(msg: ServerMessage): Unit =
        soup_auth_domain_challenge(soupAuthDomainPointer, msg.soupServerMessagePointer)

    /**
     * Checks if @msg authenticates to @domain via @username and
     * @password.
     *
     * This would normally be called from a
     * [callback@AuthDomainGenericAuthCallback].
     *
     * @param msg a #SoupServerMessage
     * @param username a username
     * @param password a password
     * @return whether or not the message is authenticated
     */
    public open fun checkPassword(msg: ServerMessage, username: String, password: String): Boolean =
        soup_auth_domain_check_password(
            soupAuthDomainPointer,
            msg.soupServerMessagePointer,
            username,
            password
        ).asBoolean()

    /**
     * Checks if @domain requires @msg to be authenticated (according to
     * its paths and filter function).
     *
     * This does not actually look at whether @msg *is* authenticated, merely
     * whether or not it needs to be.
     *
     * This is used by [class@Server] internally and is probably of no use to
     * anyone else.
     *
     * @param msg a #SoupServerMessage
     * @return true if @domain requires @msg to be authenticated
     */
    public open fun covers(msg: ServerMessage): Boolean =
        soup_auth_domain_covers(soupAuthDomainPointer, msg.soupServerMessagePointer).asBoolean()

    /**
     * Removes @path from @domain.
     *
     * Requests under @path on @domain's server will NOT require
     * authentication.
     *
     * This is not simply an undo-er for [method@AuthDomain.add_path]; it
     * can be used to "carve out" a subtree that does not require
     * authentication inside a hierarchy that does. Note also that unlike
     * with [method@AuthDomain.add_path], this cannot be overridden by
     * adding a filter, as filters can only bypass authentication that
     * would otherwise be required, not require it where it would
     * otherwise be unnecessary.
     *
     * @param path the path to remove from @domain
     */
    public open fun removePath(path: String): Unit = soup_auth_domain_remove_path(soupAuthDomainPointer, path)

    /**
     * Adds @filter as an authentication filter to @domain.
     *
     * The filter gets a chance to bypass authentication for certain requests that
     * would otherwise require it. Eg, it might check the message's path in some way
     * that is too complicated to do via the other methods, or it might check the
     * message's method, and allow GETs but not PUTs.
     *
     * The filter function returns true if the request should still
     * require authentication, or false if authentication is unnecessary
     * for this request.
     *
     * To help prevent security holes, your filter should return true by
     * default, and only return false under specifically-tested
     * circumstances, rather than the other way around. Eg, in the example
     * above, where you want to authenticate PUTs but not GETs, you should
     * check if the method is GET and return false in that case, and then
     * return true for all other methods (rather than returning true for
     * PUT and false for all other methods). This way if it turned out
     * (now or later) that some paths supported additional methods besides
     * GET and PUT, those methods would default to being NOT allowed for
     * unauthenticated users.
     *
     * You can also set the filter by setting the SoupAuthDomain:filter
     * and [property@AuthDomain:filter-data properties], which can also be
     * used to set the filter at construct time.
     *
     * @param filter the auth filter for @domain
     */
    public open fun setFilter(filter: AuthDomainFilter): Unit = soup_auth_domain_set_filter(
        soupAuthDomainPointer,
        AuthDomainFilterFunc.reinterpret(),
        StableRef.create(filter).asCPointer(),
        staticStableRefDestroy.reinterpret()
    )

    /**
     * Sets @auth_callback as an authentication-handling callback for @domain.
     *
     * Whenever a request comes in to @domain which cannot be authenticated via a
     * domain-specific auth callback (eg, [callback@AuthDomainDigestAuthCallback]),
     * the generic auth callback will be invoked. See
     * [callback@AuthDomainGenericAuthCallback] for information on what the callback
     * should do.
     *
     * @param authCallback the auth callback
     */
    public open fun setGenericAuthCallback(authCallback: AuthDomainGenericAuthCallback): Unit =
        soup_auth_domain_set_generic_auth_callback(
            soupAuthDomainPointer,
            AuthDomainGenericAuthCallbackFunc.reinterpret(),
            StableRef.create(authCallback).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    public companion object : TypeCompanion<AuthDomain> {
        override val type: GeneratedClassKGType<AuthDomain> =
            GeneratedClassKGType(soup_auth_domain_get_type()) { AuthDomain(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of AuthDomain
         *
         * @return the GType
         */
        public fun getType(): GType = soup_auth_domain_get_type()
    }
}
