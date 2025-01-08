// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.glib.annotations.GLibVersion2_32
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.GMutex
import org.gtkkn.native.glib.g_mutex_clear
import org.gtkkn.native.glib.g_mutex_free
import org.gtkkn.native.glib.g_mutex_init
import org.gtkkn.native.glib.g_mutex_lock
import org.gtkkn.native.glib.g_mutex_new
import org.gtkkn.native.glib.g_mutex_trylock
import org.gtkkn.native.glib.g_mutex_unlock
import kotlin.Boolean
import kotlin.Pair
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The #GMutex struct is an opaque data structure to represent a mutex
 * (mutual exclusion). It can be used to protect data against shared
 * access.
 *
 * Take for example the following function:
 * |[<!-- language="C" -->
 *   int
 *   give_me_next_number (void)
 *   {
 *     static int current_number = 0;
 *
 *     // now do a very complicated calculation to calculate the new
 *     // number, this might for example be a random number generator
 *     current_number = calc_next_number (current_number);
 *
 *     return current_number;
 *   }
 * ]|
 * It is easy to see that this won't work in a multi-threaded
 * application. There current_number must be protected against shared
 * access. A #GMutex can be used as a solution to this problem:
 * |[<!-- language="C" -->
 *   int
 *   give_me_next_number (void)
 *   {
 *     static GMutex mutex;
 *     static int current_number = 0;
 *     int ret_val;
 *
 *     g_mutex_lock (&mutex);
 *     ret_val = current_number = calc_next_number (current_number);
 *     g_mutex_unlock (&mutex);
 *
 *     return ret_val;
 *   }
 * ]|
 * Notice that the #GMutex is not initialised to any particular value.
 * Its placement in static storage ensures that it will be initialised
 * to all-zeros, which is appropriate.
 *
 * If a #GMutex is placed in other contexts (eg: embedded in a struct)
 * then it must be explicitly initialised using g_mutex_init().
 *
 * A #GMutex should only be accessed via g_mutex_ functions.
 */
public class Mutex(pointer: CPointer<GMutex>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GMutex> = pointer

    /**
     * Allocate a new Mutex.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GMutex>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Mutex and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GMutex>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Mutex using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GMutex>().ptr)

    /**
     * Frees the resources allocated to a mutex with g_mutex_init().
     *
     * This function should not be used with a #GMutex that has been
     * statically allocated.
     *
     * Calling g_mutex_clear() on a locked mutex leads to undefined
     * behaviour.
     *
     * @since 2.32
     */
    @GLibVersion2_32
    public fun clear(): Unit = g_mutex_clear(gPointer)

    /**
     * Destroys a @mutex that has been created with g_mutex_new().
     *
     * Calling g_mutex_free() on a locked mutex may result
     * in undefined behaviour.
     */
    public fun free(): Unit = g_mutex_free(gPointer)

    /**
     * Initializes a #GMutex so that it can be used.
     *
     * This function is useful to initialize a mutex that has been
     * allocated on the stack, or as part of a larger structure.
     * It is not necessary to initialize a mutex that has been
     * statically allocated.
     *
     * |[<!-- language="C" -->
     *   typedef struct {
     *     GMutex m;
     *     ...
     *   } Blob;
     *
     * Blob *b;
     *
     * b = g_new (Blob, 1);
     * g_mutex_init (&b->m);
     * ]|
     *
     * To undo the effect of g_mutex_init() when a mutex is no longer
     * needed, use g_mutex_clear().
     *
     * Calling g_mutex_init() on an already initialized #GMutex leads
     * to undefined behaviour.
     *
     * @since 2.32
     */
    @GLibVersion2_32
    public fun `init`(): Unit = g_mutex_init(gPointer)

    /**
     * Locks @mutex. If @mutex is already locked by another thread, the
     * current thread will block until @mutex is unlocked by the other
     * thread.
     *
     * #GMutex is neither guaranteed to be recursive nor to be
     * non-recursive.  As such, calling g_mutex_lock() on a #GMutex that has
     * already been locked by the same thread results in undefined behaviour
     * (including but not limited to deadlocks).
     */
    public fun lock(): Unit = g_mutex_lock(gPointer)

    /**
     * Tries to lock @mutex. If @mutex is already locked by another thread,
     * it immediately returns false. Otherwise it locks @mutex and returns
     * true.
     *
     * #GMutex is neither guaranteed to be recursive nor to be
     * non-recursive.  As such, calling g_mutex_lock() on a #GMutex that has
     * already been locked by the same thread results in undefined behaviour
     * (including but not limited to deadlocks or arbitrary return values).
     *
     * @return true if @mutex could be locked
     */
    public fun trylock(): Boolean = g_mutex_trylock(gPointer).asBoolean()

    /**
     * Unlocks @mutex. If another thread is blocked in a g_mutex_lock()
     * call for @mutex, it will become unblocked and can lock @mutex itself.
     *
     * Calling g_mutex_unlock() on a mutex that is not locked by the
     * current thread leads to undefined behaviour.
     */
    public fun unlock(): Unit = g_mutex_unlock(gPointer)

    public companion object {
        /**
         * Allocates and initializes a new #GMutex.
         *
         * @return a newly allocated #GMutex. Use g_mutex_free() to free
         */
        public fun new(): Mutex = g_mutex_new()!!.run {
            Mutex(this)
        }
    }
}
