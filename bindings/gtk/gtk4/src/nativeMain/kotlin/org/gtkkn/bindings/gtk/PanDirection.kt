// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkPanDirection
import org.gtkkn.native.gtk.gtk_pan_direction_get_type

/**
 * Describes the panning direction of a [class@GesturePan].
 */
public enum class PanDirection(public val nativeValue: GtkPanDirection) {
    /**
     * panned towards the left
     */
    LEFT(GtkPanDirection.GTK_PAN_DIRECTION_LEFT),

    /**
     * panned towards the right
     */
    RIGHT(GtkPanDirection.GTK_PAN_DIRECTION_RIGHT),

    /**
     * panned upwards
     */
    UP(GtkPanDirection.GTK_PAN_DIRECTION_UP),

    /**
     * panned downwards
     */
    DOWN(GtkPanDirection.GTK_PAN_DIRECTION_DOWN),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPanDirection): PanDirection = when (nativeValue) {
            GtkPanDirection.GTK_PAN_DIRECTION_LEFT -> LEFT
            GtkPanDirection.GTK_PAN_DIRECTION_RIGHT -> RIGHT
            GtkPanDirection.GTK_PAN_DIRECTION_UP -> UP
            GtkPanDirection.GTK_PAN_DIRECTION_DOWN -> DOWN
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of PanDirection
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_pan_direction_get_type()
    }
}
