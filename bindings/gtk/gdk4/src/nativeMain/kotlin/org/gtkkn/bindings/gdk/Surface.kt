// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.cairo.Content
import org.gtkkn.bindings.cairo.Region
import org.gtkkn.bindings.gdk.Gdk.resolveException
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_12
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.cairo.cairo_region_t
import org.gtkkn.native.gdk.GdkEvent
import org.gtkkn.native.gdk.GdkMonitor
import org.gtkkn.native.gdk.GdkSurface
import org.gtkkn.native.gdk.gdk_surface_beep
import org.gtkkn.native.gdk.gdk_surface_create_cairo_context
import org.gtkkn.native.gdk.gdk_surface_create_gl_context
import org.gtkkn.native.gdk.gdk_surface_create_similar_surface
import org.gtkkn.native.gdk.gdk_surface_create_vulkan_context
import org.gtkkn.native.gdk.gdk_surface_destroy
import org.gtkkn.native.gdk.gdk_surface_get_cursor
import org.gtkkn.native.gdk.gdk_surface_get_device_cursor
import org.gtkkn.native.gdk.gdk_surface_get_display
import org.gtkkn.native.gdk.gdk_surface_get_frame_clock
import org.gtkkn.native.gdk.gdk_surface_get_height
import org.gtkkn.native.gdk.gdk_surface_get_mapped
import org.gtkkn.native.gdk.gdk_surface_get_scale
import org.gtkkn.native.gdk.gdk_surface_get_scale_factor
import org.gtkkn.native.gdk.gdk_surface_get_type
import org.gtkkn.native.gdk.gdk_surface_get_width
import org.gtkkn.native.gdk.gdk_surface_hide
import org.gtkkn.native.gdk.gdk_surface_is_destroyed
import org.gtkkn.native.gdk.gdk_surface_new_popup
import org.gtkkn.native.gdk.gdk_surface_new_toplevel
import org.gtkkn.native.gdk.gdk_surface_queue_render
import org.gtkkn.native.gdk.gdk_surface_request_layout
import org.gtkkn.native.gdk.gdk_surface_set_cursor
import org.gtkkn.native.gdk.gdk_surface_set_device_cursor
import org.gtkkn.native.gdk.gdk_surface_set_input_region
import org.gtkkn.native.gdk.gdk_surface_set_opaque_region
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import kotlin.Boolean
import kotlin.Result
import kotlin.ULong
import kotlin.Unit

/**
 * A `GdkSurface` is a rectangular region on the screen.
 *
 * It’s a low-level object, used to implement high-level objects
 * such as [GtkWindow](../gtk4/class.Window.html).
 *
 * The surfaces you see in practice are either [iface@Gdk.Toplevel] or
 * [iface@Gdk.Popup], and those interfaces provide much of the required
 * API to interact with these surfaces. Other, more specialized surface
 * types exist, but you will rarely interact with them directly.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `x`: x: Out parameter is not supported
 * - method `translate_coordinates`: In/Out parameter is not supported
 */
public abstract class Surface(public val gdkSurfacePointer: CPointer<GdkSurface>) :
    Object(gdkSurfacePointer.reinterpret()),
    KGTyped {
    /**
     * The mouse pointer for the `GdkSurface`.
     */
    public open var cursor: Cursor?
        /**
         * Retrieves a `GdkCursor` pointer for the cursor currently set on the
         * `GdkSurface`.
         *
         * If the return value is null then there is no custom cursor set on
         * the surface, and it is using the cursor for its parent surface.
         *
         * Use [method@Gdk.Surface.set_cursor] to unset the cursor of the surface.
         *
         * @return a `GdkCursor`
         */
        get() = gdk_surface_get_cursor(gdkSurfacePointer)?.run {
            Cursor(this)
        }

        /**
         * Sets the default mouse pointer for a `GdkSurface`.
         *
         * Passing null for the @cursor argument means that @surface will use
         * the cursor of its parent surface. Most surfaces should use this default.
         * Note that @cursor must be for the same display as @surface.
         *
         * Use [ctor@Gdk.Cursor.new_from_name] or [ctor@Gdk.Cursor.new_from_texture]
         * to create the cursor. To make the cursor invisible, use %GDK_BLANK_CURSOR.
         *
         * @param cursor a `GdkCursor`
         */
        set(cursor) = gdk_surface_set_cursor(gdkSurfacePointer, cursor?.gdkCursorPointer)

    /**
     * The `GdkDisplay` connection of the surface.
     */
    public open val display: Display
        /**
         * Gets the `GdkDisplay` associated with a `GdkSurface`.
         *
         * @return the `GdkDisplay` associated with @surface
         */
        get() = gdk_surface_get_display(gdkSurfacePointer)!!.run {
            Display(this)
        }

    /**
     * The `GdkFrameClock` of the surface.
     */
    public open val frameClock: FrameClock
        /**
         * Gets the frame clock for the surface.
         *
         * The frame clock for a surface never changes unless the surface is
         * reparented to a new toplevel surface.
         *
         * @return the frame clock
         */
        get() = gdk_surface_get_frame_clock(gdkSurfacePointer)!!.run {
            FrameClock.FrameClockImpl(this)
        }

    /**
     * The height of the surface, in pixels.
     */
    public open val height: gint
        /**
         * Returns the height of the given @surface.
         *
         * Surface size is reported in ”application pixels”, not
         * ”device pixels” (see [method@Gdk.Surface.get_scale_factor]).
         *
         * @return The height of @surface
         */
        get() = gdk_surface_get_height(gdkSurfacePointer)

    /**
     * Whether the surface is mapped.
     */
    public open val mapped: Boolean
        /**
         * Checks whether the surface has been mapped.
         *
         * A surface is mapped with [method@Gdk.Toplevel.present]
         * or [method@Gdk.Popup.present].
         *
         * @return true if the surface is mapped
         */
        get() = gdk_surface_get_mapped(gdkSurfacePointer).asBoolean()

    /**
     * The scale of the surface.
     *
     * @since 4.12
     */
    @GdkVersion4_12
    public open val scale: gdouble
        /**
         * Returns the internal scale that maps from surface coordinates
         * to the actual device pixels.
         *
         * When the scale is bigger than 1, the windowing system prefers to get
         * buffers with a resolution that is bigger than the surface size (e.g.
         * to show the surface on a high-resolution display, or in a magnifier).
         *
         * Compare with [method@Gdk.Surface.get_scale_factor], which returns the
         * next larger integer.
         *
         * The scale may change during the lifetime of the surface.
         *
         * @return the scale
         * @since 4.12
         */
        get() = gdk_surface_get_scale(gdkSurfacePointer)

    /**
     * The scale factor of the surface.
     *
     * The scale factor is the next larger integer,
     * compared to [property@Gdk.Surface:scale].
     */
    public open val scaleFactor: gint
        /**
         * Returns the internal scale factor that maps from surface coordinates
         * to the actual device pixels.
         *
         * On traditional systems this is 1, but on very high density outputs
         * this can be a higher value (often 2). A higher value means that drawing
         * is automatically scaled up to a higher resolution, so any code doing
         * drawing will automatically look nicer. However, if you are supplying
         * pixel-based data the scale value can be used to determine whether to
         * use a pixel resource with higher resolution data.
         *
         * The scale factor may change during the lifetime of the surface.
         *
         * @return the scale factor
         */
        get() = gdk_surface_get_scale_factor(gdkSurfacePointer)

    /**
     * The width of the surface in pixels.
     */
    public open val width: gint
        /**
         * Returns the width of the given @surface.
         *
         * Surface size is reported in ”application pixels”, not
         * ”device pixels” (see [method@Gdk.Surface.get_scale_factor]).
         *
         * @return The width of @surface
         */
        get() = gdk_surface_get_width(gdkSurfacePointer)

    /**
     * Create a new popup surface.
     *
     * The surface will be attached to @parent and can be positioned
     * relative to it using [method@Gdk.Popup.present].
     *
     * @param parent the parent surface to attach the surface to
     * @param autohide whether to hide the surface on outside clicks
     * @return a new `GdkSurface`
     */
    public constructor(
        parent: Surface,
        autohide: Boolean,
    ) : this(gdk_surface_new_popup(parent.gdkSurfacePointer, autohide.asGBoolean())!!.reinterpret())

    /**
     * Creates a new toplevel surface.
     *
     * @param display the display to create the surface on
     * @return the new `GdkSurface`
     */
    public constructor(display: Display) : this(gdk_surface_new_toplevel(display.gdkDisplayPointer)!!.reinterpret())

    /**
     * Emits a short beep associated to @surface.
     *
     * If the display of @surface does not support per-surface beeps,
     * emits a short beep on the display just as [method@Gdk.Display.beep].
     */
    public open fun beep(): Unit = gdk_surface_beep(gdkSurfacePointer)

    /**
     * Creates a new `GdkCairoContext` for rendering on @surface.
     *
     * @return the newly created `GdkCairoContext`
     */
    public open fun createCairoContext(): CairoContext = gdk_surface_create_cairo_context(gdkSurfacePointer)!!.run {
        CairoContext.CairoContextImpl(this)
    }

    /**
     * Creates a new `GdkGLContext` for the `GdkSurface`.
     *
     * The context is disconnected from any particular surface or surface.
     * If the creation of the `GdkGLContext` failed, @error will be set.
     * Before using the returned `GdkGLContext`, you will need to
     * call [method@Gdk.GLContext.make_current] or [method@Gdk.GLContext.realize].
     *
     * @return the newly created `GdkGLContext`
     */
    public open fun createGlContext(): Result<GlContext> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gdk_surface_create_gl_context(gdkSurfacePointer, gError.ptr)?.run {
            GlContext.GlContextImpl(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Create a new Cairo surface that is as compatible as possible with the
     * given @surface.
     *
     * For example the new surface will have the same fallback resolution
     * and font options as @surface. Generally, the new surface will also
     * use the same backend as @surface, unless that is not possible for
     * some reason. The type of the returned surface may be examined with
     * cairo_surface_get_type().
     *
     * Initially the surface contents are all 0 (transparent if contents
     * have transparency, black otherwise.)
     *
     * This function always returns a valid pointer, but it will return a
     * pointer to a “nil” surface if @other is already in an error state
     * or any other error occurs.
     *
     * @param content the content for the new surface
     * @param width width of the new surface
     * @param height height of the new surface
     * @return a pointer to the newly allocated surface. The caller
     *   owns the surface and should call cairo_surface_destroy() when done
     *   with it.
     */
    public open fun createSimilarSurface(
        content: Content,
        width: gint,
        height: gint,
    ): org.gtkkn.bindings.cairo.Surface =
        gdk_surface_create_similar_surface(gdkSurfacePointer, content.nativeValue, width, height)!!.run {
            org.gtkkn.bindings.cairo.Surface(this)
        }

    /**
     * Sets an error and returns null.
     *
     * @return null
     */
    public open fun createVulkanContext(): Result<VulkanContext> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gdk_surface_create_vulkan_context(gdkSurfacePointer, gError.ptr)?.run {
            VulkanContext.VulkanContextImpl(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Destroys the window system resources associated with @surface and
     * decrements @surface's reference count.
     *
     * The window system resources for all children of @surface are also
     * destroyed, but the children’s reference counts are not decremented.
     *
     * Note that a surface will not be destroyed automatically when its
     * reference count reaches zero. You must call this function yourself
     * before that happens.
     */
    public open fun destroy(): Unit = gdk_surface_destroy(gdkSurfacePointer)

    /**
     * Retrieves a `GdkCursor` pointer for the @device currently set on the
     * specified `GdkSurface`.
     *
     * If the return value is null then there is no custom cursor set on the
     * specified surface, and it is using the cursor for its parent surface.
     *
     * Use [method@Gdk.Surface.set_cursor] to unset the cursor of the surface.
     *
     * @param device a pointer `GdkDevice`
     * @return a `GdkCursor`
     */
    public open fun getDeviceCursor(device: Device): Cursor? =
        gdk_surface_get_device_cursor(gdkSurfacePointer, device.gdkDevicePointer)?.run {
            Cursor(this)
        }

    /**
     * Hide the surface.
     *
     * For toplevel surfaces, withdraws them, so they will no longer be
     * known to the window manager; for all surfaces, unmaps them, so
     * they won’t be displayed. Normally done automatically as
     * part of [gtk_widget_hide()](../gtk4/method.Widget.hide.html).
     */
    public open fun hide(): Unit = gdk_surface_hide(gdkSurfacePointer)

    /**
     * Check to see if a surface is destroyed.
     *
     * @return true if the surface is destroyed
     */
    public open fun isDestroyed(): Boolean = gdk_surface_is_destroyed(gdkSurfacePointer).asBoolean()

    /**
     * Forces a [signal@Gdk.Surface::render] signal emission for @surface
     * to be scheduled.
     *
     * This function is useful for implementations that track invalid
     * regions on their own.
     */
    public open fun queueRender(): Unit = gdk_surface_queue_render(gdkSurfacePointer)

    /**
     * Request a layout phase from the surface's frame clock.
     *
     * See [method@Gdk.FrameClock.request_phase].
     */
    public open fun requestLayout(): Unit = gdk_surface_request_layout(gdkSurfacePointer)

    /**
     * Sets a specific `GdkCursor` for a given device when it gets inside @surface.
     *
     * Passing null for the @cursor argument means that @surface will use the
     * cursor of its parent surface. Most surfaces should use this default.
     *
     * Use [ctor@Gdk.Cursor.new_from_name] or [ctor@Gdk.Cursor.new_from_texture]
     * to create the cursor. To make the cursor invisible, use %GDK_BLANK_CURSOR.
     *
     * @param device a pointer `GdkDevice`
     * @param cursor a `GdkCursor`
     */
    public open fun setDeviceCursor(device: Device, cursor: Cursor): Unit =
        gdk_surface_set_device_cursor(gdkSurfacePointer, device.gdkDevicePointer, cursor.gdkCursorPointer)

    /**
     * Apply the region to the surface for the purpose of event
     * handling.
     *
     * Mouse events which happen while the pointer position corresponds
     * to an unset bit in the mask will be passed on the surface below
     * @surface.
     *
     * An input region is typically used with RGBA surfaces. The alpha
     * channel of the surface defines which pixels are invisible and
     * allows for nicely antialiased borders, and the input region
     * controls where the surface is “clickable”.
     *
     * Use [method@Gdk.Display.supports_input_shapes] to find out if
     * a particular backend supports input regions.
     *
     * @param region region of surface to be reactive
     */
    public open fun setInputRegion(region: Region): Unit =
        gdk_surface_set_input_region(gdkSurfacePointer, region.cairoRegionPointer)

    /**
     * Marks a region of the `GdkSurface` as opaque.
     *
     * For optimisation purposes, compositing window managers may
     * like to not draw obscured regions of surfaces, or turn off blending
     * during for these regions. With RGB windows with no transparency,
     * this is just the shape of the window, but with ARGB32 windows, the
     * compositor does not know what regions of the window are transparent
     * or not.
     *
     * This function only works for toplevel surfaces.
     *
     * GTK will update this property automatically if the @surface background
     * is opaque, as we know where the opaque regions are. If your surface
     * background is not opaque, please update this property in your
     * [GtkWidgetClass.css_changed](../gtk4/vfunc.Widget.css_changed.html) handler.
     *
     * @param region a region, or null to make the entire
     *   surface opaque
     */
    public open fun setOpaqueRegion(region: Region? = null): Unit =
        gdk_surface_set_opaque_region(gdkSurfacePointer, region?.cairoRegionPointer)

    /**
     * Emitted when @surface starts being present on the monitor.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `monitor` the monitor
     */
    public fun onEnterMonitor(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (monitor: Monitor) -> Unit,
    ): ULong = g_signal_connect_data(
        gdkSurfacePointer,
        "enter-monitor",
        onEnterMonitorFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "enter-monitor" signal. See [onEnterMonitor].
     *
     * @param monitor the monitor
     */
    public fun emitEnterMonitor(monitor: Monitor) {
        g_signal_emit_by_name(gdkSurfacePointer.reinterpret(), "enter-monitor", monitor.gdkMonitorPointer)
    }

    /**
     * Emitted when GDK receives an input event for @surface.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `event` an input event. Returns true to indicate that the event has been handled
     */
    public fun onEvent(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (event: Event) -> Boolean): ULong =
        g_signal_connect_data(
            gdkSurfacePointer,
            "event",
            onEventFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when the size of @surface is changed, or when relayout should
     * be performed.
     *
     * Surface size is reported in ”application pixels”, not
     * ”device pixels” (see gdk_surface_get_scale_factor()).
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `width` the current width; `height` the current height
     */
    public fun onLayout(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (width: gint, height: gint) -> Unit,
    ): ULong = g_signal_connect_data(
        gdkSurfacePointer,
        "layout",
        onLayoutFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "layout" signal. See [onLayout].
     *
     * @param width the current width
     * @param height the current height
     */
    public fun emitLayout(width: gint, height: gint) {
        g_signal_emit_by_name(gdkSurfacePointer.reinterpret(), "layout", width, height)
    }

    /**
     * Emitted when @surface stops being present on the monitor.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `monitor` the monitor
     */
    public fun onLeaveMonitor(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (monitor: Monitor) -> Unit,
    ): ULong = g_signal_connect_data(
        gdkSurfacePointer,
        "leave-monitor",
        onLeaveMonitorFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "leave-monitor" signal. See [onLeaveMonitor].
     *
     * @param monitor the monitor
     */
    public fun emitLeaveMonitor(monitor: Monitor) {
        g_signal_emit_by_name(gdkSurfacePointer.reinterpret(), "leave-monitor", monitor.gdkMonitorPointer)
    }

    /**
     * Emitted when part of the surface needs to be redrawn.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `region` the region that needs to be redrawn. Returns true to indicate that the signal has been handled
     */
    public fun onRender(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (region: Region) -> Boolean): ULong =
        g_signal_connect_data(
            gdkSurfacePointer,
            "render",
            onRenderFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * The SurfaceImpl type represents a native instance of the abstract Surface class.
     *
     * @constructor Creates a new instance of Surface for the provided [CPointer].
     */
    public class SurfaceImpl(pointer: CPointer<GdkSurface>) : Surface(pointer)

    public companion object : TypeCompanion<Surface> {
        override val type: GeneratedClassKGType<Surface> =
            GeneratedClassKGType(gdk_surface_get_type()) { SurfaceImpl(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of Surface
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_surface_get_type()
    }
}

private val onEnterMonitorFunc: CPointer<CFunction<(CPointer<GdkMonitor>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            monitor: CPointer<GdkMonitor>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(monitor: Monitor) -> Unit>().get().invoke(
            monitor!!.run {
                Monitor(this)
            }
        )
    }
        .reinterpret()

private val onEventFunc: CPointer<CFunction<(CPointer<GdkEvent>) -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        event: CPointer<GdkEvent>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(event: Event) -> Boolean>().get().invoke(
        event!!.run {
            Event.EventImpl(reinterpret())
        }
    ).asGBoolean()
}
    .reinterpret()

private val onLayoutFunc: CPointer<CFunction<(gint, gint) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        width: gint,
        height: gint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(width: gint, height: gint) -> Unit>().get().invoke(width, height)
}
    .reinterpret()

private val onLeaveMonitorFunc: CPointer<CFunction<(CPointer<GdkMonitor>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            monitor: CPointer<GdkMonitor>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(monitor: Monitor) -> Unit>().get().invoke(
            monitor!!.run {
                Monitor(this)
            }
        )
    }
        .reinterpret()

private val onRenderFunc: CPointer<CFunction<(CPointer<cairo_region_t>) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            region: CPointer<cairo_region_t>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(region: Region) -> Boolean>().get().invoke(
            region!!.run {
                Region(this)
            }
        ).asGBoolean()
    }
        .reinterpret()
