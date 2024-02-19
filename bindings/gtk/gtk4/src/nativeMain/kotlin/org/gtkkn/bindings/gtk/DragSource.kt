// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gdk.ContentProvider
import org.gtkkn.bindings.gdk.Drag
import org.gtkkn.bindings.gdk.DragAction
import org.gtkkn.bindings.gdk.DragCancelReason
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkContentProvider
import org.gtkkn.native.gdk.GdkDrag
import org.gtkkn.native.gdk.GdkDragCancelReason
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkDragSource
import org.gtkkn.native.gtk.gtk_drag_source_drag_cancel
import org.gtkkn.native.gtk.gtk_drag_source_get_actions
import org.gtkkn.native.gtk.gtk_drag_source_get_content
import org.gtkkn.native.gtk.gtk_drag_source_get_drag
import org.gtkkn.native.gtk.gtk_drag_source_get_type
import org.gtkkn.native.gtk.gtk_drag_source_new
import org.gtkkn.native.gtk.gtk_drag_source_set_actions
import org.gtkkn.native.gtk.gtk_drag_source_set_content
import org.gtkkn.native.gtk.gtk_drag_source_set_icon
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkDragSource` is an event controller to initiate Drag-And-Drop operations.
 *
 * `GtkDragSource` can be set up with the necessary
 * ingredients for a DND operation ahead of time. This includes
 * the source for the data that is being transferred, in the form
 * of a [class@Gdk.ContentProvider], the desired action, and the icon to
 * use during the drag operation. After setting it up, the drag
 * source must be added to a widget as an event controller, using
 * [method@Gtk.Widget.add_controller].
 *
 * ```c
 * static void
 * my_widget_init (MyWidget *self)
 * {
 *   GtkDragSource *drag_source = gtk_drag_source_new ();
 *
 *   g_signal_connect (drag_source, "prepare", G_CALLBACK (on_drag_prepare), self);
 *   g_signal_connect (drag_source, "drag-begin", G_CALLBACK (on_drag_begin), self);
 *
 *   gtk_widget_add_controller (GTK_WIDGET (self), GTK_EVENT_CONTROLLER (drag_source));
 * }
 * ```
 *
 * Setting up the content provider and icon ahead of time only makes
 * sense when the data does not change. More commonly, you will want
 * to set them up just in time. To do so, `GtkDragSource` has
 * [signal@Gtk.DragSource::prepare] and [signal@Gtk.DragSource::drag-begin]
 * signals.
 *
 * The ::prepare signal is emitted before a drag is started, and
 * can be used to set the content provider and actions that the
 * drag should be started with.
 *
 * ```c
 * static GdkContentProvider *
 * on_drag_prepare (GtkDragSource *source,
 *                  double         x,
 *                  double         y,
 *                  MyWidget      *self)
 * {
 *   // This widget supports two types of content: GFile objects
 *   // and GdkPixbuf objects; GTK will handle the serialization
 *   // of these types automatically
 *   GFile *file = my_widget_get_file (self);
 *   GdkPixbuf *pixbuf = my_widget_get_pixbuf (self);
 *
 *   return gdk_content_provider_new_union ((GdkContentProvider *[2]) {
 *       gdk_content_provider_new_typed (G_TYPE_FILE, file),
 *       gdk_content_provider_new_typed (GDK_TYPE_PIXBUF, pixbuf),
 *     }, 2);
 * }
 * ```
 *
 * The ::drag-begin signal is emitted after the `GdkDrag` object has
 * been created, and can be used to set up the drag icon.
 *
 * ```c
 * static void
 * on_drag_begin (GtkDragSource *source,
 *                GdkDrag       *drag,
 *                MyWidget      *self)
 * {
 *   // Set the widget as the drag icon
 *   GdkPaintable *paintable = gtk_widget_paintable_new (GTK_WIDGET (self));
 *   gtk_drag_source_set_icon (source, paintable, 0, 0);
 *   g_object_unref (paintable);
 * }
 * ```
 *
 * During the DND operation, `GtkDragSource` emits signals that
 * can be used to obtain updates about the status of the operation,
 * but it is not normally necessary to connect to any signals,
 * except for one case: when the supported actions include
 * %GDK_ACTION_MOVE, you need to listen for the
 * [signal@Gtk.DragSource::drag-end] signal and delete the
 * data after it has been transferred.
 */
public open class DragSource(
    pointer: CPointer<GtkDragSource>,
) : GestureSingle(pointer.reinterpret()), KGTyped {
    public val gtkDragSourcePointer: CPointer<GtkDragSource>
        get() = gPointer.reinterpret()

    /**
     * The actions that are supported by drag operations from the source.
     *
     * Note that you must handle the [signal@Gtk.DragSource::drag-end] signal
     * if the actions include %GDK_ACTION_MOVE.
     */
    public open var actions: DragAction
        /**
         * Gets the actions that are currently set on the `GtkDragSource`.
         *
         * @return the actions set on @source
         */
        get() =
            gtk_drag_source_get_actions(gtkDragSourcePointer.reinterpret()).run {
                DragAction(this)
            }

        /**
         * Sets the actions on the `GtkDragSource`.
         *
         * During a DND operation, the actions are offered to potential
         * drop targets. If @actions include %GDK_ACTION_MOVE, you need
         * to listen to the [signal@Gtk.DragSource::drag-end] signal and
         * handle @delete_data being true.
         *
         * This function can be called before a drag is started,
         * or in a handler for the [signal@Gtk.DragSource::prepare] signal.
         *
         * @param actions the actions to offer
         */
        set(actions) = gtk_drag_source_set_actions(gtkDragSourcePointer.reinterpret(), actions.mask)

    /**
     * The data that is offered by drag operations from this source.
     */
    public open var content: ContentProvider?
        /**
         * Gets the current content provider of a `GtkDragSource`.
         *
         * @return the `GdkContentProvider` of @source
         */
        get() =
            gtk_drag_source_get_content(gtkDragSourcePointer.reinterpret())?.run {
                ContentProvider(reinterpret())
            }

        /**
         * Sets a content provider on a `GtkDragSource`.
         *
         * When the data is requested in the cause of a DND operation,
         * it will be obtained from the content provider.
         *
         * This function can be called before a drag is started,
         * or in a handler for the [signal@Gtk.DragSource::prepare] signal.
         *
         * You may consider setting the content provider back to
         * null in a [signal@Gtk.DragSource::drag-end] signal handler.
         *
         * @param content a `GdkContentProvider`
         */
        set(content) =
            gtk_drag_source_set_content(
                gtkDragSourcePointer.reinterpret(),
                content?.gdkContentProviderPointer?.reinterpret()
            )

    /**
     * Creates a new `GtkDragSource` object.
     *
     * @return the new `GtkDragSource`
     */
    public constructor() : this(gtk_drag_source_new()!!.reinterpret())

    /**
     * Cancels a currently ongoing drag operation.
     */
    public open fun dragCancel(): Unit = gtk_drag_source_drag_cancel(gtkDragSourcePointer.reinterpret())

    /**
     * Gets the actions that are currently set on the `GtkDragSource`.
     *
     * @return the actions set on @source
     */
    public open fun getActions(): DragAction =
        gtk_drag_source_get_actions(gtkDragSourcePointer.reinterpret()).run {
            DragAction(this)
        }

    /**
     * Gets the current content provider of a `GtkDragSource`.
     *
     * @return the `GdkContentProvider` of @source
     */
    public open fun getContent(): ContentProvider? =
        gtk_drag_source_get_content(gtkDragSourcePointer.reinterpret())?.run {
            ContentProvider(reinterpret())
        }

    /**
     * Returns the underlying `GdkDrag` object for an ongoing drag.
     *
     * @return the `GdkDrag` of the current
     *   drag operation
     */
    public open fun getDrag(): Drag? =
        gtk_drag_source_get_drag(gtkDragSourcePointer.reinterpret())?.run {
            Drag(reinterpret())
        }

    /**
     * Sets the actions on the `GtkDragSource`.
     *
     * During a DND operation, the actions are offered to potential
     * drop targets. If @actions include %GDK_ACTION_MOVE, you need
     * to listen to the [signal@Gtk.DragSource::drag-end] signal and
     * handle @delete_data being true.
     *
     * This function can be called before a drag is started,
     * or in a handler for the [signal@Gtk.DragSource::prepare] signal.
     *
     * @param actions the actions to offer
     */
    public open fun setActions(actions: DragAction): Unit =
        gtk_drag_source_set_actions(gtkDragSourcePointer.reinterpret(), actions.mask)

    /**
     * Sets a content provider on a `GtkDragSource`.
     *
     * When the data is requested in the cause of a DND operation,
     * it will be obtained from the content provider.
     *
     * This function can be called before a drag is started,
     * or in a handler for the [signal@Gtk.DragSource::prepare] signal.
     *
     * You may consider setting the content provider back to
     * null in a [signal@Gtk.DragSource::drag-end] signal handler.
     *
     * @param content a `GdkContentProvider`
     */
    public open fun setContent(content: ContentProvider? = null): Unit =
        gtk_drag_source_set_content(
            gtkDragSourcePointer.reinterpret(),
            content?.gdkContentProviderPointer?.reinterpret()
        )

    /**
     * Sets a paintable to use as icon during DND operations.
     *
     * The hotspot coordinates determine the point on the icon
     * that gets aligned with the hotspot of the cursor.
     *
     * If @paintable is null, a default icon is used.
     *
     * This function can be called before a drag is started, or in
     * a [signal@Gtk.DragSource::prepare] or
     * [signal@Gtk.DragSource::drag-begin] signal handler.
     *
     * @param paintable the `GdkPaintable` to use as icon
     * @param hotX the hotspot X coordinate on the icon
     * @param hotY the hotspot Y coordinate on the icon
     */
    public open fun setIcon(
        paintable: Paintable? = null,
        hotX: Int,
        hotY: Int,
    ): Unit =
        gtk_drag_source_set_icon(
            gtkDragSourcePointer.reinterpret(),
            paintable?.gdkPaintablePointer,
            hotX,
            hotY
        )

    /**
     * Emitted on the drag source when a drag is started.
     *
     * It can be used to e.g. set a custom drag icon with
     * [method@Gtk.DragSource.set_icon].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `drag` the `GdkDrag` object
     */
    public fun connectDragBegin(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (drag: Drag) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "drag-begin",
            connectDragBeginFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted on the drag source when a drag has failed.
     *
     * The signal handler may handle a failed drag operation based on
     * the type of error. It should return true if the failure has been handled
     * and the default "drag operation failed" animation should not be shown.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `drag` the `GdkDrag` object; `reason`
     * information on why the drag failed. Returns true if the failed drag operation has been already
     * handled
     */
    public fun connectDragCancel(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (drag: Drag, reason: DragCancelReason) -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "drag-cancel",
            connectDragCancelFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted on the drag source when a drag is finished.
     *
     * A typical reason to connect to this signal is to undo
     * things done in [signal@Gtk.DragSource::prepare] or
     * [signal@Gtk.DragSource::drag-begin] handlers.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `drag` the `GdkDrag` object; `deleteData`
     * true if the drag was performing %GDK_ACTION_MOVE,
     *    and the data should be deleted
     */
    public fun connectDragEnd(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            drag: Drag,
            deleteData: Boolean,
        ) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "drag-end",
            connectDragEndFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when a drag is about to be initiated.
     *
     * It returns the `GdkContentProvider` to use for the drag that is about
     * to start. The default handler for this signal returns the value of
     * the [property@Gtk.DragSource:content] property, so if you set up that
     * property ahead of time, you don't need to connect to this signal.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `x` the X coordinate of the drag starting
     * point; `y` the Y coordinate fo the drag starting point. Returns a `GdkContentProvider`
     */
    public fun connectPrepare(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            x: Double,
            y: Double,
        ) -> ContentProvider?,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "prepare",
            connectPrepareFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<DragSource> {
        override val type: GeneratedClassKGType<DragSource> =
            GeneratedClassKGType(gtk_drag_source_get_type()) { DragSource(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectDragBeginFunc: CPointer<CFunction<(CPointer<GdkDrag>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            drag: CPointer<GdkDrag>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(drag: Drag) -> Unit>().get().invoke(
            drag!!.run {
                Drag(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectDragCancelFunc: CPointer<
    CFunction<
        (
            CPointer<GdkDrag>,
            GdkDragCancelReason,
        ) -> Int
    >
> =
    staticCFunction {
            _: COpaquePointer,
            drag: CPointer<GdkDrag>?,
            reason: GdkDragCancelReason,
            userData: COpaquePointer,
        ->
        userData.asStableRef<
            (
                drag: Drag,
                reason: DragCancelReason,
            ) -> Boolean
        >().get().invoke(
            drag!!.run {
                Drag(reinterpret())
            },
            reason.run {
                DragCancelReason.fromNativeValue(this)
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectDragEndFunc: CPointer<CFunction<(CPointer<GdkDrag>, Int) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            drag: CPointer<GdkDrag>?,
            deleteData: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(drag: Drag, deleteData: Boolean) -> Unit>().get().invoke(
            drag!!.run {
                Drag(reinterpret())
            },
            deleteData.asBoolean()
        )
    }
        .reinterpret()

private val connectPrepareFunc: CPointer<
    CFunction<
        (
            Double,
            Double,
        ) -> CPointer<GdkContentProvider>?
    >
> =
    staticCFunction {
            _: COpaquePointer,
            x: Double,
            y: Double,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(x: Double, y: Double) -> ContentProvider?>().get().invoke(
            x,
            y
        )?.gdkContentProviderPointer
    }
        .reinterpret()
