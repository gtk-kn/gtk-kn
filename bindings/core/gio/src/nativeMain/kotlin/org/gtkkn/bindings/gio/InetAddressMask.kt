// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GInetAddressMask
import org.gtkkn.native.gio.GInitable
import org.gtkkn.native.gio.g_inet_address_mask_equal
import org.gtkkn.native.gio.g_inet_address_mask_get_address
import org.gtkkn.native.gio.g_inet_address_mask_get_family
import org.gtkkn.native.gio.g_inet_address_mask_get_length
import org.gtkkn.native.gio.g_inet_address_mask_get_type
import org.gtkkn.native.gio.g_inet_address_mask_matches
import org.gtkkn.native.gio.g_inet_address_mask_new
import org.gtkkn.native.gio.g_inet_address_mask_new_from_string
import org.gtkkn.native.gio.g_inet_address_mask_to_string
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.guint
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Throws

/**
 * `GInetAddressMask` represents a range of IPv4 or IPv6 addresses
 * described by a base address and a length indicating how many bits
 * of the base address are relevant for matching purposes. These are
 * often given in string form. For example, `10.0.0.0/8`, or `fe80::/10`.
 * @since 2.32
 */
@GioVersion2_32
public open class InetAddressMask(pointer: CPointer<GInetAddressMask>) :
    Object(pointer.reinterpret()),
    Initable,
    KGTyped {
    public val gioInetAddressMaskPointer: CPointer<GInetAddressMask>
        get() = gPointer.reinterpret()

    override val gioInitablePointer: CPointer<GInitable>
        get() = gPointer.reinterpret()

    /**
     * The base address.
     *
     * @since 2.32
     */
    @GioVersion2_32
    public open val address: InetAddress
        /**
         * Gets @mask's base address
         *
         * @return @mask's base address
         * @since 2.32
         */
        get() = g_inet_address_mask_get_address(gioInetAddressMaskPointer.reinterpret())!!.run {
            InetAddress(reinterpret())
        }

    /**
     * The address family (IPv4 or IPv6).
     *
     * @since 2.32
     */
    @GioVersion2_32
    public open val family: SocketFamily
        /**
         * Gets the #GSocketFamily of @mask's address
         *
         * @return the #GSocketFamily of @mask's address
         * @since 2.32
         */
        get() = g_inet_address_mask_get_family(gioInetAddressMaskPointer.reinterpret()).run {
            SocketFamily.fromNativeValue(this)
        }

    /**
     * The prefix length, in bytes.
     *
     * @since 2.32
     */
    @GioVersion2_32
    public open val length: guint
        /**
         * Gets @mask's length
         *
         * @return @mask's length
         * @since 2.32
         */
        get() = g_inet_address_mask_get_length(gioInetAddressMaskPointer.reinterpret())

    /**
     * Creates a new #GInetAddressMask representing all addresses whose
     * first @length bits match @addr.
     *
     * @param addr a #GInetAddress
     * @param length number of bits of @addr to use
     * @return a new #GInetAddressMask, or null on error
     * @since 2.32
     */
    @Throws(GLibException::class)
    public constructor(addr: InetAddress, length: guint) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_inet_address_mask_new(addr.gioInetAddressPointer.reinterpret(), length, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Parses @mask_string as an IP address and (optional) length, and
     * creates a new #GInetAddressMask. The length, if present, is
     * delimited by a "/". If it is not present, then the length is
     * assumed to be the full length of the address.
     *
     * @param maskString an IP address or address/length string
     * @return a new #GInetAddressMask corresponding to @string, or null
     * on error.
     * @since 2.32
     */
    @Throws(GLibException::class)
    public constructor(maskString: String) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_inet_address_mask_new_from_string(maskString, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Tests if @mask and @mask2 are the same mask.
     *
     * @param mask2 another #GInetAddressMask
     * @return whether @mask and @mask2 are the same mask
     * @since 2.32
     */
    @GioVersion2_32
    public open fun equal(mask2: InetAddressMask): Boolean = g_inet_address_mask_equal(
        gioInetAddressMaskPointer.reinterpret(),
        mask2.gioInetAddressMaskPointer.reinterpret()
    ).asBoolean()

    /**
     * Tests if @address falls within the range described by @mask.
     *
     * @param address a #GInetAddress
     * @return whether @address falls within the range described by
     * @mask.
     * @since 2.32
     */
    @GioVersion2_32
    public open fun matches(address: InetAddress): Boolean = g_inet_address_mask_matches(
        gioInetAddressMaskPointer.reinterpret(),
        address.gioInetAddressPointer.reinterpret()
    ).asBoolean()

    /**
     * Converts @mask back to its corresponding string form.
     *
     * @return a string corresponding to @mask.
     * @since 2.32
     */
    @Suppress("POTENTIALLY_NON_REPORTED_ANNOTATION")
    @GioVersion2_32
    override fun toString(): String =
        g_inet_address_mask_to_string(gioInetAddressMaskPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    public companion object : TypeCompanion<InetAddressMask> {
        override val type: GeneratedClassKGType<InetAddressMask> =
            GeneratedClassKGType(g_inet_address_mask_get_type()) { InetAddressMask(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of InetAddressMask
         *
         * @return the GType
         */
        public fun getType(): GType = g_inet_address_mask_get_type()
    }
}
