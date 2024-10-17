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
import org.gtkkn.native.gtk.GtkFlattenListModel
import org.gtkkn.native.gtk.GtkSectionModel
import org.gtkkn.native.gtk.gtk_flatten_list_model_get_model
import org.gtkkn.native.gtk.gtk_flatten_list_model_get_model_for_item
import org.gtkkn.native.gtk.gtk_flatten_list_model_get_type
import org.gtkkn.native.gtk.gtk_flatten_list_model_new
import org.gtkkn.native.gtk.gtk_flatten_list_model_set_model
import kotlin.UInt
import kotlin.Unit

/**
 * `GtkFlattenListModel` is a list model that concatenates other list models.
 *
 * `GtkFlattenListModel` takes a list model containing list models, and flattens
 * it into a single model. Each list model becomes a section in the single model.
 *
 * ## Skipped during bindings generation
 *
 * - method `item-type`: Property has no getter nor setter
 * - method `n-items`: Property has no getter nor setter
 */
public open class FlattenListModel(
    pointer: CPointer<GtkFlattenListModel>,
) : Object(pointer.reinterpret()), ListModel, SectionModel, KGTyped {
    public val gtkFlattenListModelPointer: CPointer<GtkFlattenListModel>
        get() = gPointer.reinterpret()

    override val gioListModelPointer: CPointer<GListModel>
        get() = gPointer.reinterpret()

    override val gtkSectionModelPointer: CPointer<GtkSectionModel>
        get() = gPointer.reinterpret()

    /**
     * The model being flattened.
     */
    public open var model: ListModel?
        /**
         * Gets the model set via gtk_flatten_list_model_set_model().
         *
         * @return The model flattened by @self
         */
        get() =
            gtk_flatten_list_model_get_model(gtkFlattenListModelPointer.reinterpret())?.run {
                ListModel.wrap(reinterpret())
            }

        /**
         * Sets a new model to be flattened.
         *
         * @param model the new model
         */
        set(model) =
            gtk_flatten_list_model_set_model(
                gtkFlattenListModelPointer.reinterpret(),
                model?.gioListModelPointer
            )

    /**
     * Creates a new `GtkFlattenListModel` that flattens @list.
     *
     * @param model the model to be flattened
     * @return a new `GtkFlattenListModel`
     */
    public constructor(model: ListModel? = null) :
        this(gtk_flatten_list_model_new(model?.gioListModelPointer)!!.reinterpret())

    /**
     * Gets the model set via gtk_flatten_list_model_set_model().
     *
     * @return The model flattened by @self
     */
    public open fun getModel(): ListModel? =
        gtk_flatten_list_model_get_model(gtkFlattenListModelPointer.reinterpret())?.run {
            ListModel.wrap(reinterpret())
        }

    /**
     * Returns the model containing the item at the given position.
     *
     * @param position a position
     * @return the model containing the item at @position
     */
    public open fun getModelForItem(position: UInt): ListModel? =
        gtk_flatten_list_model_get_model_for_item(
            gtkFlattenListModelPointer.reinterpret(),
            position
        )?.run {
            ListModel.wrap(reinterpret())
        }

    /**
     * Sets a new model to be flattened.
     *
     * @param model the new model
     */
    public open fun setModel(model: ListModel? = null): Unit =
        gtk_flatten_list_model_set_model(
            gtkFlattenListModelPointer.reinterpret(),
            model?.gioListModelPointer
        )

    public companion object : TypeCompanion<FlattenListModel> {
        override val type: GeneratedClassKGType<FlattenListModel> =
            GeneratedClassKGType(gtk_flatten_list_model_get_type()) {
                FlattenListModel(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}
