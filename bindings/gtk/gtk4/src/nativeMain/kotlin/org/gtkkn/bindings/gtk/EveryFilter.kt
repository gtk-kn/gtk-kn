// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkEveryFilter
import org.gtkkn.native.gtk.gtk_every_filter_get_type
import org.gtkkn.native.gtk.gtk_every_filter_new

/**
 * `GtkEveryFilter` matches an item when each of its filters matches.
 *
 * To add filters to a `GtkEveryFilter`, use [method@Gtk.MultiFilter.append].
 */
public open class EveryFilter(public val gtkEveryFilterPointer: CPointer<GtkEveryFilter>) :
    MultiFilter(gtkEveryFilterPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    override val gioListModelPointer: CPointer<GListModel>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

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
    public constructor() : this(gtk_every_filter_new()!!) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<EveryFilter> {
        override val type: GeneratedClassKGType<EveryFilter> =
            GeneratedClassKGType(getTypeOrNull()!!) { EveryFilter(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of EveryFilter
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_every_filter_get_type()

        /**
         * Gets the GType of from the symbol `gtk_every_filter_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_every_filter_get_type")
    }
}
