// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GSList

/**
 * The #GSList struct is used for each element in the singly-linked
 * list.
 *
 * ## Skipped during bindings generation
 *
 * - field `data`: gpointer
 */
public class SList(
    pointer: CPointer<GSList>,
) : Record {
    public val glibSListPointer: CPointer<GSList> = pointer

    /**
     * contains the link to the next element in the list.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val next: SList?
        get() =
            glibSListPointer.pointed.next?.run {
                SList(reinterpret())
            }

    public companion object : RecordCompanion<SList, GSList> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): SList = SList(pointer.reinterpret())
    }
}
