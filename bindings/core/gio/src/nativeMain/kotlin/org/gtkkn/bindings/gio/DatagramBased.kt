// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_48
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.IoCondition
import org.gtkkn.bindings.glib.Source
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GDatagramBased
import org.gtkkn.native.gio.g_datagram_based_condition_check
import org.gtkkn.native.gio.g_datagram_based_condition_wait
import org.gtkkn.native.gio.g_datagram_based_create_source
import org.gtkkn.native.gio.g_datagram_based_get_type
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gint64
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Result

/**
 * Interface for socket-like objects with datagram semantics.
 *
 * A `GDatagramBased` is a networking interface for representing datagram-based
 * communications. It is a more or less direct mapping of the core parts of the
 * BSD socket API in a portable GObject interface. It is implemented by
 * [class@Gio.Socket], which wraps the UNIX socket API on UNIX and winsock2 on Windows.
 *
 * `GDatagramBased` is entirely platform independent, and is intended to be used
 * alongside higher-level networking APIs such as [class@Gio.IOStream].
 *
 * It uses vectored scatter/gather I/O by default, allowing for many messages
 * to be sent or received in a single call. Where possible, implementations of
 * the interface should take advantage of vectored I/O to minimise processing
 * or system calls. For example, `GSocket` uses `recvmmsg()` and `sendmmsg()`
 * where possible. Callers should take advantage of scatter/gather I/O (the use of
 * multiple buffers per message) to avoid unnecessary copying of data to
 * assemble or disassemble a message.
 *
 * Each `GDatagramBased` operation has a timeout parameter which may be negative
 * for blocking behaviour, zero for non-blocking behaviour, or positive for
 * timeout behaviour. A blocking operation blocks until finished or there is an
 * error. A non-blocking operation will return immediately with a
 * `G_IO_ERROR_WOULD_BLOCK` error if it cannot make progress. A timeout operation
 * will block until the operation is complete or the timeout expires; if the
 * timeout expires it will return what progress it made, or
 * `G_IO_ERROR_TIMED_OUT` if no progress was made. To know when a call would
 * successfully run you can call [method@Gio.DatagramBased.condition_check] or
 * [method@Gio.DatagramBased.condition_wait]. You can also use
 * [method@Gio.DatagramBased.create_source] and attach it to a [struct@GLib.MainContext]
 * to get callbacks when I/O is possible.
 *
 * When running a non-blocking operation applications should always be able to
 * handle getting a `G_IO_ERROR_WOULD_BLOCK` error even when some other function
 * said that I/O was possible. This can easily happen in case of a race
 * condition in the application, but it can also happen for other reasons. For
 * instance, on Windows a socket is always seen as writable until a write
 * returns `G_IO_ERROR_WOULD_BLOCK`.
 *
 * As with `GSocket`, `GDatagramBased`s can be either connection oriented (for
 * example, SCTP) or connectionless (for example, UDP). `GDatagramBased`s must be
 * datagram-based, not stream-based. The interface does not cover connection
 * establishment — use methods on the underlying type to establish a connection
 * before sending and receiving data through the `GDatagramBased` API. For
 * connectionless socket types the target/source address is specified or
 * received in each I/O operation.
 *
 * Like most other APIs in GLib, `GDatagramBased` is not inherently thread safe.
 * To use a `GDatagramBased` concurrently from multiple threads, you must
 * implement your own locking.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `messages`: Array parameter of type InputMessage is not supported
 * - parameter `messages`: Array parameter of type OutputMessage is not supported
 *
 * @since 2.48
 */
@GioVersion2_48
public interface DatagramBased :
    Interface,
    KGTyped {
    public val gioDatagramBasedPointer: CPointer<GDatagramBased>

    /**
     * Checks on the readiness of @datagram_based to perform operations. The
     * operations specified in @condition are checked for and masked against the
     * currently-satisfied conditions on @datagram_based. The result is returned.
     *
     * %G_IO_IN will be set in the return value if data is available to read with
     * g_datagram_based_receive_messages(), or if the connection is closed remotely
     * (EOS); and if the datagram_based has not been closed locally using some
     * implementation-specific method (such as g_socket_close() or
     * g_socket_shutdown() with @shutdown_read set, if it’s a #GSocket).
     *
     * If the connection is shut down or closed (by calling g_socket_close() or
     * g_socket_shutdown() with @shutdown_read set, if it’s a #GSocket, for
     * example), all calls to this function will return %G_IO_ERROR_CLOSED.
     *
     * %G_IO_OUT will be set if it is expected that at least one byte can be sent
     * using g_datagram_based_send_messages() without blocking. It will not be set
     * if the datagram_based has been closed locally.
     *
     * %G_IO_HUP will be set if the connection has been closed locally.
     *
     * %G_IO_ERR will be set if there was an asynchronous error in transmitting data
     * previously enqueued using g_datagram_based_send_messages().
     *
     * Note that on Windows, it is possible for an operation to return
     * %G_IO_ERROR_WOULD_BLOCK even immediately after
     * g_datagram_based_condition_check() has claimed that the #GDatagramBased is
     * ready for writing. Rather than calling g_datagram_based_condition_check() and
     * then writing to the #GDatagramBased if it succeeds, it is generally better to
     * simply try writing right away, and try again later if the initial attempt
     * returns %G_IO_ERROR_WOULD_BLOCK.
     *
     * It is meaningless to specify %G_IO_ERR or %G_IO_HUP in @condition; these
     * conditions will always be set in the output if they are true. Apart from
     * these flags, the output is guaranteed to be masked by @condition.
     *
     * This call never blocks.
     *
     * @param condition a #GIOCondition mask to check
     * @return the #GIOCondition mask of the current state
     * @since 2.48
     */
    @GioVersion2_48
    public fun conditionCheck(condition: IoCondition): IoCondition =
        g_datagram_based_condition_check(gioDatagramBasedPointer.reinterpret(), condition.mask).run {
            IoCondition(this)
        }

    /**
     * Waits for up to @timeout microseconds for condition to become true on
     * @datagram_based. If the condition is met, true is returned.
     *
     * If @cancellable is cancelled before the condition is met, or if @timeout is
     * reached before the condition is met, then false is returned and @error is
     * set appropriately (%G_IO_ERROR_CANCELLED or %G_IO_ERROR_TIMED_OUT).
     *
     * @param condition a #GIOCondition mask to wait for
     * @param timeout the maximum time (in microseconds) to wait, 0 to not block, or -1
     *   to block indefinitely
     * @param cancellable a #GCancellable
     * @return true if the condition was met, false otherwise
     * @since 2.48
     */
    @GioVersion2_48
    public fun conditionWait(
        condition: IoCondition,
        timeout: gint64,
        cancellable: Cancellable? = null,
    ): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_datagram_based_condition_wait(
            gioDatagramBasedPointer.reinterpret(),
            condition.mask,
            timeout,
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Creates a #GSource that can be attached to a #GMainContext to monitor for
     * the availability of the specified @condition on the #GDatagramBased. The
     * #GSource keeps a reference to the @datagram_based.
     *
     * The callback on the source is of the #GDatagramBasedSourceFunc type.
     *
     * It is meaningless to specify %G_IO_ERR or %G_IO_HUP in @condition; these
     * conditions will always be reported in the callback if they are true.
     *
     * If non-null, @cancellable can be used to cancel the source, which will
     * cause the source to trigger, reporting the current condition (which is
     * likely 0 unless cancellation happened at the same time as a condition
     * change). You can check for this in the callback using
     * g_cancellable_is_cancelled().
     *
     * @param condition a #GIOCondition mask to monitor
     * @param cancellable a #GCancellable
     * @return a newly allocated #GSource
     * @since 2.48
     */
    @GioVersion2_48
    public fun createSource(condition: IoCondition, cancellable: Cancellable? = null): Source =
        g_datagram_based_create_source(
            gioDatagramBasedPointer.reinterpret(),
            condition.mask,
            cancellable?.gioCancellablePointer?.reinterpret()
        )!!.run {
            Source(reinterpret())
        }

    private data class Wrapper(private val pointer: CPointer<GDatagramBased>) : DatagramBased {
        override val gioDatagramBasedPointer: CPointer<GDatagramBased> = pointer
    }

    public companion object : TypeCompanion<DatagramBased> {
        override val type: GeneratedInterfaceKGType<DatagramBased> =
            GeneratedInterfaceKGType(g_datagram_based_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GDatagramBased>): DatagramBased = Wrapper(pointer)

        /**
         * Get the GType of DatagramBased
         *
         * @return the GType
         */
        public fun getType(): GType = g_datagram_based_get_type()
    }
}
