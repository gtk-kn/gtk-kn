// This is a generated file. Do not modify.
package org.gtkkn.bindings.harfbuzz

import org.gtkkn.native.harfbuzz.hb_buffer_content_type_t
import org.gtkkn.native.harfbuzz.hb_buffer_content_type_t.HB_BUFFER_CONTENT_TYPE_GLYPHS
import org.gtkkn.native.harfbuzz.hb_buffer_content_type_t.HB_BUFFER_CONTENT_TYPE_INVALID
import org.gtkkn.native.harfbuzz.hb_buffer_content_type_t.HB_BUFFER_CONTENT_TYPE_UNICODE

public enum class BufferContentType(
    public val nativeValue: hb_buffer_content_type_t,
) {
    /**
     * Initial value for new buffer.
     */
    INVALID(HB_BUFFER_CONTENT_TYPE_INVALID),

    /**
     * The buffer contains input characters (before shaping).
     */
    UNICODE(HB_BUFFER_CONTENT_TYPE_UNICODE),

    /**
     * The buffer contains output glyphs (after shaping).
     */
    GLYPHS(HB_BUFFER_CONTENT_TYPE_GLYPHS),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: hb_buffer_content_type_t): BufferContentType =
            when (nativeValue) {
                HB_BUFFER_CONTENT_TYPE_INVALID -> INVALID
                HB_BUFFER_CONTENT_TYPE_UNICODE -> UNICODE
                HB_BUFFER_CONTENT_TYPE_GLYPHS -> GLYPHS
                else -> error("invalid nativeValue")
            }
    }
}
