// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkScrollStep

/**
 * Passed as argument to various keybinding signals.
 */
public enum class ScrollStep(
    public val nativeValue: GtkScrollStep,
) {
    /**
     * Scroll in steps.
     */
    STEPS(GtkScrollStep.GTK_SCROLL_STEPS),

    /**
     * Scroll by pages.
     */
    PAGES(GtkScrollStep.GTK_SCROLL_PAGES),

    /**
     * Scroll to ends.
     */
    ENDS(GtkScrollStep.GTK_SCROLL_ENDS),

    /**
     * Scroll in horizontal steps.
     */
    HORIZONTAL_STEPS(GtkScrollStep.GTK_SCROLL_HORIZONTAL_STEPS),

    /**
     * Scroll by horizontal pages.
     */
    HORIZONTAL_PAGES(GtkScrollStep.GTK_SCROLL_HORIZONTAL_PAGES),

    /**
     * Scroll to the horizontal ends.
     */
    HORIZONTAL_ENDS(GtkScrollStep.GTK_SCROLL_HORIZONTAL_ENDS),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkScrollStep): ScrollStep =
            when (nativeValue) {
                GtkScrollStep.GTK_SCROLL_STEPS -> STEPS
                GtkScrollStep.GTK_SCROLL_PAGES -> PAGES
                GtkScrollStep.GTK_SCROLL_ENDS -> ENDS
                GtkScrollStep.GTK_SCROLL_HORIZONTAL_STEPS -> HORIZONTAL_STEPS
                GtkScrollStep.GTK_SCROLL_HORIZONTAL_PAGES -> HORIZONTAL_PAGES
                GtkScrollStep.GTK_SCROLL_HORIZONTAL_ENDS -> HORIZONTAL_ENDS
                else -> error("invalid nativeValue")
            }
    }
}
