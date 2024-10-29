// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GCompletion
import org.gtkkn.native.glib.g_completion_clear_items
import org.gtkkn.native.glib.g_completion_free
import kotlin.String
import kotlin.Unit

/**
 * `GCompletion` provides support for automatic completion of a string
 * using any group of target strings. It is typically used for file
 * name completion as is common in many UNIX shells.
 *
 * A `GCompletion` is created using [func@GLib.Completion.new]. Target items are
 * added and removed with [method@GLib.Completion.add_items],
 * [method@GLib.Completion.remove_items] and
 * [method@GLib.Completion.clear_items]. A completion attempt is requested with
 * [method@GLib.Completion.complete] or [method@GLib.Completion.complete_utf8].
 * When no longer needed, the `GCompletion` is freed with
 * [method@GLib.Completion.free].
 *
 * Items in the completion can be simple strings (e.g. filenames), or
 * pointers to arbitrary data structures. If data structures are used
 * you must provide a [type@GLib.CompletionFunc] in [func@GLib.Completion.new],
 * which retrieves the item’s string from the data structure. You can change
 * the way in which strings are compared by setting a different
 * [type@GLib.CompletionStrncmpFunc] in [method@GLib.Completion.set_compare].
 *
 * `GCompletion` has been marked as deprecated, since this API is rarely
 * used and not very actively maintained.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `new_prefix`: Unsupported string with cType gchar**
 * - field `func`: CompletionFunc
 * - field `strncmp_func`: CompletionStrncmpFunc
 */
public class Completion(
    pointer: CPointer<GCompletion>,
) : Record {
    public val glibCompletionPointer: CPointer<GCompletion> = pointer

    /**
     * list of target items (strings or data structures).
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val items: List?
        get() =
            glibCompletionPointer.pointed.items?.run {
                List(reinterpret())
            }

    /**
     * the last prefix passed to g_completion_complete() or
     *          g_completion_complete_utf8().
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val prefix: String?
        get() = glibCompletionPointer.pointed.prefix?.toKString()

    /**
     * the list of items which begin with @prefix.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val cache: List?
        get() =
            glibCompletionPointer.pointed.cache?.run {
                List(reinterpret())
            }

    /**
     * Removes all items from the #GCompletion. The items are not freed, so if the
     * memory was dynamically allocated, it should be freed after calling this
     * function.
     */
    public fun clearItems(): Unit = g_completion_clear_items(glibCompletionPointer.reinterpret())

    /**
     * Frees all memory used by the #GCompletion. The items are not freed, so if
     * the memory was dynamically allocated, it should be freed after calling this
     * function.
     */
    public fun free(): Unit = g_completion_free(glibCompletionPointer.reinterpret())

    public companion object : RecordCompanion<Completion, GCompletion> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Completion = Completion(pointer.reinterpret())
    }
}
