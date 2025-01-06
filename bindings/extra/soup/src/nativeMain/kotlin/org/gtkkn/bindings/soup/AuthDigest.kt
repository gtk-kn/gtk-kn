// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupAuth
import org.gtkkn.native.soup.soup_auth_digest_get_type

/**
 * HTTP "Digest" authentication.
 *
 * [class@Session]s support this by default; if you want to disable
 * support for it, call [method@Session.remove_feature_by_type]
 * passing %SOUP_TYPE_AUTH_DIGEST.
 */
public class AuthDigest(pointer: CPointer<SoupAuth>) :
    Auth(pointer.reinterpret()),
    KGTyped {
    public val soupAuthDigestPointer: CPointer<SoupAuth>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<AuthDigest> {
        override val type: GeneratedClassKGType<AuthDigest> =
            GeneratedClassKGType(soup_auth_digest_get_type()) { AuthDigest(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of AuthDigest
         *
         * @return the GType
         */
        public fun getType(): GType = soup_auth_digest_get_type()
    }
}
