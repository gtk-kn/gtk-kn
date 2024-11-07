// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdkpixbuf

import org.gtkkn.native.gdkpixbuf.GdkInterpType

/**
 * Interpolation modes for scaling functions.
 *
 * The `GDK_INTERP_NEAREST` mode is the fastest scaling method, but has
 * horrible quality when scaling down; `GDK_INTERP_BILINEAR` is the best
 * choice if you aren't sure what to choose, it has a good speed/quality
 * balance.
 *
 * **Note**: Cubic filtering is missing from the list; hyperbolic
 * interpolation is just as fast and results in higher quality.
 */
public enum class InterpType(
    public val nativeValue: GdkInterpType,
) {
    /**
     * Nearest neighbor sampling; this is the fastest
     *  and lowest quality mode. Quality is normally unacceptable when scaling
     *  down, but may be OK when scaling up.
     */
    NEAREST(GdkInterpType.GDK_INTERP_NEAREST),

    /**
     * This is an accurate simulation of the PostScript
     *  image operator without any interpolation enabled.  Each pixel is
     *  rendered as a tiny parallelogram of solid color, the edges of which
     *  are implemented with antialiasing.  It resembles nearest neighbor for
     *  enlargement, and bilinear for reduction.
     */
    TILES(GdkInterpType.GDK_INTERP_TILES),

    /**
     * Best quality/speed balance; use this mode by
     *  default. Bilinear interpolation.  For enlargement, it is
     *  equivalent to point-sampling the ideal bilinear-interpolated image.
     *  For reduction, it is equivalent to laying down small tiles and
     *  integrating over the coverage area.
     */
    BILINEAR(GdkInterpType.GDK_INTERP_BILINEAR),

    /**
     * This is the slowest and highest quality
     *  reconstruction function. It is derived from the hyperbolic filters in
     *  Wolberg's "Digital Image Warping", and is formally defined as the
     *  hyperbolic-filter sampling the ideal hyperbolic-filter interpolated
     *  image (the filter is designed to be idempotent for 1:1 pixel mapping).
     *  **Deprecated**: this interpolation filter is deprecated, as in reality
     *  it has a lower quality than the @GDK_INTERP_BILINEAR filter
     *  (Since: 2.38)
     */
    HYPER(GdkInterpType.GDK_INTERP_HYPER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkInterpType): InterpType =
            when (nativeValue) {
                GdkInterpType.GDK_INTERP_NEAREST -> NEAREST
                GdkInterpType.GDK_INTERP_TILES -> TILES
                GdkInterpType.GDK_INTERP_BILINEAR -> BILINEAR
                GdkInterpType.GDK_INTERP_HYPER -> HYPER
                else -> error("invalid nativeValue")
            }
    }
}
