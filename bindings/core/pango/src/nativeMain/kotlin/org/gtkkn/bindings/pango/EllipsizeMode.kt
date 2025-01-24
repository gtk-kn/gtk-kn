// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoEllipsizeMode
import org.gtkkn.native.pango.pango_ellipsize_mode_get_type

/**
 * `PangoEllipsizeMode` describes what sort of ellipsization
 * should be applied to text.
 *
 * In the ellipsization process characters are removed from the
 * text in order to make it fit to a given width and replaced
 * with an ellipsis.
 */
public enum class EllipsizeMode(public val nativeValue: PangoEllipsizeMode) {
    /**
     * No ellipsization
     */
    NONE(PangoEllipsizeMode.PANGO_ELLIPSIZE_NONE),

    /**
     * Omit characters at the start of the text
     */
    START(PangoEllipsizeMode.PANGO_ELLIPSIZE_START),

    /**
     * Omit characters in the middle of the text
     */
    MIDDLE(PangoEllipsizeMode.PANGO_ELLIPSIZE_MIDDLE),

    /**
     * Omit characters at the end of the text
     */
    END(PangoEllipsizeMode.PANGO_ELLIPSIZE_END),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoEllipsizeMode): EllipsizeMode = when (nativeValue) {
            PangoEllipsizeMode.PANGO_ELLIPSIZE_NONE -> NONE
            PangoEllipsizeMode.PANGO_ELLIPSIZE_START -> START
            PangoEllipsizeMode.PANGO_ELLIPSIZE_MIDDLE -> MIDDLE
            PangoEllipsizeMode.PANGO_ELLIPSIZE_END -> END
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of EllipsizeMode
         *
         * @return the GType
         */
        public fun getType(): GType = pango_ellipsize_mode_get_type()
    }
}
