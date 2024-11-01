// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkOverflow
import org.gtkkn.native.gtk.GtkOverflow.GTK_OVERFLOW_HIDDEN
import org.gtkkn.native.gtk.GtkOverflow.GTK_OVERFLOW_VISIBLE

/**
 * Defines how content overflowing a given area should be handled.
 *
 * This is used in [method@Gtk.Widget.set_overflow]. The
 * [property@Gtk.Widget:overflow] property is modeled after the
 * CSS overflow property, but implements it only partially.
 */
public enum class Overflow(
    public val nativeValue: GtkOverflow,
) {
    /**
     * No change is applied. Content is drawn at the specified
     *   position.
     */
    VISIBLE(GTK_OVERFLOW_VISIBLE),

    /**
     * Content is clipped to the bounds of the area. Content
     *   outside the area is not drawn and cannot be interacted with.
     */
    HIDDEN(GTK_OVERFLOW_HIDDEN),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkOverflow): Overflow =
            when (nativeValue) {
                GTK_OVERFLOW_VISIBLE -> VISIBLE
                GTK_OVERFLOW_HIDDEN -> HIDDEN
                else -> error("invalid nativeValue")
            }
    }
}
