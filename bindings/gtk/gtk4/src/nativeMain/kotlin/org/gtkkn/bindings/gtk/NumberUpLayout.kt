// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkNumberUpLayout
import org.gtkkn.native.gtk.GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_LEFT_TO_RIGHT
import org.gtkkn.native.gtk.GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_RIGHT_TO_LEFT
import org.gtkkn.native.gtk.GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_BOTTOM_TO_TOP
import org.gtkkn.native.gtk.GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_TOP_TO_BOTTOM
import org.gtkkn.native.gtk.GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_BOTTOM_TO_TOP
import org.gtkkn.native.gtk.GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_TOP_TO_BOTTOM
import org.gtkkn.native.gtk.GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_LEFT_TO_RIGHT
import org.gtkkn.native.gtk.GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_RIGHT_TO_LEFT

/**
 * Used to determine the layout of pages on a sheet when printing
 * multiple pages per sheet.
 */
public enum class NumberUpLayout(
    public val nativeValue: GtkNumberUpLayout,
) {
    /**
     * ![](layout-lrtb.png)
     */
    LRTB(GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_TOP_TO_BOTTOM),

    /**
     * ![](layout-lrbt.png)
     */
    LRBT(GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_BOTTOM_TO_TOP),

    /**
     * ![](layout-rltb.png)
     */
    RLTB(GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_TOP_TO_BOTTOM),

    /**
     * ![](layout-rlbt.png)
     */
    RLBT(GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_BOTTOM_TO_TOP),

    /**
     * ![](layout-tblr.png)
     */
    TBLR(GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_LEFT_TO_RIGHT),

    /**
     * ![](layout-tbrl.png)
     */
    TBRL(GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_RIGHT_TO_LEFT),

    /**
     * ![](layout-btlr.png)
     */
    BTLR(GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_LEFT_TO_RIGHT),

    /**
     * ![](layout-btrl.png)
     */
    BTRL(GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_RIGHT_TO_LEFT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkNumberUpLayout): NumberUpLayout =
            when (nativeValue) {
                GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_TOP_TO_BOTTOM -> LRTB
                GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_BOTTOM_TO_TOP -> LRBT
                GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_TOP_TO_BOTTOM -> RLTB
                GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_BOTTOM_TO_TOP -> RLBT
                GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_LEFT_TO_RIGHT -> TBLR
                GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_RIGHT_TO_LEFT -> TBRL
                GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_LEFT_TO_RIGHT -> BTLR
                GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_RIGHT_TO_LEFT -> BTRL
                else -> error("invalid nativeValue")
            }
    }
}
