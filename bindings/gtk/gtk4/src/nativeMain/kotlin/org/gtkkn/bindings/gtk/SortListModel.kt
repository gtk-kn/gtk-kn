// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.gtk.GtkSortListModel
import org.gtkkn.native.gtk.gtk_sort_list_model_get_incremental
import org.gtkkn.native.gtk.gtk_sort_list_model_get_model
import org.gtkkn.native.gtk.gtk_sort_list_model_get_pending
import org.gtkkn.native.gtk.gtk_sort_list_model_get_sorter
import org.gtkkn.native.gtk.gtk_sort_list_model_get_type
import org.gtkkn.native.gtk.gtk_sort_list_model_new
import org.gtkkn.native.gtk.gtk_sort_list_model_set_incremental
import org.gtkkn.native.gtk.gtk_sort_list_model_set_model
import org.gtkkn.native.gtk.gtk_sort_list_model_set_sorter
import kotlin.Boolean
import kotlin.UInt
import kotlin.Unit

/**
 * A `GListModel` that sorts the elements of an underlying model
 * according to a `GtkSorter`.
 *
 * The model is a stable sort. If two items compare equal according
 * to the sorter, the one that appears first in the original model will
 * also appear first after sorting.
 * Note that if you change the sorter, the previous order will have no
 * influence on the new order. If you want that, consider using a
 * `GtkMultiSorter` and appending the previous sorter to it.
 *
 * The model can be set up to do incremental sorting, so that
 * sorting long lists doesn't block the UI. See
 * [method@Gtk.SortListModel.set_incremental] for details.
 *
 * `GtkSortListModel` is a generic model and because of that it
 * cannot take advantage of any external knowledge when sorting.
 * If you run into performance issues with `GtkSortListModel`,
 * it is strongly recommended that you write your own sorting list
 * model.
 */
public open class SortListModel(
    pointer: CPointer<GtkSortListModel>,
) : Object(pointer.reinterpret()), ListModel, KGTyped {
    public val gtkSortListModelPointer: CPointer<GtkSortListModel>
        get() = gPointer.reinterpret()

    override val gioListModelPointer: CPointer<GListModel>
        get() = gPointer.reinterpret()

    /**
     * If the model should sort items incrementally.
     */
    public open var incremental: Boolean
        /**
         * Returns whether incremental sorting is enabled.
         *
         * See [method@Gtk.SortListModel.set_incremental].
         *
         * @return true if incremental sorting is enabled
         */
        get() =
            gtk_sort_list_model_get_incremental(gtkSortListModelPointer.reinterpret()).asBoolean()

        /**
         * Sets the sort model to do an incremental sort.
         *
         * When incremental sorting is enabled, the `GtkSortListModel` will not do
         * a complete sort immediately, but will instead queue an idle handler that
         * incrementally sorts the items towards their correct position. This of
         * course means that items do not instantly appear in the right place. It
         * also means that the total sorting time is a lot slower.
         *
         * When your filter blocks the UI while sorting, you might consider
         * turning this on. Depending on your model and sorters, this may become
         * interesting around 10,000 to 100,000 items.
         *
         * By default, incremental sorting is disabled.
         *
         * See [method@Gtk.SortListModel.get_pending] for progress information
         * about an ongoing incremental sorting operation.
         *
         * @param incremental true to sort incrementally
         */
        set(incremental) =
            gtk_sort_list_model_set_incremental(
                gtkSortListModelPointer.reinterpret(),
                incremental.asGBoolean()
            )

    /**
     * The model being sorted.
     */
    public open var model: ListModel?
        /**
         * Gets the model currently sorted or null if none.
         *
         * @return The model that gets sorted
         */
        get() =
            gtk_sort_list_model_get_model(gtkSortListModelPointer.reinterpret())?.run {
                ListModel.wrap(reinterpret())
            }

        /**
         * Sets the model to be sorted.
         *
         * The @model's item type must conform to the item type of @self.
         *
         * @param model The model to be sorted
         */
        set(model) =
            gtk_sort_list_model_set_model(
                gtkSortListModelPointer.reinterpret(),
                model?.gioListModelPointer
            )

    /**
     * Estimate of unsorted items remaining.
     */
    public open val pending: UInt
        /**
         * Estimates progress of an ongoing sorting operation.
         *
         * The estimate is the number of items that would still need to be
         * sorted to finish the sorting operation if this was a linear
         * algorithm. So this number is not related to how many items are
         * already correctly sorted.
         *
         * If you want to estimate the progress, you can use code like this:
         * ```c
         * pending = gtk_sort_list_model_get_pending (self);
         * model = gtk_sort_list_model_get_model (self);
         * progress = 1.0 - pending / (double) MAX (1, g_list_model_get_n_items (model));
         * ```
         *
         * If no sort operation is ongoing - in particular when
         * [property@Gtk.SortListModel:incremental] is false - this
         * function returns 0.
         *
         * @return a progress estimate of remaining items to sort
         */
        get() = gtk_sort_list_model_get_pending(gtkSortListModelPointer.reinterpret())

    /**
     * The sorter for this model.
     */
    public open var sorter: Sorter?
        /**
         * Gets the sorter that is used to sort @self.
         *
         * @return the sorter of #self
         */
        get() =
            gtk_sort_list_model_get_sorter(gtkSortListModelPointer.reinterpret())?.run {
                Sorter(reinterpret())
            }

        /**
         * Sets a new sorter on @self.
         *
         * @param sorter the `GtkSorter` to sort @model with
         */
        set(sorter) =
            gtk_sort_list_model_set_sorter(
                gtkSortListModelPointer.reinterpret(),
                sorter?.gtkSorterPointer?.reinterpret()
            )

    /**
     * Creates a new sort list model that uses the @sorter to sort @model.
     *
     * @param model the model to sort
     * @param sorter the `GtkSorter` to sort @model with,
     * @return a new `GtkSortListModel`
     */
    public constructor(model: ListModel? = null, sorter: Sorter? = null) :
        this(
            gtk_sort_list_model_new(
                model?.gioListModelPointer,
                sorter?.gtkSorterPointer?.reinterpret()
            )!!.reinterpret()
        )

    /**
     * Returns whether incremental sorting is enabled.
     *
     * See [method@Gtk.SortListModel.set_incremental].
     *
     * @return true if incremental sorting is enabled
     */
    public open fun getIncremental(): Boolean =
        gtk_sort_list_model_get_incremental(gtkSortListModelPointer.reinterpret()).asBoolean()

    /**
     * Gets the model currently sorted or null if none.
     *
     * @return The model that gets sorted
     */
    public open fun getModel(): ListModel? =
        gtk_sort_list_model_get_model(gtkSortListModelPointer.reinterpret())?.run {
            ListModel.wrap(reinterpret())
        }

    /**
     * Estimates progress of an ongoing sorting operation.
     *
     * The estimate is the number of items that would still need to be
     * sorted to finish the sorting operation if this was a linear
     * algorithm. So this number is not related to how many items are
     * already correctly sorted.
     *
     * If you want to estimate the progress, you can use code like this:
     * ```c
     * pending = gtk_sort_list_model_get_pending (self);
     * model = gtk_sort_list_model_get_model (self);
     * progress = 1.0 - pending / (double) MAX (1, g_list_model_get_n_items (model));
     * ```
     *
     * If no sort operation is ongoing - in particular when
     * [property@Gtk.SortListModel:incremental] is false - this
     * function returns 0.
     *
     * @return a progress estimate of remaining items to sort
     */
    public open fun getPending(): UInt = gtk_sort_list_model_get_pending(gtkSortListModelPointer.reinterpret())

    /**
     * Gets the sorter that is used to sort @self.
     *
     * @return the sorter of #self
     */
    public open fun getSorter(): Sorter? =
        gtk_sort_list_model_get_sorter(gtkSortListModelPointer.reinterpret())?.run {
            Sorter(reinterpret())
        }

    /**
     * Sets the sort model to do an incremental sort.
     *
     * When incremental sorting is enabled, the `GtkSortListModel` will not do
     * a complete sort immediately, but will instead queue an idle handler that
     * incrementally sorts the items towards their correct position. This of
     * course means that items do not instantly appear in the right place. It
     * also means that the total sorting time is a lot slower.
     *
     * When your filter blocks the UI while sorting, you might consider
     * turning this on. Depending on your model and sorters, this may become
     * interesting around 10,000 to 100,000 items.
     *
     * By default, incremental sorting is disabled.
     *
     * See [method@Gtk.SortListModel.get_pending] for progress information
     * about an ongoing incremental sorting operation.
     *
     * @param incremental true to sort incrementally
     */
    public open fun setIncremental(incremental: Boolean): Unit =
        gtk_sort_list_model_set_incremental(
            gtkSortListModelPointer.reinterpret(),
            incremental.asGBoolean()
        )

    /**
     * Sets the model to be sorted.
     *
     * The @model's item type must conform to the item type of @self.
     *
     * @param model The model to be sorted
     */
    public open fun setModel(model: ListModel? = null): Unit =
        gtk_sort_list_model_set_model(
            gtkSortListModelPointer.reinterpret(),
            model?.gioListModelPointer
        )

    /**
     * Sets a new sorter on @self.
     *
     * @param sorter the `GtkSorter` to sort @model with
     */
    public open fun setSorter(sorter: Sorter? = null): Unit =
        gtk_sort_list_model_set_sorter(
            gtkSortListModelPointer.reinterpret(),
            sorter?.gtkSorterPointer?.reinterpret()
        )

    public companion object : TypeCompanion<SortListModel> {
        override val type: GeneratedClassKGType<SortListModel> =
            GeneratedClassKGType(gtk_sort_list_model_get_type()) {
                SortListModel(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}
