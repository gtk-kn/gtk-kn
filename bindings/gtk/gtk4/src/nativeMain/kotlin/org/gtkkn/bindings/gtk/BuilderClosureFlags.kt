// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GTK_BUILDER_CLOSURE_SWAPPED
import org.gtkkn.native.gtk.GtkBuilderClosureFlags
import org.gtkkn.native.gtk.gtk_builder_closure_flags_get_type

/**
 * The list of flags that can be passed to gtk_builder_create_closure().
 *
 * New values may be added in the future for new features, so external
 * implementations of [iface@Gtk.BuilderScope] should test the flags
 * for unknown values and raise a %GTK_BUILDER_ERROR_INVALID_ATTRIBUTE error
 * when they encounter one.
 */
public class BuilderClosureFlags(public val mask: GtkBuilderClosureFlags) : Bitfield<BuilderClosureFlags> {
    override infix fun or(other: BuilderClosureFlags): BuilderClosureFlags = BuilderClosureFlags(mask or other.mask)

    public companion object {
        /**
         * The closure should be created swapped. See
         *   g_cclosure_new_swap() for details.
         */
        public val SWAPPED: BuilderClosureFlags = BuilderClosureFlags(GTK_BUILDER_CLOSURE_SWAPPED)

        /**
         * Get the GType of BuilderClosureFlags
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_builder_closure_flags_get_type()
    }
}
