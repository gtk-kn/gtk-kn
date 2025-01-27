// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
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
public abstract class MultiFilter(public val gtkMultiFilterPointer: CPointer<GtkMultiFilter>) :
    Filter(gtkMultiFilterPointer.reinterpret()),
    ListModel,
    Buildable,
    KGTyped {
    override val gioListModelPointer: CPointer<GListModel>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

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

    /**
     * The MultiFilterImpl type represents a native instance of the abstract MultiFilter class.
     *
     * @constructor Creates a new instance of MultiFilter for the provided [CPointer].
     */
    public class MultiFilterImpl(pointer: CPointer<GtkMultiFilter>) : MultiFilter(pointer)

    public companion object : TypeCompanion<MultiFilter> {
        override val type: GeneratedClassKGType<MultiFilter> =
            GeneratedClassKGType(getTypeOrNull("gtk_multi_filter_get_type")!!) { MultiFilterImpl(it.reinterpret()) }

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
