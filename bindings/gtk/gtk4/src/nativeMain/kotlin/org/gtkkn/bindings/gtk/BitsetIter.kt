// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkBitsetIter
import org.gtkkn.native.gtk.gtk_bitset_iter_get_type
import org.gtkkn.native.gtk.gtk_bitset_iter_get_value
import org.gtkkn.native.gtk.gtk_bitset_iter_is_valid
import kotlin.Boolean
import kotlin.Pair
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * An opaque, stack-allocated struct for iterating
 * over the elements of a `GtkBitset`.
 *
 * Before a `GtkBitsetIter` can be used, it needs to be initialized with
 * [func@Gtk.BitsetIter.init_first], [func@Gtk.BitsetIter.init_last]
 * or [func@Gtk.BitsetIter.init_at].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `value`: value: Out parameter is not supported
 * - parameter `value`: value: Out parameter is not supported
 * - parameter `value`: value: Out parameter is not supported
 * - parameter `value`: value: Out parameter is not supported
 * - parameter `value`: value: Out parameter is not supported
 */
public class BitsetIter(public val gtkBitsetIterPointer: CPointer<GtkBitsetIter>, cleaner: Cleaner? = null) :
    ProxyInstance(gtkBitsetIterPointer) {
    /**
     * Allocate a new BitsetIter.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GtkBitsetIter>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to BitsetIter and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GtkBitsetIter>, Cleaner>,
    ) : this(gtkBitsetIterPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new BitsetIter using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GtkBitsetIter>().ptr)

    /**
     * Gets the current value that @iter points to.
     *
     * If @iter is not valid and [method@Gtk.BitsetIter.is_valid]
     * returns false, this function returns 0.
     *
     * @return The current value pointer to by @iter
     */
    public fun getValue(): guint = gtk_bitset_iter_get_value(gtkBitsetIterPointer)

    /**
     * Checks if @iter points to a valid value.
     *
     * @return true if @iter points to a valid value
     */
    public fun isValid(): Boolean = gtk_bitset_iter_is_valid(gtkBitsetIterPointer).asBoolean()

    public companion object {
        /**
         * Get the GType of BitsetIter
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_bitset_iter_get_type()
    }
}
