// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkEntryIconPosition

/**
 * Specifies the side of the entry at which an icon is placed.
 */
public enum class EntryIconPosition(
    public val nativeValue: GtkEntryIconPosition,
) {
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
        public fun fromNativeValue(nativeValue: GtkEntryIconPosition): EntryIconPosition =
            when (nativeValue) {
                GtkEntryIconPosition.GTK_ENTRY_ICON_PRIMARY -> PRIMARY
                GtkEntryIconPosition.GTK_ENTRY_ICON_SECONDARY -> SECONDARY
                else -> error("invalid nativeValue")
            }
    }
}
