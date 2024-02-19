// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gdk.Rectangle
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkRectangle
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOverlay
import org.gtkkn.native.gtk.GtkWidget
import org.gtkkn.native.gtk.gtk_overlay_add_overlay
import org.gtkkn.native.gtk.gtk_overlay_get_child
import org.gtkkn.native.gtk.gtk_overlay_get_clip_overlay
import org.gtkkn.native.gtk.gtk_overlay_get_measure_overlay
import org.gtkkn.native.gtk.gtk_overlay_get_type
import org.gtkkn.native.gtk.gtk_overlay_new
import org.gtkkn.native.gtk.gtk_overlay_remove_overlay
import org.gtkkn.native.gtk.gtk_overlay_set_child
import org.gtkkn.native.gtk.gtk_overlay_set_clip_overlay
import org.gtkkn.native.gtk.gtk_overlay_set_measure_overlay
import kotlin.Boolean
import kotlin.Int
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkOverlay` is a container which contains a single main child, on top
 * of which it can place “overlay” widgets.
 *
 * ![An example GtkOverlay](overlay.png)
 *
 * The position of each overlay widget is determined by its
 * [property@Gtk.Widget:halign] and [property@Gtk.Widget:valign]
 * properties. E.g. a widget with both alignments set to %GTK_ALIGN_START
 * will be placed at the top left corner of the `GtkOverlay` container,
 * whereas an overlay with halign set to %GTK_ALIGN_CENTER and valign set
 * to %GTK_ALIGN_END will be placed a the bottom edge of the `GtkOverlay`,
 * horizontally centered. The position can be adjusted by setting the margin
 * properties of the child to non-zero values.
 *
 * More complicated placement of overlays is possible by connecting
 * to the [signal@Gtk.Overlay::get-child-position] signal.
 *
 * An overlay’s minimum and natural sizes are those of its main child.
 * The sizes of overlay children are not considered when measuring these
 * preferred sizes.
 *
 * # GtkOverlay as GtkBuildable
 *
 * The `GtkOverlay` implementation of the `GtkBuildable` interface
 * supports placing a child as an overlay by specifying “overlay” as
 * the “type” attribute of a `<child>` element.
 *
 * # CSS nodes
 *
 * `GtkOverlay` has a single CSS node with the name “overlay”. Overlay children
 * whose alignments cause them to be positioned at an edge get the style classes
 * “.left”, “.right”, “.top”, and/or “.bottom” according to their position.
 */
public open class Overlay(
    pointer: CPointer<GtkOverlay>,
) : Widget(pointer.reinterpret()), KGTyped {
    public val gtkOverlayPointer: CPointer<GtkOverlay>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    public open var child: Widget?
        /**
         * Gets the child widget of @overlay.
         *
         * @return the child widget of @overlay
         */
        get() =
            gtk_overlay_get_child(gtkOverlayPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the child widget of @overlay.
         *
         * @param child the child widget
         */
        set(child) =
            gtk_overlay_set_child(
                gtkOverlayPointer.reinterpret(),
                child?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * Creates a new `GtkOverlay`.
     *
     * @return a new `GtkOverlay` object.
     */
    public constructor() : this(gtk_overlay_new()!!.reinterpret())

    /**
     * Adds @widget to @overlay.
     *
     * The widget will be stacked on top of the main widget
     * added with [method@Gtk.Overlay.set_child].
     *
     * The position at which @widget is placed is determined
     * from its [property@Gtk.Widget:halign] and
     * [property@Gtk.Widget:valign] properties.
     *
     * @param widget a `GtkWidget` to be added to the container
     */
    public open fun addOverlay(widget: Widget): Unit =
        gtk_overlay_add_overlay(
            gtkOverlayPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret()
        )

    /**
     * Gets the child widget of @overlay.
     *
     * @return the child widget of @overlay
     */
    public open fun getChild(): Widget? =
        gtk_overlay_get_child(gtkOverlayPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets whether @widget should be clipped within the parent.
     *
     * @param widget an overlay child of `GtkOverlay`
     * @return whether the widget is clipped within the parent.
     */
    public open fun getClipOverlay(widget: Widget): Boolean =
        gtk_overlay_get_clip_overlay(
            gtkOverlayPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret()
        ).asBoolean()

    /**
     * Gets whether @widget's size is included in the measurement of
     * @overlay.
     *
     * @param widget an overlay child of `GtkOverlay`
     * @return whether the widget is measured
     */
    public open fun getMeasureOverlay(widget: Widget): Boolean =
        gtk_overlay_get_measure_overlay(
            gtkOverlayPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret()
        ).asBoolean()

    /**
     * Removes an overlay that was added with gtk_overlay_add_overlay().
     *
     * @param widget a `GtkWidget` to be removed
     */
    public open fun removeOverlay(widget: Widget): Unit =
        gtk_overlay_remove_overlay(
            gtkOverlayPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret()
        )

    /**
     * Sets the child widget of @overlay.
     *
     * @param child the child widget
     */
    public open fun setChild(child: Widget? = null): Unit =
        gtk_overlay_set_child(
            gtkOverlayPointer.reinterpret(),
            child?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * Sets whether @widget should be clipped within the parent.
     *
     * @param widget an overlay child of `GtkOverlay`
     * @param clipOverlay whether the child should be clipped
     */
    public open fun setClipOverlay(
        widget: Widget,
        clipOverlay: Boolean,
    ): Unit =
        gtk_overlay_set_clip_overlay(
            gtkOverlayPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret(),
            clipOverlay.asGBoolean()
        )

    /**
     * Sets whether @widget is included in the measured size of @overlay.
     *
     * The overlay will request the size of the largest child that has
     * this property set to true. Children who are not included may
     * be drawn outside of @overlay's allocation if they are too large.
     *
     * @param widget an overlay child of `GtkOverlay`
     * @param measure whether the child should be measured
     */
    public open fun setMeasureOverlay(
        widget: Widget,
        measure: Boolean,
    ): Unit =
        gtk_overlay_set_measure_overlay(
            gtkOverlayPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret(),
            measure.asGBoolean()
        )

    /**
     * Emitted to determine the position and size of any overlay
     * child widgets.
     *
     * A handler for this signal should fill @allocation with
     * the desired position and size for @widget, relative to
     * the 'main' child of @overlay.
     *
     * The default handler for this signal uses the @widget's
     * halign and valign properties to determine the position
     * and gives the widget its natural size (except that an
     * alignment of %GTK_ALIGN_FILL will cause the overlay to
     * be full-width/height). If the main child is a
     * `GtkScrolledWindow`, the overlays are placed relative
     * to its contents.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `widget` the child widget to position;
     * `allocation` return
     *   location for the allocation. Returns true if the @allocation has been filled
     */
    public fun connectGetChildPosition(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (widget: Widget, allocation: Rectangle) -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "get-child-position",
            connectGetChildPositionFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Overlay> {
        override val type: GeneratedClassKGType<Overlay> =
            GeneratedClassKGType(gtk_overlay_get_type()) { Overlay(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectGetChildPositionFunc: CPointer<
    CFunction<
        (
            CPointer<GtkWidget>,
            CPointer<GdkRectangle>,
        ) -> Int
    >
> =
    staticCFunction {
            _: COpaquePointer,
            widget: CPointer<GtkWidget>?,
            allocation: CPointer<GdkRectangle>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                widget: Widget,
                allocation: Rectangle,
            ) -> Boolean
        >().get().invoke(
            widget!!.run {
                Widget(reinterpret())
            },
            allocation!!.run {
                Rectangle(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()
