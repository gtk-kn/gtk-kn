// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gdk.GlContext
import org.gtkkn.bindings.gdk.Glapi
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_12
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkGLContext
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkGLArea
import org.gtkkn.native.gtk.gtk_gl_area_attach_buffers
import org.gtkkn.native.gtk.gtk_gl_area_get_allowed_apis
import org.gtkkn.native.gtk.gtk_gl_area_get_api
import org.gtkkn.native.gtk.gtk_gl_area_get_auto_render
import org.gtkkn.native.gtk.gtk_gl_area_get_context
import org.gtkkn.native.gtk.gtk_gl_area_get_error
import org.gtkkn.native.gtk.gtk_gl_area_get_has_depth_buffer
import org.gtkkn.native.gtk.gtk_gl_area_get_has_stencil_buffer
import org.gtkkn.native.gtk.gtk_gl_area_get_type
import org.gtkkn.native.gtk.gtk_gl_area_get_use_es
import org.gtkkn.native.gtk.gtk_gl_area_make_current
import org.gtkkn.native.gtk.gtk_gl_area_new
import org.gtkkn.native.gtk.gtk_gl_area_queue_render
import org.gtkkn.native.gtk.gtk_gl_area_set_allowed_apis
import org.gtkkn.native.gtk.gtk_gl_area_set_auto_render
import org.gtkkn.native.gtk.gtk_gl_area_set_error
import org.gtkkn.native.gtk.gtk_gl_area_set_has_depth_buffer
import org.gtkkn.native.gtk.gtk_gl_area_set_has_stencil_buffer
import org.gtkkn.native.gtk.gtk_gl_area_set_required_version
import org.gtkkn.native.gtk.gtk_gl_area_set_use_es
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkGLArea` is a widget that allows drawing with OpenGL.
 *
 * ![An example GtkGLArea](glarea.png)
 *
 * `GtkGLArea` sets up its own [class@Gdk.GLContext], and creates a custom
 * GL framebuffer that the widget will do GL rendering onto. It also ensures
 * that this framebuffer is the default GL rendering target when rendering.
 * The completed rendering is integrated into the larger GTK scene graph as
 * a texture.
 *
 * In order to draw, you have to connect to the [signal@Gtk.GLArea::render]
 * signal, or subclass `GtkGLArea` and override the GtkGLAreaClass.render
 * virtual function.
 *
 * The `GtkGLArea` widget ensures that the `GdkGLContext` is associated with
 * the widget's drawing area, and it is kept updated when the size and
 * position of the drawing area changes.
 *
 * ## Drawing with GtkGLArea
 *
 * The simplest way to draw using OpenGL commands in a `GtkGLArea` is to
 * create a widget instance and connect to the [signal@Gtk.GLArea::render] signal:
 *
 * The `render()` function will be called when the `GtkGLArea` is ready
 * for you to draw its content:
 *
 * The initial contents of the framebuffer are transparent.
 *
 * ```c
 * static gboolean
 * render (GtkGLArea *area, GdkGLContext *context)
 * {
 *   // inside this function it's safe to use GL; the given
 *   // GdkGLContext has been made current to the drawable
 *   // surface used by the `GtkGLArea` and the viewport has
 *   // already been set to be the size of the allocation
 *
 *   // we can start by clearing the buffer
 *   glClearColor (0, 0, 0, 0);
 *   glClear (GL_COLOR_BUFFER_BIT);
 *
 *   // draw your object
 *   // draw_an_object ();
 *
 *   // we completed our drawing; the draw commands will be
 *   // flushed at the end of the signal emission chain, and
 *   // the buffers will be drawn on the window
 *   return TRUE;
 * }
 *
 * void setup_glarea (void)
 * {
 *   // create a GtkGLArea instance
 *   GtkWidget *gl_area = gtk_gl_area_new ();
 *
 *   // connect to the "render" signal
 *   g_signal_connect (gl_area, "render", G_CALLBACK (render), NULL);
 * }
 * ```
 *
 * If you need to initialize OpenGL state, e.g. buffer objects or
 * shaders, you should use the [signal@Gtk.Widget::realize] signal;
 * you can use the [signal@Gtk.Widget::unrealize] signal to clean up.
 * Since the `GdkGLContext` creation and initialization may fail, you
 * will need to check for errors, using [method@Gtk.GLArea.get_error].
 *
 * An example of how to safely initialize the GL state is:
 *
 * ```c
 * static void
 * on_realize (GtkGLarea *area)
 * {
 *   // We need to make the context current if we want to
 *   // call GL API
 *   gtk_gl_area_make_current (area);
 *
 *   // If there were errors during the initialization or
 *   // when trying to make the context current, this
 *   // function will return a GError for you to catch
 *   if (gtk_gl_area_get_error (area) != NULL)
 *     return;
 *
 *   // You can also use gtk_gl_area_set_error() in order
 *   // to show eventual initialization errors on the
 *   // GtkGLArea widget itself
 *   GError *internal_error = NULL;
 *   init_buffer_objects (&error);
 *   if (error != NULL)
 *     {
 *       gtk_gl_area_set_error (area, error);
 *       g_error_free (error);
 *       return;
 *     }
 *
 *   init_shaders (&error);
 *   if (error != NULL)
 *     {
 *       gtk_gl_area_set_error (area, error);
 *       g_error_free (error);
 *       return;
 *     }
 * }
 * ```
 *
 * If you need to change the options for creating the `GdkGLContext`
 * you should use the [signal@Gtk.GLArea::create-context] signal.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `major`: major: Out parameter is not supported
 * - signal `render`: Signal render is ignored
 */
public open class GlArea(pointer: CPointer<GtkGLArea>) :
    Widget(pointer.reinterpret()),
    KGTyped {
    public val gtkGlAreaPointer: CPointer<GtkGLArea>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The allowed APIs.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open var allowedApis: Glapi
        /**
         * Gets the allowed APIs.
         *
         * See [method@Gtk.GLArea.set_allowed_apis].
         *
         * @return the allowed APIs
         * @since 4.12
         */
        get() = gtk_gl_area_get_allowed_apis(gtkGlAreaPointer.reinterpret()).run {
            Glapi(this)
        }

        /**
         * Sets the allowed APIs to create a context with.
         *
         * You should check [property@Gtk.GLArea:api] before drawing
         * with either API.
         *
         * By default, all APIs are allowed.
         *
         * @param apis the allowed APIs
         * @since 4.12
         */
        @GtkVersion4_12
        set(apis) = gtk_gl_area_set_allowed_apis(gtkGlAreaPointer.reinterpret(), apis.mask)

    /**
     * The API currently in use.
     *
     * @since 4.12
     */
    @GtkVersion4_12
    public open val api: Glapi
        /**
         * Gets the API that is currently in use.
         *
         * If the GL area has not been realized yet, 0 is returned.
         *
         * @return the currently used API
         * @since 4.12
         */
        get() = gtk_gl_area_get_api(gtkGlAreaPointer.reinterpret()).run {
            Glapi(this)
        }

    /**
     * If set to true the ::render signal will be emitted every time
     * the widget draws.
     *
     * This is the default and is useful if drawing the widget is faster.
     *
     * If set to false the data from previous rendering is kept around and will
     * be used for drawing the widget the next time, unless the window is resized.
     * In order to force a rendering [method@Gtk.GLArea.queue_render] must be called.
     * This mode is useful when the scene changes seldom, but takes a long time
     * to redraw.
     */
    public open var autoRender: Boolean
        /**
         * Returns whether the area is in auto render mode or not.
         *
         * @return true if the @area is auto rendering, false otherwise
         */
        get() = gtk_gl_area_get_auto_render(gtkGlAreaPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the `GtkGLArea` is in auto render mode.
         *
         * If @auto_render is true the [signal@Gtk.GLArea::render] signal will
         * be emitted every time the widget draws. This is the default and is
         * useful if drawing the widget is faster.
         *
         * If @auto_render is false the data from previous rendering is kept
         * around and will be used for drawing the widget the next time,
         * unless the window is resized. In order to force a rendering
         * [method@Gtk.GLArea.queue_render] must be called. This mode is
         * useful when the scene changes seldom, but takes a long time to redraw.
         *
         * @param autoRender a boolean
         */
        set(autoRender) = gtk_gl_area_set_auto_render(gtkGlAreaPointer.reinterpret(), autoRender.asGBoolean())

    /**
     * The `GdkGLContext` used by the `GtkGLArea` widget.
     *
     * The `GtkGLArea` widget is responsible for creating the `GdkGLContext`
     * instance. If you need to render with other kinds of buffers (stencil,
     * depth, etc), use render buffers.
     */
    public open val context: GlContext?
        /**
         * Retrieves the `GdkGLContext` used by @area.
         *
         * @return the `GdkGLContext`
         */
        get() = gtk_gl_area_get_context(gtkGlAreaPointer.reinterpret())?.run {
            GlContext(reinterpret())
        }

    /**
     * If set to true the widget will allocate and enable a depth buffer for the
     * target framebuffer.
     *
     * Setting this property will enable GL's depth testing as a side effect. If
     * you don't need depth testing, you should call `glDisable(GL_DEPTH_TEST)`
     * in your `GtkGLArea::render` handler.
     */
    public open var hasDepthBuffer: Boolean
        /**
         * Returns whether the area has a depth buffer.
         *
         * @return true if the @area has a depth buffer, false otherwise
         */
        get() = gtk_gl_area_get_has_depth_buffer(gtkGlAreaPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the `GtkGLArea` should use a depth buffer.
         *
         * If @has_depth_buffer is true the widget will allocate and
         * enable a depth buffer for the target framebuffer. Otherwise
         * there will be none.
         *
         * @param hasDepthBuffer true to add a depth buffer
         */
        set(
            hasDepthBuffer
        ) = gtk_gl_area_set_has_depth_buffer(gtkGlAreaPointer.reinterpret(), hasDepthBuffer.asGBoolean())

    /**
     * If set to true the widget will allocate and enable a stencil buffer for the
     * target framebuffer.
     */
    public open var hasStencilBuffer: Boolean
        /**
         * Returns whether the area has a stencil buffer.
         *
         * @return true if the @area has a stencil buffer, false otherwise
         */
        get() = gtk_gl_area_get_has_stencil_buffer(gtkGlAreaPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the `GtkGLArea` should use a stencil buffer.
         *
         * If @has_stencil_buffer is true the widget will allocate and
         * enable a stencil buffer for the target framebuffer. Otherwise
         * there will be none.
         *
         * @param hasStencilBuffer true to add a stencil buffer
         */
        set(
            hasStencilBuffer
        ) = gtk_gl_area_set_has_stencil_buffer(gtkGlAreaPointer.reinterpret(), hasStencilBuffer.asGBoolean())

    /**
     * If set to true the widget will try to create a `GdkGLContext` using
     * OpenGL ES instead of OpenGL.
     */
    public open var useEs: Boolean
        /**
         * Returns whether the `GtkGLArea` should use OpenGL ES.
         *
         * See [method@Gtk.GLArea.set_use_es].
         *
         * @return true if the `GtkGLArea` should create an OpenGL ES context
         *   and false otherwise
         */
        get() = gtk_gl_area_get_use_es(gtkGlAreaPointer.reinterpret()).asBoolean()

        /**
         * Sets whether the @area should create an OpenGL or an OpenGL ES context.
         *
         * You should check the capabilities of the `GdkGLContext` before drawing
         * with either API.
         *
         * @param useEs whether to use OpenGL or OpenGL ES
         */
        set(useEs) = gtk_gl_area_set_use_es(gtkGlAreaPointer.reinterpret(), useEs.asGBoolean())

    /**
     * Creates a new `GtkGLArea` widget.
     *
     * @return a new `GtkGLArea`
     */
    public constructor() : this(gtk_gl_area_new()!!.reinterpret())

    /**
     * Binds buffers to the framebuffer.
     *
     * Ensures that the @area framebuffer object is made the current draw
     * and read target, and that all the required buffers for the @area
     * are created and bound to the framebuffer.
     *
     * This function is automatically called before emitting the
     * [signal@Gtk.GLArea::render] signal, and doesn't normally need to be
     * called by application code.
     */
    public open fun attachBuffers(): Unit = gtk_gl_area_attach_buffers(gtkGlAreaPointer.reinterpret())

    /**
     * Gets the current error set on the @area.
     *
     * @return the `GError`
     */
    public open fun getError(): Error? = gtk_gl_area_get_error(gtkGlAreaPointer.reinterpret())?.run {
        Error(reinterpret())
    }

    /**
     * Ensures that the `GdkGLContext` used by @area is associated with
     * the `GtkGLArea`.
     *
     * This function is automatically called before emitting the
     * [signal@Gtk.GLArea::render] signal, and doesn't normally need
     * to be called by application code.
     */
    public open fun makeCurrent(): Unit = gtk_gl_area_make_current(gtkGlAreaPointer.reinterpret())

    /**
     * Marks the currently rendered data (if any) as invalid, and queues
     * a redraw of the widget.
     *
     * This ensures that the [signal@Gtk.GLArea::render] signal
     * is emitted during the draw.
     *
     * This is only needed when [method@Gtk.GLArea.set_auto_render] has
     * been called with a false value. The default behaviour is to
     * emit [signal@Gtk.GLArea::render] on each draw.
     */
    public open fun queueRender(): Unit = gtk_gl_area_queue_render(gtkGlAreaPointer.reinterpret())

    /**
     * Sets an error on the area which will be shown instead of the
     * GL rendering.
     *
     * This is useful in the [signal@Gtk.GLArea::create-context]
     * signal if GL context creation fails.
     *
     * @param error a new `GError`, or null to unset the error
     */
    public open fun setError(error: Error? = null): Unit =
        gtk_gl_area_set_error(gtkGlAreaPointer.reinterpret(), error?.gPointer?.reinterpret())

    /**
     * Sets the required version of OpenGL to be used when creating
     * the context for the widget.
     *
     * This function must be called before the area has been realized.
     *
     * @param major the major version
     * @param minor the minor version
     */
    public open fun setRequiredVersion(major: gint, minor: gint): Unit =
        gtk_gl_area_set_required_version(gtkGlAreaPointer.reinterpret(), major, minor)

    /**
     * Emitted when the widget is being realized.
     *
     * This allows you to override how the GL context is created.
     * This is useful when you want to reuse an existing GL context,
     * or if you want to try creating different kinds of GL options.
     *
     * If context creation fails then the signal handler can use
     * [method@Gtk.GLArea.set_error] to register a more detailed error
     * of how the construction failed.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Returns a newly created `GdkGLContext`;
     *     the `GtkGLArea` widget will take ownership of the returned value.
     */
    public fun connectCreateContext(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> GlContext): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "create-context",
            connectCreateContextFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted once when the widget is realized, and then each time the widget
     * is changed while realized.
     *
     * This is useful in order to keep GL state up to date with the widget size,
     * like for instance camera properties which may depend on the width/height
     * ratio.
     *
     * The GL context for the area is guaranteed to be current when this signal
     * is emitted.
     *
     * The default handler sets up the GL viewport.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `width` the width of the viewport; `height` the height of the viewport
     */
    public fun connectResize(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (width: gint, height: gint) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "resize",
        connectResizeFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<GlArea> {
        override val type: GeneratedClassKGType<GlArea> =
            GeneratedClassKGType(gtk_gl_area_get_type()) { GlArea(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of GLArea
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_gl_area_get_type()
    }
}

private val connectCreateContextFunc: CPointer<CFunction<() -> CPointer<GdkGLContext>>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> GlContext>().get().invoke().gdkGlContextPointer
    }
        .reinterpret()

private val connectResizeFunc: CPointer<CFunction<(gint, gint) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        width: gint,
        height: gint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(width: gint, height: gint) -> Unit>().get().invoke(width, height)
}
    .reinterpret()
