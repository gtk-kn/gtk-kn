// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkFilterMatch

/**
 * Describes the known strictness of a filter.
 *
 * Note that for filters where the strictness is not known,
 * %GTK_FILTER_MATCH_SOME is always an acceptable value,
 * even if a filter does match all or no items.
 */
public enum class FilterMatch(
    public val nativeValue: GtkFilterMatch,
) {
    /**
     * The filter matches some items,
     *   gtk_filter_match() may return true or false
     */
    SOME(GtkFilterMatch.GTK_FILTER_MATCH_SOME),

    /**
     * The filter does not match any item,
     *   gtk_filter_match() will always return false.
     */
    NONE(GtkFilterMatch.GTK_FILTER_MATCH_NONE),

    /**
     * The filter matches all items,
     *   gtk_filter_match() will alays return true.
     */
    ALL(GtkFilterMatch.GTK_FILTER_MATCH_ALL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkFilterMatch): FilterMatch =
            when (nativeValue) {
                GtkFilterMatch.GTK_FILTER_MATCH_SOME -> SOME
                GtkFilterMatch.GTK_FILTER_MATCH_NONE -> NONE
                GtkFilterMatch.GTK_FILTER_MATCH_ALL -> ALL
                else -> error("invalid nativeValue")
            }
    }
}
