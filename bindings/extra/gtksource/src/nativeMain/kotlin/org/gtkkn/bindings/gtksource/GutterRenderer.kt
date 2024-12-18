// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gdk.ModifierType
import org.gtkkn.bindings.gdk.Rectangle
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.TextIter
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkModifierType
import org.gtkkn.native.gdk.GdkRectangle
import org.gtkkn.native.gobject.GObject
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.gboolean
import org.gtkkn.native.gobject.gfloat
import org.gtkkn.native.gobject.gint
import org.gtkkn.native.gobject.guint
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkTextIter
import org.gtkkn.native.gtksource.GtkSourceGutterRenderer
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_activate
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_get_alignment_mode
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_get_buffer
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_get_type
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_get_view
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_get_xalign
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_get_xpad
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_get_yalign
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_get_ypad
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_query_activatable
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_set_alignment_mode
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_set_xalign
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_set_xpad
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_set_yalign
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_set_ypad
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * Gutter cell renderer.
 *
 * A `GtkSourceGutterRenderer` represents a column in a [class@Gutter]. The
 * column contains one cell for each visible line of the [class@Gtk.TextBuffer]. Due to
 * text wrapping, a cell can thus span multiple lines of the [class@Gtk.TextView]. In
 * this case, [enum@GutterRendererAlignmentMode] controls the alignment of
 * the cell.
 *
 * The gutter renderer is a [class@Gtk.Widget] and is measured using the normal widget
 * measurement facilities. The width of the gutter will be determined by the
 * measurements of the gutter renderers.
 *
 * The width of a gutter renderer generally takes into account the entire text
 * buffer. For instance, to display the line numbers, if the buffer contains 100
 * lines, the gutter renderer will always set its width such as three digits can
 * be printed, even if only the first 20 lines are shown. Another strategy is to
 * take into account only the visible lines.  In this case, only two digits are
 * necessary to display the line numbers of the first 20 lines. To take another
 * example, the gutter renderer for [class@Mark]s doesn't need to take
 * into account the text buffer to announce its width. It only depends on the
 * icons size displayed in the gutter column.
 *
 * When the available size to render a cell is greater than the required size to
 * render the cell contents, the cell contents can be aligned horizontally and
 * vertically with [method@GutterRenderer.set_alignment_mode].
 *
 * The cells rendering occurs using [vfunc@Gtk.Widget.snapshot]. Implementations
 * should use `gtk_source_gutter_renderer_get_lines()` to retrieve information
 * about the lines to be rendered. To help with aligning content which takes
 * into account the padding and alignment of a cell, implementations may call
 * [method@GutterRenderer.align_cell] for a given line number with the
 * width and height measurement of the content they width to render.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `x`: x: Out parameter is not supported
 * - method `lines`: Property has no getter nor setter
 */
public open class GutterRenderer(pointer: CPointer<GtkSourceGutterRenderer>) :
    Widget(pointer.reinterpret()),
    KGTyped {
    public val gtksourceGutterRendererPointer: CPointer<GtkSourceGutterRenderer>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The alignment mode of the renderer.
     *
     * This can be used to indicate that in the case a cell spans multiple lines (due to text wrapping)
     * the alignment should work on either the full cell, the first line or the last line.
     */
    public open var alignmentMode: GutterRendererAlignmentMode
        /**
         * Get the alignment mode.
         *
         * The alignment mode describes the manner in which the
         * renderer is aligned (see [property@GutterRenderer:xalign] and
         * [property@GutterRenderer:yalign]).
         *
         * @return a #GtkSourceGutterRendererAlignmentMode
         */
        get() = gtk_source_gutter_renderer_get_alignment_mode(gtksourceGutterRendererPointer.reinterpret()).run {
            GutterRendererAlignmentMode.fromNativeValue(this)
        }

        /**
         * Set the alignment mode. The alignment mode describes the manner in which the
         * renderer is aligned (see [property@GutterRenderer:xalign] and
         * [property@GutterRenderer:yalign]).
         *
         * @param mode a #GtkSourceGutterRendererAlignmentMode
         */
        set(
            mode
        ) = gtk_source_gutter_renderer_set_alignment_mode(
            gtksourceGutterRendererPointer.reinterpret(),
            mode.nativeValue
        )

    /**
     * The view on which the renderer is placed.
     */
    public open val view: View
        /**
         * Get the view associated to the gutter renderer
         *
         * @return a #GtkSourceView
         */
        get() = gtk_source_gutter_renderer_get_view(gtksourceGutterRendererPointer.reinterpret())!!.run {
            View(reinterpret())
        }

    /**
     * The horizontal alignment of the renderer.
     *
     * Set to 0 for a left alignment. 1 for a right alignment. And 0.5 for centering the cells.
     * A value lower than 0 doesn't modify the alignment.
     */
    public open var xalign: gfloat
        /**
         * Gets the `xalign` property.
         *
         * This may be used to adjust where within the cell rectangle the renderer will draw.
         */
        get() = gtk_source_gutter_renderer_get_xalign(gtksourceGutterRendererPointer.reinterpret())

        /**
         * Adjusts the `xalign` property.
         *
         * This may be used to adjust where within the cell rectangle the renderer will draw.
         *
         * @param xalign the Y padding for the drawing cell
         */
        set(xalign) = gtk_source_gutter_renderer_set_xalign(gtksourceGutterRendererPointer.reinterpret(), xalign)

    /**
     * The left and right padding of the renderer.
     */
    public open var xpad: gint
        /**
         * Gets the `xpad` property.
         *
         * This may be used to adjust the cell rectangle that the renderer will use to draw.
         */
        get() = gtk_source_gutter_renderer_get_xpad(gtksourceGutterRendererPointer.reinterpret())

        /**
         * Adjusts the `xpad` property.
         *
         * This may be used to adjust the cell rectangle that the renderer will use to draw.
         *
         * @param xpad the Y padding for the drawing cell
         */
        set(xpad) = gtk_source_gutter_renderer_set_xpad(gtksourceGutterRendererPointer.reinterpret(), xpad)

    /**
     * The vertical alignment of the renderer.
     *
     * Set to 0 for a top alignment. 1 for a bottom alignment. And 0.5 for centering the cells.
     * A value lower than 0 doesn't modify the alignment.
     */
    public open var yalign: gfloat
        /**
         * Gets the `yalign` property.
         *
         * This may be used to adjust where within the cell rectangle the renderer will draw.
         */
        get() = gtk_source_gutter_renderer_get_yalign(gtksourceGutterRendererPointer.reinterpret())

        /**
         * Adjusts the `yalign` property.
         *
         * This may be used to adjust where within the cell rectangle the renderer will draw.
         *
         * @param yalign the Y padding for the drawing cell
         */
        set(yalign) = gtk_source_gutter_renderer_set_yalign(gtksourceGutterRendererPointer.reinterpret(), yalign)

    /**
     * The top and bottom padding of the renderer.
     */
    public open var ypad: gint
        /**
         * Gets the `ypad` property.
         *
         * This may be used to adjust the cell rectangle that the renderer will use to draw.
         */
        get() = gtk_source_gutter_renderer_get_ypad(gtksourceGutterRendererPointer.reinterpret())

        /**
         * Adjusts the `ypad` property.
         *
         * This may be used to adjust the cell rectangle that the renderer will use to draw.
         *
         * @param ypad the Y padding for the drawing cell
         */
        set(ypad) = gtk_source_gutter_renderer_set_ypad(gtksourceGutterRendererPointer.reinterpret(), ypad)

    /**
     * Emits the [signal@GutterRenderer::activate] signal of the renderer. This is
     * called from [class@Gutter] and should never have to be called manually.
     *
     * @param iter a #GtkTextIter at the start of the line where the renderer is activated
     * @param area a #GdkRectangle of the cell area where the renderer is activated
     * @param button the button that was pressed
     * @param state a #GdkModifierType
     * @param nPresses the number of button presses
     */
    public open fun activate(
        iter: TextIter,
        area: Rectangle,
        button: guint,
        state: ModifierType,
        nPresses: gint,
    ): Unit = gtk_source_gutter_renderer_activate(
        gtksourceGutterRendererPointer.reinterpret(),
        iter.gtkTextIterPointer.reinterpret(),
        area.gdkRectanglePointer.reinterpret(),
        button,
        state.mask,
        nPresses
    )

    /**
     * Gets the [class@Buffer] for which the gutter renderer is drawing.
     *
     * @return a #GtkTextBuffer or null
     */
    public open fun getBuffer(): Buffer? =
        gtk_source_gutter_renderer_get_buffer(gtksourceGutterRendererPointer.reinterpret())?.run {
            Buffer(reinterpret())
        }

    /**
     * Get whether the renderer is activatable at the location provided. This is
     * called from [class@Gutter] to determine whether a renderer is activatable
     * using the mouse pointer.
     *
     * @param iter a #GtkTextIter at the start of the line to be activated
     * @param area a #GdkRectangle of the cell area to be activated
     * @return true if the renderer can be activated, false otherwise
     */
    public open fun queryActivatable(iter: TextIter, area: Rectangle): Boolean =
        gtk_source_gutter_renderer_query_activatable(
            gtksourceGutterRendererPointer.reinterpret(),
            iter.gtkTextIterPointer.reinterpret(),
            area.gdkRectanglePointer.reinterpret()
        ).asBoolean()

    /**
     * The signal is emitted when the renderer is activated.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `iter` a #GtkTextIter; `area` a #GdkRectangle; `button` the button that was pressed; `state` a #GdkModifierType of state; `nPresses` the number of button presses
     */
    public fun connectActivate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            iter: TextIter,
            area: Rectangle,
            button: guint,
            state: ModifierType,
            nPresses: gint,
        ) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "activate",
        connectActivateFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * The signal is emitted when the renderer can possibly be activated.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `iter` a #GtkTextIter; `area` a #GdkRectangle
     */
    public fun connectQueryActivatable(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (iter: TextIter, area: Rectangle) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "query-activatable",
        connectQueryActivatableFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     *
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `object` ; `p0`
     */
    public fun connectQueryData(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (`object`: Object, p0: guint) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "query-data",
        connectQueryDataFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<GutterRenderer> {
        override val type: GeneratedClassKGType<GutterRenderer> =
            GeneratedClassKGType(gtk_source_gutter_renderer_get_type()) { GutterRenderer(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * Get the GType of GutterRenderer
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_gutter_renderer_get_type()
    }
}

private val connectActivateFunc: CPointer<
    CFunction<
        (
            CPointer<GtkTextIter>,
            CPointer<GdkRectangle>,
            guint,
            GdkModifierType,
            gint,
        ) -> Unit
        >
    > = staticCFunction {
        _: COpaquePointer,
        iter: CPointer<GtkTextIter>?,
        area: CPointer<GdkRectangle>?,
        button: guint,
        state: GdkModifierType,
        nPresses: gint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            iter: TextIter,
            area: Rectangle,
            button: guint,
            state: ModifierType,
            nPresses: gint,
        ) -> Unit
        >().get().invoke(
        iter!!.run {
            TextIter(reinterpret())
        },
        area!!.run {
            Rectangle(reinterpret())
        },
        button,
        state.run {
            ModifierType(this)
        },
        nPresses
    )
}
    .reinterpret()

private val connectQueryActivatableFunc:
    CPointer<CFunction<(CPointer<GtkTextIter>, CPointer<GdkRectangle>) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            iter: CPointer<GtkTextIter>?,
            area: CPointer<GdkRectangle>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(iter: TextIter, area: Rectangle) -> Boolean>().get().invoke(
            iter!!.run {
                TextIter(reinterpret())
            },
            area!!.run {
                Rectangle(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectQueryDataFunc: CPointer<CFunction<(CPointer<GObject>, guint) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            `object`: CPointer<GObject>?,
            p0: guint,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(`object`: Object, p0: guint) -> Unit>().get().invoke(
            `object`!!.run {
                Object(reinterpret())
            },
            p0
        )
    }
        .reinterpret()
