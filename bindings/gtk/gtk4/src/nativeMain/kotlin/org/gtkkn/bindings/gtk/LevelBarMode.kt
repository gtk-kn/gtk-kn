// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkLevelBarMode

/**
 * Describes how [class@LevelBar] contents should be rendered.
 *
 * Note that this enumeration could be extended with additional modes
 * in the future.
 */
public enum class LevelBarMode(
    public val nativeValue: GtkLevelBarMode,
) {
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
        public fun fromNativeValue(nativeValue: GtkLevelBarMode): LevelBarMode =
            when (nativeValue) {
                GtkLevelBarMode.GTK_LEVEL_BAR_MODE_CONTINUOUS -> CONTINUOUS
                GtkLevelBarMode.GTK_LEVEL_BAR_MODE_DISCRETE -> DISCRETE
                else -> error("invalid nativeValue")
            }
    }
}
