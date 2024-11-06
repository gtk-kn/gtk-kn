// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.native.gtk.GtkAccessibleTextGranularity
import org.gtkkn.native.gtk.GtkAccessibleTextGranularity.GTK_ACCESSIBLE_TEXT_GRANULARITY_CHARACTER
import org.gtkkn.native.gtk.GtkAccessibleTextGranularity.GTK_ACCESSIBLE_TEXT_GRANULARITY_LINE
import org.gtkkn.native.gtk.GtkAccessibleTextGranularity.GTK_ACCESSIBLE_TEXT_GRANULARITY_PARAGRAPH
import org.gtkkn.native.gtk.GtkAccessibleTextGranularity.GTK_ACCESSIBLE_TEXT_GRANULARITY_SENTENCE
import org.gtkkn.native.gtk.GtkAccessibleTextGranularity.GTK_ACCESSIBLE_TEXT_GRANULARITY_WORD

/**
 * The granularity for queries about the text contents of a [iface@Gtk.AccessibleText]
 * implementation.
 * @since 4.14
 */
@GtkVersion4_14
public enum class AccessibleTextGranularity(
    public val nativeValue: GtkAccessibleTextGranularity,
) {
    /**
     * Use the boundary between
     *   characters (including non-printing characters)
     */
    CHARACTER(GTK_ACCESSIBLE_TEXT_GRANULARITY_CHARACTER),

    /**
     * Use the boundary between words,
     *   starting from the beginning of the current word and ending at the
     *   beginning of the next word
     */
    WORD(GTK_ACCESSIBLE_TEXT_GRANULARITY_WORD),

    /**
     * Use the boundary between
     *   sentences, starting from the beginning of the current sentence and
     *   ending at the beginning of the next sentence
     */
    SENTENCE(GTK_ACCESSIBLE_TEXT_GRANULARITY_SENTENCE),

    /**
     * Use the boundary between lines,
     *   starting from the beginning of the current line and ending at the
     *   beginning of the next line
     */
    LINE(GTK_ACCESSIBLE_TEXT_GRANULARITY_LINE),

    /**
     * Use the boundary between
     *   paragraphs, starting from the beginning of the current paragraph and
     *   ending at the beginning of the next paragraph
     */
    PARAGRAPH(GTK_ACCESSIBLE_TEXT_GRANULARITY_PARAGRAPH),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkAccessibleTextGranularity): AccessibleTextGranularity =
            when (nativeValue) {
                GTK_ACCESSIBLE_TEXT_GRANULARITY_CHARACTER -> CHARACTER
                GTK_ACCESSIBLE_TEXT_GRANULARITY_WORD -> WORD
                GTK_ACCESSIBLE_TEXT_GRANULARITY_SENTENCE -> SENTENCE
                GTK_ACCESSIBLE_TEXT_GRANULARITY_LINE -> LINE
                GTK_ACCESSIBLE_TEXT_GRANULARITY_PARAGRAPH -> PARAGRAPH
                else -> error("invalid nativeValue")
            }
    }
}
