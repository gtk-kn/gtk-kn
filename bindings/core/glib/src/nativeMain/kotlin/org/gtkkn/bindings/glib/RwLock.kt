// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.glib.annotations.GLibVersion2_32
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.GRWLock
import org.gtkkn.native.glib.g_rw_lock_clear
import org.gtkkn.native.glib.g_rw_lock_init
import org.gtkkn.native.glib.g_rw_lock_reader_lock
import org.gtkkn.native.glib.g_rw_lock_reader_trylock
import org.gtkkn.native.glib.g_rw_lock_reader_unlock
import org.gtkkn.native.glib.g_rw_lock_writer_lock
import org.gtkkn.native.glib.g_rw_lock_writer_trylock
import org.gtkkn.native.glib.g_rw_lock_writer_unlock
import kotlin.Boolean
import kotlin.Pair
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The GRWLock struct is an opaque data structure to represent a
 * reader-writer lock. It is similar to a #GMutex in that it allows
 * multiple threads to coordinate access to a shared resource.
 *
 * The difference to a mutex is that a reader-writer lock discriminates
 * between read-only ('reader') and full ('writer') access. While only
 * one thread at a time is allowed write access (by holding the 'writer'
 * lock via g_rw_lock_writer_lock()), multiple threads can gain
 * simultaneous read-only access (by holding the 'reader' lock via
 * g_rw_lock_reader_lock()).
 *
 * It is unspecified whether readers or writers have priority in acquiring the
 * lock when a reader already holds the lock and a writer is queued to acquire
 * it.
 *
 * Here is an example for an array with access functions:
 * |[<!-- language="C" -->
 *   GRWLock lock;
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
 *     g_rw_lock_reader_lock (&lock);
 *     if (index < array->len)
 *       retval = g_ptr_array_index (array, index);
 *     g_rw_lock_reader_unlock (&lock);
 *
 *     return retval;
 *   }
 *
 *   void
 *   my_array_set (guint index, gpointer data)
 *   {
 *     g_rw_lock_writer_lock (&lock);
 *
 *     if (!array)
 *       array = g_ptr_array_new ();
 *
 *     if (index >= array->len)
 *       g_ptr_array_set_size (array, index+1);
 *     g_ptr_array_index (array, index) = data;
 *
 *     g_rw_lock_writer_unlock (&lock);
 *   }
 *  ]|
 * This example shows an array which can be accessed by many readers
 * (the my_array_get() function) simultaneously, whereas the writers
 * (the my_array_set() function) will only be allowed one at a time
 * and only if no readers currently access the array. This is because
 * of the potentially dangerous resizing of the array. Using these
 * functions is fully multi-thread safe now.
 *
 * If a #GRWLock is allocated in static storage then it can be used
 * without initialisation.  Otherwise, you should call
 * g_rw_lock_init() on it and g_rw_lock_clear() when done.
 *
 * A GRWLock should only be accessed with the g_rw_lock_ functions.
 * @since 2.32
 */
@GLibVersion2_32
public class RwLock(public val glibRwLockPointer: CPointer<GRWLock>, cleaner: Cleaner? = null) :
    ProxyInstance(glibRwLockPointer) {
    /**
     * Allocate a new RwLock.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GRWLock>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to RwLock and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GRWLock>, Cleaner>,
    ) : this(glibRwLockPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new RwLock using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GRWLock>().ptr)

    /**
     * Frees the resources allocated to a lock with g_rw_lock_init().
     *
     * This function should not be used with a #GRWLock that has been
     * statically allocated.
     *
     * Calling g_rw_lock_clear() when any thread holds the lock
     * leads to undefined behaviour.
     *
     * @since 2.32
     */
    @GLibVersion2_32
    public fun clear(): Unit = g_rw_lock_clear(glibRwLockPointer)

    /**
     * Initializes a #GRWLock so that it can be used.
     *
     * This function is useful to initialize a lock that has been
     * allocated on the stack, or as part of a larger structure.  It is not
     * necessary to initialise a reader-writer lock that has been statically
     * allocated.
     *
     * |[<!-- language="C" -->
     *   typedef struct {
     *     GRWLock l;
     *     ...
     *   } Blob;
     *
     * Blob *b;
     *
     * b = g_new (Blob, 1);
     * g_rw_lock_init (&b->l);
     * ]|
     *
     * To undo the effect of g_rw_lock_init() when a lock is no longer
     * needed, use g_rw_lock_clear().
     *
     * Calling g_rw_lock_init() on an already initialized #GRWLock leads
     * to undefined behaviour.
     *
     * @since 2.32
     */
    @GLibVersion2_32
    public fun `init`(): Unit = g_rw_lock_init(glibRwLockPointer)

    /**
     * Obtain a read lock on @rw_lock. If another thread currently holds
     * the write lock on @rw_lock, the current thread will block until the
     * write lock was (held and) released. If another thread does not hold
     * the write lock, but is waiting for it, it is implementation defined
     * whether the reader or writer will block. Read locks can be taken
     * recursively.
     *
     * Calling g_rw_lock_reader_lock() while the current thread already
     * owns a write lock leads to undefined behaviour. Read locks however
     * can be taken recursively, in which case you need to make sure to
     * call g_rw_lock_reader_unlock() the same amount of times.
     *
     * It is implementation-defined how many read locks are allowed to be
     * held on the same lock simultaneously. If the limit is hit,
     * or if a deadlock is detected, a critical warning will be emitted.
     *
     * @since 2.32
     */
    @GLibVersion2_32
    public fun readerLock(): Unit = g_rw_lock_reader_lock(glibRwLockPointer)

    /**
     * Tries to obtain a read lock on @rw_lock and returns true if
     * the read lock was successfully obtained. Otherwise it
     * returns false.
     *
     * @return true if @rw_lock could be locked
     * @since 2.32
     */
    @GLibVersion2_32
    public fun readerTrylock(): Boolean = g_rw_lock_reader_trylock(glibRwLockPointer).asBoolean()

    /**
     * Release a read lock on @rw_lock.
     *
     * Calling g_rw_lock_reader_unlock() on a lock that is not held
     * by the current thread leads to undefined behaviour.
     *
     * @since 2.32
     */
    @GLibVersion2_32
    public fun readerUnlock(): Unit = g_rw_lock_reader_unlock(glibRwLockPointer)

    /**
     * Obtain a write lock on @rw_lock. If another thread currently holds
     * a read or write lock on @rw_lock, the current thread will block
     * until all other threads have dropped their locks on @rw_lock.
     *
     * Calling g_rw_lock_writer_lock() while the current thread already
     * owns a read or write lock on @rw_lock leads to undefined behaviour.
     *
     * @since 2.32
     */
    @GLibVersion2_32
    public fun writerLock(): Unit = g_rw_lock_writer_lock(glibRwLockPointer)

    /**
     * Tries to obtain a write lock on @rw_lock. If another thread
     * currently holds a read or write lock on @rw_lock, it immediately
     * returns false.
     * Otherwise it locks @rw_lock and returns true.
     *
     * @return true if @rw_lock could be locked
     * @since 2.32
     */
    @GLibVersion2_32
    public fun writerTrylock(): Boolean = g_rw_lock_writer_trylock(glibRwLockPointer).asBoolean()

    /**
     * Release a write lock on @rw_lock.
     *
     * Calling g_rw_lock_writer_unlock() on a lock that is not held
     * by the current thread leads to undefined behaviour.
     *
     * @since 2.32
     */
    @GLibVersion2_32
    public fun writerUnlock(): Unit = g_rw_lock_writer_unlock(glibRwLockPointer)
}
