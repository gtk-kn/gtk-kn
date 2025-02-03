// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkCellAreaBox
import org.gtkkn.native.gtk.GtkCellLayout
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.gtk_cell_area_box_get_spacing
import org.gtkkn.native.gtk.gtk_cell_area_box_get_type
import org.gtkkn.native.gtk.gtk_cell_area_box_new
import org.gtkkn.native.gtk.gtk_cell_area_box_pack_end
import org.gtkkn.native.gtk.gtk_cell_area_box_pack_start
import org.gtkkn.native.gtk.gtk_cell_area_box_set_spacing
import kotlin.Boolean
import kotlin.Unit

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 4.10.
 *
 * List views use widgets for displaying their
 *   contents
 * ---
 *
 * A cell area that renders GtkCellRenderers into a row or a column
 *
 * The `GtkCellAreaBox` renders cell renderers into a row or a column
 * depending on its `GtkOrientation`.
 *
 * GtkCellAreaBox uses a notion of packing. Packing
 * refers to adding cell renderers with reference to a particular position
 * in a `GtkCellAreaBox`. There are two reference positions: the
 * start and the end of the box.
 * When the `GtkCellAreaBox` is oriented in the %GTK_ORIENTATION_VERTICAL
 * orientation, the start is defined as the top of the box and the end is
 * defined as the bottom. In the %GTK_ORIENTATION_HORIZONTAL orientation
 * start is defined as the left side and the end is defined as the right
 * side.
 *
 * Alignments of `GtkCellRenderer`s rendered in adjacent rows can be
 * configured by configuring the `GtkCellAreaBox` align child cell property
 * with gtk_cell_area_cell_set_property() or by specifying the "align"
 * argument to gtk_cell_area_box_pack_start() and gtk_cell_area_box_pack_end().
 */
public open class CellAreaBox(public val gtkCellAreaBoxPointer: CPointer<GtkCellAreaBox>) :
    CellArea(gtkCellAreaBoxPointer.reinterpret()),
    Orientable,
    KGTyped {
    init {
        Gtk
    }

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkCellLayoutPointer: CPointer<GtkCellLayout>
        get() = handle.reinterpret()

    /**
     * The amount of space to reserve between cells.
     */
    public open var spacing: gint
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         * ---
         *
         * Gets the spacing added between cell renderers.
         *
         * @return the space added between cell renderers in @box.
         */
        get() = gtk_cell_area_box_get_spacing(gtkCellAreaBoxPointer)

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         * ---
         *
         * Sets the spacing to add between cell renderers in @box.
         *
         * @param spacing the space to add between `GtkCellRenderer`s
         */
        set(spacing) = gtk_cell_area_box_set_spacing(gtkCellAreaBoxPointer, spacing)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     * ---
     *
     * Creates a new `GtkCellAreaBox`.
     *
     * @return a newly created `GtkCellAreaBox`
     */
    public constructor() : this(gtk_cell_area_box_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     * ---
     *
     * Adds @renderer to @box, packed with reference to the end of @box.
     *
     * The @renderer is packed after (away from end of) any other
     * `GtkCellRenderer` packed with reference to the end of @box.
     *
     * @param renderer the `GtkCellRenderer` to add
     * @param expand whether @renderer should receive extra space when the area receives
     * more than its natural size
     * @param align whether @renderer should be aligned in adjacent rows
     * @param fixed whether @renderer should have the same size in all rows
     */
    public open fun packEnd(renderer: CellRenderer, expand: Boolean, align: Boolean, fixed: Boolean): Unit =
        gtk_cell_area_box_pack_end(
            gtkCellAreaBoxPointer,
            renderer.gtkCellRendererPointer,
            expand.asGBoolean(),
            align.asGBoolean(),
            fixed.asGBoolean()
        )

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     * ---
     *
     * Adds @renderer to @box, packed with reference to the start of @box.
     *
     * The @renderer is packed after any other `GtkCellRenderer` packed
     * with reference to the start of @box.
     *
     * @param renderer the `GtkCellRenderer` to add
     * @param expand whether @renderer should receive extra space when the area receives
     * more than its natural size
     * @param align whether @renderer should be aligned in adjacent rows
     * @param fixed whether @renderer should have the same size in all rows
     */
    public open fun packStart(renderer: CellRenderer, expand: Boolean, align: Boolean, fixed: Boolean): Unit =
        gtk_cell_area_box_pack_start(
            gtkCellAreaBoxPointer,
            renderer.gtkCellRendererPointer,
            expand.asGBoolean(),
            align.asGBoolean(),
            fixed.asGBoolean()
        )

    public companion object : TypeCompanion<CellAreaBox> {
        override val type: GeneratedClassKGType<CellAreaBox> =
            GeneratedClassKGType(getTypeOrNull()!!) { CellAreaBox(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of CellAreaBox
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_cell_area_box_get_type()

        /**
         * Gets the GType of from the symbol `gtk_cell_area_box_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_cell_area_box_get_type")
    }
}
