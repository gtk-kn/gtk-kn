// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GMarkupError
import org.gtkkn.native.glib.GMarkupError.G_MARKUP_ERROR_BAD_UTF8
import org.gtkkn.native.glib.GMarkupError.G_MARKUP_ERROR_EMPTY
import org.gtkkn.native.glib.GMarkupError.G_MARKUP_ERROR_INVALID_CONTENT
import org.gtkkn.native.glib.GMarkupError.G_MARKUP_ERROR_MISSING_ATTRIBUTE
import org.gtkkn.native.glib.GMarkupError.G_MARKUP_ERROR_PARSE
import org.gtkkn.native.glib.GMarkupError.G_MARKUP_ERROR_UNKNOWN_ATTRIBUTE
import org.gtkkn.native.glib.GMarkupError.G_MARKUP_ERROR_UNKNOWN_ELEMENT
import org.gtkkn.native.glib.g_quark_from_string
import kotlin.UInt

/**
 * Error codes returned by markup parsing.
 */
public enum class MarkupError(
    public val nativeValue: GMarkupError,
) {
    /**
     * text being parsed was not valid UTF-8
     */
    BAD_UTF8(G_MARKUP_ERROR_BAD_UTF8),

    /**
     * document contained nothing, or only whitespace
     */
    EMPTY(G_MARKUP_ERROR_EMPTY),

    /**
     * document was ill-formed
     */
    PARSE(G_MARKUP_ERROR_PARSE),

    /**
     * error should be set by #GMarkupParser
     *     functions; element wasn't known
     */
    UNKNOWN_ELEMENT(G_MARKUP_ERROR_UNKNOWN_ELEMENT),

    /**
     * error should be set by #GMarkupParser
     *     functions; attribute wasn't known
     */
    UNKNOWN_ATTRIBUTE(G_MARKUP_ERROR_UNKNOWN_ATTRIBUTE),

    /**
     * error should be set by #GMarkupParser
     *     functions; content was invalid
     */
    INVALID_CONTENT(G_MARKUP_ERROR_INVALID_CONTENT),

    /**
     * error should be set by #GMarkupParser
     *     functions; a required attribute was missing
     */
    MISSING_ATTRIBUTE(G_MARKUP_ERROR_MISSING_ATTRIBUTE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GMarkupError): MarkupError =
            when (nativeValue) {
                G_MARKUP_ERROR_BAD_UTF8 -> BAD_UTF8
                G_MARKUP_ERROR_EMPTY -> EMPTY
                G_MARKUP_ERROR_PARSE -> PARSE
                G_MARKUP_ERROR_UNKNOWN_ELEMENT -> UNKNOWN_ELEMENT
                G_MARKUP_ERROR_UNKNOWN_ATTRIBUTE -> UNKNOWN_ATTRIBUTE
                G_MARKUP_ERROR_INVALID_CONTENT -> INVALID_CONTENT
                G_MARKUP_ERROR_MISSING_ATTRIBUTE -> MISSING_ATTRIBUTE
                else -> error("invalid nativeValue")
            }

        public fun quark(): UInt = g_quark_from_string("g-markup-error-quark")

        public fun fromErrorOrNull(error: Error): MarkupError? =
            if (error.domain != quark()) {
                null
            } else {
                MarkupError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
