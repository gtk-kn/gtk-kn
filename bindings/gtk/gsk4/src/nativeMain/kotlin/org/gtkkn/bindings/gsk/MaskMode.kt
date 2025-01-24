// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import org.gtkkn.bindings.gsk.annotations.GskVersion4_10
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskMaskMode
import org.gtkkn.native.gsk.gsk_mask_mode_get_type

/**
 * The mask modes available for mask nodes.
 * @since 4.10
 */
@GskVersion4_10
public enum class MaskMode(public val nativeValue: GskMaskMode) {
    /**
     * Use the alpha channel of the mask
     */
    ALPHA(GskMaskMode.GSK_MASK_MODE_ALPHA),

    /**
     * Use the inverted alpha channel of the mask
     */
    INVERTED_ALPHA(GskMaskMode.GSK_MASK_MODE_INVERTED_ALPHA),

    /**
     * Use the luminance of the mask,
     *     multiplied by mask alpha
     */
    LUMINANCE(GskMaskMode.GSK_MASK_MODE_LUMINANCE),

    /**
     * Use the inverted luminance of the mask,
     *     multiplied by mask alpha
     */
    INVERTED_LUMINANCE(GskMaskMode.GSK_MASK_MODE_INVERTED_LUMINANCE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GskMaskMode): MaskMode = when (nativeValue) {
            GskMaskMode.GSK_MASK_MODE_ALPHA -> ALPHA
            GskMaskMode.GSK_MASK_MODE_INVERTED_ALPHA -> INVERTED_ALPHA
            GskMaskMode.GSK_MASK_MODE_LUMINANCE -> LUMINANCE
            GskMaskMode.GSK_MASK_MODE_INVERTED_LUMINANCE -> INVERTED_LUMINANCE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of MaskMode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_mask_mode_get_type()
    }
}
