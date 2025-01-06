// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.Uri
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupAuthManager
import org.gtkkn.native.soup.SoupSessionFeature
import org.gtkkn.native.soup.soup_auth_manager_clear_cached_credentials
import org.gtkkn.native.soup.soup_auth_manager_get_type
import org.gtkkn.native.soup.soup_auth_manager_use_auth
import kotlin.Unit

/**
 * HTTP client-side authentication handler.
 *
 * #SoupAuthManager is the [iface@SessionFeature] that handles HTTP
 * authentication for a [class@Session].
 *
 * A #SoupAuthManager is added to the session by default, and normally
 * you don't need to worry about it at all. However, if you want to
 * disable HTTP authentication, you can remove the feature from the
 * session with [method@Session.remove_feature_by_type] or disable it on
 * individual requests with [method@Message.disable_feature].
 *
 * You can use this with [method@Session.remove_feature_by_type] or
 * [method@Message.disable_feature].
 *
 * (Although this type has only been publicly visible since libsoup 2.42, it has
 * always existed in the background, and you can use `g_type_from_name
 * ("SoupAuthManager")` to get its [alias@GLib.Type] in earlier releases.)
 */
public class AuthManager(pointer: CPointer<SoupAuthManager>) :
    Object(pointer.reinterpret()),
    SessionFeature,
    KGTyped {
    public val soupAuthManagerPointer: CPointer<SoupAuthManager>
        get() = gPointer.reinterpret()

    override val soupSessionFeaturePointer: CPointer<SoupSessionFeature>
        get() = gPointer.reinterpret()

    /**
     * Clear all credentials cached by @manager.
     */
    public fun clearCachedCredentials(): Unit =
        soup_auth_manager_clear_cached_credentials(soupAuthManagerPointer.reinterpret())

    /**
     * Records that @auth is to be used under @uri, as though a
     * WWW-Authenticate header had been received at that URI.
     *
     * This can be used to "preload" @manager's auth cache, to avoid an extra HTTP
     * round trip in the case where you know ahead of time that a 401 response will
     * be returned.
     *
     * This is only useful for authentication types where the initial
     * Authorization header does not depend on any additional information
     * from the server. (Eg, Basic or NTLM, but not Digest.)
     *
     * @param uri the #GUri under which @auth is to be used
     * @param auth the #SoupAuth to use
     */
    public fun useAuth(uri: Uri, auth: Auth): Unit = soup_auth_manager_use_auth(
        soupAuthManagerPointer.reinterpret(),
        uri.gPointer.reinterpret(),
        auth.soupAuthPointer.reinterpret()
    )

    public companion object : TypeCompanion<AuthManager> {
        override val type: GeneratedClassKGType<AuthManager> =
            GeneratedClassKGType(soup_auth_manager_get_type()) { AuthManager(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of AuthManager
         *
         * @return the GType
         */
        public fun getType(): GType = soup_auth_manager_get_type()
    }
}
