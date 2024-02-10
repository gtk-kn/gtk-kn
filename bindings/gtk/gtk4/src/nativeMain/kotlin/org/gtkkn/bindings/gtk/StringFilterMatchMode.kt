// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkStringFilterMatchMode
import org.gtkkn.native.gtk.GtkStringFilterMatchMode.GTK_STRING_FILTER_MATCH_MODE_EXACT
import org.gtkkn.native.gtk.GtkStringFilterMatchMode.GTK_STRING_FILTER_MATCH_MODE_PREFIX
import org.gtkkn.native.gtk.GtkStringFilterMatchMode.GTK_STRING_FILTER_MATCH_MODE_SUBSTRING

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
    EXACT(GTK_STRING_FILTER_MATCH_MODE_EXACT),

    /**
     * The search string
     *   must be contained as a substring inside the text.
     */
    SUBSTRING(GTK_STRING_FILTER_MATCH_MODE_SUBSTRING),

    /**
     * The text must begin
     *   with the search string.
     */
    PREFIX(GTK_STRING_FILTER_MATCH_MODE_PREFIX),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkStringFilterMatchMode): StringFilterMatchMode =
            when (nativeValue) {
                GTK_STRING_FILTER_MATCH_MODE_EXACT -> EXACT
                GTK_STRING_FILTER_MATCH_MODE_SUBSTRING -> SUBSTRING
                GTK_STRING_FILTER_MATCH_MODE_PREFIX -> PREFIX
                else -> error("invalid nativeValue")
            }
    }
}
