// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_12
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkBoxLayout
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.gtk_box_layout_get_baseline_child
import org.gtkkn.native.gtk.gtk_box_layout_get_baseline_position
import org.gtkkn.native.gtk.gtk_box_layout_get_homogeneous
import org.gtkkn.native.gtk.gtk_box_layout_get_spacing
import org.gtkkn.native.gtk.gtk_box_layout_get_type
import org.gtkkn.native.gtk.gtk_box_layout_new
import org.gtkkn.native.gtk.gtk_box_layout_set_baseline_child
import org.gtkkn.native.gtk.gtk_box_layout_set_baseline_position
import org.gtkkn.native.gtk.gtk_box_layout_set_homogeneous
import org.gtkkn.native.gtk.gtk_box_layout_set_spacing
import kotlin.Boolean

/**
 * `GtkBoxLayout` is a layout manager that arranges children in a single
 * row or column.
 *
 * Whether it is a row or column depends on the value of its
 * [property@Gtk.Orientable:orientation] property. Within the other dimension
 * all children all allocated the same size. The `GtkBoxLayout` will respect
 * the [property@Gtk.Widget:halign] and [property@Gtk.Widget:valign]
 * properties of each child widget.
 *
 * If you want all children to be assigned the same size, you can use
 * the [property@Gtk.BoxLayout:homogeneous] property.
 *
 * If you want to specify the amount of space placed between each child,
 * you can use the [property@Gtk.BoxLayout:spacing] property.
 */
public open class BoxLayout(public val gtkBoxLayoutPointer: CPointer<GtkBoxLayout>) :
    LayoutManager(gtkBoxLayoutPointer.reinterpret()),
    Orientable,
    KGTyped {
    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = handle.reinterpret()

    /**
     * The child that determines the baseline of the box
     * in vertical layout.
     *
     * If the child does baseline positioning, then its baseline
     * is lined up with the baseline of the box. If it doesn't, then
     * the bottom edge of the child is used.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open var baselineChild: gint
        /**
         * Gets the value set by gtk_box_layout_set_baseline_child().
         *
         * @return the index of the child that determines the baseline
         *     in vertical layout, or -1
         * @since 4.12
         */
        get() = gtk_box_layout_get_baseline_child(gtkBoxLayoutPointer)

        /**
         * Sets the index of the child that determines the baseline
         * in vertical layout.
         *
         * @param child the child position, or -1
         * @since 4.12
         */
        @GtkVersion4_12
        set(child) = gtk_box_layout_set_baseline_child(gtkBoxLayoutPointer, child)

    /**
     * The position of the allocated baseline within the extra space
     * allocated to each child.
     *
     * This property is only relevant for horizontal layouts containing
     * at least one child with a baseline alignment.
     */
    public open var baselinePosition: BaselinePosition
        /**
         * Gets the value set by gtk_box_layout_set_baseline_position().
         *
         * @return the baseline position
         */
        get() = gtk_box_layout_get_baseline_position(gtkBoxLayoutPointer).run {
            BaselinePosition.fromNativeValue(this)
        }

        /**
         * Sets the baseline position of a box layout.
         *
         * The baseline position affects only horizontal boxes with at least one
         * baseline aligned child. If there is more vertical space available than
         * requested, and the baseline is not allocated by the parent then the
         * given @position is used to allocate the baseline within the extra
         * space available.
         *
         * @param position a `GtkBaselinePosition`
         */
        set(position) = gtk_box_layout_set_baseline_position(gtkBoxLayoutPointer, position.nativeValue)

    /**
     * Whether the box layout should distribute the available space
     * equally among the children.
     */
    public open var homogeneous: Boolean
        /**
         * Returns whether the layout is set to be homogeneous.
         *
         * @return true if the layout is homogeneous
         */
        get() = gtk_box_layout_get_homogeneous(gtkBoxLayoutPointer).asBoolean()

        /**
         * Sets whether the box layout will allocate the same
         * size to all children.
         *
         * @param homogeneous true to set the box layout as homogeneous
         */
        set(homogeneous) = gtk_box_layout_set_homogeneous(gtkBoxLayoutPointer, homogeneous.asGBoolean())

    /**
     * The space to put between the children.
     */
    public open var spacing: guint
        /**
         * Returns the space that @box_layout puts between children.
         *
         * @return the spacing of the layout
         */
        get() = gtk_box_layout_get_spacing(gtkBoxLayoutPointer)

        /**
         * Sets how much spacing to put between children.
         *
         * @param spacing the spacing to apply between children
         */
        set(spacing) = gtk_box_layout_set_spacing(gtkBoxLayoutPointer, spacing)

    /**
     * Creates a new `GtkBoxLayout`.
     *
     * @param orientation the orientation for the new layout
     * @return a new box layout
     */
    public constructor(orientation: Orientation) : this(gtk_box_layout_new(orientation.nativeValue)!!.reinterpret())

    public companion object : TypeCompanion<BoxLayout> {
        override val type: GeneratedClassKGType<BoxLayout> =
            GeneratedClassKGType(gtk_box_layout_get_type()) { BoxLayout(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of BoxLayout
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_box_layout_get_type()
    }
}
