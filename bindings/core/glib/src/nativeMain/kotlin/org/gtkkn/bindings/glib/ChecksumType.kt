// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.bindings.glib.annotations.GLibVersion2_16
import org.gtkkn.native.glib.GChecksumType

/**
 * The hashing algorithm to be used by #GChecksum when performing the
 * digest of some data.
 *
 * Note that the #GChecksumType enumeration may be extended at a later
 * date to include new hashing algorithm types.
 * @since 2.16
 */
@GLibVersion2_16
public enum class ChecksumType(public val nativeValue: GChecksumType) {
    /**
     * Use the MD5 hashing algorithm
     */
    MD5(GChecksumType.G_CHECKSUM_MD5),

    /**
     * Use the SHA-1 hashing algorithm
     */
    SHA1(GChecksumType.G_CHECKSUM_SHA1),

    /**
     * Use the SHA-256 hashing algorithm
     */
    SHA256(GChecksumType.G_CHECKSUM_SHA256),

    /**
     * Use the SHA-512 hashing algorithm (Since: 2.36)
     */
    SHA512(GChecksumType.G_CHECKSUM_SHA512),

    /**
     * Use the SHA-384 hashing algorithm (Since: 2.51)
     */
    SHA384(GChecksumType.G_CHECKSUM_SHA384),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GChecksumType): ChecksumType = when (nativeValue) {
            GChecksumType.G_CHECKSUM_MD5 -> MD5
            GChecksumType.G_CHECKSUM_SHA1 -> SHA1
            GChecksumType.G_CHECKSUM_SHA256 -> SHA256
            GChecksumType.G_CHECKSUM_SHA512 -> SHA512
            GChecksumType.G_CHECKSUM_SHA384 -> SHA384
            else -> error("invalid nativeValue")
        }
    }
}
