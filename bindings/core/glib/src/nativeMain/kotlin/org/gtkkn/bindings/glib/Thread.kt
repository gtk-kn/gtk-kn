// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.GLib.resolveException
import org.gtkkn.bindings.glib.annotations.GLibVersion2_10
import org.gtkkn.bindings.glib.annotations.GLibVersion2_20
import org.gtkkn.bindings.glib.annotations.GLibVersion2_32
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.GThread
import org.gtkkn.native.glib.g_thread_create
import org.gtkkn.native.glib.g_thread_create_full
import org.gtkkn.native.glib.g_thread_error_quark
import org.gtkkn.native.glib.g_thread_exit
import org.gtkkn.native.glib.g_thread_foreach
import org.gtkkn.native.glib.g_thread_get_initialized
import org.gtkkn.native.glib.g_thread_init
import org.gtkkn.native.glib.g_thread_init_with_errorcheck_mutexes
import org.gtkkn.native.glib.g_thread_join
import org.gtkkn.native.glib.g_thread_new
import org.gtkkn.native.glib.g_thread_ref
import org.gtkkn.native.glib.g_thread_self
import org.gtkkn.native.glib.g_thread_set_priority
import org.gtkkn.native.glib.g_thread_try_new
import org.gtkkn.native.glib.g_thread_unref
import org.gtkkn.native.glib.g_thread_yield
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.gulong
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_thread_get_type
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit

/**
 * The #GThread struct represents a running thread. This struct
 * is returned by g_thread_new() or g_thread_try_new(). You can
 * obtain the #GThread struct representing the current thread by
 * calling g_thread_self().
 *
 * GThread is refcounted, see g_thread_ref() and g_thread_unref().
 * The thread represented by it holds a reference while it is running,
 * and g_thread_join() consumes the reference that it is given, so
 * it is normally not necessary to manage GThread references
 * explicitly.
 *
 * The structure is opaque -- none of its fields may be directly
 * accessed.
 */
public class Thread(public val glibThreadPointer: CPointer<GThread>) : ProxyInstance(glibThreadPointer) {
    /**
     * Waits until @thread finishes, i.e. the function @func, as
     * given to g_thread_new(), returns or g_thread_exit() is called.
     * If @thread has already terminated, then g_thread_join()
     * returns immediately.
     *
     * Any thread can wait for any other thread by calling g_thread_join(),
     * not just its 'creator'. Calling g_thread_join() from multiple threads
     * for the same @thread leads to undefined behaviour.
     *
     * The value returned by @func or given to g_thread_exit() is
     * returned by this function.
     *
     * g_thread_join() consumes the reference to the passed-in @thread.
     * This will usually cause the #GThread struct and associated resources
     * to be freed. Use g_thread_ref() to obtain an extra reference if you
     * want to keep the GThread alive beyond the g_thread_join() call.
     *
     * @return the return value of the thread
     */
    public fun join(): gpointer? = g_thread_join(glibThreadPointer)

    /**
     * Increase the reference count on @thread.
     *
     * @return a new reference to @thread
     * @since 2.32
     */
    @GLibVersion2_32
    public fun ref(): Thread = g_thread_ref(glibThreadPointer)!!.run {
        Thread(this)
    }

    /**
     * This function does nothing.
     *
     * @param priority ignored
     */
    public fun setPriority(priority: ThreadPriority): Unit =
        g_thread_set_priority(glibThreadPointer, priority.nativeValue)

    /**
     * Decrease the reference count on @thread, possibly freeing all
     * resources associated with it.
     *
     * Note that each thread holds a reference to its #GThread while
     * it is running, so it is safe to drop your own reference to it
     * if you don't need it anymore.
     *
     * @since 2.32
     */
    @GLibVersion2_32
    public fun unref(): Unit = g_thread_unref(glibThreadPointer)

    public companion object {
        /**
         * This function creates a new thread. The new thread starts by invoking
         * @func with the argument data. The thread will run until @func returns
         * or until g_thread_exit() is called from the new thread. The return value
         * of @func becomes the return value of the thread, which can be obtained
         * with g_thread_join().
         *
         * The @name can be useful for discriminating threads in a debugger.
         * It is not used for other purposes and does not have to be unique.
         * Some systems restrict the length of @name to 16 bytes.
         *
         * If the thread can not be created the program aborts. See
         * g_thread_try_new() if you want to attempt to deal with failures.
         *
         * If you are using threads to offload (potentially many) short-lived tasks,
         * #GThreadPool may be more appropriate than manually spawning and tracking
         * multiple #GThreads.
         *
         * To free the struct returned by this function, use g_thread_unref().
         * Note that g_thread_join() implicitly unrefs the #GThread as well.
         *
         * New threads by default inherit their scheduler policy (POSIX) or thread
         * priority (Windows) of the thread creating the new thread.
         *
         * This behaviour changed in GLib 2.64: before threads on Windows were not
         * inheriting the thread priority but were spawned with the default priority.
         * Starting with GLib 2.64 the behaviour is now consistent between Windows and
         * POSIX and all threads inherit their parent thread's priority.
         *
         * @param name an (optional) name for the new thread
         * @param func a function to execute in the new thread
         * @return the new #GThread
         * @since 2.32
         */
        public fun new(name: String? = null, func: ThreadFunc): Thread = Thread(
            g_thread_new(name, ThreadFuncFunc.reinterpret(), StableRef.create(func).asCPointer())!!.reinterpret()
        )

        /**
         * This function is the same as g_thread_new() except that
         * it allows for the possibility of failure.
         *
         * If a thread can not be created (due to resource limits),
         * @error is set and null is returned.
         *
         * @param name an (optional) name for the new thread
         * @param func a function to execute in the new thread
         * @return the new #GThread, or null if an error occurred
         * @since 2.32
         */
        public fun tryNew(name: String? = null, func: ThreadFunc): Result<Thread> {
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult =
                    g_thread_try_new(
                        name,
                        ThreadFuncFunc.reinterpret(),
                        StableRef.create(func).asCPointer(),
                        gError.ptr
                    )
                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(Thread(checkNotNull(gResult)))
                }
            }
        }

        /**
         * This function creates a new thread.
         *
         * The new thread executes the function @func with the argument @data.
         * If the thread was created successfully, it is returned.
         *
         * @error can be null to ignore errors, or non-null to report errors.
         * The error is set, if and only if the function returns null.
         *
         * This function returns a reference to the created thread only if
         * @joinable is true.  In that case, you must free this reference by
         * calling g_thread_unref() or g_thread_join().  If @joinable is false
         * then you should probably not touch the return value.
         *
         * @param func a function to execute in the new thread
         * @param joinable should this thread be joinable?
         * @return the new #GThread on success
         */
        public fun create(func: ThreadFunc, joinable: Boolean): Result<Thread> = memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_thread_create(
                ThreadFuncFunc.reinterpret(),
                StableRef.create(func).asCPointer(),
                joinable.asGBoolean(),
                gError.ptr
            )?.run {
                Thread(this)
            }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

        /**
         * This function creates a new thread.
         *
         * @param func a function to execute in the new thread.
         * @param stackSize a stack size for the new thread.
         * @param joinable should this thread be joinable?
         * @param bound ignored
         * @param priority ignored
         * @return the new #GThread on success.
         */
        public fun createFull(
            func: ThreadFunc,
            stackSize: gulong,
            joinable: Boolean,
            bound: Boolean,
            priority: ThreadPriority,
        ): Result<Thread> = memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_thread_create_full(
                ThreadFuncFunc.reinterpret(),
                StableRef.create(func).asCPointer(),
                stackSize,
                joinable.asGBoolean(),
                bound.asGBoolean(),
                priority.nativeValue,
                gError.ptr
            )?.run {
                Thread(this)
            }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

        public fun errorQuark(): Quark = g_thread_error_quark()

        /**
         * Terminates the current thread.
         *
         * If another thread is waiting for us using g_thread_join() then the
         * waiting thread will be woken up and get @retval as the return value
         * of g_thread_join().
         *
         * Calling g_thread_exit() with a parameter @retval is equivalent to
         * returning @retval from the function @func, as given to g_thread_new().
         *
         * You must only call g_thread_exit() from a thread that you created
         * yourself with g_thread_new() or related APIs. You must not call
         * this function from a thread created with another threading library
         * or or from within a #GThreadPool.
         *
         * @param retval the return value of this thread
         */
        public fun exit(retval: gpointer? = null): Unit = g_thread_exit(retval)

        /**
         * Call @thread_func on all #GThreads that have been
         * created with g_thread_create().
         *
         * Note that threads may decide to exit while @thread_func is
         * running, so without intimate knowledge about the lifetime of
         * foreign threads, @thread_func shouldn't access the GThread*
         * pointer passed in as first argument. However, @thread_func will
         * not be called for threads which are known to have exited already.
         *
         * Due to thread lifetime checks, this function has an execution complexity
         * which is quadratic in the number of existing threads.
         *
         * @param threadFunc function to call for all #GThread structures
         * @since 2.10
         */
        @GLibVersion2_10
        public fun foreach(threadFunc: Func): Unit =
            g_thread_foreach(FuncFunc.reinterpret(), StableRef.create(threadFunc).asCPointer())

        /**
         * Indicates if g_thread_init() has been called.
         *
         * @return true if threads have been initialized.
         * @since 2.20
         */
        @GLibVersion2_20
        public fun getInitialized(): Boolean = g_thread_get_initialized().asBoolean()

        /**
         * If you use GLib from more than one thread, you must initialize the
         * thread system by calling g_thread_init().
         *
         * Since version 2.24, calling g_thread_init() multiple times is allowed,
         * but nothing happens except for the first call.
         *
         * Since version 2.32, GLib does not support custom thread implementations
         * anymore and the @vtable parameter is ignored and you should pass null.
         *
         * <note><para>g_thread_init() must not be called directly or indirectly
         * in a callback from GLib. Also no mutexes may be currently locked while
         * calling g_thread_init().</para></note>
         *
         * <note><para>To use g_thread_init() in your program, you have to link
         * with the libraries that the command <command>pkg-config --libs
         * gthread-2.0</command> outputs. This is not the case for all the
         * other thread-related functions of GLib. Those can be used without
         * having to link with the thread libraries.</para></note>
         *
         * @param vtable a function table of type #GThreadFunctions, that provides
         *     the entry points to the thread system to be used. Since 2.32,
         *     this parameter is ignored and should always be null
         */
        public fun `init`(vtable: gpointer? = null): Unit = g_thread_init(vtable)

        public fun initWithErrorcheckMutexes(vtable: gpointer? = null): Unit =
            g_thread_init_with_errorcheck_mutexes(vtable)

        /**
         * This function returns the #GThread corresponding to the
         * current thread. Note that this function does not increase
         * the reference count of the returned struct.
         *
         * This function will return a #GThread even for threads that
         * were not created by GLib (i.e. those created by other threading
         * APIs). This may be useful for thread identification purposes
         * (i.e. comparisons) but you must not use GLib functions (such
         * as g_thread_join()) on these threads.
         *
         * @return the #GThread representing the current thread
         */
        public fun self(): Thread = g_thread_self()!!.run {
            Thread(this)
        }

        /**
         * Causes the calling thread to voluntarily relinquish the CPU, so
         * that other threads can run.
         *
         * This function is often used as a method to make busy wait less evil.
         */
        public fun `yield`(): Unit = g_thread_yield()

        /**
         * Get the GType of Thread
         *
         * @return the GType
         */
        public fun getType(): GType = g_thread_get_type()
    }
}
