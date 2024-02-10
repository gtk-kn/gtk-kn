// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GDataStreamNewlineType
import org.gtkkn.native.gio.GDataStreamNewlineType.G_DATA_STREAM_NEWLINE_TYPE_ANY
import org.gtkkn.native.gio.GDataStreamNewlineType.G_DATA_STREAM_NEWLINE_TYPE_CR
import org.gtkkn.native.gio.GDataStreamNewlineType.G_DATA_STREAM_NEWLINE_TYPE_CR_LF
import org.gtkkn.native.gio.GDataStreamNewlineType.G_DATA_STREAM_NEWLINE_TYPE_LF

/**
 * #GDataStreamNewlineType is used when checking for or setting the line endings for a given file.
 */
public enum class DataStreamNewlineType(
    public val nativeValue: GDataStreamNewlineType,
) {
    /**
     * Selects "LF" line endings, common on most modern UNIX platforms.
     */
    LF(G_DATA_STREAM_NEWLINE_TYPE_LF),

    /**
     * Selects "CR" line endings.
     */
    CR(G_DATA_STREAM_NEWLINE_TYPE_CR),

    /**
     * Selects "CR, LF" line ending, common on Microsoft Windows.
     */
    CR_LF(G_DATA_STREAM_NEWLINE_TYPE_CR_LF),

    /**
     * Automatically try to handle any line ending type.
     */
    ANY(G_DATA_STREAM_NEWLINE_TYPE_ANY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GDataStreamNewlineType): DataStreamNewlineType =
            when (nativeValue) {
                G_DATA_STREAM_NEWLINE_TYPE_LF -> LF
                G_DATA_STREAM_NEWLINE_TYPE_CR -> CR
                G_DATA_STREAM_NEWLINE_TYPE_CR_LF -> CR_LF
                G_DATA_STREAM_NEWLINE_TYPE_ANY -> ANY
                else -> error("invalid nativeValue")
            }
    }
}
