// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkSelectionFilterModel
import org.gtkkn.native.gtk.gtk_selection_filter_model_get_model
import org.gtkkn.native.gtk.gtk_selection_filter_model_get_type
import org.gtkkn.native.gtk.gtk_selection_filter_model_new
import org.gtkkn.native.gtk.gtk_selection_filter_model_set_model

/**
 * `GtkSelectionFilterModel` is a list model that presents the selection from
 * a `GtkSelectionModel`.
 *
 * ## Skipped during bindings generation
 *
 * - method `item-type`: Property has no getter nor setter
 * - method `n-items`: Property has no getter nor setter
 */
public open class SelectionFilterModel(pointer: CPointer<GtkSelectionFilterModel>) :
    Object(pointer.reinterpret()),
    ListModel,
    KGTyped {
    public val gtkSelectionFilterModelPointer: CPointer<GtkSelectionFilterModel>
        get() = gPointer.reinterpret()

    override val gioListModelPointer: CPointer<GListModel>
        get() = gPointer.reinterpret()

    /**
     * The model being filtered.
     */
    public open var model: SelectionModel?
        /**
         * Gets the model currently filtered or null if none.
         *
         * @return The model that gets filtered
         */
        get() = gtk_selection_filter_model_get_model(gtkSelectionFilterModelPointer.reinterpret())?.run {
            SelectionModel.wrap(reinterpret())
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
        ) = gtk_selection_filter_model_set_model(
            gtkSelectionFilterModelPointer.reinterpret(),
            model?.gtkSelectionModelPointer
        )

    /**
     * Creates a new `GtkSelectionFilterModel` that will include the
     * selected items from the underlying selection model.
     *
     * @param model the selection model to filter
     * @return a new `GtkSelectionFilterModel`
     */
    public constructor(
        model: SelectionModel? = null,
    ) : this(gtk_selection_filter_model_new(model?.gtkSelectionModelPointer)!!.reinterpret())

    public companion object : TypeCompanion<SelectionFilterModel> {
        override val type: GeneratedClassKGType<SelectionFilterModel> =
            GeneratedClassKGType(gtk_selection_filter_model_get_type()) { SelectionFilterModel(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of SelectionFilterModel
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_selection_filter_model_get_type()
    }
}
