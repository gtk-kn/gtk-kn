// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GSocketControlMessage
import org.gtkkn.native.gio.g_socket_control_message_get_level
import org.gtkkn.native.gio.g_socket_control_message_get_msg_type
import org.gtkkn.native.gio.g_socket_control_message_get_size
import org.gtkkn.native.gio.g_socket_control_message_get_type
import org.gtkkn.native.gio.g_socket_control_message_serialize
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.gobject.GType
import kotlin.Unit

/**
 * A `GSocketControlMessage` is a special-purpose utility message that
 * can be sent to or received from a [class@Gio.Socket]. These types of
 * messages are often called ‘ancillary data’.
 *
 * The message can represent some sort of special instruction to or
 * information from the socket or can represent a special kind of
 * transfer to the peer (for example, sending a file descriptor over
 * a UNIX socket).
 *
 * These messages are sent with [method@Gio.Socket.send_message] and received
 * with [method@Gio.Socket.receive_message].
 *
 * To extend the set of control message that can be sent, subclass this
 * class and override the `get_size`, `get_level`, `get_type` and `serialize`
 * methods.
 *
 * To extend the set of control messages that can be received, subclass
 * this class and implement the `deserialize` method. Also, make sure your
 * class is registered with the [type@GObject.Type] type system before calling
 * [method@Gio.Socket.receive_message] to read such a message.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `data`: Array parameter of type guint8 is not supported
 *
 * @since 2.22
 */
@GioVersion2_22
public abstract class SocketControlMessage(
    public val gioSocketControlMessagePointer: CPointer<GSocketControlMessage>,
) : Object(gioSocketControlMessagePointer.reinterpret()),
    KGTyped {
    /**
     * Returns the "level" (i.e. the originating protocol) of the control message.
     * This is often SOL_SOCKET.
     *
     * @return an integer describing the level
     * @since 2.22
     */
    @GioVersion2_22
    public open fun getLevel(): gint = g_socket_control_message_get_level(gioSocketControlMessagePointer)

    /**
     * Returns the protocol specific type of the control message.
     * For instance, for UNIX fd passing this would be SCM_RIGHTS.
     *
     * @return an integer describing the type of control message
     * @since 2.22
     */
    @GioVersion2_22
    public open fun getMsgType(): gint = g_socket_control_message_get_msg_type(gioSocketControlMessagePointer)

    /**
     * Returns the space required for the control message, not including
     * headers or alignment.
     *
     * @return The number of bytes required.
     * @since 2.22
     */
    @GioVersion2_22
    public open fun getSize(): gsize = g_socket_control_message_get_size(gioSocketControlMessagePointer)

    /**
     * Converts the data in the message to bytes placed in the
     * message.
     *
     * @data is guaranteed to have enough space to fit the size
     * returned by g_socket_control_message_get_size() on this
     * object.
     *
     * @param data A buffer to write data to
     * @since 2.22
     */
    @GioVersion2_22
    public open fun serialize(`data`: gpointer): Unit =
        g_socket_control_message_serialize(gioSocketControlMessagePointer, `data`)

    /**
     * The SocketControlMessageImpl type represents a native instance of the abstract SocketControlMessage class.
     *
     * @constructor Creates a new instance of SocketControlMessage for the provided [CPointer].
     */
    public class SocketControlMessageImpl(pointer: CPointer<GSocketControlMessage>) : SocketControlMessage(pointer)

    public companion object : TypeCompanion<SocketControlMessage> {
        override val type: GeneratedClassKGType<SocketControlMessage> =
            GeneratedClassKGType(g_socket_control_message_get_type()) { SocketControlMessageImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of SocketControlMessage
         *
         * @return the GType
         */
        public fun getType(): GType = g_socket_control_message_get_type()
    }
}
