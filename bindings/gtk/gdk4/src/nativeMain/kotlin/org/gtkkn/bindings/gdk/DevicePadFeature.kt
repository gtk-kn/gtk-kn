// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkDevicePadFeature
import org.gtkkn.native.gdk.GdkDevicePadFeature.GDK_DEVICE_PAD_FEATURE_BUTTON
import org.gtkkn.native.gdk.GdkDevicePadFeature.GDK_DEVICE_PAD_FEATURE_RING
import org.gtkkn.native.gdk.GdkDevicePadFeature.GDK_DEVICE_PAD_FEATURE_STRIP

/**
 * A pad feature.
 */
public enum class DevicePadFeature(
    public val nativeValue: GdkDevicePadFeature,
) {
    /**
     * a button
     */
    BUTTON(GDK_DEVICE_PAD_FEATURE_BUTTON),

    /**
     * a ring-shaped interactive area
     */
    RING(GDK_DEVICE_PAD_FEATURE_RING),

    /**
     * a straight interactive area
     */
    STRIP(GDK_DEVICE_PAD_FEATURE_STRIP),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkDevicePadFeature): DevicePadFeature =
            when (nativeValue) {
                GDK_DEVICE_PAD_FEATURE_BUTTON -> BUTTON
                GDK_DEVICE_PAD_FEATURE_RING -> RING
                GDK_DEVICE_PAD_FEATURE_STRIP -> STRIP
                else -> error("invalid nativeValue")
            }
    }
}
