// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkScrollablePolicy
import org.gtkkn.native.gtk.gtk_scrollable_policy_get_type

/**
 * Defines the policy to be used in a scrollable widget when updating
 * the scrolled window adjustments in a given orientation.
 */
public enum class ScrollablePolicy(public val nativeValue: GtkScrollablePolicy) {
    /**
     * Scrollable adjustments are based on the minimum size
     */
    MINIMUM(GtkScrollablePolicy.GTK_SCROLL_MINIMUM),

    /**
     * Scrollable adjustments are based on the natural size
     */
    NATURAL(GtkScrollablePolicy.GTK_SCROLL_NATURAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkScrollablePolicy): ScrollablePolicy = when (nativeValue) {
            GtkScrollablePolicy.GTK_SCROLL_MINIMUM -> MINIMUM
            GtkScrollablePolicy.GTK_SCROLL_NATURAL -> NATURAL
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of ScrollablePolicy
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_scrollable_policy_get_type()
    }
}
