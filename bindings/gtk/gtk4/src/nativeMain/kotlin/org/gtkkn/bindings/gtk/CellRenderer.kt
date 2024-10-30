// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.Event
import org.gtkkn.bindings.gdk.Rectangle
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.InitiallyUnowned
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkCellEditable
import org.gtkkn.native.gtk.GtkCellRenderer
import org.gtkkn.native.gtk.gtk_cell_renderer_activate
import org.gtkkn.native.gtk.gtk_cell_renderer_get_aligned_area
import org.gtkkn.native.gtk.gtk_cell_renderer_get_is_expanded
import org.gtkkn.native.gtk.gtk_cell_renderer_get_is_expander
import org.gtkkn.native.gtk.gtk_cell_renderer_get_preferred_size
import org.gtkkn.native.gtk.gtk_cell_renderer_get_request_mode
import org.gtkkn.native.gtk.gtk_cell_renderer_get_sensitive
import org.gtkkn.native.gtk.gtk_cell_renderer_get_state
import org.gtkkn.native.gtk.gtk_cell_renderer_get_type
import org.gtkkn.native.gtk.gtk_cell_renderer_get_visible
import org.gtkkn.native.gtk.gtk_cell_renderer_is_activatable
import org.gtkkn.native.gtk.gtk_cell_renderer_set_alignment
import org.gtkkn.native.gtk.gtk_cell_renderer_set_fixed_size
import org.gtkkn.native.gtk.gtk_cell_renderer_set_is_expanded
import org.gtkkn.native.gtk.gtk_cell_renderer_set_is_expander
import org.gtkkn.native.gtk.gtk_cell_renderer_set_padding
import org.gtkkn.native.gtk.gtk_cell_renderer_set_sensitive
import org.gtkkn.native.gtk.gtk_cell_renderer_set_visible
import org.gtkkn.native.gtk.gtk_cell_renderer_start_editing
import org.gtkkn.native.gtk.gtk_cell_renderer_stop_editing
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * An object for rendering a single cell
 *
 * The `GtkCellRenderer` is a base class of a set of objects used for
 * rendering a cell to a `cairo_t`.  These objects are used primarily by
 * the `GtkTreeView` widget, though they aren’t tied to them in any
 * specific way.  It is worth noting that `GtkCellRenderer` is not a
 * `GtkWidget` and cannot be treated as such.
 *
 * The primary use of a `GtkCellRenderer` is for drawing a certain graphical
 * elements on a `cairo_t`. Typically, one cell renderer is used to
 * draw many cells on the screen.  To this extent, it isn’t expected that a
 * CellRenderer keep any permanent state around.  Instead, any state is set
 * just prior to use using `GObject`s property system.  Then, the
 * cell is measured using gtk_cell_renderer_get_preferred_size(). Finally, the cell
 * is rendered in the correct location using gtk_cell_renderer_snapshot().
 *
 * There are a number of rules that must be followed when writing a new
 * `GtkCellRenderer`.  First and foremost, it’s important that a certain set
 * of properties will always yield a cell renderer of the same size,
 * barring a style change. The `GtkCellRenderer` also has a number of
 * generic properties that are expected to be honored by all children.
 *
 * Beyond merely rendering a cell, cell renderers can optionally
 * provide active user interface elements. A cell renderer can be
 * “activatable” like `GtkCellRenderer`Toggle,
 * which toggles when it gets activated by a mouse click, or it can be
 * “editable” like `GtkCellRenderer`Text, which
 * allows the user to edit the text using a widget implementing the
 * `GtkCellEditable` interface, e.g. `GtkEntry`.
 * To make a cell renderer activatable or editable, you have to
 * implement the `GtkCellRenderer`Class.activate or
 * `GtkCellRenderer`Class.start_editing virtual functions, respectively.
 *
 * Many properties of `GtkCellRenderer` and its subclasses have a
 * corresponding “set” property, e.g. “cell-background-set” corresponds
 * to “cell-background”. These “set” properties reflect whether a property
 * has been set or not. You should not set them independently.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `xalign`: xalign: Out parameter is not supported
 * - parameter `width`: width: Out parameter is not supported
 * - parameter `xpad`: xpad: Out parameter is not supported
 * - parameter `minimum_size`: minimum_size: Out parameter is not supported
 * - parameter `minimum_height`: minimum_height: Out parameter is not supported
 * - parameter `minimum_size`: minimum_size: Out parameter is not supported
 * - parameter `minimum_width`: minimum_width: Out parameter is not supported
 * - parameter `snapshot`: Snapshot
 * - method `cell-background`: Property has no getter nor setter
 * - method `cell-background-rgba`: Property has no getter nor setter
 * - method `cell-background-set`: Property has no getter nor setter
 * - method `editing`: Property has no getter nor setter
 * - method `height`: Property has no getter nor setter
 * - method `mode`: Property has no getter nor setter
 * - method `width`: Property has no getter nor setter
 * - method `xalign`: Property has no getter nor setter
 * - method `xpad`: Property has no getter nor setter
 * - method `yalign`: Property has no getter nor setter
 * - method `ypad`: Property has no getter nor setter
 */
public open class CellRenderer(
    pointer: CPointer<GtkCellRenderer>,
) : InitiallyUnowned(pointer.reinterpret()),
    KGTyped {
    public val gtkCellRendererPointer: CPointer<GtkCellRenderer>
        get() = gPointer.reinterpret()

    public open var isExpanded: Boolean
        /**
         * Checks whether the given `GtkCellRenderer` is expanded.
         *
         * @return true if the cell renderer is expanded
         */
        get() = gtk_cell_renderer_get_is_expanded(gtkCellRendererPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the given `GtkCellRenderer` is expanded.
         *
         * @param isExpanded whether @cell should be expanded
         */
        set(
            isExpanded
        ) = gtk_cell_renderer_set_is_expanded(gtkCellRendererPointer.reinterpret(), isExpanded.asGBoolean())

    public open var isExpander: Boolean
        /**
         * Checks whether the given `GtkCellRenderer` is an expander.
         *
         * @return true if @cell is an expander, and false otherwise
         */
        get() = gtk_cell_renderer_get_is_expander(gtkCellRendererPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the given `GtkCellRenderer` is an expander.
         *
         * @param isExpander whether @cell is an expander
         */
        set(
            isExpander
        ) = gtk_cell_renderer_set_is_expander(gtkCellRendererPointer.reinterpret(), isExpander.asGBoolean())

    public open var sensitive: Boolean
        /**
         * Returns the cell renderer’s sensitivity.
         *
         * @return true if the cell renderer is sensitive
         */
        get() = gtk_cell_renderer_get_sensitive(gtkCellRendererPointer.reinterpret()).asBoolean()

        /**
         * Sets the cell renderer’s sensitivity.
         *
         * @param sensitive the sensitivity of the cell
         */
        set(sensitive) = gtk_cell_renderer_set_sensitive(gtkCellRendererPointer.reinterpret(), sensitive.asGBoolean())

    public open var visible: Boolean
        /**
         * Returns the cell renderer’s visibility.
         *
         * @return true if the cell renderer is visible
         */
        get() = gtk_cell_renderer_get_visible(gtkCellRendererPointer.reinterpret()).asBoolean()

        /**
         * Sets the cell renderer’s visibility.
         *
         * @param visible the visibility of the cell
         */
        set(visible) = gtk_cell_renderer_set_visible(gtkCellRendererPointer.reinterpret(), visible.asGBoolean())

    /**
     * Passes an activate event to the cell renderer for possible processing.
     * Some cell renderers may use events; for example, `GtkCellRendererToggle`
     * toggles when it gets a mouse click.
     *
     * @param event a `GdkEvent`
     * @param widget widget that received the event
     * @param path widget-dependent string representation of the event location;
     *    e.g. for `GtkTreeView`, a string representation of `GtkTreePath`
     * @param backgroundArea background area as passed to gtk_cell_renderer_render()
     * @param cellArea cell area as passed to gtk_cell_renderer_render()
     * @param flags render flags
     * @return true if the event was consumed/handled
     */
    public open fun activate(
        event: Event,
        widget: Widget,
        path: String,
        backgroundArea: Rectangle,
        cellArea: Rectangle,
        flags: CellRendererState,
    ): Boolean =
        gtk_cell_renderer_activate(
            gtkCellRendererPointer.reinterpret(),
            event.gPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret(),
            path,
            backgroundArea.gdkRectanglePointer,
            cellArea.gdkRectanglePointer,
            flags.mask
        ).asBoolean()

    /**
     * Gets the aligned area used by @cell inside @cell_area. Used for finding
     * the appropriate edit and focus rectangle.
     *
     * @param widget the `GtkWidget` this cell will be rendering to
     * @param flags render flags
     * @param cellArea cell area which would be passed to gtk_cell_renderer_render()
     * @param alignedArea the return location for the space inside @cell_area
     *                that would actually be used to render.
     */
    public open fun getAlignedArea(
        widget: Widget,
        flags: CellRendererState,
        cellArea: Rectangle,
        alignedArea: Rectangle,
    ): Unit =
        gtk_cell_renderer_get_aligned_area(
            gtkCellRendererPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret(),
            flags.mask,
            cellArea.gdkRectanglePointer,
            alignedArea.gdkRectanglePointer
        )

    /**
     * Checks whether the given `GtkCellRenderer` is expanded.
     *
     * @return true if the cell renderer is expanded
     */
    public open fun getIsExpanded(): Boolean =
        gtk_cell_renderer_get_is_expanded(gtkCellRendererPointer.reinterpret()).asBoolean()

    /**
     * Checks whether the given `GtkCellRenderer` is an expander.
     *
     * @return true if @cell is an expander, and false otherwise
     */
    public open fun getIsExpander(): Boolean =
        gtk_cell_renderer_get_is_expander(gtkCellRendererPointer.reinterpret()).asBoolean()

    /**
     * Retrieves the minimum and natural size of a cell taking
     * into account the widget’s preference for height-for-width management.
     *
     * @param widget the `GtkWidget` this cell will be rendering to
     * @param minimumSize location for storing the minimum size
     * @param naturalSize location for storing the natural size
     */
    public open fun getPreferredSize(
        widget: Widget,
        minimumSize: Requisition?,
        naturalSize: Requisition?,
    ): Unit =
        gtk_cell_renderer_get_preferred_size(
            gtkCellRendererPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret(),
            minimumSize?.gtkRequisitionPointer,
            naturalSize?.gtkRequisitionPointer
        )

    /**
     * Gets whether the cell renderer prefers a height-for-width layout
     * or a width-for-height layout.
     *
     * @return The `GtkSizeRequestMode` preferred by this renderer.
     */
    public open fun getRequestMode(): SizeRequestMode =
        gtk_cell_renderer_get_request_mode(gtkCellRendererPointer.reinterpret()).run {
            SizeRequestMode.fromNativeValue(this)
        }

    /**
     * Returns the cell renderer’s sensitivity.
     *
     * @return true if the cell renderer is sensitive
     */
    public open fun getSensitive(): Boolean =
        gtk_cell_renderer_get_sensitive(gtkCellRendererPointer.reinterpret()).asBoolean()

    /**
     * Translates the cell renderer state to `GtkStateFlags`,
     * based on the cell renderer and widget sensitivity, and
     * the given `GtkCellRenderer`State.
     *
     * @param widget a `GtkWidget`
     * @param cellState cell renderer state
     * @return the widget state flags applying to @cell
     */
    public open fun getState(
        widget: Widget? = null,
        cellState: CellRendererState,
    ): StateFlags =
        gtk_cell_renderer_get_state(
            gtkCellRendererPointer.reinterpret(),
            widget?.gtkWidgetPointer?.reinterpret(),
            cellState.mask
        ).run {
            StateFlags(this)
        }

    /**
     * Returns the cell renderer’s visibility.
     *
     * @return true if the cell renderer is visible
     */
    public open fun getVisible(): Boolean =
        gtk_cell_renderer_get_visible(gtkCellRendererPointer.reinterpret()).asBoolean()

    /**
     * Checks whether the cell renderer can do something when activated.
     *
     * @return true if the cell renderer can do anything when activated
     */
    public open fun isActivatable(): Boolean =
        gtk_cell_renderer_is_activatable(gtkCellRendererPointer.reinterpret()).asBoolean()

    /**
     * Sets the renderer’s alignment within its available space.
     *
     * @param xalign the x alignment of the cell renderer
     * @param yalign the y alignment of the cell renderer
     */
    public open fun setAlignment(
        xalign: Float,
        yalign: Float,
    ): Unit = gtk_cell_renderer_set_alignment(gtkCellRendererPointer.reinterpret(), xalign, yalign)

    /**
     * Sets the renderer size to be explicit, independent of the properties set.
     *
     * @param width the width of the cell renderer, or -1
     * @param height the height of the cell renderer, or -1
     */
    public open fun setFixedSize(
        width: Int,
        height: Int,
    ): Unit = gtk_cell_renderer_set_fixed_size(gtkCellRendererPointer.reinterpret(), width, height)

    /**
     * Sets whether the given `GtkCellRenderer` is expanded.
     *
     * @param isExpanded whether @cell should be expanded
     */
    public open fun setIsExpanded(isExpanded: Boolean): Unit =
        gtk_cell_renderer_set_is_expanded(gtkCellRendererPointer.reinterpret(), isExpanded.asGBoolean())

    /**
     * Sets whether the given `GtkCellRenderer` is an expander.
     *
     * @param isExpander whether @cell is an expander
     */
    public open fun setIsExpander(isExpander: Boolean): Unit =
        gtk_cell_renderer_set_is_expander(gtkCellRendererPointer.reinterpret(), isExpander.asGBoolean())

    /**
     * Sets the renderer’s padding.
     *
     * @param xpad the x padding of the cell renderer
     * @param ypad the y padding of the cell renderer
     */
    public open fun setPadding(
        xpad: Int,
        ypad: Int,
    ): Unit = gtk_cell_renderer_set_padding(gtkCellRendererPointer.reinterpret(), xpad, ypad)

    /**
     * Sets the cell renderer’s sensitivity.
     *
     * @param sensitive the sensitivity of the cell
     */
    public open fun setSensitive(sensitive: Boolean): Unit =
        gtk_cell_renderer_set_sensitive(gtkCellRendererPointer.reinterpret(), sensitive.asGBoolean())

    /**
     * Sets the cell renderer’s visibility.
     *
     * @param visible the visibility of the cell
     */
    public open fun setVisible(visible: Boolean): Unit =
        gtk_cell_renderer_set_visible(gtkCellRendererPointer.reinterpret(), visible.asGBoolean())

    /**
     * Starts editing the contents of this @cell, through a new `GtkCellEditable`
     * widget created by the `GtkCellRenderer`Class.start_editing virtual function.
     *
     * @param event a `GdkEvent`
     * @param widget widget that received the event
     * @param path widget-dependent string representation of the event location;
     *    e.g. for `GtkTreeView`, a string representation of `GtkTreePath`
     * @param backgroundArea background area as passed to gtk_cell_renderer_render()
     * @param cellArea cell area as passed to gtk_cell_renderer_render()
     * @param flags render flags
     * @return A new `GtkCellEditable` for editing this
     *   @cell, or null if editing is not possible
     */
    public open fun startEditing(
        event: Event? = null,
        widget: Widget,
        path: String,
        backgroundArea: Rectangle,
        cellArea: Rectangle,
        flags: CellRendererState,
    ): CellEditable? =
        gtk_cell_renderer_start_editing(
            gtkCellRendererPointer.reinterpret(),
            event?.gPointer?.reinterpret(),
            widget.gtkWidgetPointer.reinterpret(),
            path,
            backgroundArea.gdkRectanglePointer,
            cellArea.gdkRectanglePointer,
            flags.mask
        )?.run {
            CellEditable.wrap(reinterpret())
        }

    /**
     * Informs the cell renderer that the editing is stopped.
     * If @canceled is true, the cell renderer will emit the
     * `GtkCellRenderer`::editing-canceled signal.
     *
     * This function should be called by cell renderer implementations
     * in response to the `GtkCellEditable::editing-done` signal of
     * `GtkCellEditable`.
     *
     * @param canceled true if the editing has been canceled
     */
    public open fun stopEditing(canceled: Boolean): Unit =
        gtk_cell_renderer_stop_editing(gtkCellRendererPointer.reinterpret(), canceled.asGBoolean())

    /**
     * This signal gets emitted when the user cancels the process of editing a
     * cell.  For example, an editable cell renderer could be written to cancel
     * editing when the user presses Escape.
     *
     * See also: gtk_cell_renderer_stop_editing().
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectEditingCanceled(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "editing-canceled",
            connectEditingCanceledFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * This signal gets emitted when a cell starts to be edited.
     * The intended use of this signal is to do special setup
     * on @editable, e.g. adding a `GtkEntryCompletion` or setting
     * up additional columns in a `GtkComboBox`.
     *
     * See gtk_cell_editable_start_editing() for information on the lifecycle of
     * the @editable and a way to do setup that doesn’t depend on the @renderer.
     *
     * Note that GTK doesn't guarantee that cell renderers will
     * continue to use the same kind of widget for editing in future
     * releases, therefore you should check the type of @editable
     * before doing any specific setup, as in the following example:
     * |[<!-- language="C" -->
     * static void
     * text_editing_started (GtkCellRenderer *cell,
     *                       GtkCellEditable *editable,
     *                       const char      *path,
     *                       gpointer         data)
     * {
     *   if (GTK_IS_ENTRY (editable))
     *     {
     *       GtkEntry *entry = GTK_ENTRY (editable);
     *
     *       // ... create a GtkEntryCompletion
     *
     *       gtk_entry_set_completion (entry, completion);
     *     }
     * }
     * ]|
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `editable` the `GtkCellEditable`; `path` the path identifying the edited cell
     */
    public fun connectEditingStarted(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (editable: CellEditable, path: String) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "editing-started",
            connectEditingStartedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<CellRenderer> {
        override val type: GeneratedClassKGType<CellRenderer> =
            GeneratedClassKGType(gtk_cell_renderer_get_type()) { CellRenderer(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectEditingCanceledFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectEditingStartedFunc:
    CPointer<CFunction<(CPointer<GtkCellEditable>, CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            editable: CPointer<GtkCellEditable>?,
            path: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(editable: CellEditable, path: String) -> Unit>().get().invoke(
            editable!!.run {
                CellEditable.wrap(reinterpret())
            },
            path?.toKString() ?: error("Expected not null string")
        )
    }.reinterpret()
