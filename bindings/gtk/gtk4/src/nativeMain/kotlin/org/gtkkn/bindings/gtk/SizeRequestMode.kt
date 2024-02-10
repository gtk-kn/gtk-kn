// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkSizeRequestMode
import org.gtkkn.native.gtk.GtkSizeRequestMode.GTK_SIZE_REQUEST_CONSTANT_SIZE
import org.gtkkn.native.gtk.GtkSizeRequestMode.GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH
import org.gtkkn.native.gtk.GtkSizeRequestMode.GTK_SIZE_REQUEST_WIDTH_FOR_HEIGHT

/**
 * Specifies a preference for height-for-width or
 * width-for-height geometry management.
 */
public enum class SizeRequestMode(
    public val nativeValue: GtkSizeRequestMode,
) {
    /**
     * Prefer height-for-width geometry management
     */
    HEIGHT_FOR_WIDTH(GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH),

    /**
     * Prefer width-for-height geometry management
     */
    WIDTH_FOR_HEIGHT(GTK_SIZE_REQUEST_WIDTH_FOR_HEIGHT),

    /**
     * Don’t trade height-for-width or width-for-height
     */
    CONSTANT_SIZE(GTK_SIZE_REQUEST_CONSTANT_SIZE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSizeRequestMode): SizeRequestMode =
            when (nativeValue) {
                GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH -> HEIGHT_FOR_WIDTH
                GTK_SIZE_REQUEST_WIDTH_FOR_HEIGHT -> WIDTH_FOR_HEIGHT
                GTK_SIZE_REQUEST_CONSTANT_SIZE -> CONSTANT_SIZE
                else -> error("invalid nativeValue")
            }
    }
}
