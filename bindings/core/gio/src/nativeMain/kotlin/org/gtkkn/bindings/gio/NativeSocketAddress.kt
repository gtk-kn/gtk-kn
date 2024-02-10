// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GNativeSocketAddress
import org.gtkkn.native.gio.GSocketConnectable
import org.gtkkn.native.gio.g_native_socket_address_get_type

/**
 * A socket address of some unknown native type.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `native`: gpointer
 */
public open class NativeSocketAddress(
    pointer: CPointer<GNativeSocketAddress>,
) : SocketAddress(pointer.reinterpret()), KGTyped {
    public val gioNativeSocketAddressPointer: CPointer<GNativeSocketAddress>
        get() = gPointer.reinterpret()

    override val gioSocketConnectablePointer: CPointer<GSocketConnectable>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<NativeSocketAddress> {
        override val type: GeneratedClassKGType<NativeSocketAddress> =
            GeneratedClassKGType(g_native_socket_address_get_type()) {
                NativeSocketAddress(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }
    }
}
