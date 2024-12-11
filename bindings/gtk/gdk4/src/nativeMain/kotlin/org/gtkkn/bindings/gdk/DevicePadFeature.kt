// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkDevicePadFeature
import org.gtkkn.native.gdk.gdk_device_pad_feature_get_type
import org.gtkkn.native.gobject.GType

/**
 * A pad feature.
 */
public enum class DevicePadFeature(public val nativeValue: GdkDevicePadFeature) {
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
        public fun fromNativeValue(nativeValue: GdkDevicePadFeature): DevicePadFeature = when (nativeValue) {
            GdkDevicePadFeature.GDK_DEVICE_PAD_FEATURE_BUTTON -> BUTTON
            GdkDevicePadFeature.GDK_DEVICE_PAD_FEATURE_RING -> RING
            GdkDevicePadFeature.GDK_DEVICE_PAD_FEATURE_STRIP -> STRIP
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of DevicePadFeature
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_device_pad_feature_get_type()
    }
}
