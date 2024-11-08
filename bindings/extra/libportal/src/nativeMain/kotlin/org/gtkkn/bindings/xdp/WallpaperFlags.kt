// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.xdp.XDP_WALLPAPER_FLAG_BACKGROUND
import org.gtkkn.native.xdp.XDP_WALLPAPER_FLAG_LOCKSCREEN
import org.gtkkn.native.xdp.XDP_WALLPAPER_FLAG_NONE
import org.gtkkn.native.xdp.XDP_WALLPAPER_FLAG_PREVIEW
import org.gtkkn.native.xdp.XdpWallpaperFlags

/**
 * The values of this enumeration determine where the wallpaper is being set.
 */
public class WallpaperFlags(
    public val mask: XdpWallpaperFlags,
) : Bitfield<WallpaperFlags> {
    override infix fun or(other: WallpaperFlags): WallpaperFlags = WallpaperFlags(mask or other.mask)

    public companion object {
        /**
         * No flags
         */
        public val NONE: WallpaperFlags = WallpaperFlags(XDP_WALLPAPER_FLAG_NONE)

        /**
         * Set wallpaper on the desktop background
         */
        public val BACKGROUND: WallpaperFlags = WallpaperFlags(XDP_WALLPAPER_FLAG_BACKGROUND)

        /**
         * Set wallpaper on the lockscreen
         */
        public val LOCKSCREEN: WallpaperFlags = WallpaperFlags(XDP_WALLPAPER_FLAG_LOCKSCREEN)

        /**
         * Request the preview to be shown
         */
        public val PREVIEW: WallpaperFlags = WallpaperFlags(XDP_WALLPAPER_FLAG_PREVIEW)
    }
}
