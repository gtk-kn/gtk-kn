// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_10
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkColumnViewSorter
import org.gtkkn.native.gtk.gtk_column_view_sorter_get_n_sort_columns
import org.gtkkn.native.gtk.gtk_column_view_sorter_get_primary_sort_column
import org.gtkkn.native.gtk.gtk_column_view_sorter_get_primary_sort_order
import org.gtkkn.native.gtk.gtk_column_view_sorter_get_type
import kotlin.UInt

/**
 * `GtkColumnViewSorter` is a sorter implementation that
 * is geared towards the needs of `GtkColumnView`.
 *
 * The sorter returned by [method@Gtk.ColumnView.get_sorter] is
 * a `GtkColumnViewSorter`.
 *
 * In column views, sorting can be configured by associating
 * sorters with columns, and users can invert sort order by clicking
 * on column headers. The API of `GtkColumnViewSorter` is designed
 * to allow saving and restoring this configuration.
 *
 * If you are only interested in the primary sort column (i.e. the
 * column where a sort indicator is shown in the header), then
 * you can just look at [property@Gtk.ColumnViewSorter:primary-sort-column]
 * and [property@Gtk.ColumnViewSorter:primary-sort-order].
 *
 * If you want to store the full sort configuration, including
 * secondary sort columns that are used for tie breaking, then
 * you can use [method@Gtk.ColumnViewSorter.get_nth_sort_column].
 * To get notified about changes, use [signal@Gtk.Sorter::changed].
 *
 * To restore a saved sort configuration on a `GtkColumnView`,
 * use code like:
 *
 * ```
 * sorter = gtk_column_view_get_sorter (view);
 * for (i = gtk_column_view_sorter_get_n_sort_columns (sorter) - 1; i >= 0; i--)
 *   {
 *     column = gtk_column_view_sorter_get_nth_sort_column (sorter, i, &order);
 *     gtk_column_view_sort_by_column (view, column, order);
 *   }
 * ```
 *
 * ## Skipped during bindings generation
 *
 * - parameter `sort_order`: sort_order: Out parameter is not supported
 *
 * @since 4.10
 */
@GtkVersion4_10
public open class ColumnViewSorter(
    pointer: CPointer<GtkColumnViewSorter>,
) : Sorter(pointer.reinterpret()),
    KGTyped {
    public val gtkColumnViewSorterPointer: CPointer<GtkColumnViewSorter>
        get() = gPointer.reinterpret()

    /**
     * The primary sort column.
     *
     * The primary sort column is the one that displays the triangle
     * in a column view header.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open val primarySortColumn: ColumnViewColumn?
        /**
         * Returns the primary sort column.
         *
         * The primary sort column is the one that displays the triangle
         * in a column view header.
         *
         * @return the primary sort column
         * @since 4.10
         */
        get() =
            gtk_column_view_sorter_get_primary_sort_column(gtkColumnViewSorterPointer.reinterpret())?.run {
                ColumnViewColumn(reinterpret())
            }

    /**
     * The primary sort order.
     *
     * The primary sort order determines whether the triangle displayed
     * in the column view header of the primary sort column points upwards
     * or downwards.
     *
     * @since 4.10
     */
    @GtkVersion4_10
    public open val primarySortOrder: SortType
        /**
         * Returns the primary sort order.
         *
         * The primary sort order determines whether the triangle displayed
         * in the column view header of the primary sort column points upwards
         * or downwards.
         *
         * If there is no primary sort column, then this function returns
         * `GTK_SORT_ASCENDING`.
         *
         * @return the primary sort order
         * @since 4.10
         */
        get() =
            gtk_column_view_sorter_get_primary_sort_order(gtkColumnViewSorterPointer.reinterpret()).run {
                SortType.fromNativeValue(this)
            }

    /**
     * Returns the number of columns by which the sorter sorts.
     *
     * If the sorter of the primary sort column does not determine
     * a total order, then the secondary sorters are consulted to
     * break the ties.
     *
     * Use the [signal@Gtk.Sorter::changed] signal to get notified
     * when the number of sort columns changes.
     *
     * @return the number of sort columns
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun getNSortColumns(): UInt =
        gtk_column_view_sorter_get_n_sort_columns(gtkColumnViewSorterPointer.reinterpret())

    /**
     * Returns the primary sort column.
     *
     * The primary sort column is the one that displays the triangle
     * in a column view header.
     *
     * @return the primary sort column
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun getPrimarySortColumn(): ColumnViewColumn? =
        gtk_column_view_sorter_get_primary_sort_column(gtkColumnViewSorterPointer.reinterpret())?.run {
            ColumnViewColumn(reinterpret())
        }

    /**
     * Returns the primary sort order.
     *
     * The primary sort order determines whether the triangle displayed
     * in the column view header of the primary sort column points upwards
     * or downwards.
     *
     * If there is no primary sort column, then this function returns
     * `GTK_SORT_ASCENDING`.
     *
     * @return the primary sort order
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun getPrimarySortOrder(): SortType =
        gtk_column_view_sorter_get_primary_sort_order(gtkColumnViewSorterPointer.reinterpret()).run {
            SortType.fromNativeValue(this)
        }

    public companion object : TypeCompanion<ColumnViewSorter> {
        override val type: GeneratedClassKGType<ColumnViewSorter> =
            GeneratedClassKGType(gtk_column_view_sorter_get_type()) { ColumnViewSorter(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
