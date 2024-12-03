// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GSignalMatchType
import org.gtkkn.native.gobject.G_SIGNAL_MATCH_CLOSURE
import org.gtkkn.native.gobject.G_SIGNAL_MATCH_DATA
import org.gtkkn.native.gobject.G_SIGNAL_MATCH_DETAIL
import org.gtkkn.native.gobject.G_SIGNAL_MATCH_FUNC
import org.gtkkn.native.gobject.G_SIGNAL_MATCH_ID
import org.gtkkn.native.gobject.G_SIGNAL_MATCH_UNBLOCKED

/**
 * The match types specify what g_signal_handlers_block_matched(),
 * g_signal_handlers_unblock_matched() and g_signal_handlers_disconnect_matched()
 * match signals by.
 */
public class SignalMatchType(public val mask: GSignalMatchType) : Bitfield<SignalMatchType> {
    override infix fun or(other: SignalMatchType): SignalMatchType = SignalMatchType(mask or other.mask)

    public companion object {
        /**
         * The signal id must be equal.
         */
        public val ID: SignalMatchType = SignalMatchType(G_SIGNAL_MATCH_ID)

        /**
         * The signal detail must be equal.
         */
        public val DETAIL: SignalMatchType = SignalMatchType(G_SIGNAL_MATCH_DETAIL)

        /**
         * The closure must be the same.
         */
        public val CLOSURE: SignalMatchType = SignalMatchType(G_SIGNAL_MATCH_CLOSURE)

        /**
         * The C closure callback must be the same.
         */
        public val FUNC: SignalMatchType = SignalMatchType(G_SIGNAL_MATCH_FUNC)

        /**
         * The closure data must be the same.
         */
        public val DATA: SignalMatchType = SignalMatchType(G_SIGNAL_MATCH_DATA)

        /**
         * Only unblocked signals may be matched.
         */
        public val UNBLOCKED: SignalMatchType = SignalMatchType(G_SIGNAL_MATCH_UNBLOCKED)
    }
}
