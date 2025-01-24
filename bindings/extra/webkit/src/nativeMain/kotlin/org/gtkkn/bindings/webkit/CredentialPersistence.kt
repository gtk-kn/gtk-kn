// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_2
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitCredentialPersistence
import org.gtkkn.native.webkit.webkit_credential_persistence_get_type

/**
 * Enum values representing the duration for which a credential persists.
 * @since 2.2
 */
@WebKitVersion2_2
public enum class CredentialPersistence(public val nativeValue: WebKitCredentialPersistence) {
    /**
     * Credential does not persist
     */
    NONE(WebKitCredentialPersistence.WEBKIT_CREDENTIAL_PERSISTENCE_NONE),

    /**
     * Credential persists for session only
     */
    FOR_SESSION(WebKitCredentialPersistence.WEBKIT_CREDENTIAL_PERSISTENCE_FOR_SESSION),

    /**
     * Credential persists permanently
     */
    PERMANENT(WebKitCredentialPersistence.WEBKIT_CREDENTIAL_PERSISTENCE_PERMANENT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitCredentialPersistence): CredentialPersistence =
            when (nativeValue) {
                WebKitCredentialPersistence.WEBKIT_CREDENTIAL_PERSISTENCE_NONE -> NONE
                WebKitCredentialPersistence.WEBKIT_CREDENTIAL_PERSISTENCE_FOR_SESSION -> FOR_SESSION
                WebKitCredentialPersistence.WEBKIT_CREDENTIAL_PERSISTENCE_PERMANENT -> PERMANENT
                else -> error("invalid nativeValue")
            }

        /**
         * Get the GType of CredentialPersistence
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_credential_persistence_get_type()
    }
}
