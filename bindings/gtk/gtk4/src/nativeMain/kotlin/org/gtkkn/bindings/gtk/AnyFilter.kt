// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAnyFilter
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.gtk_any_filter_get_type
import org.gtkkn.native.gtk.gtk_any_filter_new

/**
 * `GtkAnyFilter` matches an item when at least one of its filters matches.
 *
 * To add filters to a `GtkAnyFilter`, use [method@Gtk.MultiFilter.append].
 */
public open class AnyFilter(public val gtkAnyFilterPointer: CPointer<GtkAnyFilter>) :
    MultiFilter(gtkAnyFilterPointer.reinterpret()),
    KGTyped {
    override val gioListModelPointer: CPointer<GListModel>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    /**
     * Creates a new empty "any" filter.
     *
     * Use [method@Gtk.MultiFilter.append] to add filters to it.
     *
     * This filter matches an item if any of the filters added to it
     * matches the item. In particular, this means that if no filter
     * has been added to it, the filter matches no item.
     *
     * @return a new `GtkAnyFilter`
     */
    public constructor() : this(gtk_any_filter_new()!!.reinterpret())

    public companion object : TypeCompanion<AnyFilter> {
        override val type: GeneratedClassKGType<AnyFilter> =
            GeneratedClassKGType(gtk_any_filter_get_type()) { AnyFilter(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of AnyFilter
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_any_filter_get_type()
    }
}
