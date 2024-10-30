// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GTlsPassword
import org.gtkkn.native.gio.g_tls_password_get_description
import org.gtkkn.native.gio.g_tls_password_get_flags
import org.gtkkn.native.gio.g_tls_password_get_type
import org.gtkkn.native.gio.g_tls_password_get_warning
import org.gtkkn.native.gio.g_tls_password_new
import org.gtkkn.native.gio.g_tls_password_set_description
import org.gtkkn.native.gio.g_tls_password_set_flags
import org.gtkkn.native.gio.g_tls_password_set_warning
import kotlin.String
import kotlin.Unit

/**
 * An abstract interface representing a password used in TLS. Often used in
 * user interaction such as unlocking a key storage token.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `value`: guint8
 * - parameter `value`: guint8
 *
 * @since 2.30
 */
public open class TlsPassword(
    pointer: CPointer<GTlsPassword>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gioTlsPasswordPointer: CPointer<GTlsPassword>
        get() = gPointer.reinterpret()

    /**
     * Description of what the password is for.
     *
     * @since 2.30
     */
    public open var description: String
        /**
         * Get a description string about what the password will be used for.
         *
         * @return The description of the password.
         * @since 2.30
         */
        get() =
            g_tls_password_get_description(gioTlsPasswordPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Set a description string about what the password will be used for.
         *
         * @param description The description of the password
         * @since 2.30
         */
        set(description) = g_tls_password_set_description(gioTlsPasswordPointer.reinterpret(), description)

    /**
     * Flags about the password.
     *
     * @since 2.30
     */
    public open var flags: TlsPasswordFlags
        /**
         * Get flags about the password.
         *
         * @return The flags about the password.
         * @since 2.30
         */
        get() =
            g_tls_password_get_flags(gioTlsPasswordPointer.reinterpret()).run {
                TlsPasswordFlags(this)
            }

        /**
         * Set flags about the password.
         *
         * @param flags The flags about the password
         * @since 2.30
         */
        set(flags) = g_tls_password_set_flags(gioTlsPasswordPointer.reinterpret(), flags.mask)

    /**
     * Warning about the password.
     *
     * @since 2.30
     */
    public open var warning: String
        /**
         * Get a user readable translated warning. Usually this warning is a
         * representation of the password flags returned from
         * g_tls_password_get_flags().
         *
         * @return The warning.
         * @since 2.30
         */
        get() =
            g_tls_password_get_warning(gioTlsPasswordPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Set a user readable translated warning. Usually this warning is a
         * representation of the password flags returned from
         * g_tls_password_get_flags().
         *
         * @param warning The user readable warning
         * @since 2.30
         */
        set(warning) = g_tls_password_set_warning(gioTlsPasswordPointer.reinterpret(), warning)

    /**
     * Create a new #GTlsPassword object.
     *
     * @param flags the password flags
     * @param description description of what the password is for
     * @return The newly allocated password object
     */
    public constructor(
        flags: TlsPasswordFlags,
        description: String,
    ) : this(g_tls_password_new(flags.mask, description)!!.reinterpret())

    /**
     * Get a description string about what the password will be used for.
     *
     * @return The description of the password.
     * @since 2.30
     */
    public open fun getDescription(): String =
        g_tls_password_get_description(gioTlsPasswordPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Get flags about the password.
     *
     * @return The flags about the password.
     * @since 2.30
     */
    public open fun getFlags(): TlsPasswordFlags =
        g_tls_password_get_flags(gioTlsPasswordPointer.reinterpret()).run {
            TlsPasswordFlags(this)
        }

    /**
     * Get a user readable translated warning. Usually this warning is a
     * representation of the password flags returned from
     * g_tls_password_get_flags().
     *
     * @return The warning.
     * @since 2.30
     */
    public open fun getWarning(): String =
        g_tls_password_get_warning(gioTlsPasswordPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Set a description string about what the password will be used for.
     *
     * @param description The description of the password
     * @since 2.30
     */
    public open fun setDescription(description: String): Unit =
        g_tls_password_set_description(gioTlsPasswordPointer.reinterpret(), description)

    /**
     * Set flags about the password.
     *
     * @param flags The flags about the password
     * @since 2.30
     */
    public open fun setFlags(flags: TlsPasswordFlags): Unit =
        g_tls_password_set_flags(gioTlsPasswordPointer.reinterpret(), flags.mask)

    /**
     * Set a user readable translated warning. Usually this warning is a
     * representation of the password flags returned from
     * g_tls_password_get_flags().
     *
     * @param warning The user readable warning
     * @since 2.30
     */
    public open fun setWarning(warning: String): Unit =
        g_tls_password_set_warning(gioTlsPasswordPointer.reinterpret(), warning)

    public companion object : TypeCompanion<TlsPassword> {
        override val type: GeneratedClassKGType<TlsPassword> =
            GeneratedClassKGType(g_tls_password_get_type()) { TlsPassword(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }
    }
}
