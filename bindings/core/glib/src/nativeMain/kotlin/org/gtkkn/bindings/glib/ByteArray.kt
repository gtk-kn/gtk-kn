// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GByteArray
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_byte_array_get_type
import org.gtkkn.native.gobject.guint
import kotlinx.cinterop.alloc as nativePlacementAlloc

/**
 * Contains the public fields of a GByteArray.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `array`: Array parameter of type guint8 is not supported
 * - parameter `array`: Array parameter of type guint8 is not supported
 * - parameter `array`: Array parameter of type guint8 is not supported
 * - function `new`: Array parameter of type guint8 is not supported
 * - parameter `data`: Array parameter of type guint8 is not supported
 * - parameter `array`: Array parameter of type guint8 is not supported
 * - parameter `array`: Array parameter of type guint8 is not supported
 * - parameter `array`: Array parameter of type guint8 is not supported
 * - parameter `array`: Array parameter of type guint8 is not supported
 * - parameter `array`: Array parameter of type guint8 is not supported
 * - parameter `array`: Array parameter of type guint8 is not supported
 * - function `sized_new`: Array parameter of type guint8 is not supported
 * - parameter `array`: Array parameter of type guint8 is not supported
 * - parameter `array`: Array parameter of type guint8 is not supported
 * - parameter `array`: Array parameter of type guint8 is not supported
 * - parameter `array`: Array parameter of type guint8 is not supported
 * - field `data`: Unsupported pointer to primitive type
 */
public class ByteArray(
    pointer: CPointer<GByteArray>,
) : Record {
    public val glibByteArrayPointer: CPointer<GByteArray> = pointer

    /**
     * the number of elements in the #GByteArray
     */
    public var len: guint
        get() = glibByteArrayPointer.pointed.len
        set(`value`) {
            glibByteArrayPointer.pointed.len = value
        }

    public companion object : RecordCompanion<ByteArray, GByteArray> {
        /**
         * Get the GType of ByteArray
         *
         * @return the GType
         */
        public fun getType(): GType = g_byte_array_get_type()

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): ByteArray = ByteArray(pointer.reinterpret())
    }
}
