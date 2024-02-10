// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkTextDirection
import org.gtkkn.native.gtk.GtkTextDirection.GTK_TEXT_DIR_LTR
import org.gtkkn.native.gtk.GtkTextDirection.GTK_TEXT_DIR_NONE
import org.gtkkn.native.gtk.GtkTextDirection.GTK_TEXT_DIR_RTL

/**
 * Reading directions for text.
 */
public enum class TextDirection(
    public val nativeValue: GtkTextDirection,
) {
    /**
     * No direction.
     */
    NONE(GTK_TEXT_DIR_NONE),

    /**
     * Left to right text direction.
     */
    LTR(GTK_TEXT_DIR_LTR),

    /**
     * Right to left text direction.
     */
    RTL(GTK_TEXT_DIR_RTL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkTextDirection): TextDirection =
            when (nativeValue) {
                GTK_TEXT_DIR_NONE -> NONE
                GTK_TEXT_DIR_LTR -> LTR
                GTK_TEXT_DIR_RTL -> RTL
                else -> error("invalid nativeValue")
            }
    }
}
