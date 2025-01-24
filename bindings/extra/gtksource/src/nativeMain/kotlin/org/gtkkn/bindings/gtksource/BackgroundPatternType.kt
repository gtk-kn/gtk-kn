// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GtkSourceBackgroundPatternType
import org.gtkkn.native.gtksource.gtk_source_background_pattern_type_get_type

public enum class BackgroundPatternType(public val nativeValue: GtkSourceBackgroundPatternType) {
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

        /**
         * Get the GType of BackgroundPatternType
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_background_pattern_type_get_type()
    }
}
