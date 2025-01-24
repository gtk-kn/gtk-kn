// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkCornerType
import org.gtkkn.native.gtk.gtk_corner_type_get_type

/**
 * Specifies which corner a child widget should be placed in when packed into
 * a `GtkScrolledWindow.`
 *
 * This is effectively the opposite of where the scroll bars are placed.
 */
public enum class CornerType(public val nativeValue: GtkCornerType) {
    /**
     * Place the scrollbars on the right and bottom of the
     *   widget (default behaviour).
     */
    TOP_LEFT(GtkCornerType.GTK_CORNER_TOP_LEFT),

    /**
     * Place the scrollbars on the top and right of the
     *   widget.
     */
    BOTTOM_LEFT(GtkCornerType.GTK_CORNER_BOTTOM_LEFT),

    /**
     * Place the scrollbars on the left and bottom of the
     *   widget.
     */
    TOP_RIGHT(GtkCornerType.GTK_CORNER_TOP_RIGHT),

    /**
     * Place the scrollbars on the top and left of the
     *   widget.
     */
    BOTTOM_RIGHT(GtkCornerType.GTK_CORNER_BOTTOM_RIGHT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkCornerType): CornerType = when (nativeValue) {
            GtkCornerType.GTK_CORNER_TOP_LEFT -> TOP_LEFT
            GtkCornerType.GTK_CORNER_BOTTOM_LEFT -> BOTTOM_LEFT
            GtkCornerType.GTK_CORNER_TOP_RIGHT -> TOP_RIGHT
            GtkCornerType.GTK_CORNER_BOTTOM_RIGHT -> BOTTOM_RIGHT
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of CornerType
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_corner_type_get_type()
    }
}
