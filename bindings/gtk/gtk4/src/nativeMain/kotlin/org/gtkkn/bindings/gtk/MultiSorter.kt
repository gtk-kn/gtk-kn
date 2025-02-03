// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
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
public open class MultiSorter(public val gtkMultiSorterPointer: CPointer<GtkMultiSorter>) :
    Sorter(gtkMultiSorterPointer.reinterpret()),
    ListModel,
    Buildable,
    KGTyped {
    init {
        Gtk
    }

    override val gioListModelPointer: CPointer<GListModel>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

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
    public constructor() : this(gtk_multi_sorter_new()!!) {
        InstanceCache.put(this)
    }

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
            GeneratedClassKGType(getTypeOrNull()!!) { MultiSorter(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of MultiSorter
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_multi_sorter_get_type()

        /**
         * Gets the GType of from the symbol `gtk_multi_sorter_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_multi_sorter_get_type")
    }
}
