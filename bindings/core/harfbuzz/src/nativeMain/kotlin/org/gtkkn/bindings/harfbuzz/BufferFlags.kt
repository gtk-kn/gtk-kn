// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.harfbuzz.HB_BUFFER_FLAG_BOT
import org.gtkkn.native.harfbuzz.HB_BUFFER_FLAG_DEFAULT
import org.gtkkn.native.harfbuzz.HB_BUFFER_FLAG_DO_NOT_INSERT_DOTTED_CIRCLE
import org.gtkkn.native.harfbuzz.HB_BUFFER_FLAG_EOT
import org.gtkkn.native.harfbuzz.HB_BUFFER_FLAG_PRESERVE_DEFAULT_IGNORABLES
import org.gtkkn.native.harfbuzz.HB_BUFFER_FLAG_REMOVE_DEFAULT_IGNORABLES
import org.gtkkn.native.harfbuzz.hb_buffer_flags_t

/**
 *
 * @since 0.9.20
 */
public class BufferFlags(
    public val mask: hb_buffer_flags_t,
) : Bitfield<BufferFlags> {
    override infix fun or(other: BufferFlags): BufferFlags = BufferFlags(mask or other.mask)

    public companion object {
        /**
         * the default buffer flag.
         */
        public val DEFAULT: BufferFlags = BufferFlags(HB_BUFFER_FLAG_DEFAULT)

        /**
         * flag indicating that special handling of the beginning
         *                      of text paragraph can be applied to this buffer. Should usually
         *                      be set, unless you are passing to the buffer only part
         *                      of the text without the full context.
         */
        public val BOT: BufferFlags = BufferFlags(HB_BUFFER_FLAG_BOT)

        /**
         * flag indicating that special handling of the end of text
         *                      paragraph can be applied to this buffer, similar to
         *                      @HB_BUFFER_FLAG_BOT.
         */
        public val EOT: BufferFlags = BufferFlags(HB_BUFFER_FLAG_EOT)

        /**
         * flag indication that character with Default_Ignorable
         *                      Unicode property should use the corresponding glyph
         *                      from the font, instead of hiding them (done by
         *                      replacing them with the space glyph and zeroing the
         *                      advance width.)  This flag takes precedence over
         *                      @HB_BUFFER_FLAG_REMOVE_DEFAULT_IGNORABLES.
         */
        public val PRESERVE_DEFAULT_IGNORABLES: BufferFlags =
            BufferFlags(HB_BUFFER_FLAG_PRESERVE_DEFAULT_IGNORABLES)

        /**
         * flag indication that character with Default_Ignorable
         *                      Unicode property should be removed from glyph string
         *                      instead of hiding them (done by replacing them with the
         *                      space glyph and zeroing the advance width.)
         *                      @HB_BUFFER_FLAG_PRESERVE_DEFAULT_IGNORABLES takes
         *                      precedence over this flag. Since: 1.8.0
         */
        public val REMOVE_DEFAULT_IGNORABLES: BufferFlags =
            BufferFlags(HB_BUFFER_FLAG_REMOVE_DEFAULT_IGNORABLES)

        /**
         * flag indicating that a dotted circle should
         *                      not be inserted in the rendering of incorrect
         *                      character sequences (such at <0905 093E>). Since: 2.4
         */
        public val DO_NOT_INSERT_DOTTED_CIRCLE: BufferFlags =
            BufferFlags(HB_BUFFER_FLAG_DO_NOT_INSERT_DOTTED_CIRCLE)
    }
}
