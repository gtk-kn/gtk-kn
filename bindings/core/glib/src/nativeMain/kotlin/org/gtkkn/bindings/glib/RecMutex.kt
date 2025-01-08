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
import org.gtkkn.native.glib.GRecMutex
import org.gtkkn.native.glib.g_rec_mutex_clear
import org.gtkkn.native.glib.g_rec_mutex_init
import org.gtkkn.native.glib.g_rec_mutex_lock
import org.gtkkn.native.glib.g_rec_mutex_trylock
import org.gtkkn.native.glib.g_rec_mutex_unlock
import kotlin.Boolean
import kotlin.Pair
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The GRecMutex struct is an opaque data structure to represent a
 * recursive mutex. It is similar to a #GMutex with the difference
 * that it is possible to lock a GRecMutex multiple times in the same
 * thread without deadlock. When doing so, care has to be taken to
 * unlock the recursive mutex as often as it has been locked.
 *
 * If a #GRecMutex is allocated in static storage then it can be used
 * without initialisation.  Otherwise, you should call
 * g_rec_mutex_init() on it and g_rec_mutex_clear() when done.
 *
 * A GRecMutex should only be accessed with the
 * g_rec_mutex_ functions.
 * @since 2.32
 */
@GLibVersion2_32
public class RecMutex(pointer: CPointer<GRecMutex>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GRecMutex> = pointer

    /**
     * Allocate a new RecMutex.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GRecMutex>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to RecMutex and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GRecMutex>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new RecMutex using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GRecMutex>().ptr)

    /**
     * Frees the resources allocated to a recursive mutex with
     * g_rec_mutex_init().
     *
     * This function should not be used with a #GRecMutex that has been
     * statically allocated.
     *
     * Calling g_rec_mutex_clear() on a locked recursive mutex leads
     * to undefined behaviour.
     *
     * @since 2.32
     */
    @GLibVersion2_32
    public fun clear(): Unit = g_rec_mutex_clear(gPointer)

    /**
     * Initializes a #GRecMutex so that it can be used.
     *
     * This function is useful to initialize a recursive mutex
     * that has been allocated on the stack, or as part of a larger
     * structure.
     *
     * It is not necessary to initialise a recursive mutex that has been
     * statically allocated.
     *
     * |[<!-- language="C" -->
     *   typedef struct {
     *     GRecMutex m;
     *     ...
     *   } Blob;
     *
     * Blob *b;
     *
     * b = g_new (Blob, 1);
     * g_rec_mutex_init (&b->m);
     * ]|
     *
     * Calling g_rec_mutex_init() on an already initialized #GRecMutex
     * leads to undefined behaviour.
     *
     * To undo the effect of g_rec_mutex_init() when a recursive mutex
     * is no longer needed, use g_rec_mutex_clear().
     *
     * @since 2.32
     */
    @GLibVersion2_32
    public fun `init`(): Unit = g_rec_mutex_init(gPointer)

    /**
     * Locks @rec_mutex. If @rec_mutex is already locked by another
     * thread, the current thread will block until @rec_mutex is
     * unlocked by the other thread. If @rec_mutex is already locked
     * by the current thread, the 'lock count' of @rec_mutex is increased.
     * The mutex will only become available again when it is unlocked
     * as many times as it has been locked.
     *
     * @since 2.32
     */
    @GLibVersion2_32
    public fun lock(): Unit = g_rec_mutex_lock(gPointer)

    /**
     * Tries to lock @rec_mutex. If @rec_mutex is already locked
     * by another thread, it immediately returns false. Otherwise
     * it locks @rec_mutex and returns true.
     *
     * @return true if @rec_mutex could be locked
     * @since 2.32
     */
    @GLibVersion2_32
    public fun trylock(): Boolean = g_rec_mutex_trylock(gPointer).asBoolean()

    /**
     * Unlocks @rec_mutex. If another thread is blocked in a
     * g_rec_mutex_lock() call for @rec_mutex, it will become unblocked
     * and can lock @rec_mutex itself.
     *
     * Calling g_rec_mutex_unlock() on a recursive mutex that is not
     * locked by the current thread leads to undefined behaviour.
     *
     * @since 2.32
     */
    @GLibVersion2_32
    public fun unlock(): Unit = g_rec_mutex_unlock(gPointer)
}
