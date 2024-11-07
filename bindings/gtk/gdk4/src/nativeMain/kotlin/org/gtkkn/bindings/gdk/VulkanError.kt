// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.bindings.glib.Error
import org.gtkkn.native.gdk.GdkVulkanError
import org.gtkkn.native.gdk.gdk_vulkan_error_quark
import kotlin.UInt

/**
 * Error enumeration for `GdkVulkanContext`.
 */
public enum class VulkanError(
    public val nativeValue: GdkVulkanError,
) {
    /**
     * Vulkan is not supported on this backend or has not been
     *   compiled in.
     */
    UNSUPPORTED(GdkVulkanError.GDK_VULKAN_ERROR_UNSUPPORTED),

    /**
     * Vulkan support is not available on this Surface
     */
    NOT_AVAILABLE(GdkVulkanError.GDK_VULKAN_ERROR_NOT_AVAILABLE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkVulkanError): VulkanError =
            when (nativeValue) {
                GdkVulkanError.GDK_VULKAN_ERROR_UNSUPPORTED -> UNSUPPORTED
                GdkVulkanError.GDK_VULKAN_ERROR_NOT_AVAILABLE -> NOT_AVAILABLE
                else -> error("invalid nativeValue")
            }

        public fun quark(): UInt = gdk_vulkan_error_quark()

        public fun fromErrorOrNull(error: Error): VulkanError? =
            if (error.domain != quark()) {
                null
            } else {
                VulkanError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}
