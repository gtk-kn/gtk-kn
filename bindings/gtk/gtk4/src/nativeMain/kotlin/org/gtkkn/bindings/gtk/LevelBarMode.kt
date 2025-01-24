// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkLevelBarMode
import org.gtkkn.native.gtk.gtk_level_bar_mode_get_type

/**
 * Describes how [class@LevelBar] contents should be rendered.
 *
 * Note that this enumeration could be extended with additional modes
 * in the future.
 */
public enum class LevelBarMode(public val nativeValue: GtkLevelBarMode) {
    /**
     * the bar has a continuous mode
     */
    CONTINUOUS(GtkLevelBarMode.GTK_LEVEL_BAR_MODE_CONTINUOUS),

    /**
     * the bar has a discrete mode
     */
    DISCRETE(GtkLevelBarMode.GTK_LEVEL_BAR_MODE_DISCRETE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkLevelBarMode): LevelBarMode = when (nativeValue) {
            GtkLevelBarMode.GTK_LEVEL_BAR_MODE_CONTINUOUS -> CONTINUOUS
            GtkLevelBarMode.GTK_LEVEL_BAR_MODE_DISCRETE -> DISCRETE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of LevelBarMode
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_level_bar_mode_get_type()
    }
}
