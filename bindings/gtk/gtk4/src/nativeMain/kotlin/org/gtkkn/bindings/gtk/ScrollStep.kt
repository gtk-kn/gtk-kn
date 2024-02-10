// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkScrollStep
import org.gtkkn.native.gtk.GtkScrollStep.GTK_SCROLL_ENDS
import org.gtkkn.native.gtk.GtkScrollStep.GTK_SCROLL_HORIZONTAL_ENDS
import org.gtkkn.native.gtk.GtkScrollStep.GTK_SCROLL_HORIZONTAL_PAGES
import org.gtkkn.native.gtk.GtkScrollStep.GTK_SCROLL_HORIZONTAL_STEPS
import org.gtkkn.native.gtk.GtkScrollStep.GTK_SCROLL_PAGES
import org.gtkkn.native.gtk.GtkScrollStep.GTK_SCROLL_STEPS

/**
 * Passed as argument to various keybinding signals.
 */
public enum class ScrollStep(
    public val nativeValue: GtkScrollStep,
) {
    /**
     * Scroll in steps.
     */
    STEPS(GTK_SCROLL_STEPS),

    /**
     * Scroll by pages.
     */
    PAGES(GTK_SCROLL_PAGES),

    /**
     * Scroll to ends.
     */
    ENDS(GTK_SCROLL_ENDS),

    /**
     * Scroll in horizontal steps.
     */
    HORIZONTAL_STEPS(GTK_SCROLL_HORIZONTAL_STEPS),

    /**
     * Scroll by horizontal pages.
     */
    HORIZONTAL_PAGES(GTK_SCROLL_HORIZONTAL_PAGES),

    /**
     * Scroll to the horizontal ends.
     */
    HORIZONTAL_ENDS(GTK_SCROLL_HORIZONTAL_ENDS),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkScrollStep): ScrollStep =
            when (nativeValue) {
                GTK_SCROLL_STEPS -> STEPS
                GTK_SCROLL_PAGES -> PAGES
                GTK_SCROLL_ENDS -> ENDS
                GTK_SCROLL_HORIZONTAL_STEPS -> HORIZONTAL_STEPS
                GTK_SCROLL_HORIZONTAL_PAGES -> HORIZONTAL_PAGES
                GTK_SCROLL_HORIZONTAL_ENDS -> HORIZONTAL_ENDS
                else -> error("invalid nativeValue")
            }
    }
}
