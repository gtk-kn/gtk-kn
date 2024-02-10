// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkTextWindowType
import org.gtkkn.native.gtk.GtkTextWindowType.GTK_TEXT_WINDOW_BOTTOM
import org.gtkkn.native.gtk.GtkTextWindowType.GTK_TEXT_WINDOW_LEFT
import org.gtkkn.native.gtk.GtkTextWindowType.GTK_TEXT_WINDOW_RIGHT
import org.gtkkn.native.gtk.GtkTextWindowType.GTK_TEXT_WINDOW_TEXT
import org.gtkkn.native.gtk.GtkTextWindowType.GTK_TEXT_WINDOW_TOP
import org.gtkkn.native.gtk.GtkTextWindowType.GTK_TEXT_WINDOW_WIDGET

/**
 * Used to reference the parts of `GtkTextView`.
 */
public enum class TextWindowType(
    public val nativeValue: GtkTextWindowType,
) {
    /**
     * Window that floats over scrolling areas.
     */
    WIDGET(GTK_TEXT_WINDOW_WIDGET),

    /**
     * Scrollable text window.
     */
    TEXT(GTK_TEXT_WINDOW_TEXT),

    /**
     * Left side border window.
     */
    LEFT(GTK_TEXT_WINDOW_LEFT),

    /**
     * Right side border window.
     */
    RIGHT(GTK_TEXT_WINDOW_RIGHT),

    /**
     * Top border window.
     */
    TOP(GTK_TEXT_WINDOW_TOP),

    /**
     * Bottom border window.
     */
    BOTTOM(GTK_TEXT_WINDOW_BOTTOM),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkTextWindowType): TextWindowType =
            when (nativeValue) {
                GTK_TEXT_WINDOW_WIDGET -> WIDGET
                GTK_TEXT_WINDOW_TEXT -> TEXT
                GTK_TEXT_WINDOW_LEFT -> LEFT
                GTK_TEXT_WINDOW_RIGHT -> RIGHT
                GTK_TEXT_WINDOW_TOP -> TOP
                GTK_TEXT_WINDOW_BOTTOM -> BOTTOM
                else -> error("invalid nativeValue")
            }
    }
}
