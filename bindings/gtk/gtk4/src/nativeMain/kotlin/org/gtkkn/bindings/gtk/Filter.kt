// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkFilter
import org.gtkkn.native.gtk.GtkFilterChange
import org.gtkkn.native.gtk.gtk_filter_changed
import org.gtkkn.native.gtk.gtk_filter_get_strictness
import org.gtkkn.native.gtk.gtk_filter_get_type
import org.gtkkn.native.gtk.gtk_filter_match
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * A `GtkFilter` object describes the filtering to be performed by a
 * [class@Gtk.FilterListModel].
 *
 * The model will use the filter to determine if it should include items
 * or not by calling [method@Gtk.Filter.match] for each item and only
 * keeping the ones that the function returns true for.
 *
 * Filters may change what items they match through their lifetime. In that
 * case, they will emit the [signal@Gtk.Filter::changed] signal to notify
 * that previous filter results are no longer valid and that items should
 * be checked again via [method@Gtk.Filter.match].
 *
 * GTK provides various pre-made filter implementations for common filtering
 * operations. These filters often include properties that can be linked to
 * various widgets to easily allow searches.
 *
 * However, in particular for large lists or complex search methods, it is
 * also possible to subclass `GtkFilter` and provide one's own filter.
 */
public open class Filter(public val gtkFilterPointer: CPointer<GtkFilter>) :
    Object(gtkFilterPointer.reinterpret()),
    KGTyped {
    /**
     * Notifies all users of the filter that it has changed.
     *
     * This emits the [signal@Gtk.Filter::changed] signal. Users
     * of the filter should then check items again via
     * [method@Gtk.Filter.match].
     *
     * Depending on the @change parameter, not all items need to
     * be changed, but only some. Refer to the [enum@Gtk.FilterChange]
     * documentation for details.
     *
     * This function is intended for implementers of `GtkFilter`
     * subclasses and should not be called from other functions.
     *
     * @param change How the filter changed
     */
    public open fun changed(change: FilterChange): Unit = gtk_filter_changed(gtkFilterPointer, change.nativeValue)

    /**
     * Gets the known strictness of @filters.
     *
     * If the strictness is not known, %GTK_FILTER_MATCH_SOME is returned.
     *
     * This value may change after emission of the [signal@Gtk.Filter::changed]
     * signal.
     *
     * This function is meant purely for optimization purposes, filters can
     * choose to omit implementing it, but `GtkFilterListModel` uses it.
     *
     * @return the strictness of @self
     */
    public open fun getStrictness(): FilterMatch = gtk_filter_get_strictness(gtkFilterPointer).run {
        FilterMatch.fromNativeValue(this)
    }

    /**
     * Checks if the given @item is matched by the filter or not.
     *
     * @param item The item to check
     * @return true if the filter matches the item and a filter model should
     *   keep it, false if not.
     */
    public open fun match(item: Object): Boolean =
        gtk_filter_match(gtkFilterPointer, item.gobjectObjectPointer.reinterpret()).asBoolean()

    /**
     * Emitted whenever the filter changed.
     *
     * Users of the filter should then check items again via
     * [method@Gtk.Filter.match].
     *
     * `GtkFilterListModel` handles this signal automatically.
     *
     * Depending on the @change parameter, not all items need
     * to be checked, but only some. Refer to the [enum@Gtk.FilterChange]
     * documentation for details.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `change` how the filter changed
     */
    public fun onChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (change: FilterChange) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkFilterPointer,
        "changed",
        onChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "changed" signal. See [onChanged].
     *
     * @param change how the filter changed
     */
    public fun emitChanged(change: FilterChange) {
        g_signal_emit_by_name(gtkFilterPointer.reinterpret(), "changed", change.nativeValue)
    }

    public companion object : TypeCompanion<Filter> {
        override val type: GeneratedClassKGType<Filter> =
            GeneratedClassKGType(getTypeOrNull("gtk_filter_get_type")!!) { Filter(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Filter
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_filter_get_type()
    }
}

private val onChangedFunc: CPointer<CFunction<(GtkFilterChange) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        change: GtkFilterChange,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(change: FilterChange) -> Unit>().get().invoke(
        change.run {
            FilterChange.fromNativeValue(this)
        }
    )
}
    .reinterpret()
