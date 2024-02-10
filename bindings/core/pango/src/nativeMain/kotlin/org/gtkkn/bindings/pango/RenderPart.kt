// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.native.pango.PangoRenderPart
import org.gtkkn.native.pango.PangoRenderPart.PANGO_RENDER_PART_BACKGROUND
import org.gtkkn.native.pango.PangoRenderPart.PANGO_RENDER_PART_FOREGROUND
import org.gtkkn.native.pango.PangoRenderPart.PANGO_RENDER_PART_OVERLINE
import org.gtkkn.native.pango.PangoRenderPart.PANGO_RENDER_PART_STRIKETHROUGH
import org.gtkkn.native.pango.PangoRenderPart.PANGO_RENDER_PART_UNDERLINE

/**
 * `PangoRenderPart` defines different items to render for such
 * purposes as setting colors.
 * @since 1.8
 */
public enum class RenderPart(
    public val nativeValue: PangoRenderPart,
) {
    /**
     * the text itself
     */
    FOREGROUND(PANGO_RENDER_PART_FOREGROUND),

    /**
     * the area behind the text
     */
    BACKGROUND(PANGO_RENDER_PART_BACKGROUND),

    /**
     * underlines
     */
    UNDERLINE(PANGO_RENDER_PART_UNDERLINE),

    /**
     * strikethrough lines
     */
    STRIKETHROUGH(PANGO_RENDER_PART_STRIKETHROUGH),

    /**
     * overlines
     */
    OVERLINE(PANGO_RENDER_PART_OVERLINE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoRenderPart): RenderPart =
            when (nativeValue) {
                PANGO_RENDER_PART_FOREGROUND -> FOREGROUND
                PANGO_RENDER_PART_BACKGROUND -> BACKGROUND
                PANGO_RENDER_PART_UNDERLINE -> UNDERLINE
                PANGO_RENDER_PART_STRIKETHROUGH -> STRIKETHROUGH
                PANGO_RENDER_PART_OVERLINE -> OVERLINE
                else -> error("invalid nativeValue")
            }
    }
}
