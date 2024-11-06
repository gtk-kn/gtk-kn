// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import org.gtkkn.bindings.gsk.annotations.GskVersion4_10
import org.gtkkn.native.gsk.GskMaskMode
import org.gtkkn.native.gsk.GskMaskMode.GSK_MASK_MODE_ALPHA
import org.gtkkn.native.gsk.GskMaskMode.GSK_MASK_MODE_INVERTED_ALPHA
import org.gtkkn.native.gsk.GskMaskMode.GSK_MASK_MODE_INVERTED_LUMINANCE
import org.gtkkn.native.gsk.GskMaskMode.GSK_MASK_MODE_LUMINANCE

/**
 * The mask modes available for mask nodes.
 * @since 4.10
 */
@GskVersion4_10
public enum class MaskMode(
    public val nativeValue: GskMaskMode,
) {
    /**
     * Use the alpha channel of the mask
     */
    ALPHA(GSK_MASK_MODE_ALPHA),

    /**
     * Use the inverted alpha channel of the mask
     */
    INVERTED_ALPHA(GSK_MASK_MODE_INVERTED_ALPHA),

    /**
     * Use the luminance of the mask,
     *     multiplied by mask alpha
     */
    LUMINANCE(GSK_MASK_MODE_LUMINANCE),

    /**
     * Use the inverted luminance of the mask,
     *     multiplied by mask alpha
     */
    INVERTED_LUMINANCE(GSK_MASK_MODE_INVERTED_LUMINANCE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GskMaskMode): MaskMode =
            when (nativeValue) {
                GSK_MASK_MODE_ALPHA -> ALPHA
                GSK_MASK_MODE_INVERTED_ALPHA -> INVERTED_ALPHA
                GSK_MASK_MODE_LUMINANCE -> LUMINANCE
                GSK_MASK_MODE_INVERTED_LUMINANCE -> INVERTED_LUMINANCE
                else -> error("invalid nativeValue")
            }
    }
}
