// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkSubpixelLayout
import org.gtkkn.native.gdk.GdkSubpixelLayout.GDK_SUBPIXEL_LAYOUT_HORIZONTAL_BGR
import org.gtkkn.native.gdk.GdkSubpixelLayout.GDK_SUBPIXEL_LAYOUT_HORIZONTAL_RGB
import org.gtkkn.native.gdk.GdkSubpixelLayout.GDK_SUBPIXEL_LAYOUT_NONE
import org.gtkkn.native.gdk.GdkSubpixelLayout.GDK_SUBPIXEL_LAYOUT_UNKNOWN
import org.gtkkn.native.gdk.GdkSubpixelLayout.GDK_SUBPIXEL_LAYOUT_VERTICAL_BGR
import org.gtkkn.native.gdk.GdkSubpixelLayout.GDK_SUBPIXEL_LAYOUT_VERTICAL_RGB

/**
 * This enumeration describes how the red, green and blue components
 * of physical pixels on an output device are laid out.
 */
public enum class SubpixelLayout(
    public val nativeValue: GdkSubpixelLayout,
) {
    /**
     * The layout is not known
     */
    UNKNOWN(GDK_SUBPIXEL_LAYOUT_UNKNOWN),

    /**
     * Not organized in this way
     */
    NONE(GDK_SUBPIXEL_LAYOUT_NONE),

    /**
     * The layout is horizontal, the order is RGB
     */
    HORIZONTAL_RGB(GDK_SUBPIXEL_LAYOUT_HORIZONTAL_RGB),

    /**
     * The layout is horizontal, the order is BGR
     */
    HORIZONTAL_BGR(GDK_SUBPIXEL_LAYOUT_HORIZONTAL_BGR),

    /**
     * The layout is vertical, the order is RGB
     */
    VERTICAL_RGB(GDK_SUBPIXEL_LAYOUT_VERTICAL_RGB),

    /**
     * The layout is vertical, the order is BGR
     */
    VERTICAL_BGR(GDK_SUBPIXEL_LAYOUT_VERTICAL_BGR),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkSubpixelLayout): SubpixelLayout =
            when (nativeValue) {
                GDK_SUBPIXEL_LAYOUT_UNKNOWN -> UNKNOWN
                GDK_SUBPIXEL_LAYOUT_NONE -> NONE
                GDK_SUBPIXEL_LAYOUT_HORIZONTAL_RGB -> HORIZONTAL_RGB
                GDK_SUBPIXEL_LAYOUT_HORIZONTAL_BGR -> HORIZONTAL_BGR
                GDK_SUBPIXEL_LAYOUT_VERTICAL_RGB -> VERTICAL_RGB
                GDK_SUBPIXEL_LAYOUT_VERTICAL_BGR -> VERTICAL_BGR
                else -> error("invalid nativeValue")
            }
    }
}
