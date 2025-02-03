// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GRelation
import org.gtkkn.native.glib.g_relation_count
import org.gtkkn.native.glib.g_relation_delete
import org.gtkkn.native.glib.g_relation_destroy
import org.gtkkn.native.glib.g_relation_new
import org.gtkkn.native.glib.g_relation_print
import org.gtkkn.native.glib.g_relation_select
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import kotlin.Unit

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 2.26.
 *
 * Rarely used API
 * ---
 *
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
 */
public class Relation(public val glibRelationPointer: CPointer<GRelation>) : ProxyInstance(glibRelationPointer) {
    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.26.
     *
     * Rarely used API
     * ---
     *
     * Returns the number of tuples in a #GRelation that have the given
     * value in the given field.
     *
     * @param key the value to compare with.
     * @param field the field of each record to match.
     * @return the number of matches.
     */
    public fun count(key: gpointer? = null, `field`: gint): gint = g_relation_count(glibRelationPointer, key, `field`)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.26.
     *
     * Rarely used API
     * ---
     *
     * Deletes any records from a #GRelation that have the given key value
     * in the given field.
     *
     * @param key the value to compare with.
     * @param field the field of each record to match.
     * @return the number of records deleted.
     */
    public fun delete(key: gpointer? = null, `field`: gint): gint = g_relation_delete(glibRelationPointer, key, `field`)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.26.
     *
     * Rarely used API
     * ---
     *
     * Destroys the #GRelation, freeing all memory allocated. However, it
     * does not free memory allocated for the tuple data, so you should
     * free that first if appropriate.
     */
    public fun destroy(): Unit = g_relation_destroy(glibRelationPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.26.
     *
     * Rarely used API
     * ---
     *
     * Outputs information about all records in a #GRelation, as well as
     * the indexes. It is for debugging.
     */
    public fun print(): Unit = g_relation_print(glibRelationPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.26.
     *
     * Rarely used API
     * ---
     *
     * Returns all of the tuples which have the given key in the given
     * field. Use g_tuples_index() to access the returned records. The
     * returned records should be freed with g_tuples_destroy().
     *
     * @param key the value to compare with.
     * @param field the field of each record to match.
     * @return the records (tuples) that matched.
     */
    public fun select(key: gpointer? = null, `field`: gint): Tuples =
        g_relation_select(glibRelationPointer, key, `field`)!!.run {
            Tuples(this)
        }

    public companion object {
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 2.26.
         *
         * Rarely used API
         * ---
         *
         * Creates a new #GRelation with the given number of fields. Note that
         * currently the number of fields must be 2.
         *
         * @param fields the number of fields.
         * @return a new #GRelation.
         */
        public fun new(fields: gint): Relation = g_relation_new(fields)!!.run {
            Relation(this)
        }
    }
}
