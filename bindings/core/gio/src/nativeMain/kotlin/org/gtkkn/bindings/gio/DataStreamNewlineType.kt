// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GDataStreamNewlineType
import org.gtkkn.native.gio.g_data_stream_newline_type_get_type
import org.gtkkn.native.gobject.GType

/**
 * #GDataStreamNewlineType is used when checking for or setting the line endings for a given file.
 */
public enum class DataStreamNewlineType(public val nativeValue: GDataStreamNewlineType) {
    /**
     * Selects "LF" line endings, common on most modern UNIX platforms.
     */
    LF(GDataStreamNewlineType.G_DATA_STREAM_NEWLINE_TYPE_LF),

    /**
     * Selects "CR" line endings.
     */
    CR(GDataStreamNewlineType.G_DATA_STREAM_NEWLINE_TYPE_CR),

    /**
     * Selects "CR, LF" line ending, common on Microsoft Windows.
     */
    CR_LF(GDataStreamNewlineType.G_DATA_STREAM_NEWLINE_TYPE_CR_LF),

    /**
     * Automatically try to handle any line ending type.
     */
    ANY(GDataStreamNewlineType.G_DATA_STREAM_NEWLINE_TYPE_ANY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GDataStreamNewlineType): DataStreamNewlineType = when (nativeValue) {
            GDataStreamNewlineType.G_DATA_STREAM_NEWLINE_TYPE_LF -> LF
            GDataStreamNewlineType.G_DATA_STREAM_NEWLINE_TYPE_CR -> CR
            GDataStreamNewlineType.G_DATA_STREAM_NEWLINE_TYPE_CR_LF -> CR_LF
            GDataStreamNewlineType.G_DATA_STREAM_NEWLINE_TYPE_ANY -> ANY
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of DataStreamNewlineType
         *
         * @return the GType
         */
        public fun getType(): GType = g_data_stream_newline_type_get_type()
    }
}
