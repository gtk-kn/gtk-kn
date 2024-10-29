// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GDatagramBased
import org.gtkkn.native.gio.g_datagram_based_get_type

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
 * - parameter `condition`: C Type GIOCondition is ignored
 * - parameter `condition`: C Type GIOCondition is ignored
 * - parameter `condition`: C Type GIOCondition is ignored
 * - parameter `messages`: InputMessage
 * - parameter `messages`: OutputMessage
 *
 * @since 2.48
 */
public interface DatagramBased : Interface, KGTyped {
    public val gioDatagramBasedPointer: CPointer<GDatagramBased>

    private data class Wrapper(
        private val pointer: CPointer<GDatagramBased>,
    ) : DatagramBased {
        override val gioDatagramBasedPointer: CPointer<GDatagramBased> = pointer
    }

    public companion object : TypeCompanion<DatagramBased> {
        override val type: GeneratedInterfaceKGType<DatagramBased> =
            GeneratedInterfaceKGType(g_datagram_based_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GDatagramBased>): DatagramBased = Wrapper(pointer)
    }
}
