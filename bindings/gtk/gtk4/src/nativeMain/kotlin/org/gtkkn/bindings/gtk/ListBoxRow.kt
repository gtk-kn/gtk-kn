// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkListBoxRow
import org.gtkkn.native.gtk.gtk_list_box_row_changed
import org.gtkkn.native.gtk.gtk_list_box_row_get_activatable
import org.gtkkn.native.gtk.gtk_list_box_row_get_child
import org.gtkkn.native.gtk.gtk_list_box_row_get_header
import org.gtkkn.native.gtk.gtk_list_box_row_get_index
import org.gtkkn.native.gtk.gtk_list_box_row_get_selectable
import org.gtkkn.native.gtk.gtk_list_box_row_get_type
import org.gtkkn.native.gtk.gtk_list_box_row_is_selected
import org.gtkkn.native.gtk.gtk_list_box_row_new
import org.gtkkn.native.gtk.gtk_list_box_row_set_activatable
import org.gtkkn.native.gtk.gtk_list_box_row_set_child
import org.gtkkn.native.gtk.gtk_list_box_row_set_header
import org.gtkkn.native.gtk.gtk_list_box_row_set_selectable
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkListBoxRow` is the kind of widget that can be added to a `GtkListBox`.
 */
public open class ListBoxRow(pointer: CPointer<GtkListBoxRow>) :
    Widget(pointer.reinterpret()),
    Actionable,
    KGTyped {
    public val gtkListBoxRowPointer: CPointer<GtkListBoxRow>
        get() = gPointer.reinterpret()

    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * Determines whether the ::row-activated
     * signal will be emitted for this row.
     */
    public open var activatable: Boolean
        /**
         * Gets whether the row is activatable.
         *
         * @return true if the row is activatable
         */
        get() = gtk_list_box_row_get_activatable(gtkListBoxRowPointer.reinterpret()).asBoolean()

        /**
         * Set whether the row is activatable.
         *
         * @param activatable true to mark the row as activatable
         */
        set(
            activatable
        ) = gtk_list_box_row_set_activatable(gtkListBoxRowPointer.reinterpret(), activatable.asGBoolean())

    /**
     * The child widget.
     */
    public open var child: Widget?
        /**
         * Gets the child widget of @row.
         *
         * @return the child widget of @row
         */
        get() = gtk_list_box_row_get_child(gtkListBoxRowPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

        /**
         * Sets the child widget of @self.
         *
         * @param child the child widget
         */
        set(
            child
        ) = gtk_list_box_row_set_child(gtkListBoxRowPointer.reinterpret(), child?.gtkWidgetPointer?.reinterpret())

    /**
     * Determines whether this row can be selected.
     */
    public open var selectable: Boolean
        /**
         * Gets whether the row can be selected.
         *
         * @return true if the row is selectable
         */
        get() = gtk_list_box_row_get_selectable(gtkListBoxRowPointer.reinterpret()).asBoolean()

        /**
         * Set whether the row can be selected.
         *
         * @param selectable true to mark the row as selectable
         */
        set(selectable) = gtk_list_box_row_set_selectable(gtkListBoxRowPointer.reinterpret(), selectable.asGBoolean())

    /**
     * Creates a new `GtkListBoxRow`.
     *
     * @return a new `GtkListBoxRow`
     */
    public constructor() : this(gtk_list_box_row_new()!!.reinterpret())

    /**
     * Marks @row as changed, causing any state that depends on this
     * to be updated.
     *
     * This affects sorting, filtering and headers.
     *
     * Note that calls to this method must be in sync with the data
     * used for the row functions. For instance, if the list is
     * mirroring some external data set, and *two* rows changed in the
     * external data set then when you call gtk_list_box_row_changed()
     * on the first row the sort function must only read the new data
     * for the first of the two changed rows, otherwise the resorting
     * of the rows will be wrong.
     *
     * This generally means that if you don’t fully control the data
     * model you have to duplicate the data that affects the listbox
     * row functions into the row widgets themselves. Another alternative
     * is to call [method@Gtk.ListBox.invalidate_sort] on any model change,
     * but that is more expensive.
     */
    public open fun changed(): Unit = gtk_list_box_row_changed(gtkListBoxRowPointer.reinterpret())

    /**
     * Returns the current header of the @row.
     *
     * This can be used
     * in a [callback@Gtk.ListBoxUpdateHeaderFunc] to see if
     * there is a header set already, and if so to update
     * the state of it.
     *
     * @return the current header
     */
    public open fun getHeader(): Widget? = gtk_list_box_row_get_header(gtkListBoxRowPointer.reinterpret())?.run {
        Widget(reinterpret())
    }

    /**
     * Gets the current index of the @row in its `GtkListBox` container.
     *
     * @return the index of the @row, or -1 if the @row is not in a listbox
     */
    public open fun getIndex(): gint = gtk_list_box_row_get_index(gtkListBoxRowPointer.reinterpret())

    /**
     * Returns whether the child is currently selected in its
     * `GtkListBox` container.
     *
     * @return true if @row is selected
     */
    public open fun isSelected(): Boolean = gtk_list_box_row_is_selected(gtkListBoxRowPointer.reinterpret()).asBoolean()

    /**
     * Sets the current header of the @row.
     *
     * This is only allowed to be called
     * from a [callback@Gtk.ListBoxUpdateHeaderFunc].
     * It will replace any existing header in the row,
     * and be shown in front of the row in the listbox.
     *
     * @param header the header
     */
    public open fun setHeader(`header`: Widget? = null): Unit =
        gtk_list_box_row_set_header(gtkListBoxRowPointer.reinterpret(), `header`?.gtkWidgetPointer?.reinterpret())

    /**
     * This is a keybinding signal, which will cause this row to be activated.
     *
     * If you want to be notified when the user activates a row (by key or not),
     * use the [signal@Gtk.ListBox::row-activated] signal on the row’s parent
     * `GtkListBox`.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectActivate(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "activate",
            connectActivateFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<ListBoxRow> {
        override val type: GeneratedClassKGType<ListBoxRow> =
            GeneratedClassKGType(gtk_list_box_row_get_type()) { ListBoxRow(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ListBoxRow
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_list_box_row_get_type()
    }
}

private val connectActivateFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()
