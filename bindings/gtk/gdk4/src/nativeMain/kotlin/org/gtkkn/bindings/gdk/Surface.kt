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
import org.gtkkn.bindings.gdk.Gdk.resolveException
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkEvent
import org.gtkkn.native.gdk.GdkMonitor
import org.gtkkn.native.gdk.GdkSurface
import org.gtkkn.native.gdk.gdk_surface_beep
import org.gtkkn.native.gdk.gdk_surface_create_cairo_context
import org.gtkkn.native.gdk.gdk_surface_create_gl_context
import org.gtkkn.native.gdk.gdk_surface_create_vulkan_context
import org.gtkkn.native.gdk.gdk_surface_destroy
import org.gtkkn.native.gdk.gdk_surface_get_cursor
import org.gtkkn.native.gdk.gdk_surface_get_device_cursor
import org.gtkkn.native.gdk.gdk_surface_get_display
import org.gtkkn.native.gdk.gdk_surface_get_frame_clock
import org.gtkkn.native.gdk.gdk_surface_get_height
import org.gtkkn.native.gdk.gdk_surface_get_mapped
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
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.Int
import kotlin.Result
import kotlin.ULong
import kotlin.Unit

/**
 * A `GdkSurface` is a rectangular region on the screen.
 *
 * It’s a low-level object, used to implement high-level objects
 * such as [class@Gtk.Window] or [class@Gtk.Dialog] in GTK.
 *
 * The surfaces you see in practice are either [iface@Gdk.Toplevel] or
 * [iface@Gdk.Popup], and those interfaces provide much of the required
 * API to interact with these surfaces. Other, more specialized surface
 * types exist, but you will rarely interact with them directly.
 *
 * ## Skipped during bindings generation
 *
 * - method `create_similar_surface`: Return type cairo.Surface is unsupported
 * - parameter `x`: x: Out parameter is not supported
 * - parameter `region`: cairo.Region
 * - parameter `region`: cairo.Region
 * - method `translate_coordinates`: In/Out parameter is not supported
 * - signal `render`: Signal render is ignored
 */
public open class Surface(
    pointer: CPointer<GdkSurface>,
) : Object(pointer.reinterpret()), KGTyped {
    public val gdkSurfacePointer: CPointer<GdkSurface>
        get() = gPointer.reinterpret()

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
        get() =
            gdk_surface_get_cursor(gdkSurfacePointer.reinterpret())?.run {
                Cursor(reinterpret())
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
        set(cursor) =
            gdk_surface_set_cursor(
                gdkSurfacePointer.reinterpret(),
                cursor?.gdkCursorPointer?.reinterpret()
            )

    /**
     * The `GdkDisplay` connection of the surface.
     */
    public open val display: Display
        /**
         * Gets the `GdkDisplay` associated with a `GdkSurface`.
         *
         * @return the `GdkDisplay` associated with @surface
         */
        get() =
            gdk_surface_get_display(gdkSurfacePointer.reinterpret())!!.run {
                Display(reinterpret())
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
        get() =
            gdk_surface_get_frame_clock(gdkSurfacePointer.reinterpret())!!.run {
                FrameClock(reinterpret())
            }

    /**
     * The height of the surface, in pixels.
     */
    public open val height: Int
        /**
         * Returns the height of the given @surface.
         *
         * Surface size is reported in ”application pixels”, not
         * ”device pixels” (see [method@Gdk.Surface.get_scale_factor]).
         *
         * @return The height of @surface
         */
        get() = gdk_surface_get_height(gdkSurfacePointer.reinterpret())

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
        get() = gdk_surface_get_mapped(gdkSurfacePointer.reinterpret()).asBoolean()

    /**
     * The scale factor of the surface.
     */
    public open val scaleFactor: Int
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
         * The scale of a surface may change during runtime.
         *
         * @return the scale factor
         */
        get() = gdk_surface_get_scale_factor(gdkSurfacePointer.reinterpret())

    /**
     * The width of the surface in pixels.
     */
    public open val width: Int
        /**
         * Returns the width of the given @surface.
         *
         * Surface size is reported in ”application pixels”, not
         * ”device pixels” (see [method@Gdk.Surface.get_scale_factor]).
         *
         * @return The width of @surface
         */
        get() = gdk_surface_get_width(gdkSurfacePointer.reinterpret())

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
    public constructor(parent: Surface, autohide: Boolean) :
        this(
            gdk_surface_new_popup(
                parent.gdkSurfacePointer.reinterpret(),
                autohide.asGBoolean()
            )!!.reinterpret()
        )

    /**
     * Creates a new toplevel surface.
     *
     * @param display the display to create the surface on
     * @return the new `GdkSurface`
     */
    public constructor(display: Display) :
        this(gdk_surface_new_toplevel(display.gdkDisplayPointer.reinterpret())!!.reinterpret())

    /**
     * Emits a short beep associated to @surface.
     *
     * If the display of @surface does not support per-surface beeps,
     * emits a short beep on the display just as [method@Gdk.Display.beep].
     */
    public open fun beep(): Unit = gdk_surface_beep(gdkSurfacePointer.reinterpret())

    /**
     * Creates a new `GdkCairoContext` for rendering on @surface.
     *
     * @return the newly created `GdkCairoContext`
     */
    public open fun createCairoContext(): CairoContext =
        gdk_surface_create_cairo_context(gdkSurfacePointer.reinterpret())!!.run {
            CairoContext(reinterpret())
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
    public open fun createGlContext(): Result<GLContext> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                gdk_surface_create_gl_context(
                    gdkSurfacePointer.reinterpret(),
                    gError.ptr
                )?.run {
                    GLContext(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Creates a new `GdkVulkanContext` for rendering on @surface.
     *
     * If the creation of the `GdkVulkanContext` failed, @error will be set.
     *
     * @return the newly created `GdkVulkanContext`, or
     *   null on error
     */
    public open fun createVulkanContext(): Result<VulkanContext> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                gdk_surface_create_vulkan_context(
                    gdkSurfacePointer.reinterpret(),
                    gError.ptr
                )?.run {
                    VulkanContext(reinterpret())
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
    public open fun destroy(): Unit = gdk_surface_destroy(gdkSurfacePointer.reinterpret())

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
    public open fun getCursor(): Cursor? =
        gdk_surface_get_cursor(gdkSurfacePointer.reinterpret())?.run {
            Cursor(reinterpret())
        }

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
        gdk_surface_get_device_cursor(
            gdkSurfacePointer.reinterpret(),
            device.gdkDevicePointer.reinterpret()
        )?.run {
            Cursor(reinterpret())
        }

    /**
     * Gets the `GdkDisplay` associated with a `GdkSurface`.
     *
     * @return the `GdkDisplay` associated with @surface
     */
    public open fun getDisplay(): Display =
        gdk_surface_get_display(gdkSurfacePointer.reinterpret())!!.run {
            Display(reinterpret())
        }

    /**
     * Gets the frame clock for the surface.
     *
     * The frame clock for a surface never changes unless the surface is
     * reparented to a new toplevel surface.
     *
     * @return the frame clock
     */
    public open fun getFrameClock(): FrameClock =
        gdk_surface_get_frame_clock(gdkSurfacePointer.reinterpret())!!.run {
            FrameClock(reinterpret())
        }

    /**
     * Returns the height of the given @surface.
     *
     * Surface size is reported in ”application pixels”, not
     * ”device pixels” (see [method@Gdk.Surface.get_scale_factor]).
     *
     * @return The height of @surface
     */
    public open fun getHeight(): Int = gdk_surface_get_height(gdkSurfacePointer.reinterpret())

    /**
     * Checks whether the surface has been mapped.
     *
     * A surface is mapped with [method@Gdk.Toplevel.present]
     * or [method@Gdk.Popup.present].
     *
     * @return true if the surface is mapped
     */
    public open fun getMapped(): Boolean = gdk_surface_get_mapped(gdkSurfacePointer.reinterpret()).asBoolean()

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
     * The scale of a surface may change during runtime.
     *
     * @return the scale factor
     */
    public open fun getScaleFactor(): Int = gdk_surface_get_scale_factor(gdkSurfacePointer.reinterpret())

    /**
     * Returns the width of the given @surface.
     *
     * Surface size is reported in ”application pixels”, not
     * ”device pixels” (see [method@Gdk.Surface.get_scale_factor]).
     *
     * @return The width of @surface
     */
    public open fun getWidth(): Int = gdk_surface_get_width(gdkSurfacePointer.reinterpret())

    /**
     * Hide the surface.
     *
     * For toplevel surfaces, withdraws them, so they will no longer be
     * known to the window manager; for all surfaces, unmaps them, so
     * they won’t be displayed. Normally done automatically as
     * part of [method@Gtk.Widget.hide].
     */
    public open fun hide(): Unit = gdk_surface_hide(gdkSurfacePointer.reinterpret())

    /**
     * Check to see if a surface is destroyed.
     *
     * @return true if the surface is destroyed
     */
    public open fun isDestroyed(): Boolean = gdk_surface_is_destroyed(gdkSurfacePointer.reinterpret()).asBoolean()

    /**
     * Forces a [signal@Gdk.Surface::render] signal emission for @surface
     * to be scheduled.
     *
     * This function is useful for implementations that track invalid
     * regions on their own.
     */
    public open fun queueRender(): Unit = gdk_surface_queue_render(gdkSurfacePointer.reinterpret())

    /**
     * Request a layout phase from the surface's frame clock.
     *
     * See [method@Gdk.FrameClock.request_phase].
     */
    public open fun requestLayout(): Unit = gdk_surface_request_layout(gdkSurfacePointer.reinterpret())

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
    public open fun setCursor(cursor: Cursor? = null): Unit =
        gdk_surface_set_cursor(
            gdkSurfacePointer.reinterpret(),
            cursor?.gdkCursorPointer?.reinterpret()
        )

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
    public open fun setDeviceCursor(
        device: Device,
        cursor: Cursor,
    ): Unit =
        gdk_surface_set_device_cursor(
            gdkSurfacePointer.reinterpret(),
            device.gdkDevicePointer.reinterpret(),
            cursor.gdkCursorPointer.reinterpret()
        )

    /**
     * Emitted when @surface starts being present on the monitor.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `monitor` the monitor
     */
    public fun connectEnterMonitor(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (monitor: Monitor) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "enter-monitor",
            connectEnterMonitorFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when GDK receives an input event for @surface.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `event` an input event. Returns true to
     * indicate that the event has been handled
     */
    public fun connectEvent(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (event: Event) -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "event",
            connectEventFunc.reinterpret(),
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
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `width` the current width; `height` the
     * current height
     */
    public fun connectLayout(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            width: Int,
            height: Int,
        ) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "layout",
            connectLayoutFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when @surface stops being present on the monitor.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `monitor` the monitor
     */
    public fun connectLeaveMonitor(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (monitor: Monitor) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "leave-monitor",
            connectLeaveMonitorFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Surface> {
        override val type: GeneratedClassKGType<Surface> =
            GeneratedClassKGType(gdk_surface_get_type()) { Surface(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }
    }
}

private val connectEnterMonitorFunc: CPointer<CFunction<(CPointer<GdkMonitor>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            monitor: CPointer<GdkMonitor>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(monitor: Monitor) -> Unit>().get().invoke(
            monitor!!.run {
                Monitor(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectEventFunc: CPointer<CFunction<(CPointer<GdkEvent>) -> Int>> =
    staticCFunction {
            _: COpaquePointer,
            event: CPointer<GdkEvent>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(event: Event) -> Boolean>().get().invoke(
            event!!.run {
                Event(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

private val connectLayoutFunc: CPointer<CFunction<(Int, Int) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            width: Int,
            height: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(width: Int, height: Int) -> Unit>().get().invoke(width, height)
    }
        .reinterpret()

private val connectLeaveMonitorFunc: CPointer<CFunction<(CPointer<GdkMonitor>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            monitor: CPointer<GdkMonitor>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(monitor: Monitor) -> Unit>().get().invoke(
            monitor!!.run {
                Monitor(reinterpret())
            }
        )
    }
        .reinterpret()
