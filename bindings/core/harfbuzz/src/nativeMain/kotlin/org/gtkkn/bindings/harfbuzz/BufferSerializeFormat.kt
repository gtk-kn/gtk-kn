// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import org.gtkkn.native.harfbuzz.hb_buffer_serialize_format_t
import org.gtkkn.native.harfbuzz.hb_buffer_serialize_format_t.HB_BUFFER_SERIALIZE_FORMAT_INVALID
import org.gtkkn.native.harfbuzz.hb_buffer_serialize_format_t.HB_BUFFER_SERIALIZE_FORMAT_JSON
import org.gtkkn.native.harfbuzz.hb_buffer_serialize_format_t.HB_BUFFER_SERIALIZE_FORMAT_TEXT

/**
 * The buffer serialization and de-serialization format used in
 * hb_buffer_serialize_glyphs() and hb_buffer_deserialize_glyphs().
 * @since 0.9.2
 */
public enum class BufferSerializeFormat(
    public val nativeValue: hb_buffer_serialize_format_t,
) {
    /**
     * a human-readable, plain text format.
     */
    TEXT(HB_BUFFER_SERIALIZE_FORMAT_TEXT),

    /**
     * a machine-readable JSON format.
     */
    JSON(HB_BUFFER_SERIALIZE_FORMAT_JSON),

    /**
     * invalid format.
     */
    INVALID(HB_BUFFER_SERIALIZE_FORMAT_INVALID),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: hb_buffer_serialize_format_t): BufferSerializeFormat =
            when (nativeValue) {
                HB_BUFFER_SERIALIZE_FORMAT_TEXT -> TEXT
                HB_BUFFER_SERIALIZE_FORMAT_JSON -> JSON
                HB_BUFFER_SERIALIZE_FORMAT_INVALID -> INVALID
                else -> error("invalid nativeValue")
            }
    }
}
