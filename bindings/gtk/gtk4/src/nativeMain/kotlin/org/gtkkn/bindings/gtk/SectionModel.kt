// This is a generated file. Do not modify.
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
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkSectionModel
import org.gtkkn.native.gtk.gtk_section_model_get_type
import org.gtkkn.native.gtk.gtk_section_model_sections_changed
import kotlin.UInt
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
public interface SectionModel :
    Interface,
    ListModel,
    KGTyped {
    public val gtkSectionModelPointer: CPointer<GtkSectionModel>

    override val gioListModelPointer: CPointer<GListModel>
        get() = gtkSectionModelPointer.reinterpret()

    /**
     *
     *
     * @param position
     * @param nItems
     */
    public fun sectionsChanged(
        position: UInt,
        nItems: UInt,
    ): Unit = gtk_section_model_sections_changed(gtkSectionModelPointer.reinterpret(), position, nItems)

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
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `position` The first item that may have changed; `nItems` number of items with changes
     * @since 4.12
     */
    public fun connectSectionsChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (position: UInt, nItems: UInt) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gtkSectionModelPointer.reinterpret(),
            "sections-changed",
            connectSectionsChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    private data class Wrapper(
        private val pointer: CPointer<GtkSectionModel>,
    ) : SectionModel {
        override val gtkSectionModelPointer: CPointer<GtkSectionModel> = pointer
    }

    public companion object : TypeCompanion<SectionModel> {
        override val type: GeneratedInterfaceKGType<SectionModel> =
            GeneratedInterfaceKGType(gtk_section_model_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GtkSectionModel>): SectionModel = Wrapper(pointer)
    }
}

private val connectSectionsChangedFunc: CPointer<CFunction<(UInt, UInt) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            position: UInt,
            nItems: UInt,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(position: UInt, nItems: UInt) -> Unit>().get().invoke(position, nItems)
    }.reinterpret()
