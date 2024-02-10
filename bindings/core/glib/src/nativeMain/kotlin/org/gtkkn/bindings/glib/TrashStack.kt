// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GTrashStack

/**
 * Each piece of memory that is pushed onto the stack
 * is cast to a GTrashStack*.
 *
 * ## Skipped during bindings generation
 *
 * - function `height`: C function g_trash_stack_height is ignored
 * - function `peek`: Return type gpointer is unsupported
 * - function `pop`: Return type gpointer is unsupported
 * - parameter `data_p`: gpointer
 */
public class TrashStack(
    pointer: CPointer<GTrashStack>,
) : Record {
    public val glibTrashStackPointer: CPointer<GTrashStack> = pointer

    /**
     * pointer to the previous element of the stack,
     *     gets stored in the first `sizeof (gpointer)`
     *     bytes of the element
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val next: TrashStack?
        get() =
            glibTrashStackPointer.pointed.next?.run {
                TrashStack(reinterpret())
            }

    public companion object : RecordCompanion<TrashStack, GTrashStack> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): TrashStack = TrashStack(pointer.reinterpret())
    }
}
