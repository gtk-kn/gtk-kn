// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GByteArray
import kotlin.UInt

/**
 * Contains the public fields of a GByteArray.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `array`: guint8
 * - parameter `array`: guint8
 * - function `new`: guint8
 * - parameter `data`: guint8
 * - parameter `array`: guint8
 * - parameter `array`: guint8
 * - field `data`: guint8
 */
public class ByteArray(
    pointer: CPointer<GByteArray>,
) : Record {
    public val glibByteArrayPointer: CPointer<GByteArray> = pointer

    /**
     * the number of elements in the #GByteArray
     */
    public var len: UInt
        get() = glibByteArrayPointer.pointed.len
        set(`value`) {
            glibByteArrayPointer.pointed.len = value
        }

    public companion object : RecordCompanion<ByteArray, GByteArray> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): ByteArray = ByteArray(pointer.reinterpret())
    }
}
