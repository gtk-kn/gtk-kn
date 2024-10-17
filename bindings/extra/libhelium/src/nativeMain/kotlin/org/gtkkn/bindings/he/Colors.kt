// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import org.gtkkn.native.he.HeColors
import org.gtkkn.native.he.HeColors.HE_COLORS_BLUE
import org.gtkkn.native.he.HeColors.HE_COLORS_BROWN
import org.gtkkn.native.he.HeColors.HE_COLORS_DARK
import org.gtkkn.native.he.HeColors.HE_COLORS_GREEN
import org.gtkkn.native.he.HeColors.HE_COLORS_INDIGO
import org.gtkkn.native.he.HeColors.HE_COLORS_LIGHT
import org.gtkkn.native.he.HeColors.HE_COLORS_MINT
import org.gtkkn.native.he.HeColors.HE_COLORS_NONE
import org.gtkkn.native.he.HeColors.HE_COLORS_ORANGE
import org.gtkkn.native.he.HeColors.HE_COLORS_PINK
import org.gtkkn.native.he.HeColors.HE_COLORS_PURPLE
import org.gtkkn.native.he.HeColors.HE_COLORS_RED
import org.gtkkn.native.he.HeColors.HE_COLORS_YELLOW

public enum class Colors(
    public val nativeValue: HeColors,
) {
    NONE(HE_COLORS_NONE),
    RED(HE_COLORS_RED),
    ORANGE(HE_COLORS_ORANGE),
    YELLOW(HE_COLORS_YELLOW),
    GREEN(HE_COLORS_GREEN),
    BLUE(HE_COLORS_BLUE),
    INDIGO(HE_COLORS_INDIGO),
    PURPLE(HE_COLORS_PURPLE),
    PINK(HE_COLORS_PINK),
    MINT(HE_COLORS_MINT),
    BROWN(HE_COLORS_BROWN),
    LIGHT(HE_COLORS_LIGHT),
    DARK(HE_COLORS_DARK),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: HeColors): Colors =
            when (nativeValue) {
                HE_COLORS_NONE -> NONE
                HE_COLORS_RED -> RED
                HE_COLORS_ORANGE -> ORANGE
                HE_COLORS_YELLOW -> YELLOW
                HE_COLORS_GREEN -> GREEN
                HE_COLORS_BLUE -> BLUE
                HE_COLORS_INDIGO -> INDIGO
                HE_COLORS_PURPLE -> PURPLE
                HE_COLORS_PINK -> PINK
                HE_COLORS_MINT -> MINT
                HE_COLORS_BROWN -> BROWN
                HE_COLORS_LIGHT -> LIGHT
                HE_COLORS_DARK -> DARK
                else -> error("invalid nativeValue")
            }
    }
}
