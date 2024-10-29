// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkGraphicsOffloadEnabled
import org.gtkkn.native.gtk.GtkGraphicsOffloadEnabled.GTK_GRAPHICS_OFFLOAD_DISABLED
import org.gtkkn.native.gtk.GtkGraphicsOffloadEnabled.GTK_GRAPHICS_OFFLOAD_ENABLED

/**
 * Represents the state of graphics offlodading.
 * @since 4.14
 */
public enum class GraphicsOffloadEnabled(
    public val nativeValue: GtkGraphicsOffloadEnabled,
) {
    /**
     * Graphics offloading is enabled.
     */
    ENABLED(GTK_GRAPHICS_OFFLOAD_ENABLED),

    /**
     * Graphics offloading is disabled.
     */
    DISABLED(GTK_GRAPHICS_OFFLOAD_DISABLED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkGraphicsOffloadEnabled): GraphicsOffloadEnabled =
            when (nativeValue) {
                GTK_GRAPHICS_OFFLOAD_ENABLED -> ENABLED
                GTK_GRAPHICS_OFFLOAD_DISABLED -> DISABLED
                else -> error("invalid nativeValue")
            }
    }
}
