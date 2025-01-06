// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Gdk.resolveException
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_4
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_6
import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkGLContext
import org.gtkkn.native.gdk.gdk_gl_context_clear_current
import org.gtkkn.native.gdk.gdk_gl_context_get_allowed_apis
import org.gtkkn.native.gdk.gdk_gl_context_get_api
import org.gtkkn.native.gdk.gdk_gl_context_get_current
import org.gtkkn.native.gdk.gdk_gl_context_get_debug_enabled
import org.gtkkn.native.gdk.gdk_gl_context_get_display
import org.gtkkn.native.gdk.gdk_gl_context_get_forward_compatible
import org.gtkkn.native.gdk.gdk_gl_context_get_shared_context
import org.gtkkn.native.gdk.gdk_gl_context_get_surface
import org.gtkkn.native.gdk.gdk_gl_context_get_type
import org.gtkkn.native.gdk.gdk_gl_context_get_use_es
import org.gtkkn.native.gdk.gdk_gl_context_is_legacy
import org.gtkkn.native.gdk.gdk_gl_context_is_shared
import org.gtkkn.native.gdk.gdk_gl_context_make_current
import org.gtkkn.native.gdk.gdk_gl_context_realize
import org.gtkkn.native.gdk.gdk_gl_context_set_allowed_apis
import org.gtkkn.native.gdk.gdk_gl_context_set_debug_enabled
import org.gtkkn.native.gdk.gdk_gl_context_set_forward_compatible
import org.gtkkn.native.gdk.gdk_gl_context_set_required_version
import org.gtkkn.native.gdk.gdk_gl_context_set_use_es
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Result
import kotlin.Unit

/**
 * `GdkGLContext` is an object representing a platform-specific
 * OpenGL draw context.
 *
 * `GdkGLContext`s are created for a surface using
 * [method@Gdk.Surface.create_gl_context], and the context will match
 * the characteristics of the surface.
 *
 * A `GdkGLContext` is not tied to any particular normal framebuffer.
 * For instance, it cannot draw to the surface back buffer. The GDK
 * repaint system is in full control of the painting to that. Instead,
 * you can create render buffers or textures and use [func@cairo_draw_from_gl]
 * in the draw function of your widget to draw them. Then GDK will handle
 * the integration of your rendering with that of other widgets.
 *
 * Support for `GdkGLContext` is platform-specific and context creation
 * can fail, returning null context.
 *
 * A `GdkGLContext` has to be made "current" in order to start using
 * it, otherwise any OpenGL call will be ignored.
 *
 * ## Creating a new OpenGL context
 *
 * In order to create a new `GdkGLContext` instance you need a `GdkSurface`,
 * which you typically get during the realize call of a widget.
 *
 * A `GdkGLContext` is not realized until either [method@Gdk.GLContext.make_current]
 * or [method@Gdk.GLContext.realize] is called. It is possible to specify
 * details of the GL context like the OpenGL version to be used, or whether
 * the GL context should have extra state validation enabled after calling
 * [method@Gdk.Surface.create_gl_context] by calling [method@Gdk.GLContext.realize].
 * If the realization fails you have the option to change the settings of
 * the `GdkGLContext` and try again.
 *
 * ## Using a GdkGLContext
 *
 * You will need to make the `GdkGLContext` the current context before issuing
 * OpenGL calls; the system sends OpenGL commands to whichever context is current.
 * It is possible to have multiple contexts, so you always need to ensure that
 * the one which you want to draw with is the current one before issuing commands:
 *
 * ```c
 * gdk_gl_context_make_current (context);
 * ```
 *
 * You can now perform your drawing using OpenGL commands.
 *
 * You can check which `GdkGLContext` is the current one by using
 * [func@Gdk.GLContext.get_current]; you can also unset any `GdkGLContext`
 * that is currently set by calling [func@Gdk.GLContext.clear_current].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `major`: major: Out parameter is not supported
 * - parameter `major`: major: Out parameter is not supported
 */
public open class GlContext(pointer: CPointer<GdkGLContext>) :
    DrawContext(pointer.reinterpret()),
    KGTyped {
    public val gdkGlContextPointer: CPointer<GdkGLContext>
        get() = gPointer.reinterpret()

    /**
     * The allowed APIs.
     *
     * @since 4.6
     */
    @GdkVersion4_6
    public open var allowedApis: Glapi
        /**
         * Gets the allowed APIs set via gdk_gl_context_set_allowed_apis().
         *
         * @return the allowed APIs
         * @since 4.6
         */
        get() = gdk_gl_context_get_allowed_apis(gdkGlContextPointer.reinterpret()).run {
            Glapi(this)
        }

        /**
         * Sets the allowed APIs. When gdk_gl_context_realize() is called, only the
         * allowed APIs will be tried. If you set this to 0, realizing will always fail.
         *
         * If you set it on a realized context, the property will not have any effect.
         * It is only relevant during gdk_gl_context_realize().
         *
         * By default, all APIs are allowed.
         *
         * @param apis the allowed APIs
         * @since 4.6
         */
        @GdkVersion4_6
        set(apis) = gdk_gl_context_set_allowed_apis(gdkGlContextPointer.reinterpret(), apis.mask)

    /**
     * The API currently in use.
     *
     * @since 4.6
     */
    @GdkVersion4_6
    public open val api: Glapi
        /**
         * Gets the API currently in use.
         *
         * If the renderer has not been realized yet, 0 is returned.
         *
         * @return the currently used API
         * @since 4.6
         */
        get() = gdk_gl_context_get_api(gdkGlContextPointer.reinterpret()).run {
            Glapi(this)
        }

    /**
     * Always null
     *
     * As many contexts can share data now and no single shared context exists
     * anymore, this function has been deprecated and now always returns null.
     */
    public open val sharedContext: GlContext?
        /**
         * Used to retrieves the `GdkGLContext` that this @context share data with.
         *
         * As many contexts can share data now and no single shared context exists
         * anymore, this function has been deprecated and now always returns null.
         *
         * @return null
         */
        get() = gdk_gl_context_get_shared_context(gdkGlContextPointer.reinterpret())?.run {
            GlContext(reinterpret())
        }

    /**
     * The `GdkDisplay` used to create the `GdkDrawContext`.
     */
    public override val display: Display?
        /**
         * Retrieves the display the @context is created for
         *
         * @return a `GdkDisplay`
         */
        get() = gdk_gl_context_get_display(gdkGlContextPointer.reinterpret())?.run {
            Display(reinterpret())
        }

    /**
     * The `GdkSurface` the context is bound to.
     */
    public override val surface: Surface?
        /**
         * Retrieves the surface used by the @context.
         *
         * @return a `GdkSurface`
         */
        get() = gdk_gl_context_get_surface(gdkGlContextPointer.reinterpret())?.run {
            Surface(reinterpret())
        }

    /**
     * Retrieves whether the context is doing extra validations and runtime checking.
     *
     * See [method@Gdk.GLContext.set_debug_enabled].
     *
     * @return true if debugging is enabled
     */
    public open fun getDebugEnabled(): Boolean =
        gdk_gl_context_get_debug_enabled(gdkGlContextPointer.reinterpret()).asBoolean()

    /**
     * Retrieves whether the context is forward-compatible.
     *
     * See [method@Gdk.GLContext.set_forward_compatible].
     *
     * @return true if the context should be forward-compatible
     */
    public open fun getForwardCompatible(): Boolean =
        gdk_gl_context_get_forward_compatible(gdkGlContextPointer.reinterpret()).asBoolean()

    /**
     * Checks whether the @context is using an OpenGL or OpenGL ES profile.
     *
     * @return true if the `GdkGLContext` is using an OpenGL ES profile;
     * false if other profile is in use of if the @context has not yet
     * been realized.
     */
    public open fun getUseEs(): Boolean = gdk_gl_context_get_use_es(gdkGlContextPointer.reinterpret()).asBoolean()

    /**
     * Whether the `GdkGLContext` is in legacy mode or not.
     *
     * The `GdkGLContext` must be realized before calling this function.
     *
     * When realizing a GL context, GDK will try to use the OpenGL 3.2 core
     * profile; this profile removes all the OpenGL API that was deprecated
     * prior to the 3.2 version of the specification. If the realization is
     * successful, this function will return false.
     *
     * If the underlying OpenGL implementation does not support core profiles,
     * GDK will fall back to a pre-3.2 compatibility profile, and this function
     * will return true.
     *
     * You can use the value returned by this function to decide which kind
     * of OpenGL API to use, or whether to do extension discovery, or what
     * kind of shader programs to load.
     *
     * @return true if the GL context is in legacy mode
     */
    public open fun isLegacy(): Boolean = gdk_gl_context_is_legacy(gdkGlContextPointer.reinterpret()).asBoolean()

    /**
     * Checks if the two GL contexts can share resources.
     *
     * When they can, the texture IDs from @other can be used in @self. This
     * is particularly useful when passing `GdkGLTexture` objects between
     * different contexts.
     *
     * Contexts created for the same display with the same properties will
     * always be compatible, even if they are created for different surfaces.
     * For other contexts it depends on the GL backend.
     *
     * Both contexts must be realized for this check to succeed. If either one
     * is not, this function will return false.
     *
     * @param other the `GdkGLContext` that should be compatible with @self
     * @return true if the two GL contexts are compatible.
     * @since 4.4
     */
    @GdkVersion4_4
    public open fun isShared(other: GlContext): Boolean =
        gdk_gl_context_is_shared(gdkGlContextPointer.reinterpret(), other.gdkGlContextPointer.reinterpret()).asBoolean()

    /**
     * Makes the @context the current one.
     */
    public open fun makeCurrent(): Unit = gdk_gl_context_make_current(gdkGlContextPointer.reinterpret())

    /**
     * Realizes the given `GdkGLContext`.
     *
     * It is safe to call this function on a realized `GdkGLContext`.
     *
     * @return true if the context is realized
     */
    public open fun realize(): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gdk_gl_context_realize(gdkGlContextPointer.reinterpret(), gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Sets whether the `GdkGLContext` should perform extra validations and
     * runtime checking.
     *
     * This is useful during development, but has additional overhead.
     *
     * The `GdkGLContext` must not be realized or made current prior to
     * calling this function.
     *
     * @param enabled whether to enable debugging in the context
     */
    public open fun setDebugEnabled(enabled: Boolean): Unit =
        gdk_gl_context_set_debug_enabled(gdkGlContextPointer.reinterpret(), enabled.asGBoolean())

    /**
     * Sets whether the `GdkGLContext` should be forward-compatible.
     *
     * Forward-compatible contexts must not support OpenGL functionality that
     * has been marked as deprecated in the requested version; non-forward
     * compatible contexts, on the other hand, must support both deprecated and
     * non deprecated functionality.
     *
     * The `GdkGLContext` must not be realized or made current prior to calling
     * this function.
     *
     * @param compatible whether the context should be forward-compatible
     */
    public open fun setForwardCompatible(compatible: Boolean): Unit =
        gdk_gl_context_set_forward_compatible(gdkGlContextPointer.reinterpret(), compatible.asGBoolean())

    /**
     * Sets the major and minor version of OpenGL to request.
     *
     * Setting @major and @minor to zero will use the default values.
     *
     * Setting @major and @minor lower than the minimum versions required
     * by GTK will result in the context choosing the minimum version.
     *
     * The @context must not be realized or made current prior to calling
     * this function.
     *
     * @param major the major version to request
     * @param minor the minor version to request
     */
    public open fun setRequiredVersion(major: gint, minor: gint): Unit =
        gdk_gl_context_set_required_version(gdkGlContextPointer.reinterpret(), major, minor)

    /**
     * Requests that GDK create an OpenGL ES context instead of an OpenGL one.
     *
     * Not all platforms support OpenGL ES.
     *
     * The @context must not have been realized.
     *
     * By default, GDK will attempt to automatically detect whether the
     * underlying GL implementation is OpenGL or OpenGL ES once the @context
     * is realized.
     *
     * You should check the return value of [method@Gdk.GLContext.get_use_es]
     * after calling [method@Gdk.GLContext.realize] to decide whether to use
     * the OpenGL or OpenGL ES API, extensions, or shaders.
     *
     * @param useEs whether the context should use OpenGL ES instead of OpenGL,
     *   or -1 to allow auto-detection
     */
    public open fun setUseEs(useEs: gint): Unit = gdk_gl_context_set_use_es(gdkGlContextPointer.reinterpret(), useEs)

    public companion object : TypeCompanion<GlContext> {
        override val type: GeneratedClassKGType<GlContext> =
            GeneratedClassKGType(gdk_gl_context_get_type()) { GlContext(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Clears the current `GdkGLContext`.
         *
         * Any OpenGL call after this function returns will be ignored
         * until [method@Gdk.GLContext.make_current] is called.
         */
        public fun clearCurrent(): Unit = gdk_gl_context_clear_current()

        /**
         * Retrieves the current `GdkGLContext`.
         *
         * @return the current `GdkGLContext`
         */
        public fun getCurrent(): GlContext? = gdk_gl_context_get_current()?.run {
            GlContext(reinterpret())
        }

        /**
         * Get the GType of GLContext
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_gl_context_get_type()
    }
}
