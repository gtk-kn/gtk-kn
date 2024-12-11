// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkGraphicsOffloadEnabled
import org.gtkkn.native.gtk.gtk_graphics_offload_enabled_get_type

/**
 * Represents the state of graphics offlodading.
 * @since 4.14
 */
@GtkVersion4_14
public enum class GraphicsOffloadEnabled(public val nativeValue: GtkGraphicsOffloadEnabled) {
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

        /**
         * Get the GType of GraphicsOffloadEnabled
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_graphics_offload_enabled_get_type()
    }
}
