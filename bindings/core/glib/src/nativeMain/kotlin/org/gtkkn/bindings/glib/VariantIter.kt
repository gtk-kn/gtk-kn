// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.glib.annotations.GLibVersion2_24
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GVariantIter
import org.gtkkn.native.glib.g_variant_iter_copy
import org.gtkkn.native.glib.g_variant_iter_free
import org.gtkkn.native.glib.g_variant_iter_init
import org.gtkkn.native.glib.g_variant_iter_n_children
import org.gtkkn.native.glib.g_variant_iter_next_value
import org.gtkkn.native.glib.gsize
import kotlin.Pair
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * #GVariantIter is an opaque data structure and can only be accessed
 * using the following functions.
 *
 * ## Skipped during bindings generation
 *
 * - method `loop`: Varargs parameter is not supported
 * - method `next`: Varargs parameter is not supported
 */
public class VariantIter(pointer: CPointer<GVariantIter>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GVariantIter> = pointer

    /**
     * Allocate a new VariantIter.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GVariantIter>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to VariantIter and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GVariantIter>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new VariantIter using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GVariantIter>().ptr)

    /**
     * Creates a new heap-allocated #GVariantIter to iterate over the
     * container that was being iterated over by @iter.  Iteration begins on
     * the new iterator from the current position of the old iterator but
     * the two copies are independent past that point.
     *
     * Use g_variant_iter_free() to free the return value when you no longer
     * need it.
     *
     * A reference is taken to the container that @iter is iterating over
     * and will be related only when g_variant_iter_free() is called.
     *
     * @return a new heap-allocated #GVariantIter
     * @since 2.24
     */
    @GLibVersion2_24
    public fun copy(): VariantIter = g_variant_iter_copy(gPointer)!!.run {
        VariantIter(this)
    }

    /**
     * Frees a heap-allocated #GVariantIter.  Only call this function on
     * iterators that were returned by g_variant_iter_new() or
     * g_variant_iter_copy().
     *
     * @since 2.24
     */
    @GLibVersion2_24
    public fun free(): Unit = g_variant_iter_free(gPointer)

    /**
     * Initialises (without allocating) a #GVariantIter.  @iter may be
     * completely uninitialised prior to this call; its old value is
     * ignored.
     *
     * The iterator remains valid for as long as @value exists, and need not
     * be freed in any way.
     *
     * @param value a container #GVariant
     * @return the number of items in @value
     * @since 2.24
     */
    @GLibVersion2_24
    public fun `init`(`value`: Variant): gsize = g_variant_iter_init(gPointer, `value`.gPointer)

    /**
     * Queries the number of child items in the container that we are
     * iterating over.  This is the total number of items -- not the number
     * of items remaining.
     *
     * This function might be useful for preallocation of arrays.
     *
     * @return the number of children in the container
     * @since 2.24
     */
    @GLibVersion2_24
    public fun nChildren(): gsize = g_variant_iter_n_children(gPointer)

    /**
     * Gets the next item in the container.  If no more items remain then
     * null is returned.
     *
     * Use g_variant_unref() to drop your reference on the return value when
     * you no longer need it.
     *
     * Here is an example for iterating with g_variant_iter_next_value():
     * |[<!-- language="C" -->
     *   // recursively iterate a container
     *   void
     *   iterate_container_recursive (GVariant *container)
     *   {
     *     GVariantIter iter;
     *     GVariant *child;
     *
     *     g_variant_iter_init (&iter, container);
     *     while ((child = g_variant_iter_next_value (&iter)))
     *       {
     *         g_print ("type '%s'\n", g_variant_get_type_string (child));
     *
     *         if (g_variant_is_container (child))
     *           iterate_container_recursive (child);
     *
     *         g_variant_unref (child);
     *       }
     *   }
     * ]|
     *
     * @return a #GVariant, or null
     * @since 2.24
     */
    @GLibVersion2_24
    public fun nextValue(): Variant? = g_variant_iter_next_value(gPointer)?.run {
        Variant(this)
    }
}
