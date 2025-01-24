// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessibleTextContentChange
import org.gtkkn.native.gtk.gtk_accessible_text_content_change_get_type

/**
 * The type of contents change operation.
 * @since 4.14
 */
@GtkVersion4_14
public enum class AccessibleTextContentChange(public val nativeValue: GtkAccessibleTextContentChange) {
    /**
     * contents change as the result of
     *   an insert operation
     */
    INSERT(GtkAccessibleTextContentChange.GTK_ACCESSIBLE_TEXT_CONTENT_CHANGE_INSERT),

    /**
     * contents change as the result of
     *   a remove operation
     */
    REMOVE(GtkAccessibleTextContentChange.GTK_ACCESSIBLE_TEXT_CONTENT_CHANGE_REMOVE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkAccessibleTextContentChange): AccessibleTextContentChange =
            when (nativeValue) {
                GtkAccessibleTextContentChange.GTK_ACCESSIBLE_TEXT_CONTENT_CHANGE_INSERT -> INSERT
                GtkAccessibleTextContentChange.GTK_ACCESSIBLE_TEXT_CONTENT_CHANGE_REMOVE -> REMOVE
                else -> error("invalid nativeValue")
            }

        /**
         * Get the GType of AccessibleTextContentChange
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_accessible_text_content_change_get_type()
    }
}
