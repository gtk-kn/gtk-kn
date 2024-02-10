// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkImageType
import org.gtkkn.native.gtk.GtkImageType.GTK_IMAGE_EMPTY
import org.gtkkn.native.gtk.GtkImageType.GTK_IMAGE_GICON
import org.gtkkn.native.gtk.GtkImageType.GTK_IMAGE_ICON_NAME
import org.gtkkn.native.gtk.GtkImageType.GTK_IMAGE_PAINTABLE

/**
 * Describes the image data representation used by a [class@Gtk.Image].
 *
 * If you want to get the image from the widget, you can only get the
 * currently-stored representation; for instance, if the gtk_image_get_storage_type()
 * returns %GTK_IMAGE_PAINTABLE, then you can call gtk_image_get_paintable().
 *
 * For empty images, you can request any storage type (call any of the "get"
 * functions), but they will all return null values.
 */
public enum class ImageType(
    public val nativeValue: GtkImageType,
) {
    /**
     * there is no image displayed by the widget
     */
    EMPTY(GTK_IMAGE_EMPTY),

    /**
     * the widget contains a named icon
     */
    ICON_NAME(GTK_IMAGE_ICON_NAME),

    /**
     * the widget contains a `GIcon`
     */
    GICON(GTK_IMAGE_GICON),

    /**
     * the widget contains a `GdkPaintable`
     */
    PAINTABLE(GTK_IMAGE_PAINTABLE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkImageType): ImageType =
            when (nativeValue) {
                GTK_IMAGE_EMPTY -> EMPTY
                GTK_IMAGE_ICON_NAME -> ICON_NAME
                GTK_IMAGE_GICON -> GICON
                GTK_IMAGE_PAINTABLE -> PAINTABLE
                else -> error("invalid nativeValue")
            }
    }
}
