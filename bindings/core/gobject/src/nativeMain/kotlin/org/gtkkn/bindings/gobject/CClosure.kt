// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.GCClosure
import kotlin.Pair
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A #GCClosure is a specialization of #GClosure for C function callbacks.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `invocation_hint`: gpointer
 * - parameter `args`: va_list
 * - parameter `invocation_hint`: gpointer
 * - parameter `args`: va_list
 * - parameter `invocation_hint`: gpointer
 * - parameter `args`: va_list
 * - parameter `invocation_hint`: gpointer
 * - parameter `args`: va_list
 * - parameter `invocation_hint`: gpointer
 * - parameter `args`: va_list
 * - parameter `invocation_hint`: gpointer
 * - parameter `args`: va_list
 * - parameter `invocation_hint`: gpointer
 * - parameter `args`: va_list
 * - parameter `invocation_hint`: gpointer
 * - parameter `args`: va_list
 * - parameter `invocation_hint`: gpointer
 * - parameter `args`: va_list
 * - parameter `invocation_hint`: gpointer
 * - parameter `args`: va_list
 * - parameter `invocation_hint`: gpointer
 * - parameter `args`: va_list
 * - parameter `invocation_hint`: gpointer
 * - parameter `args`: va_list
 * - parameter `invocation_hint`: gpointer
 * - parameter `args`: va_list
 * - parameter `invocation_hint`: gpointer
 * - parameter `args`: va_list
 * - parameter `invocation_hint`: gpointer
 * - parameter `args`: va_list
 * - parameter `invocation_hint`: gpointer
 * - parameter `args`: va_list
 * - parameter `invocation_hint`: gpointer
 * - parameter `args`: va_list
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `args`: va_list
 * - parameter `args`: va_list
 * - parameter `invocation_hint`: gpointer
 * - parameter `args`: va_list
 * - parameter `invocation_hint`: gpointer
 * - parameter `args`: va_list
 * - parameter `invocation_hint`: gpointer
 * - parameter `args`: va_list
 * - parameter `invocation_hint`: gpointer
 * - parameter `args_list`: va_list
 * - parameter `destroy_data`: ClosureNotify
 * - parameter `callback_func`: Callback
 * - parameter `callback_func`: Callback
 * - parameter `destroy_data`: ClosureNotify
 * - field `closure`: Closure
 * - field `callback`: gpointer
 */
public class CClosure(pointer: CPointer<GCClosure>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gobjectCClosurePointer: CPointer<GCClosure> = pointer

    /**
     * Allocate a new CClosure.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GCClosure>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to CClosure and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GCClosure>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new CClosure using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GCClosure>().ptr)
}
