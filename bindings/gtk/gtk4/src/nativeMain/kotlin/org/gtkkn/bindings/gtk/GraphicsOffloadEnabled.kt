// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.native.gtk.GtkGraphicsOffloadEnabled

/**
 * Represents the state of graphics offlodading.
 * @since 4.14
 */
@GtkVersion4_14
public enum class GraphicsOffloadEnabled(
    public val nativeValue: GtkGraphicsOffloadEnabled,
) {
    /**
     * Graphics offloading is enabled.
     */
    ENABLED(GtkGraphicsOffloadEnabled.GTK_GRAPHICS_OFFLOAD_ENABLED),

    /**
     * Graphics offloading is disabled.
     */
    DISABLED(GtkGraphicsOffloadEnabled.GTK_GRAPHICS_OFFLOAD_DISABLED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkGraphicsOffloadEnabled): GraphicsOffloadEnabled =
            when (nativeValue) {
                GtkGraphicsOffloadEnabled.GTK_GRAPHICS_OFFLOAD_ENABLED -> ENABLED
                GtkGraphicsOffloadEnabled.GTK_GRAPHICS_OFFLOAD_DISABLED -> DISABLED
                else -> error("invalid nativeValue")
            }
    }
}
