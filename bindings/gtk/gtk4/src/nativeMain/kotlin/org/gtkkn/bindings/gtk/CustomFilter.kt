// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkCustomFilter
import org.gtkkn.native.gtk.gtk_custom_filter_get_type
import org.gtkkn.native.gtk.gtk_custom_filter_new
import org.gtkkn.native.gtk.gtk_custom_filter_set_filter_func
import kotlin.Unit

/**
 * `GtkCustomFilter` determines whether to include items with a callback.
 */
public open class CustomFilter(public val gtkCustomFilterPointer: CPointer<GtkCustomFilter>) :
    Filter(gtkCustomFilterPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * Creates a new filter using the given @match_func to filter
     * items.
     *
     * If @match_func is null, the filter matches all items.
     *
     * If the filter func changes its filtering behavior,
     * gtk_filter_changed() needs to be called.
     *
     * @param matchFunc function to filter items
     * @return a new `GtkCustomFilter`
     */
    public constructor(
        matchFunc: CustomFilterFunc?,
    ) : this(
        gtk_custom_filter_new(
            matchFunc?.let {
                CustomFilterFuncFunc.reinterpret()
            },
            matchFunc?.let {
                StableRef.create(matchFunc).asCPointer()
            },
            matchFunc?.let { staticStableRefDestroy.reinterpret() }
        )!!
    ) {
        InstanceCache.put(this)
    }

    /**
     * Sets the function used for filtering items.
     *
     * If @match_func is null, the filter matches all items.
     *
     * If the filter func changes its filtering behavior,
     * gtk_filter_changed() needs to be called.
     *
     * If a previous function was set, its @user_destroy will be
     * called now.
     *
     * @param matchFunc function to filter items
     */
    public open fun setFilterFunc(matchFunc: CustomFilterFunc?): Unit = gtk_custom_filter_set_filter_func(
        gtkCustomFilterPointer,
        matchFunc?.let {
            CustomFilterFuncFunc.reinterpret()
        },
        matchFunc?.let {
            StableRef.create(matchFunc).asCPointer()
        },
        matchFunc?.let { staticStableRefDestroy.reinterpret() }
    )

    public companion object : TypeCompanion<CustomFilter> {
        override val type: GeneratedClassKGType<CustomFilter> =
            GeneratedClassKGType(getTypeOrNull()!!) { CustomFilter(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of CustomFilter
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_custom_filter_get_type()

        /**
         * Gets the GType of from the symbol `gtk_custom_filter_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_custom_filter_get_type")
    }
}
