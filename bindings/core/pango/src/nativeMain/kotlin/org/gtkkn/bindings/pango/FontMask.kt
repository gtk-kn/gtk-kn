// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PANGO_FONT_MASK_FAMILY
import org.gtkkn.native.pango.PANGO_FONT_MASK_FEATURES
import org.gtkkn.native.pango.PANGO_FONT_MASK_GRAVITY
import org.gtkkn.native.pango.PANGO_FONT_MASK_SIZE
import org.gtkkn.native.pango.PANGO_FONT_MASK_STRETCH
import org.gtkkn.native.pango.PANGO_FONT_MASK_STYLE
import org.gtkkn.native.pango.PANGO_FONT_MASK_VARIANT
import org.gtkkn.native.pango.PANGO_FONT_MASK_VARIATIONS
import org.gtkkn.native.pango.PANGO_FONT_MASK_WEIGHT
import org.gtkkn.native.pango.PangoFontMask
import org.gtkkn.native.pango.pango_font_mask_get_type

/**
 * The bits in a `PangoFontMask` correspond to the set fields in a
 * `PangoFontDescription`.
 */
public class FontMask(public val mask: PangoFontMask) : Bitfield<FontMask> {
    override infix fun or(other: FontMask): FontMask = FontMask(mask or other.mask)

    public companion object {
        /**
         * the font family is specified.
         */
        public val FAMILY: FontMask = FontMask(PANGO_FONT_MASK_FAMILY)

        /**
         * the font style is specified.
         */
        public val STYLE: FontMask = FontMask(PANGO_FONT_MASK_STYLE)

        /**
         * the font variant is specified.
         */
        public val VARIANT: FontMask = FontMask(PANGO_FONT_MASK_VARIANT)

        /**
         * the font weight is specified.
         */
        public val WEIGHT: FontMask = FontMask(PANGO_FONT_MASK_WEIGHT)

        /**
         * the font stretch is specified.
         */
        public val STRETCH: FontMask = FontMask(PANGO_FONT_MASK_STRETCH)

        /**
         * the font size is specified.
         */
        public val SIZE: FontMask = FontMask(PANGO_FONT_MASK_SIZE)

        /**
         * The font gravity is specified.
         * @since 1.16
         */
        public val GRAVITY: FontMask = FontMask(PANGO_FONT_MASK_GRAVITY)

        /**
         * OpenType font variations are specified.
         * @since 1.42
         */
        public val VARIATIONS: FontMask = FontMask(PANGO_FONT_MASK_VARIATIONS)

        /**
         * OpenType font features are specified.
         * @since 1.56
         */
        public val FEATURES: FontMask = FontMask(PANGO_FONT_MASK_FEATURES)

        /**
         * Get the GType of FontMask
         *
         * @return the GType
         */
        public fun getType(): GType = pango_font_mask_get_type()
    }
}
