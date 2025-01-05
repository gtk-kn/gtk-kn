// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkPixbufRotation
import org.gtkkn.native.gdk.gdk_pixbuf_rotation_get_type
import org.gtkkn.native.gobject.GType

/**
 * The possible rotations which can be passed to gdk_pixbuf_rotate_simple().
 *
 * To make them easier to use, their numerical values are the actual degrees.
 */
public enum class PixbufRotation(public val nativeValue: GdkPixbufRotation) {
    /**
     * No rotation.
     */
    NONE(GdkPixbufRotation.GDK_PIXBUF_ROTATE_NONE),

    /**
     * Rotate by 90 degrees.
     */
    COUNTERCLOCKWISE(GdkPixbufRotation.GDK_PIXBUF_ROTATE_COUNTERCLOCKWISE),

    /**
     * Rotate by 180 degrees.
     */
    UPSIDEDOWN(GdkPixbufRotation.GDK_PIXBUF_ROTATE_UPSIDEDOWN),

    /**
     * Rotate by 270 degrees.
     */
    CLOCKWISE(GdkPixbufRotation.GDK_PIXBUF_ROTATE_CLOCKWISE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkPixbufRotation): PixbufRotation = when (nativeValue) {
            GdkPixbufRotation.GDK_PIXBUF_ROTATE_NONE -> NONE
            GdkPixbufRotation.GDK_PIXBUF_ROTATE_COUNTERCLOCKWISE -> COUNTERCLOCKWISE
            GdkPixbufRotation.GDK_PIXBUF_ROTATE_UPSIDEDOWN -> UPSIDEDOWN
            GdkPixbufRotation.GDK_PIXBUF_ROTATE_CLOCKWISE -> CLOCKWISE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of PixbufRotation
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_pixbuf_rotation_get_type()
    }
}
