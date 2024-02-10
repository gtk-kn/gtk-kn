// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.glib.GFormatSizeFlags
import org.gtkkn.native.glib.G_FORMAT_SIZE_BITS
import org.gtkkn.native.glib.G_FORMAT_SIZE_DEFAULT
import org.gtkkn.native.glib.G_FORMAT_SIZE_IEC_UNITS
import org.gtkkn.native.glib.G_FORMAT_SIZE_LONG_FORMAT

/**
 * Flags to modify the format of the string returned by g_format_size_full().
 */
public class FormatSizeFlags(
    public val mask: GFormatSizeFlags,
) : Bitfield<FormatSizeFlags> {
    override infix fun or(other: FormatSizeFlags): FormatSizeFlags = FormatSizeFlags(mask or other.mask)

    public companion object {
        /**
         * behave the same as g_format_size()
         */
        public val DEFAULT: FormatSizeFlags = FormatSizeFlags(G_FORMAT_SIZE_DEFAULT)

        /**
         * include the exact number of bytes as part
         *     of the returned string.  For example, "45.6 kB (45,612 bytes)".
         */
        public val LONG_FORMAT: FormatSizeFlags = FormatSizeFlags(G_FORMAT_SIZE_LONG_FORMAT)

        /**
         * use IEC (base 1024) units with "KiB"-style
         *     suffixes. IEC units should only be used for reporting things with
         *     a strong "power of 2" basis, like RAM sizes or RAID stripe sizes.
         *     Network and storage sizes should be reported in the normal SI units.
         */
        public val IEC_UNITS: FormatSizeFlags = FormatSizeFlags(G_FORMAT_SIZE_IEC_UNITS)

        /**
         * set the size as a quantity in bits, rather than
         *     bytes, and return units in bits. For example, ‘Mb’ rather than ‘MB’.
         */
        public val BITS: FormatSizeFlags = FormatSizeFlags(G_FORMAT_SIZE_BITS)
    }
}
