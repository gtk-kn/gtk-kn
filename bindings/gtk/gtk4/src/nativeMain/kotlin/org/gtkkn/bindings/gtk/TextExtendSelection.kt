// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkTextExtendSelection
import org.gtkkn.native.gtk.gtk_text_extend_selection_get_type

/**
 * Granularity types that extend the text selection. Use the
 * `GtkTextView::extend-selection` signal to customize the selection.
 */
public enum class TextExtendSelection(public val nativeValue: GtkTextExtendSelection) {
    /**
     * Selects the current word. It is triggered by
     *   a double-click for example.
     */
    WORD(GtkTextExtendSelection.GTK_TEXT_EXTEND_SELECTION_WORD),

    /**
     * Selects the current line. It is triggered by
     *   a triple-click for example.
     */
    LINE(GtkTextExtendSelection.GTK_TEXT_EXTEND_SELECTION_LINE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkTextExtendSelection): TextExtendSelection = when (nativeValue) {
            GtkTextExtendSelection.GTK_TEXT_EXTEND_SELECTION_WORD -> WORD
            GtkTextExtendSelection.GTK_TEXT_EXTEND_SELECTION_LINE -> LINE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of TextExtendSelection
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_text_extend_selection_get_type()
    }
}
