// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import org.gtkkn.bindings.pango.annotations.PangoVersion1_44
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PANGO_SHAPE_NONE
import org.gtkkn.native.pango.PANGO_SHAPE_ROUND_POSITIONS
import org.gtkkn.native.pango.PangoShapeFlags
import org.gtkkn.native.pango.pango_shape_flags_get_type

/**
 * Flags influencing the shaping process.
 *
 * `PangoShapeFlags` can be passed to [func@Pango.shape_with_flags].
 * @since 1.44
 */
public class ShapeFlags(public val mask: PangoShapeFlags) : Bitfield<ShapeFlags> {
    override infix fun or(other: ShapeFlags): ShapeFlags = ShapeFlags(mask or other.mask)

    @PangoVersion1_44
    public companion object {
        /**
         * Default value
         */
        public val NONE: ShapeFlags = ShapeFlags(PANGO_SHAPE_NONE)

        /**
         * Round glyph positions and widths to whole device units
         *   This option should be set if the target renderer can't do subpixel positioning of glyphs
         */
        public val ROUND_POSITIONS: ShapeFlags = ShapeFlags(PANGO_SHAPE_ROUND_POSITIONS)

        /**
         * Get the GType of ShapeFlags
         *
         * @return the GType
         */
        public fun getType(): GType = pango_shape_flags_get_type()
    }
}
