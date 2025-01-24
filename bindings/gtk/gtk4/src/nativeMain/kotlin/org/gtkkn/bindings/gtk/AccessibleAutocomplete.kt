// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessibleAutocomplete
import org.gtkkn.native.gtk.gtk_accessible_autocomplete_get_type

/**
 * The possible values for the %GTK_ACCESSIBLE_PROPERTY_AUTOCOMPLETE
 * accessible property.
 */
public enum class AccessibleAutocomplete(public val nativeValue: GtkAccessibleAutocomplete) {
    /**
     * Automatic suggestions are not displayed.
     */
    NONE(GtkAccessibleAutocomplete.GTK_ACCESSIBLE_AUTOCOMPLETE_NONE),

    /**
     * When a user is providing input, text
     *    suggesting one way to complete the provided input may be dynamically
     *    inserted after the caret.
     */
    INLINE(GtkAccessibleAutocomplete.GTK_ACCESSIBLE_AUTOCOMPLETE_INLINE),

    /**
     * When a user is providing input, an element
     *    containing a collection of values that could complete the provided input
     *    may be displayed.
     */
    LIST(GtkAccessibleAutocomplete.GTK_ACCESSIBLE_AUTOCOMPLETE_LIST),

    /**
     * When a user is providing input, an element
     *    containing a collection of values that could complete the provided input
     *    may be displayed. If displayed, one value in the collection is automatically
     *    selected, and the text needed to complete the automatically selected value
     *    appears after the caret in the input.
     */
    BOTH(GtkAccessibleAutocomplete.GTK_ACCESSIBLE_AUTOCOMPLETE_BOTH),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkAccessibleAutocomplete): AccessibleAutocomplete =
            when (nativeValue) {
                GtkAccessibleAutocomplete.GTK_ACCESSIBLE_AUTOCOMPLETE_NONE -> NONE
                GtkAccessibleAutocomplete.GTK_ACCESSIBLE_AUTOCOMPLETE_INLINE -> INLINE
                GtkAccessibleAutocomplete.GTK_ACCESSIBLE_AUTOCOMPLETE_LIST -> LIST
                GtkAccessibleAutocomplete.GTK_ACCESSIBLE_AUTOCOMPLETE_BOTH -> BOTH
                else -> error("invalid nativeValue")
            }

        /**
         * Get the GType of AccessibleAutocomplete
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_accessible_autocomplete_get_type()
    }
}
