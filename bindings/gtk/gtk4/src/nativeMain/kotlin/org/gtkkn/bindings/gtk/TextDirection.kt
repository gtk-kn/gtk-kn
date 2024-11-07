// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkTextDirection

/**
 * Reading directions for text.
 */
public enum class TextDirection(
    public val nativeValue: GtkTextDirection,
) {
    /**
     * No direction.
     */
    NONE(GtkTextDirection.GTK_TEXT_DIR_NONE),

    /**
     * Left to right text direction.
     */
    LTR(GtkTextDirection.GTK_TEXT_DIR_LTR),

    /**
     * Right to left text direction.
     */
    RTL(GtkTextDirection.GTK_TEXT_DIR_RTL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkTextDirection): TextDirection =
            when (nativeValue) {
                GtkTextDirection.GTK_TEXT_DIR_NONE -> NONE
                GtkTextDirection.GTK_TEXT_DIR_LTR -> LTR
                GtkTextDirection.GTK_TEXT_DIR_RTL -> RTL
                else -> error("invalid nativeValue")
            }
    }
}
