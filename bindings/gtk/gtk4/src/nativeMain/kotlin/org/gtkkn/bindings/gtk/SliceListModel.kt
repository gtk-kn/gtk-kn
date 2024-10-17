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
import kotlin.UInt
import kotlin.Unit

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
public open class SliceListModel(
    pointer: CPointer<GtkSliceListModel>,
) : Object(pointer.reinterpret()), ListModel, SectionModel, KGTyped {
    public val gtkSliceListModelPointer: CPointer<GtkSliceListModel>
        get() = gPointer.reinterpret()

    override val gioListModelPointer: CPointer<GListModel>
        get() = gPointer.reinterpret()

    override val gtkSectionModelPointer: CPointer<GtkSectionModel>
        get() = gPointer.reinterpret()

    /**
     * Child model to take slice from.
     */
    public open var model: ListModel?
        /**
         * Gets the model that is currently being used or null if none.
         *
         * @return The model in use
         */
        get() =
            gtk_slice_list_model_get_model(gtkSliceListModelPointer.reinterpret())?.run {
                ListModel.wrap(reinterpret())
            }

        /**
         * Sets the model to show a slice of.
         *
         * The model's item type must conform to @self's item type.
         *
         * @param model The model to be sliced
         */
        set(model) =
            gtk_slice_list_model_set_model(
                gtkSliceListModelPointer.reinterpret(),
                model?.gioListModelPointer
            )

    /**
     * Offset of slice.
     */
    public open var offset: UInt
        /**
         * Gets the offset set via gtk_slice_list_model_set_offset().
         *
         * @return The offset
         */
        get() = gtk_slice_list_model_get_offset(gtkSliceListModelPointer.reinterpret())

        /**
         * Sets the offset into the original model for this slice.
         *
         * If the offset is too large for the sliced model,
         * @self will end up empty.
         *
         * @param offset the new offset to use
         */
        set(offset) =
            gtk_slice_list_model_set_offset(
                gtkSliceListModelPointer.reinterpret(),
                offset
            )

    /**
     * Maximum size of slice.
     */
    public open var size: UInt
        /**
         * Gets the size set via gtk_slice_list_model_set_size().
         *
         * @return The size
         */
        get() = gtk_slice_list_model_get_size(gtkSliceListModelPointer.reinterpret())

        /**
         * Sets the maximum size. @self will never have more items
         * than @size.
         *
         * It can however have fewer items if the offset is too large
         * or the model sliced from doesn't have enough items.
         *
         * @param size the maximum size
         */
        set(size) = gtk_slice_list_model_set_size(gtkSliceListModelPointer.reinterpret(), size)

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
        offset: UInt,
        size: UInt,
    ) : this(gtk_slice_list_model_new(model?.gioListModelPointer, offset, size)!!.reinterpret())

    /**
     * Gets the model that is currently being used or null if none.
     *
     * @return The model in use
     */
    public open fun getModel(): ListModel? =
        gtk_slice_list_model_get_model(gtkSliceListModelPointer.reinterpret())?.run {
            ListModel.wrap(reinterpret())
        }

    /**
     * Gets the offset set via gtk_slice_list_model_set_offset().
     *
     * @return The offset
     */
    public open fun getOffset(): UInt = gtk_slice_list_model_get_offset(gtkSliceListModelPointer.reinterpret())

    /**
     * Gets the size set via gtk_slice_list_model_set_size().
     *
     * @return The size
     */
    public open fun getSize(): UInt = gtk_slice_list_model_get_size(gtkSliceListModelPointer.reinterpret())

    /**
     * Sets the model to show a slice of.
     *
     * The model's item type must conform to @self's item type.
     *
     * @param model The model to be sliced
     */
    public open fun setModel(model: ListModel? = null): Unit =
        gtk_slice_list_model_set_model(
            gtkSliceListModelPointer.reinterpret(),
            model?.gioListModelPointer
        )

    /**
     * Sets the offset into the original model for this slice.
     *
     * If the offset is too large for the sliced model,
     * @self will end up empty.
     *
     * @param offset the new offset to use
     */
    public open fun setOffset(offset: UInt): Unit =
        gtk_slice_list_model_set_offset(gtkSliceListModelPointer.reinterpret(), offset)

    /**
     * Sets the maximum size. @self will never have more items
     * than @size.
     *
     * It can however have fewer items if the offset is too large
     * or the model sliced from doesn't have enough items.
     *
     * @param size the maximum size
     */
    public open fun setSize(size: UInt): Unit =
        gtk_slice_list_model_set_size(gtkSliceListModelPointer.reinterpret(), size)

    public companion object : TypeCompanion<SliceListModel> {
        override val type: GeneratedClassKGType<SliceListModel> =
            GeneratedClassKGType(gtk_slice_list_model_get_type()) {
                SliceListModel(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}
