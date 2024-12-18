// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GPtrArray
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_ptr_array_get_type
import org.gtkkn.native.gobject.guint
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * Contains the public fields of a pointer array.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `array`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array_to_extend`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array_to_extend`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `haystack`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `haystack`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - function `new`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - function `new_from_array`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - function `new_from_null_terminated_array`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `element_free_func`: DestroyNotify
 * - parameter `element_free_func`: DestroyNotify
 * - parameter `element_free_func`: DestroyNotify
 * - parameter `element_free_func`: DestroyNotify
 * - parameter `element_free_func`: DestroyNotify
 * - parameter `array`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - function `sized_new`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - parameter `array`: Array GLib.PtrArray parameter of type gpointer is not supported
 * - field `pdata`: Unsupported pointer to primitive type
 */
public class PtrArray(pointer: CPointer<GPtrArray>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val glibPtrArrayPointer: CPointer<GPtrArray> = pointer

    /**
     * number of pointers in the array
     */
    public var len: guint
        get() = glibPtrArrayPointer.pointed.len

        @UnsafeFieldSetter
        set(`value`) {
            glibPtrArrayPointer.pointed.len = value
        }

    /**
     * Allocate a new PtrArray.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GPtrArray>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to PtrArray and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GPtrArray>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new PtrArray using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GPtrArray>().ptr)

    /**
     * Allocate a new PtrArray.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param len number of pointers in the array
     */
    public constructor(len: guint) : this() {
        this.len = len
    }

    /**
     * Allocate a new PtrArray using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param len number of pointers in the array
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(len: guint, scope: AutofreeScope) : this(scope) {
        this.len = len
    }

    override fun toString(): String = "PtrArray(len=$len)"

    public companion object {
        /**
         * Get the GType of PtrArray
         *
         * @return the GType
         */
        public fun getType(): GType = g_ptr_array_get_type()
    }
}
