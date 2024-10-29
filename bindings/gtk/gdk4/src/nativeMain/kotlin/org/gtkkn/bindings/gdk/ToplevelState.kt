// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gdk.GDK_TOPLEVEL_STATE_ABOVE
import org.gtkkn.native.gdk.GDK_TOPLEVEL_STATE_BELOW
import org.gtkkn.native.gdk.GDK_TOPLEVEL_STATE_BOTTOM_RESIZABLE
import org.gtkkn.native.gdk.GDK_TOPLEVEL_STATE_BOTTOM_TILED
import org.gtkkn.native.gdk.GDK_TOPLEVEL_STATE_FOCUSED
import org.gtkkn.native.gdk.GDK_TOPLEVEL_STATE_FULLSCREEN
import org.gtkkn.native.gdk.GDK_TOPLEVEL_STATE_LEFT_RESIZABLE
import org.gtkkn.native.gdk.GDK_TOPLEVEL_STATE_LEFT_TILED
import org.gtkkn.native.gdk.GDK_TOPLEVEL_STATE_MAXIMIZED
import org.gtkkn.native.gdk.GDK_TOPLEVEL_STATE_MINIMIZED
import org.gtkkn.native.gdk.GDK_TOPLEVEL_STATE_RIGHT_RESIZABLE
import org.gtkkn.native.gdk.GDK_TOPLEVEL_STATE_RIGHT_TILED
import org.gtkkn.native.gdk.GDK_TOPLEVEL_STATE_STICKY
import org.gtkkn.native.gdk.GDK_TOPLEVEL_STATE_SUSPENDED
import org.gtkkn.native.gdk.GDK_TOPLEVEL_STATE_TILED
import org.gtkkn.native.gdk.GDK_TOPLEVEL_STATE_TOP_RESIZABLE
import org.gtkkn.native.gdk.GDK_TOPLEVEL_STATE_TOP_TILED
import org.gtkkn.native.gdk.GdkToplevelState

/**
 * Specifies the state of a toplevel surface.
 *
 * On platforms that support information about individual edges, the
 * %GDK_TOPLEVEL_STATE_TILED state will be set whenever any of the individual
 * tiled states is set. On platforms that lack that support, the tiled state
 * will give an indication of tiledness without any of the per-edge states
 * being set.
 */
public class ToplevelState(
    public val mask: GdkToplevelState,
) : Bitfield<ToplevelState> {
    override infix fun or(other: ToplevelState): ToplevelState = ToplevelState(mask or other.mask)

    public companion object {
        /**
         * the surface is minimized
         */
        public val MINIMIZED: ToplevelState = ToplevelState(GDK_TOPLEVEL_STATE_MINIMIZED)

        /**
         * the surface is maximized
         */
        public val MAXIMIZED: ToplevelState = ToplevelState(GDK_TOPLEVEL_STATE_MAXIMIZED)

        /**
         * the surface is sticky
         */
        public val STICKY: ToplevelState = ToplevelState(GDK_TOPLEVEL_STATE_STICKY)

        /**
         * the surface is maximized without decorations
         */
        public val FULLSCREEN: ToplevelState = ToplevelState(GDK_TOPLEVEL_STATE_FULLSCREEN)

        /**
         * the surface is kept above other surfaces
         */
        public val ABOVE: ToplevelState = ToplevelState(GDK_TOPLEVEL_STATE_ABOVE)

        /**
         * the surface is kept below other surfaces
         */
        public val BELOW: ToplevelState = ToplevelState(GDK_TOPLEVEL_STATE_BELOW)

        /**
         * the surface is presented as focused (with active decorations)
         */
        public val FOCUSED: ToplevelState = ToplevelState(GDK_TOPLEVEL_STATE_FOCUSED)

        /**
         * the surface is in a tiled state
         */
        public val TILED: ToplevelState = ToplevelState(GDK_TOPLEVEL_STATE_TILED)

        /**
         * whether the top edge is tiled
         */
        public val TOP_TILED: ToplevelState = ToplevelState(GDK_TOPLEVEL_STATE_TOP_TILED)

        /**
         * whether the top edge is resizable
         */
        public val TOP_RESIZABLE: ToplevelState = ToplevelState(GDK_TOPLEVEL_STATE_TOP_RESIZABLE)

        /**
         * whether the right edge is tiled
         */
        public val RIGHT_TILED: ToplevelState = ToplevelState(GDK_TOPLEVEL_STATE_RIGHT_TILED)

        /**
         * whether the right edge is resizable
         */
        public val RIGHT_RESIZABLE: ToplevelState =
            ToplevelState(GDK_TOPLEVEL_STATE_RIGHT_RESIZABLE)

        /**
         * whether the bottom edge is tiled
         */
        public val BOTTOM_TILED: ToplevelState = ToplevelState(GDK_TOPLEVEL_STATE_BOTTOM_TILED)

        /**
         * whether the bottom edge is resizable
         */
        public val BOTTOM_RESIZABLE: ToplevelState =
            ToplevelState(GDK_TOPLEVEL_STATE_BOTTOM_RESIZABLE)

        /**
         * whether the left edge is tiled
         */
        public val LEFT_TILED: ToplevelState = ToplevelState(GDK_TOPLEVEL_STATE_LEFT_TILED)

        /**
         * whether the left edge is resizable
         */
        public val LEFT_RESIZABLE: ToplevelState = ToplevelState(GDK_TOPLEVEL_STATE_LEFT_RESIZABLE)

        /**
         * the surface is not visible to the user
         */
        public val SUSPENDED: ToplevelState = ToplevelState(GDK_TOPLEVEL_STATE_SUSPENDED)
    }
}
