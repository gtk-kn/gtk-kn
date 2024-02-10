// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkIconSize
import org.gtkkn.native.gtk.GtkIconSize.GTK_ICON_SIZE_INHERIT
import org.gtkkn.native.gtk.GtkIconSize.GTK_ICON_SIZE_LARGE
import org.gtkkn.native.gtk.GtkIconSize.GTK_ICON_SIZE_NORMAL

/**
 * Built-in icon sizes.
 *
 * Icon sizes default to being inherited. Where they cannot be
 * inherited, text size is the default.
 *
 * All widgets which use `GtkIconSize` set the normal-icons or
 * large-icons style classes correspondingly, and let themes
 * determine the actual size to be used with the
 * `-gtk-icon-size` CSS property.
 */
public enum class IconSize(
    public val nativeValue: GtkIconSize,
) {
    /**
     * Keep the size of the parent element
     */
    INHERIT(GTK_ICON_SIZE_INHERIT),

    /**
     * Size similar to text size
     */
    NORMAL(GTK_ICON_SIZE_NORMAL),

    /**
     * Large size, for example in an icon view
     */
    LARGE(GTK_ICON_SIZE_LARGE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkIconSize): IconSize =
            when (nativeValue) {
                GTK_ICON_SIZE_INHERIT -> INHERIT
                GTK_ICON_SIZE_NORMAL -> NORMAL
                GTK_ICON_SIZE_LARGE -> LARGE
                else -> error("invalid nativeValue")
            }
    }
}
