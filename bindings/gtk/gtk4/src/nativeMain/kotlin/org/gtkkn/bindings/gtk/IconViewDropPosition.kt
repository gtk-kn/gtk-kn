// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkIconViewDropPosition
import org.gtkkn.native.gtk.GtkIconViewDropPosition.GTK_ICON_VIEW_DROP_ABOVE
import org.gtkkn.native.gtk.GtkIconViewDropPosition.GTK_ICON_VIEW_DROP_BELOW
import org.gtkkn.native.gtk.GtkIconViewDropPosition.GTK_ICON_VIEW_DROP_INTO
import org.gtkkn.native.gtk.GtkIconViewDropPosition.GTK_ICON_VIEW_DROP_LEFT
import org.gtkkn.native.gtk.GtkIconViewDropPosition.GTK_ICON_VIEW_DROP_RIGHT
import org.gtkkn.native.gtk.GtkIconViewDropPosition.GTK_ICON_VIEW_NO_DROP

/**
 * An enum for determining where a dropped item goes.
 */
public enum class IconViewDropPosition(
    public val nativeValue: GtkIconViewDropPosition,
) {
    /**
     * no drop possible
     */
    NO_DROP(GTK_ICON_VIEW_NO_DROP),

    /**
     * dropped item replaces the item
     */
    DROP_INTO(GTK_ICON_VIEW_DROP_INTO),

    /**
     * dropped item is inserted to the left
     */
    DROP_LEFT(GTK_ICON_VIEW_DROP_LEFT),

    /**
     * dropped item is inserted to the right
     */
    DROP_RIGHT(GTK_ICON_VIEW_DROP_RIGHT),

    /**
     * dropped item is inserted above
     */
    DROP_ABOVE(GTK_ICON_VIEW_DROP_ABOVE),

    /**
     * dropped item is inserted below
     */
    DROP_BELOW(GTK_ICON_VIEW_DROP_BELOW),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkIconViewDropPosition): IconViewDropPosition =
            when (nativeValue) {
                GTK_ICON_VIEW_NO_DROP -> NO_DROP
                GTK_ICON_VIEW_DROP_INTO -> DROP_INTO
                GTK_ICON_VIEW_DROP_LEFT -> DROP_LEFT
                GTK_ICON_VIEW_DROP_RIGHT -> DROP_RIGHT
                GTK_ICON_VIEW_DROP_ABOVE -> DROP_ABOVE
                GTK_ICON_VIEW_DROP_BELOW -> DROP_BELOW
                else -> error("invalid nativeValue")
            }
    }
}
