// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gdk.GDK_ANCHOR_FLIP
import org.gtkkn.native.gdk.GDK_ANCHOR_FLIP_X
import org.gtkkn.native.gdk.GDK_ANCHOR_FLIP_Y
import org.gtkkn.native.gdk.GDK_ANCHOR_RESIZE
import org.gtkkn.native.gdk.GDK_ANCHOR_RESIZE_X
import org.gtkkn.native.gdk.GDK_ANCHOR_RESIZE_Y
import org.gtkkn.native.gdk.GDK_ANCHOR_SLIDE
import org.gtkkn.native.gdk.GDK_ANCHOR_SLIDE_X
import org.gtkkn.native.gdk.GDK_ANCHOR_SLIDE_Y
import org.gtkkn.native.gdk.GdkAnchorHints

/**
 * Positioning hints for aligning a surface relative to a rectangle.
 *
 * These hints determine how the surface should be positioned in the case that
 * the surface would fall off-screen if placed in its ideal position.
 *
 * For example, %GDK_ANCHOR_FLIP_X will replace %GDK_GRAVITY_NORTH_WEST with
 * %GDK_GRAVITY_NORTH_EAST and vice versa if the surface extends beyond the left
 * or right edges of the monitor.
 *
 * If %GDK_ANCHOR_SLIDE_X is set, the surface can be shifted horizontally to fit
 * on-screen. If %GDK_ANCHOR_RESIZE_X is set, the surface can be shrunken
 * horizontally to fit.
 *
 * In general, when multiple flags are set, flipping should take precedence over
 * sliding, which should take precedence over resizing.
 */
public class AnchorHints(
    public val mask: GdkAnchorHints,
) : Bitfield<AnchorHints> {
    override infix fun or(other: AnchorHints): AnchorHints = AnchorHints(mask or other.mask)

    public companion object {
        /**
         * allow flipping anchors horizontally
         */
        public val FLIP_X: AnchorHints = AnchorHints(GDK_ANCHOR_FLIP_X)

        /**
         * allow flipping anchors vertically
         */
        public val FLIP_Y: AnchorHints = AnchorHints(GDK_ANCHOR_FLIP_Y)

        /**
         * allow sliding surface horizontally
         */
        public val SLIDE_X: AnchorHints = AnchorHints(GDK_ANCHOR_SLIDE_X)

        /**
         * allow sliding surface vertically
         */
        public val SLIDE_Y: AnchorHints = AnchorHints(GDK_ANCHOR_SLIDE_Y)

        /**
         * allow resizing surface horizontally
         */
        public val RESIZE_X: AnchorHints = AnchorHints(GDK_ANCHOR_RESIZE_X)

        /**
         * allow resizing surface vertically
         */
        public val RESIZE_Y: AnchorHints = AnchorHints(GDK_ANCHOR_RESIZE_Y)

        /**
         * allow flipping anchors on both axes
         */
        public val FLIP: AnchorHints = AnchorHints(GDK_ANCHOR_FLIP)

        /**
         * allow sliding surface on both axes
         */
        public val SLIDE: AnchorHints = AnchorHints(GDK_ANCHOR_SLIDE)

        /**
         * allow resizing surface on both axes
         */
        public val RESIZE: AnchorHints = AnchorHints(GDK_ANCHOR_RESIZE)
    }
}
