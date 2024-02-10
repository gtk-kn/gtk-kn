// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.glib.GAsciiType
import org.gtkkn.native.glib.G_ASCII_ALNUM
import org.gtkkn.native.glib.G_ASCII_ALPHA
import org.gtkkn.native.glib.G_ASCII_CNTRL
import org.gtkkn.native.glib.G_ASCII_DIGIT
import org.gtkkn.native.glib.G_ASCII_GRAPH
import org.gtkkn.native.glib.G_ASCII_LOWER
import org.gtkkn.native.glib.G_ASCII_PRINT
import org.gtkkn.native.glib.G_ASCII_PUNCT
import org.gtkkn.native.glib.G_ASCII_SPACE
import org.gtkkn.native.glib.G_ASCII_UPPER
import org.gtkkn.native.glib.G_ASCII_XDIGIT

public class AsciiType(
    public val mask: GAsciiType,
) : Bitfield<AsciiType> {
    override infix fun or(other: AsciiType): AsciiType = AsciiType(mask or other.mask)

    public companion object {
        public val ALNUM: AsciiType = AsciiType(G_ASCII_ALNUM)

        public val ALPHA: AsciiType = AsciiType(G_ASCII_ALPHA)

        public val CNTRL: AsciiType = AsciiType(G_ASCII_CNTRL)

        public val DIGIT: AsciiType = AsciiType(G_ASCII_DIGIT)

        public val GRAPH: AsciiType = AsciiType(G_ASCII_GRAPH)

        public val LOWER: AsciiType = AsciiType(G_ASCII_LOWER)

        public val PRINT: AsciiType = AsciiType(G_ASCII_PRINT)

        public val PUNCT: AsciiType = AsciiType(G_ASCII_PUNCT)

        public val SPACE: AsciiType = AsciiType(G_ASCII_SPACE)

        public val UPPER: AsciiType = AsciiType(G_ASCII_UPPER)

        public val XDIGIT: AsciiType = AsciiType(G_ASCII_XDIGIT)
    }
}
