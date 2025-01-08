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
import org.gtkkn.native.gtk.GtkMultiFilter
import org.gtkkn.native.gtk.gtk_multi_filter_append
import org.gtkkn.native.gtk.gtk_multi_filter_get_type
import org.gtkkn.native.gtk.gtk_multi_filter_remove
import kotlin.Unit

/**
 * `GtkMultiFilter` is the base class for filters that combine multiple filters.
 *
 * ## Skipped during bindings generation
 *
 * - method `item-type`: Property has no getter nor setter
 * - method `n-items`: Property has no getter nor setter
 */
public open class MultiFilter(pointer: CPointer<GtkMultiFilter>) :
    Filter(pointer.reinterpret()),
    ListModel,
    Buildable,
    KGTyped {
    public val gtkMultiFilterPointer: CPointer<GtkMultiFilter>
        get() = gPointer.reinterpret()

    override val gioListModelPointer: CPointer<GListModel>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    /**
     * Adds a @filter to @self to use for matching.
     *
     * @param filter A new filter to use
     */
    public open fun append(filter: Filter): Unit =
        gtk_multi_filter_append(gtkMultiFilterPointer, filter.gtkFilterPointer)

    /**
     * Removes the filter at the given @position from the list of filters used
     * by @self.
     *
     * If @position is larger than the number of filters, nothing happens and
     * the function returns.
     *
     * @param position position of filter to remove
     */
    public open fun remove(position: guint): Unit = gtk_multi_filter_remove(gtkMultiFilterPointer, position)

    public companion object : TypeCompanion<MultiFilter> {
        override val type: GeneratedClassKGType<MultiFilter> =
            GeneratedClassKGType(gtk_multi_filter_get_type()) { MultiFilter(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of MultiFilter
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_multi_filter_get_type()
    }
}
