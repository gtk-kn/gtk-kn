// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkAlign
import org.gtkkn.native.gtk.GtkAlign.GTK_ALIGN_BASELINE
import org.gtkkn.native.gtk.GtkAlign.GTK_ALIGN_CENTER
import org.gtkkn.native.gtk.GtkAlign.GTK_ALIGN_END
import org.gtkkn.native.gtk.GtkAlign.GTK_ALIGN_FILL
import org.gtkkn.native.gtk.GtkAlign.GTK_ALIGN_START

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
 * Note that in horizontal context %GTK_ALIGN_START and %GTK_ALIGN_END
 * are interpreted relative to text direction.
 *
 * %GTK_ALIGN_BASELINE support is optional for containers and widgets, and
 * it is only supported for vertical alignment.  When it's not supported by
 * a child or a container it is treated as %GTK_ALIGN_FILL.
 */
public enum class Align(
    public val nativeValue: GtkAlign,
) {
    /**
     * stretch to fill all space if possible, center if
     *   no meaningful way to stretch
     */
    FILL(GTK_ALIGN_FILL),

    /**
     * snap to left or top side, leaving space on right or bottom
     */
    START(GTK_ALIGN_START),

    /**
     * snap to right or bottom side, leaving space on left or top
     */
    END(GTK_ALIGN_END),

    /**
     * center natural width of widget inside the allocation
     */
    CENTER(GTK_ALIGN_CENTER),

    /**
     * align the widget according to the baseline.
     *   See [class@Gtk.Widget].
     */
    BASELINE(GTK_ALIGN_BASELINE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkAlign): Align =
            when (nativeValue) {
                GTK_ALIGN_FILL -> FILL
                GTK_ALIGN_START -> START
                GTK_ALIGN_END -> END
                GTK_ALIGN_CENTER -> CENTER
                GTK_ALIGN_BASELINE -> BASELINE
                else -> error("invalid nativeValue")
            }
    }
}
