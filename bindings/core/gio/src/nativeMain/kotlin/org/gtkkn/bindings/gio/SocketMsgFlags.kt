// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GSocketMsgFlags
import org.gtkkn.native.gio.G_SOCKET_MSG_DONTROUTE
import org.gtkkn.native.gio.G_SOCKET_MSG_NONE
import org.gtkkn.native.gio.G_SOCKET_MSG_OOB
import org.gtkkn.native.gio.G_SOCKET_MSG_PEEK

/**
 * Flags used in g_socket_receive_message() and g_socket_send_message().
 * The flags listed in the enum are some commonly available flags, but the
 * values used for them are the same as on the platform, and any other flags
 * are passed in/out as is. So to use a platform specific flag, just include
 * the right system header and pass in the flag.
 * @since 2.22
 */
public class SocketMsgFlags(
    public val mask: GSocketMsgFlags,
) : Bitfield<SocketMsgFlags> {
    override infix fun or(other: SocketMsgFlags): SocketMsgFlags = SocketMsgFlags(mask or other.mask)

    public companion object {
        /**
         * No flags.
         */
        public val NONE: SocketMsgFlags = SocketMsgFlags(G_SOCKET_MSG_NONE)

        /**
         * Request to send/receive out of band data.
         */
        public val OOB: SocketMsgFlags = SocketMsgFlags(G_SOCKET_MSG_OOB)

        /**
         * Read data from the socket without removing it from
         *     the queue.
         */
        public val PEEK: SocketMsgFlags = SocketMsgFlags(G_SOCKET_MSG_PEEK)

        /**
         * Don't use a gateway to send out the packet,
         *     only send to hosts on directly connected networks.
         */
        public val DONTROUTE: SocketMsgFlags = SocketMsgFlags(G_SOCKET_MSG_DONTROUTE)
    }
}
