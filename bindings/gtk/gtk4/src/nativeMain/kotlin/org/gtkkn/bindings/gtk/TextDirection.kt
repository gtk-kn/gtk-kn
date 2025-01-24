// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkTextDirection
import org.gtkkn.native.gtk.gtk_text_direction_get_type

/**
 * Reading directions for text.
 */
public enum class TextDirection(public val nativeValue: GtkTextDirection) {
    /**
     * No direction.
     */
    NONE(GtkTextDirection.GTK_TEXT_DIR_NONE),

    /**
     * Left to right text direction.
     */
    LTR(GtkTextDirection.GTK_TEXT_DIR_LTR),

    /**
     * Right to left text direction.
     */
    RTL(GtkTextDirection.GTK_TEXT_DIR_RTL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkTextDirection): TextDirection = when (nativeValue) {
            GtkTextDirection.GTK_TEXT_DIR_NONE -> NONE
            GtkTextDirection.GTK_TEXT_DIR_LTR -> LTR
            GtkTextDirection.GTK_TEXT_DIR_RTL -> RTL
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of TextDirection
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_text_direction_get_type()
    }
}
