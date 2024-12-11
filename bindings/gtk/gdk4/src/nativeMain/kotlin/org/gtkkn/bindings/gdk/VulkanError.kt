// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.native.gdk.GdkVulkanError
import org.gtkkn.native.gdk.gdk_vulkan_error_get_type
import org.gtkkn.native.gdk.gdk_vulkan_error_quark
import org.gtkkn.native.gobject.GType

/**
 * Error enumeration for `GdkVulkanContext`.
 */
public enum class VulkanError(public val nativeValue: GdkVulkanError) {
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
        public fun fromNativeValue(nativeValue: GdkVulkanError): VulkanError = when (nativeValue) {
            GdkVulkanError.GDK_VULKAN_ERROR_UNSUPPORTED -> UNSUPPORTED
            GdkVulkanError.GDK_VULKAN_ERROR_NOT_AVAILABLE -> NOT_AVAILABLE
            else -> error("invalid nativeValue")
        }

        public fun quark(): Quark = gdk_vulkan_error_quark()

        /**
         * Get the GType of VulkanError
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_vulkan_error_get_type()

        public fun fromErrorOrNull(error: Error): VulkanError? = if (error.domain != quark()) {
            null
        } else {
            VulkanError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}
