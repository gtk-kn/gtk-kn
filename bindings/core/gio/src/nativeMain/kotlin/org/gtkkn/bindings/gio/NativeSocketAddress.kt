// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_46
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GNativeSocketAddress
import org.gtkkn.native.gio.GSocketConnectable
import org.gtkkn.native.gio.g_native_socket_address_get_type
import org.gtkkn.native.gio.g_native_socket_address_new
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.gobject.GType

/**
 * A socket address of some unknown native type.
 *
 * This corresponds to a general `struct sockaddr` of a type not otherwise
 * handled by GLib.
 * @since 2.46
 */
@GioVersion2_46
public open class NativeSocketAddress(pointer: CPointer<GNativeSocketAddress>) :
    SocketAddress(pointer.reinterpret()),
    KGTyped {
    public val gioNativeSocketAddressPointer: CPointer<GNativeSocketAddress>
        get() = gPointer.reinterpret()

    override val gioSocketConnectablePointer: CPointer<GSocketConnectable>
        get() = gPointer.reinterpret()

    /**
     * Creates a new #GNativeSocketAddress for @native and @len.
     *
     * @param native a native address object
     * @param len the length of @native, in bytes
     * @return a new #GNativeSocketAddress
     * @since 2.46
     */
    public constructor(
        native: gpointer? = null,
        len: gsize,
    ) : this(g_native_socket_address_new(native, len)!!.reinterpret())

    public companion object : TypeCompanion<NativeSocketAddress> {
        override val type: GeneratedClassKGType<NativeSocketAddress> =
            GeneratedClassKGType(g_native_socket_address_get_type()) { NativeSocketAddress(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of NativeSocketAddress
         *
         * @return the GType
         */
        public fun getType(): GType = g_native_socket_address_get_type()
    }
}
