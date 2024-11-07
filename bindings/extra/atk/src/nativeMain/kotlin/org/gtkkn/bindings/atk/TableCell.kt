// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.atk.annotations.AtkVersion2_12
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkTableCell
import org.gtkkn.native.atk.atk_table_cell_get_column_span
import org.gtkkn.native.atk.atk_table_cell_get_row_span
import org.gtkkn.native.atk.atk_table_cell_get_table
import org.gtkkn.native.atk.atk_table_cell_get_type
import kotlin.Int

/**
 * The ATK interface implemented for a cell inside a two-dimentional #AtkTable
 *
 * Being #AtkTable a component which present elements ordered via rows
 * and columns, an #AtkTableCell is the interface which each of those
 * elements, so "cells" should implement.
 *
 * See [iface@AtkTable]
 *
 * ## Skipped during bindings generation
 *
 * - method `get_column_header_cells`: Array parameter of type Object is not supported
 * - parameter `row`: row: Out parameter is not supported
 * - parameter `row`: row: Out parameter is not supported
 * - method `get_row_header_cells`: Array parameter of type Object is not supported
 */
public interface TableCell :
    Interface,
    KGTyped {
    public val atkTableCellPointer: CPointer<AtkTableCell>

    /**
     * Returns the number of columns occupied by this cell accessible.
     *
     * @return a gint representing the number of columns occupied by this cell,
     * or 0 if the cell does not implement this method.
     * @since 2.12
     */
    @AtkVersion2_12
    public fun getColumnSpan(): Int = atk_table_cell_get_column_span(atkTableCellPointer.reinterpret())

    /**
     * Returns the number of rows occupied by this cell accessible.
     *
     * @return a gint representing the number of rows occupied by this cell,
     * or 0 if the cell does not implement this method.
     * @since 2.12
     */
    @AtkVersion2_12
    public fun getRowSpan(): Int = atk_table_cell_get_row_span(atkTableCellPointer.reinterpret())

    /**
     * Returns a reference to the accessible of the containing table.
     *
     * @return the atk object for the containing table.
     * @since 2.12
     */
    @AtkVersion2_12
    public fun getTable(): Object =
        atk_table_cell_get_table(atkTableCellPointer.reinterpret())!!.run {
            Object(reinterpret())
        }

    private data class Wrapper(
        private val pointer: CPointer<AtkTableCell>,
    ) : TableCell {
        override val atkTableCellPointer: CPointer<AtkTableCell> = pointer
    }

    public companion object : TypeCompanion<TableCell> {
        override val type: GeneratedInterfaceKGType<TableCell> =
            GeneratedInterfaceKGType(atk_table_cell_get_type()) { Wrapper(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<AtkTableCell>): TableCell = Wrapper(pointer)
    }
}
