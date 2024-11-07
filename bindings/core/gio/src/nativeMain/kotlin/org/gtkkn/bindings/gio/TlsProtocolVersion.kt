// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_70
import org.gtkkn.native.gio.GTlsProtocolVersion

/**
 * The TLS or DTLS protocol version used by a #GTlsConnection or
 * #GDtlsConnection. The integer values of these versions are sequential
 * to ensure newer known protocol versions compare greater than older
 * known versions. Any known DTLS protocol version will compare greater
 * than any SSL or TLS protocol version. The protocol version may be
 * %G_TLS_PROTOCOL_VERSION_UNKNOWN if the TLS backend supports a newer
 * protocol version that GLib does not yet know about. This means that
 * it's possible for an unknown DTLS protocol version to compare less
 * than the TLS protocol versions.
 * @since 2.70
 */
@GioVersion2_70
public enum class TlsProtocolVersion(
    public val nativeValue: GTlsProtocolVersion,
) {
    /**
     * No protocol version or unknown protocol version
     */
    UNKNOWN(GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_UNKNOWN),

    /**
     * SSL 3.0, which is insecure and should not be used
     */
    SSL_3_0(GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_SSL_3_0),

    /**
     * TLS 1.0, which is insecure and should not be used
     */
    TLS_1_0(GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_TLS_1_0),

    /**
     * TLS 1.1, which is insecure and should not be used
     */
    TLS_1_1(GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_TLS_1_1),

    /**
     * TLS 1.2, defined by [RFC 5246](https://datatracker.ietf.org/doc/html/rfc5246)
     */
    TLS_1_2(GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_TLS_1_2),

    /**
     * TLS 1.3, defined by [RFC 8446](https://datatracker.ietf.org/doc/html/rfc8446)
     */
    TLS_1_3(GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_TLS_1_3),

    /**
     * DTLS 1.0, which is insecure and should not be used
     */
    DTLS_1_0(GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_DTLS_1_0),

    /**
     * DTLS 1.2, defined by [RFC 6347](https://datatracker.ietf.org/doc/html/rfc6347)
     */
    DTLS_1_2(GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_DTLS_1_2),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTlsProtocolVersion): TlsProtocolVersion =
            when (nativeValue) {
                GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_UNKNOWN -> UNKNOWN
                GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_SSL_3_0 -> SSL_3_0
                GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_TLS_1_0 -> TLS_1_0
                GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_TLS_1_1 -> TLS_1_1
                GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_TLS_1_2 -> TLS_1_2
                GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_TLS_1_3 -> TLS_1_3
                GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_DTLS_1_0 -> DTLS_1_0
                GTlsProtocolVersion.G_TLS_PROTOCOL_VERSION_DTLS_1_2 -> DTLS_1_2
                else -> error("invalid nativeValue")
            }
    }
}
