// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import org.gtkkn.native.gsk.GskBlendMode
import org.gtkkn.native.gsk.GskBlendMode.GSK_BLEND_MODE_COLOR
import org.gtkkn.native.gsk.GskBlendMode.GSK_BLEND_MODE_COLOR_BURN
import org.gtkkn.native.gsk.GskBlendMode.GSK_BLEND_MODE_COLOR_DODGE
import org.gtkkn.native.gsk.GskBlendMode.GSK_BLEND_MODE_DARKEN
import org.gtkkn.native.gsk.GskBlendMode.GSK_BLEND_MODE_DEFAULT
import org.gtkkn.native.gsk.GskBlendMode.GSK_BLEND_MODE_DIFFERENCE
import org.gtkkn.native.gsk.GskBlendMode.GSK_BLEND_MODE_EXCLUSION
import org.gtkkn.native.gsk.GskBlendMode.GSK_BLEND_MODE_HARD_LIGHT
import org.gtkkn.native.gsk.GskBlendMode.GSK_BLEND_MODE_HUE
import org.gtkkn.native.gsk.GskBlendMode.GSK_BLEND_MODE_LIGHTEN
import org.gtkkn.native.gsk.GskBlendMode.GSK_BLEND_MODE_LUMINOSITY
import org.gtkkn.native.gsk.GskBlendMode.GSK_BLEND_MODE_MULTIPLY
import org.gtkkn.native.gsk.GskBlendMode.GSK_BLEND_MODE_OVERLAY
import org.gtkkn.native.gsk.GskBlendMode.GSK_BLEND_MODE_SATURATION
import org.gtkkn.native.gsk.GskBlendMode.GSK_BLEND_MODE_SCREEN
import org.gtkkn.native.gsk.GskBlendMode.GSK_BLEND_MODE_SOFT_LIGHT

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
    DEFAULT(GSK_BLEND_MODE_DEFAULT),

    /**
     * The source color is multiplied by the destination
     *   and replaces the destination
     */
    MULTIPLY(GSK_BLEND_MODE_MULTIPLY),

    /**
     * Multiplies the complements of the destination and source
     *   color values, then complements the result.
     */
    SCREEN(GSK_BLEND_MODE_SCREEN),

    /**
     * Multiplies or screens the colors, depending on the
     *   destination color value. This is the inverse of hard-list
     */
    OVERLAY(GSK_BLEND_MODE_OVERLAY),

    /**
     * Selects the darker of the destination and source colors
     */
    DARKEN(GSK_BLEND_MODE_DARKEN),

    /**
     * Selects the lighter of the destination and source colors
     */
    LIGHTEN(GSK_BLEND_MODE_LIGHTEN),

    /**
     * Brightens the destination color to reflect the source color
     */
    COLOR_DODGE(GSK_BLEND_MODE_COLOR_DODGE),

    /**
     * Darkens the destination color to reflect the source color
     */
    COLOR_BURN(GSK_BLEND_MODE_COLOR_BURN),

    /**
     * Multiplies or screens the colors, depending on the source color value
     */
    HARD_LIGHT(GSK_BLEND_MODE_HARD_LIGHT),

    /**
     * Darkens or lightens the colors, depending on the source color value
     */
    SOFT_LIGHT(GSK_BLEND_MODE_SOFT_LIGHT),

    /**
     * Subtracts the darker of the two constituent colors from the lighter color
     */
    DIFFERENCE(GSK_BLEND_MODE_DIFFERENCE),

    /**
     * Produces an effect similar to that of the difference mode but lower in contrast
     */
    EXCLUSION(GSK_BLEND_MODE_EXCLUSION),

    /**
     * Creates a color with the hue and saturation of the source color and the luminosity of the destination color
     */
    COLOR(GSK_BLEND_MODE_COLOR),

    /**
     * Creates a color with the hue of the source color and the saturation and luminosity of the destination color
     */
    HUE(GSK_BLEND_MODE_HUE),

    /**
     * Creates a color with the saturation of the source color and the hue and luminosity of the destination color
     */
    SATURATION(GSK_BLEND_MODE_SATURATION),

    /**
     * Creates a color with the luminosity of the source color and the hue and saturation of the destination color
     */
    LUMINOSITY(GSK_BLEND_MODE_LUMINOSITY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GskBlendMode): BlendMode =
            when (nativeValue) {
                GSK_BLEND_MODE_DEFAULT -> DEFAULT
                GSK_BLEND_MODE_MULTIPLY -> MULTIPLY
                GSK_BLEND_MODE_SCREEN -> SCREEN
                GSK_BLEND_MODE_OVERLAY -> OVERLAY
                GSK_BLEND_MODE_DARKEN -> DARKEN
                GSK_BLEND_MODE_LIGHTEN -> LIGHTEN
                GSK_BLEND_MODE_COLOR_DODGE -> COLOR_DODGE
                GSK_BLEND_MODE_COLOR_BURN -> COLOR_BURN
                GSK_BLEND_MODE_HARD_LIGHT -> HARD_LIGHT
                GSK_BLEND_MODE_SOFT_LIGHT -> SOFT_LIGHT
                GSK_BLEND_MODE_DIFFERENCE -> DIFFERENCE
                GSK_BLEND_MODE_EXCLUSION -> EXCLUSION
                GSK_BLEND_MODE_COLOR -> COLOR
                GSK_BLEND_MODE_HUE -> HUE
                GSK_BLEND_MODE_SATURATION -> SATURATION
                GSK_BLEND_MODE_LUMINOSITY -> LUMINOSITY
                else -> error("invalid nativeValue")
            }
    }
}
