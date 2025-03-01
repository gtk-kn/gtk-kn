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
public open class MultiSelection(public val gtkMultiSelectionPointer: CPointer<GtkMultiSelection>) :
    Object(gtkMultiSelectionPointer.reinterpret()),
    ListModel,
    SectionModel,
    SelectionModel,
    KGTyped {
    init {
        Gtk
    }

    override val gioListModelPointer: CPointer<GListModel>
        get() = handle.reinterpret()

    override val gtkSectionModelPointer: CPointer<GtkSectionModel>
        get() = handle.reinterpret()

    override val gtkSelectionModelPointer: CPointer<GtkSelectionModel>
        get() = handle.reinterpret()

    /**
     * The list managed by this selection.
     */
    public open var model: ListModel?
        /**
         * Returns the underlying model of @self.
         *
         * @return the underlying model
         */
        get() = gtk_multi_selection_get_model(gtkMultiSelectionPointer)?.run {
            ListModel.ListModelImpl(reinterpret())
        }

        /**
         * Sets the model that @self should wrap.
         *
         * If @model is null, @self will be empty.
         *
         * @param model A `GListModel` to wrap
         */
        set(model) = gtk_multi_selection_set_model(gtkMultiSelectionPointer, model?.gioListModelPointer)

    /**
     * Creates a new selection to handle @model.
     *
     * @param model the `GListModel` to manage
     * @return a new `GtkMultiSelection`
     */
    public constructor(model: ListModel? = null) : this(gtk_multi_selection_new(model?.gioListModelPointer)!!) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<MultiSelection> {
        override val type: GeneratedClassKGType<MultiSelection> =
            GeneratedClassKGType(getTypeOrNull()!!) { MultiSelection(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of MultiSelection
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_multi_selection_get_type()

        /**
         * Gets the GType of from the symbol `gtk_multi_selection_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_multi_selection_get_type")
    }
}
