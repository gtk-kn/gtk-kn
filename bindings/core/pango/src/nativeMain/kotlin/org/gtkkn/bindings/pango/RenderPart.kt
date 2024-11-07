// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.bindings.pango.annotations.PangoVersion1_8
import org.gtkkn.native.pango.PangoRenderPart

/**
 * `PangoRenderPart` defines different items to render for such
 * purposes as setting colors.
 * @since 1.8
 */
@PangoVersion1_8
public enum class RenderPart(
    public val nativeValue: PangoRenderPart,
) {
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
        public fun fromNativeValue(nativeValue: PangoRenderPart): RenderPart =
            when (nativeValue) {
                PangoRenderPart.PANGO_RENDER_PART_FOREGROUND -> FOREGROUND
                PangoRenderPart.PANGO_RENDER_PART_BACKGROUND -> BACKGROUND
                PangoRenderPart.PANGO_RENDER_PART_UNDERLINE -> UNDERLINE
                PangoRenderPart.PANGO_RENDER_PART_STRIKETHROUGH -> STRIKETHROUGH
                PangoRenderPart.PANGO_RENDER_PART_OVERLINE -> OVERLINE
                else -> error("invalid nativeValue")
            }
    }
}
