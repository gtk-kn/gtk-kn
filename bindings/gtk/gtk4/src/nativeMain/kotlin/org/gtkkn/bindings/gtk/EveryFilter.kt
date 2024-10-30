// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkEveryFilter
import org.gtkkn.native.gtk.gtk_every_filter_get_type
import org.gtkkn.native.gtk.gtk_every_filter_new

/**
 * `GtkEveryFilter` matches an item when each of its filters matches.
 *
 * To add filters to a `GtkEveryFilter`, use [method@Gtk.MultiFilter.append].
 */
public open class EveryFilter(
    pointer: CPointer<GtkEveryFilter>,
) : MultiFilter(pointer.reinterpret()),
    KGTyped {
    public val gtkEveryFilterPointer: CPointer<GtkEveryFilter>
        get() = gPointer.reinterpret()

    override val gioListModelPointer: CPointer<GListModel>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    /**
     * Creates a new empty "every" filter.
     *
     * Use [method@Gtk.MultiFilter.append] to add filters to it.
     *
     * This filter matches an item if each of the filters added to it
     * matches the item. In particular, this means that if no filter
     * has been added to it, the filter matches every item.
     *
     * @return a new `GtkEveryFilter`
     */
    public constructor() : this(gtk_every_filter_new()!!.reinterpret())

    public companion object : TypeCompanion<EveryFilter> {
        override val type: GeneratedClassKGType<EveryFilter> =
            GeneratedClassKGType(gtk_every_filter_get_type()) { EveryFilter(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}