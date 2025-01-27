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
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkSorter
import org.gtkkn.native.gtk.GtkSorterChange
import org.gtkkn.native.gtk.gtk_sorter_changed
import org.gtkkn.native.gtk.gtk_sorter_compare
import org.gtkkn.native.gtk.gtk_sorter_get_order
import org.gtkkn.native.gtk.gtk_sorter_get_type
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkSorter` is an object to describe sorting criteria.
 *
 * Its primary user is [class@Gtk.SortListModel]
 *
 * The model will use a sorter to determine the order in which
 * its items should appear by calling [method@Gtk.Sorter.compare]
 * for pairs of items.
 *
 * Sorters may change their sorting behavior through their lifetime.
 * In that case, they will emit the [signal@Gtk.Sorter::changed] signal
 * to notify that the sort order is no longer valid and should be updated
 * by calling gtk_sorter_compare() again.
 *
 * GTK provides various pre-made sorter implementations for common sorting
 * operations. [class@Gtk.ColumnView] has built-in support for sorting lists
 * via the [property@Gtk.ColumnViewColumn:sorter] property, where the user can
 * change the sorting by clicking on list headers.
 *
 * Of course, in particular for large lists, it is also possible to subclass
 * `GtkSorter` and provide one's own sorter.
 */
public open class Sorter(public val gtkSorterPointer: CPointer<GtkSorter>) :
    Object(gtkSorterPointer.reinterpret()),
    KGTyped {
    /**
     * Notifies all users of the sorter that it has changed.
     *
     * This emits the [signal@Gtk.Sorter::changed] signal. Users
     * of the sorter should then update the sort order via
     * [method@Gtk.Sorter.compare].
     *
     * Depending on the @change parameter, it may be possible to
     * update the sort order without a full resorting. Refer to
     * the [enum@Gtk.SorterChange] documentation for details.
     *
     * This function is intended for implementers of `GtkSorter`
     * subclasses and should not be called from other functions.
     *
     * @param change How the sorter changed
     */
    public open fun changed(change: SorterChange): Unit = gtk_sorter_changed(gtkSorterPointer, change.nativeValue)

    /**
     * Compares two given items according to the sort order implemented
     * by the sorter.
     *
     * Sorters implement a partial order:
     *
     * * It is reflexive, ie a = a
     * * It is antisymmetric, ie if a < b and b < a, then a = b
     * * It is transitive, ie given any 3 items with a ≤ b and b ≤ c,
     *   then a ≤ c
     *
     * The sorter may signal it conforms to additional constraints
     * via the return value of [method@Gtk.Sorter.get_order].
     *
     * @param item1 first item to compare
     * @param item2 second item to compare
     * @return %GTK_ORDERING_EQUAL if @item1 == @item2,
     *   %GTK_ORDERING_SMALLER if @item1 < @item2,
     *   %GTK_ORDERING_LARGER if @item1 > @item2
     */
    public open fun compare(item1: Object, item2: Object): Ordering = gtk_sorter_compare(
        gtkSorterPointer,
        item1.gobjectObjectPointer.reinterpret(),
        item2.gobjectObjectPointer.reinterpret()
    ).run {
        Ordering.fromNativeValue(this)
    }

    /**
     * Gets the order that @self conforms to.
     *
     * See [enum@Gtk.SorterOrder] for details
     * of the possible return values.
     *
     * This function is intended to allow optimizations.
     *
     * @return The order
     */
    public open fun getOrder(): SorterOrder = gtk_sorter_get_order(gtkSorterPointer).run {
        SorterOrder.fromNativeValue(this)
    }

    /**
     * Emitted whenever the sorter changed.
     *
     * Users of the sorter should then update the sort order
     * again via gtk_sorter_compare().
     *
     * [class@Gtk.SortListModel] handles this signal automatically.
     *
     * Depending on the @change parameter, it may be possible to update
     * the sort order without a full resorting. Refer to the
     * [enum@Gtk.SorterChange] documentation for details.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `change` how the sorter changed
     */
    public fun onChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (change: SorterChange) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkSorterPointer,
        "changed",
        onChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "changed" signal. See [onChanged].
     *
     * @param change how the sorter changed
     */
    public fun emitChanged(change: SorterChange) {
        g_signal_emit_by_name(gtkSorterPointer.reinterpret(), "changed", change.nativeValue)
    }

    public companion object : TypeCompanion<Sorter> {
        override val type: GeneratedClassKGType<Sorter> =
            GeneratedClassKGType(getTypeOrNull("gtk_sorter_get_type")!!) { Sorter(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Sorter
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_sorter_get_type()
    }
}

private val onChangedFunc: CPointer<CFunction<(GtkSorterChange) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        change: GtkSorterChange,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(change: SorterChange) -> Unit>().get().invoke(
        change.run {
            SorterChange.fromNativeValue(this)
        }
    )
}
    .reinterpret()
