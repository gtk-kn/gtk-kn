// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkTable
import org.gtkkn.native.atk.atk_table_add_column_selection
import org.gtkkn.native.atk.atk_table_add_row_selection
import org.gtkkn.native.atk.atk_table_get_caption
import org.gtkkn.native.atk.atk_table_get_column_at_index
import org.gtkkn.native.atk.atk_table_get_column_description
import org.gtkkn.native.atk.atk_table_get_column_extent_at
import org.gtkkn.native.atk.atk_table_get_column_header
import org.gtkkn.native.atk.atk_table_get_index_at
import org.gtkkn.native.atk.atk_table_get_n_columns
import org.gtkkn.native.atk.atk_table_get_n_rows
import org.gtkkn.native.atk.atk_table_get_row_at_index
import org.gtkkn.native.atk.atk_table_get_row_description
import org.gtkkn.native.atk.atk_table_get_row_extent_at
import org.gtkkn.native.atk.atk_table_get_row_header
import org.gtkkn.native.atk.atk_table_get_summary
import org.gtkkn.native.atk.atk_table_get_type
import org.gtkkn.native.atk.atk_table_is_column_selected
import org.gtkkn.native.atk.atk_table_is_row_selected
import org.gtkkn.native.atk.atk_table_is_selected
import org.gtkkn.native.atk.atk_table_ref_at
import org.gtkkn.native.atk.atk_table_remove_column_selection
import org.gtkkn.native.atk.atk_table_remove_row_selection
import org.gtkkn.native.atk.atk_table_set_caption
import org.gtkkn.native.atk.atk_table_set_column_description
import org.gtkkn.native.atk.atk_table_set_column_header
import org.gtkkn.native.atk.atk_table_set_row_description
import org.gtkkn.native.atk.atk_table_set_row_header
import org.gtkkn.native.atk.atk_table_set_summary
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * The ATK interface implemented for UI components which contain tabular or row/column information.
 *
 * #AtkTable should be implemented by components which present
 * elements ordered via rows and columns.  It may also be used to
 * present tree-structured information if the nodes of the trees can
 * be said to contain multiple "columns".  Individual elements of an
 * #AtkTable are typically referred to as "cells". Those cells should
 * implement the interface #AtkTableCell, but #Atk doesn't require
 * them to be direct children of the current #AtkTable. They can be
 * grand-children, grand-grand-children etc. #AtkTable provides the
 * API needed to get a individual cell based on the row and column
 * numbers.
 *
 * Children of #AtkTable are frequently "lightweight" objects, that
 * is, they may not have backing widgets in the host UI toolkit.  They
 * are therefore often transient.
 *
 * Since tables are often very complex, #AtkTable includes provision
 * for offering simplified summary information, as well as row and
 * column headers and captions.  Headers and captions are #AtkObjects
 * which may implement other interfaces (#AtkText, #AtkImage, etc.) as
 * appropriate.  #AtkTable summaries may themselves be (simplified)
 * #AtkTables, etc.
 *
 * Note for implementors: in the past, #AtkTable required that all the
 * cells should be direct children of #AtkTable, and provided some
 * index based methods to request the cells. The practice showed that
 * that forcing made #AtkTable implementation complex, and hard to
 * expose other kind of children, like rows or captions. Right now,
 * index-based methods are deprecated.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `selected`: Unsupported pointer to primitive type
 * - parameter `selected`: Unsupported pointer to primitive type
 */
public interface Table :
    Interface,
    KGTyped {
    public val atkTablePointer: CPointer<AtkTable>

    /**
     * Adds the specified @column to the selection.
     *
     * @param column a #gint representing a column in @table
     * @return a gboolean representing if the column was successfully added to
     * the selection, or 0 if value does not implement this interface.
     */
    public fun addColumnSelection(column: Int): Boolean =
        atk_table_add_column_selection(atkTablePointer.reinterpret(), column).asBoolean()

    /**
     * Adds the specified @row to the selection.
     *
     * @param row a #gint representing a row in @table
     * @return a gboolean representing if row was successfully added to selection,
     * or 0 if value does not implement this interface.
     */
    public fun addRowSelection(row: Int): Boolean =
        atk_table_add_row_selection(atkTablePointer.reinterpret(), row).asBoolean()

    /**
     * Gets the caption for the @table.
     *
     * @return a AtkObject* representing the
     * table caption, or null if value does not implement this interface.
     */
    public fun getCaption(): Object? =
        atk_table_get_caption(atkTablePointer.reinterpret())?.run {
            Object(reinterpret())
        }

    /**
     * Gets a #gint representing the column at the specified @index_.
     *
     * @param index a #gint representing an index in @table
     * @return a gint representing the column at the specified index,
     * or -1 if the table does not implement this method.
     */
    public fun getColumnAtIndex(index: Int): Int = atk_table_get_column_at_index(atkTablePointer.reinterpret(), index)

    /**
     * Gets the description text of the specified @column in the table
     *
     * @param column a #gint representing a column in @table
     * @return a gchar* representing the column description, or null
     * if value does not implement this interface.
     */
    public fun getColumnDescription(column: Int): String =
        atk_table_get_column_description(atkTablePointer.reinterpret(), column)?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the number of columns occupied by the accessible object
     * at the specified @row and @column in the @table.
     *
     * @param row a #gint representing a row in @table
     * @param column a #gint representing a column in @table
     * @return a gint representing the column extent at specified position, or 0
     * if value does not implement this interface.
     */
    public fun getColumnExtentAt(
        row: Int,
        column: Int,
    ): Int = atk_table_get_column_extent_at(atkTablePointer.reinterpret(), row, column)

    /**
     * Gets the column header of a specified column in an accessible table.
     *
     * @param column a #gint representing a column in the table
     * @return a AtkObject* representing the
     * specified column header, or null if value does not implement this
     * interface.
     */
    public fun getColumnHeader(column: Int): Object? =
        atk_table_get_column_header(atkTablePointer.reinterpret(), column)?.run {
            Object(reinterpret())
        }

    /**
     * Gets a #gint representing the index at the specified @row and
     * @column.
     *
     * @param row a #gint representing a row in @table
     * @param column a #gint representing a column in @table
     * @return a #gint representing the index at specified position.
     * The value -1 is returned if the object at row,column is not a child
     * of table or table does not implement this interface.
     */
    public fun getIndexAt(
        row: Int,
        column: Int,
    ): Int = atk_table_get_index_at(atkTablePointer.reinterpret(), row, column)

    /**
     * Gets the number of columns in the table.
     *
     * @return a gint representing the number of columns, or 0
     * if value does not implement this interface.
     */
    public fun getNColumns(): Int = atk_table_get_n_columns(atkTablePointer.reinterpret())

    /**
     * Gets the number of rows in the table.
     *
     * @return a gint representing the number of rows, or 0
     * if value does not implement this interface.
     */
    public fun getNRows(): Int = atk_table_get_n_rows(atkTablePointer.reinterpret())

    /**
     * Gets a #gint representing the row at the specified @index_.
     *
     * @param index a #gint representing an index in @table
     * @return a gint representing the row at the specified index,
     * or -1 if the table does not implement this method.
     */
    public fun getRowAtIndex(index: Int): Int = atk_table_get_row_at_index(atkTablePointer.reinterpret(), index)

    /**
     * Gets the description text of the specified row in the table
     *
     * @param row a #gint representing a row in @table
     * @return a gchar* representing the row description, or
     * null if value does not implement this interface.
     */
    public fun getRowDescription(row: Int): String? =
        atk_table_get_row_description(atkTablePointer.reinterpret(), row)?.toKString()

    /**
     * Gets the number of rows occupied by the accessible object
     * at a specified @row and @column in the @table.
     *
     * @param row a #gint representing a row in @table
     * @param column a #gint representing a column in @table
     * @return a gint representing the row extent at specified position, or 0
     * if value does not implement this interface.
     */
    public fun getRowExtentAt(
        row: Int,
        column: Int,
    ): Int = atk_table_get_row_extent_at(atkTablePointer.reinterpret(), row, column)

    /**
     * Gets the row header of a specified row in an accessible table.
     *
     * @param row a #gint representing a row in the table
     * @return a AtkObject* representing the
     * specified row header, or null if value does not implement this
     * interface.
     */
    public fun getRowHeader(row: Int): Object? =
        atk_table_get_row_header(atkTablePointer.reinterpret(), row)?.run {
            Object(reinterpret())
        }

    /**
     * Gets the summary description of the table.
     *
     * @return a AtkObject* representing a summary description
     * of the table, or zero if value does not implement this interface.
     */
    public fun getSummary(): Object =
        atk_table_get_summary(atkTablePointer.reinterpret())!!.run {
            Object(reinterpret())
        }

    /**
     * Gets a boolean value indicating whether the specified @column
     * is selected
     *
     * @param column a #gint representing a column in @table
     * @return a gboolean representing if the column is selected, or 0
     * if value does not implement this interface.
     */
    public fun isColumnSelected(column: Int): Boolean =
        atk_table_is_column_selected(atkTablePointer.reinterpret(), column).asBoolean()

    /**
     * Gets a boolean value indicating whether the specified @row
     * is selected
     *
     * @param row a #gint representing a row in @table
     * @return a gboolean representing if the row is selected, or 0
     * if value does not implement this interface.
     */
    public fun isRowSelected(row: Int): Boolean =
        atk_table_is_row_selected(atkTablePointer.reinterpret(), row).asBoolean()

    /**
     * Gets a boolean value indicating whether the accessible object
     * at the specified @row and @column is selected
     *
     * @param row a #gint representing a row in @table
     * @param column a #gint representing a column in @table
     * @return a gboolean representing if the cell is selected, or 0
     * if value does not implement this interface.
     */
    public fun isSelected(
        row: Int,
        column: Int,
    ): Boolean = atk_table_is_selected(atkTablePointer.reinterpret(), row, column).asBoolean()

    /**
     * Get a reference to the table cell at @row, @column. This cell
     * should implement the interface #AtkTableCell
     *
     * @param row a #gint representing a row in @table
     * @param column a #gint representing a column in @table
     * @return an #AtkObject representing the referred
     * to accessible
     */
    public fun refAt(
        row: Int,
        column: Int,
    ): Object =
        atk_table_ref_at(atkTablePointer.reinterpret(), row, column)!!.run {
            Object(reinterpret())
        }

    /**
     * Adds the specified @column to the selection.
     *
     * @param column a #gint representing a column in @table
     * @return a gboolean representing if the column was successfully removed from
     * the selection, or 0 if value does not implement this interface.
     */
    public fun removeColumnSelection(column: Int): Boolean =
        atk_table_remove_column_selection(atkTablePointer.reinterpret(), column).asBoolean()

    /**
     * Removes the specified @row from the selection.
     *
     * @param row a #gint representing a row in @table
     * @return a gboolean representing if the row was successfully removed from
     * the selection, or 0 if value does not implement this interface.
     */
    public fun removeRowSelection(row: Int): Boolean =
        atk_table_remove_row_selection(atkTablePointer.reinterpret(), row).asBoolean()

    /**
     * Sets the caption for the table.
     *
     * @param caption a #AtkObject representing the caption to set for @table
     */
    public fun setCaption(caption: Object): Unit =
        atk_table_set_caption(atkTablePointer.reinterpret(), caption.atkObjectPointer.reinterpret())

    /**
     * Sets the description text for the specified @column of the @table.
     *
     * @param column a #gint representing a column in @table
     * @param description a #gchar representing the description text
     * to set for the specified @column of the @table
     */
    public fun setColumnDescription(
        column: Int,
        description: String,
    ): Unit = atk_table_set_column_description(atkTablePointer.reinterpret(), column, description)

    /**
     * Sets the specified column header to @header.
     *
     * @param column a #gint representing a column in @table
     * @param header an #AtkTable
     */
    public fun setColumnHeader(
        column: Int,
        `header`: Object,
    ): Unit =
        atk_table_set_column_header(atkTablePointer.reinterpret(), column, `header`.atkObjectPointer.reinterpret())

    /**
     * Sets the description text for the specified @row of @table.
     *
     * @param row a #gint representing a row in @table
     * @param description a #gchar representing the description text
     * to set for the specified @row of @table
     */
    public fun setRowDescription(
        row: Int,
        description: String,
    ): Unit = atk_table_set_row_description(atkTablePointer.reinterpret(), row, description)

    /**
     * Sets the specified row header to @header.
     *
     * @param row a #gint representing a row in @table
     * @param header an #AtkTable
     */
    public fun setRowHeader(
        row: Int,
        `header`: Object,
    ): Unit = atk_table_set_row_header(atkTablePointer.reinterpret(), row, `header`.atkObjectPointer.reinterpret())

    /**
     * Sets the summary description of the table.
     *
     * @param accessible an #AtkObject representing the summary description
     * to set for @table
     */
    public fun setSummary(accessible: Object): Unit =
        atk_table_set_summary(atkTablePointer.reinterpret(), accessible.atkObjectPointer.reinterpret())

    /**
     * The "column-deleted" signal is emitted by an object which
     * implements the AtkTable interface when a column is deleted.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `arg1` The index of the first column deleted.; `arg2` The number of columns deleted.
     */
    public fun connectColumnDeleted(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (arg1: Int, arg2: Int) -> Unit,
    ): ULong =
        g_signal_connect_data(
            atkTablePointer.reinterpret(),
            "column-deleted",
            connectColumnDeletedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The "column-inserted" signal is emitted by an object which
     * implements the AtkTable interface when a column is inserted.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `arg1` The index of the column inserted.; `arg2` The number of colums inserted.
     */
    public fun connectColumnInserted(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (arg1: Int, arg2: Int) -> Unit,
    ): ULong =
        g_signal_connect_data(
            atkTablePointer.reinterpret(),
            "column-inserted",
            connectColumnInsertedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The "column-reordered" signal is emitted by an object which
     * implements the AtkTable interface when the columns are
     * reordered.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectColumnReordered(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            atkTablePointer.reinterpret(),
            "column-reordered",
            connectColumnReorderedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The "model-changed" signal is emitted by an object which
     * implements the AtkTable interface when the model displayed by
     * the table changes.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectModelChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            atkTablePointer.reinterpret(),
            "model-changed",
            connectModelChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The "row-deleted" signal is emitted by an object which
     * implements the AtkTable interface when a row is deleted.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `arg1` The index of the first row deleted.; `arg2` The number of rows deleted.
     */
    public fun connectRowDeleted(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (arg1: Int, arg2: Int) -> Unit,
    ): ULong =
        g_signal_connect_data(
            atkTablePointer.reinterpret(),
            "row-deleted",
            connectRowDeletedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The "row-inserted" signal is emitted by an object which
     * implements the AtkTable interface when a row is inserted.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `arg1` The index of the first row inserted.; `arg2` The number of rows inserted.
     */
    public fun connectRowInserted(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (arg1: Int, arg2: Int) -> Unit,
    ): ULong =
        g_signal_connect_data(
            atkTablePointer.reinterpret(),
            "row-inserted",
            connectRowInsertedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The "row-reordered" signal is emitted by an object which
     * implements the AtkTable interface when the rows are
     * reordered.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectRowReordered(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            atkTablePointer.reinterpret(),
            "row-reordered",
            connectRowReorderedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    private data class Wrapper(
        private val pointer: CPointer<AtkTable>,
    ) : Table {
        override val atkTablePointer: CPointer<AtkTable> = pointer
    }

    public companion object : TypeCompanion<Table> {
        override val type: GeneratedInterfaceKGType<Table> =
            GeneratedInterfaceKGType(atk_table_get_type()) { Wrapper(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<AtkTable>): Table = Wrapper(pointer)
    }
}

private val connectColumnDeletedFunc: CPointer<CFunction<(Int, Int) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            arg1: Int,
            arg2: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(arg1: Int, arg2: Int) -> Unit>().get().invoke(arg1, arg2)
    }.reinterpret()

private val connectColumnInsertedFunc: CPointer<CFunction<(Int, Int) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            arg1: Int,
            arg2: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(arg1: Int, arg2: Int) -> Unit>().get().invoke(arg1, arg2)
    }.reinterpret()

private val connectColumnReorderedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectModelChangedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectRowDeletedFunc: CPointer<CFunction<(Int, Int) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            arg1: Int,
            arg2: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(arg1: Int, arg2: Int) -> Unit>().get().invoke(arg1, arg2)
    }.reinterpret()

private val connectRowInsertedFunc: CPointer<CFunction<(Int, Int) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            arg1: Int,
            arg2: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(arg1: Int, arg2: Int) -> Unit>().get().invoke(arg1, arg2)
    }.reinterpret()

private val connectRowReorderedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()
