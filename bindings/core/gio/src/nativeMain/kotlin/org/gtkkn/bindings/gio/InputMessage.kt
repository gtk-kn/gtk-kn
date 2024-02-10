// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gio.GInputMessage
import kotlin.Int
import kotlin.UInt
import kotlin.ULong

/**
 * Structure used for scatter/gather data input when receiving multiple
 * messages or packets in one go. You generally pass in an array of empty
 * #GInputVectors and the operation will use all the buffers as if they
 * were one buffer, and will set @bytes_received to the total number of bytes
 * received across all #GInputVectors.
 *
 * This structure closely mirrors `struct mmsghdr` and `struct msghdr` from
 * the POSIX sockets API (see `man 2 recvmmsg`).
 *
 * If @address is non-null then it is set to the source address the message
 * was received from, and the caller must free it afterwards.
 *
 * If @control_messages is non-null then it is set to an array of control
 * messages received with the message (if any), and the caller must free it
 * afterwards. @num_control_messages is set to the number of elements in
 * this array, which may be zero.
 *
 * Flags relevant to this message will be returned in @flags. For example,
 * `MSG_EOR` or `MSG_TRUNC`.
 *
 * ## Skipped during bindings generation
 *
 * - field `vectors`: Fields with arrays are not supported
 * - field `control_messages`: Fields with arrays are not supported
 * - field `num_control_messages`: Unsupported pointer to primitive type
 *
 * @since 2.48
 */
public class InputMessage(
    pointer: CPointer<GInputMessage>,
) : Record {
    public val gioInputMessagePointer: CPointer<GInputMessage> = pointer

    /**
     * return location
     *   for a #GSocketAddress, or null
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val address: SocketAddress?
        get() =
            gioInputMessagePointer.pointed.address?.run {
                SocketAddress(reinterpret())
            }

    /**
     * the number of input vectors pointed to by @vectors
     */
    public var numVectors: UInt
        get() = gioInputMessagePointer.pointed.num_vectors
        set(`value`) {
            gioInputMessagePointer.pointed.num_vectors = value
        }

    /**
     * will be set to the number of bytes that have been
     *   received
     */
    public var bytesReceived: ULong
        get() = gioInputMessagePointer.pointed.bytes_received
        set(`value`) {
            gioInputMessagePointer.pointed.bytes_received = value
        }

    /**
     * collection of #GSocketMsgFlags for the received message,
     *   outputted by the call
     */
    public var flags: Int
        get() = gioInputMessagePointer.pointed.flags
        set(`value`) {
            gioInputMessagePointer.pointed.flags = value
        }

    public companion object : RecordCompanion<InputMessage, GInputMessage> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): InputMessage =
            InputMessage(pointer.reinterpret())
    }
}
