// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GTlsChannelBindingType
import org.gtkkn.native.gio.GTlsChannelBindingType.G_TLS_CHANNEL_BINDING_TLS_SERVER_END_POINT
import org.gtkkn.native.gio.GTlsChannelBindingType.G_TLS_CHANNEL_BINDING_TLS_UNIQUE

/**
 * The type of TLS channel binding data to retrieve from #GTlsConnection
 * or #GDtlsConnection, as documented by RFC 5929. The
 * [`tls-unique-for-telnet`](https://tools.ietf.org/html/rfc5929#section-5)
 * binding type is not currently implemented.
 * @since 2.66
 */
public enum class TlsChannelBindingType(
    public val nativeValue: GTlsChannelBindingType,
) {
    /**
     * [`tls-unique`](https://tools.ietf.org/html/rfc5929#section-3) binding
     *    type
     */
    UNIQUE(G_TLS_CHANNEL_BINDING_TLS_UNIQUE),

    /**
     * [`tls-server-end-point`](https://tools.ietf.org/html/rfc5929#section-4)
     *    binding type
     */
    SERVER_END_POINT(G_TLS_CHANNEL_BINDING_TLS_SERVER_END_POINT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTlsChannelBindingType): TlsChannelBindingType =
            when (nativeValue) {
                G_TLS_CHANNEL_BINDING_TLS_UNIQUE -> UNIQUE
                G_TLS_CHANNEL_BINDING_TLS_SERVER_END_POINT -> SERVER_END_POINT
                else -> error("invalid nativeValue")
            }
    }
}
