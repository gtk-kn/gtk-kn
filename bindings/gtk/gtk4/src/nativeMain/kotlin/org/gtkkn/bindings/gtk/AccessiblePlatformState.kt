// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.gtk.annotations.GtkVersion4_10
import org.gtkkn.native.gtk.GtkAccessiblePlatformState
import org.gtkkn.native.gtk.GtkAccessiblePlatformState.GTK_ACCESSIBLE_PLATFORM_STATE_ACTIVE
import org.gtkkn.native.gtk.GtkAccessiblePlatformState.GTK_ACCESSIBLE_PLATFORM_STATE_FOCUSABLE
import org.gtkkn.native.gtk.GtkAccessiblePlatformState.GTK_ACCESSIBLE_PLATFORM_STATE_FOCUSED

/**
 * The various platform states which can be queried
 * using [method@Gtk.Accessible.get_platform_state].
 * @since 4.10
 */
@GtkVersion4_10
public enum class AccessiblePlatformState(
    public val nativeValue: GtkAccessiblePlatformState,
) {
    /**
     * whether the accessible can be focused
     */
    FOCUSABLE(GTK_ACCESSIBLE_PLATFORM_STATE_FOCUSABLE),

    /**
     * whether the accessible has focus
     */
    FOCUSED(GTK_ACCESSIBLE_PLATFORM_STATE_FOCUSED),

    /**
     * whether the accessible is active
     */
    ACTIVE(GTK_ACCESSIBLE_PLATFORM_STATE_ACTIVE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkAccessiblePlatformState): AccessiblePlatformState =
            when (nativeValue) {
                GTK_ACCESSIBLE_PLATFORM_STATE_FOCUSABLE -> FOCUSABLE
                GTK_ACCESSIBLE_PLATFORM_STATE_FOCUSED -> FOCUSED
                GTK_ACCESSIBLE_PLATFORM_STATE_ACTIVE -> ACTIVE
                else -> error("invalid nativeValue")
            }
    }
}
