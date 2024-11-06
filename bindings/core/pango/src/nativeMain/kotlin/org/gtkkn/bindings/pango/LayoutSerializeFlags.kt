// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.bindings.pango.annotations.PangoVersion1_50
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.pango.PANGO_LAYOUT_SERIALIZE_CONTEXT
import org.gtkkn.native.pango.PANGO_LAYOUT_SERIALIZE_DEFAULT
import org.gtkkn.native.pango.PANGO_LAYOUT_SERIALIZE_OUTPUT
import org.gtkkn.native.pango.PangoLayoutSerializeFlags

/**
 * Flags that influence the behavior of [method@Pango.Layout.serialize].
 *
 * New members may be added to this enumeration over time.
 * @since 1.50
 */
public class LayoutSerializeFlags(
    public val mask: PangoLayoutSerializeFlags,
) : Bitfield<LayoutSerializeFlags> {
    override infix fun or(other: LayoutSerializeFlags): LayoutSerializeFlags = LayoutSerializeFlags(mask or other.mask)

    @PangoVersion1_50
    public companion object {
        /**
         * Default behavior
         */
        public val DEFAULT: LayoutSerializeFlags =
            LayoutSerializeFlags(PANGO_LAYOUT_SERIALIZE_DEFAULT)

        /**
         * Include context information
         */
        public val CONTEXT: LayoutSerializeFlags =
            LayoutSerializeFlags(PANGO_LAYOUT_SERIALIZE_CONTEXT)

        /**
         * Include information about the formatted output
         */
        public val OUTPUT: LayoutSerializeFlags =
            LayoutSerializeFlags(PANGO_LAYOUT_SERIALIZE_OUTPUT)
    }
}
