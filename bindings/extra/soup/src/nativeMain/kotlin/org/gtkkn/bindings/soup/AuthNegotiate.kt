// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupAuth
import org.gtkkn.native.soup.soup_auth_negotiate_get_type
import org.gtkkn.native.soup.soup_auth_negotiate_supported
import kotlin.Boolean

/**
 * HTTP-based GSS-Negotiate authentication, as defined by
 * [RFC 4559](https://datatracker.ietf.org/doc/html/rfc4559).
 *
 * [class@Session]s do not support this type by default; if you want to
 * enable support for it, call [method@Session.add_feature_by_type],
 * passing %SOUP_TYPE_AUTH_NEGOTIATE.
 *
 * This auth type will only work if libsoup was compiled with GSSAPI
 * support; you can check [func@AuthNegotiate.supported] to see if it
 * was.
 */
public class AuthNegotiate(public val soupAuthNegotiatePointer: CPointer<SoupAuth>) :
    Auth(soupAuthNegotiatePointer.reinterpret()),
    KGTyped {
    public companion object : TypeCompanion<AuthNegotiate> {
        override val type: GeneratedClassKGType<AuthNegotiate> =
            GeneratedClassKGType(getTypeOrNull("soup_auth_negotiate_get_type")!!) {
                AuthNegotiate(it.reinterpret())
            }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Indicates whether libsoup was built with GSSAPI support.
         *
         * If this is false, %SOUP_TYPE_AUTH_NEGOTIATE will still be defined and can
         * still be added to a [class@Session], but libsoup will never attempt to
         * actually use this auth type.
         *
         * @return true if supported otherwise false
         */
        public fun supported(): Boolean = soup_auth_negotiate_supported().asBoolean()

        /**
         * Get the GType of AuthNegotiate
         *
         * @return the GType
         */
        public fun getType(): GType = soup_auth_negotiate_get_type()
    }
}
