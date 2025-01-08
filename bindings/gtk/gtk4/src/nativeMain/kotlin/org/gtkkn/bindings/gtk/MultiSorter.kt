// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkMultiSorter
import org.gtkkn.native.gtk.gtk_multi_sorter_append
import org.gtkkn.native.gtk.gtk_multi_sorter_get_type
import org.gtkkn.native.gtk.gtk_multi_sorter_new
import org.gtkkn.native.gtk.gtk_multi_sorter_remove
import kotlin.Unit

/**
 * `GtkMultiSorter` combines multiple sorters by trying them
 * in turn.
 *
 * If the first sorter compares two items as equal,
 * the second is tried next, and so on.
 *
 * ## Skipped during bindings generation
 *
 * - method `item-type`: Property has no getter nor setter
 * - method `n-items`: Property has no getter nor setter
 */
public open class MultiSorter(pointer: CPointer<GtkMultiSorter>) :
    Sorter(pointer.reinterpret()),
    ListModel,
    Buildable,
    KGTyped {
    public val gtkMultiSorterPointer: CPointer<GtkMultiSorter>
        get() = gPointer.reinterpret()

    override val gioListModelPointer: CPointer<GListModel>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    /**
     * Creates a new multi sorter.
     *
     * This sorter compares items by trying each of the sorters
     * in turn, until one returns non-zero. In particular, if
     * no sorter has been added to it, it will always compare
     * items as equal.
     *
     * @return a new `GtkMultiSorter`
     */
    public constructor() : this(gtk_multi_sorter_new()!!.reinterpret())

    /**
     * Add @sorter to @self to use for sorting at the end.
     *
     * @self will consult all existing sorters before it will
     * sort with the given @sorter.
     *
     * @param sorter a sorter to add
     */
    public open fun append(sorter: Sorter): Unit =
        gtk_multi_sorter_append(gtkMultiSorterPointer, sorter.gtkSorterPointer)

    /**
     * Removes the sorter at the given @position from the list of sorter
     * used by @self.
     *
     * If @position is larger than the number of sorters, nothing happens.
     *
     * @param position position of sorter to remove
     */
    public open fun remove(position: guint): Unit = gtk_multi_sorter_remove(gtkMultiSorterPointer, position)

    public companion object : TypeCompanion<MultiSorter> {
        override val type: GeneratedClassKGType<MultiSorter> =
            GeneratedClassKGType(gtk_multi_sorter_get_type()) { MultiSorter(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of MultiSorter
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_multi_sorter_get_type()
    }
}
