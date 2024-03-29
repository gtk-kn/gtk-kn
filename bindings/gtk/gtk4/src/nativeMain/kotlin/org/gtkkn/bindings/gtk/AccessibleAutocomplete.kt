// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkAccessibleAutocomplete
import org.gtkkn.native.gtk.GtkAccessibleAutocomplete.GTK_ACCESSIBLE_AUTOCOMPLETE_BOTH
import org.gtkkn.native.gtk.GtkAccessibleAutocomplete.GTK_ACCESSIBLE_AUTOCOMPLETE_INLINE
import org.gtkkn.native.gtk.GtkAccessibleAutocomplete.GTK_ACCESSIBLE_AUTOCOMPLETE_LIST
import org.gtkkn.native.gtk.GtkAccessibleAutocomplete.GTK_ACCESSIBLE_AUTOCOMPLETE_NONE

/**
 * The possible values for the %GTK_ACCESSIBLE_PROPERTY_AUTOCOMPLETE
 * accessible property.
 */
public enum class AccessibleAutocomplete(
    public val nativeValue: GtkAccessibleAutocomplete,
) {
    /**
     * Automatic suggestions are not displayed.
     */
    NONE(GTK_ACCESSIBLE_AUTOCOMPLETE_NONE),

    /**
     * When a user is providing input, text
     *    suggesting one way to complete the provided input may be dynamically
     *    inserted after the caret.
     */
    INLINE(GTK_ACCESSIBLE_AUTOCOMPLETE_INLINE),

    /**
     * When a user is providing input, an element
     *    containing a collection of values that could complete the provided input
     *    may be displayed.
     */
    LIST(GTK_ACCESSIBLE_AUTOCOMPLETE_LIST),

    /**
     * When a user is providing input, an element
     *    containing a collection of values that could complete the provided input
     *    may be displayed. If displayed, one value in the collection is automatically
     *    selected, and the text needed to complete the automatically selected value
     *    appears after the caret in the input.
     */
    BOTH(GTK_ACCESSIBLE_AUTOCOMPLETE_BOTH),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkAccessibleAutocomplete): AccessibleAutocomplete =
            when (nativeValue) {
                GTK_ACCESSIBLE_AUTOCOMPLETE_NONE -> NONE
                GTK_ACCESSIBLE_AUTOCOMPLETE_INLINE -> INLINE
                GTK_ACCESSIBLE_AUTOCOMPLETE_LIST -> LIST
                GTK_ACCESSIBLE_AUTOCOMPLETE_BOTH -> BOTH
                else -> error("invalid nativeValue")
            }
    }
}
