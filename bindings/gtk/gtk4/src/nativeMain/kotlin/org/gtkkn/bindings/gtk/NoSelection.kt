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
import org.gtkkn.native.gtk.GtkNoSelection
import org.gtkkn.native.gtk.GtkSectionModel
import org.gtkkn.native.gtk.GtkSelectionModel
import org.gtkkn.native.gtk.gtk_no_selection_get_model
import org.gtkkn.native.gtk.gtk_no_selection_get_type
import org.gtkkn.native.gtk.gtk_no_selection_new
import org.gtkkn.native.gtk.gtk_no_selection_set_model
import kotlin.Unit

/**
 * `GtkNoSelection` is a `GtkSelectionModel` that does not allow selecting
 * anything.
 *
 * This model is meant to be used as a simple wrapper around a `GListModel`
 * when a `GtkSelectionModel` is required.
 *
 * `GtkNoSelection` passes through sections from the underlying model.
 *
 * ## Skipped during bindings generation
 *
 * - method `item-type`: Property has no getter nor setter
 * - method `n-items`: Property has no getter nor setter
 */
public open class NoSelection(
    pointer: CPointer<GtkNoSelection>,
) : Object(pointer.reinterpret()),
    ListModel,
    SectionModel,
    SelectionModel,
    KGTyped {
    public val gtkNoSelectionPointer: CPointer<GtkNoSelection>
        get() = gPointer.reinterpret()

    override val gioListModelPointer: CPointer<GListModel>
        get() = gPointer.reinterpret()

    override val gtkSectionModelPointer: CPointer<GtkSectionModel>
        get() = gPointer.reinterpret()

    override val gtkSelectionModelPointer: CPointer<GtkSelectionModel>
        get() = gPointer.reinterpret()

    /**
     * The model being managed.
     */
    public open var model: ListModel?
        /**
         * Gets the model that @self is wrapping.
         *
         * @return The model being wrapped
         */
        get() =
            gtk_no_selection_get_model(gtkNoSelectionPointer.reinterpret())?.run {
                ListModel.wrap(reinterpret())
            }

        /**
         * Sets the model that @self should wrap.
         *
         * If @model is null, this model will be empty.
         *
         * @param model A `GListModel` to wrap
         */
        set(model) = gtk_no_selection_set_model(gtkNoSelectionPointer.reinterpret(), model?.gioListModelPointer)

    /**
     * Creates a new selection to handle @model.
     *
     * @param model the `GListModel` to manage
     * @return a new `GtkNoSelection`
     */
    public constructor(
        model: ListModel? = null,
    ) : this(gtk_no_selection_new(model?.gioListModelPointer)!!.reinterpret())

    /**
     * Gets the model that @self is wrapping.
     *
     * @return The model being wrapped
     */
    public open fun getModel(): ListModel? =
        gtk_no_selection_get_model(gtkNoSelectionPointer.reinterpret())?.run {
            ListModel.wrap(reinterpret())
        }

    /**
     * Sets the model that @self should wrap.
     *
     * If @model is null, this model will be empty.
     *
     * @param model A `GListModel` to wrap
     */
    public open fun setModel(model: ListModel? = null): Unit =
        gtk_no_selection_set_model(gtkNoSelectionPointer.reinterpret(), model?.gioListModelPointer)

    public companion object : TypeCompanion<NoSelection> {
        override val type: GeneratedClassKGType<NoSelection> =
            GeneratedClassKGType(gtk_no_selection_get_type()) { NoSelection(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}