// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.PollFd
import org.gtkkn.bindings.glib.Source
import org.gtkkn.bindings.gobject.Callback
import org.gtkkn.bindings.gobject.CallbackFunc
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GCancellable
import org.gtkkn.native.gio.g_cancellable_cancel
import org.gtkkn.native.gio.g_cancellable_connect
import org.gtkkn.native.gio.g_cancellable_disconnect
import org.gtkkn.native.gio.g_cancellable_get_current
import org.gtkkn.native.gio.g_cancellable_get_fd
import org.gtkkn.native.gio.g_cancellable_get_type
import org.gtkkn.native.gio.g_cancellable_is_cancelled
import org.gtkkn.native.gio.g_cancellable_make_pollfd
import org.gtkkn.native.gio.g_cancellable_new
import org.gtkkn.native.gio.g_cancellable_pop_current
import org.gtkkn.native.gio.g_cancellable_push_current
import org.gtkkn.native.gio.g_cancellable_release_fd
import org.gtkkn.native.gio.g_cancellable_reset
import org.gtkkn.native.gio.g_cancellable_set_error_if_cancelled
import org.gtkkn.native.gio.g_cancellable_source_new
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gobject.gulong
import kotlin.Boolean
import kotlin.Result
import kotlin.ULong
import kotlin.Unit

/**
 * `GCancellable` allows operations to be cancelled.
 *
 * `GCancellable` is a thread-safe operation cancellation stack used
 * throughout GIO to allow for cancellation of synchronous and
 * asynchronous operations.
 */
public open class Cancellable(pointer: CPointer<GCancellable>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gioCancellablePointer: CPointer<GCancellable>
        get() = gPointer.reinterpret()

    /**
     * Creates a new #GCancellable object.
     *
     * Applications that want to start one or more operations
     * that should be cancellable should create a #GCancellable
     * and pass it to the operations.
     *
     * One #GCancellable can be used in multiple consecutive
     * operations or in multiple concurrent operations.
     *
     * @return a #GCancellable.
     */
    public constructor() : this(g_cancellable_new()!!.reinterpret())

    /**
     * Will set @cancellable to cancelled, and will emit the
     * #GCancellable::cancelled signal. (However, see the warning about
     * race conditions in the documentation for that signal if you are
     * planning to connect to it.)
     *
     * This function is thread-safe. In other words, you can safely call
     * it from a thread other than the one running the operation that was
     * passed the @cancellable.
     *
     * If @cancellable is null, this function returns immediately for convenience.
     *
     * The convention within GIO is that cancelling an asynchronous
     * operation causes it to complete asynchronously. That is, if you
     * cancel the operation from the same thread in which it is running,
     * then the operation's #GAsyncReadyCallback will not be invoked until
     * the application returns to the main loop.
     */
    public open fun cancel(): Unit = g_cancellable_cancel(gioCancellablePointer.reinterpret())

    /**
     * Convenience function to connect to the #GCancellable::cancelled
     * signal. Also handles the race condition that may happen
     * if the cancellable is cancelled right before connecting.
     *
     * @callback is called at most once, either directly at the
     * time of the connect if @cancellable is already cancelled,
     * or when @cancellable is cancelled in some thread.
     *
     * @data_destroy_func will be called when the handler is
     * disconnected, or immediately if the cancellable is already
     * cancelled.
     *
     * See #GCancellable::cancelled for details on how to use this.
     *
     * Since GLib 2.40, the lock protecting @cancellable is not held when
     * @callback is invoked.  This lifts a restriction in place for
     * earlier GLib versions which now makes it easier to write cleanup
     * code that unconditionally invokes e.g. g_cancellable_cancel().
     *
     * @param callback The #GCallback to connect.
     * @return The id of the signal handler or 0 if @cancellable has already
     *          been cancelled.
     * @since 2.22
     */
    @GioVersion2_22
    public open fun connect(callback: Callback): gulong = g_cancellable_connect(
        gioCancellablePointer.reinterpret(),
        CallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer(),
        staticStableRefDestroy.reinterpret()
    )

    /**
     * Disconnects a handler from a cancellable instance similar to
     * g_signal_handler_disconnect().  Additionally, in the event that a
     * signal handler is currently running, this call will block until the
     * handler has finished.  Calling this function from a
     * #GCancellable::cancelled signal handler will therefore result in a
     * deadlock.
     *
     * This avoids a race condition where a thread cancels at the
     * same time as the cancellable operation is finished and the
     * signal handler is removed. See #GCancellable::cancelled for
     * details on how to use this.
     *
     * If @cancellable is null or @handler_id is `0` this function does
     * nothing.
     *
     * @param handlerId Handler id of the handler to be disconnected, or `0`.
     * @since 2.22
     */
    @GioVersion2_22
    public open fun disconnect(handlerId: gulong): Unit =
        g_cancellable_disconnect(gioCancellablePointer.reinterpret(), handlerId)

    /**
     * Gets the file descriptor for a cancellable job. This can be used to
     * implement cancellable operations on Unix systems. The returned fd will
     * turn readable when @cancellable is cancelled.
     *
     * You are not supposed to read from the fd yourself, just check for
     * readable status. Reading to unset the readable status is done
     * with g_cancellable_reset().
     *
     * After a successful return from this function, you should use
     * g_cancellable_release_fd() to free up resources allocated for
     * the returned file descriptor.
     *
     * See also g_cancellable_make_pollfd().
     *
     * @return A valid file descriptor. `-1` if the file descriptor
     * is not supported, or on errors.
     */
    public open fun getFd(): gint = g_cancellable_get_fd(gioCancellablePointer.reinterpret())

    /**
     * Checks if a cancellable job has been cancelled.
     *
     * @return true if @cancellable is cancelled,
     * FALSE if called with null or if item is not cancelled.
     */
    public open fun isCancelled(): Boolean = g_cancellable_is_cancelled(gioCancellablePointer.reinterpret()).asBoolean()

    /**
     * Creates a #GPollFD corresponding to @cancellable; this can be passed
     * to g_poll() and used to poll for cancellation. This is useful both
     * for unix systems without a native poll and for portability to
     * windows.
     *
     * When this function returns true, you should use
     * g_cancellable_release_fd() to free up resources allocated for the
     * @pollfd. After a false return, do not call g_cancellable_release_fd().
     *
     * If this function returns false, either no @cancellable was given or
     * resource limits prevent this function from allocating the necessary
     * structures for polling. (On Linux, you will likely have reached
     * the maximum number of file descriptors.) The suggested way to handle
     * these cases is to ignore the @cancellable.
     *
     * You are not supposed to read from the fd yourself, just check for
     * readable status. Reading to unset the readable status is done
     * with g_cancellable_reset().
     *
     * @param pollfd a pointer to a #GPollFD
     * @return true if @pollfd was successfully initialized, false on
     *          failure to prepare the cancellable.
     * @since 2.22
     */
    @GioVersion2_22
    public open fun makePollfd(pollfd: PollFd): Boolean = g_cancellable_make_pollfd(
        gioCancellablePointer.reinterpret(),
        pollfd.glibPollFDPointer.reinterpret()
    ).asBoolean()

    /**
     * Pops @cancellable off the cancellable stack (verifying that @cancellable
     * is on the top of the stack).
     */
    public open fun popCurrent(): Unit = g_cancellable_pop_current(gioCancellablePointer.reinterpret())

    /**
     * Pushes @cancellable onto the cancellable stack. The current
     * cancellable can then be received using g_cancellable_get_current().
     *
     * This is useful when implementing cancellable operations in
     * code that does not allow you to pass down the cancellable object.
     *
     * This is typically called automatically by e.g. #GFile operations,
     * so you rarely have to call this yourself.
     */
    public open fun pushCurrent(): Unit = g_cancellable_push_current(gioCancellablePointer.reinterpret())

    /**
     * Releases a resources previously allocated by g_cancellable_get_fd()
     * or g_cancellable_make_pollfd().
     *
     * For compatibility reasons with older releases, calling this function
     * is not strictly required, the resources will be automatically freed
     * when the @cancellable is finalized. However, the @cancellable will
     * block scarce file descriptors until it is finalized if this function
     * is not called. This can cause the application to run out of file
     * descriptors when many #GCancellables are used at the same time.
     *
     * @since 2.22
     */
    @GioVersion2_22
    public open fun releaseFd(): Unit = g_cancellable_release_fd(gioCancellablePointer.reinterpret())

    /**
     * Resets @cancellable to its uncancelled state.
     *
     * If cancellable is currently in use by any cancellable operation
     * then the behavior of this function is undefined.
     *
     * Note that it is generally not a good idea to reuse an existing
     * cancellable for more operations after it has been cancelled once,
     * as this function might tempt you to do. The recommended practice
     * is to drop the reference to a cancellable after cancelling it,
     * and let it die with the outstanding async operations. You should
     * create a fresh cancellable for further async operations.
     */
    public open fun reset(): Unit = g_cancellable_reset(gioCancellablePointer.reinterpret())

    /**
     * If the @cancellable is cancelled, sets the error to notify
     * that the operation was cancelled.
     *
     * @return true if @cancellable was cancelled, false if it was not
     */
    public open fun setErrorIfCancelled(): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_cancellable_set_error_if_cancelled(gioCancellablePointer.reinterpret(), gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Creates a source that triggers if @cancellable is cancelled and
     * calls its callback of type #GCancellableSourceFunc. This is
     * primarily useful for attaching to another (non-cancellable) source
     * with g_source_add_child_source() to add cancellability to it.
     *
     * For convenience, you can call this with a null #GCancellable,
     * in which case the source will never trigger.
     *
     * The new #GSource will hold a reference to the #GCancellable.
     *
     * @return the new #GSource.
     * @since 2.28
     */
    @GioVersion2_28
    public open fun sourceNew(): Source = g_cancellable_source_new(gioCancellablePointer.reinterpret())!!.run {
        Source(reinterpret())
    }

    /**
     * Emitted when the operation has been cancelled.
     *
     * Can be used by implementations of cancellable operations. If the
     * operation is cancelled from another thread, the signal will be
     * emitted in the thread that cancelled the operation, not the
     * thread that is running the operation.
     *
     * Note that disconnecting from this signal (or any signal) in a
     * multi-threaded program is prone to race conditions. For instance
     * it is possible that a signal handler may be invoked even after
     * a call to g_signal_handler_disconnect() for that handler has
     * already returned.
     *
     * There is also a problem when cancellation happens right before
     * connecting to the signal. If this happens the signal will
     * unexpectedly not be emitted, and checking before connecting to
     * the signal leaves a race condition where this is still happening.
     *
     * In order to make it safe and easy to connect handlers there
     * are two helper functions: g_cancellable_connect() and
     * g_cancellable_disconnect() which protect against problems
     * like this.
     *
     * An example of how to us this:
     * |[<!-- language="C" -->
     *     // Make sure we don't do unnecessary work if already cancelled
     *     if (g_cancellable_set_error_if_cancelled (cancellable, error))
     *       return;
     *
     *     // Set up all the data needed to be able to handle cancellation
     *     // of the operation
     *     my_data = my_data_new (...);
     *
     *     id = 0;
     *     if (cancellable)
     *       id = g_cancellable_connect (cancellable,
     *     			      G_CALLBACK (cancelled_handler)
     *     			      data, NULL);
     *
     *     // cancellable operation here...
     *
     *     g_cancellable_disconnect (cancellable, id);
     *
     *     // cancelled_handler is never called after this, it is now safe
     *     // to free the data
     *     my_data_free (my_data);
     * ]|
     *
     * Note that the cancelled signal is emitted in the thread that
     * the user cancelled from, which may be the main thread. So, the
     * cancellable signal should not do something that can block.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectCancelled(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "cancelled",
            connectCancelledFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Cancellable> {
        override val type: GeneratedClassKGType<Cancellable> =
            GeneratedClassKGType(g_cancellable_get_type()) { Cancellable(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Gets the top cancellable from the stack.
         *
         * @return a #GCancellable from the top
         * of the stack, or null if the stack is empty.
         */
        public fun getCurrent(): Cancellable? = g_cancellable_get_current()?.run {
            Cancellable(reinterpret())
        }

        /**
         * Get the GType of Cancellable
         *
         * @return the GType
         */
        public fun getType(): GType = g_cancellable_get_type()
    }
}

private val connectCancelledFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
