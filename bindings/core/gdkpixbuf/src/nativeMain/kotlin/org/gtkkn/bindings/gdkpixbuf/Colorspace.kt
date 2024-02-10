// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdkpixbuf

import org.gtkkn.native.gdkpixbuf.GdkColorspace
import org.gtkkn.native.gdkpixbuf.GdkColorspace.GDK_COLORSPACE_RGB

/**
 * This enumeration defines the color spaces that are supported by
 * the gdk-pixbuf library.
 *
 * Currently only RGB is supported.
 */
public enum class Colorspace(
    public val nativeValue: GdkColorspace,
) {
    /**
     * Indicates a red/green/blue additive color space.
     */
    RGB(GDK_COLORSPACE_RGB),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkColorspace): Colorspace =
            when (nativeValue) {
                GDK_COLORSPACE_RGB -> RGB
                else -> error("invalid nativeValue")
            }
    }
}
