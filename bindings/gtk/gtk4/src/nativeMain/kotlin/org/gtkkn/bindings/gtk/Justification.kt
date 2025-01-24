// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkJustification
import org.gtkkn.native.gtk.gtk_justification_get_type

/**
 * Used for justifying the text inside a [class@Label] widget.
 */
public enum class Justification(public val nativeValue: GtkJustification) {
    /**
     * The text is placed at the left edge of the label.
     */
    LEFT(GtkJustification.GTK_JUSTIFY_LEFT),

    /**
     * The text is placed at the right edge of the label.
     */
    RIGHT(GtkJustification.GTK_JUSTIFY_RIGHT),

    /**
     * The text is placed in the center of the label.
     */
    CENTER(GtkJustification.GTK_JUSTIFY_CENTER),

    /**
     * The text is placed is distributed across the label.
     */
    FILL(GtkJustification.GTK_JUSTIFY_FILL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkJustification): Justification = when (nativeValue) {
            GtkJustification.GTK_JUSTIFY_LEFT -> LEFT
            GtkJustification.GTK_JUSTIFY_RIGHT -> RIGHT
            GtkJustification.GTK_JUSTIFY_CENTER -> CENTER
            GtkJustification.GTK_JUSTIFY_FILL -> FILL
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of Justification
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_justification_get_type()
    }
}
