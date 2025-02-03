// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Texture
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkCellLayout
import org.gtkkn.native.gtk.GtkCellView
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.gtk_cell_view_get_displayed_row
import org.gtkkn.native.gtk.gtk_cell_view_get_draw_sensitive
import org.gtkkn.native.gtk.gtk_cell_view_get_fit_model
import org.gtkkn.native.gtk.gtk_cell_view_get_model
import org.gtkkn.native.gtk.gtk_cell_view_get_type
import org.gtkkn.native.gtk.gtk_cell_view_new
import org.gtkkn.native.gtk.gtk_cell_view_new_with_context
import org.gtkkn.native.gtk.gtk_cell_view_new_with_markup
import org.gtkkn.native.gtk.gtk_cell_view_new_with_text
import org.gtkkn.native.gtk.gtk_cell_view_new_with_texture
import org.gtkkn.native.gtk.gtk_cell_view_set_displayed_row
import org.gtkkn.native.gtk.gtk_cell_view_set_draw_sensitive
import org.gtkkn.native.gtk.gtk_cell_view_set_fit_model
import org.gtkkn.native.gtk.gtk_cell_view_set_model
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 4.10.
 *
 * List views use widgets to display their contents.
 *   You can use [class@Gtk.Box] instead
 * ---
 *
 * A widget displaying a single row of a GtkTreeModel
 *
 * A `GtkCellView` displays a single row of a `GtkTreeModel` using a `GtkCellArea`
 * and `GtkCellAreaContext`. A `GtkCellAreaContext` can be provided to the
 * `GtkCellView` at construction time in order to keep the cellview in context
 * of a group of cell views, this ensures that the renderers displayed will
 * be properly aligned with each other (like the aligned cells in the menus
 * of `GtkComboBox`).
 *
 * `GtkCellView` is `GtkOrientable` in order to decide in which orientation
 * the underlying `GtkCellAreaContext` should be allocated. Taking the `GtkComboBox`
 * menu as an example, cellviews should be oriented horizontally if the menus are
 * listed top-to-bottom and thus all share the same width but may have separate
 * individual heights (left-to-right menus should be allocated vertically since
 * they all share the same height but may have variable widths).
 *
 * ## CSS nodes
 *
 * GtkCellView has a single CSS node with name cellview.
 *
 * ## Skipped during bindings generation
 *
 * - method `cell-area`: Property has no getter nor setter
 * - method `cell-area-context`: Property has no getter nor setter
 */
public open class CellView(public val gtkCellViewPointer: CPointer<GtkCellView>) :
    Widget(gtkCellViewPointer.reinterpret()),
    CellLayout,
    Orientable,
    KGTyped {
    init {
        Gtk
    }

    override val gtkCellLayoutPointer: CPointer<GtkCellLayout>
        get() = handle.reinterpret()

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = handle.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Whether all cells should be draw as sensitive for this view regardless
     * of the actual cell properties (used to make menus with submenus appear
     * sensitive when the items in submenus might be insensitive).
     *
     * since 3.0
     */
    public open var drawSensitive: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         * ---
         *
         * Gets whether @cell_view is configured to draw all of its
         * cells in a sensitive state.
         *
         * @return whether @cell_view draws all of its
         * cells in a sensitive state
         */
        get() = gtk_cell_view_get_draw_sensitive(gtkCellViewPointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         * ---
         *
         * Sets whether @cell_view should draw all of its
         * cells in a sensitive state, this is used by `GtkComboBox` menus
         * to ensure that rows with insensitive cells that contain
         * children appear sensitive in the parent menu item.
         *
         * @param drawSensitive whether to draw all cells in a sensitive state.
         */
        set(drawSensitive) = gtk_cell_view_set_draw_sensitive(gtkCellViewPointer, drawSensitive.asGBoolean())

    /**
     * Whether the view should request enough space to always fit
     * the size of every row in the model (used by the combo box to
     * ensure the combo box size doesn't change when different items
     * are selected).
     *
     * since 3.0
     */
    public open var fitModel: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         * ---
         *
         * Gets whether @cell_view is configured to request space
         * to fit the entire `GtkTreeModel`.
         *
         * @return whether @cell_view requests space to fit
         * the entire `GtkTreeModel`.
         */
        get() = gtk_cell_view_get_fit_model(gtkCellViewPointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         * ---
         *
         * Sets whether @cell_view should request space to fit the entire `GtkTreeModel`.
         *
         * This is used by `GtkComboBox` to ensure that the cell view displayed on
         * the combo box’s button always gets enough space and does not resize
         * when selection changes.
         *
         * @param fitModel whether @cell_view should request space for the whole model.
         */
        set(fitModel) = gtk_cell_view_set_fit_model(gtkCellViewPointer, fitModel.asGBoolean())

    /**
     * The model for cell view
     *
     * since 2.10
     */
    public open var model: TreeModel?
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         * ---
         *
         * Returns the model for @cell_view. If no model is used null is
         * returned.
         *
         * @return a `GtkTreeModel` used
         */
        get() = gtk_cell_view_get_model(gtkCellViewPointer)?.run {
            TreeModel.TreeModelImpl(reinterpret())
        }

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         * ---
         *
         * Sets the model for @cell_view.  If @cell_view already has a model
         * set, it will remove it before setting the new model.  If @model is
         * null, then it will unset the old model.
         *
         * @param model a `GtkTreeModel`
         */
        set(model) = gtk_cell_view_set_model(gtkCellViewPointer, model?.gtkTreeModelPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     * ---
     *
     * Creates a new `GtkCellView` widget.
     *
     * @return A newly created `GtkCellView` widget.
     */
    public constructor() : this(gtk_cell_view_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     * ---
     *
     * Creates a new `GtkCellView` widget with a specific `GtkCellArea`
     * to layout cells and a specific `GtkCellAreaContext`.
     *
     * Specifying the same context for a handful of cells lets
     * the underlying area synchronize the geometry for those cells,
     * in this way alignments with cellviews for other rows are
     * possible.
     *
     * @param area the `GtkCellArea` to layout cells
     * @param context the `GtkCellAreaContext` in which to calculate cell geometry
     * @return A newly created `GtkCellView` widget.
     */
    public constructor(
        area: CellArea,
        context: CellAreaContext,
    ) : this(
        gtk_cell_view_new_with_context(area.gtkCellAreaPointer, context.gtkCellAreaContextPointer)!!.reinterpret()
    ) {
        InstanceCache.put(this)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     * ---
     *
     * Creates a new `GtkCellView` widget, adds a `GtkCellRendererText`
     * to it, and makes it show @text.
     *
     * @param text the text to display in the cell view
     * @return A newly created `GtkCellView` widget.
     */
    public constructor(text: String) : this(gtk_cell_view_new_with_text(text)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     * ---
     *
     * Creates a new `GtkCellView` widget, adds a `GtkCellRendererPixbuf`
     * to it, and makes it show @texture.
     *
     * @param texture the image to display in the cell view
     * @return A newly created `GtkCellView` widget.
     */
    public constructor(
        texture: Texture,
    ) : this(gtk_cell_view_new_with_texture(texture.gdkTexturePointer)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     * ---
     *
     * Returns a `GtkTreePath` referring to the currently
     * displayed row. If no row is currently displayed,
     * null is returned.
     *
     * @return the currently displayed row
     */
    public open fun getDisplayedRow(): TreePath? = gtk_cell_view_get_displayed_row(gtkCellViewPointer)?.run {
        TreePath(this)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     * ---
     *
     * Sets the row of the model that is currently displayed
     * by the `GtkCellView`. If the path is unset, then the
     * contents of the cellview “stick” at their last value;
     * this is not normally a desired result, but may be
     * a needed intermediate state if say, the model for
     * the `GtkCellView` becomes temporarily empty.
     *
     * @param path a `GtkTreePath` or null to unset.
     */
    public open fun setDisplayedRow(path: TreePath? = null): Unit =
        gtk_cell_view_set_displayed_row(gtkCellViewPointer, path?.gtkTreePathPointer)

    public companion object : TypeCompanion<CellView> {
        override val type: GeneratedClassKGType<CellView> =
            GeneratedClassKGType(getTypeOrNull()!!) { CellView(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of CellView
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_cell_view_get_type()

        /**
         * Gets the GType of from the symbol `gtk_cell_view_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_cell_view_get_type")

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         * ---
         *
         * Creates a new `GtkCellView` widget, adds a `GtkCellRendererText`
         * to it, and makes it show @markup. The text can be marked up with
         * the [Pango text markup language](https://docs.gtk.org/Pango/pango_markup.html).
         *
         * @param markup the text to display in the cell view
         * @return A newly created `GtkCellView` widget.
         */
        public fun withMarkup(markup: String): CellView =
            CellView(gtk_cell_view_new_with_markup(markup)!!.reinterpret()).apply {
                InstanceCache.put(this)
            }
    }
}
