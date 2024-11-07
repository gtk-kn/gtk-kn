// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkMovementStep

/**
 * Passed as argument to various keybinding signals for moving the
 * cursor position.
 */
public enum class MovementStep(
    public val nativeValue: GtkMovementStep,
) {
    /**
     * Move forward or back by graphemes
     */
    LOGICAL_POSITIONS(GtkMovementStep.GTK_MOVEMENT_LOGICAL_POSITIONS),

    /**
     * Move left or right by graphemes
     */
    VISUAL_POSITIONS(GtkMovementStep.GTK_MOVEMENT_VISUAL_POSITIONS),

    /**
     * Move forward or back by words
     */
    WORDS(GtkMovementStep.GTK_MOVEMENT_WORDS),

    /**
     * Move up or down lines (wrapped lines)
     */
    DISPLAY_LINES(GtkMovementStep.GTK_MOVEMENT_DISPLAY_LINES),

    /**
     * Move to either end of a line
     */
    DISPLAY_LINE_ENDS(GtkMovementStep.GTK_MOVEMENT_DISPLAY_LINE_ENDS),

    /**
     * Move up or down paragraphs (newline-ended lines)
     */
    PARAGRAPHS(GtkMovementStep.GTK_MOVEMENT_PARAGRAPHS),

    /**
     * Move to either end of a paragraph
     */
    PARAGRAPH_ENDS(GtkMovementStep.GTK_MOVEMENT_PARAGRAPH_ENDS),

    /**
     * Move by pages
     */
    PAGES(GtkMovementStep.GTK_MOVEMENT_PAGES),

    /**
     * Move to ends of the buffer
     */
    BUFFER_ENDS(GtkMovementStep.GTK_MOVEMENT_BUFFER_ENDS),

    /**
     * Move horizontally by pages
     */
    HORIZONTAL_PAGES(GtkMovementStep.GTK_MOVEMENT_HORIZONTAL_PAGES),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkMovementStep): MovementStep =
            when (nativeValue) {
                GtkMovementStep.GTK_MOVEMENT_LOGICAL_POSITIONS -> LOGICAL_POSITIONS
                GtkMovementStep.GTK_MOVEMENT_VISUAL_POSITIONS -> VISUAL_POSITIONS
                GtkMovementStep.GTK_MOVEMENT_WORDS -> WORDS
                GtkMovementStep.GTK_MOVEMENT_DISPLAY_LINES -> DISPLAY_LINES
                GtkMovementStep.GTK_MOVEMENT_DISPLAY_LINE_ENDS -> DISPLAY_LINE_ENDS
                GtkMovementStep.GTK_MOVEMENT_PARAGRAPHS -> PARAGRAPHS
                GtkMovementStep.GTK_MOVEMENT_PARAGRAPH_ENDS -> PARAGRAPH_ENDS
                GtkMovementStep.GTK_MOVEMENT_PAGES -> PAGES
                GtkMovementStep.GTK_MOVEMENT_BUFFER_ENDS -> BUFFER_ENDS
                GtkMovementStep.GTK_MOVEMENT_HORIZONTAL_PAGES -> HORIZONTAL_PAGES
                else -> error("invalid nativeValue")
            }
    }
}
