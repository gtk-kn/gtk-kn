// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.TlsCertificate
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_2
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_34
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
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
public class Credential(pointer: CPointer<WebKitCredential>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<WebKitCredential> = pointer

    /**
     * Make a copy of the #WebKitCredential.
     *
     * @return A copy of passed in #WebKitCredential
     * @since 2.2
     */
    @WebKitVersion2_2
    public fun copy(): Credential = webkit_credential_copy(gPointer.reinterpret())!!.run {
        Credential(reinterpret())
    }

    /**
     * Free the #WebKitCredential.
     *
     * @since 2.2
     */
    @WebKitVersion2_2
    public fun free(): Unit = webkit_credential_free(gPointer.reinterpret())

    /**
     * Get the certificate currently held by this #WebKitCredential.
     *
     * @return a #GTlsCertificate, or null
     * @since 2.34
     */
    @WebKitVersion2_34
    public fun getCertificate(): TlsCertificate = webkit_credential_get_certificate(gPointer.reinterpret())!!.run {
        TlsCertificate(reinterpret())
    }

    /**
     * Get the password currently held by this #WebKitCredential.
     *
     * @return The password stored in the #WebKitCredential.
     * @since 2.2
     */
    @WebKitVersion2_2
    public fun getPassword(): String =
        webkit_credential_get_password(gPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Get the persistence mode currently held by this #WebKitCredential.
     *
     * @return The #WebKitCredentialPersistence stored in the #WebKitCredential.
     * @since 2.2
     */
    @WebKitVersion2_2
    public fun getPersistence(): CredentialPersistence = webkit_credential_get_persistence(gPointer.reinterpret()).run {
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
        webkit_credential_get_username(gPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Determine whether this credential has a password stored.
     *
     * @return true if the credential has a password or false otherwise.
     * @since 2.2
     */
    @WebKitVersion2_2
    public fun hasPassword(): Boolean = webkit_credential_has_password(gPointer.reinterpret()).asBoolean()

    public companion object {
        /**
         * Create a new credential from the provided username, password and persistence mode.
         *
         * @param username The username for the new credential
         * @param password The password for the new credential
         * @param persistence The #WebKitCredentialPersistence of the new credential
         * @return A #WebKitCredential.
         * @since 2.2
         */
        public fun new(username: String, password: String, persistence: CredentialPersistence): Credential =
            Credential(webkit_credential_new(username, password, persistence.nativeValue)!!.reinterpret())

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
        public fun newForCertificate(
            certificate: TlsCertificate? = null,
            persistence: CredentialPersistence,
        ): Credential = Credential(
            webkit_credential_new_for_certificate(
                certificate?.gioTlsCertificatePointer?.reinterpret(),
                persistence.nativeValue
            )!!.reinterpret()
        )

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
        public fun newForCertificatePin(pin: String, persistence: CredentialPersistence): Credential =
            Credential(webkit_credential_new_for_certificate_pin(pin, persistence.nativeValue)!!.reinterpret())

        /**
         * Get the GType of Credential
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_credential_get_type()
    }
}
