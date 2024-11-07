// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkStringFilterMatchMode

/**
 * Specifies how search strings are matched inside text.
 */
public enum class StringFilterMatchMode(
    public val nativeValue: GtkStringFilterMatchMode,
) {
    /**
     * The search string and
     *   text must match exactly.
     */
    EXACT(GtkStringFilterMatchMode.GTK_STRING_FILTER_MATCH_MODE_EXACT),

    /**
     * The search string
     *   must be contained as a substring inside the text.
     */
    SUBSTRING(GtkStringFilterMatchMode.GTK_STRING_FILTER_MATCH_MODE_SUBSTRING),

    /**
     * The text must begin
     *   with the search string.
     */
    PREFIX(GtkStringFilterMatchMode.GTK_STRING_FILTER_MATCH_MODE_PREFIX),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkStringFilterMatchMode): StringFilterMatchMode =
            when (nativeValue) {
                GtkStringFilterMatchMode.GTK_STRING_FILTER_MATCH_MODE_EXACT -> EXACT
                GtkStringFilterMatchMode.GTK_STRING_FILTER_MATCH_MODE_SUBSTRING -> SUBSTRING
                GtkStringFilterMatchMode.GTK_STRING_FILTER_MATCH_MODE_PREFIX -> PREFIX
                else -> error("invalid nativeValue")
            }
    }
}
