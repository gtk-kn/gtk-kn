// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import org.gtkkn.native.gsk.GskBlendMode

/**
 * The blend modes available for render nodes.
 *
 * The implementation of each blend mode is deferred to the
 * rendering pipeline.
 *
 * See <https://www.w3.org/TR/compositing-1/#blending> for more information
 * on blending and blend modes.
 */
public enum class BlendMode(
    public val nativeValue: GskBlendMode,
) {
    /**
     * The default blend mode, which specifies no blending
     */
    DEFAULT(GskBlendMode.GSK_BLEND_MODE_DEFAULT),

    /**
     * The source color is multiplied by the destination
     *   and replaces the destination
     */
    MULTIPLY(GskBlendMode.GSK_BLEND_MODE_MULTIPLY),

    /**
     * Multiplies the complements of the destination and source
     *   color values, then complements the result.
     */
    SCREEN(GskBlendMode.GSK_BLEND_MODE_SCREEN),

    /**
     * Multiplies or screens the colors, depending on the
     *   destination color value. This is the inverse of hard-list
     */
    OVERLAY(GskBlendMode.GSK_BLEND_MODE_OVERLAY),

    /**
     * Selects the darker of the destination and source colors
     */
    DARKEN(GskBlendMode.GSK_BLEND_MODE_DARKEN),

    /**
     * Selects the lighter of the destination and source colors
     */
    LIGHTEN(GskBlendMode.GSK_BLEND_MODE_LIGHTEN),

    /**
     * Brightens the destination color to reflect the source color
     */
    COLOR_DODGE(GskBlendMode.GSK_BLEND_MODE_COLOR_DODGE),

    /**
     * Darkens the destination color to reflect the source color
     */
    COLOR_BURN(GskBlendMode.GSK_BLEND_MODE_COLOR_BURN),

    /**
     * Multiplies or screens the colors, depending on the source color value
     */
    HARD_LIGHT(GskBlendMode.GSK_BLEND_MODE_HARD_LIGHT),

    /**
     * Darkens or lightens the colors, depending on the source color value
     */
    SOFT_LIGHT(GskBlendMode.GSK_BLEND_MODE_SOFT_LIGHT),

    /**
     * Subtracts the darker of the two constituent colors from the lighter color
     */
    DIFFERENCE(GskBlendMode.GSK_BLEND_MODE_DIFFERENCE),

    /**
     * Produces an effect similar to that of the difference mode but lower in contrast
     */
    EXCLUSION(GskBlendMode.GSK_BLEND_MODE_EXCLUSION),

    /**
     * Creates a color with the hue and saturation of the source color and the luminosity of the destination color
     */
    COLOR(GskBlendMode.GSK_BLEND_MODE_COLOR),

    /**
     * Creates a color with the hue of the source color and the saturation and luminosity of the destination color
     */
    HUE(GskBlendMode.GSK_BLEND_MODE_HUE),

    /**
     * Creates a color with the saturation of the source color and the hue and luminosity of the destination color
     */
    SATURATION(GskBlendMode.GSK_BLEND_MODE_SATURATION),

    /**
     * Creates a color with the luminosity of the source color and the hue and saturation of the destination color
     */
    LUMINOSITY(GskBlendMode.GSK_BLEND_MODE_LUMINOSITY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GskBlendMode): BlendMode =
            when (nativeValue) {
                GskBlendMode.GSK_BLEND_MODE_DEFAULT -> DEFAULT
                GskBlendMode.GSK_BLEND_MODE_MULTIPLY -> MULTIPLY
                GskBlendMode.GSK_BLEND_MODE_SCREEN -> SCREEN
                GskBlendMode.GSK_BLEND_MODE_OVERLAY -> OVERLAY
                GskBlendMode.GSK_BLEND_MODE_DARKEN -> DARKEN
                GskBlendMode.GSK_BLEND_MODE_LIGHTEN -> LIGHTEN
                GskBlendMode.GSK_BLEND_MODE_COLOR_DODGE -> COLOR_DODGE
                GskBlendMode.GSK_BLEND_MODE_COLOR_BURN -> COLOR_BURN
                GskBlendMode.GSK_BLEND_MODE_HARD_LIGHT -> HARD_LIGHT
                GskBlendMode.GSK_BLEND_MODE_SOFT_LIGHT -> SOFT_LIGHT
                GskBlendMode.GSK_BLEND_MODE_DIFFERENCE -> DIFFERENCE
                GskBlendMode.GSK_BLEND_MODE_EXCLUSION -> EXCLUSION
                GskBlendMode.GSK_BLEND_MODE_COLOR -> COLOR
                GskBlendMode.GSK_BLEND_MODE_HUE -> HUE
                GskBlendMode.GSK_BLEND_MODE_SATURATION -> SATURATION
                GskBlendMode.GSK_BLEND_MODE_LUMINOSITY -> LUMINOSITY
                else -> error("invalid nativeValue")
            }
    }
}
