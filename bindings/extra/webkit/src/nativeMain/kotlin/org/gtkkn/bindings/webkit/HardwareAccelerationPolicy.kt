// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_16
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitHardwareAccelerationPolicy
import org.gtkkn.native.webkit.webkit_hardware_acceleration_policy_get_type

/**
 * Enum values used for determining the hardware acceleration policy.
 * @since 2.16
 */
@WebKitVersion2_16
public enum class HardwareAccelerationPolicy(public val nativeValue: WebKitHardwareAccelerationPolicy) {
    /**
     * Hardware acceleration is always enabled, even for websites not requesting it.
     */
    ALWAYS(WebKitHardwareAccelerationPolicy.WEBKIT_HARDWARE_ACCELERATION_POLICY_ALWAYS),

    /**
     * Hardware acceleration is always disabled, even for websites requesting it.
     */
    NEVER(WebKitHardwareAccelerationPolicy.WEBKIT_HARDWARE_ACCELERATION_POLICY_NEVER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitHardwareAccelerationPolicy): HardwareAccelerationPolicy =
            when (nativeValue) {
                WebKitHardwareAccelerationPolicy.WEBKIT_HARDWARE_ACCELERATION_POLICY_ALWAYS -> ALWAYS
                WebKitHardwareAccelerationPolicy.WEBKIT_HARDWARE_ACCELERATION_POLICY_NEVER -> NEVER
                else -> error("invalid nativeValue")
            }

        /**
         * Get the GType of HardwareAccelerationPolicy
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_hardware_acceleration_policy_get_type()
    }
}
