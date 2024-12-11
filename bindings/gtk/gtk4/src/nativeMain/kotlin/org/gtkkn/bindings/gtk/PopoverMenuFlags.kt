// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GTK_POPOVER_MENU_NESTED
import org.gtkkn.native.gtk.GTK_POPOVER_MENU_SLIDING
import org.gtkkn.native.gtk.GtkPopoverMenuFlags
import org.gtkkn.native.gtk.gtk_popover_menu_flags_get_type

/**
 * Flags that affect how [class@Gtk.PopoverMenu] widgets built from
 * a [class@Gio.MenuModel] are created and displayed.
 */
public class PopoverMenuFlags(public val mask: GtkPopoverMenuFlags) : Bitfield<PopoverMenuFlags> {
    override infix fun or(other: PopoverMenuFlags): PopoverMenuFlags = PopoverMenuFlags(mask or other.mask)

    public companion object {
        /**
         * Submenus are presented as sliding submenus that replace the main menu.
         * @since 4.14
         */
        public val SLIDING: PopoverMenuFlags = PopoverMenuFlags(GTK_POPOVER_MENU_SLIDING)

        /**
         * Submenus are presented as traditional, nested
         *   popovers.
         */
        public val NESTED: PopoverMenuFlags = PopoverMenuFlags(GTK_POPOVER_MENU_NESTED)

        /**
         * Get the GType of PopoverMenuFlags
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_popover_menu_flags_get_type()
    }
}
