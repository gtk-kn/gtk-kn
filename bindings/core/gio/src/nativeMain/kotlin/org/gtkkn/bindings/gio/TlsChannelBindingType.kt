// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_66
import org.gtkkn.native.gio.GTlsChannelBindingType
import org.gtkkn.native.gio.g_tls_channel_binding_type_get_type
import org.gtkkn.native.gobject.GType

/**
 * The type of TLS channel binding data to retrieve from #GTlsConnection
 * or #GDtlsConnection, as documented by RFC 5929 or RFC 9266. The
 * [`tls-unique-for-telnet`](https://tools.ietf.org/html/rfc5929#section-5)
 * binding type is not currently implemented.
 * @since 2.66
 */
@GioVersion2_66
public enum class TlsChannelBindingType(public val nativeValue: GTlsChannelBindingType) {
    /**
     * [`tls-unique`](https://tools.ietf.org/html/rfc5929#section-3) binding
     *    type
     */
    UNIQUE(GTlsChannelBindingType.G_TLS_CHANNEL_BINDING_TLS_UNIQUE),

    /**
     * [`tls-server-end-point`](https://tools.ietf.org/html/rfc5929#section-4)
     *    binding type
     */
    SERVER_END_POINT(GTlsChannelBindingType.G_TLS_CHANNEL_BINDING_TLS_SERVER_END_POINT),

    /**
     * [`tls-exporter`](https://www.rfc-editor.org/rfc/rfc9266.html) binding
     *    type. Since: 2.74
     */
    EXPORTER(GTlsChannelBindingType.G_TLS_CHANNEL_BINDING_TLS_EXPORTER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTlsChannelBindingType): TlsChannelBindingType = when (nativeValue) {
            GTlsChannelBindingType.G_TLS_CHANNEL_BINDING_TLS_UNIQUE -> UNIQUE
            GTlsChannelBindingType.G_TLS_CHANNEL_BINDING_TLS_SERVER_END_POINT -> SERVER_END_POINT
            GTlsChannelBindingType.G_TLS_CHANNEL_BINDING_TLS_EXPORTER -> EXPORTER
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of TlsChannelBindingType
         *
         * @return the GType
         */
        public fun getType(): GType = g_tls_channel_binding_type_get_type()
    }
}
