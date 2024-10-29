// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import org.gtkkn.native.gtksource.GtkSourceBracketMatchType
import org.gtkkn.native.gtksource.GtkSourceBracketMatchType.GTK_SOURCE_BRACKET_MATCH_FOUND
import org.gtkkn.native.gtksource.GtkSourceBracketMatchType.GTK_SOURCE_BRACKET_MATCH_NONE
import org.gtkkn.native.gtksource.GtkSourceBracketMatchType.GTK_SOURCE_BRACKET_MATCH_NOT_FOUND
import org.gtkkn.native.gtksource.GtkSourceBracketMatchType.GTK_SOURCE_BRACKET_MATCH_OUT_OF_RANGE

public enum class BracketMatchType(
    public val nativeValue: GtkSourceBracketMatchType,
) {
    /**
     * there is no bracket to match.
     */
    NONE(GTK_SOURCE_BRACKET_MATCH_NONE),

    /**
     * matching a bracket
     *  failed because the maximum range was reached.
     */
    OUT_OF_RANGE(GTK_SOURCE_BRACKET_MATCH_OUT_OF_RANGE),

    /**
     * a matching bracket was not found.
     */
    NOT_FOUND(GTK_SOURCE_BRACKET_MATCH_NOT_FOUND),

    /**
     * a matching bracket was found.
     */
    FOUND(GTK_SOURCE_BRACKET_MATCH_FOUND),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSourceBracketMatchType): BracketMatchType =
            when (nativeValue) {
                GTK_SOURCE_BRACKET_MATCH_NONE -> NONE
                GTK_SOURCE_BRACKET_MATCH_OUT_OF_RANGE -> OUT_OF_RANGE
                GTK_SOURCE_BRACKET_MATCH_NOT_FOUND -> NOT_FOUND
                GTK_SOURCE_BRACKET_MATCH_FOUND -> FOUND
                else -> error("invalid nativeValue")
            }
    }
}
