// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkFlattenListModel
import org.gtkkn.native.gtk.GtkSectionModel
import org.gtkkn.native.gtk.gtk_flatten_list_model_get_model
import org.gtkkn.native.gtk.gtk_flatten_list_model_get_model_for_item
import org.gtkkn.native.gtk.gtk_flatten_list_model_get_type
import org.gtkkn.native.gtk.gtk_flatten_list_model_new
import org.gtkkn.native.gtk.gtk_flatten_list_model_set_model

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
public open class FlattenListModel(public val gtkFlattenListModelPointer: CPointer<GtkFlattenListModel>) :
    Object(gtkFlattenListModelPointer.reinterpret()),
    ListModel,
    SectionModel,
    KGTyped {
    init {
        Gtk
    }

    override val gioListModelPointer: CPointer<GListModel>
        get() = handle.reinterpret()

    override val gtkSectionModelPointer: CPointer<GtkSectionModel>
        get() = handle.reinterpret()

    /**
     * The model being flattened.
     */
    public open var model: ListModel?
        /**
         * Gets the model set via gtk_flatten_list_model_set_model().
         *
         * @return The model flattened by @self
         */
        get() = gtk_flatten_list_model_get_model(gtkFlattenListModelPointer)?.run {
            ListModel.ListModelImpl(reinterpret())
        }

        /**
         * Sets a new model to be flattened.
         *
         * @param model the new model
         */
        set(model) = gtk_flatten_list_model_set_model(gtkFlattenListModelPointer, model?.gioListModelPointer)

    /**
     * Creates a new `GtkFlattenListModel` that flattens @list.
     *
     * @param model the model to be flattened
     * @return a new `GtkFlattenListModel`
     */
    public constructor(model: ListModel? = null) : this(gtk_flatten_list_model_new(model?.gioListModelPointer)!!) {
        InstanceCache.put(this)
    }

    /**
     * Returns the model containing the item at the given position.
     *
     * @param position a position
     * @return the model containing the item at @position
     */
    public open fun getModelForItem(position: guint): ListModel? =
        gtk_flatten_list_model_get_model_for_item(gtkFlattenListModelPointer, position)?.run {
            ListModel.ListModelImpl(reinterpret())
        }

    public companion object : TypeCompanion<FlattenListModel> {
        override val type: GeneratedClassKGType<FlattenListModel> =
            GeneratedClassKGType(getTypeOrNull()!!) { FlattenListModel(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of FlattenListModel
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_flatten_list_model_get_type()

        /**
         * Gets the GType of from the symbol `gtk_flatten_list_model_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_flatten_list_model_get_type")
    }
}
