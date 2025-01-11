// This is a generated file. Do not modify.
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupAuth
import org.gtkkn.native.soup.soup_auth_ntlm_get_type

/**
 * HTTP-based NTLM authentication.
 *
 * [class@Session]s do not support this type by default; if you want to
 * enable support for it, call [method@Session.add_feature_by_type],
 * passing %SOUP_TYPE_AUTH_NTLM.
 */
public class AuthNtlm(public val soupAuthNtlmPointer: CPointer<SoupAuth>) :
    Auth(soupAuthNtlmPointer.reinterpret()),
    KGTyped {
    public companion object : TypeCompanion<AuthNtlm> {
        override val type: GeneratedClassKGType<AuthNtlm> =
            GeneratedClassKGType(soup_auth_ntlm_get_type()) { AuthNtlm(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of AuthNTLM
         *
         * @return the GType
         */
        public fun getType(): GType = soup_auth_ntlm_get_type()
    }
}
