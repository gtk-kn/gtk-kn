// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkColorspace
import org.gtkkn.native.gdk.gdk_colorspace_get_type
import org.gtkkn.native.gobject.GType

/**
 * This enumeration defines the color spaces that are supported by
 * the gdk-pixbuf library.
 *
 * Currently only RGB is supported.
 */
public enum class Colorspace(public val nativeValue: GdkColorspace) {
    /**
     * Indicates a red/green/blue additive color space.
     */
    RGB(GdkColorspace.GDK_COLORSPACE_RGB),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkColorspace): Colorspace = when (nativeValue) {
            GdkColorspace.GDK_COLORSPACE_RGB -> RGB
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of Colorspace
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_colorspace_get_type()
    }
}
