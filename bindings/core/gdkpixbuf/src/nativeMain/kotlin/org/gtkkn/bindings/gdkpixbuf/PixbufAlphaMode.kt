// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdkpixbuf

import org.gtkkn.native.gdkpixbuf.GdkPixbufAlphaMode

/**
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
public enum class PixbufAlphaMode(
    public val nativeValue: GdkPixbufAlphaMode,
) {
    /**
     * A bilevel clipping mask (black and white)
     *  will be created and used to draw the image.  Pixels below 0.5 opacity
     *  will be considered fully transparent, and all others will be
     *  considered fully opaque.
     */
    BILEVEL(GdkPixbufAlphaMode.GDK_PIXBUF_ALPHA_BILEVEL),

    /**
     * For now falls back to #GDK_PIXBUF_ALPHA_BILEVEL.
     *  In the future it will do full alpha compositing.
     */
    FULL(GdkPixbufAlphaMode.GDK_PIXBUF_ALPHA_FULL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkPixbufAlphaMode): PixbufAlphaMode =
            when (nativeValue) {
                GdkPixbufAlphaMode.GDK_PIXBUF_ALPHA_BILEVEL -> BILEVEL
                GdkPixbufAlphaMode.GDK_PIXBUF_ALPHA_FULL -> FULL
                else -> error("invalid nativeValue")
            }
    }
}
