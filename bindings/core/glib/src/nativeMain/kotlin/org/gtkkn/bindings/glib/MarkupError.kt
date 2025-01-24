// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GMarkupError
import org.gtkkn.native.glib.g_quark_from_string
import kotlin.UInt

/**
 * Error codes returned by markup parsing.
 */
public enum class MarkupError(public val nativeValue: GMarkupError) {
    /**
     * text being parsed was not valid UTF-8
     */
    BAD_UTF8(GMarkupError.G_MARKUP_ERROR_BAD_UTF8),

    /**
     * document contained nothing, or only whitespace
     */
    EMPTY(GMarkupError.G_MARKUP_ERROR_EMPTY),

    /**
     * document was ill-formed
     */
    PARSE(GMarkupError.G_MARKUP_ERROR_PARSE),

    /**
     * error should be set by #GMarkupParser
     *     functions; element wasn't known
     */
    UNKNOWN_ELEMENT(GMarkupError.G_MARKUP_ERROR_UNKNOWN_ELEMENT),

    /**
     * error should be set by #GMarkupParser
     *     functions; attribute wasn't known
     */
    UNKNOWN_ATTRIBUTE(GMarkupError.G_MARKUP_ERROR_UNKNOWN_ATTRIBUTE),

    /**
     * error should be set by #GMarkupParser
     *     functions; content was invalid
     */
    INVALID_CONTENT(GMarkupError.G_MARKUP_ERROR_INVALID_CONTENT),

    /**
     * error should be set by #GMarkupParser
     *     functions; a required attribute was missing
     */
    MISSING_ATTRIBUTE(GMarkupError.G_MARKUP_ERROR_MISSING_ATTRIBUTE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GMarkupError): MarkupError = when (nativeValue) {
            GMarkupError.G_MARKUP_ERROR_BAD_UTF8 -> BAD_UTF8
            GMarkupError.G_MARKUP_ERROR_EMPTY -> EMPTY
            GMarkupError.G_MARKUP_ERROR_PARSE -> PARSE
            GMarkupError.G_MARKUP_ERROR_UNKNOWN_ELEMENT -> UNKNOWN_ELEMENT
            GMarkupError.G_MARKUP_ERROR_UNKNOWN_ATTRIBUTE -> UNKNOWN_ATTRIBUTE
            GMarkupError.G_MARKUP_ERROR_INVALID_CONTENT -> INVALID_CONTENT
            GMarkupError.G_MARKUP_ERROR_MISSING_ATTRIBUTE -> MISSING_ATTRIBUTE
            else -> error("invalid nativeValue")
        }

        public fun quark(): UInt = g_quark_from_string("g-markup-error-quark")

        public fun fromErrorOrNull(error: Error): MarkupError? = if (error.domain != quark()) {
            null
        } else {
            MarkupError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
