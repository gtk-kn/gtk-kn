// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.native.pango.PangoUnderline
import org.gtkkn.native.pango.PangoUnderline.PANGO_UNDERLINE_DOUBLE
import org.gtkkn.native.pango.PangoUnderline.PANGO_UNDERLINE_DOUBLE_LINE
import org.gtkkn.native.pango.PangoUnderline.PANGO_UNDERLINE_ERROR
import org.gtkkn.native.pango.PangoUnderline.PANGO_UNDERLINE_ERROR_LINE
import org.gtkkn.native.pango.PangoUnderline.PANGO_UNDERLINE_LOW
import org.gtkkn.native.pango.PangoUnderline.PANGO_UNDERLINE_NONE
import org.gtkkn.native.pango.PangoUnderline.PANGO_UNDERLINE_SINGLE
import org.gtkkn.native.pango.PangoUnderline.PANGO_UNDERLINE_SINGLE_LINE

/**
 * The `PangoUnderline` enumeration is used to specify whether text
 * should be underlined, and if so, the type of underlining.
 */
public enum class Underline(
    public val nativeValue: PangoUnderline,
) {
    /**
     * no underline should be drawn
     */
    NONE(PANGO_UNDERLINE_NONE),

    /**
     * a single underline should be drawn
     */
    SINGLE(PANGO_UNDERLINE_SINGLE),

    /**
     * a double underline should be drawn
     */
    DOUBLE(PANGO_UNDERLINE_DOUBLE),

    /**
     * a single underline should be drawn at a
     *   position beneath the ink extents of the text being
     *   underlined. This should be used only for underlining
     *   single characters, such as for keyboard accelerators.
     *   %PANGO_UNDERLINE_SINGLE should be used for extended
     *   portions of text.
     */
    LOW(PANGO_UNDERLINE_LOW),

    /**
     * an underline indicating an error should
     *   be drawn below. The exact style of rendering is up to the
     *   `PangoRenderer` in use, but typical styles include wavy
     *   or dotted lines.
     *   This underline is typically used to indicate an error such
     *   as a possible mispelling; in some cases a contrasting color
     *   may automatically be used. This type of underlining is
     *   available since Pango 1.4.
     */
    ERROR(PANGO_UNDERLINE_ERROR),

    /**
     * Like @PANGO_UNDERLINE_SINGLE, but
     *   drawn continuously across multiple runs. This type
     *   of underlining is available since Pango 1.46.
     */
    SINGLE_LINE(PANGO_UNDERLINE_SINGLE_LINE),

    /**
     * Like @PANGO_UNDERLINE_DOUBLE, but
     *   drawn continuously across multiple runs. This type
     *   of underlining is available since Pango 1.46.
     */
    DOUBLE_LINE(PANGO_UNDERLINE_DOUBLE_LINE),

    /**
     * Like @PANGO_UNDERLINE_ERROR, but
     *   drawn continuously across multiple runs. This type
     *   of underlining is available since Pango 1.46.
     */
    ERROR_LINE(PANGO_UNDERLINE_ERROR_LINE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoUnderline): Underline =
            when (nativeValue) {
                PANGO_UNDERLINE_NONE -> NONE
                PANGO_UNDERLINE_SINGLE -> SINGLE
                PANGO_UNDERLINE_DOUBLE -> DOUBLE
                PANGO_UNDERLINE_LOW -> LOW
                PANGO_UNDERLINE_ERROR -> ERROR
                PANGO_UNDERLINE_SINGLE_LINE -> SINGLE_LINE
                PANGO_UNDERLINE_DOUBLE_LINE -> DOUBLE_LINE
                PANGO_UNDERLINE_ERROR_LINE -> ERROR_LINE
                else -> error("invalid nativeValue")
            }
    }
}
