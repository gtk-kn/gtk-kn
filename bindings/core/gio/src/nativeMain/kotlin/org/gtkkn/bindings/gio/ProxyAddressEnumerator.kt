// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GProxyAddressEnumerator
import org.gtkkn.native.gio.g_proxy_address_enumerator_get_type
import org.gtkkn.native.gobject.GType

/**
 * `GProxyAddressEnumerator` is a wrapper around
 * [class@Gio.SocketAddressEnumerator] which takes the [class@Gio.SocketAddress]
 * instances returned by the [class@Gio.SocketAddressEnumerator]
 * and wraps them in [class@Gio.ProxyAddress] instances, using the given
 * [property@Gio.ProxyAddressEnumerator:proxy-resolver].
 *
 * This enumerator will be returned (for example, by
 * [method@Gio.SocketConnectable.enumerate]) as appropriate when a proxy is
 * configured; there should be no need to manually wrap a
 * [class@Gio.SocketAddressEnumerator] instance with one.
 *
 * ## Skipped during bindings generation
 *
 * - method `connectable`: Property has no getter nor setter
 * - method `default-port`: Property has no getter nor setter
 * - method `proxy-resolver`: Property has no getter nor setter
 * - method `uri`: Property has no getter nor setter
 */
public open class ProxyAddressEnumerator(
    public val gioProxyAddressEnumeratorPointer: CPointer<GProxyAddressEnumerator>,
) : SocketAddressEnumerator(gioProxyAddressEnumeratorPointer.reinterpret()),
    KGTyped {
    public companion object : TypeCompanion<ProxyAddressEnumerator> {
        override val type: GeneratedClassKGType<ProxyAddressEnumerator> =
            GeneratedClassKGType(g_proxy_address_enumerator_get_type()) { ProxyAddressEnumerator(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of ProxyAddressEnumerator
         *
         * @return the GType
         */
        public fun getType(): GType = g_proxy_address_enumerator_get_type()
    }
}
