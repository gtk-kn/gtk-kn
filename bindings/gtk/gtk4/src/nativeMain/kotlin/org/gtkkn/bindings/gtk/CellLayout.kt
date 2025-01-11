// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkCellLayout
import org.gtkkn.native.gtk.gtk_cell_layout_add_attribute
import org.gtkkn.native.gtk.gtk_cell_layout_clear
import org.gtkkn.native.gtk.gtk_cell_layout_clear_attributes
import org.gtkkn.native.gtk.gtk_cell_layout_get_area
import org.gtkkn.native.gtk.gtk_cell_layout_get_cells
import org.gtkkn.native.gtk.gtk_cell_layout_get_type
import org.gtkkn.native.gtk.gtk_cell_layout_pack_end
import org.gtkkn.native.gtk.gtk_cell_layout_pack_start
import org.gtkkn.native.gtk.gtk_cell_layout_reorder
import org.gtkkn.native.gtk.gtk_cell_layout_set_cell_data_func
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * An interface for packing cells
 *
 * `GtkCellLayout` is an interface to be implemented by all objects which
 * want to provide a `GtkTreeViewColumn` like API for packing cells,
 * setting attributes and data funcs.
 *
 * One of the notable features provided by implementations of
 * `GtkCellLayout` are attributes. Attributes let you set the properties
 * in flexible ways. They can just be set to constant values like regular
 * properties. But they can also be mapped to a column of the underlying
 * tree model with gtk_cell_layout_set_attributes(), which means that the value
 * of the attribute can change from cell to cell as they are rendered by
 * the cell renderer. Finally, it is possible to specify a function with
 * gtk_cell_layout_set_cell_data_func() that is called to determine the
 * value of the attribute for each cell that is rendered.
 *
 * ## GtkCellLayouts as GtkBuildable
 *
 * Implementations of GtkCellLayout which also implement the GtkBuildable
 * interface (`GtkCellView`, `GtkIconView`, `GtkComboBox`,
 * `GtkEntryCompletion`, `GtkTreeViewColumn`) accept `GtkCellRenderer` objects
 * as `<child>` elements in UI definitions. They support a custom `<attributes>`
 * element for their children, which can contain multiple `<attribute>`
 * elements. Each `<attribute>` element has a name attribute which specifies
 * a property of the cell renderer; the content of the element is the
 * attribute value.
 *
 * This is an example of a UI definition fragment specifying attributes:
 *
 * ```xml
 * <object class="GtkCellView">
 *   <child>
 *     <object class="GtkCellRendererText"/>
 *     <attributes>
 *       <attribute name="text">0</attribute>
 *     </attributes>
 *   </child>
 * </object>
 * ```
 *
 * Furthermore for implementations of `GtkCellLayout` that use a `GtkCellArea`
 * to lay out cells (all `GtkCellLayout`s in GTK use a `GtkCellArea`)
 * [cell properties](class.CellArea.html#cell-properties) can also be defined
 * in the format by specifying the custom `<cell-packing>` attribute which can
 * contain multiple `<property>` elements.
 *
 * Here is a UI definition fragment specifying cell properties:
 *
 * ```xml
 * <object class="GtkTreeViewColumn">
 *   <child>
 *     <object class="GtkCellRendererText"/>
 *     <cell-packing>
 *       <property name="align">True</property>
 *       <property name="expand">False</property>
 *     </cell-packing>
 *   </child>
 * </object>
 * ```
 *
 * ## Subclassing GtkCellLayout implementations
 *
 * When subclassing a widget that implements `GtkCellLayout` like
 * `GtkIconView` or `GtkComboBox`, there are some considerations related
 * to the fact that these widgets internally use a `GtkCellArea`.
 * The cell area is exposed as a construct-only property by these
 * widgets. This means that it is possible to e.g. do
 *
 * ```c
 * GtkWIdget *combo =
 *   g_object_new (GTK_TYPE_COMBO_BOX, "cell-area", my_cell_area, NULL);
 * ```
 *
 * to use a custom cell area with a combo box. But construct properties
 * are only initialized after instance `init()`
 * functions have run, which means that using functions which rely on
 * the existence of the cell area in your subclass `init()` function will
 * cause the default cell area to be instantiated. In this case, a provided
 * construct property value will be ignored (with a warning, to alert
 * you to the problem).
 *
 * ```c
 * static void
 * my_combo_box_init (MyComboBox *b)
 * {
 *   GtkCellRenderer *cell;
 *
 *   cell = gtk_cell_renderer_pixbuf_new ();
 *
 *   // The following call causes the default cell area for combo boxes,
 *   // a GtkCellAreaBox, to be instantiated
 *   gtk_cell_layout_pack_start (GTK_CELL_LAYOUT (b), cell, FALSE);
 *   ...
 * }
 *
 * GtkWidget *
 * my_combo_box_new (GtkCellArea *area)
 * {
 *   // This call is going to cause a warning about area being ignored
 *   return g_object_new (MY_TYPE_COMBO_BOX, "cell-area", area, NULL);
 * }
 * ```
 *
 * If supporting alternative cell areas with your derived widget is
 * not important, then this does not have to concern you. If you want
 * to support alternative cell areas, you can do so by moving the
 * problematic calls out of `init()` and into a `constructor()`
 * for your class.
 *
 * ## Skipped during bindings generation
 *
 * - method `set_attributes`: Varargs parameter is not supported
 */
public interface CellLayout :
    Proxy,
    KGTyped {
    public val gtkCellLayoutPointer: CPointer<GtkCellLayout>

    /**
     * Adds an attribute mapping to the list in @cell_layout.
     *
     * The @column is the column of the model to get a value from, and the
     * @attribute is the property on @cell to be set from that value. So for
     * example if column 2 of the model contains strings, you could have the
     * “text” attribute of a `GtkCellRendererText` get its values from column 2.
     * In this context "attribute" and "property" are used interchangeably.
     *
     * @param cell a `GtkCellRenderer`
     * @param attribute a property on the renderer
     * @param column the column position on the model to get the attribute from
     */
    public fun addAttribute(cell: CellRenderer, attribute: String, column: gint): Unit =
        gtk_cell_layout_add_attribute(gtkCellLayoutPointer, cell.gtkCellRendererPointer, attribute, column)

    /**
     * Unsets all the mappings on all renderers on @cell_layout and
     * removes all renderers from @cell_layout.
     */
    public fun clear(): Unit = gtk_cell_layout_clear(gtkCellLayoutPointer)

    /**
     * Clears all existing attributes previously set with
     * gtk_cell_layout_set_attributes().
     *
     * @param cell a `GtkCellRenderer` to clear the attribute mapping on
     */
    public fun clearAttributes(cell: CellRenderer): Unit =
        gtk_cell_layout_clear_attributes(gtkCellLayoutPointer, cell.gtkCellRendererPointer)

    /**
     * Returns the underlying `GtkCellArea` which might be @cell_layout
     * if called on a `GtkCellArea` or might be null if no `GtkCellArea`
     * is used by @cell_layout.
     *
     * @return the cell area used by @cell_layout
     */
    public fun getArea(): CellArea? = gtk_cell_layout_get_area(gtkCellLayoutPointer)?.run {
        CellArea.CellAreaImpl(this)
    }

    /**
     * Returns the cell renderers which have been added to @cell_layout.
     *
     * @return a list of cell renderers. The list, but not the renderers has
     *   been newly allocated and should be freed with g_list_free()
     *   when no longer needed.
     */
    public fun getCells(): List = gtk_cell_layout_get_cells(gtkCellLayoutPointer)!!.run {
        List(this)
    }

    /**
     * Adds the @cell to the end of @cell_layout. If @expand is false, then the
     * @cell is allocated no more space than it needs. Any unused space is
     * divided evenly between cells for which @expand is true.
     *
     * Note that reusing the same cell renderer is not supported.
     *
     * @param cell a `GtkCellRenderer`
     * @param expand true if @cell is to be given extra space allocated to @cell_layout
     */
    public fun packEnd(cell: CellRenderer, expand: Boolean): Unit =
        gtk_cell_layout_pack_end(gtkCellLayoutPointer, cell.gtkCellRendererPointer, expand.asGBoolean())

    /**
     * Packs the @cell into the beginning of @cell_layout. If @expand is false,
     * then the @cell is allocated no more space than it needs. Any unused space
     * is divided evenly between cells for which @expand is true.
     *
     * Note that reusing the same cell renderer is not supported.
     *
     * @param cell a `GtkCellRenderer`
     * @param expand true if @cell is to be given extra space allocated to @cell_layout
     */
    public fun packStart(cell: CellRenderer, expand: Boolean): Unit =
        gtk_cell_layout_pack_start(gtkCellLayoutPointer, cell.gtkCellRendererPointer, expand.asGBoolean())

    /**
     * Re-inserts @cell at @position.
     *
     * Note that @cell has already to be packed into @cell_layout
     * for this to function properly.
     *
     * @param cell a `GtkCellRenderer` to reorder
     * @param position new position to insert @cell at
     */
    public fun reorder(cell: CellRenderer, position: gint): Unit =
        gtk_cell_layout_reorder(gtkCellLayoutPointer, cell.gtkCellRendererPointer, position)

    /**
     * Sets the `GtkCellLayout`DataFunc to use for @cell_layout.
     *
     * This function is used instead of the standard attributes mapping
     * for setting the column value, and should set the value of @cell_layout’s
     * cell renderer(s) as appropriate.
     *
     * @func may be null to remove a previously set function.
     *
     * @param cell a `GtkCellRenderer`
     * @param func the `GtkCellLayout`DataFunc to use
     */
    public fun setCellDataFunc(cell: CellRenderer, func: CellLayoutDataFunc?): Unit =
        gtk_cell_layout_set_cell_data_func(
            gtkCellLayoutPointer,
            cell.gtkCellRendererPointer,
            func?.let {
                CellLayoutDataFuncFunc.reinterpret()
            },
            func?.let { StableRef.create(func).asCPointer() },
            func?.let { staticStableRefDestroy.reinterpret() }
        )

    /**
     * The CellLayoutImpl type represents a native instance of the CellLayout interface.
     *
     * @constructor Creates a new instance of CellLayout for the provided [CPointer].
     */
    public data class CellLayoutImpl(override val gtkCellLayoutPointer: CPointer<GtkCellLayout>) :
        Object(gtkCellLayoutPointer.reinterpret()),
        CellLayout

    public companion object : TypeCompanion<CellLayout> {
        override val type: GeneratedInterfaceKGType<CellLayout> =
            GeneratedInterfaceKGType(gtk_cell_layout_get_type()) { CellLayoutImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of CellLayout
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_cell_layout_get_type()
    }
}
