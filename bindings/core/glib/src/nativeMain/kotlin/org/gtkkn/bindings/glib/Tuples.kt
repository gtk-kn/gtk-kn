// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GTuples
import org.gtkkn.native.glib.g_tuples_destroy
import kotlin.UInt
import kotlin.Unit

/**
 * The #GTuples struct is used to return records (or tuples) from the
 * #GRelation by g_relation_select(). It only contains one public
 * member - the number of records that matched. To access the matched
 * records, you must use g_tuples_index().
 *
 * ## Skipped during bindings generation
 *
 * - method `index`: Return type gpointer is unsupported
 */
public class Tuples(
    pointer: CPointer<GTuples>,
) : Record {
    public val glibTuplesPointer: CPointer<GTuples> = pointer

    /**
     * the number of records that matched.
     */
    public var len: UInt
        get() = glibTuplesPointer.pointed.len
        set(`value`) {
            glibTuplesPointer.pointed.len = value
        }

    /**
     * Frees the records which were returned by g_relation_select(). This
     * should always be called after g_relation_select() when you are
     * finished with the records. The records are not removed from the
     * #GRelation.
     */
    public fun destroy(): Unit = g_tuples_destroy(glibTuplesPointer.reinterpret())

    public companion object : RecordCompanion<Tuples, GTuples> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Tuples = Tuples(pointer.reinterpret())
    }
}
