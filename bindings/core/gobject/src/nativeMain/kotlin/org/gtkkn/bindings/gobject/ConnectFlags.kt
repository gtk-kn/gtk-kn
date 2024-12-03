// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GConnectFlags
import org.gtkkn.native.gobject.G_CONNECT_AFTER
import org.gtkkn.native.gobject.G_CONNECT_DEFAULT
import org.gtkkn.native.gobject.G_CONNECT_SWAPPED

/**
 * The connection flags are used to specify the behaviour of a signal's
 * connection.
 */
public class ConnectFlags(public val mask: GConnectFlags) : Bitfield<ConnectFlags> {
    override infix fun or(other: ConnectFlags): ConnectFlags = ConnectFlags(mask or other.mask)

    public companion object {
        /**
         * Default behaviour (no special flags). Since: 2.74
         */
        public val DEFAULT: ConnectFlags = ConnectFlags(G_CONNECT_DEFAULT)

        /**
         * If set, the handler should be called after the
         *  default handler of the signal. Normally, the handler is called before
         *  the default handler.
         */
        public val AFTER: ConnectFlags = ConnectFlags(G_CONNECT_AFTER)

        /**
         * If set, the instance and data should be swapped when
         *  calling the handler; see g_signal_connect_swapped() for an example.
         */
        public val SWAPPED: ConnectFlags = ConnectFlags(G_CONNECT_SWAPPED)
    }
}
