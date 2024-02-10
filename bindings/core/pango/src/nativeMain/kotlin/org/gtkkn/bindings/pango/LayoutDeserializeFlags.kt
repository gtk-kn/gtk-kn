// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.pango.PANGO_LAYOUT_DESERIALIZE_CONTEXT
import org.gtkkn.native.pango.PANGO_LAYOUT_DESERIALIZE_DEFAULT
import org.gtkkn.native.pango.PangoLayoutDeserializeFlags

/**
 * Flags that influence the behavior of [func@Pango.Layout.deserialize].
 *
 * New members may be added to this enumeration over time.
 * @since 1.50
 */
public class LayoutDeserializeFlags(
    public val mask: PangoLayoutDeserializeFlags,
) : Bitfield<LayoutDeserializeFlags> {
    override infix fun or(other: LayoutDeserializeFlags): LayoutDeserializeFlags =
        LayoutDeserializeFlags(mask or other.mask)

    public companion object {
        /**
         * Default behavior
         */
        public val DEFAULT: LayoutDeserializeFlags =
            LayoutDeserializeFlags(PANGO_LAYOUT_DESERIALIZE_DEFAULT)

        /**
         * Apply context information
         *   from the serialization to the `PangoContext`
         */
        public val CONTEXT: LayoutDeserializeFlags =
            LayoutDeserializeFlags(PANGO_LAYOUT_DESERIALIZE_CONTEXT)
    }
}
