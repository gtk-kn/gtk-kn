// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gtk.GtkTreeIter
import org.gtkkn.native.gtk.gtk_tree_iter_copy
import org.gtkkn.native.gtk.gtk_tree_iter_free
import kotlin.Int
import kotlin.Unit

/**
 * The `GtkTreeIter` is the primary structure
 * for accessing a `GtkTreeModel`. Models are expected to put a unique
 * integer in the @stamp member, and put
 * model-specific data in the three @user_data
 * members.
 *
 * ## Skipped during bindings generation
 *
 * - field `user_data`: gpointer
 * - field `user_data2`: gpointer
 * - field `user_data3`: gpointer
 */
public class TreeIter(
    pointer: CPointer<GtkTreeIter>,
) : Record {
    public val gtkTreeIterPointer: CPointer<GtkTreeIter> = pointer

    /**
     * a unique stamp to catch invalid iterators
     */
    public var stamp: Int
        get() = gtkTreeIterPointer.pointed.stamp
        set(`value`) {
            gtkTreeIterPointer.pointed.stamp = value
        }

    /**
     * Creates a dynamically allocated tree iterator as a copy of @iter.
     *
     * This function is not intended for use in applications,
     * because you can just copy the structs by value
     * (`GtkTreeIter new_iter = iter;`).
     * You must free this iter with gtk_tree_iter_free().
     *
     * @return a newly-allocated copy of @iter
     */
    public fun copy(): TreeIter =
        gtk_tree_iter_copy(gtkTreeIterPointer.reinterpret())!!.run {
            TreeIter(reinterpret())
        }

    /**
     * Frees an iterator that has been allocated by gtk_tree_iter_copy().
     *
     * This function is mainly used for language bindings.
     */
    public fun free(): Unit = gtk_tree_iter_free(gtkTreeIterPointer.reinterpret())

    public companion object : RecordCompanion<TreeIter, GtkTreeIter> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): TreeIter = TreeIter(pointer.reinterpret())
    }
}
