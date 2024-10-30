// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GHmac
import org.gtkkn.native.glib.g_hmac_copy
import org.gtkkn.native.glib.g_hmac_get_string
import org.gtkkn.native.glib.g_hmac_ref
import org.gtkkn.native.glib.g_hmac_unref
import kotlin.String
import kotlin.Unit

/**
 * HMACs should be used when producing a cookie or hash based on data
 * and a key. Simple mechanisms for using SHA1 and other algorithms to
 * digest a key and data together are vulnerable to various security
 * issues.
 * [HMAC](http://en.wikipedia.org/wiki/HMAC)
 * uses algorithms like SHA1 in a secure way to produce a digest of a
 * key and data.
 *
 * Both the key and data are arbitrary byte arrays of bytes or characters.
 *
 * Support for HMAC Digests has been added in GLib 2.30, and support for SHA-512
 * in GLib 2.42. Support for SHA-384 was added in GLib 2.52.
 *
 * To create a new `GHmac`, use [ctor@GLib.Hmac.new]. To free a `GHmac`, use
 * [method@GLib.Hmac.unref].
 *
 * ## Skipped during bindings generation
 *
 * - method `get_digest`: In/Out parameter is not supported
 * - parameter `data`: Array parameter of type guint8 is not supported
 * - parameter `key`: Array parameter of type guint8 is not supported
 *
 * @since 2.30
 */
public class Hmac(
    pointer: CPointer<GHmac>,
) : Record {
    public val glibHmacPointer: CPointer<GHmac> = pointer

    /**
     * Copies a #GHmac. If @hmac has been closed, by calling
     * g_hmac_get_string() or g_hmac_get_digest(), the copied
     * HMAC will be closed as well.
     *
     * @return the copy of the passed #GHmac. Use g_hmac_unref()
     *   when finished using it.
     * @since 2.30
     */
    public fun copy(): Hmac =
        g_hmac_copy(glibHmacPointer.reinterpret())!!.run {
            Hmac(reinterpret())
        }

    /**
     * Gets the HMAC as a hexadecimal string.
     *
     * Once this function has been called the #GHmac can no longer be
     * updated with g_hmac_update().
     *
     * The hexadecimal characters will be lower case.
     *
     * @return the hexadecimal representation of the HMAC. The
     *   returned string is owned by the HMAC and should not be modified
     *   or freed.
     * @since 2.30
     */
    public fun getString(): String =
        g_hmac_get_string(glibHmacPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Atomically increments the reference count of @hmac by one.
     *
     * This function is MT-safe and may be called from any thread.
     *
     * @return the passed in #GHmac.
     * @since 2.30
     */
    public fun ref(): Hmac =
        g_hmac_ref(glibHmacPointer.reinterpret())!!.run {
            Hmac(reinterpret())
        }

    /**
     * Atomically decrements the reference count of @hmac by one.
     *
     * If the reference count drops to 0, all keys and values will be
     * destroyed, and all memory allocated by the hash table is released.
     * This function is MT-safe and may be called from any thread.
     * Frees the memory allocated for @hmac.
     *
     * @since 2.30
     */
    public fun unref(): Unit = g_hmac_unref(glibHmacPointer.reinterpret())

    public companion object : RecordCompanion<Hmac, GHmac> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Hmac = Hmac(pointer.reinterpret())
    }
}
