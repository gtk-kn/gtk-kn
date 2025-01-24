// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_22
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GSocketMsgFlags
import org.gtkkn.native.gio.G_SOCKET_MSG_DONTROUTE
import org.gtkkn.native.gio.G_SOCKET_MSG_NONE
import org.gtkkn.native.gio.G_SOCKET_MSG_OOB
import org.gtkkn.native.gio.G_SOCKET_MSG_PEEK
import org.gtkkn.native.gio.g_socket_msg_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags used in g_socket_receive_message() and g_socket_send_message().
 * The flags listed in the enum are some commonly available flags, but the
 * values used for them are the same as on the platform, and any other flags
 * are passed in/out as is. So to use a platform specific flag, just include
 * the right system header and pass in the flag.
 * @since 2.22
 */
public class SocketMsgFlags(public val mask: GSocketMsgFlags) : Bitfield<SocketMsgFlags> {
    override infix fun or(other: SocketMsgFlags): SocketMsgFlags = SocketMsgFlags(mask or other.mask)

    @GioVersion2_22
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

        /**
         * Get the GType of SocketMsgFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_socket_msg_flags_get_type()
    }
}
