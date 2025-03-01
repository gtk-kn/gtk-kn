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
import org.gtkkn.native.gtk.GtkSectionModel
import org.gtkkn.native.gtk.GtkSliceListModel
import org.gtkkn.native.gtk.gtk_slice_list_model_get_model
import org.gtkkn.native.gtk.gtk_slice_list_model_get_offset
import org.gtkkn.native.gtk.gtk_slice_list_model_get_size
import org.gtkkn.native.gtk.gtk_slice_list_model_get_type
import org.gtkkn.native.gtk.gtk_slice_list_model_new
import org.gtkkn.native.gtk.gtk_slice_list_model_set_model
import org.gtkkn.native.gtk.gtk_slice_list_model_set_offset
import org.gtkkn.native.gtk.gtk_slice_list_model_set_size

/**
 * `GtkSliceListModel` is a list model that presents a slice of another model.
 *
 * This is useful when implementing paging by setting the size to the number
 * of elements per page and updating the offset whenever a different page is
 * opened.
 *
 * `GtkSliceListModel` passes through sections from the underlying model.
 *
 * ## Skipped during bindings generation
 *
 * - method `item-type`: Property has no getter nor setter
 * - method `n-items`: Property has no getter nor setter
 */
public open class SliceListModel(public val gtkSliceListModelPointer: CPointer<GtkSliceListModel>) :
    Object(gtkSliceListModelPointer.reinterpret()),
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
     * Child model to take slice from.
     */
    public open var model: ListModel?
        /**
         * Gets the model that is currently being used or null if none.
         *
         * @return The model in use
         */
        get() = gtk_slice_list_model_get_model(gtkSliceListModelPointer)?.run {
            ListModel.ListModelImpl(reinterpret())
        }

        /**
         * Sets the model to show a slice of.
         *
         * The model's item type must conform to @self's item type.
         *
         * @param model The model to be sliced
         */
        set(model) = gtk_slice_list_model_set_model(gtkSliceListModelPointer, model?.gioListModelPointer)

    /**
     * Offset of slice.
     */
    public open var offset: guint
        /**
         * Gets the offset set via gtk_slice_list_model_set_offset().
         *
         * @return The offset
         */
        get() = gtk_slice_list_model_get_offset(gtkSliceListModelPointer)

        /**
         * Sets the offset into the original model for this slice.
         *
         * If the offset is too large for the sliced model,
         * @self will end up empty.
         *
         * @param offset the new offset to use
         */
        set(offset) = gtk_slice_list_model_set_offset(gtkSliceListModelPointer, offset)

    /**
     * Maximum size of slice.
     */
    public open var size: guint
        /**
         * Gets the size set via gtk_slice_list_model_set_size().
         *
         * @return The size
         */
        get() = gtk_slice_list_model_get_size(gtkSliceListModelPointer)

        /**
         * Sets the maximum size. @self will never have more items
         * than @size.
         *
         * It can however have fewer items if the offset is too large
         * or the model sliced from doesn't have enough items.
         *
         * @param size the maximum size
         */
        set(size) = gtk_slice_list_model_set_size(gtkSliceListModelPointer, size)

    /**
     * Creates a new slice model.
     *
     * It presents the slice from @offset to offset + @size
     * of the given @model.
     *
     * @param model The model to use
     * @param offset the offset of the slice
     * @param size maximum size of the slice
     * @return A new `GtkSliceListModel`
     */
    public constructor(
        model: ListModel? = null,
        offset: guint,
        size: guint,
    ) : this(gtk_slice_list_model_new(model?.gioListModelPointer, offset, size)!!) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<SliceListModel> {
        override val type: GeneratedClassKGType<SliceListModel> =
            GeneratedClassKGType(getTypeOrNull()!!) { SliceListModel(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of SliceListModel
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_slice_list_model_get_type()

        /**
         * Gets the GType of from the symbol `gtk_slice_list_model_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_slice_list_model_get_type")
    }
}
