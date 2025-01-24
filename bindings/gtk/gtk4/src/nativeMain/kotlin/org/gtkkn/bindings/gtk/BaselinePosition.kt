// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkBaselinePosition
import org.gtkkn.native.gtk.gtk_baseline_position_get_type

/**
 * Baseline position in a row of widgets.
 *
 * Whenever a container has some form of natural row it may align
 * children in that row along a common typographical baseline. If
 * the amount of vertical space in the row is taller than the total
 * requested height of the baseline-aligned children then it can use a
 * `GtkBaselinePosition` to select where to put the baseline inside the
 * extra available space.
 */
public enum class BaselinePosition(public val nativeValue: GtkBaselinePosition) {
    /**
     * Align the baseline at the top
     */
    TOP(GtkBaselinePosition.GTK_BASELINE_POSITION_TOP),

    /**
     * Center the baseline
     */
    CENTER(GtkBaselinePosition.GTK_BASELINE_POSITION_CENTER),

    /**
     * Align the baseline at the bottom
     */
    BOTTOM(GtkBaselinePosition.GTK_BASELINE_POSITION_BOTTOM),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkBaselinePosition): BaselinePosition = when (nativeValue) {
            GtkBaselinePosition.GTK_BASELINE_POSITION_TOP -> TOP
            GtkBaselinePosition.GTK_BASELINE_POSITION_CENTER -> CENTER
            GtkBaselinePosition.GTK_BASELINE_POSITION_BOTTOM -> BOTTOM
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of BaselinePosition
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_baseline_position_get_type()
    }
}
