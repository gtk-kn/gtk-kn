// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkCssParserWarning

/**
 * Warnings that can occur while parsing CSS.
 *
 * Unlike `GtkCssParserError`s, warnings do not cause the parser to
 * skip any input, but they indicate issues that should be fixed.
 */
public enum class CssParserWarning(public val nativeValue: GtkCssParserWarning) {
    /**
     * The given construct is
     *   deprecated and will be removed in a future version
     */
    DEPRECATED(GtkCssParserWarning.GTK_CSS_PARSER_WARNING_DEPRECATED),

    /**
     * A syntax construct was used
     *   that should be avoided
     */
    SYNTAX(GtkCssParserWarning.GTK_CSS_PARSER_WARNING_SYNTAX),

    /**
     * A feature is not implemented
     */
    UNIMPLEMENTED(GtkCssParserWarning.GTK_CSS_PARSER_WARNING_UNIMPLEMENTED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkCssParserWarning): CssParserWarning = when (nativeValue) {
            GtkCssParserWarning.GTK_CSS_PARSER_WARNING_DEPRECATED -> DEPRECATED
            GtkCssParserWarning.GTK_CSS_PARSER_WARNING_SYNTAX -> SYNTAX
            GtkCssParserWarning.GTK_CSS_PARSER_WARNING_UNIMPLEMENTED -> UNIMPLEMENTED
            else -> error("invalid nativeValue")
        }
    }
}
