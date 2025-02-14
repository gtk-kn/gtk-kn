// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAlign
import org.gtkkn.native.gtk.gtk_align_get_type

/**
 * Controls how a widget deals with extra space in a single dimension.
 *
 * Alignment only matters if the widget receives a “too large” allocation,
 * for example if you packed the widget with the [property@Gtk.Widget:hexpand]
 * property inside a [class@Box], then the widget might get extra space.
 * If you have for example a 16x16 icon inside a 32x32 space, the icon
 * could be scaled and stretched, it could be centered, or it could be
 * positioned to one side of the space.
 *
 * Note that in horizontal context `GTK_ALIGN_START` and `GTK_ALIGN_END`
 * are interpreted relative to text direction.
 *
 * Baseline support is optional for containers and widgets, and is only available
 * for vertical alignment. `GTK_ALIGN_BASELINE_CENTER` and `GTK_ALIGN_BASELINE_FILL`
 * are treated similar to `GTK_ALIGN_CENTER` and `GTK_ALIGN_FILL`, except that it
 * positions the widget to line up the baselines, where that is supported.
 */
public enum class Align(public val nativeValue: GtkAlign) {
    /**
     * stretch to fill all space if possible, center if
     *   no meaningful way to stretch
     */
    FILL(GtkAlign.GTK_ALIGN_FILL),

    /**
     * snap to left or top side, leaving space on right or bottom
     */
    START(GtkAlign.GTK_ALIGN_START),

    /**
     * snap to right or bottom side, leaving space on left or top
     */
    END(GtkAlign.GTK_ALIGN_END),

    /**
     * center natural width of widget inside the allocation
     */
    CENTER(GtkAlign.GTK_ALIGN_CENTER),

    /**
     * a different name for `GTK_ALIGN_BASELINE`.
     * @since 4.12
     */
    BASELINE_FILL(GtkAlign.GTK_ALIGN_BASELINE_FILL),

    /**
     * align the widget according to the baseline.
     */
    BASELINE(GtkAlign.GTK_ALIGN_BASELINE),

    /**
     * stretch to fill all space, but align the baseline.
     * @since 4.12
     */
    BASELINE_CENTER(GtkAlign.GTK_ALIGN_BASELINE_CENTER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkAlign): Align = when (nativeValue) {
            GtkAlign.GTK_ALIGN_FILL -> FILL
            GtkAlign.GTK_ALIGN_START -> START
            GtkAlign.GTK_ALIGN_END -> END
            GtkAlign.GTK_ALIGN_CENTER -> CENTER
            GtkAlign.GTK_ALIGN_BASELINE_FILL -> BASELINE_FILL
            GtkAlign.GTK_ALIGN_BASELINE -> BASELINE
            GtkAlign.GTK_ALIGN_BASELINE_CENTER -> BASELINE_CENTER
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of Align
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_align_get_type()
    }
}
