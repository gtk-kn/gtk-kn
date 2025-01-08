// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.GStaticRecMutex
import org.gtkkn.native.glib.g_static_rec_mutex_free
import org.gtkkn.native.glib.g_static_rec_mutex_init
import org.gtkkn.native.glib.g_static_rec_mutex_lock
import org.gtkkn.native.glib.g_static_rec_mutex_lock_full
import org.gtkkn.native.glib.g_static_rec_mutex_trylock
import org.gtkkn.native.glib.g_static_rec_mutex_unlock
import org.gtkkn.native.glib.g_static_rec_mutex_unlock_full
import org.gtkkn.native.glib.guint
import kotlin.Boolean
import kotlin.Pair
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A #GStaticRecMutex works like a #GStaticMutex, but it can be locked
 * multiple times by one thread. If you enter it n times, you have to
 * unlock it n times again to let other threads lock it. An exception
 * is the function g_static_rec_mutex_unlock_full(): that allows you to
 * unlock a #GStaticRecMutex completely returning the depth, (i.e. the
 * number of times this mutex was locked). The depth can later be used
 * to restore the state of the #GStaticRecMutex by calling
 * g_static_rec_mutex_lock_full(). In GLib 2.32, #GStaticRecMutex has
 * been deprecated in favor of #GRecMutex.
 *
 * Even though #GStaticRecMutex is not opaque, it should only be used
 * with the following functions.
 *
 * All of the g_static_rec_mutex_* functions can be used even if
 * g_thread_init() has not been called. Then they do nothing, apart
 * from g_static_rec_mutex_trylock(), which does nothing but returning
 * true.
 */
public class StaticRecMutex(pointer: CPointer<GStaticRecMutex>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GStaticRecMutex> = pointer

    /**
     * Allocate a new StaticRecMutex.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GStaticRecMutex>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to StaticRecMutex and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GStaticRecMutex>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new StaticRecMutex using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GStaticRecMutex>().ptr)

    /**
     * Releases all resources allocated to a #GStaticRecMutex.
     *
     * You don't have to call this functions for a #GStaticRecMutex with an
     * unbounded lifetime, i.e. objects declared 'static', but if you have
     * a #GStaticRecMutex as a member of a structure and the structure is
     * freed, you should also free the #GStaticRecMutex.
     */
    public fun free(): Unit = g_static_rec_mutex_free(gPointer)

    /**
     * A #GStaticRecMutex must be initialized with this function before it
     * can be used. Alternatively you can initialize it with
     * %G_STATIC_REC_MUTEX_INIT.
     */
    public fun `init`(): Unit = g_static_rec_mutex_init(gPointer)

    /**
     * Locks @mutex. If @mutex is already locked by another thread, the
     * current thread will block until @mutex is unlocked by the other
     * thread. If @mutex is already locked by the calling thread, this
     * functions increases the depth of @mutex and returns immediately.
     */
    public fun lock(): Unit = g_static_rec_mutex_lock(gPointer)

    /**
     * Works like calling g_static_rec_mutex_lock() for @mutex @depth times.
     *
     * @param depth number of times this mutex has to be unlocked to be
     *         completely unlocked.
     */
    public fun lockFull(depth: guint): Unit = g_static_rec_mutex_lock_full(gPointer, depth)

    /**
     * Tries to lock @mutex. If @mutex is already locked by another thread,
     * it immediately returns false. Otherwise it locks @mutex and returns
     * true. If @mutex is already locked by the calling thread, this
     * functions increases the depth of @mutex and immediately returns
     * true.
     *
     * @return true, if @mutex could be locked.
     */
    public fun trylock(): Boolean = g_static_rec_mutex_trylock(gPointer).asBoolean()

    /**
     * Unlocks @mutex. Another thread will be allowed to lock @mutex only
     * when it has been unlocked as many times as it had been locked
     * before. If @mutex is completely unlocked and another thread is
     * blocked in a g_static_rec_mutex_lock() call for @mutex, it will be
     * woken and can lock @mutex itself.
     */
    public fun unlock(): Unit = g_static_rec_mutex_unlock(gPointer)

    /**
     * Completely unlocks @mutex. If another thread is blocked in a
     * g_static_rec_mutex_lock() call for @mutex, it will be woken and can
     * lock @mutex itself. This function returns the number of times that
     * @mutex has been locked by the current thread. To restore the state
     * before the call to g_static_rec_mutex_unlock_full() you can call
     * g_static_rec_mutex_lock_full() with the depth returned by this
     * function.
     *
     * @return number of times @mutex has been locked by the current
     *          thread.
     */
    public fun unlockFull(): guint = g_static_rec_mutex_unlock_full(gPointer)
}
