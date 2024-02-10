// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.harfbuzz.HB_BUFFER_DIFF_FLAG_CLUSTER_MISMATCH
import org.gtkkn.native.harfbuzz.HB_BUFFER_DIFF_FLAG_CODEPOINT_MISMATCH
import org.gtkkn.native.harfbuzz.HB_BUFFER_DIFF_FLAG_CONTENT_TYPE_MISMATCH
import org.gtkkn.native.harfbuzz.HB_BUFFER_DIFF_FLAG_DOTTED_CIRCLE_PRESENT
import org.gtkkn.native.harfbuzz.HB_BUFFER_DIFF_FLAG_EQUAL
import org.gtkkn.native.harfbuzz.HB_BUFFER_DIFF_FLAG_GLYPH_FLAGS_MISMATCH
import org.gtkkn.native.harfbuzz.HB_BUFFER_DIFF_FLAG_LENGTH_MISMATCH
import org.gtkkn.native.harfbuzz.HB_BUFFER_DIFF_FLAG_NOTDEF_PRESENT
import org.gtkkn.native.harfbuzz.HB_BUFFER_DIFF_FLAG_POSITION_MISMATCH
import org.gtkkn.native.harfbuzz.hb_buffer_diff_flags_t

public class BufferDiffFlags(
    public val mask: hb_buffer_diff_flags_t,
) : Bitfield<BufferDiffFlags> {
    override infix fun or(other: BufferDiffFlags): BufferDiffFlags = BufferDiffFlags(mask or other.mask)

    public companion object {
        public val EQUAL: BufferDiffFlags = BufferDiffFlags(HB_BUFFER_DIFF_FLAG_EQUAL)

        public val CONTENT_TYPE_MISMATCH: BufferDiffFlags =
            BufferDiffFlags(HB_BUFFER_DIFF_FLAG_CONTENT_TYPE_MISMATCH)

        public val LENGTH_MISMATCH: BufferDiffFlags =
            BufferDiffFlags(HB_BUFFER_DIFF_FLAG_LENGTH_MISMATCH)

        public val NOTDEF_PRESENT: BufferDiffFlags =
            BufferDiffFlags(HB_BUFFER_DIFF_FLAG_NOTDEF_PRESENT)

        public val DOTTED_CIRCLE_PRESENT: BufferDiffFlags =
            BufferDiffFlags(HB_BUFFER_DIFF_FLAG_DOTTED_CIRCLE_PRESENT)

        public val CODEPOINT_MISMATCH: BufferDiffFlags =
            BufferDiffFlags(HB_BUFFER_DIFF_FLAG_CODEPOINT_MISMATCH)

        public val CLUSTER_MISMATCH: BufferDiffFlags =
            BufferDiffFlags(HB_BUFFER_DIFF_FLAG_CLUSTER_MISMATCH)

        public val GLYPH_FLAGS_MISMATCH: BufferDiffFlags =
            BufferDiffFlags(HB_BUFFER_DIFF_FLAG_GLYPH_FLAGS_MISMATCH)

        public val POSITION_MISMATCH: BufferDiffFlags =
            BufferDiffFlags(HB_BUFFER_DIFF_FLAG_POSITION_MISMATCH)
    }
}
