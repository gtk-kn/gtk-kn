// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkFullscreenMode

/**
 * Indicates which monitor a surface should span over when in fullscreen mode.
 */
public enum class FullscreenMode(
    public val nativeValue: GdkFullscreenMode,
) {
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
        public fun fromNativeValue(nativeValue: GdkFullscreenMode): FullscreenMode =
            when (nativeValue) {
                GdkFullscreenMode.GDK_FULLSCREEN_ON_CURRENT_MONITOR -> CURRENT_MONITOR
                GdkFullscreenMode.GDK_FULLSCREEN_ON_ALL_MONITORS -> ALL_MONITORS
                else -> error("invalid nativeValue")
            }
    }
}
