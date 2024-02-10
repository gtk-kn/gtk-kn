// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkCellRendererCombo
import org.gtkkn.native.gtk.GtkTreeIter
import org.gtkkn.native.gtk.gtk_cell_renderer_combo_get_type
import org.gtkkn.native.gtk.gtk_cell_renderer_combo_new
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Renders a combobox in a cell
 *
 * `GtkCellRendererCombo` renders text in a cell like `GtkCellRendererText` from
 * which it is derived. But while `GtkCellRendererText` offers a simple entry to
 * edit the text, `GtkCellRendererCombo` offers a `GtkComboBox`
 * widget to edit the text. The values to display in the combo box are taken from
 * the tree model specified in the `GtkCellRendererCombo`:model property.
 *
 * The combo cell renderer takes care of adding a text cell renderer to the combo
 * box and sets it to display the column specified by its
 * `GtkCellRendererCombo`:text-column property. Further properties of the combo box
 * can be set in a handler for the `GtkCellRenderer::editing-started` signal.
 *
 * ## Skipped during bindings generation
 *
 * - method `has-entry`: Property has no getter nor setter
 * - method `model`: Property has no getter nor setter
 * - method `text-column`: Property has no getter nor setter
 */
public open class CellRendererCombo(
    pointer: CPointer<GtkCellRendererCombo>,
) : CellRendererText(pointer.reinterpret()), KGTyped {
    public val gtkCellRendererComboPointer: CPointer<GtkCellRendererCombo>
        get() = gPointer.reinterpret()

    /**
     * Creates a new `GtkCellRendererCombo`.
     * Adjust how text is drawn using object properties.
     * Object properties can be set globally (with g_object_set()).
     * Also, with `GtkTreeViewColumn`, you can bind a property to a value
     * in a `GtkTreeModel`. For example, you can bind the “text” property
     * on the cell renderer to a string value in the model, thus rendering
     * a different string in each row of the `GtkTreeView`.
     *
     * @return the new cell renderer
     */
    public constructor() : this(gtk_cell_renderer_combo_new()!!.reinterpret())

    /**
     * This signal is emitted each time after the user selected an item in
     * the combo box, either by using the mouse or the arrow keys.  Contrary
     * to GtkComboBox, GtkCellRendererCombo::changed is not emitted for
     * changes made to a selected item in the entry.  The argument @new_iter
     * corresponds to the newly selected item in the combo box and it is relative
     * to the GtkTreeModel set via the model property on GtkCellRendererCombo.
     *
     * Note that as soon as you change the model displayed in the tree view,
     * the tree view will immediately cease the editing operating.  This
     * means that you most probably want to refrain from changing the model
     * until the combo cell renderer emits the edited or editing_canceled signal.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `pathString` a string of the path identifying
     * the edited cell
     *               (relative to the tree view model); `newIter` the new iter selected in the combo
     * box
     *            (relative to the combo box model)
     */
    public fun connectChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (pathString: String, newIter: TreeIter) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "changed",
            connectChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<CellRendererCombo> {
        override val type: GeneratedClassKGType<CellRendererCombo> =
            GeneratedClassKGType(gtk_cell_renderer_combo_get_type()) {
                CellRendererCombo(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectChangedFunc: CPointer<
    CFunction<
        (
            CPointer<ByteVar>,
            CPointer<GtkTreeIter>,
        ) -> Unit
        >
    > =
    staticCFunction {
            _: COpaquePointer,
            pathString: CPointer<ByteVar>?,
            newIter: CPointer<GtkTreeIter>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                pathString: String,
                newIter: TreeIter,
            ) -> Unit
            >().get().invoke(
            pathString?.toKString()
                ?: error("Expected not null string"),
            newIter!!.run {
                TreeIter(reinterpret())
            }
        )
    }
        .reinterpret()
