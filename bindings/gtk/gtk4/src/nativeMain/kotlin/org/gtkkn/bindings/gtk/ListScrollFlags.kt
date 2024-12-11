// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.gtk.annotations.GtkVersion4_12
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GTK_LIST_SCROLL_FOCUS
import org.gtkkn.native.gtk.GTK_LIST_SCROLL_NONE
import org.gtkkn.native.gtk.GTK_LIST_SCROLL_SELECT
import org.gtkkn.native.gtk.GtkListScrollFlags
import org.gtkkn.native.gtk.gtk_list_scroll_flags_get_type

/**
 * List of actions to perform when scrolling to items in
 * a list widget.
 * @since 4.12
 */
public class ListScrollFlags(public val mask: GtkListScrollFlags) : Bitfield<ListScrollFlags> {
    override infix fun or(other: ListScrollFlags): ListScrollFlags = ListScrollFlags(mask or other.mask)

    @GtkVersion4_12
    public companion object {
        /**
         * Don't do anything extra
         */
        public val NONE: ListScrollFlags = ListScrollFlags(GTK_LIST_SCROLL_NONE)

        /**
         * Focus the target item
         */
        public val FOCUS: ListScrollFlags = ListScrollFlags(GTK_LIST_SCROLL_FOCUS)

        /**
         * Select the target item and
         *   unselect all other items.
         */
        public val SELECT: ListScrollFlags = ListScrollFlags(GTK_LIST_SCROLL_SELECT)

        /**
         * Get the GType of ListScrollFlags
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_list_scroll_flags_get_type()
    }
}
