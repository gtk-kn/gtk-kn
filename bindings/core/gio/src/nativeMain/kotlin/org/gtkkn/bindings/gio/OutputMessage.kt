// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_44
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gio.GOutputMessage
import kotlin.UInt

/**
 * Structure used for scatter/gather data output when sending multiple
 * messages or packets in one go. You generally pass in an array of
 * #GOutputVectors and the operation will use all the buffers as if they
 * were one buffer.
 *
 * If @address is null then the message is sent to the default receiver
 * (as previously set by g_socket_connect()).
 *
 * ## Skipped during bindings generation
 *
 * - field `control_messages`: Fields with arrays are not supported
 *
 * @since 2.44
 */
@GioVersion2_44
public class OutputMessage(
    pointer: CPointer<GOutputMessage>,
) : Record {
    public val gioOutputMessagePointer: CPointer<GOutputMessage> = pointer

    /**
     * a #GSocketAddress, or null
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val address: SocketAddress?
        get() =
            gioOutputMessagePointer.pointed.address?.run {
                SocketAddress(reinterpret())
            }

    /**
     * pointer to an array of output vectors
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val vectors: OutputVector?
        get() =
            gioOutputMessagePointer.pointed.vectors?.run {
                OutputVector(reinterpret())
            }

    /**
     * the number of output vectors pointed to by @vectors.
     */
    public var numVectors: UInt
        get() = gioOutputMessagePointer.pointed.num_vectors
        set(`value`) {
            gioOutputMessagePointer.pointed.num_vectors = value
        }

    /**
     * initialize to 0. Will be set to the number of bytes
     *     that have been sent
     */
    public var bytesSent: UInt
        get() = gioOutputMessagePointer.pointed.bytes_sent
        set(`value`) {
            gioOutputMessagePointer.pointed.bytes_sent = value
        }

    /**
     * number of elements in @control_messages.
     */
    public var numControlMessages: UInt
        get() = gioOutputMessagePointer.pointed.num_control_messages
        set(`value`) {
            gioOutputMessagePointer.pointed.num_control_messages = value
        }

    public companion object : RecordCompanion<OutputMessage, GOutputMessage> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): OutputMessage =
            OutputMessage(pointer.reinterpret())
    }
}
