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
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_12
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkSectionModel
import org.gtkkn.native.gtk.gtk_section_model_get_type
import org.gtkkn.native.gtk.gtk_section_model_sections_changed
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkSectionModel` is an interface that adds support for sections to list models.
 *
 * A `GtkSectionModel` groups successive items into so-called sections. List widgets
 * like `GtkListView` and `GtkGridView` then allow displaying section headers for
 * these sections by installing a header factory.
 *
 * Many GTK list models support sections inherently, or they pass through the sections
 * of a model they are wrapping.
 *
 * When the section groupings of a model change, the model will emit the
 * [signal@Gtk.SectionModel::sections-changed] signal by calling the
 * [method@Gtk.SectionModel.sections_changed] function. All sections in the given range
 * then need to be queried again.
 * The [signal@Gio.ListModel::items-changed] signal has the same effect, all sections in
 * that range are invalidated, too.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `out_start`: out_start: Out parameter is not supported
 *
 * @since 4.12
 */
@GtkVersion4_12
public interface SectionModel :
    Proxy,
    ListModel,
    KGTyped {
    public val gtkSectionModelPointer: CPointer<GtkSectionModel>

    override val gioListModelPointer: CPointer<GListModel>
        get() = gtkSectionModelPointer.reinterpret()

    public fun sectionsChanged(position: guint, nItems: guint): Unit =
        gtk_section_model_sections_changed(gtkSectionModelPointer, position, nItems)

    /**
     * Emitted when the start-of-section state of some of the items in @model changes.
     *
     * Note that this signal does not specify the new section state of the
     * items, they need to be queried manually. It is also not necessary for
     * a model to change the section state of any of the items in the section
     * model, though it would be rather useless to emit such a signal.
     *
     * The [signal@Gio.ListModel::items-changed] implies the effect of the
     * [signal@Gtk.SectionModel::sections-changed] signal for all the items
     * it covers.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `position` The first item that may have changed; `nItems` number of items with changes
     * @since 4.12
     */
    @GtkVersion4_12
    public fun onSectionsChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (position: guint, nItems: guint) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkSectionModelPointer,
        "sections-changed",
        onSectionsChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * The SectionModelImpl type represents a native instance of the SectionModel interface.
     *
     * @constructor Creates a new instance of SectionModel for the provided [CPointer].
     */
    public class SectionModelImpl(gtkSectionModelPointer: CPointer<GtkSectionModel>) :
        Object(gtkSectionModelPointer.reinterpret()),
        SectionModel {
        init {
            Gtk
        }

        override val gtkSectionModelPointer: CPointer<GtkSectionModel> = gtkSectionModelPointer
    }

    public companion object : TypeCompanion<SectionModel> {
        override val type: GeneratedInterfaceKGType<SectionModel> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { SectionModelImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of SectionModel
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_section_model_get_type()

        /**
         * Gets the GType of from the symbol `gtk_section_model_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_section_model_get_type")
    }
}

private val onSectionsChangedFunc: CPointer<CFunction<(guint, guint) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        position: guint,
        nItems: guint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(position: guint, nItems: guint) -> Unit>().get().invoke(position, nItems)
}
    .reinterpret()
