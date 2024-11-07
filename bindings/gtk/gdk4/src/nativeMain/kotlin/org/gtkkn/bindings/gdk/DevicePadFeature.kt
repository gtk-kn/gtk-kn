// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkDevicePadFeature

/**
 * A pad feature.
 */
public enum class DevicePadFeature(
    public val nativeValue: GdkDevicePadFeature,
) {
    /**
     * a button
     */
    BUTTON(GdkDevicePadFeature.GDK_DEVICE_PAD_FEATURE_BUTTON),

    /**
     * a ring-shaped interactive area
     */
    RING(GdkDevicePadFeature.GDK_DEVICE_PAD_FEATURE_RING),

    /**
     * a straight interactive area
     */
    STRIP(GdkDevicePadFeature.GDK_DEVICE_PAD_FEATURE_STRIP),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkDevicePadFeature): DevicePadFeature =
            when (nativeValue) {
                GdkDevicePadFeature.GDK_DEVICE_PAD_FEATURE_BUTTON -> BUTTON
                GdkDevicePadFeature.GDK_DEVICE_PAD_FEATURE_RING -> RING
                GdkDevicePadFeature.GDK_DEVICE_PAD_FEATURE_STRIP -> STRIP
                else -> error("invalid nativeValue")
            }
    }
}
