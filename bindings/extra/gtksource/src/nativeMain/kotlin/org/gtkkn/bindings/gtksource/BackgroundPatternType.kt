// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import org.gtkkn.native.gtksource.GtkSourceBackgroundPatternType

public enum class BackgroundPatternType(
    public val nativeValue: GtkSourceBackgroundPatternType,
) {
    /**
     * no pattern
     */
    NONE(GtkSourceBackgroundPatternType.GTK_SOURCE_BACKGROUND_PATTERN_TYPE_NONE),

    /**
     * grid pattern
     */
    GRID(GtkSourceBackgroundPatternType.GTK_SOURCE_BACKGROUND_PATTERN_TYPE_GRID),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkSourceBackgroundPatternType): BackgroundPatternType =
            when (nativeValue) {
                GtkSourceBackgroundPatternType.GTK_SOURCE_BACKGROUND_PATTERN_TYPE_NONE -> NONE
                GtkSourceBackgroundPatternType.GTK_SOURCE_BACKGROUND_PATTERN_TYPE_GRID -> GRID
                else -> error("invalid nativeValue")
            }
    }
}
