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
    init {
        Gtk
    }

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
    public constructor() : this(gtk_any_filter_new()!!) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<AnyFilter> {
        override val type: GeneratedClassKGType<AnyFilter> =
            GeneratedClassKGType(getTypeOrNull()!!) { AnyFilter(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of AnyFilter
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_any_filter_get_type()

        /**
         * Gets the GType of from the symbol `gtk_any_filter_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_any_filter_get_type")
    }
}
