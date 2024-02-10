// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gtk.GTK_STYLE_CONTEXT_PRINT_NONE
import org.gtkkn.native.gtk.GTK_STYLE_CONTEXT_PRINT_RECURSE
import org.gtkkn.native.gtk.GTK_STYLE_CONTEXT_PRINT_SHOW_CHANGE
import org.gtkkn.native.gtk.GTK_STYLE_CONTEXT_PRINT_SHOW_STYLE
import org.gtkkn.native.gtk.GtkStyleContextPrintFlags

/**
 * Flags that modify the behavior of gtk_style_context_to_string().
 *
 * New values may be added to this enumeration.
 */
public class StyleContextPrintFlags(
    public val mask: GtkStyleContextPrintFlags,
) : Bitfield<StyleContextPrintFlags> {
    override infix fun or(other: StyleContextPrintFlags): StyleContextPrintFlags =
        StyleContextPrintFlags(mask or other.mask)

    public companion object {
        /**
         * Default value.
         */
        public val NONE: StyleContextPrintFlags =
            StyleContextPrintFlags(GTK_STYLE_CONTEXT_PRINT_NONE)

        /**
         * Print the entire tree of
         *   CSS nodes starting at the style context's node
         */
        public val RECURSE: StyleContextPrintFlags =
            StyleContextPrintFlags(GTK_STYLE_CONTEXT_PRINT_RECURSE)

        /**
         * Show the values of the
         *   CSS properties for each node
         */
        public val SHOW_STYLE: StyleContextPrintFlags =
            StyleContextPrintFlags(GTK_STYLE_CONTEXT_PRINT_SHOW_STYLE)

        /**
         * Show information about
         *   what changes affect the styles
         */
        public val SHOW_CHANGE: StyleContextPrintFlags =
            StyleContextPrintFlags(GTK_STYLE_CONTEXT_PRINT_SHOW_CHANGE)
    }
}
