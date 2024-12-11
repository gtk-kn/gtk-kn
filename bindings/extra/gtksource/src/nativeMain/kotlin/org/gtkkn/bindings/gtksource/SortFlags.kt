// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtksource.GTK_SOURCE_SORT_FLAGS_CASE_SENSITIVE
import org.gtkkn.native.gtksource.GTK_SOURCE_SORT_FLAGS_NONE
import org.gtkkn.native.gtksource.GTK_SOURCE_SORT_FLAGS_REMOVE_DUPLICATES
import org.gtkkn.native.gtksource.GTK_SOURCE_SORT_FLAGS_REVERSE_ORDER
import org.gtkkn.native.gtksource.GtkSourceSortFlags
import org.gtkkn.native.gtksource.gtk_source_sort_flags_get_type

public class SortFlags(public val mask: GtkSourceSortFlags) : Bitfield<SortFlags> {
    override infix fun or(other: SortFlags): SortFlags = SortFlags(mask or other.mask)

    public companion object {
        /**
         * no flags specified
         */
        public val NONE: SortFlags = SortFlags(GTK_SOURCE_SORT_FLAGS_NONE)

        /**
         * case sensitive sort
         */
        public val CASE_SENSITIVE: SortFlags = SortFlags(GTK_SOURCE_SORT_FLAGS_CASE_SENSITIVE)

        /**
         * sort in reverse order
         */
        public val REVERSE_ORDER: SortFlags = SortFlags(GTK_SOURCE_SORT_FLAGS_REVERSE_ORDER)

        /**
         * remove duplicates
         */
        public val REMOVE_DUPLICATES: SortFlags = SortFlags(GTK_SOURCE_SORT_FLAGS_REMOVE_DUPLICATES)

        /**
         * Get the GType of SortFlags
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_sort_flags_get_type()
    }
}
