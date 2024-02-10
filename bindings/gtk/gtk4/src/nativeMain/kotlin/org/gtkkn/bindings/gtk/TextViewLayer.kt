// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkTextViewLayer
import org.gtkkn.native.gtk.GtkTextViewLayer.GTK_TEXT_VIEW_LAYER_ABOVE_TEXT
import org.gtkkn.native.gtk.GtkTextViewLayer.GTK_TEXT_VIEW_LAYER_BELOW_TEXT

/**
 * Used to reference the layers of `GtkTextView` for the purpose of customized
 * drawing with the ::snapshot_layer vfunc.
 */
public enum class TextViewLayer(
    public val nativeValue: GtkTextViewLayer,
) {
    /**
     * The layer rendered below the text (but above the background).
     */
    BELOW_TEXT(GTK_TEXT_VIEW_LAYER_BELOW_TEXT),

    /**
     * The layer rendered above the text.
     */
    ABOVE_TEXT(GTK_TEXT_VIEW_LAYER_ABOVE_TEXT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkTextViewLayer): TextViewLayer =
            when (nativeValue) {
                GTK_TEXT_VIEW_LAYER_BELOW_TEXT -> BELOW_TEXT
                GTK_TEXT_VIEW_LAYER_ABOVE_TEXT -> ABOVE_TEXT
                else -> error("invalid nativeValue")
            }
    }
}
