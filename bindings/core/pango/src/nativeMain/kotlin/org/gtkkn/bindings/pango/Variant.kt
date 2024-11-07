// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.native.pango.PangoVariant

/**
 * An enumeration specifying capitalization variant of the font.
 */
public enum class Variant(
    public val nativeValue: PangoVariant,
) {
    /**
     * A normal font.
     */
    NORMAL(PangoVariant.PANGO_VARIANT_NORMAL),

    /**
     * A font with the lower case characters
     *   replaced by smaller variants of the capital characters.
     */
    SMALL_CAPS(PangoVariant.PANGO_VARIANT_SMALL_CAPS),

    /**
     * A font with all characters
     *   replaced by smaller variants of the capital characters. Since: 1.50
     */
    ALL_SMALL_CAPS(PangoVariant.PANGO_VARIANT_ALL_SMALL_CAPS),

    /**
     * A font with the lower case characters
     *   replaced by smaller variants of the capital characters.
     *   Petite Caps can be even smaller than Small Caps. Since: 1.50
     */
    PETITE_CAPS(PangoVariant.PANGO_VARIANT_PETITE_CAPS),

    /**
     * A font with all characters
     *   replaced by smaller variants of the capital characters.
     *   Petite Caps can be even smaller than Small Caps. Since: 1.50
     */
    ALL_PETITE_CAPS(PangoVariant.PANGO_VARIANT_ALL_PETITE_CAPS),

    /**
     * A font with the upper case characters
     *   replaced by smaller variants of the capital letters. Since: 1.50
     */
    UNICASE(PangoVariant.PANGO_VARIANT_UNICASE),

    /**
     * A font with capital letters that
     *   are more suitable for all-uppercase titles. Since: 1.50
     */
    TITLE_CAPS(PangoVariant.PANGO_VARIANT_TITLE_CAPS),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoVariant): Variant =
            when (nativeValue) {
                PangoVariant.PANGO_VARIANT_NORMAL -> NORMAL
                PangoVariant.PANGO_VARIANT_SMALL_CAPS -> SMALL_CAPS
                PangoVariant.PANGO_VARIANT_ALL_SMALL_CAPS -> ALL_SMALL_CAPS
                PangoVariant.PANGO_VARIANT_PETITE_CAPS -> PETITE_CAPS
                PangoVariant.PANGO_VARIANT_ALL_PETITE_CAPS -> ALL_PETITE_CAPS
                PangoVariant.PANGO_VARIANT_UNICASE -> UNICASE
                PangoVariant.PANGO_VARIANT_TITLE_CAPS -> TITLE_CAPS
                else -> error("invalid nativeValue")
            }
    }
}
