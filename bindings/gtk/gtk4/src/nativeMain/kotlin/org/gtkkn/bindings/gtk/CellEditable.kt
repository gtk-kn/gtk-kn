// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gdk.Event
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkCellEditable
import org.gtkkn.native.gtk.gtk_cell_editable_editing_done
import org.gtkkn.native.gtk.gtk_cell_editable_get_type
import org.gtkkn.native.gtk.gtk_cell_editable_remove_widget
import org.gtkkn.native.gtk.gtk_cell_editable_start_editing
import kotlin.ULong
import kotlin.Unit

/**
 * Interface for widgets that can be used for editing cells
 *
 * The `GtkCellEditable` interface must be implemented for widgets to be usable
 * to edit the contents of a `GtkTreeView` cell. It provides a way to specify how
 * temporary widgets should be configured for editing, get the new value, etc.
 *
 * ## Skipped during bindings generation
 *
 * - method `editing-canceled`: Property has no getter nor setter
 */
public interface CellEditable :
    Interface,
    KGTyped {
    public val gtkCellEditablePointer: CPointer<GtkCellEditable>

    /**
     * Emits the `GtkCellEditable::editing-done` signal.
     */
    public fun editingDone(): Unit = gtk_cell_editable_editing_done(gtkCellEditablePointer.reinterpret())

    /**
     * Emits the `GtkCellEditable::remove-widget` signal.
     */
    public fun removeWidget(): Unit = gtk_cell_editable_remove_widget(gtkCellEditablePointer.reinterpret())

    /**
     * Begins editing on a @cell_editable.
     *
     * The `GtkCellRenderer` for the cell creates and returns a `GtkCellEditable` from
     * gtk_cell_renderer_start_editing(), configured for the `GtkCellRenderer` type.
     *
     * gtk_cell_editable_start_editing() can then set up @cell_editable suitably for
     * editing a cell, e.g. making the Esc key emit `GtkCellEditable::editing-done`.
     *
     * Note that the @cell_editable is created on-demand for the current edit; its
     * lifetime is temporary and does not persist across other edits and/or cells.
     *
     * @param event The `GdkEvent` that began the editing process, or
     *   null if editing was initiated programmatically
     */
    public fun startEditing(event: Event? = null): Unit =
        gtk_cell_editable_start_editing(gtkCellEditablePointer.reinterpret(), event?.gPointer?.reinterpret())

    /**
     * This signal is a sign for the cell renderer to update its
     * value from the @cell_editable.
     *
     * Implementations of `GtkCellEditable` are responsible for
     * emitting this signal when they are done editing, e.g.
     * `GtkEntry` emits this signal when the user presses Enter. Typical things to
     * do in a handler for ::editing-done are to capture the edited value,
     * disconnect the @cell_editable from signals on the `GtkCellRenderer`, etc.
     *
     * gtk_cell_editable_editing_done() is a convenience method
     * for emitting `GtkCellEditable::editing-done`.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectEditingDone(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkCellEditablePointer.reinterpret(),
            "editing-done",
            connectEditingDoneFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * This signal is meant to indicate that the cell is finished
     * editing, and the @cell_editable widget is being removed and may
     * subsequently be destroyed.
     *
     * Implementations of `GtkCellEditable` are responsible for
     * emitting this signal when they are done editing. It must
     * be emitted after the `GtkCellEditable::editing-done` signal,
     * to give the cell renderer a chance to update the cell's value
     * before the widget is removed.
     *
     * gtk_cell_editable_remove_widget() is a convenience method
     * for emitting `GtkCellEditable::remove-widget`.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectRemoveWidget(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkCellEditablePointer.reinterpret(),
            "remove-widget",
            connectRemoveWidgetFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    private data class Wrapper(private val pointer: CPointer<GtkCellEditable>) : CellEditable {
        override val gtkCellEditablePointer: CPointer<GtkCellEditable> = pointer
    }

    public companion object : TypeCompanion<CellEditable> {
        override val type: GeneratedInterfaceKGType<CellEditable> =
            GeneratedInterfaceKGType(gtk_cell_editable_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GtkCellEditable>): CellEditable = Wrapper(pointer)

        /**
         * Get the GType of CellEditable
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_cell_editable_get_type()
    }
}

private val connectEditingDoneFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val connectRemoveWidgetFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
