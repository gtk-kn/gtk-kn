// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gtk.GTK_SHORTCUT_ACTION_EXCLUSIVE
import org.gtkkn.native.gtk.GtkShortcutActionFlags

/**
 * List of flags that can be passed to action activation.
 *
 * More flags may be added in the future.
 */
public class ShortcutActionFlags(
    public val mask: GtkShortcutActionFlags,
) : Bitfield<ShortcutActionFlags> {
    override infix fun or(other: ShortcutActionFlags): ShortcutActionFlags = ShortcutActionFlags(mask or other.mask)

    public companion object {
        /**
         * The action is the only
         *   action that can be activated. If this flag is not set,
         *   a future activation may select a different action.
         */
        public val EXCLUSIVE: ShortcutActionFlags =
            ShortcutActionFlags(GTK_SHORTCUT_ACTION_EXCLUSIVE)
    }
}
