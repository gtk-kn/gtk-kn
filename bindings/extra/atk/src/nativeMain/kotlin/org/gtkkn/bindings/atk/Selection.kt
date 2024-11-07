// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkSelection
import org.gtkkn.native.atk.atk_selection_add_selection
import org.gtkkn.native.atk.atk_selection_clear_selection
import org.gtkkn.native.atk.atk_selection_get_selection_count
import org.gtkkn.native.atk.atk_selection_get_type
import org.gtkkn.native.atk.atk_selection_is_child_selected
import org.gtkkn.native.atk.atk_selection_ref_selection
import org.gtkkn.native.atk.atk_selection_select_all_selection
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.Int
import kotlin.ULong
import kotlin.Unit

/**
 * The ATK interface implemented by container objects whose #AtkObject children can be selected.
 *
 * #AtkSelection should be implemented by UI components with children
 * which are exposed by #atk_object_ref_child and
 * #atk_object_get_n_children, if the use of the parent UI component
 * ordinarily involves selection of one or more of the objects
 * corresponding to those #AtkObject children - for example,
 * selectable lists.
 *
 * Note that other types of "selection" (for instance text selection)
 * are accomplished a other ATK interfaces - #AtkSelection is limited
 * to the selection/deselection of children.
 *
 * ## Skipped during bindings generation
 *
 * - method `remove_selection`: C function atk_selection_remove_selection is ignored
 */
public interface Selection :
    Interface,
    KGTyped {
    public val atkSelectionPointer: CPointer<AtkSelection>

    /**
     * Adds the specified accessible child of the object to the
     * object's selection.
     *
     * @param i a #gint specifying the child index.
     * @return TRUE if success, FALSE otherwise.
     */
    public fun addSelection(i: Int): Boolean =
        atk_selection_add_selection(atkSelectionPointer.reinterpret(), i).asBoolean()

    /**
     * Clears the selection in the object so that no children in the object
     * are selected.
     *
     * @return TRUE if success, FALSE otherwise.
     */
    public fun clearSelection(): Boolean = atk_selection_clear_selection(atkSelectionPointer.reinterpret()).asBoolean()

    /**
     * Gets the number of accessible children currently selected.
     * Note: callers should not rely on null or on a zero value for
     * indication of whether AtkSelectionIface is implemented, they should
     * use type checking/interface checking macros or the
     * atk_get_accessible_value() convenience method.
     *
     * @return a gint representing the number of items selected, or 0
     * if @selection does not implement this interface.
     */
    public fun getSelectionCount(): Int = atk_selection_get_selection_count(atkSelectionPointer.reinterpret())

    /**
     * Determines if the current child of this object is selected
     * Note: callers should not rely on null or on a zero value for
     * indication of whether AtkSelectionIface is implemented, they should
     * use type checking/interface checking macros or the
     * atk_get_accessible_value() convenience method.
     *
     * @param i a #gint specifying the child index.
     * @return a gboolean representing the specified child is selected, or 0
     * if @selection does not implement this interface.
     */
    public fun isChildSelected(i: Int): Boolean =
        atk_selection_is_child_selected(atkSelectionPointer.reinterpret(), i).asBoolean()

    /**
     * Gets a reference to the accessible object representing the specified
     * selected child of the object.
     * Note: callers should not rely on null or on a zero value for
     * indication of whether AtkSelectionIface is implemented, they should
     * use type checking/interface checking macros or the
     * atk_get_accessible_value() convenience method.
     *
     * @param i a #gint specifying the index in the selection set.  (e.g. the
     * ith selection as opposed to the ith child).
     * @return an #AtkObject representing the
     * selected accessible, or null if @selection does not implement this
     * interface.
     */
    public fun refSelection(i: Int): Object? =
        atk_selection_ref_selection(atkSelectionPointer.reinterpret(), i)?.run {
            Object(reinterpret())
        }

    /**
     * Causes every child of the object to be selected if the object
     * supports multiple selections.
     *
     * @return TRUE if success, FALSE otherwise.
     */
    public fun selectAllSelection(): Boolean =
        atk_selection_select_all_selection(atkSelectionPointer.reinterpret()).asBoolean()

    /**
     * The "selection-changed" signal is emitted by an object which
     * implements AtkSelection interface when the selection changes.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectSelectionChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            atkSelectionPointer.reinterpret(),
            "selection-changed",
            connectSelectionChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    private data class Wrapper(
        private val pointer: CPointer<AtkSelection>,
    ) : Selection {
        override val atkSelectionPointer: CPointer<AtkSelection> = pointer
    }

    public companion object : TypeCompanion<Selection> {
        override val type: GeneratedInterfaceKGType<Selection> =
            GeneratedInterfaceKGType(atk_selection_get_type()) { Wrapper(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<AtkSelection>): Selection = Wrapper(pointer)
    }
}

private val connectSelectionChangedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()
