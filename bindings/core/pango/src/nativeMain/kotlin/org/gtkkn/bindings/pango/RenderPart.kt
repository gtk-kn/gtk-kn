// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import org.gtkkn.bindings.pango.annotations.PangoVersion1_8
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoRenderPart
import org.gtkkn.native.pango.pango_render_part_get_type

/**
 * `PangoRenderPart` defines different items to render for such
 * purposes as setting colors.
 * @since 1.8
 */
@PangoVersion1_8
public enum class RenderPart(public val nativeValue: PangoRenderPart) {
    /**
     * the text itself
     */
    FOREGROUND(PangoRenderPart.PANGO_RENDER_PART_FOREGROUND),

    /**
     * the area behind the text
     */
    BACKGROUND(PangoRenderPart.PANGO_RENDER_PART_BACKGROUND),

    /**
     * underlines
     */
    UNDERLINE(PangoRenderPart.PANGO_RENDER_PART_UNDERLINE),

    /**
     * strikethrough lines
     */
    STRIKETHROUGH(PangoRenderPart.PANGO_RENDER_PART_STRIKETHROUGH),

    /**
     * overlines
     */
    OVERLINE(PangoRenderPart.PANGO_RENDER_PART_OVERLINE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoRenderPart): RenderPart = when (nativeValue) {
            PangoRenderPart.PANGO_RENDER_PART_FOREGROUND -> FOREGROUND
            PangoRenderPart.PANGO_RENDER_PART_BACKGROUND -> BACKGROUND
            PangoRenderPart.PANGO_RENDER_PART_UNDERLINE -> UNDERLINE
            PangoRenderPart.PANGO_RENDER_PART_STRIKETHROUGH -> STRIKETHROUGH
            PangoRenderPart.PANGO_RENDER_PART_OVERLINE -> OVERLINE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of RenderPart
         *
         * @return the GType
         */
        public fun getType(): GType = pango_render_part_get_type()
    }
}
