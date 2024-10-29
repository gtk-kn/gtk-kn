// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.List
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gtk.GtkAccessibleList
import org.gtkkn.native.gtk.gtk_accessible_list_get_objects
import org.gtkkn.native.gtk.gtk_accessible_list_new_from_list

/**
 * A boxed type which wraps a list of references to GtkAccessible objects.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `accessibles`: Array parameter of type Accessible is not supported
 *
 * @since 4.14
 */
public class AccessibleList(
    pointer: CPointer<GtkAccessibleList>,
) : Record {
    public val gtkAccessibleListPointer: CPointer<GtkAccessibleList> = pointer

    /**
     * Gets the list of objects this boxed type holds
     *
     * @return a shallow copy of the objects
     * @since 4.14
     */
    public fun getObjects(): List =
        gtk_accessible_list_get_objects(gtkAccessibleListPointer.reinterpret())!!.run {
            List(reinterpret())
        }

    public companion object : RecordCompanion<AccessibleList, GtkAccessibleList> {
        /**
         * Allocates a new `GtkAccessibleList`, doing a shallow copy of the
         * passed list of `GtkAccessible` instances.
         *
         * @param list a reference to a `GList` containing a list of accessible values
         * @return the list of accessible instances
         * @since 4.14
         */
        public fun newFromList(list: List): AccessibleList =
            AccessibleList(gtk_accessible_list_new_from_list(list.glibListPointer)!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): AccessibleList =
            AccessibleList(pointer.reinterpret())
    }
}
