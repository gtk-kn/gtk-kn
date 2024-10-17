// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GList
import org.gtkkn.native.glib.g_list_pop_allocator
import kotlin.Unit

/**
 * The #GList struct is used for each element in a doubly-linked list.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `allocator`: Allocator
 * - field `data`: gpointer
 */
public class List(
    pointer: CPointer<GList>,
) : Record {
    public val glibListPointer: CPointer<GList> = pointer

    /**
     * contains the link to the next element in the list
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val next: List?
        get() =
            glibListPointer.pointed.next?.run {
                List(reinterpret())
            }

    /**
     * contains the link to the previous element in the list
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val prev: List?
        get() =
            glibListPointer.pointed.prev?.run {
                List(reinterpret())
            }

    public companion object : RecordCompanion<List, GList> {
        public fun popAllocator(): Unit = g_list_pop_allocator()

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): List = List(pointer.reinterpret())
    }
}
