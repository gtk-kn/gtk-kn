// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkFullscreenMode
import org.gtkkn.native.gdk.gdk_fullscreen_mode_get_type
import org.gtkkn.native.gobject.GType

/**
 * Indicates which monitor a surface should span over when in fullscreen mode.
 */
public enum class FullscreenMode(public val nativeValue: GdkFullscreenMode) {
    /**
     * Fullscreen on current monitor only.
     */
    CURRENT_MONITOR(GdkFullscreenMode.GDK_FULLSCREEN_ON_CURRENT_MONITOR),

    /**
     * Span across all monitors when fullscreen.
     */
    ALL_MONITORS(GdkFullscreenMode.GDK_FULLSCREEN_ON_ALL_MONITORS),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkFullscreenMode): FullscreenMode = when (nativeValue) {
            GdkFullscreenMode.GDK_FULLSCREEN_ON_CURRENT_MONITOR -> CURRENT_MONITOR
            GdkFullscreenMode.GDK_FULLSCREEN_ON_ALL_MONITORS -> ALL_MONITORS
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of FullscreenMode
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_fullscreen_mode_get_type()
    }
}
