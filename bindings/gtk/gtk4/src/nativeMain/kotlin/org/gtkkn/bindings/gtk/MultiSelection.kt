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
import org.gtkkn.native.gtk.GtkMultiSelection
import org.gtkkn.native.gtk.GtkSectionModel
import org.gtkkn.native.gtk.GtkSelectionModel
import org.gtkkn.native.gtk.gtk_multi_selection_get_model
import org.gtkkn.native.gtk.gtk_multi_selection_get_type
import org.gtkkn.native.gtk.gtk_multi_selection_new
import org.gtkkn.native.gtk.gtk_multi_selection_set_model

/**
 * `GtkMultiSelection` is a `GtkSelectionModel` that allows selecting multiple
 * elements.
 *
 * ## Skipped during bindings generation
 *
 * - method `item-type`: Property has no getter nor setter
 * - method `n-items`: Property has no getter nor setter
 */
public open class MultiSelection(pointer: CPointer<GtkMultiSelection>) :
    Object(pointer.reinterpret()),
    ListModel,
    SectionModel,
    SelectionModel,
    KGTyped {
    public val gtkMultiSelectionPointer: CPointer<GtkMultiSelection>
        get() = gPointer.reinterpret()

    override val gioListModelPointer: CPointer<GListModel>
        get() = gPointer.reinterpret()

    override val gtkSectionModelPointer: CPointer<GtkSectionModel>
        get() = gPointer.reinterpret()

    override val gtkSelectionModelPointer: CPointer<GtkSelectionModel>
        get() = gPointer.reinterpret()

    /**
     * The list managed by this selection.
     */
    public open var model: ListModel?
        /**
         * Returns the underlying model of @self.
         *
         * @return the underlying model
         */
        get() = gtk_multi_selection_get_model(gtkMultiSelectionPointer.reinterpret())?.run {
            ListModel.wrap(reinterpret())
        }

        /**
         * Sets the model that @self should wrap.
         *
         * If @model is null, @self will be empty.
         *
         * @param model A `GListModel` to wrap
         */
        set(model) = gtk_multi_selection_set_model(gtkMultiSelectionPointer.reinterpret(), model?.gioListModelPointer)

    /**
     * Creates a new selection to handle @model.
     *
     * @param model the `GListModel` to manage
     * @return a new `GtkMultiSelection`
     */
    public constructor(
        model: ListModel? = null,
    ) : this(gtk_multi_selection_new(model?.gioListModelPointer)!!.reinterpret())

    public companion object : TypeCompanion<MultiSelection> {
        override val type: GeneratedClassKGType<MultiSelection> =
            GeneratedClassKGType(gtk_multi_selection_get_type()) { MultiSelection(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of MultiSelection
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_multi_selection_get_type()
    }
}
