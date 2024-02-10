// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkScrollablePolicy
import org.gtkkn.native.gtk.GtkScrollablePolicy.GTK_SCROLL_MINIMUM
import org.gtkkn.native.gtk.GtkScrollablePolicy.GTK_SCROLL_NATURAL

/**
 * Defines the policy to be used in a scrollable widget when updating
 * the scrolled window adjustments in a given orientation.
 */
public enum class ScrollablePolicy(
    public val nativeValue: GtkScrollablePolicy,
) {
    /**
     * Scrollable adjustments are based on the minimum size
     */
    MINIMUM(GTK_SCROLL_MINIMUM),

    /**
     * Scrollable adjustments are based on the natural size
     */
    NATURAL(GTK_SCROLL_NATURAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkScrollablePolicy): ScrollablePolicy =
            when (nativeValue) {
                GTK_SCROLL_MINIMUM -> MINIMUM
                GTK_SCROLL_NATURAL -> NATURAL
                else -> error("invalid nativeValue")
            }
    }
}
