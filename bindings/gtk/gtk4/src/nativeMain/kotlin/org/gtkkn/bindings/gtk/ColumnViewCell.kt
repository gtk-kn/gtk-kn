// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_12
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkColumnViewCell
import org.gtkkn.native.gtk.gtk_column_view_cell_get_child
import org.gtkkn.native.gtk.gtk_column_view_cell_get_focusable
import org.gtkkn.native.gtk.gtk_column_view_cell_get_item
import org.gtkkn.native.gtk.gtk_column_view_cell_get_position
import org.gtkkn.native.gtk.gtk_column_view_cell_get_selected
import org.gtkkn.native.gtk.gtk_column_view_cell_get_type
import org.gtkkn.native.gtk.gtk_column_view_cell_set_child
import org.gtkkn.native.gtk.gtk_column_view_cell_set_focusable
import kotlin.Boolean

/**
 * `GtkColumnViewCell` is used by [class@Gtk.ColumnViewColumn] to represent items
 * in a cell in [class@Gtk.ColumnView].
 *
 * The `GtkColumnViewCell`s are managed by the columnview widget (with its factory)
 * and cannot be created by applications, but they need to be populated
 * by application code. This is done by calling [method@Gtk.ColumnViewCell.set_child].
 *
 * `GtkColumnViewCell`s exist in 2 stages:
 *
 * 1. The unbound stage where the listitem is not currently connected to
 *    an item in the list. In that case, the [property@Gtk.ColumnViewCell:item]
 *    property is set to null.
 *
 * 2. The bound stage where the listitem references an item from the list.
 *    The [property@Gtk.ColumnViewCell:item] property is not null.
 * @since 4.12
 */
@GtkVersion4_12
public open class ColumnViewCell(public val gtkColumnViewCellPointer: CPointer<GtkColumnViewCell>) :
    ListItem(gtkColumnViewCellPointer.reinterpret()),
    KGTyped {
    /**
     * Widget used for display.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public override var child: Widget?
        /**
         * Gets the child previously set via gtk_column_view_cell_set_child() or
         * null if none was set.
         *
         * @return The child
         * @since 4.12
         */
        get() = gtk_column_view_cell_get_child(gtkColumnViewCellPointer)?.run {
            Widget.WidgetImpl(this)
        }

        /**
         * Sets the child to be used for this listitem.
         *
         * This function is typically called by applications when
         * setting up a listitem so that the widget can be reused when
         * binding it multiple times.
         *
         * @param child The list item's child or null to unset
         * @since 4.12
         */
        @GtkVersion4_12
        set(child) = gtk_column_view_cell_set_child(gtkColumnViewCellPointer, child?.gtkWidgetPointer)

    /**
     * If the item can be focused with the keyboard.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public override var focusable: Boolean
        /**
         * Checks if a list item has been set to be focusable via
         * gtk_column_view_cell_set_focusable().
         *
         * @return true if the item is focusable
         * @since 4.12
         */
        get() = gtk_column_view_cell_get_focusable(gtkColumnViewCellPointer).asBoolean()

        /**
         * Sets @self to be focusable.
         *
         * If an item is focusable, it can be focused using the keyboard.
         * This works similar to [method@Gtk.Widget.set_focusable].
         *
         * Note that if items are not focusable, the keyboard cannot be used to activate
         * them and selecting only works if one of the listitem's children is focusable.
         *
         * By default, list items are focusable.
         *
         * @param focusable if the item should be focusable
         * @since 4.12
         */
        @GtkVersion4_12
        set(focusable) = gtk_column_view_cell_set_focusable(gtkColumnViewCellPointer, focusable.asGBoolean())

    /**
     * Displayed item.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public override val item: Object?
        /**
         * Gets the model item that associated with @self.
         *
         * If @self is unbound, this function returns null.
         *
         * @return The item displayed
         * @since 4.12
         */
        get() = gtk_column_view_cell_get_item(gtkColumnViewCellPointer)?.run {
            Object(reinterpret())
        }

    /**
     * Position of the item.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public override val position: guint
        /**
         * Gets the position in the model that @self currently displays.
         *
         * If @self is unbound, %GTK_INVALID_LIST_POSITION is returned.
         *
         * @return The position of this item
         * @since 4.12
         */
        get() = gtk_column_view_cell_get_position(gtkColumnViewCellPointer)

    /**
     * If the item is currently selected.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public override val selected: Boolean
        /**
         * Checks if the item is displayed as selected.
         *
         * The selected state is maintained by the liste widget and its model
         * and cannot be set otherwise.
         *
         * @return true if the item is selected.
         * @since 4.12
         */
        get() = gtk_column_view_cell_get_selected(gtkColumnViewCellPointer).asBoolean()

    public companion object : TypeCompanion<ColumnViewCell> {
        override val type: GeneratedClassKGType<ColumnViewCell> =
            GeneratedClassKGType(gtk_column_view_cell_get_type()) { ColumnViewCell(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ColumnViewCell
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_column_view_cell_get_type()
    }
}
