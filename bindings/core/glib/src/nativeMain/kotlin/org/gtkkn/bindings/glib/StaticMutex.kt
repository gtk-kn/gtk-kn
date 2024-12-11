// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GStaticMutex
import org.gtkkn.native.glib.g_static_mutex_free
import org.gtkkn.native.glib.g_static_mutex_init
import kotlin.Pair
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A #GStaticMutex works like a #GMutex.
 *
 * Prior to GLib 2.32, GStaticMutex had the significant advantage
 * that it doesn't need to be created at run-time, but can be defined
 * at compile-time. Since 2.32, #GMutex can be statically allocated
 * as well, and GStaticMutex has been deprecated.
 *
 * Here is a version of our give_me_next_number() example using
 * a GStaticMutex:
 * |[
 *   int
 *   give_me_next_number (void)
 *   {
 *     static int current_number = 0;
 *     int ret_val;
 *     static GStaticMutex mutex = G_STATIC_MUTEX_INIT;
 *
 *     g_static_mutex_lock (&mutex);
 *     ret_val = current_number = calc_next_number (current_number);
 *     g_static_mutex_unlock (&mutex);
 *
 *     return ret_val;
 *   }
 * ]|
 *
 * Sometimes you would like to dynamically create a mutex. If you don't
 * want to require prior calling to g_thread_init(), because your code
 * should also be usable in non-threaded programs, you are not able to
 * use g_mutex_new() and thus #GMutex, as that requires a prior call to
 * g_thread_init(). In these cases you can also use a #GStaticMutex.
 * It must be initialized with g_static_mutex_init() before using it
 * and freed with with g_static_mutex_free() when not needed anymore to
 * free up any allocated resources.
 *
 * Even though #GStaticMutex is not opaque, it should only be used with
 * the following functions, as it is defined differently on different
 * platforms.
 *
 * All of the g_static_mutex_* functions apart from
 * g_static_mutex_get_mutex() can also be used even if g_thread_init()
 * has not yet been called. Then they do nothing, apart from
 * g_static_mutex_trylock() which does nothing but returning true.
 *
 * All of the g_static_mutex_* functions are actually macros. Apart from
 * taking their addresses, you can however use them as if they were
 * functions.
 *
 * ## Skipped during bindings generation
 *
 * - method `get_mutex_impl`: Return type Mutex is unsupported
 * - field `mutex`: Mutex
 */
public class StaticMutex(pointer: CPointer<GStaticMutex>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val glibStaticMutexPointer: CPointer<GStaticMutex> = pointer

    /**
     * Allocate a new StaticMutex.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GStaticMutex>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to StaticMutex and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GStaticMutex>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new StaticMutex using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GStaticMutex>().ptr)

    /**
     * Releases all resources allocated to @mutex.
     *
     * You don't have to call this functions for a #GStaticMutex with an
     * unbounded lifetime, i.e. objects declared 'static', but if you have
     * a #GStaticMutex as a member of a structure and the structure is
     * freed, you should also free the #GStaticMutex.
     *
     * Calling g_static_mutex_free() on a locked mutex may result in
     * undefined behaviour.
     */
    public fun free(): Unit = g_static_mutex_free(glibStaticMutexPointer.reinterpret())

    /**
     * Initializes @mutex.
     * Alternatively you can initialize it with %G_STATIC_MUTEX_INIT.
     */
    public fun `init`(): Unit = g_static_mutex_init(glibStaticMutexPointer.reinterpret())
}
