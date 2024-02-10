// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GArray
import kotlin.String
import kotlin.UInt

/**
 * Contains the public fields of a GArray.
 */
public class Array(
    pointer: CPointer<GArray>,
) : Record {
    public val glibArrayPointer: CPointer<GArray> = pointer

    /**
     * a pointer to the element data. The data may be moved as
     *     elements are added to the #GArray.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val `data`: String?
        get() = glibArrayPointer.pointed.data?.toKString()

    /**
     * the number of elements in the #GArray not including the
     *     possible terminating zero element.
     */
    public var len: UInt
        get() = glibArrayPointer.pointed.len
        set(`value`) {
            glibArrayPointer.pointed.len = value
        }

    public companion object : RecordCompanion<Array, GArray> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Array = Array(pointer.reinterpret())
    }
}
