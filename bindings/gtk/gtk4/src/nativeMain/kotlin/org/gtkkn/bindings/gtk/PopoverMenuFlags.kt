// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gtk.GTK_POPOVER_MENU_NESTED
import org.gtkkn.native.gtk.GtkPopoverMenuFlags

/**
 * Flags that affect how popover menus are created from
 * a menu model.
 */
public class PopoverMenuFlags(
    public val mask: GtkPopoverMenuFlags,
) : Bitfield<PopoverMenuFlags> {
    override infix fun or(other: PopoverMenuFlags): PopoverMenuFlags = PopoverMenuFlags(mask or other.mask)

    public companion object {
        /**
         * Create submenus as nested
         *    popovers. Without this flag, submenus are created as
         *    sliding pages that replace the main menu.
         */
        public val NESTED: PopoverMenuFlags = PopoverMenuFlags(GTK_POPOVER_MENU_NESTED)
    }
}
