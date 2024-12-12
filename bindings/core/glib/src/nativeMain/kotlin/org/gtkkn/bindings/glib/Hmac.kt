// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GHmac
import org.gtkkn.native.glib.g_hmac_copy
import org.gtkkn.native.glib.g_hmac_get_string
import org.gtkkn.native.glib.g_hmac_ref
import org.gtkkn.native.glib.g_hmac_unref
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_hmac_get_type
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - parameter `buffer`: Unsupported pointer to primitive type
 * - parameter `data`: Unsupported pointer to primitive type
 * - parameter `key`: Unsupported pointer to primitive type
 */
public class Hmac(pointer: CPointer<GHmac>) : ProxyInstance(pointer) {
    public val glibHmacPointer: CPointer<GHmac> = pointer

    public fun copy(): Hmac = g_hmac_copy(glibHmacPointer.reinterpret())!!.run {
        Hmac(reinterpret())
    }

    public fun getString(): String =
        g_hmac_get_string(glibHmacPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    public fun ref(): Hmac = g_hmac_ref(glibHmacPointer.reinterpret())!!.run {
        Hmac(reinterpret())
    }

    public fun unref(): Unit = g_hmac_unref(glibHmacPointer.reinterpret())

    public companion object {
        /**
         * Get the GType of Hmac
         *
         * @return the GType
         */
        public fun getType(): GType = g_hmac_get_type()
    }
}
