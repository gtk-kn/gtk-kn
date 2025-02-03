// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.TlsCertificate
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_2
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_34
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitCredential
import org.gtkkn.native.webkit.webkit_credential_copy
import org.gtkkn.native.webkit.webkit_credential_free
import org.gtkkn.native.webkit.webkit_credential_get_certificate
import org.gtkkn.native.webkit.webkit_credential_get_password
import org.gtkkn.native.webkit.webkit_credential_get_persistence
import org.gtkkn.native.webkit.webkit_credential_get_type
import org.gtkkn.native.webkit.webkit_credential_get_username
import org.gtkkn.native.webkit.webkit_credential_has_password
import org.gtkkn.native.webkit.webkit_credential_new
import org.gtkkn.native.webkit.webkit_credential_new_for_certificate
import org.gtkkn.native.webkit.webkit_credential_new_for_certificate_pin
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Groups information used for user authentication.
 * @since 2.2
 */
@WebKitVersion2_2
public class Credential(public val webkitCredentialPointer: CPointer<WebKitCredential>) :
    ProxyInstance(webkitCredentialPointer) {
    /**
     * Create a new credential from the provided username, password and persistence mode.
     *
     * @param username The username for the new credential
     * @param password The password for the new credential
     * @param persistence The #WebKitCredentialPersistence of the new credential
     * @return A #WebKitCredential.
     * @since 2.2
     */
    public constructor(
        username: String,
        password: String,
        persistence: CredentialPersistence,
    ) : this(webkit_credential_new(username, password, persistence.nativeValue)!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Create a new credential from the @certificate and persistence mode.
     *
     * Note that %WEBKIT_CREDENTIAL_PERSISTENCE_PERMANENT is not supported for certificate credentials.
     *
     * @param certificate The #GTlsCertificate, or null
     * @param persistence The #WebKitCredentialPersistence of the new credential
     * @return A #WebKitCredential.
     * @since 2.34
     */
    public constructor(
        certificate: TlsCertificate? = null,
        persistence: CredentialPersistence,
    ) : this(webkit_credential_new_for_certificate(certificate?.gioTlsCertificatePointer, persistence.nativeValue)!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Create a new credential from the provided PIN and persistence mode.
     *
     * Note that %WEBKIT_CREDENTIAL_PERSISTENCE_PERMANENT is not supported for certificate pin credentials.
     *
     * @param pin The PIN for the new credential
     * @param persistence The #WebKitCredentialPersistence of the new credential
     * @return A #WebKitCredential.
     * @since 2.34
     */
    public constructor(
        pin: String,
        persistence: CredentialPersistence,
    ) : this(webkit_credential_new_for_certificate_pin(pin, persistence.nativeValue)!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Make a copy of the #WebKitCredential.
     *
     * @return A copy of passed in #WebKitCredential
     * @since 2.2
     */
    @WebKitVersion2_2
    public fun copy(): Credential = webkit_credential_copy(webkitCredentialPointer)!!.run {
        Credential(this)
    }

    /**
     * Free the #WebKitCredential.
     *
     * @since 2.2
     */
    @WebKitVersion2_2
    public fun free(): Unit = webkit_credential_free(webkitCredentialPointer)

    /**
     * Get the certificate currently held by this #WebKitCredential.
     *
     * @return a #GTlsCertificate, or null
     * @since 2.34
     */
    @WebKitVersion2_34
    public fun getCertificate(): TlsCertificate = webkit_credential_get_certificate(webkitCredentialPointer)!!.run {
        InstanceCache.get(this, true) { TlsCertificate.TlsCertificateImpl(reinterpret()) }!!
    }

    /**
     * Get the password currently held by this #WebKitCredential.
     *
     * @return The password stored in the #WebKitCredential.
     * @since 2.2
     */
    @WebKitVersion2_2
    public fun getPassword(): String =
        webkit_credential_get_password(webkitCredentialPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Get the persistence mode currently held by this #WebKitCredential.
     *
     * @return The #WebKitCredentialPersistence stored in the #WebKitCredential.
     * @since 2.2
     */
    @WebKitVersion2_2
    public fun getPersistence(): CredentialPersistence =
        webkit_credential_get_persistence(webkitCredentialPointer).run {
            CredentialPersistence.fromNativeValue(this)
        }

    /**
     * Get the username currently held by this #WebKitCredential.
     *
     * @return The username stored in the #WebKitCredential.
     * @since 2.2
     */
    @WebKitVersion2_2
    public fun getUsername(): String =
        webkit_credential_get_username(webkitCredentialPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Determine whether this credential has a password stored.
     *
     * @return true if the credential has a password or false otherwise.
     * @since 2.2
     */
    @WebKitVersion2_2
    public fun hasPassword(): Boolean = webkit_credential_has_password(webkitCredentialPointer).asBoolean()

    public companion object {
        /**
         * Get the GType of Credential
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_credential_get_type()
    }
}
