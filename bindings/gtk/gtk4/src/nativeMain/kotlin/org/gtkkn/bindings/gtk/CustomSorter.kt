// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.CompareDataFunc
import org.gtkkn.bindings.glib.CompareDataFuncFunc
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkCustomSorter
import org.gtkkn.native.gtk.gtk_custom_sorter_get_type
import org.gtkkn.native.gtk.gtk_custom_sorter_new
import org.gtkkn.native.gtk.gtk_custom_sorter_set_sort_func
import kotlin.Unit

/**
 * `GtkCustomSorter` is a `GtkSorter` implementation that sorts via a callback
 * function.
 */
public open class CustomSorter(public val gtkCustomSorterPointer: CPointer<GtkCustomSorter>) :
    Sorter(gtkCustomSorterPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * Creates a new `GtkSorter` that works by calling
     * @sort_func to compare items.
     *
     * If @sort_func is null, all items are considered equal.
     *
     * @param sortFunc the `GCompareDataFunc` to use for sorting
     * @return a new `GtkCustomSorter`
     */
    public constructor(
        sortFunc: CompareDataFunc?,
    ) : this(
        gtk_custom_sorter_new(
            sortFunc?.let {
                CompareDataFuncFunc.reinterpret()
            },
            sortFunc?.let {
                StableRef.create(sortFunc).asCPointer()
            },
            sortFunc?.let { staticStableRefDestroy.reinterpret() }
        )!!
    ) {
        InstanceCache.put(this)
    }

    /**
     * Sets (or unsets) the function used for sorting items.
     *
     * If @sort_func is null, all items are considered equal.
     *
     * If the sort func changes its sorting behavior,
     * gtk_sorter_changed() needs to be called.
     *
     * If a previous function was set, its @user_destroy will be
     * called now.
     *
     * @param sortFunc function to sort items
     */
    public open fun setSortFunc(sortFunc: CompareDataFunc?): Unit = gtk_custom_sorter_set_sort_func(
        gtkCustomSorterPointer,
        sortFunc?.let {
            CompareDataFuncFunc.reinterpret()
        },
        sortFunc?.let {
            StableRef.create(sortFunc).asCPointer()
        },
        sortFunc?.let { staticStableRefDestroy.reinterpret() }
    )

    public companion object : TypeCompanion<CustomSorter> {
        override val type: GeneratedClassKGType<CustomSorter> =
            GeneratedClassKGType(getTypeOrNull()!!) { CustomSorter(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of CustomSorter
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_custom_sorter_get_type()

        /**
         * Gets the GType of from the symbol `gtk_custom_sorter_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_custom_sorter_get_type")
    }
}
