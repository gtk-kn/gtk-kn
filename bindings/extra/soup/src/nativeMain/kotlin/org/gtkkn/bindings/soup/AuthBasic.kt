// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SoupAuth
import org.gtkkn.native.soup.soup_auth_basic_get_type

/**
 * HTTP "Basic" authentication.
 *
 * [class@Session]s support this by default; if you want to disable
 * support for it, call [method@Session.remove_feature_by_type],
 * passing %SOUP_TYPE_AUTH_BASIC.
 */
public class AuthBasic(public val soupAuthBasicPointer: CPointer<SoupAuth>) :
    Auth(soupAuthBasicPointer.reinterpret()),
    KGTyped {
    public companion object : TypeCompanion<AuthBasic> {
        override val type: GeneratedClassKGType<AuthBasic> =
            GeneratedClassKGType(getTypeOrNull("soup_auth_basic_get_type")!!) { AuthBasic(it.reinterpret()) }

        init {
            SoupTypeProvider.register()
        }

        /**
         * Get the GType of AuthBasic
         *
         * @return the GType
         */
        public fun getType(): GType = soup_auth_basic_get_type()
    }
}
