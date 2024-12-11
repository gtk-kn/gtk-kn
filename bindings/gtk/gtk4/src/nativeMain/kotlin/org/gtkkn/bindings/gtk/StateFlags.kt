// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GTK_STATE_FLAG_ACTIVE
import org.gtkkn.native.gtk.GTK_STATE_FLAG_BACKDROP
import org.gtkkn.native.gtk.GTK_STATE_FLAG_CHECKED
import org.gtkkn.native.gtk.GTK_STATE_FLAG_DIR_LTR
import org.gtkkn.native.gtk.GTK_STATE_FLAG_DIR_RTL
import org.gtkkn.native.gtk.GTK_STATE_FLAG_DROP_ACTIVE
import org.gtkkn.native.gtk.GTK_STATE_FLAG_FOCUSED
import org.gtkkn.native.gtk.GTK_STATE_FLAG_FOCUS_VISIBLE
import org.gtkkn.native.gtk.GTK_STATE_FLAG_FOCUS_WITHIN
import org.gtkkn.native.gtk.GTK_STATE_FLAG_INCONSISTENT
import org.gtkkn.native.gtk.GTK_STATE_FLAG_INSENSITIVE
import org.gtkkn.native.gtk.GTK_STATE_FLAG_LINK
import org.gtkkn.native.gtk.GTK_STATE_FLAG_NORMAL
import org.gtkkn.native.gtk.GTK_STATE_FLAG_PRELIGHT
import org.gtkkn.native.gtk.GTK_STATE_FLAG_SELECTED
import org.gtkkn.native.gtk.GTK_STATE_FLAG_VISITED
import org.gtkkn.native.gtk.GtkStateFlags
import org.gtkkn.native.gtk.gtk_state_flags_get_type

/**
 * Describes a widget state.
 *
 * Widget states are used to match the widget against CSS pseudo-classes.
 * Note that GTK extends the regular CSS classes and sometimes uses
 * different names.
 */
public class StateFlags(public val mask: GtkStateFlags) : Bitfield<StateFlags> {
    override infix fun or(other: StateFlags): StateFlags = StateFlags(mask or other.mask)

    public companion object {
        /**
         * State during normal operation
         */
        public val NORMAL: StateFlags = StateFlags(GTK_STATE_FLAG_NORMAL)

        /**
         * Widget is active
         */
        public val ACTIVE: StateFlags = StateFlags(GTK_STATE_FLAG_ACTIVE)

        /**
         * Widget has a mouse pointer over it
         */
        public val PRELIGHT: StateFlags = StateFlags(GTK_STATE_FLAG_PRELIGHT)

        /**
         * Widget is selected
         */
        public val SELECTED: StateFlags = StateFlags(GTK_STATE_FLAG_SELECTED)

        /**
         * Widget is insensitive
         */
        public val INSENSITIVE: StateFlags = StateFlags(GTK_STATE_FLAG_INSENSITIVE)

        /**
         * Widget is inconsistent
         */
        public val INCONSISTENT: StateFlags = StateFlags(GTK_STATE_FLAG_INCONSISTENT)

        /**
         * Widget has the keyboard focus
         */
        public val FOCUSED: StateFlags = StateFlags(GTK_STATE_FLAG_FOCUSED)

        /**
         * Widget is in a background toplevel window
         */
        public val BACKDROP: StateFlags = StateFlags(GTK_STATE_FLAG_BACKDROP)

        /**
         * Widget is in left-to-right text direction
         */
        public val DIR_LTR: StateFlags = StateFlags(GTK_STATE_FLAG_DIR_LTR)

        /**
         * Widget is in right-to-left text direction
         */
        public val DIR_RTL: StateFlags = StateFlags(GTK_STATE_FLAG_DIR_RTL)

        /**
         * Widget is a link
         */
        public val LINK: StateFlags = StateFlags(GTK_STATE_FLAG_LINK)

        /**
         * The location the widget points to has already been visited
         */
        public val VISITED: StateFlags = StateFlags(GTK_STATE_FLAG_VISITED)

        /**
         * Widget is checked
         */
        public val CHECKED: StateFlags = StateFlags(GTK_STATE_FLAG_CHECKED)

        /**
         * Widget is highlighted as a drop target for DND
         */
        public val DROP_ACTIVE: StateFlags = StateFlags(GTK_STATE_FLAG_DROP_ACTIVE)

        /**
         * Widget has the visible focus
         */
        public val FOCUS_VISIBLE: StateFlags = StateFlags(GTK_STATE_FLAG_FOCUS_VISIBLE)

        /**
         * Widget contains the keyboard focus
         */
        public val FOCUS_WITHIN: StateFlags = StateFlags(GTK_STATE_FLAG_FOCUS_WITHIN)

        /**
         * Get the GType of StateFlags
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_state_flags_get_type()
    }
}
