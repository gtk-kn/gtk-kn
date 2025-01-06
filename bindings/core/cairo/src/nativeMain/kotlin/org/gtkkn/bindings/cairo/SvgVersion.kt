// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import org.gtkkn.bindings.cairo.annotations.CairoVersion1_2
import org.gtkkn.native.cairo.cairo_svg_version_t

/**
 *
 * @since 1.2
 */
@CairoVersion1_2
public enum class SvgVersion(public val nativeValue: cairo_svg_version_t) {
    VERSION_1_1(cairo_svg_version_t.CAIRO_SVG_VERSION_1_1),
    VERSION_1_2(cairo_svg_version_t.CAIRO_SVG_VERSION_1_2),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: cairo_svg_version_t): SvgVersion = when (nativeValue) {
            cairo_svg_version_t.CAIRO_SVG_VERSION_1_1 -> VERSION_1_1
            cairo_svg_version_t.CAIRO_SVG_VERSION_1_2 -> VERSION_1_2
            else -> error("invalid nativeValue")
        }
    }
}
