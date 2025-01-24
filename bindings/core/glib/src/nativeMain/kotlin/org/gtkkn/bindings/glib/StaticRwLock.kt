// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.GStaticRWLock
import org.gtkkn.native.glib.g_static_rw_lock_free
import org.gtkkn.native.glib.g_static_rw_lock_init
import org.gtkkn.native.glib.g_static_rw_lock_reader_lock
import org.gtkkn.native.glib.g_static_rw_lock_reader_trylock
import org.gtkkn.native.glib.g_static_rw_lock_reader_unlock
import org.gtkkn.native.glib.g_static_rw_lock_writer_lock
import org.gtkkn.native.glib.g_static_rw_lock_writer_trylock
import org.gtkkn.native.glib.g_static_rw_lock_writer_unlock
import kotlin.Boolean
import kotlin.Pair
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The #GStaticRWLock struct represents a read-write lock. A read-write
 * lock can be used for protecting data that some portions of code only
 * read from, while others also write. In such situations it is
 * desirable that several readers can read at once, whereas of course
 * only one writer may write at a time.
 *
 * Take a look at the following example:
 * |[
 *   GStaticRWLock rwlock = G_STATIC_RW_LOCK_INIT;
 *   GPtrArray *array;
 *
 *   gpointer
 *   my_array_get (guint index)
 *   {
 *     gpointer retval = NULL;
 *
 *     if (!array)
 *       return NULL;
 *
 *     g_static_rw_lock_reader_lock (&rwlock);
 *     if (index < array->len)
 *       retval = g_ptr_array_index (array, index);
 *     g_static_rw_lock_reader_unlock (&rwlock);
 *
 *     return retval;
 *   }
 *
 *   void
 *   my_array_set (guint index, gpointer data)
 *   {
 *     g_static_rw_lock_writer_lock (&rwlock);
 *
 *     if (!array)
 *       array = g_ptr_array_new ();
 *
 *     if (index >= array->len)
 *       g_ptr_array_set_size (array, index + 1);
 *     g_ptr_array_index (array, index) = data;
 *
 *     g_static_rw_lock_writer_unlock (&rwlock);
 *   }
 * ]|
 *
 * This example shows an array which can be accessed by many readers
 * (the my_array_get() function) simultaneously, whereas the writers
 * (the my_array_set() function) will only be allowed once at a time
 * and only if no readers currently access the array. This is because
 * of the potentially dangerous resizing of the array. Using these
 * functions is fully multi-thread safe now.
 *
 * Most of the time, writers should have precedence over readers. That
 * means, for this implementation, that as soon as a writer wants to
 * lock the data, no other reader is allowed to lock the data, whereas,
 * of course, the readers that already have locked the data are allowed
 * to finish their operation. As soon as the last reader unlocks the
 * data, the writer will lock it.
 *
 * Even though #GStaticRWLock is not opaque, it should only be used
 * with the following functions.
 *
 * All of the g_static_rw_lock_* functions can be used even if
 * g_thread_init() has not been called. Then they do nothing, apart
 * from g_static_rw_lock_*_trylock, which does nothing but returning true.
 *
 * A read-write lock has a higher overhead than a mutex. For example, both
 * g_static_rw_lock_reader_lock() and g_static_rw_lock_reader_unlock() have
 * to lock and unlock a #GStaticMutex, so it takes at least twice the time
 * to lock and unlock a #GStaticRWLock that it does to lock and unlock a
 * #GStaticMutex. So only data structures that are accessed by multiple
 * readers, and which keep the lock for a considerable time justify a
 * #GStaticRWLock. The above example most probably would fare better with a
 * #GStaticMutex.
 */
public class StaticRwLock(public val glibStaticRwLockPointer: CPointer<GStaticRWLock>, cleaner: Cleaner? = null) :
    ProxyInstance(glibStaticRwLockPointer) {
    /**
     * Allocate a new StaticRwLock.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GStaticRWLock>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to StaticRwLock and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GStaticRWLock>, Cleaner>,
    ) : this(glibStaticRwLockPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new StaticRwLock using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GStaticRWLock>().ptr)

    /**
     * Releases all resources allocated to @lock.
     *
     * You don't have to call this functions for a #GStaticRWLock with an
     * unbounded lifetime, i.e. objects declared 'static', but if you have
     * a #GStaticRWLock as a member of a structure, and the structure is
     * freed, you should also free the #GStaticRWLock.
     */
    public fun free(): Unit = g_static_rw_lock_free(glibStaticRwLockPointer)

    /**
     * A #GStaticRWLock must be initialized with this function before it
     * can be used. Alternatively you can initialize it with
     * %G_STATIC_RW_LOCK_INIT.
     */
    public fun `init`(): Unit = g_static_rw_lock_init(glibStaticRwLockPointer)

    /**
     * Locks @lock for reading. There may be unlimited concurrent locks for
     * reading of a #GStaticRWLock at the same time.  If @lock is already
     * locked for writing by another thread or if another thread is already
     * waiting to lock @lock for writing, this function will block until
     * @lock is unlocked by the other writing thread and no other writing
     * threads want to lock @lock. This lock has to be unlocked by
     * g_static_rw_lock_reader_unlock().
     *
     * #GStaticRWLock is not recursive. It might seem to be possible to
     * recursively lock for reading, but that can result in a deadlock, due
     * to writer preference.
     */
    public fun readerLock(): Unit = g_static_rw_lock_reader_lock(glibStaticRwLockPointer)

    /**
     * Tries to lock @lock for reading. If @lock is already locked for
     * writing by another thread or if another thread is already waiting to
     * lock @lock for writing, immediately returns false. Otherwise locks
     * @lock for reading and returns true. This lock has to be unlocked by
     * g_static_rw_lock_reader_unlock().
     *
     * @return true, if @lock could be locked for reading
     */
    public fun readerTrylock(): Boolean = g_static_rw_lock_reader_trylock(glibStaticRwLockPointer).asBoolean()

    /**
     * Unlocks @lock. If a thread waits to lock @lock for writing and all
     * locks for reading have been unlocked, the waiting thread is woken up
     * and can lock @lock for writing.
     */
    public fun readerUnlock(): Unit = g_static_rw_lock_reader_unlock(glibStaticRwLockPointer)

    /**
     * Locks @lock for writing. If @lock is already locked for writing or
     * reading by other threads, this function will block until @lock is
     * completely unlocked and then lock @lock for writing. While this
     * functions waits to lock @lock, no other thread can lock @lock for
     * reading. When @lock is locked for writing, no other thread can lock
     * @lock (neither for reading nor writing). This lock has to be
     * unlocked by g_static_rw_lock_writer_unlock().
     */
    public fun writerLock(): Unit = g_static_rw_lock_writer_lock(glibStaticRwLockPointer)

    /**
     * Tries to lock @lock for writing. If @lock is already locked (for
     * either reading or writing) by another thread, it immediately returns
     * false. Otherwise it locks @lock for writing and returns true. This
     * lock has to be unlocked by g_static_rw_lock_writer_unlock().
     *
     * @return true, if @lock could be locked for writing
     */
    public fun writerTrylock(): Boolean = g_static_rw_lock_writer_trylock(glibStaticRwLockPointer).asBoolean()

    /**
     * Unlocks @lock. If a thread is waiting to lock @lock for writing and
     * all locks for reading have been unlocked, the waiting thread is
     * woken up and can lock @lock for writing. If no thread is waiting to
     * lock @lock for writing, and some thread or threads are waiting to
     * lock @lock for reading, the waiting threads are woken up and can
     * lock @lock for reading.
     */
    public fun writerUnlock(): Unit = g_static_rw_lock_writer_unlock(glibStaticRwLockPointer)
}
