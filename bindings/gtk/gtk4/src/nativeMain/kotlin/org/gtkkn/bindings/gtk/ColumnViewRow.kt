// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_12
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkColumnViewRow
import org.gtkkn.native.gtk.gtk_column_view_row_get_accessible_description
import org.gtkkn.native.gtk.gtk_column_view_row_get_accessible_label
import org.gtkkn.native.gtk.gtk_column_view_row_get_activatable
import org.gtkkn.native.gtk.gtk_column_view_row_get_focusable
import org.gtkkn.native.gtk.gtk_column_view_row_get_item
import org.gtkkn.native.gtk.gtk_column_view_row_get_position
import org.gtkkn.native.gtk.gtk_column_view_row_get_selectable
import org.gtkkn.native.gtk.gtk_column_view_row_get_selected
import org.gtkkn.native.gtk.gtk_column_view_row_get_type
import org.gtkkn.native.gtk.gtk_column_view_row_set_accessible_description
import org.gtkkn.native.gtk.gtk_column_view_row_set_accessible_label
import org.gtkkn.native.gtk.gtk_column_view_row_set_activatable
import org.gtkkn.native.gtk.gtk_column_view_row_set_focusable
import org.gtkkn.native.gtk.gtk_column_view_row_set_selectable
import kotlin.Boolean
import kotlin.String

/**
 * `GtkColumnViewRow` is used by [class@Gtk.ColumnView] to allow configuring
 * how rows are displayed.
 *
 * It is not used to set the widgets displayed in the individual cells. For that
 * see [method@GtkColumnViewColumn.set_factory] and [class@GtkColumnViewCell].
 * @since 4.12
 */
@GtkVersion4_12
public open class ColumnViewRow(public val gtkColumnViewRowPointer: CPointer<GtkColumnViewRow>) :
    Object(gtkColumnViewRowPointer.reinterpret()),
    KGTyped {
    /**
     * The accessible description to set on the row.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open var accessibleDescription: String
        /**
         * Gets the accessible description of @self.
         *
         * @return the accessible description
         * @since 4.12
         */
        get() = gtk_column_view_row_get_accessible_description(gtkColumnViewRowPointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * Sets the accessible description for the row,
         * which may be used by e.g. screen readers.
         *
         * @param description the description
         * @since 4.12
         */
        @GtkVersion4_12
        set(description) = gtk_column_view_row_set_accessible_description(gtkColumnViewRowPointer, description)

    /**
     * The accessible label to set on the row.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open var accessibleLabel: String
        /**
         * Gets the accessible label of @self.
         *
         * @return the accessible label
         * @since 4.12
         */
        get() = gtk_column_view_row_get_accessible_label(gtkColumnViewRowPointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * Sets the accessible label for the row,
         * which may be used by e.g. screen readers.
         *
         * @param label the label
         * @since 4.12
         */
        @GtkVersion4_12
        set(label) = gtk_column_view_row_set_accessible_label(gtkColumnViewRowPointer, label)

    /**
     * If the row can be activated by the user.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open var activatable: Boolean
        /**
         * Checks if the row has been set to be activatable via
         * gtk_column_view_row_set_activatable().
         *
         * @return true if the row is activatable
         * @since 4.12
         */
        get() = gtk_column_view_row_get_activatable(gtkColumnViewRowPointer).asBoolean()

        /**
         * Sets @self to be activatable.
         *
         * If a row is activatable, double-clicking on the row, using
         * the Return key or calling gtk_widget_activate() will activate
         * the row. Activating instructs the containing columnview to
         * emit the [signal@Gtk.ColumnView::activate] signal.
         *
         * By default, row are activatable.
         *
         * @param activatable if the row should be activatable
         * @since 4.12
         */
        @GtkVersion4_12
        set(activatable) = gtk_column_view_row_set_activatable(gtkColumnViewRowPointer, activatable.asGBoolean())

    /**
     * If the row can be focused with the keyboard.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open var focusable: Boolean
        /**
         * Checks if a row item has been set to be focusable via
         * gtk_column_view_row_set_focusable().
         *
         * @return true if the row is focusable
         * @since 4.12
         */
        get() = gtk_column_view_row_get_focusable(gtkColumnViewRowPointer).asBoolean()

        /**
         * Sets @self to be focusable.
         *
         * If a row is focusable, it can be focused using the keyboard.
         * This works similar to [method@Gtk.Widget.set_focusable].
         *
         * Note that if row are not focusable, the contents of cells can still be focused if
         * they are focusable.
         *
         * By default, rows are focusable.
         *
         * @param focusable if the row should be focusable
         * @since 4.12
         */
        @GtkVersion4_12
        set(focusable) = gtk_column_view_row_set_focusable(gtkColumnViewRowPointer, focusable.asGBoolean())

    /**
     * The item for this row.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open val item: Object?
        /**
         * Gets the model item that associated with @self.
         *
         * If @self is unbound, this function returns null.
         *
         * @return The item displayed
         * @since 4.12
         */
        get() = gtk_column_view_row_get_item(gtkColumnViewRowPointer)?.run {
            Object(reinterpret())
        }

    /**
     * Position of the row.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open val position: guint
        /**
         * Gets the position in the model that @self currently displays.
         *
         * If @self is unbound, %GTK_INVALID_LIST_POSITION is returned.
         *
         * @return The position of this row
         * @since 4.12
         */
        get() = gtk_column_view_row_get_position(gtkColumnViewRowPointer)

    /**
     * If the row can be selected by the user.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open var selectable: Boolean
        /**
         * Checks if the row has been set to be selectable via
         * gtk_column_view_row_set_selectable().
         *
         * Do not confuse this function with [method@Gtk.ColumnViewRow.get_selected].
         *
         * @return true if the row is selectable
         * @since 4.12
         */
        get() = gtk_column_view_row_get_selectable(gtkColumnViewRowPointer).asBoolean()

        /**
         * Sets @self to be selectable.
         *
         * If a row is selectable, clicking on the row or using the keyboard
         * will try to select or unselect the row. Whether this succeeds is up to
         * the model to determine, as it is managing the selected state.
         *
         * Note that this means that making a row non-selectable has no
         * influence on the selected state at all. A non-selectable row
         * may still be selected.
         *
         * By default, rows are selectable.
         *
         * @param selectable if the row should be selectable
         * @since 4.12
         */
        @GtkVersion4_12
        set(selectable) = gtk_column_view_row_set_selectable(gtkColumnViewRowPointer, selectable.asGBoolean())

    /**
     * If the item in the row is currently selected.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open val selected: Boolean
        /**
         * Checks if the item is selected that this row corresponds to.
         *
         * The selected state is maintained by the list widget and its model
         * and cannot be set otherwise.
         *
         * @return true if the item is selected.
         * @since 4.12
         */
        get() = gtk_column_view_row_get_selected(gtkColumnViewRowPointer).asBoolean()

    public companion object : TypeCompanion<ColumnViewRow> {
        override val type: GeneratedClassKGType<ColumnViewRow> =
            GeneratedClassKGType(gtk_column_view_row_get_type()) { ColumnViewRow(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ColumnViewRow
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_column_view_row_get_type()
    }
}
