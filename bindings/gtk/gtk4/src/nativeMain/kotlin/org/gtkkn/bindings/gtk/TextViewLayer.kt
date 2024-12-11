// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkTextViewLayer
import org.gtkkn.native.gtk.gtk_text_view_layer_get_type

/**
 * Used to reference the layers of `GtkTextView` for the purpose of customized
 * drawing with the ::snapshot_layer vfunc.
 */
public enum class TextViewLayer(public val nativeValue: GtkTextViewLayer) {
    /**
     * The layer rendered below the text (but above the background).
     */
    BELOW_TEXT(GtkTextViewLayer.GTK_TEXT_VIEW_LAYER_BELOW_TEXT),

    /**
     * The layer rendered above the text.
     */
    ABOVE_TEXT(GtkTextViewLayer.GTK_TEXT_VIEW_LAYER_ABOVE_TEXT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkTextViewLayer): TextViewLayer = when (nativeValue) {
            GtkTextViewLayer.GTK_TEXT_VIEW_LAYER_BELOW_TEXT -> BELOW_TEXT
            GtkTextViewLayer.GTK_TEXT_VIEW_LAYER_ABOVE_TEXT -> ABOVE_TEXT
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of TextViewLayer
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_text_view_layer_get_type()
    }
}
