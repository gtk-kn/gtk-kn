// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gio.GOutputVector
import kotlin.ULong

/**
 * Structure used for scatter/gather data output.
 * You generally pass in an array of #GOutputVectors
 * and the operation will use all the buffers as if they were
 * one buffer.
 *
 * ## Skipped during bindings generation
 *
 * - field `buffer`: gpointer
 *
 * @since 2.22
 */
public class OutputVector(
    pointer: CPointer<GOutputVector>,
) : Record {
    public val gioOutputVectorPointer: CPointer<GOutputVector> = pointer

    /**
     * the size of @buffer.
     */
    public var size: ULong
        get() = gioOutputVectorPointer.pointed.size
        set(`value`) {
            gioOutputVectorPointer.pointed.size = value
        }

    public companion object : RecordCompanion<OutputVector, GOutputVector> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): OutputVector =
            OutputVector(pointer.reinterpret())
    }
}
