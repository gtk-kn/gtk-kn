// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gobject.guint
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkGrid
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.gtk_grid_attach
import org.gtkkn.native.gtk.gtk_grid_attach_next_to
import org.gtkkn.native.gtk.gtk_grid_get_baseline_row
import org.gtkkn.native.gtk.gtk_grid_get_child_at
import org.gtkkn.native.gtk.gtk_grid_get_column_homogeneous
import org.gtkkn.native.gtk.gtk_grid_get_column_spacing
import org.gtkkn.native.gtk.gtk_grid_get_row_baseline_position
import org.gtkkn.native.gtk.gtk_grid_get_row_homogeneous
import org.gtkkn.native.gtk.gtk_grid_get_row_spacing
import org.gtkkn.native.gtk.gtk_grid_get_type
import org.gtkkn.native.gtk.gtk_grid_insert_column
import org.gtkkn.native.gtk.gtk_grid_insert_next_to
import org.gtkkn.native.gtk.gtk_grid_insert_row
import org.gtkkn.native.gtk.gtk_grid_new
import org.gtkkn.native.gtk.gtk_grid_remove
import org.gtkkn.native.gtk.gtk_grid_remove_column
import org.gtkkn.native.gtk.gtk_grid_remove_row
import org.gtkkn.native.gtk.gtk_grid_set_baseline_row
import org.gtkkn.native.gtk.gtk_grid_set_column_homogeneous
import org.gtkkn.native.gtk.gtk_grid_set_column_spacing
import org.gtkkn.native.gtk.gtk_grid_set_row_baseline_position
import org.gtkkn.native.gtk.gtk_grid_set_row_homogeneous
import org.gtkkn.native.gtk.gtk_grid_set_row_spacing
import kotlin.Boolean
import kotlin.Unit

/**
 * `GtkGrid` is a container which arranges its child widgets in
 * rows and columns.
 *
 * ![An example GtkGrid](grid.png)
 *
 * It supports arbitrary positions and horizontal/vertical spans.
 *
 * Children are added using [method@Gtk.Grid.attach]. They can span multiple
 * rows or columns. It is also possible to add a child next to an existing
 * child, using [method@Gtk.Grid.attach_next_to]. To remove a child from the
 * grid, use [method@Gtk.Grid.remove].
 *
 * The behaviour of `GtkGrid` when several children occupy the same grid
 * cell is undefined.
 *
 * # GtkGrid as GtkBuildable
 *
 * Every child in a `GtkGrid` has access to a custom [iface@Gtk.Buildable]
 * element, called `<layout>`. It can by used to specify a position in the
 * grid and optionally spans. All properties that can be used in the `<layout>`
 * element are implemented by [class@Gtk.GridLayoutChild].
 *
 * It is implemented by `GtkWidget` using [class@Gtk.LayoutManager].
 *
 * To showcase it, here is a simple example:
 *
 * ```xml
 * <object class="GtkGrid" id="my_grid">
 *   <child>
 *     <object class="GtkButton" id="button1">
 *       <property name="label">Button 1</property>
 *       <layout>
 *         <property name="column">0</property>
 *         <property name="row">0</property>
 *       </layout>
 *     </object>
 *   </child>
 *   <child>
 *     <object class="GtkButton" id="button2">
 *       <property name="label">Button 2</property>
 *       <layout>
 *         <property name="column">1</property>
 *         <property name="row">0</property>
 *       </layout>
 *     </object>
 *   </child>
 *   <child>
 *     <object class="GtkButton" id="button3">
 *       <property name="label">Button 3</property>
 *       <layout>
 *         <property name="column">2</property>
 *         <property name="row">0</property>
 *         <property name="row-span">2</property>
 *       </layout>
 *     </object>
 *   </child>
 *   <child>
 *     <object class="GtkButton" id="button4">
 *       <property name="label">Button 4</property>
 *       <layout>
 *         <property name="column">0</property>
 *         <property name="row">1</property>
 *         <property name="column-span">2</property>
 *       </layout>
 *     </object>
 *   </child>
 * </object>
 * ```
 *
 * It organizes the first two buttons side-by-side in one cell each.
 * The third button is in the last column but spans across two rows.
 * This is defined by the `row-span` property. The last button is
 * located in the second row and spans across two columns, which is
 * defined by the `column-span` property.
 *
 * # CSS nodes
 *
 * `GtkGrid` uses a single CSS node with name `grid`.
 *
 * # Accessibility
 *
 * Until GTK 4.10, `GtkGrid` used the `GTK_ACCESSIBLE_ROLE_GROUP` role.
 *
 * Starting from GTK 4.12, `GtkGrid` uses the `GTK_ACCESSIBLE_ROLE_GENERIC` role.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `column`: column: Out parameter is not supported
 */
public open class Grid(pointer: CPointer<GtkGrid>) :
    Widget(pointer.reinterpret()),
    Orientable,
    KGTyped {
    public val gtkGridPointer: CPointer<GtkGrid>
        get() = gPointer.reinterpret()

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The row to align to the baseline when valign is using baseline alignment.
     */
    public open var baselineRow: gint
        /**
         * Returns which row defines the global baseline of @grid.
         *
         * @return the row index defining the global baseline
         */
        get() = gtk_grid_get_baseline_row(gtkGridPointer.reinterpret())

        /**
         * Sets which row defines the global baseline for the entire grid.
         *
         * Each row in the grid can have its own local baseline, but only
         * one of those is global, meaning it will be the baseline in the
         * parent of the @grid.
         *
         * @param row the row index
         */
        set(row) = gtk_grid_set_baseline_row(gtkGridPointer.reinterpret(), row)

    /**
     * If true, the columns are all the same width.
     */
    public open var columnHomogeneous: Boolean
        /**
         * Returns whether all columns of @grid have the same width.
         *
         * @return whether all columns of @grid have the same width.
         */
        get() = gtk_grid_get_column_homogeneous(gtkGridPointer.reinterpret()).asBoolean()

        /**
         * Sets whether all columns of @grid will have the same width.
         *
         * @param homogeneous true to make columns homogeneous
         */
        set(homogeneous) = gtk_grid_set_column_homogeneous(gtkGridPointer.reinterpret(), homogeneous.asGBoolean())

    /**
     * The amount of space between two consecutive columns.
     */
    public open var columnSpacing: guint
        /**
         * Returns the amount of space between the columns of @grid.
         *
         * @return the column spacing of @grid
         */
        get() = gtk_grid_get_column_spacing(gtkGridPointer.reinterpret())

        /**
         * Sets the amount of space between columns of @grid.
         *
         * @param spacing the amount of space to insert between columns
         */
        set(spacing) = gtk_grid_set_column_spacing(gtkGridPointer.reinterpret(), spacing)

    /**
     * If true, the rows are all the same height.
     */
    public open var rowHomogeneous: Boolean
        /**
         * Returns whether all rows of @grid have the same height.
         *
         * @return whether all rows of @grid have the same height.
         */
        get() = gtk_grid_get_row_homogeneous(gtkGridPointer.reinterpret()).asBoolean()

        /**
         * Sets whether all rows of @grid will have the same height.
         *
         * @param homogeneous true to make rows homogeneous
         */
        set(homogeneous) = gtk_grid_set_row_homogeneous(gtkGridPointer.reinterpret(), homogeneous.asGBoolean())

    /**
     * The amount of space between two consecutive rows.
     */
    public open var rowSpacing: guint
        /**
         * Returns the amount of space between the rows of @grid.
         *
         * @return the row spacing of @grid
         */
        get() = gtk_grid_get_row_spacing(gtkGridPointer.reinterpret())

        /**
         * Sets the amount of space between rows of @grid.
         *
         * @param spacing the amount of space to insert between rows
         */
        set(spacing) = gtk_grid_set_row_spacing(gtkGridPointer.reinterpret(), spacing)

    /**
     * Creates a new grid widget.
     *
     * @return the new `GtkGrid`
     */
    public constructor() : this(gtk_grid_new()!!.reinterpret())

    /**
     * Adds a widget to the grid.
     *
     * The position of @child is determined by @column and @row.
     * The number of “cells” that @child will occupy is determined
     * by @width and @height.
     *
     * @param child the widget to add
     * @param column the column number to attach the left side of @child to
     * @param row the row number to attach the top side of @child to
     * @param width the number of columns that @child will span
     * @param height the number of rows that @child will span
     */
    public open fun attach(child: Widget, column: gint, row: gint, width: gint, height: gint): Unit =
        gtk_grid_attach(gtkGridPointer.reinterpret(), child.gtkWidgetPointer.reinterpret(), column, row, width, height)

    /**
     * Adds a widget to the grid.
     *
     * The widget is placed next to @sibling, on the side determined by
     * @side. When @sibling is null, the widget is placed in row (for
     * left or right placement) or column 0 (for top or bottom placement),
     * at the end indicated by @side.
     *
     * Attaching widgets labeled `[1]`, `[2]`, `[3]` with `@sibling == null` and
     * `@side == %GTK_POS_LEFT` yields a layout of `[3][2][1]`.
     *
     * @param child the widget to add
     * @param sibling the child of @grid that @child will be placed
     *   next to, or null to place @child at the beginning or end
     * @param side the side of @sibling that @child is positioned next to
     * @param width the number of columns that @child will span
     * @param height the number of rows that @child will span
     */
    public open fun attachNextTo(
        child: Widget,
        sibling: Widget? = null,
        side: PositionType,
        width: gint,
        height: gint,
    ): Unit = gtk_grid_attach_next_to(
        gtkGridPointer.reinterpret(),
        child.gtkWidgetPointer.reinterpret(),
        sibling?.gtkWidgetPointer?.reinterpret(),
        side.nativeValue,
        width,
        height
    )

    /**
     * Gets the child of @grid whose area covers the grid
     * cell at @column, @row.
     *
     * @param column the left edge of the cell
     * @param row the top edge of the cell
     * @return the child at the given position
     */
    public open fun getChildAt(column: gint, row: gint): Widget? =
        gtk_grid_get_child_at(gtkGridPointer.reinterpret(), column, row)?.run {
            Widget(reinterpret())
        }

    /**
     * Returns the baseline position of @row.
     *
     * See [method@Gtk.Grid.set_row_baseline_position].
     *
     * @param row a row index
     * @return the baseline position of @row
     */
    public open fun getRowBaselinePosition(row: gint): BaselinePosition =
        gtk_grid_get_row_baseline_position(gtkGridPointer.reinterpret(), row).run {
            BaselinePosition.fromNativeValue(this)
        }

    /**
     * Inserts a column at the specified position.
     *
     * Children which are attached at or to the right of this position
     * are moved one column to the right. Children which span across this
     * position are grown to span the new column.
     *
     * @param position the position to insert the column at
     */
    public open fun insertColumn(position: gint): Unit = gtk_grid_insert_column(gtkGridPointer.reinterpret(), position)

    /**
     * Inserts a row or column at the specified position.
     *
     * The new row or column is placed next to @sibling, on the side
     * determined by @side. If @side is %GTK_POS_TOP or %GTK_POS_BOTTOM,
     * a row is inserted. If @side is %GTK_POS_LEFT of %GTK_POS_RIGHT,
     * a column is inserted.
     *
     * @param sibling the child of @grid that the new row or column will be
     *   placed next to
     * @param side the side of @sibling that @child is positioned next to
     */
    public open fun insertNextTo(sibling: Widget, side: PositionType): Unit =
        gtk_grid_insert_next_to(gtkGridPointer.reinterpret(), sibling.gtkWidgetPointer.reinterpret(), side.nativeValue)

    /**
     * Inserts a row at the specified position.
     *
     * Children which are attached at or below this position
     * are moved one row down. Children which span across this
     * position are grown to span the new row.
     *
     * @param position the position to insert the row at
     */
    public open fun insertRow(position: gint): Unit = gtk_grid_insert_row(gtkGridPointer.reinterpret(), position)

    /**
     * Removes a child from @grid.
     *
     * The child must have been added with
     * [method@Gtk.Grid.attach] or [method@Gtk.Grid.attach_next_to].
     *
     * @param child the child widget to remove
     */
    public open fun remove(child: Widget): Unit =
        gtk_grid_remove(gtkGridPointer.reinterpret(), child.gtkWidgetPointer.reinterpret())

    /**
     * Removes a column from the grid.
     *
     * Children that are placed in this column are removed,
     * spanning children that overlap this column have their
     * width reduced by one, and children after the column
     * are moved to the left.
     *
     * @param position the position of the column to remove
     */
    public open fun removeColumn(position: gint): Unit = gtk_grid_remove_column(gtkGridPointer.reinterpret(), position)

    /**
     * Removes a row from the grid.
     *
     * Children that are placed in this row are removed,
     * spanning children that overlap this row have their
     * height reduced by one, and children below the row
     * are moved up.
     *
     * @param position the position of the row to remove
     */
    public open fun removeRow(position: gint): Unit = gtk_grid_remove_row(gtkGridPointer.reinterpret(), position)

    /**
     * Sets how the baseline should be positioned on @row of the
     * grid, in case that row is assigned more space than is requested.
     *
     * The default baseline position is %GTK_BASELINE_POSITION_CENTER.
     *
     * @param row a row index
     * @param pos a `GtkBaselinePosition`
     */
    public open fun setRowBaselinePosition(row: gint, pos: BaselinePosition): Unit =
        gtk_grid_set_row_baseline_position(gtkGridPointer.reinterpret(), row, pos.nativeValue)

    public companion object : TypeCompanion<Grid> {
        override val type: GeneratedClassKGType<Grid> =
            GeneratedClassKGType(gtk_grid_get_type()) { Grid(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Grid
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_grid_get_type()
    }
}
