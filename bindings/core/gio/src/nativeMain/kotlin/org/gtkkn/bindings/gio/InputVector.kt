// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gio.GInputVector
import kotlin.ULong

/**
 * Structure used for scatter/gather data input.
 * You generally pass in an array of #GInputVectors
 * and the operation will store the read data starting in the
 * first buffer, switching to the next as needed.
 *
 * ## Skipped during bindings generation
 *
 * - field `buffer`: gpointer
 *
 * @since 2.22
 */
@GioVersion2_22
public class InputVector(
    pointer: CPointer<GInputVector>,
) : Record {
    public val gioInputVectorPointer: CPointer<GInputVector> = pointer

    /**
     * the available size in @buffer.
     */
    public var size: ULong
        get() = gioInputVectorPointer.pointed.size
        set(`value`) {
            gioInputVectorPointer.pointed.size = value
        }

    public companion object : RecordCompanion<InputVector, GInputVector> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): InputVector =
            InputVector(pointer.reinterpret())
    }
}
