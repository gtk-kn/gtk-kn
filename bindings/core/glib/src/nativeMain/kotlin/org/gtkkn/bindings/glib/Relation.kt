// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GRelation
import org.gtkkn.native.glib.g_relation_count
import org.gtkkn.native.glib.g_relation_delete
import org.gtkkn.native.glib.g_relation_destroy
import org.gtkkn.native.glib.g_relation_print
import org.gtkkn.native.glib.g_relation_select
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.gobject.gint
import kotlin.Unit

/**
 * A `GRelation` is a table of data which can be indexed on any number
 * of fields, rather like simple database tables. A `GRelation` contains
 * a number of records, called tuples. Each record contains a number of
 * fields. Records are not ordered, so it is not possible to find the
 * record at a particular index.
 *
 * Note that `GRelation` tables are currently limited to 2 fields.
 *
 * To create a `GRelation`, use [func@GLib.Relation.new].
 *
 * To specify which fields should be indexed, use [method@GLib.Relation.index].
 * Note that this must be called before any tuples are added to the
 * `GRelation`.
 *
 * To add records to a `GRelation` use [method@GLib.Relation.insert].
 *
 * To determine if a given record appears in a `GRelation`, use
 * [method@GLib.Relation.exists]. Note that fields are compared directly, so
 * pointers must point to the exact same position (i.e. different
 * copies of the same string will not match.)
 *
 * To count the number of records which have a particular value in a
 * given field, use [method@GLib.Relation.count].
 *
 * To get all the records which have a particular value in a given
 * field, use [method@GLib.Relation.select]. To access fields of the resulting
 * records, use [method@GLib.Tuples.index]. To free the resulting records use
 * [method@GLib.Tuples.destroy].
 *
 * To delete all records which have a particular value in a given
 * field, use [method@GLib.Relation.delete].
 *
 * To destroy the `GRelation`, use [method@GLib.Relation.destroy].
 *
 * To help debug `GRelation` objects, use [method@GLib.Relation.print].
 *
 * `GRelation` has been marked as deprecated, since this API has never
 * been fully implemented, is not very actively maintained and rarely
 * used.
 *
 * ## Skipped during bindings generation
 *
 * - method `exists`: Varargs parameter is not supported
 * - parameter `hash_func`: HashFunc
 * - method `insert`: Varargs parameter is not supported
 * - function `new`: Return type Relation is unsupported
 */
public class Relation(pointer: CPointer<GRelation>) : ProxyInstance(pointer) {
    public val glibRelationPointer: CPointer<GRelation> = pointer

    /**
     * Returns the number of tuples in a #GRelation that have the given
     * value in the given field.
     *
     * @param key the value to compare with.
     * @param field the field of each record to match.
     * @return the number of matches.
     */
    public fun count(key: gpointer? = null, `field`: gint): gint =
        g_relation_count(glibRelationPointer.reinterpret(), key, `field`)

    /**
     * Deletes any records from a #GRelation that have the given key value
     * in the given field.
     *
     * @param key the value to compare with.
     * @param field the field of each record to match.
     * @return the number of records deleted.
     */
    public fun delete(key: gpointer? = null, `field`: gint): gint =
        g_relation_delete(glibRelationPointer.reinterpret(), key, `field`)

    /**
     * Destroys the #GRelation, freeing all memory allocated. However, it
     * does not free memory allocated for the tuple data, so you should
     * free that first if appropriate.
     */
    public fun destroy(): Unit = g_relation_destroy(glibRelationPointer.reinterpret())

    /**
     * Outputs information about all records in a #GRelation, as well as
     * the indexes. It is for debugging.
     */
    public fun print(): Unit = g_relation_print(glibRelationPointer.reinterpret())

    /**
     * Returns all of the tuples which have the given key in the given
     * field. Use g_tuples_index() to access the returned records. The
     * returned records should be freed with g_tuples_destroy().
     *
     * @param key the value to compare with.
     * @param field the field of each record to match.
     * @return the records (tuples) that matched.
     */
    public fun select(key: gpointer? = null, `field`: gint): Tuples =
        g_relation_select(glibRelationPointer.reinterpret(), key, `field`)!!.run {
            Tuples(reinterpret())
        }
}
