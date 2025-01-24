// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkNumberUpLayout
import org.gtkkn.native.gtk.gtk_number_up_layout_get_type

/**
 * Used to determine the layout of pages on a sheet when printing
 * multiple pages per sheet.
 */
public enum class NumberUpLayout(public val nativeValue: GtkNumberUpLayout) {
    /**
     * ![](layout-lrtb.png)
     */
    LRTB(GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_TOP_TO_BOTTOM),

    /**
     * ![](layout-lrbt.png)
     */
    LRBT(GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_BOTTOM_TO_TOP),

    /**
     * ![](layout-rltb.png)
     */
    RLTB(GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_TOP_TO_BOTTOM),

    /**
     * ![](layout-rlbt.png)
     */
    RLBT(GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_BOTTOM_TO_TOP),

    /**
     * ![](layout-tblr.png)
     */
    TBLR(GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_LEFT_TO_RIGHT),

    /**
     * ![](layout-tbrl.png)
     */
    TBRL(GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_RIGHT_TO_LEFT),

    /**
     * ![](layout-btlr.png)
     */
    BTLR(GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_LEFT_TO_RIGHT),

    /**
     * ![](layout-btrl.png)
     */
    BTRL(GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_RIGHT_TO_LEFT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkNumberUpLayout): NumberUpLayout = when (nativeValue) {
            GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_TOP_TO_BOTTOM -> LRTB
            GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_LEFT_TO_RIGHT_BOTTOM_TO_TOP -> LRBT
            GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_TOP_TO_BOTTOM -> RLTB
            GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_RIGHT_TO_LEFT_BOTTOM_TO_TOP -> RLBT
            GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_LEFT_TO_RIGHT -> TBLR
            GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_TOP_TO_BOTTOM_RIGHT_TO_LEFT -> TBRL
            GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_LEFT_TO_RIGHT -> BTLR
            GtkNumberUpLayout.GTK_NUMBER_UP_LAYOUT_BOTTOM_TO_TOP_RIGHT_TO_LEFT -> BTRL
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of NumberUpLayout
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_number_up_layout_get_type()
    }
}
