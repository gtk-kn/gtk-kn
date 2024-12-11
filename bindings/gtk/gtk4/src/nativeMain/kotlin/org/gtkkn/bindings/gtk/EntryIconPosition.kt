// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkEntryIconPosition
import org.gtkkn.native.gtk.gtk_entry_icon_position_get_type

/**
 * Specifies the side of the entry at which an icon is placed.
 */
public enum class EntryIconPosition(public val nativeValue: GtkEntryIconPosition) {
    /**
     * At the beginning of the entry (depending on the text direction).
     */
    PRIMARY(GtkEntryIconPosition.GTK_ENTRY_ICON_PRIMARY),

    /**
     * At the end of the entry (depending on the text direction).
     */
    SECONDARY(GtkEntryIconPosition.GTK_ENTRY_ICON_SECONDARY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkEntryIconPosition): EntryIconPosition = when (nativeValue) {
            GtkEntryIconPosition.GTK_ENTRY_ICON_PRIMARY -> PRIMARY
            GtkEntryIconPosition.GTK_ENTRY_ICON_SECONDARY -> SECONDARY
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of EntryIconPosition
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_entry_icon_position_get_type()
    }
}
