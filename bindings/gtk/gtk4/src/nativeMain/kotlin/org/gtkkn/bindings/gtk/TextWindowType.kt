// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkTextWindowType
import org.gtkkn.native.gtk.gtk_text_window_type_get_type

/**
 * Used to reference the parts of `GtkTextView`.
 */
public enum class TextWindowType(public val nativeValue: GtkTextWindowType) {
    /**
     * Window that floats over scrolling areas.
     */
    WIDGET(GtkTextWindowType.GTK_TEXT_WINDOW_WIDGET),

    /**
     * Scrollable text window.
     */
    TEXT(GtkTextWindowType.GTK_TEXT_WINDOW_TEXT),

    /**
     * Left side border window.
     */
    LEFT(GtkTextWindowType.GTK_TEXT_WINDOW_LEFT),

    /**
     * Right side border window.
     */
    RIGHT(GtkTextWindowType.GTK_TEXT_WINDOW_RIGHT),

    /**
     * Top border window.
     */
    TOP(GtkTextWindowType.GTK_TEXT_WINDOW_TOP),

    /**
     * Bottom border window.
     */
    BOTTOM(GtkTextWindowType.GTK_TEXT_WINDOW_BOTTOM),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkTextWindowType): TextWindowType = when (nativeValue) {
            GtkTextWindowType.GTK_TEXT_WINDOW_WIDGET -> WIDGET
            GtkTextWindowType.GTK_TEXT_WINDOW_TEXT -> TEXT
            GtkTextWindowType.GTK_TEXT_WINDOW_LEFT -> LEFT
            GtkTextWindowType.GTK_TEXT_WINDOW_RIGHT -> RIGHT
            GtkTextWindowType.GTK_TEXT_WINDOW_TOP -> TOP
            GtkTextWindowType.GTK_TEXT_WINDOW_BOTTOM -> BOTTOM
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of TextWindowType
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_text_window_type_get_type()
    }
}
