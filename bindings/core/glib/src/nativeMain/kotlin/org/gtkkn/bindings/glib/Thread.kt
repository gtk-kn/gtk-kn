// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.annotations.GLibVersion2_32
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GThread
import org.gtkkn.native.glib.g_thread_error_quark
import org.gtkkn.native.glib.g_thread_ref
import org.gtkkn.native.glib.g_thread_self
import org.gtkkn.native.glib.g_thread_unref
import org.gtkkn.native.glib.g_thread_yield
import kotlin.UInt
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
 * - parameter `retval`: gpointer
 * - field `func`: Record field func is private
 * - field `data`: Record field data is private
 * - field `joinable`: Record field joinable is private
 * - field `priority`: Record field priority is private
 */
public class Thread(
    pointer: CPointer<GThread>,
) : Record {
    public val glibThreadPointer: CPointer<GThread> = pointer

    /**
     * Increase the reference count on @thread.
     *
     * @return a new reference to @thread
     * @since 2.32
     */
    @GLibVersion2_32
    public fun ref(): Thread =
        g_thread_ref(glibThreadPointer.reinterpret())!!.run {
            Thread(reinterpret())
        }

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

    public companion object : RecordCompanion<Thread, GThread> {
        public fun errorQuark(): UInt = g_thread_error_quark()

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
        public fun self(): Thread =
            g_thread_self()!!.run {
                Thread(reinterpret())
            }

        /**
         * Causes the calling thread to voluntarily relinquish the CPU, so
         * that other threads can run.
         *
         * This function is often used as a method to make busy wait less evil.
         */
        public fun `yield`(): Unit = g_thread_yield()

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Thread = Thread(pointer.reinterpret())
    }
}
