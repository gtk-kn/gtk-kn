// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.atk.ATK_HYPERLINK_IS_INLINE
import org.gtkkn.native.atk.AtkHyperlinkStateFlags

/**
 * Describes the type of link
 */
public class HyperlinkStateFlags(
    public val mask: AtkHyperlinkStateFlags,
) : Bitfield<HyperlinkStateFlags> {
    override infix fun or(other: HyperlinkStateFlags): HyperlinkStateFlags = HyperlinkStateFlags(mask or other.mask)

    public companion object {
        /**
         * Link is inline
         */
        public val INLINE: HyperlinkStateFlags = HyperlinkStateFlags(ATK_HYPERLINK_IS_INLINE)
    }
}
