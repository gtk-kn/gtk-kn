// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.annotations.GLibVersion2_12
import org.gtkkn.bindings.glib.annotations.GLibVersion2_26
import org.gtkkn.bindings.glib.annotations.GLibVersion2_28
import org.gtkkn.bindings.glib.annotations.GLibVersion2_36
import org.gtkkn.bindings.glib.annotations.GLibVersion2_70
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.native.glib.GSource
import org.gtkkn.native.glib.g_source_add_child_source
import org.gtkkn.native.glib.g_source_add_poll
import org.gtkkn.native.glib.g_source_add_unix_fd
import org.gtkkn.native.glib.g_source_attach
import org.gtkkn.native.glib.g_source_destroy
import org.gtkkn.native.glib.g_source_get_can_recurse
import org.gtkkn.native.glib.g_source_get_context
import org.gtkkn.native.glib.g_source_get_current_time
import org.gtkkn.native.glib.g_source_get_id
import org.gtkkn.native.glib.g_source_get_name
import org.gtkkn.native.glib.g_source_get_priority
import org.gtkkn.native.glib.g_source_get_ready_time
import org.gtkkn.native.glib.g_source_get_time
import org.gtkkn.native.glib.g_source_is_destroyed
import org.gtkkn.native.glib.g_source_modify_unix_fd
import org.gtkkn.native.glib.g_source_new
import org.gtkkn.native.glib.g_source_query_unix_fd
import org.gtkkn.native.glib.g_source_ref
import org.gtkkn.native.glib.g_source_remove
import org.gtkkn.native.glib.g_source_remove_by_funcs_user_data
import org.gtkkn.native.glib.g_source_remove_by_user_data
import org.gtkkn.native.glib.g_source_remove_child_source
import org.gtkkn.native.glib.g_source_remove_poll
import org.gtkkn.native.glib.g_source_remove_unix_fd
import org.gtkkn.native.glib.g_source_set_callback
import org.gtkkn.native.glib.g_source_set_callback_indirect
import org.gtkkn.native.glib.g_source_set_can_recurse
import org.gtkkn.native.glib.g_source_set_funcs
import org.gtkkn.native.glib.g_source_set_name
import org.gtkkn.native.glib.g_source_set_name_by_id
import org.gtkkn.native.glib.g_source_set_priority
import org.gtkkn.native.glib.g_source_set_ready_time
import org.gtkkn.native.glib.g_source_set_static_name
import org.gtkkn.native.glib.g_source_unref
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gint64
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_source_get_type
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * The `GSource` struct is an opaque data type
 * representing an event source.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `dispose`: SourceDisposeFunc
 */
public class Source(public val glibSourcePointer: CPointer<GSource>) : ProxyInstance(glibSourcePointer) {
    /**
     * Adds @child_source to @source as a "polled" source; when @source is
     * added to a #GMainContext, @child_source will be automatically added
     * with the same priority, when @child_source is triggered, it will
     * cause @source to dispatch (in addition to calling its own
     * callback), and when @source is destroyed, it will destroy
     * @child_source as well. (@source will also still be dispatched if
     * its own prepare/check functions indicate that it is ready.)
     *
     * If you don't need @child_source to do anything on its own when it
     * triggers, you can call g_source_set_dummy_callback() on it to set a
     * callback that does nothing (except return true if appropriate).
     *
     * @source will hold a reference on @child_source while @child_source
     * is attached to it.
     *
     * This API is only intended to be used by implementations of #GSource.
     * Do not call this API on a #GSource that you did not create.
     *
     * @param childSource a second #GSource that @source should "poll"
     * @since 2.28
     */
    @GLibVersion2_28
    public fun addChildSource(childSource: Source): Unit =
        g_source_add_child_source(glibSourcePointer, childSource.glibSourcePointer)

    /**
     * Adds a file descriptor to the set of file descriptors polled for
     * this source. This is usually combined with g_source_new() to add an
     * event source. The event source's check function will typically test
     * the @revents field in the #GPollFD struct and return true if events need
     * to be processed.
     *
     * This API is only intended to be used by implementations of #GSource.
     * Do not call this API on a #GSource that you did not create.
     *
     * Using this API forces the linear scanning of event sources on each
     * main loop iteration.  Newly-written event sources should try to use
     * g_source_add_unix_fd() instead of this API.
     *
     * @param fd a #GPollFD structure holding information about a file
     *      descriptor to watch.
     */
    public fun addPoll(fd: PollFd): Unit = g_source_add_poll(glibSourcePointer, fd.glibPollFdPointer)

    /**
     * Monitors @fd for the IO events in @events.
     *
     * The tag returned by this function can be used to remove or modify the
     * monitoring of the fd using g_source_remove_unix_fd() or
     * g_source_modify_unix_fd().
     *
     * It is not necessary to remove the fd before destroying the source; it
     * will be cleaned up automatically.
     *
     * This API is only intended to be used by implementations of #GSource.
     * Do not call this API on a #GSource that you did not create.
     *
     * As the name suggests, this function is not available on Windows.
     *
     * @param fd the fd to monitor
     * @param events an event mask
     * @return an opaque tag
     * @since 2.36
     */
    @GLibVersion2_36
    public fun addUnixFd(fd: gint, events: IoCondition): gpointer =
        g_source_add_unix_fd(glibSourcePointer, fd, events.mask)!!

    /**
     * Adds a #GSource to a @context so that it will be executed within
     * that context. Remove it by calling g_source_destroy().
     *
     * This function is safe to call from any thread, regardless of which thread
     * the @context is running in.
     *
     * @param context a #GMainContext (if null, the global-default
     *   main context will be used)
     * @return the ID (greater than 0) for the source within the
     *   #GMainContext.
     */
    public fun attach(context: MainContext? = null): guint =
        g_source_attach(glibSourcePointer, context?.glibMainContextPointer)

    /**
     * Removes a source from its #GMainContext, if any, and mark it as
     * destroyed.  The source cannot be subsequently added to another
     * context. It is safe to call this on sources which have already been
     * removed from their context.
     *
     * This does not unref the #GSource: if you still hold a reference, use
     * g_source_unref() to drop it.
     *
     * This function is safe to call from any thread, regardless of which thread
     * the #GMainContext is running in.
     *
     * If the source is currently attached to a #GMainContext, destroying it
     * will effectively unset the callback similar to calling g_source_set_callback().
     * This can mean, that the data's #GDestroyNotify gets called right away.
     */
    public fun destroy(): Unit = g_source_destroy(glibSourcePointer)

    /**
     * Checks whether a source is allowed to be called recursively.
     * see g_source_set_can_recurse().
     *
     * @return whether recursion is allowed.
     */
    public fun getCanRecurse(): Boolean = g_source_get_can_recurse(glibSourcePointer).asBoolean()

    /**
     * Gets the #GMainContext with which the source is associated.
     *
     * You can call this on a source that has been destroyed, provided
     * that the #GMainContext it was attached to still exists (in which
     * case it will return that #GMainContext). In particular, you can
     * always call this function on the source returned from
     * g_main_current_source(). But calling this function on a source
     * whose #GMainContext has been destroyed is an error.
     *
     * @return the #GMainContext with which the
     *               source is associated, or null if the context has not
     *               yet been added to a source.
     */
    public fun getContext(): MainContext? = g_source_get_context(glibSourcePointer)?.run {
        MainContext(this)
    }

    /**
     * This function ignores @source and is otherwise the same as
     * g_get_current_time().
     *
     * @param timeval #GTimeVal structure in which to store current time.
     */
    public fun getCurrentTime(timeval: TimeVal): Unit =
        g_source_get_current_time(glibSourcePointer, timeval.glibTimeValPointer)

    /**
     * Returns the numeric ID for a particular source. The ID of a source
     * is a positive integer which is unique within a particular main loop
     * context. The reverse
     * mapping from ID to source is done by g_main_context_find_source_by_id().
     *
     * You can only call this function while the source is associated to a
     * #GMainContext instance; calling this function before g_source_attach()
     * or after g_source_destroy() yields undefined behavior. The ID returned
     * is unique within the #GMainContext instance passed to g_source_attach().
     *
     * @return the ID (greater than 0) for the source
     */
    public fun getId(): guint = g_source_get_id(glibSourcePointer)

    /**
     * Gets a name for the source, used in debugging and profiling.  The
     * name may be #NULL if it has never been set with g_source_set_name().
     *
     * @return the name of the source
     * @since 2.26
     */
    @GLibVersion2_26
    public fun getName(): String? = g_source_get_name(glibSourcePointer)?.toKString()

    /**
     * Gets the priority of a source.
     *
     * @return the priority of the source
     */
    public fun getPriority(): gint = g_source_get_priority(glibSourcePointer)

    /**
     * Gets the "ready time" of @source, as set by
     * g_source_set_ready_time().
     *
     * Any time before or equal to the current monotonic time (including 0)
     * is an indication that the source will fire immediately.
     *
     * @return the monotonic ready time, -1 for "never"
     */
    public fun getReadyTime(): gint64 = g_source_get_ready_time(glibSourcePointer)

    /**
     * Gets the time to be used when checking this source. The advantage of
     * calling this function over calling g_get_monotonic_time() directly is
     * that when checking multiple sources, GLib can cache a single value
     * instead of having to repeatedly get the system monotonic time.
     *
     * The time here is the system monotonic time, if available, or some
     * other reasonable alternative otherwise.  See g_get_monotonic_time().
     *
     * @return the monotonic time in microseconds
     * @since 2.28
     */
    @GLibVersion2_28
    public fun getTime(): gint64 = g_source_get_time(glibSourcePointer)

    /**
     * Returns whether @source has been destroyed.
     *
     * This is important when you operate upon your objects
     * from within idle handlers, but may have freed the object
     * before the dispatch of your idle handler.
     *
     * |[<!-- language="C" -->
     * static gboolean
     * idle_callback (gpointer data)
     * {
     *   SomeWidget *self = data;
     *
     *   g_mutex_lock (&self->idle_id_mutex);
     *   // do stuff with self
     *   self->idle_id = 0;
     *   g_mutex_unlock (&self->idle_id_mutex);
     *
     *   return G_SOURCE_REMOVE;
     * }
     *
     * static void
     * some_widget_do_stuff_later (SomeWidget *self)
     * {
     *   g_mutex_lock (&self->idle_id_mutex);
     *   self->idle_id = g_idle_add (idle_callback, self);
     *   g_mutex_unlock (&self->idle_id_mutex);
     * }
     *
     * static void
     * some_widget_init (SomeWidget *self)
     * {
     *   g_mutex_init (&self->idle_id_mutex);
     *
     *   // ...
     * }
     *
     * static void
     * some_widget_finalize (GObject *object)
     * {
     *   SomeWidget *self = SOME_WIDGET (object);
     *
     *   if (self->idle_id)
     *     g_source_remove (self->idle_id);
     *
     *   g_mutex_clear (&self->idle_id_mutex);
     *
     *   G_OBJECT_CLASS (parent_class)->finalize (object);
     * }
     * ]|
     *
     * This will fail in a multi-threaded application if the
     * widget is destroyed before the idle handler fires due
     * to the use after free in the callback. A solution, to
     * this particular problem, is to check to if the source
     * has already been destroy within the callback.
     *
     * |[<!-- language="C" -->
     * static gboolean
     * idle_callback (gpointer data)
     * {
     *   SomeWidget *self = data;
     *
     *   g_mutex_lock (&self->idle_id_mutex);
     *   if (!g_source_is_destroyed (g_main_current_source ()))
     *     {
     *       // do stuff with self
     *     }
     *   g_mutex_unlock (&self->idle_id_mutex);
     *
     *   return FALSE;
     * }
     * ]|
     *
     * Calls to this function from a thread other than the one acquired by the
     * #GMainContext the #GSource is attached to are typically redundant, as the
     * source could be destroyed immediately after this function returns. However,
     * once a source is destroyed it cannot be un-destroyed, so this function can be
     * used for opportunistic checks from any thread.
     *
     * @return true if the source has been destroyed
     * @since 2.12
     */
    @GLibVersion2_12
    public fun isDestroyed(): Boolean = g_source_is_destroyed(glibSourcePointer).asBoolean()

    /**
     * Updates the event mask to watch for the fd identified by @tag.
     *
     * @tag is the tag returned from g_source_add_unix_fd().
     *
     * If you want to remove a fd, don't set its event mask to zero.
     * Instead, call g_source_remove_unix_fd().
     *
     * This API is only intended to be used by implementations of #GSource.
     * Do not call this API on a #GSource that you did not create.
     *
     * As the name suggests, this function is not available on Windows.
     *
     * @param tag the tag from g_source_add_unix_fd()
     * @param newEvents the new event mask to watch
     * @since 2.36
     */
    @GLibVersion2_36
    public fun modifyUnixFd(tag: gpointer, newEvents: IoCondition): Unit =
        g_source_modify_unix_fd(glibSourcePointer, tag, newEvents.mask)

    /**
     * Queries the events reported for the fd corresponding to @tag on
     * @source during the last poll.
     *
     * The return value of this function is only defined when the function
     * is called from the check or dispatch functions for @source.
     *
     * This API is only intended to be used by implementations of #GSource.
     * Do not call this API on a #GSource that you did not create.
     *
     * As the name suggests, this function is not available on Windows.
     *
     * @param tag the tag from g_source_add_unix_fd()
     * @return the conditions reported on the fd
     * @since 2.36
     */
    @GLibVersion2_36
    public fun queryUnixFd(tag: gpointer): IoCondition = g_source_query_unix_fd(glibSourcePointer, tag).run {
        IoCondition(this)
    }

    /**
     * Increases the reference count on a source by one.
     *
     * @return @source
     */
    public fun ref(): Source = g_source_ref(glibSourcePointer)!!.run {
        Source(this)
    }

    /**
     * Detaches @child_source from @source and destroys it.
     *
     * This API is only intended to be used by implementations of #GSource.
     * Do not call this API on a #GSource that you did not create.
     *
     * @param childSource a #GSource previously passed to
     *     g_source_add_child_source().
     * @since 2.28
     */
    @GLibVersion2_28
    public fun removeChildSource(childSource: Source): Unit =
        g_source_remove_child_source(glibSourcePointer, childSource.glibSourcePointer)

    /**
     * Removes a file descriptor from the set of file descriptors polled for
     * this source.
     *
     * This API is only intended to be used by implementations of #GSource.
     * Do not call this API on a #GSource that you did not create.
     *
     * @param fd a #GPollFD structure previously passed to g_source_add_poll().
     */
    public fun removePoll(fd: PollFd): Unit = g_source_remove_poll(glibSourcePointer, fd.glibPollFdPointer)

    /**
     * Reverses the effect of a previous call to g_source_add_unix_fd().
     *
     * You only need to call this if you want to remove an fd from being
     * watched while keeping the same source around.  In the normal case you
     * will just want to destroy the source.
     *
     * This API is only intended to be used by implementations of #GSource.
     * Do not call this API on a #GSource that you did not create.
     *
     * As the name suggests, this function is not available on Windows.
     *
     * @param tag the tag from g_source_add_unix_fd()
     * @since 2.36
     */
    @GLibVersion2_36
    public fun removeUnixFd(tag: gpointer): Unit = g_source_remove_unix_fd(glibSourcePointer, tag)

    /**
     * Sets the callback function for a source. The callback for a source is
     * called from the source's dispatch function.
     *
     * The exact type of @func depends on the type of source; ie. you
     * should not count on @func being called with @data as its first
     * parameter. Cast @func with G_SOURCE_FUNC() to avoid warnings about
     * incompatible function types.
     *
     * See [memory management of sources][mainloop-memory-management] for details
     * on how to handle memory management of @data.
     *
     * Typically, you won't use this function. Instead use functions specific
     * to the type of source you are using, such as g_idle_add() or g_timeout_add().
     *
     * It is safe to call this function multiple times on a source which has already
     * been attached to a context. The changes will take effect for the next time
     * the source is dispatched after this call returns.
     *
     * Note that g_source_destroy() for a currently attached source has the effect
     * of also unsetting the callback.
     *
     * @param func a callback function
     */
    public fun setCallback(func: SourceFunc): Unit = g_source_set_callback(
        glibSourcePointer,
        SourceFuncFunc.reinterpret(),
        StableRef.create(func).asCPointer(),
        staticStableRefDestroy.reinterpret()
    )

    /**
     * Sets the callback function storing the data as a refcounted callback
     * "object". This is used internally. Note that calling
     * g_source_set_callback_indirect() assumes
     * an initial reference count on @callback_data, and thus
     * @callback_funcs->unref will eventually be called once more
     * than @callback_funcs->ref.
     *
     * It is safe to call this function multiple times on a source which has already
     * been attached to a context. The changes will take effect for the next time
     * the source is dispatched after this call returns.
     *
     * @param callbackData pointer to callback data "object"
     * @param callbackFuncs functions for reference counting @callback_data
     *                  and getting the callback and data
     */
    public fun setCallbackIndirect(callbackData: gpointer? = null, callbackFuncs: SourceCallbackFuncs): Unit =
        g_source_set_callback_indirect(glibSourcePointer, callbackData, callbackFuncs.glibSourceCallbackFuncsPointer)

    /**
     * Sets whether a source can be called recursively. If @can_recurse is
     * true, then while the source is being dispatched then this source
     * will be processed normally. Otherwise, all processing of this
     * source is blocked until the dispatch function returns.
     *
     * @param canRecurse whether recursion is allowed for this source
     */
    public fun setCanRecurse(canRecurse: Boolean): Unit =
        g_source_set_can_recurse(glibSourcePointer, canRecurse.asGBoolean())

    /**
     * Sets the source functions (can be used to override
     * default implementations) of an unattached source.
     *
     * @param funcs the new #GSourceFuncs
     * @since 2.12
     */
    @GLibVersion2_12
    public fun setFuncs(funcs: SourceFuncs): Unit = g_source_set_funcs(glibSourcePointer, funcs.glibSourceFuncsPointer)

    /**
     * Sets a name for the source, used in debugging and profiling.
     * The name defaults to #NULL.
     *
     * The source name should describe in a human-readable way
     * what the source does. For example, "X11 event queue"
     * or "GTK repaint idle handler" or whatever it is.
     *
     * It is permitted to call this function multiple times, but is not
     * recommended due to the potential performance impact.  For example,
     * one could change the name in the "check" function of a #GSourceFuncs
     * to include details like the event type in the source name.
     *
     * Use caution if changing the name while another thread may be
     * accessing it with g_source_get_name(); that function does not copy
     * the value, and changing the value will free it while the other thread
     * may be attempting to use it.
     *
     * Also see g_source_set_static_name().
     *
     * @param name debug name for the source
     * @since 2.26
     */
    @GLibVersion2_26
    public fun setName(name: String): Unit = g_source_set_name(glibSourcePointer, name)

    /**
     * Sets the priority of a source. While the main loop is being run, a
     * source will be dispatched if it is ready to be dispatched and no
     * sources at a higher (numerically smaller) priority are ready to be
     * dispatched.
     *
     * A child source always has the same priority as its parent.  It is not
     * permitted to change the priority of a source once it has been added
     * as a child of another source.
     *
     * @param priority the new priority.
     */
    public fun setPriority(priority: gint): Unit = g_source_set_priority(glibSourcePointer, priority)

    /**
     * Sets a #GSource to be dispatched when the given monotonic time is
     * reached (or passed).  If the monotonic time is in the past (as it
     * always will be if @ready_time is 0) then the source will be
     * dispatched immediately.
     *
     * If @ready_time is -1 then the source is never woken up on the basis
     * of the passage of time.
     *
     * Dispatching the source does not reset the ready time.  You should do
     * so yourself, from the source dispatch function.
     *
     * Note that if you have a pair of sources where the ready time of one
     * suggests that it will be delivered first but the priority for the
     * other suggests that it would be delivered first, and the ready time
     * for both sources is reached during the same main context iteration,
     * then the order of dispatch is undefined.
     *
     * It is a no-op to call this function on a #GSource which has already been
     * destroyed with g_source_destroy().
     *
     * This API is only intended to be used by implementations of #GSource.
     * Do not call this API on a #GSource that you did not create.
     *
     * @param readyTime the monotonic time at which the source will be ready,
     *              0 for "immediately", -1 for "never"
     * @since 2.36
     */
    @GLibVersion2_36
    public fun setReadyTime(readyTime: gint64): Unit = g_source_set_ready_time(glibSourcePointer, readyTime)

    /**
     * A variant of g_source_set_name() that does not
     * duplicate the @name, and can only be used with
     * string literals.
     *
     * @param name debug name for the source
     * @since 2.70
     */
    @GLibVersion2_70
    public fun setStaticName(name: String): Unit = g_source_set_static_name(glibSourcePointer, name)

    /**
     * Decreases the reference count of a source by one. If the
     * resulting reference count is zero the source and associated
     * memory will be destroyed.
     */
    public fun unref(): Unit = g_source_unref(glibSourcePointer)

    public companion object {
        /**
         * Creates a new #GSource structure. The size is specified to
         * allow creating structures derived from #GSource that contain
         * additional data. The size passed in must be at least
         * `sizeof (GSource)`.
         *
         * The source will not initially be associated with any #GMainContext
         * and must be added to one with g_source_attach() before it will be
         * executed.
         *
         * @param sourceFuncs structure containing functions that implement
         *                the sources behavior.
         * @param structSize size of the #GSource structure to create.
         * @return the newly-created #GSource.
         */
        public fun new(sourceFuncs: SourceFuncs, structSize: guint): Source =
            Source(g_source_new(sourceFuncs.glibSourceFuncsPointer, structSize)!!.reinterpret())

        /**
         * Removes the source with the given ID from the default main context. You must
         * use g_source_destroy() for sources added to a non-default main context.
         *
         * The ID of a #GSource is given by g_source_get_id(), or will be
         * returned by the functions g_source_attach(), g_idle_add(),
         * g_idle_add_full(), g_timeout_add(), g_timeout_add_full(),
         * g_child_watch_add(), g_child_watch_add_full(), g_io_add_watch(), and
         * g_io_add_watch_full().
         *
         * It is a programmer error to attempt to remove a non-existent source.
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
         * @param tag the ID of the source to remove.
         * @return true if the source was found and removed.
         */
        public fun remove(tag: guint): Boolean = g_source_remove(tag).asBoolean()

        /**
         * Removes a source from the default main loop context given the
         * source functions and user data. If multiple sources exist with the
         * same source functions and user data, only one will be destroyed.
         *
         * @param funcs The @source_funcs passed to g_source_new()
         * @param userData the user data for the callback
         * @return true if a source was found and removed.
         */
        public fun removeByFuncsUserData(funcs: SourceFuncs, userData: gpointer? = null): Boolean =
            g_source_remove_by_funcs_user_data(funcs.glibSourceFuncsPointer, userData).asBoolean()

        /**
         * Removes a source from the default main loop context given the user
         * data for the callback. If multiple sources exist with the same user
         * data, only one will be destroyed.
         *
         * @param userData the user_data for the callback.
         * @return true if a source was found and removed.
         */
        public fun removeByUserData(userData: gpointer? = null): Boolean =
            g_source_remove_by_user_data(userData).asBoolean()

        /**
         * Sets the name of a source using its ID.
         *
         * This is a convenience utility to set source names from the return
         * value of g_idle_add(), g_timeout_add(), etc.
         *
         * It is a programmer error to attempt to set the name of a non-existent
         * source.
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
         * @param tag a #GSource ID
         * @param name debug name for the source
         * @since 2.26
         */
        @GLibVersion2_26
        public fun setNameById(tag: guint, name: String): Unit = g_source_set_name_by_id(tag, name)

        /**
         * Get the GType of Source
         *
         * @return the GType
         */
        public fun getType(): GType = g_source_get_type()
    }
}
