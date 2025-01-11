// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.cstr
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.Gdk.resolveException
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_14
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_4
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_6
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkDisplay
import org.gtkkn.native.gdk.GdkSeat
import org.gtkkn.native.gdk.gdk_display_beep
import org.gtkkn.native.gdk.gdk_display_close
import org.gtkkn.native.gdk.gdk_display_create_gl_context
import org.gtkkn.native.gdk.gdk_display_device_is_grabbed
import org.gtkkn.native.gdk.gdk_display_flush
import org.gtkkn.native.gdk.gdk_display_get_app_launch_context
import org.gtkkn.native.gdk.gdk_display_get_clipboard
import org.gtkkn.native.gdk.gdk_display_get_default
import org.gtkkn.native.gdk.gdk_display_get_default_seat
import org.gtkkn.native.gdk.gdk_display_get_dmabuf_formats
import org.gtkkn.native.gdk.gdk_display_get_monitor_at_surface
import org.gtkkn.native.gdk.gdk_display_get_monitors
import org.gtkkn.native.gdk.gdk_display_get_name
import org.gtkkn.native.gdk.gdk_display_get_primary_clipboard
import org.gtkkn.native.gdk.gdk_display_get_setting
import org.gtkkn.native.gdk.gdk_display_get_startup_notification_id
import org.gtkkn.native.gdk.gdk_display_get_type
import org.gtkkn.native.gdk.gdk_display_is_closed
import org.gtkkn.native.gdk.gdk_display_is_composited
import org.gtkkn.native.gdk.gdk_display_is_rgba
import org.gtkkn.native.gdk.gdk_display_list_seats
import org.gtkkn.native.gdk.gdk_display_notify_startup_complete
import org.gtkkn.native.gdk.gdk_display_open
import org.gtkkn.native.gdk.gdk_display_prepare_gl
import org.gtkkn.native.gdk.gdk_display_put_event
import org.gtkkn.native.gdk.gdk_display_supports_input_shapes
import org.gtkkn.native.gdk.gdk_display_supports_shadow_width
import org.gtkkn.native.gdk.gdk_display_sync
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * `GdkDisplay` objects are the GDK representation of a workstation.
 *
 * Their purpose are two-fold:
 *
 * - To manage and provide information about input devices (pointers, keyboards, etc)
 * - To manage and provide information about output devices (monitors, projectors, etc)
 *
 * Most of the input device handling has been factored out into separate
 * [class@Gdk.Seat] objects. Every display has a one or more seats, which
 * can be accessed with [method@Gdk.Display.get_default_seat] and
 * [method@Gdk.Display.list_seats].
 *
 * Output devices are represented by [class@Gdk.Monitor] objects, which can
 * be accessed with [method@Gdk.Display.get_monitor_at_surface] and similar APIs.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `keys`: keys: Out parameter is not supported
 * - parameter `keys`: keys: Out parameter is not supported
 * - parameter `keyval`: keyval: Out parameter is not supported
 * - method `composited`: Property has no getter nor setter
 * - method `input-shapes`: Property has no getter nor setter
 * - method `rgba`: Property has no getter nor setter
 * - method `shadow-width`: Property has no getter nor setter
 */
public open class Display(public val gdkDisplayPointer: CPointer<GdkDisplay>) :
    Object(gdkDisplayPointer.reinterpret()),
    KGTyped {
    /**
     * The dma-buf formats that are supported on this display
     *
     * @since 4.14
     */
    @GdkVersion4_14
    public open val dmabufFormats: DmabufFormats
        /**
         * Returns the dma-buf formats that are supported on this display.
         *
         * GTK may use OpenGL or Vulkan to support some formats.
         * Calling this function will then initialize them if they aren't yet.
         *
         * The formats returned by this function can be used for negotiating
         * buffer formats with producers such as v4l, pipewire or GStreamer.
         *
         * To learn more about dma-bufs, see [class@Gdk.DmabufTextureBuilder].
         *
         * @return a `GdkDmabufFormats` object
         * @since 4.14
         */
        get() = gdk_display_get_dmabuf_formats(gdkDisplayPointer)!!.run {
            DmabufFormats(this)
        }

    /**
     * Emits a short beep on @display
     */
    public open fun beep(): Unit = gdk_display_beep(gdkDisplayPointer)

    /**
     * Closes the connection to the windowing system for the given display.
     *
     * This cleans up associated resources.
     */
    public open fun close(): Unit = gdk_display_close(gdkDisplayPointer)

    /**
     * Creates a new `GdkGLContext` for the `GdkDisplay`.
     *
     * The context is disconnected from any particular surface or surface
     * and cannot be used to draw to any surface. It can only be used to
     * draw to non-surface framebuffers like textures.
     *
     * If the creation of the `GdkGLContext` failed, @error will be set.
     * Before using the returned `GdkGLContext`, you will need to
     * call [method@Gdk.GLContext.make_current] or [method@Gdk.GLContext.realize].
     *
     * @return the newly created `GdkGLContext`
     * @since 4.6
     */
    @GdkVersion4_6
    public open fun createGlContext(): Result<GlContext> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gdk_display_create_gl_context(gdkDisplayPointer, gError.ptr)?.run {
            GlContext.GlContextImpl(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Returns true if there is an ongoing grab on @device for @display.
     *
     * @param device a `GdkDevice`
     * @return true if there is a grab in effect for @device.
     */
    public open fun deviceIsGrabbed(device: Device): Boolean =
        gdk_display_device_is_grabbed(gdkDisplayPointer, device.gdkDevicePointer).asBoolean()

    /**
     * Flushes any requests queued for the windowing system.
     *
     * This happens automatically when the main loop blocks waiting for new events,
     * but if your application is drawing without returning control to the main loop,
     * you may need to call this function explicitly. A common case where this function
     * needs to be called is when an application is executing drawing commands
     * from a thread other than the thread where the main loop is running.
     *
     * This is most useful for X11. On windowing systems where requests are
     * handled synchronously, this function will do nothing.
     */
    public open fun flush(): Unit = gdk_display_flush(gdkDisplayPointer)

    /**
     * Returns a `GdkAppLaunchContext` suitable for launching
     * applications on the given display.
     *
     * @return a new `GdkAppLaunchContext` for @display
     */
    public open fun getAppLaunchContext(): AppLaunchContext =
        gdk_display_get_app_launch_context(gdkDisplayPointer)!!.run {
            AppLaunchContext(this)
        }

    /**
     * Gets the clipboard used for copy/paste operations.
     *
     * @return the display's clipboard
     */
    public open fun getClipboard(): Clipboard = gdk_display_get_clipboard(gdkDisplayPointer)!!.run {
        Clipboard(this)
    }

    /**
     * Returns the default `GdkSeat` for this display.
     *
     * Note that a display may not have a seat. In this case,
     * this function will return null.
     *
     * @return the default seat.
     */
    public open fun getDefaultSeat(): Seat? = gdk_display_get_default_seat(gdkDisplayPointer)?.run {
        Seat.SeatImpl(this)
    }

    /**
     * Gets the monitor in which the largest area of @surface
     * resides.
     *
     * @param surface a `GdkSurface`
     * @return the monitor with the largest
     *   overlap with @surface
     */
    public open fun getMonitorAtSurface(surface: Surface): Monitor? =
        gdk_display_get_monitor_at_surface(gdkDisplayPointer, surface.gdkSurfacePointer)?.run {
            Monitor(this)
        }

    /**
     * Gets the list of monitors associated with this display.
     *
     * Subsequent calls to this function will always return the
     * same list for the same display.
     *
     * You can listen to the GListModel::items-changed signal on
     * this list to monitor changes to the monitor of this display.
     *
     * @return a `GListModel` of `GdkMonitor`
     */
    public open fun getMonitors(): ListModel = gdk_display_get_monitors(gdkDisplayPointer)!!.run {
        ListModel.ListModelImpl(reinterpret())
    }

    /**
     * Gets the name of the display.
     *
     * @return a string representing the display name. This string is owned
     *   by GDK and should not be modified or freed.
     */
    public open fun getName(): String =
        gdk_display_get_name(gdkDisplayPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the clipboard used for the primary selection.
     *
     * On backends where the primary clipboard is not supported natively,
     * GDK emulates this clipboard locally.
     *
     * @return the primary clipboard
     */
    public open fun getPrimaryClipboard(): Clipboard = gdk_display_get_primary_clipboard(gdkDisplayPointer)!!.run {
        Clipboard(this)
    }

    /**
     * Retrieves a desktop-wide setting such as double-click time
     * for the @display.
     *
     * @param name the name of the setting
     * @param value location to store the value of the setting
     * @return true if the setting existed and a value was stored
     *   in @value, false otherwise
     */
    public open fun getSetting(name: String, `value`: Value): Boolean =
        gdk_display_get_setting(gdkDisplayPointer, name, `value`.gobjectValuePointer).asBoolean()

    /**
     * Gets the startup notification ID for a Wayland display, or null
     * if no ID has been defined.
     *
     * @return the startup notification ID for @display
     */
    public open fun getStartupNotificationId(): String? =
        gdk_display_get_startup_notification_id(gdkDisplayPointer)?.toKString()

    /**
     * Finds out if the display has been closed.
     *
     * @return true if the display is closed.
     */
    public open fun isClosed(): Boolean = gdk_display_is_closed(gdkDisplayPointer).asBoolean()

    /**
     * Returns whether surfaces can reasonably be expected to have
     * their alpha channel drawn correctly on the screen.
     *
     * Check [method@Gdk.Display.is_rgba] for whether the display
     * supports an alpha channel.
     *
     * On X11 this function returns whether a compositing manager is
     * compositing on @display.
     *
     * On modern displays, this value is always true.
     *
     * @return Whether surfaces with RGBA visuals can reasonably
     *   be expected to have their alpha channels drawn correctly
     *   on the screen.
     */
    public open fun isComposited(): Boolean = gdk_display_is_composited(gdkDisplayPointer).asBoolean()

    /**
     * Returns whether surfaces on this @display are created with an
     * alpha channel.
     *
     * Even if a true is returned, it is possible that the
     * surface’s alpha channel won’t be honored when displaying the
     * surface on the screen: in particular, for X an appropriate
     * windowing manager and compositing manager must be running to
     * provide appropriate display. Use [method@Gdk.Display.is_composited]
     * to check if that is the case.
     *
     * On modern displays, this value is always true.
     *
     * @return true if surfaces are created with an alpha channel or
     *   false if the display does not support this functionality.
     */
    public open fun isRgba(): Boolean = gdk_display_is_rgba(gdkDisplayPointer).asBoolean()

    /**
     * Returns the list of seats known to @display.
     *
     * @return the
     *   list of seats known to the `GdkDisplay`
     */
    public open fun listSeats(): List = gdk_display_list_seats(gdkDisplayPointer)!!.run {
        List(this)
    }

    /**
     * Indicates to the GUI environment that the application has
     * finished loading, using a given identifier.
     *
     * GTK will call this function automatically for [GtkWindow](../gtk4/class.Window.html)
     * with custom startup-notification identifier unless
     * [gtk_window_set_auto_startup_notification()](../gtk4/method.Window.set_auto_startup_notification.html)
     * is called to disable that feature.
     *
     * @param startupId a startup-notification identifier, for which
     *   notification process should be completed
     */
    public open fun notifyStartupComplete(startupId: String): Unit =
        gdk_display_notify_startup_complete(gdkDisplayPointer, startupId)

    /**
     * Checks that OpenGL is available for @self and ensures that it is
     * properly initialized.
     * When this fails, an @error will be set describing the error and this
     * function returns false.
     *
     * Note that even if this function succeeds, creating a `GdkGLContext`
     * may still fail.
     *
     * This function is idempotent. Calling it multiple times will just
     * return the same value or error.
     *
     * You never need to call this function, GDK will call it automatically
     * as needed. But you can use it as a check when setting up code that
     * might make use of OpenGL.
     *
     * @return true if the display supports OpenGL
     * @since 4.4
     */
    @GdkVersion4_4
    public open fun prepareGl(): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gdk_display_prepare_gl(gdkDisplayPointer, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Adds the given event to the event queue for @display.
     *
     * @param event a `GdkEvent`
     */
    public open fun putEvent(event: Event): Unit = gdk_display_put_event(gdkDisplayPointer, event.gdkEventPointer)

    /**
     * Returns true if the display supports input shapes.
     *
     * This means that [method@Gdk.Surface.set_input_region] can
     * be used to modify the input shape of surfaces on @display.
     *
     * On modern displays, this value is always true.
     *
     * @return true if surfaces with modified input shape are supported
     */
    public open fun supportsInputShapes(): Boolean = gdk_display_supports_input_shapes(gdkDisplayPointer).asBoolean()

    /**
     * Returns whether it's possible for a surface to draw outside of the window area.
     *
     * If true is returned the application decides if it wants to draw shadows.
     * If false is returned, the compositor decides if it wants to draw shadows.
     *
     * @return true if surfaces can draw shadows or
     *   false if the display does not support this functionality.
     * @since 4.14
     */
    @GdkVersion4_14
    public open fun supportsShadowWidth(): Boolean = gdk_display_supports_shadow_width(gdkDisplayPointer).asBoolean()

    /**
     * Flushes any requests queued for the windowing system and waits until all
     * requests have been handled.
     *
     * This is often used for making sure that the display is synchronized
     * with the current state of the program. Calling [method@Gdk.Display.sync]
     * before [method@GdkX11.Display.error_trap_pop] makes sure that any errors
     * generated from earlier requests are handled before the error trap is removed.
     *
     * This is most useful for X11. On windowing systems where requests are
     * handled synchronously, this function will do nothing.
     */
    public open fun sync(): Unit = gdk_display_sync(gdkDisplayPointer)

    /**
     * Emitted when the connection to the windowing system for @display is closed.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `isError` true if the display was closed due to an error
     */
    public fun onClosed(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (isError: Boolean) -> Unit): ULong =
        g_signal_connect_data(
            gdkDisplayPointer,
            "closed",
            onClosedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "closed" signal. See [onClosed].
     *
     * @param isError true if the display was closed due to an error
     */
    public fun emitClosed(isError: Boolean) {
        g_signal_emit_by_name(gdkDisplayPointer.reinterpret(), "closed", isError.asGBoolean())
    }

    /**
     * Emitted when the connection to the windowing system for @display is opened.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onOpened(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gdkDisplayPointer,
            "opened",
            onOpenedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "opened" signal. See [onOpened].
     */
    public fun emitOpened() {
        g_signal_emit_by_name(gdkDisplayPointer.reinterpret(), "opened")
    }

    /**
     * Emitted whenever a new seat is made known to the windowing system.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `seat` the seat that was just added
     */
    public fun onSeatAdded(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (seat: Seat) -> Unit): ULong =
        g_signal_connect_data(
            gdkDisplayPointer,
            "seat-added",
            onSeatAddedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "seat-added" signal. See [onSeatAdded].
     *
     * @param seat the seat that was just added
     */
    public fun emitSeatAdded(seat: Seat) {
        g_signal_emit_by_name(gdkDisplayPointer.reinterpret(), "seat-added", seat.gdkSeatPointer)
    }

    /**
     * Emitted whenever a seat is removed by the windowing system.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `seat` the seat that was just removed
     */
    public fun onSeatRemoved(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (seat: Seat) -> Unit): ULong =
        g_signal_connect_data(
            gdkDisplayPointer,
            "seat-removed",
            onSeatRemovedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "seat-removed" signal. See [onSeatRemoved].
     *
     * @param seat the seat that was just removed
     */
    public fun emitSeatRemoved(seat: Seat) {
        g_signal_emit_by_name(gdkDisplayPointer.reinterpret(), "seat-removed", seat.gdkSeatPointer)
    }

    /**
     * Emitted whenever a setting changes its value.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `setting` the name of the setting that changed
     */
    public fun onSettingChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (setting: String) -> Unit,
    ): ULong = g_signal_connect_data(
        gdkDisplayPointer,
        "setting-changed",
        onSettingChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "setting-changed" signal. See [onSettingChanged].
     *
     * @param setting the name of the setting that changed
     */
    public fun emitSettingChanged(setting: String) {
        g_signal_emit_by_name(gdkDisplayPointer.reinterpret(), "setting-changed", setting.cstr)
    }

    public companion object : TypeCompanion<Display> {
        override val type: GeneratedClassKGType<Display> =
            GeneratedClassKGType(gdk_display_get_type()) { Display(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Gets the default `GdkDisplay`.
         *
         * This is a convenience function for:
         *
         *     gdk_display_manager_get_default_display (gdk_display_manager_get ())
         *
         * @return a `GdkDisplay`, or null if
         *   there is no default display
         */
        public fun getDefault(): Display? = gdk_display_get_default()?.run {
            Display(this)
        }

        /**
         * Opens a display.
         *
         * If opening the display fails, `NULL` is returned.
         *
         * @param displayName the name of the display to open
         * @return a `GdkDisplay`
         */
        public fun `open`(displayName: String? = null): Display? = gdk_display_open(displayName)?.run {
            Display(this)
        }

        /**
         * Get the GType of Display
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_display_get_type()
    }
}

private val onClosedFunc: CPointer<CFunction<(gboolean) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        isError: gboolean,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(isError: Boolean) -> Unit>().get().invoke(isError.asBoolean())
}
    .reinterpret()

private val onOpenedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onSeatAddedFunc: CPointer<CFunction<(CPointer<GdkSeat>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        seat: CPointer<GdkSeat>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(seat: Seat) -> Unit>().get().invoke(
        seat!!.run {
            Seat.SeatImpl(this)
        }
    )
}
    .reinterpret()

private val onSeatRemovedFunc: CPointer<CFunction<(CPointer<GdkSeat>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        seat: CPointer<GdkSeat>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(seat: Seat) -> Unit>().get().invoke(
        seat!!.run {
            Seat.SeatImpl(this)
        }
    )
}
    .reinterpret()

private val onSettingChangedFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            setting: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(setting: String) -> Unit>().get().invoke(
            setting?.toKString() ?: error("Expected not null string")
        )
    }
        .reinterpret()
