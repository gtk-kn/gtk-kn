// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GTK_DIALOG_DESTROY_WITH_PARENT
import org.gtkkn.native.gtk.GTK_DIALOG_MODAL
import org.gtkkn.native.gtk.GTK_DIALOG_USE_HEADER_BAR
import org.gtkkn.native.gtk.GtkDialogFlags
import org.gtkkn.native.gtk.gtk_dialog_flags_get_type

/**
 * Flags used to influence dialog construction.
 */
public class DialogFlags(public val mask: GtkDialogFlags) : Bitfield<DialogFlags> {
    override infix fun or(other: DialogFlags): DialogFlags = DialogFlags(mask or other.mask)

    public companion object {
        /**
         * Make the constructed dialog modal
         */
        public val MODAL: DialogFlags = DialogFlags(GTK_DIALOG_MODAL)

        /**
         * Destroy the dialog when its parent is destroyed
         */
        public val DESTROY_WITH_PARENT: DialogFlags = DialogFlags(GTK_DIALOG_DESTROY_WITH_PARENT)

        /**
         * Create dialog with actions in header
         *   bar instead of action area
         */
        public val USE_HEADER_BAR: DialogFlags = DialogFlags(GTK_DIALOG_USE_HEADER_BAR)

        /**
         * Get the GType of DialogFlags
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_dialog_flags_get_type()
    }
}
