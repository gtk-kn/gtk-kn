// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.harfbuzz.HB_BUFFER_SERIALIZE_FLAG_DEFAULT
import org.gtkkn.native.harfbuzz.HB_BUFFER_SERIALIZE_FLAG_GLYPH_EXTENTS
import org.gtkkn.native.harfbuzz.HB_BUFFER_SERIALIZE_FLAG_GLYPH_FLAGS
import org.gtkkn.native.harfbuzz.HB_BUFFER_SERIALIZE_FLAG_NO_ADVANCES
import org.gtkkn.native.harfbuzz.HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS
import org.gtkkn.native.harfbuzz.HB_BUFFER_SERIALIZE_FLAG_NO_GLYPH_NAMES
import org.gtkkn.native.harfbuzz.HB_BUFFER_SERIALIZE_FLAG_NO_POSITIONS
import org.gtkkn.native.harfbuzz.hb_buffer_serialize_flags_t

/**
 * Flags that control what glyph information are serialized in hb_buffer_serialize_glyphs().
 * @since 0.9.20
 */
public class BufferSerializeFlags(
    public val mask: hb_buffer_serialize_flags_t,
) : Bitfield<BufferSerializeFlags> {
    override infix fun or(other: BufferSerializeFlags): BufferSerializeFlags = BufferSerializeFlags(mask or other.mask)

    public companion object {
        /**
         * serialize glyph names, clusters and positions.
         */
        public val DEFAULT: BufferSerializeFlags =
            BufferSerializeFlags(HB_BUFFER_SERIALIZE_FLAG_DEFAULT)

        /**
         * do not serialize glyph cluster.
         */
        public val NO_CLUSTERS: BufferSerializeFlags =
            BufferSerializeFlags(HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS)

        /**
         * do not serialize glyph position information.
         */
        public val NO_POSITIONS: BufferSerializeFlags =
            BufferSerializeFlags(HB_BUFFER_SERIALIZE_FLAG_NO_POSITIONS)

        /**
         * do no serialize glyph name.
         */
        public val NO_GLYPH_NAMES: BufferSerializeFlags =
            BufferSerializeFlags(HB_BUFFER_SERIALIZE_FLAG_NO_GLYPH_NAMES)

        /**
         * serialize glyph extents.
         */
        public val GLYPH_EXTENTS: BufferSerializeFlags =
            BufferSerializeFlags(HB_BUFFER_SERIALIZE_FLAG_GLYPH_EXTENTS)

        /**
         * serialize glyph flags. Since: 1.5.0
         */
        public val GLYPH_FLAGS: BufferSerializeFlags =
            BufferSerializeFlags(HB_BUFFER_SERIALIZE_FLAG_GLYPH_FLAGS)

        /**
         * do not serialize glyph advances,
         *  glyph offsets will reflect absolute glyph positions. Since: 1.8.0
         */
        public val NO_ADVANCES: BufferSerializeFlags =
            BufferSerializeFlags(HB_BUFFER_SERIALIZE_FLAG_NO_ADVANCES)
    }
}
