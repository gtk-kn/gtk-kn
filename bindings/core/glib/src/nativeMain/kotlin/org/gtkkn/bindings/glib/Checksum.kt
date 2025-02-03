// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.annotations.GLibVersion2_16
import org.gtkkn.bindings.glib.annotations.GLibVersion2_18
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GChecksum
import org.gtkkn.native.glib.g_checksum_copy
import org.gtkkn.native.glib.g_checksum_free
import org.gtkkn.native.glib.g_checksum_get_string
import org.gtkkn.native.glib.g_checksum_new
import org.gtkkn.native.glib.g_checksum_reset
import org.gtkkn.native.glib.g_checksum_type_get_length
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_checksum_get_type
import kotlin.Long
import kotlin.String
import kotlin.Unit

/**
 * GLib provides a generic API for computing checksums (or ‘digests’)
 * for a sequence of arbitrary bytes, using various hashing algorithms
 * like MD5, SHA-1 and SHA-256. Checksums are commonly used in various
 * environments and specifications.
 *
 * To create a new `GChecksum`, use [ctor@GLib.Checksum.new]. To free
 * a `GChecksum`, use [method@GLib.Checksum.free].
 *
 * GLib supports incremental checksums using the `GChecksum` data
 * structure, by calling [method@GLib.Checksum.update] as long as there’s data
 * available and then using [method@GLib.Checksum.get_string] or
 * [method@GLib.Checksum.get_digest] to compute the checksum and return it
 * either as a string in hexadecimal form, or as a raw sequence of bytes. To
 * compute the checksum for binary blobs and nul-terminated strings in
 * one go, use the convenience functions [func@GLib.compute_checksum_for_data]
 * and [func@GLib.compute_checksum_for_string], respectively.
 *
 * ## Skipped during bindings generation
 *
 * - method `get_digest`: In/Out parameter is not supported
 * - parameter `data`: Array parameter of type guint8 is not supported
 *
 * @since 2.16
 */
@GLibVersion2_16
public class Checksum(public val glibChecksumPointer: CPointer<GChecksum>) : ProxyInstance(glibChecksumPointer) {
    /**
     * Creates a new #GChecksum, using the checksum algorithm @checksum_type.
     * If the @checksum_type is not known, null is returned.
     * A #GChecksum can be used to compute the checksum, or digest, of an
     * arbitrary binary blob, using different hashing algorithms.
     *
     * A #GChecksum works by feeding a binary blob through g_checksum_update()
     * until there is data to be checked; the digest can then be extracted
     * using g_checksum_get_string(), which will return the checksum as a
     * hexadecimal string; or g_checksum_get_digest(), which will return a
     * vector of raw bytes. Once either g_checksum_get_string() or
     * g_checksum_get_digest() have been called on a #GChecksum, the checksum
     * will be closed and it won't be possible to call g_checksum_update()
     * on it anymore.
     *
     * @param checksumType the desired type of checksum
     * @return the newly created #GChecksum, or null.
     *   Use g_checksum_free() to free the memory allocated by it.
     * @since 2.16
     */
    public constructor(checksumType: ChecksumType) : this(g_checksum_new(checksumType.nativeValue)!!.reinterpret()) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Copies a #GChecksum. If @checksum has been closed, by calling
     * g_checksum_get_string() or g_checksum_get_digest(), the copied
     * checksum will be closed as well.
     *
     * @return the copy of the passed #GChecksum. Use
     *   g_checksum_free() when finished using it.
     * @since 2.16
     */
    @GLibVersion2_16
    public fun copy(): Checksum = g_checksum_copy(glibChecksumPointer)!!.run {
        Checksum(this)
    }

    /**
     * Frees the memory allocated for @checksum.
     *
     * @since 2.16
     */
    @GLibVersion2_16
    public fun free(): Unit = g_checksum_free(glibChecksumPointer)

    /**
     * Gets the digest as a hexadecimal string.
     *
     * Once this function has been called the #GChecksum can no longer be
     * updated with g_checksum_update().
     *
     * The hexadecimal characters will be lower case.
     *
     * @return the hexadecimal representation of the checksum. The
     *   returned string is owned by the checksum and should not be modified
     *   or freed.
     * @since 2.16
     */
    @GLibVersion2_16
    public fun getString(): String =
        g_checksum_get_string(glibChecksumPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Resets the state of the @checksum back to its initial state.
     *
     * @since 2.18
     */
    @GLibVersion2_18
    public fun reset(): Unit = g_checksum_reset(glibChecksumPointer)

    public companion object {
        /**
         * Gets the length in bytes of digests of type @checksum_type
         *
         * @param checksumType a #GChecksumType
         * @return the checksum length, or -1 if @checksum_type is
         * not supported.
         * @since 2.16
         */
        @GLibVersion2_16
        public fun typeGetLength(checksumType: ChecksumType): Long =
            g_checksum_type_get_length(checksumType.nativeValue)

        /**
         * Get the GType of Checksum
         *
         * @return the GType
         */
        public fun getType(): GType = g_checksum_get_type()
    }
}
