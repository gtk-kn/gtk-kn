// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.annotations.GLibVersion2_10
import org.gtkkn.bindings.glib.annotations.GLibVersion2_22
import org.gtkkn.bindings.glib.annotations.GLibVersion2_28
import org.gtkkn.bindings.glib.annotations.GLibVersion2_32
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.native.glib.GMainContext
import org.gtkkn.native.glib.g_main_context_acquire
import org.gtkkn.native.glib.g_main_context_add_poll
import org.gtkkn.native.glib.g_main_context_default
import org.gtkkn.native.glib.g_main_context_dispatch
import org.gtkkn.native.glib.g_main_context_find_source_by_funcs_user_data
import org.gtkkn.native.glib.g_main_context_find_source_by_id
import org.gtkkn.native.glib.g_main_context_find_source_by_user_data
import org.gtkkn.native.glib.g_main_context_get_thread_default
import org.gtkkn.native.glib.g_main_context_invoke
import org.gtkkn.native.glib.g_main_context_invoke_full
import org.gtkkn.native.glib.g_main_context_is_owner
import org.gtkkn.native.glib.g_main_context_iteration
import org.gtkkn.native.glib.g_main_context_new
import org.gtkkn.native.glib.g_main_context_new_with_flags
import org.gtkkn.native.glib.g_main_context_pending
import org.gtkkn.native.glib.g_main_context_pop_thread_default
import org.gtkkn.native.glib.g_main_context_push_thread_default
import org.gtkkn.native.glib.g_main_context_ref
import org.gtkkn.native.glib.g_main_context_ref_thread_default
import org.gtkkn.native.glib.g_main_context_release
import org.gtkkn.native.glib.g_main_context_remove_poll
import org.gtkkn.native.glib.g_main_context_unref
import org.gtkkn.native.glib.g_main_context_wakeup
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_main_context_get_type
import kotlin.Boolean
import kotlin.Unit

/**
 * The `GMainContext` struct is an opaque data
 * type representing a set of sources to be handled in a main loop.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `fds`: Not-pointer record PollFD is ignored
 * - method `get_poll_func`: Return type PollFunc is unsupported
 * - parameter `priority`: priority: Out parameter is not supported
 * - parameter `timeout`: timeout: Out parameter is not supported
 * - parameter `func`: PollFunc
 * - parameter `mutex`: Mutex
 */
public class MainContext(pointer: CPointer<GMainContext>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GMainContext> = pointer

    /**
     * Tries to become the owner of the specified context.
     * If some other thread is the owner of the context,
     * returns false immediately. Ownership is properly
     * recursive: the owner can require ownership again
     * and will release ownership when g_main_context_release()
     * is called as many times as g_main_context_acquire().
     *
     * You must be the owner of a context before you
     * can call g_main_context_prepare(), g_main_context_query(),
     * g_main_context_check(), g_main_context_dispatch(), g_main_context_release().
     *
     * Since 2.76 @context can be null to use the global-default
     * main context.
     *
     * @return true if the operation succeeded, and
     *   this thread is now the owner of @context.
     */
    public fun acquire(): Boolean = g_main_context_acquire(gPointer.reinterpret()).asBoolean()

    /**
     * Adds a file descriptor to the set of file descriptors polled for
     * this context. This will very seldom be used directly. Instead
     * a typical event source will use g_source_add_unix_fd() instead.
     *
     * @param fd a #GPollFD structure holding information about a file
     *      descriptor to watch.
     * @param priority the priority for this file descriptor which should be
     *      the same as the priority used for g_source_attach() to ensure that the
     *      file descriptor is polled whenever the results may be needed.
     */
    public fun addPoll(fd: PollFd, priority: gint): Unit =
        g_main_context_add_poll(gPointer.reinterpret(), fd.gPointer.reinterpret(), priority)

    /**
     * Dispatches all pending sources.
     *
     * You must have successfully acquired the context with
     * g_main_context_acquire() before you may call this function.
     *
     * Since 2.76 @context can be null to use the global-default
     * main context.
     */
    public fun dispatch(): Unit = g_main_context_dispatch(gPointer.reinterpret())

    /**
     * Finds a source with the given source functions and user data.  If
     * multiple sources exist with the same source function and user data,
     * the first one found will be returned.
     *
     * @param funcs the @source_funcs passed to g_source_new().
     * @param userData the user data from the callback.
     * @return the source, if one was found, otherwise null
     */
    public fun findSourceByFuncsUserData(funcs: SourceFuncs, userData: gpointer? = null): Source =
        g_main_context_find_source_by_funcs_user_data(
            gPointer.reinterpret(),
            funcs.gPointer.reinterpret(),
            userData
        )!!.run {
            Source(reinterpret())
        }

    /**
     * Finds a #GSource given a pair of context and ID.
     *
     * It is a programmer error to attempt to look up a non-existent source.
     *
     * More specifically: source IDs can be reissued after a source has been
     * destroyed and therefore it is never valid to use this function with a
     * source ID which may have already been removed.  An example is when
     * scheduling an idle to run in another thread with g_idle_add(): the
     * idle may already have run and been removed by the time this function
     * is called on its (now invalid) source ID.  This source ID may have
     * been reissued, leading to the operation being performed against the
     * wrong source.
     *
     * @param sourceId the source ID, as returned by g_source_get_id().
     * @return the #GSource
     */
    public fun findSourceById(sourceId: guint): Source =
        g_main_context_find_source_by_id(gPointer.reinterpret(), sourceId)!!.run {
            Source(reinterpret())
        }

    /**
     * Finds a source with the given user data for the callback.  If
     * multiple sources exist with the same user data, the first
     * one found will be returned.
     *
     * @param userData the user_data for the callback.
     * @return the source, if one was found, otherwise null
     */
    public fun findSourceByUserData(userData: gpointer? = null): Source =
        g_main_context_find_source_by_user_data(gPointer.reinterpret(), userData)!!.run {
            Source(reinterpret())
        }

    /**
     * Invokes a function in such a way that @context is owned during the
     * invocation of @function.
     *
     * If @context is null then the global-default main context — as
     * returned by g_main_context_default() — is used.
     *
     * If @context is owned by the current thread, @function is called
     * directly.  Otherwise, if @context is the thread-default main context
     * of the current thread and g_main_context_acquire() succeeds, then
     * @function is called and g_main_context_release() is called
     * afterwards.
     *
     * In any other case, an idle source is created to call @function and
     * that source is attached to @context (presumably to be run in another
     * thread).  The idle source is attached with %G_PRIORITY_DEFAULT
     * priority.  If you want a different priority, use
     * g_main_context_invoke_full().
     *
     * Note that, as with normal idle functions, @function should probably
     * return false.  If it returns true, it will be continuously run in a
     * loop (and may prevent this call from returning).
     *
     * @param function function to call
     * @since 2.28
     */
    @GLibVersion2_28
    public fun invoke(function: SourceFunc): Unit = g_main_context_invoke(
        gPointer.reinterpret(),
        SourceFuncFunc.reinterpret(),
        StableRef.create(function).asCPointer()
    )

    /**
     * Invokes a function in such a way that @context is owned during the
     * invocation of @function.
     *
     * This function is the same as g_main_context_invoke() except that it
     * lets you specify the priority in case @function ends up being
     * scheduled as an idle and also lets you give a #GDestroyNotify for @data.
     *
     * @notify should not assume that it is called from any particular
     * thread or with any particular context acquired.
     *
     * @param priority the priority at which to run @function
     * @param function function to call
     * @since 2.28
     */
    @GLibVersion2_28
    public fun invokeFull(priority: gint, function: SourceFunc): Unit = g_main_context_invoke_full(
        gPointer.reinterpret(),
        priority,
        SourceFuncFunc.reinterpret(),
        StableRef.create(function).asCPointer(),
        staticStableRefDestroy.reinterpret()
    )

    /**
     * Determines whether this thread holds the (recursive)
     * ownership of this #GMainContext. This is useful to
     * know before waiting on another thread that may be
     * blocking to get ownership of @context.
     *
     * @return true if current thread is owner of @context.
     * @since 2.10
     */
    @GLibVersion2_10
    public fun isOwner(): Boolean = g_main_context_is_owner(gPointer.reinterpret()).asBoolean()

    /**
     * Runs a single iteration for the given main loop. This involves
     * checking to see if any event sources are ready to be processed,
     * then if no events sources are ready and @may_block is true, waiting
     * for a source to become ready, then dispatching the highest priority
     * events sources that are ready. Otherwise, if @may_block is false
     * sources are not waited to become ready, only those highest priority
     * events sources will be dispatched (if any), that are ready at this
     * given moment without further waiting.
     *
     * Note that even when @may_block is true, it is still possible for
     * g_main_context_iteration() to return false, since the wait may
     * be interrupted for other reasons than an event source becoming ready.
     *
     * @param mayBlock whether the call may block.
     * @return true if events were dispatched.
     */
    public fun iteration(mayBlock: Boolean): Boolean =
        g_main_context_iteration(gPointer.reinterpret(), mayBlock.asGBoolean()).asBoolean()

    /**
     * Checks if any sources have pending events for the given context.
     *
     * @return true if events are pending.
     */
    public fun pending(): Boolean = g_main_context_pending(gPointer.reinterpret()).asBoolean()

    /**
     * Pops @context off the thread-default context stack (verifying that
     * it was on the top of the stack).
     *
     * @since 2.22
     */
    @GLibVersion2_22
    public fun popThreadDefault(): Unit = g_main_context_pop_thread_default(gPointer.reinterpret())

    /**
     * Acquires @context and sets it as the thread-default context for the
     * current thread. This will cause certain asynchronous operations
     * (such as most [gio][gio]-based I/O) which are
     * started in this thread to run under @context and deliver their
     * results to its main loop, rather than running under the global
     * default main context in the main thread. Note that calling this function
     * changes the context returned by g_main_context_get_thread_default(),
     * not the one returned by g_main_context_default(), so it does not affect
     * the context used by functions like g_idle_add().
     *
     * Normally you would call this function shortly after creating a new
     * thread, passing it a #GMainContext which will be run by a
     * #GMainLoop in that thread, to set a new default context for all
     * async operations in that thread. In this case you may not need to
     * ever call g_main_context_pop_thread_default(), assuming you want the
     * new #GMainContext to be the default for the whole lifecycle of the
     * thread.
     *
     * If you don't have control over how the new thread was created (e.g.
     * in the new thread isn't newly created, or if the thread life
     * cycle is managed by a #GThreadPool), it is always suggested to wrap
     * the logic that needs to use the new #GMainContext inside a
     * g_main_context_push_thread_default() / g_main_context_pop_thread_default()
     * pair, otherwise threads that are re-used will end up never explicitly
     * releasing the #GMainContext reference they hold.
     *
     * In some cases you may want to schedule a single operation in a
     * non-default context, or temporarily use a non-default context in
     * the main thread. In that case, you can wrap the call to the
     * asynchronous operation inside a
     * g_main_context_push_thread_default() /
     * g_main_context_pop_thread_default() pair, but it is up to you to
     * ensure that no other asynchronous operations accidentally get
     * started while the non-default context is active.
     *
     * Beware that libraries that predate this function may not correctly
     * handle being used from a thread with a thread-default context. Eg,
     * see g_file_supports_thread_contexts().
     *
     * @since 2.22
     */
    @GLibVersion2_22
    public fun pushThreadDefault(): Unit = g_main_context_push_thread_default(gPointer.reinterpret())

    /**
     * Increases the reference count on a #GMainContext object by one.
     *
     * @return the @context that was passed in (since 2.6)
     */
    public fun ref(): MainContext = g_main_context_ref(gPointer.reinterpret())!!.run {
        MainContext(reinterpret())
    }

    /**
     * Releases ownership of a context previously acquired by this thread
     * with g_main_context_acquire(). If the context was acquired multiple
     * times, the ownership will be released only when g_main_context_release()
     * is called as many times as it was acquired.
     *
     * You must have successfully acquired the context with
     * g_main_context_acquire() before you may call this function.
     */
    public fun release(): Unit = g_main_context_release(gPointer.reinterpret())

    /**
     * Removes file descriptor from the set of file descriptors to be
     * polled for a particular context.
     *
     * @param fd a #GPollFD descriptor previously added with g_main_context_add_poll()
     */
    public fun removePoll(fd: PollFd): Unit =
        g_main_context_remove_poll(gPointer.reinterpret(), fd.gPointer.reinterpret())

    /**
     * Decreases the reference count on a #GMainContext object by one. If
     * the result is zero, free the context and free all associated memory.
     */
    public fun unref(): Unit = g_main_context_unref(gPointer.reinterpret())

    /**
     * If @context is currently blocking in g_main_context_iteration()
     * waiting for a source to become ready, cause it to stop blocking
     * and return.  Otherwise, cause the next invocation of
     * g_main_context_iteration() to return without blocking.
     *
     * This API is useful for low-level control over #GMainContext; for
     * example, integrating it with main loop implementations such as
     * #GMainLoop.
     *
     * Another related use for this function is when implementing a main
     * loop with a termination condition, computed from multiple threads:
     *
     * |[<!-- language="C" -->
     *   #define NUM_TASKS 10
     *   static gint tasks_remaining = NUM_TASKS;  // (atomic)
     *   ...
     *
     *   while (g_atomic_int_get (&tasks_remaining) != 0)
     *     g_main_context_iteration (NULL, TRUE);
     * ]|
     *
     * Then in a thread:
     * |[<!-- language="C" -->
     *   perform_work();
     *
     *   if (g_atomic_int_dec_and_test (&tasks_remaining))
     *     g_main_context_wakeup (NULL);
     * ]|
     */
    public fun wakeup(): Unit = g_main_context_wakeup(gPointer.reinterpret())

    public companion object {
        /**
         * Creates a new #GMainContext structure.
         *
         * @return the new #GMainContext
         */
        public fun new(): MainContext = MainContext(g_main_context_new()!!.reinterpret())

        /**
         * Creates a new #GMainContext structure.
         *
         * @param flags a bitwise-OR combination of #GMainContextFlags flags that can only be
         *         set at creation time.
         * @return the new #GMainContext
         * @since 2.72
         */
        public fun newWithFlags(flags: MainContextFlags): MainContext =
            MainContext(g_main_context_new_with_flags(flags.mask)!!.reinterpret())

        /**
         * Returns the global-default main context. This is the main context
         * used for main loop functions when a main loop is not explicitly
         * specified, and corresponds to the "main" main loop. See also
         * g_main_context_get_thread_default().
         *
         * @return the global-default main context.
         */
        public fun default(): MainContext = g_main_context_default()!!.run {
            MainContext(reinterpret())
        }

        /**
         * Gets the thread-default #GMainContext for this thread. Asynchronous
         * operations that want to be able to be run in contexts other than
         * the default one should call this method or
         * g_main_context_ref_thread_default() to get a #GMainContext to add
         * their #GSources to. (Note that even in single-threaded
         * programs applications may sometimes want to temporarily push a
         * non-default context, so it is not safe to assume that this will
         * always return null if you are running in the default thread.)
         *
         * If you need to hold a reference on the context, use
         * g_main_context_ref_thread_default() instead.
         *
         * @return the thread-default #GMainContext, or
         * null if the thread-default context is the global-default main context.
         * @since 2.22
         */
        @GLibVersion2_22
        public fun getThreadDefault(): MainContext? = g_main_context_get_thread_default()?.run {
            MainContext(reinterpret())
        }

        /**
         * Gets the thread-default #GMainContext for this thread, as with
         * g_main_context_get_thread_default(), but also adds a reference to
         * it with g_main_context_ref(). In addition, unlike
         * g_main_context_get_thread_default(), if the thread-default context
         * is the global-default context, this will return that #GMainContext
         * (with a ref added to it) rather than returning null.
         *
         * @return the thread-default #GMainContext. Unref
         *     with g_main_context_unref() when you are done with it.
         * @since 2.32
         */
        @GLibVersion2_32
        public fun refThreadDefault(): MainContext = g_main_context_ref_thread_default()!!.run {
            MainContext(reinterpret())
        }

        /**
         * Get the GType of MainContext
         *
         * @return the GType
         */
        public fun getType(): GType = g_main_context_get_type()
    }
}
