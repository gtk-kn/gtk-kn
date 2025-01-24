// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.SList
import org.gtkkn.bindings.glib.Uri
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupAuth
import org.gtkkn.native.soup.soup_auth_authenticate
import org.gtkkn.native.soup.soup_auth_can_authenticate
import org.gtkkn.native.soup.soup_auth_cancel
import org.gtkkn.native.soup.soup_auth_free_protection_space
import org.gtkkn.native.soup.soup_auth_get_authority
import org.gtkkn.native.soup.soup_auth_get_authorization
import org.gtkkn.native.soup.soup_auth_get_info
import org.gtkkn.native.soup.soup_auth_get_protection_space
import org.gtkkn.native.soup.soup_auth_get_realm
import org.gtkkn.native.soup.soup_auth_get_scheme_name
import org.gtkkn.native.soup.soup_auth_get_type
import org.gtkkn.native.soup.soup_auth_is_authenticated
import org.gtkkn.native.soup.soup_auth_is_cancelled
import org.gtkkn.native.soup.soup_auth_is_for_proxy
import org.gtkkn.native.soup.soup_auth_is_ready
import org.gtkkn.native.soup.soup_auth_new
import org.gtkkn.native.soup.soup_auth_update
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * The abstract base class for handling authentication.
 *
 * Specific HTTP Authentication mechanisms are implemented by its subclasses,
 * but applications never need to be aware of the specific subclasses being
 * used.
 *
 * #SoupAuth objects store the authentication data associated with a given bit
 * of web space. They are created automatically by [class@Session].
 *
 * ## Skipped during bindings generation
 *
 * - method `is-authenticated`: Property has no getter nor setter
 * - method `is-cancelled`: Property has no getter nor setter
 * - method `is-for-proxy`: Property has no getter nor setter
 */
public abstract class Auth(public val soupAuthPointer: CPointer<SoupAuth>) :
    Object(soupAuthPointer.reinterpret()),
    KGTyped {
    /**
     * The authority (host:port) being authenticated to.
     */
    public open val authority: String
        /**
         * Returns the authority (host:port) that @auth is associated with.
         *
         * @return the authority
         */
        get() = soup_auth_get_authority(soupAuthPointer)?.toKString() ?: error("Expected not null string")

    /**
     * The authentication realm.
     */
    public open val realm: String
        /**
         * Returns @auth's realm.
         *
         * This is an identifier that distinguishes separate authentication spaces on a
         * given server, and may be some string that is meaningful to the user.
         * (Although it is probably not localized.)
         *
         * @return the realm name
         */
        get() = soup_auth_get_realm(soupAuthPointer)?.toKString() ?: error("Expected not null string")

    /**
     * The authentication scheme name.
     */
    public open val schemeName: String
        /**
         * soup_auth_get_scheme_name: (attributes org.gtk.Method.get_property=scheme-name)
         * Returns @auth's scheme name. (Eg, "Basic", "Digest", or "NTLM")
         *
         * @return the scheme name
         */
        get() = soup_auth_get_scheme_name(soupAuthPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Creates a new #SoupAuth of type @type with the information from
     * @msg and @auth_header.
     *
     * This is called by [class@Session]; you will normally not create auths
     * yourself.
     *
     * @param type the type of auth to create (a subtype of #SoupAuth)
     * @param msg the #SoupMessage the auth is being created for
     * @param authHeader the WWW-Authenticate/Proxy-Authenticate header
     * @return the new #SoupAuth, or null if it could
     *   not be created
     */
    public constructor(
        type: GType,
        msg: Message,
        authHeader: String,
    ) : this(soup_auth_new(type, msg.soupMessagePointer, authHeader)!!.reinterpret())

    /**
     * Call this on an auth to authenticate it.
     *
     * Normally this will cause the auth's message to be requeued with the new
     * authentication info.
     *
     * @param username the username provided by the user or client
     * @param password the password provided by the user or client
     */
    public open fun authenticate(username: String, password: String): Unit =
        soup_auth_authenticate(soupAuthPointer, username, password)

    /**
     * Tests if @auth is able to authenticate by providing credentials to the
     * [method@Auth.authenticate].
     *
     * @return true if @auth is able to accept credentials.
     */
    public open fun canAuthenticate(): Boolean = soup_auth_can_authenticate(soupAuthPointer).asBoolean()

    /**
     * Call this on an auth to cancel it.
     *
     * You need to cancel an auth to complete an asynchronous authenticate operation
     * when no credentials are provided ([method@Auth.authenticate] is not called).
     * The #SoupAuth will be cancelled on dispose if it hans't been authenticated.
     */
    public open fun cancel(): Unit = soup_auth_cancel(soupAuthPointer)

    /**
     * Frees @space.
     *
     * @param space the return value from [method@Auth.get_protection_space]
     */
    public open fun freeProtectionSpace(space: SList): Unit =
        soup_auth_free_protection_space(soupAuthPointer, space.glibSListPointer)

    /**
     * Generates an appropriate "Authorization" header for @msg.
     *
     * (The session will only call this if [method@Auth.is_authenticated] returned
     * true.)
     *
     * @param msg the #SoupMessage to be authorized
     * @return the "Authorization" header, which must be freed.
     */
    public open fun getAuthorization(msg: Message): String =
        soup_auth_get_authorization(soupAuthPointer, msg.soupMessagePointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets an opaque identifier for @auth.
     *
     * The identifier can be used as a hash key or the like. #SoupAuth objects from
     * the same server with the same identifier refer to the same authentication
     * domain (eg, the URLs associated with them take the same usernames and
     * passwords).
     *
     * @return the identifier
     */
    public open fun getInfo(): String =
        soup_auth_get_info(soupAuthPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Returns a list of paths on the server which @auth extends over.
     *
     * (All subdirectories of these paths are also assumed to be part
     * of @auth's protection space, unless otherwise discovered not to
     * be.)
     *
     * @param sourceUri the URI of the request that @auth was generated in
     *   response to.
     * @return the list of
     *   paths, which can be freed with [method@Auth.free_protection_space].
     */
    public open fun getProtectionSpace(sourceUri: Uri): SList =
        soup_auth_get_protection_space(soupAuthPointer, sourceUri.glibUriPointer)!!.run {
            SList(this)
        }

    /**
     * Tests if @auth has been given a username and password.
     *
     * @return true if @auth has been given a username and password
     */
    public open fun isAuthenticated(): Boolean = soup_auth_is_authenticated(soupAuthPointer).asBoolean()

    /**
     * Tests if @auth has been cancelled
     *
     * @return true if @auth has been cancelled
     */
    public open fun isCancelled(): Boolean = soup_auth_is_cancelled(soupAuthPointer).asBoolean()

    /**
     * Tests whether or not @auth is associated with a proxy server rather
     * than an "origin" server.
     *
     * @return true or false
     */
    public open fun isForProxy(): Boolean = soup_auth_is_for_proxy(soupAuthPointer).asBoolean()

    /**
     * Tests if @auth is ready to make a request for @msg with.
     *
     * For most auths, this is equivalent to [method@Auth.is_authenticated], but for
     * some auth types (eg, NTLM), the auth may be sendable (eg, as an
     * authentication request) even before it is authenticated.
     *
     * @param msg a #SoupMessage
     * @return true if @auth is ready to make a request with.
     */
    public open fun isReady(msg: Message): Boolean =
        soup_auth_is_ready(soupAuthPointer, msg.soupMessagePointer).asBoolean()

    /**
     * Updates @auth with the information from @msg and @auth_header,
     * possibly un-authenticating it.
     *
     * As with [ctor@Auth.new], this is normally only used by [class@Session].
     *
     * @param msg the #SoupMessage @auth is being updated for
     * @param authHeader the WWW-Authenticate/Proxy-Authenticate header
     * @return true if @auth is still a valid (but potentially
     *   unauthenticated) #SoupAuth. false if something about @auth_params
     *   could not be parsed or incorporated into @auth at all.
     */
    public open fun update(msg: Message, authHeader: String): Boolean =
        soup_auth_update(soupAuthPointer, msg.soupMessagePointer, authHeader).asBoolean()

    /**
     * The AuthImpl type represents a native instance of the abstract Auth class.
     *
     * @constructor Creates a new instance of Auth for the provided [CPointer].
     */
    public class AuthImpl(pointer: CPointer<SoupAuth>) : Auth(pointer)

    public companion object : TypeCompanion<Auth> {
        override val type: GeneratedClassKGType<Auth> =
            GeneratedClassKGType(soup_auth_get_type()) { AuthImpl(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of Auth
         *
         * @return the GType
         */
        public fun getType(): GType = soup_auth_get_type()
    }
}
