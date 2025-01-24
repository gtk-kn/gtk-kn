// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoAlignment
import org.gtkkn.native.pango.pango_alignment_get_type

/**
 * `PangoAlignment` describes how to align the lines of a `PangoLayout`
 * within the available space.
 *
 * If the `PangoLayout` is set to justify using [method@Pango.Layout.set_justify],
 * this only affects partial lines.
 *
 * See [method@Pango.Layout.set_auto_dir] for how text direction affects
 * the interpretation of `PangoAlignment` values.
 */
public enum class Alignment(public val nativeValue: PangoAlignment) {
    /**
     * Put all available space on the right
     */
    LEFT(PangoAlignment.PANGO_ALIGN_LEFT),

    /**
     * Center the line within the available space
     */
    CENTER(PangoAlignment.PANGO_ALIGN_CENTER),

    /**
     * Put all available space on the left
     */
    RIGHT(PangoAlignment.PANGO_ALIGN_RIGHT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoAlignment): Alignment = when (nativeValue) {
            PangoAlignment.PANGO_ALIGN_LEFT -> LEFT
            PangoAlignment.PANGO_ALIGN_CENTER -> CENTER
            PangoAlignment.PANGO_ALIGN_RIGHT -> RIGHT
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of Alignment
         *
         * @return the GType
         */
        public fun getType(): GType = pango_alignment_get_type()
    }
}
