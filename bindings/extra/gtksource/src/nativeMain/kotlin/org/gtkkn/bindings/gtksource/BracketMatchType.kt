// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceBracketMatchType
import org.gtkkn.native.gtksource.gtk_source_bracket_match_type_get_type

public enum class BracketMatchType(public val nativeValue: GtkSourceBracketMatchType) {
    /**
     * there is no bracket to match.
     */
    NONE(GtkSourceBracketMatchType.GTK_SOURCE_BRACKET_MATCH_NONE),

    /**
     * matching a bracket
     *  failed because the maximum range was reached.
     */
    OUT_OF_RANGE(GtkSourceBracketMatchType.GTK_SOURCE_BRACKET_MATCH_OUT_OF_RANGE),

    /**
     * a matching bracket was not found.
     */
    NOT_FOUND(GtkSourceBracketMatchType.GTK_SOURCE_BRACKET_MATCH_NOT_FOUND),

    /**
     * a matching bracket was found.
     */
    FOUND(GtkSourceBracketMatchType.GTK_SOURCE_BRACKET_MATCH_FOUND),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSourceBracketMatchType): BracketMatchType = when (nativeValue) {
            GtkSourceBracketMatchType.GTK_SOURCE_BRACKET_MATCH_NONE -> NONE
            GtkSourceBracketMatchType.GTK_SOURCE_BRACKET_MATCH_OUT_OF_RANGE -> OUT_OF_RANGE
            GtkSourceBracketMatchType.GTK_SOURCE_BRACKET_MATCH_NOT_FOUND -> NOT_FOUND
            GtkSourceBracketMatchType.GTK_SOURCE_BRACKET_MATCH_FOUND -> FOUND
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of BracketMatchType
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_bracket_match_type_get_type()
    }
}
