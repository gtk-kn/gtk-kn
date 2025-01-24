// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.gtk.annotations.GtkVersion4_10
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessiblePlatformState
import org.gtkkn.native.gtk.gtk_accessible_platform_state_get_type

/**
 * The various platform states which can be queried
 * using [method@Gtk.Accessible.get_platform_state].
 * @since 4.10
 */
@GtkVersion4_10
public enum class AccessiblePlatformState(public val nativeValue: GtkAccessiblePlatformState) {
    /**
     * whether the accessible can be focused
     */
    FOCUSABLE(GtkAccessiblePlatformState.GTK_ACCESSIBLE_PLATFORM_STATE_FOCUSABLE),

    /**
     * whether the accessible has focus
     */
    FOCUSED(GtkAccessiblePlatformState.GTK_ACCESSIBLE_PLATFORM_STATE_FOCUSED),

    /**
     * whether the accessible is active
     */
    ACTIVE(GtkAccessiblePlatformState.GTK_ACCESSIBLE_PLATFORM_STATE_ACTIVE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkAccessiblePlatformState): AccessiblePlatformState =
            when (nativeValue) {
                GtkAccessiblePlatformState.GTK_ACCESSIBLE_PLATFORM_STATE_FOCUSABLE -> FOCUSABLE
                GtkAccessiblePlatformState.GTK_ACCESSIBLE_PLATFORM_STATE_FOCUSED -> FOCUSED
                GtkAccessiblePlatformState.GTK_ACCESSIBLE_PLATFORM_STATE_ACTIVE -> ACTIVE
                else -> error("invalid nativeValue")
            }

        /**
         * Get the GType of AccessiblePlatformState
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_accessible_platform_state_get_type()
    }
}
