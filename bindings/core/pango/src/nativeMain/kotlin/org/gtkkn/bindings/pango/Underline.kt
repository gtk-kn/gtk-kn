// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.native.pango.PangoUnderline

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
    NONE(PangoUnderline.PANGO_UNDERLINE_NONE),

    /**
     * a single underline should be drawn
     */
    SINGLE(PangoUnderline.PANGO_UNDERLINE_SINGLE),

    /**
     * a double underline should be drawn
     */
    DOUBLE(PangoUnderline.PANGO_UNDERLINE_DOUBLE),

    /**
     * a single underline should be drawn at a
     *   position beneath the ink extents of the text being
     *   underlined. This should be used only for underlining
     *   single characters, such as for keyboard accelerators.
     *   %PANGO_UNDERLINE_SINGLE should be used for extended
     *   portions of text.
     */
    LOW(PangoUnderline.PANGO_UNDERLINE_LOW),

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
    ERROR(PangoUnderline.PANGO_UNDERLINE_ERROR),

    /**
     * Like @PANGO_UNDERLINE_SINGLE, but
     *   drawn continuously across multiple runs. This type
     *   of underlining is available since Pango 1.46.
     */
    SINGLE_LINE(PangoUnderline.PANGO_UNDERLINE_SINGLE_LINE),

    /**
     * Like @PANGO_UNDERLINE_DOUBLE, but
     *   drawn continuously across multiple runs. This type
     *   of underlining is available since Pango 1.46.
     */
    DOUBLE_LINE(PangoUnderline.PANGO_UNDERLINE_DOUBLE_LINE),

    /**
     * Like @PANGO_UNDERLINE_ERROR, but
     *   drawn continuously across multiple runs. This type
     *   of underlining is available since Pango 1.46.
     */
    ERROR_LINE(PangoUnderline.PANGO_UNDERLINE_ERROR_LINE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoUnderline): Underline =
            when (nativeValue) {
                PangoUnderline.PANGO_UNDERLINE_NONE -> NONE
                PangoUnderline.PANGO_UNDERLINE_SINGLE -> SINGLE
                PangoUnderline.PANGO_UNDERLINE_DOUBLE -> DOUBLE
                PangoUnderline.PANGO_UNDERLINE_LOW -> LOW
                PangoUnderline.PANGO_UNDERLINE_ERROR -> ERROR
                PangoUnderline.PANGO_UNDERLINE_SINGLE_LINE -> SINGLE_LINE
                PangoUnderline.PANGO_UNDERLINE_DOUBLE_LINE -> DOUBLE_LINE
                PangoUnderline.PANGO_UNDERLINE_ERROR_LINE -> ERROR_LINE
                else -> error("invalid nativeValue")
            }
    }
}
