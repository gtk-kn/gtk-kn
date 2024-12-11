// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.annotations.GLibVersion2_10
import org.gtkkn.bindings.glib.annotations.GLibVersion2_20
import org.gtkkn.bindings.glib.annotations.GLibVersion2_32
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GThread
import org.gtkkn.native.glib.g_thread_error_quark
import org.gtkkn.native.glib.g_thread_foreach
import org.gtkkn.native.glib.g_thread_get_initialized
import org.gtkkn.native.glib.g_thread_ref
import org.gtkkn.native.glib.g_thread_self
import org.gtkkn.native.glib.g_thread_set_priority
import org.gtkkn.native.glib.g_thread_unref
import org.gtkkn.native.glib.g_thread_yield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_thread_get_type
import kotlin.Boolean
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
 *
 * ## Skipped during bindings generation
 *
 * - method `join`: Return type gpointer is unsupported
 * - constructor `new`: C function g_thread_new is ignored
 * - constructor `try_new`: C function g_thread_try_new is ignored
 * - function `create`: C function g_thread_create is ignored
 * - function `create_full`: C function g_thread_create_full is ignored
 * - parameter `retval`: gpointer
 * - parameter `vtable`: gpointer
 * - parameter `vtable`: gpointer
 * - field `func`: Record field func is private
 * - field `data`: Record field data is private
 * - field `joinable`: Record field joinable is private
 * - field `priority`: Record field priority is private
 */
public class Thread(pointer: CPointer<GThread>) : ProxyInstance(pointer) {
    public val glibThreadPointer: CPointer<GThread> = pointer

    /**
     * Increase the reference count on @thread.
     *
     * @return a new reference to @thread
     * @since 2.32
     */
    @GLibVersion2_32
    public fun ref(): Thread = g_thread_ref(glibThreadPointer.reinterpret())!!.run {
        Thread(reinterpret())
    }

    /**
     * This function does nothing.
     *
     * @param priority ignored
     */
    public fun setPriority(priority: ThreadPriority): Unit =
        g_thread_set_priority(glibThreadPointer.reinterpret(), priority.nativeValue)

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
    public fun unref(): Unit = g_thread_unref(glibThreadPointer.reinterpret())

    public companion object {
        public fun errorQuark(): Quark = g_thread_error_quark()

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
            Thread(reinterpret())
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
