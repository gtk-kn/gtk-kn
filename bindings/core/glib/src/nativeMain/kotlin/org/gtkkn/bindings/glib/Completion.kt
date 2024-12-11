// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GCompletion
import org.gtkkn.native.glib.g_completion_add_items
import org.gtkkn.native.glib.g_completion_clear_items
import org.gtkkn.native.glib.g_completion_free
import org.gtkkn.native.glib.g_completion_remove_items
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

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
 * - parameter `new_prefix`: Unsupported string with cType gchar**
 * - parameter `strncmp_func`: CompletionStrncmpFunc
 * - parameter `func`: CompletionFunc
 * - field `func`: CompletionFunc
 * - field `strncmp_func`: CompletionStrncmpFunc
 */
public class Completion(pointer: CPointer<GCompletion>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val glibCompletionPointer: CPointer<GCompletion> = pointer

    /**
     * list of target items (strings or data structures).
     */
    public var items: List?
        get() = glibCompletionPointer.pointed.items?.run {
            List(reinterpret())
        }

        @UnsafeFieldSetter
        set(`value`) {
            glibCompletionPointer.pointed.items = value?.glibListPointer
        }

    /**
     * the last prefix passed to g_completion_complete() or
     *          g_completion_complete_utf8().
     */
    public var prefix: String?
        get() = glibCompletionPointer.pointed.prefix?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            glibCompletionPointer.pointed.prefix?.let { g_free(it) }
            glibCompletionPointer.pointed.prefix = value?.let { g_strdup(it) }
        }

    /**
     * the list of items which begin with @prefix.
     */
    public var cache: List?
        get() = glibCompletionPointer.pointed.cache?.run {
            List(reinterpret())
        }

        @UnsafeFieldSetter
        set(`value`) {
            glibCompletionPointer.pointed.cache = value?.glibListPointer
        }

    /**
     * Allocate a new Completion.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GCompletion>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Completion and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GCompletion>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Completion using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GCompletion>().ptr)

    /**
     * Allocate a new Completion.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param items list of target items (strings or data structures).
     * @param prefix the last prefix passed to g_completion_complete() or
     *          g_completion_complete_utf8().
     * @param cache the list of items which begin with @prefix.
     */
    public constructor(
        items: List?,
        prefix: String?,
        cache: List?,
    ) : this() {
        this.items = items
        this.prefix = prefix
        this.cache = cache
    }

    /**
     * Allocate a new Completion using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param items list of target items (strings or data structures).
     * @param prefix the last prefix passed to g_completion_complete() or
     *          g_completion_complete_utf8().
     * @param cache the list of items which begin with @prefix.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        items: List?,
        prefix: String?,
        cache: List?,
        scope: AutofreeScope,
    ) : this(scope) {
        this.items = items
        this.prefix = prefix
        this.cache = cache
    }

    /**
     * Adds items to the #GCompletion.
     *
     * @param items the list of items to add.
     */
    public fun addItems(items: List): Unit =
        g_completion_add_items(glibCompletionPointer.reinterpret(), items.glibListPointer.reinterpret())

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

    /**
     * Removes items from a #GCompletion. The items are not freed, so if the memory
     * was dynamically allocated, free @items with g_list_free_full() after calling
     * this function.
     *
     * @param items the items to remove.
     */
    public fun removeItems(items: List): Unit =
        g_completion_remove_items(glibCompletionPointer.reinterpret(), items.glibListPointer.reinterpret())

    override fun toString(): String = "Completion(items=$items, prefix=$prefix, cache=$cache)"
}
