// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkPixbufAlphaMode
import org.gtkkn.native.gdk.gdk_pixbuf_alpha_mode_get_type
import org.gtkkn.native.gobject.GType

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 2.42.
 *
 * There is no user of GdkPixbufAlphaMode in GdkPixbuf,
 *   and the Xlib utility functions have been split out to their own
 *   library, gdk-pixbuf-xlib
 * ---
 *
 * Control the alpha channel for drawables.
 *
 * These values can be passed to gdk_pixbuf_xlib_render_to_drawable_alpha()
 * in gdk-pixbuf-xlib to control how the alpha channel of an image should
 * be handled.
 *
 * This function can create a bilevel clipping mask (black and white) and use
 * it while painting the image.
 *
 * In the future, when the X Window System gets an alpha channel extension,
 * it will be possible to do full alpha compositing onto arbitrary drawables.
 * For now both cases fall back to a bilevel clipping mask.
 */
public enum class PixbufAlphaMode(public val nativeValue: GdkPixbufAlphaMode) {
    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.42.
     *
     * There is no user of GdkPixbufAlphaMode in GdkPixbuf,
     *   and the Xlib utility functions have been split out to their own
     *   library, gdk-pixbuf-xlib
     * ---
     *
     * A bilevel clipping mask (black and white)
     *  will be created and used to draw the image.  Pixels below 0.5 opacity
     *  will be considered fully transparent, and all others will be
     *  considered fully opaque.
     */
    BILEVEL(GdkPixbufAlphaMode.GDK_PIXBUF_ALPHA_BILEVEL),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.42.
     *
     * There is no user of GdkPixbufAlphaMode in GdkPixbuf,
     *   and the Xlib utility functions have been split out to their own
     *   library, gdk-pixbuf-xlib
     * ---
     *
     * For now falls back to #GDK_PIXBUF_ALPHA_BILEVEL.
     *  In the future it will do full alpha compositing.
     */
    FULL(GdkPixbufAlphaMode.GDK_PIXBUF_ALPHA_FULL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkPixbufAlphaMode): PixbufAlphaMode = when (nativeValue) {
            GdkPixbufAlphaMode.GDK_PIXBUF_ALPHA_BILEVEL -> BILEVEL
            GdkPixbufAlphaMode.GDK_PIXBUF_ALPHA_FULL -> FULL
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of PixbufAlphaMode
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_pixbuf_alpha_mode_get_type()
    }
}
