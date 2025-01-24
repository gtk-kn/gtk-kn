// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessibleTextGranularity
import org.gtkkn.native.gtk.gtk_accessible_text_granularity_get_type

/**
 * The granularity for queries about the text contents of a [iface@Gtk.AccessibleText]
 * implementation.
 * @since 4.14
 */
@GtkVersion4_14
public enum class AccessibleTextGranularity(public val nativeValue: GtkAccessibleTextGranularity) {
    /**
     * Use the boundary between
     *   characters (including non-printing characters)
     */
    CHARACTER(GtkAccessibleTextGranularity.GTK_ACCESSIBLE_TEXT_GRANULARITY_CHARACTER),

    /**
     * Use the boundary between words,
     *   starting from the beginning of the current word and ending at the
     *   beginning of the next word
     */
    WORD(GtkAccessibleTextGranularity.GTK_ACCESSIBLE_TEXT_GRANULARITY_WORD),

    /**
     * Use the boundary between
     *   sentences, starting from the beginning of the current sentence and
     *   ending at the beginning of the next sentence
     */
    SENTENCE(GtkAccessibleTextGranularity.GTK_ACCESSIBLE_TEXT_GRANULARITY_SENTENCE),

    /**
     * Use the boundary between lines,
     *   starting from the beginning of the current line and ending at the
     *   beginning of the next line
     */
    LINE(GtkAccessibleTextGranularity.GTK_ACCESSIBLE_TEXT_GRANULARITY_LINE),

    /**
     * Use the boundary between
     *   paragraphs, starting from the beginning of the current paragraph and
     *   ending at the beginning of the next paragraph
     */
    PARAGRAPH(GtkAccessibleTextGranularity.GTK_ACCESSIBLE_TEXT_GRANULARITY_PARAGRAPH),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkAccessibleTextGranularity): AccessibleTextGranularity =
            when (nativeValue) {
                GtkAccessibleTextGranularity.GTK_ACCESSIBLE_TEXT_GRANULARITY_CHARACTER -> CHARACTER
                GtkAccessibleTextGranularity.GTK_ACCESSIBLE_TEXT_GRANULARITY_WORD -> WORD
                GtkAccessibleTextGranularity.GTK_ACCESSIBLE_TEXT_GRANULARITY_SENTENCE -> SENTENCE
                GtkAccessibleTextGranularity.GTK_ACCESSIBLE_TEXT_GRANULARITY_LINE -> LINE
                GtkAccessibleTextGranularity.GTK_ACCESSIBLE_TEXT_GRANULARITY_PARAGRAPH -> PARAGRAPH
                else -> error("invalid nativeValue")
            }

        /**
         * Get the GType of AccessibleTextGranularity
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_accessible_text_granularity_get_type()
    }
}
