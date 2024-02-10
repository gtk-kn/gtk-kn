// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import org.gtkkn.native.pango.PangoEllipsizeMode
import org.gtkkn.native.pango.PangoEllipsizeMode.PANGO_ELLIPSIZE_END
import org.gtkkn.native.pango.PangoEllipsizeMode.PANGO_ELLIPSIZE_MIDDLE
import org.gtkkn.native.pango.PangoEllipsizeMode.PANGO_ELLIPSIZE_NONE
import org.gtkkn.native.pango.PangoEllipsizeMode.PANGO_ELLIPSIZE_START

/**
 * `PangoEllipsizeMode` describes what sort of ellipsization
 * should be applied to text.
 *
 * In the ellipsization process characters are removed from the
 * text in order to make it fit to a given width and replaced
 * with an ellipsis.
 */
public enum class EllipsizeMode(
    public val nativeValue: PangoEllipsizeMode,
) {
    /**
     * No ellipsization
     */
    NONE(PANGO_ELLIPSIZE_NONE),

    /**
     * Omit characters at the start of the text
     */
    START(PANGO_ELLIPSIZE_START),

    /**
     * Omit characters in the middle of the text
     */
    MIDDLE(PANGO_ELLIPSIZE_MIDDLE),

    /**
     * Omit characters at the end of the text
     */
    END(PANGO_ELLIPSIZE_END),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: PangoEllipsizeMode): EllipsizeMode =
            when (nativeValue) {
                PANGO_ELLIPSIZE_NONE -> NONE
                PANGO_ELLIPSIZE_START -> START
                PANGO_ELLIPSIZE_MIDDLE -> MIDDLE
                PANGO_ELLIPSIZE_END -> END
                else -> error("invalid nativeValue")
            }
    }
}
