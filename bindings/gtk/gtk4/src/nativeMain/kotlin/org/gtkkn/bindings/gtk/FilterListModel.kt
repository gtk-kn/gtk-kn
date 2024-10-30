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
import org.gtkkn.native.gtk.GtkFilterListModel
import org.gtkkn.native.gtk.GtkSectionModel
import org.gtkkn.native.gtk.gtk_filter_list_model_get_filter
import org.gtkkn.native.gtk.gtk_filter_list_model_get_incremental
import org.gtkkn.native.gtk.gtk_filter_list_model_get_model
import org.gtkkn.native.gtk.gtk_filter_list_model_get_pending
import org.gtkkn.native.gtk.gtk_filter_list_model_get_type
import org.gtkkn.native.gtk.gtk_filter_list_model_new
import org.gtkkn.native.gtk.gtk_filter_list_model_set_filter
import org.gtkkn.native.gtk.gtk_filter_list_model_set_incremental
import org.gtkkn.native.gtk.gtk_filter_list_model_set_model
import kotlin.Boolean
import kotlin.UInt
import kotlin.Unit

/**
 * `GtkFilterListModel` is a list model that filters the elements of
 * the underlying model according to a `GtkFilter`.
 *
 * It hides some elements from the other model according to
 * criteria given by a `GtkFilter`.
 *
 * The model can be set up to do incremental filtering, so that
 * filtering long lists doesn't block the UI. See
 * [method@Gtk.FilterListModel.set_incremental] for details.
 *
 * `GtkFilterListModel` passes through sections from the underlying model.
 *
 * ## Skipped during bindings generation
 *
 * - method `item-type`: Property has no getter nor setter
 * - method `n-items`: Property has no getter nor setter
 */
public open class FilterListModel(
    pointer: CPointer<GtkFilterListModel>,
) : Object(pointer.reinterpret()),
    ListModel,
    SectionModel,
    KGTyped {
    public val gtkFilterListModelPointer: CPointer<GtkFilterListModel>
        get() = gPointer.reinterpret()

    override val gioListModelPointer: CPointer<GListModel>
        get() = gPointer.reinterpret()

    override val gtkSectionModelPointer: CPointer<GtkSectionModel>
        get() = gPointer.reinterpret()

    /**
     * The filter for this model.
     */
    public open var filter: Filter?
        /**
         * Gets the `GtkFilter` currently set on @self.
         *
         * @return The filter currently in use
         */
        get() =
            gtk_filter_list_model_get_filter(gtkFilterListModelPointer.reinterpret())?.run {
                Filter(reinterpret())
            }

        /**
         * Sets the filter used to filter items.
         *
         * @param filter filter to use
         */
        set(
            filter
        ) =
            gtk_filter_list_model_set_filter(
                gtkFilterListModelPointer.reinterpret(),
                filter?.gtkFilterPointer?.reinterpret()
            )

    /**
     * If the model should filter items incrementally.
     */
    public open var incremental: Boolean
        /**
         * Returns whether incremental filtering is enabled.
         *
         * See [method@Gtk.FilterListModel.set_incremental].
         *
         * @return true if incremental filtering is enabled
         */
        get() = gtk_filter_list_model_get_incremental(gtkFilterListModelPointer.reinterpret()).asBoolean()

        /**
         * Sets the filter model to do an incremental sort.
         *
         * When incremental filtering is enabled, the `GtkFilterListModel` will not
         * run filters immediately, but will instead queue an idle handler that
         * incrementally filters the items and adds them to the list. This of course
         * means that items are not instantly added to the list, but only appear
         * incrementally.
         *
         * When your filter blocks the UI while filtering, you might consider
         * turning this on. Depending on your model and filters, this may become
         * interesting around 10,000 to 100,000 items.
         *
         * By default, incremental filtering is disabled.
         *
         * See [method@Gtk.FilterListModel.get_pending] for progress information
         * about an ongoing incremental filtering operation.
         *
         * @param incremental true to enable incremental filtering
         */
        set(
            incremental
        ) = gtk_filter_list_model_set_incremental(gtkFilterListModelPointer.reinterpret(), incremental.asGBoolean())

    /**
     * The model being filtered.
     */
    public open var model: ListModel?
        /**
         * Gets the model currently filtered or null if none.
         *
         * @return The model that gets filtered
         */
        get() =
            gtk_filter_list_model_get_model(gtkFilterListModelPointer.reinterpret())?.run {
                ListModel.wrap(reinterpret())
            }

        /**
         * Sets the model to be filtered.
         *
         * Note that GTK makes no effort to ensure that @model conforms to
         * the item type of @self. It assumes that the caller knows what they
         * are doing and have set up an appropriate filter to ensure that item
         * types match.
         *
         * @param model The model to be filtered
         */
        set(
            model
        ) = gtk_filter_list_model_set_model(gtkFilterListModelPointer.reinterpret(), model?.gioListModelPointer)

    /**
     * Number of items not yet filtered.
     */
    public open val pending: UInt
        /**
         * Returns the number of items that have not been filtered yet.
         *
         * You can use this value to check if @self is busy filtering by
         * comparing the return value to 0 or you can compute the percentage
         * of the filter remaining by dividing the return value by the total
         * number of items in the underlying model:
         *
         * ```c
         * pending = gtk_filter_list_model_get_pending (self);
         * model = gtk_filter_list_model_get_model (self);
         * percentage = pending / (double) g_list_model_get_n_items (model);
         * ```
         *
         * If no filter operation is ongoing - in particular when
         * [property@Gtk.FilterListModel:incremental] is false - this
         * function returns 0.
         *
         * @return The number of items not yet filtered
         */
        get() = gtk_filter_list_model_get_pending(gtkFilterListModelPointer.reinterpret())

    /**
     * Creates a new `GtkFilterListModel` that will filter @model using the given
     * @filter.
     *
     * @param model the model to sort
     * @param filter filter
     * @return a new `GtkFilterListModel`
     */
    public constructor(
        model: ListModel? = null,
        filter: Filter? = null,
    ) : this(
        gtk_filter_list_model_new(model?.gioListModelPointer, filter?.gtkFilterPointer?.reinterpret())!!.reinterpret()
    )

    /**
     * Gets the `GtkFilter` currently set on @self.
     *
     * @return The filter currently in use
     */
    public open fun getFilter(): Filter? =
        gtk_filter_list_model_get_filter(gtkFilterListModelPointer.reinterpret())?.run {
            Filter(reinterpret())
        }

    /**
     * Returns whether incremental filtering is enabled.
     *
     * See [method@Gtk.FilterListModel.set_incremental].
     *
     * @return true if incremental filtering is enabled
     */
    public open fun getIncremental(): Boolean =
        gtk_filter_list_model_get_incremental(gtkFilterListModelPointer.reinterpret()).asBoolean()

    /**
     * Gets the model currently filtered or null if none.
     *
     * @return The model that gets filtered
     */
    public open fun getModel(): ListModel? =
        gtk_filter_list_model_get_model(gtkFilterListModelPointer.reinterpret())?.run {
            ListModel.wrap(reinterpret())
        }

    /**
     * Returns the number of items that have not been filtered yet.
     *
     * You can use this value to check if @self is busy filtering by
     * comparing the return value to 0 or you can compute the percentage
     * of the filter remaining by dividing the return value by the total
     * number of items in the underlying model:
     *
     * ```c
     * pending = gtk_filter_list_model_get_pending (self);
     * model = gtk_filter_list_model_get_model (self);
     * percentage = pending / (double) g_list_model_get_n_items (model);
     * ```
     *
     * If no filter operation is ongoing - in particular when
     * [property@Gtk.FilterListModel:incremental] is false - this
     * function returns 0.
     *
     * @return The number of items not yet filtered
     */
    public open fun getPending(): UInt = gtk_filter_list_model_get_pending(gtkFilterListModelPointer.reinterpret())

    /**
     * Sets the filter used to filter items.
     *
     * @param filter filter to use
     */
    public open fun setFilter(filter: Filter? = null): Unit =
        gtk_filter_list_model_set_filter(
            gtkFilterListModelPointer.reinterpret(),
            filter?.gtkFilterPointer?.reinterpret()
        )

    /**
     * Sets the filter model to do an incremental sort.
     *
     * When incremental filtering is enabled, the `GtkFilterListModel` will not
     * run filters immediately, but will instead queue an idle handler that
     * incrementally filters the items and adds them to the list. This of course
     * means that items are not instantly added to the list, but only appear
     * incrementally.
     *
     * When your filter blocks the UI while filtering, you might consider
     * turning this on. Depending on your model and filters, this may become
     * interesting around 10,000 to 100,000 items.
     *
     * By default, incremental filtering is disabled.
     *
     * See [method@Gtk.FilterListModel.get_pending] for progress information
     * about an ongoing incremental filtering operation.
     *
     * @param incremental true to enable incremental filtering
     */
    public open fun setIncremental(incremental: Boolean): Unit =
        gtk_filter_list_model_set_incremental(gtkFilterListModelPointer.reinterpret(), incremental.asGBoolean())

    /**
     * Sets the model to be filtered.
     *
     * Note that GTK makes no effort to ensure that @model conforms to
     * the item type of @self. It assumes that the caller knows what they
     * are doing and have set up an appropriate filter to ensure that item
     * types match.
     *
     * @param model The model to be filtered
     */
    public open fun setModel(model: ListModel? = null): Unit =
        gtk_filter_list_model_set_model(gtkFilterListModelPointer.reinterpret(), model?.gioListModelPointer)

    public companion object : TypeCompanion<FilterListModel> {
        override val type: GeneratedClassKGType<FilterListModel> =
            GeneratedClassKGType(gtk_filter_list_model_get_type()) { FilterListModel(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}
