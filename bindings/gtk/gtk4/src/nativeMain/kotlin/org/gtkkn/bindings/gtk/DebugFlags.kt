// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gtk.GTK_DEBUG_A11Y
import org.gtkkn.native.gtk.GTK_DEBUG_ACTIONS
import org.gtkkn.native.gtk.GTK_DEBUG_BUILDER
import org.gtkkn.native.gtk.GTK_DEBUG_BUILDER_OBJECTS
import org.gtkkn.native.gtk.GTK_DEBUG_CONSTRAINTS
import org.gtkkn.native.gtk.GTK_DEBUG_GEOMETRY
import org.gtkkn.native.gtk.GTK_DEBUG_ICONFALLBACK
import org.gtkkn.native.gtk.GTK_DEBUG_ICONTHEME
import org.gtkkn.native.gtk.GTK_DEBUG_INTERACTIVE
import org.gtkkn.native.gtk.GTK_DEBUG_INVERT_TEXT_DIR
import org.gtkkn.native.gtk.GTK_DEBUG_KEYBINDINGS
import org.gtkkn.native.gtk.GTK_DEBUG_LAYOUT
import org.gtkkn.native.gtk.GTK_DEBUG_MODULES
import org.gtkkn.native.gtk.GTK_DEBUG_NO_CSS_CACHE
import org.gtkkn.native.gtk.GTK_DEBUG_PRINTING
import org.gtkkn.native.gtk.GTK_DEBUG_SIZE_REQUEST
import org.gtkkn.native.gtk.GTK_DEBUG_SNAPSHOT
import org.gtkkn.native.gtk.GTK_DEBUG_TEXT
import org.gtkkn.native.gtk.GTK_DEBUG_TREE
import org.gtkkn.native.gtk.GtkDebugFlags

/**
 * Flags to use with gtk_set_debug_flags().
 *
 * Settings these flags causes GTK to print out different
 * types of debugging information. Some of these flags are
 * only available when GTK has been configured with `-Ddebug=true`.
 */
public class DebugFlags(
    public val mask: GtkDebugFlags,
) : Bitfield<DebugFlags> {
    override infix fun or(other: DebugFlags): DebugFlags = DebugFlags(mask or other.mask)

    public companion object {
        /**
         * Information about GtkTextView
         */
        public val TEXT: DebugFlags = DebugFlags(GTK_DEBUG_TEXT)

        /**
         * Information about GtkTreeView
         */
        public val TREE: DebugFlags = DebugFlags(GTK_DEBUG_TREE)

        /**
         * Information about keyboard shortcuts
         */
        public val KEYBINDINGS: DebugFlags = DebugFlags(GTK_DEBUG_KEYBINDINGS)

        /**
         * Information about modules and extensions
         */
        public val MODULES: DebugFlags = DebugFlags(GTK_DEBUG_MODULES)

        /**
         * Information about size allocation
         */
        public val GEOMETRY: DebugFlags = DebugFlags(GTK_DEBUG_GEOMETRY)

        /**
         * Information about icon themes
         */
        public val ICONTHEME: DebugFlags = DebugFlags(GTK_DEBUG_ICONTHEME)

        /**
         * Information about printing
         */
        public val PRINTING: DebugFlags = DebugFlags(GTK_DEBUG_PRINTING)

        /**
         * Trace GtkBuilder operation
         */
        public val BUILDER: DebugFlags = DebugFlags(GTK_DEBUG_BUILDER)

        /**
         * Information about size requests
         */
        public val SIZE_REQUEST: DebugFlags = DebugFlags(GTK_DEBUG_SIZE_REQUEST)

        /**
         * Disable the style property cache
         */
        public val NO_CSS_CACHE: DebugFlags = DebugFlags(GTK_DEBUG_NO_CSS_CACHE)

        /**
         * Open the GTK inspector
         */
        public val INTERACTIVE: DebugFlags = DebugFlags(GTK_DEBUG_INTERACTIVE)

        /**
         * Information about actions and menu models
         */
        public val ACTIONS: DebugFlags = DebugFlags(GTK_DEBUG_ACTIONS)

        /**
         * Information from layout managers
         */
        public val LAYOUT: DebugFlags = DebugFlags(GTK_DEBUG_LAYOUT)

        /**
         * Include debug render nodes in the generated snapshots
         */
        public val SNAPSHOT: DebugFlags = DebugFlags(GTK_DEBUG_SNAPSHOT)

        /**
         * Information from the constraints solver
         */
        public val CONSTRAINTS: DebugFlags = DebugFlags(GTK_DEBUG_CONSTRAINTS)

        /**
         * Log unused GtkBuilder objects
         */
        public val BUILDER_OBJECTS: DebugFlags = DebugFlags(GTK_DEBUG_BUILDER_OBJECTS)

        /**
         * Information about accessibility state changes
         */
        public val A11Y: DebugFlags = DebugFlags(GTK_DEBUG_A11Y)

        /**
         * Information about icon fallback.
         * @since 4.2
         */
        public val ICONFALLBACK: DebugFlags = DebugFlags(GTK_DEBUG_ICONFALLBACK)

        /**
         * Inverts the default text-direction.
         * @since 4.8
         */
        public val INVERT_TEXT_DIR: DebugFlags = DebugFlags(GTK_DEBUG_INVERT_TEXT_DIR)
    }
}
