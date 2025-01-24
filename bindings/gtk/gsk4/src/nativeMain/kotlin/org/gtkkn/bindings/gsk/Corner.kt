// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskCorner
import org.gtkkn.native.gsk.gsk_corner_get_type

/**
 * The corner indices used by `GskRoundedRect`.
 */
public enum class Corner(public val nativeValue: GskCorner) {
    /**
     * The top left corner
     */
    TOP_LEFT(GskCorner.GSK_CORNER_TOP_LEFT),

    /**
     * The top right corner
     */
    TOP_RIGHT(GskCorner.GSK_CORNER_TOP_RIGHT),

    /**
     * The bottom right corner
     */
    BOTTOM_RIGHT(GskCorner.GSK_CORNER_BOTTOM_RIGHT),

    /**
     * The bottom left corner
     */
    BOTTOM_LEFT(GskCorner.GSK_CORNER_BOTTOM_LEFT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GskCorner): Corner = when (nativeValue) {
            GskCorner.GSK_CORNER_TOP_LEFT -> TOP_LEFT
            GskCorner.GSK_CORNER_TOP_RIGHT -> TOP_RIGHT
            GskCorner.GSK_CORNER_BOTTOM_RIGHT -> BOTTOM_RIGHT
            GskCorner.GSK_CORNER_BOTTOM_LEFT -> BOTTOM_LEFT
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of Corner
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_corner_get_type()
    }
}
