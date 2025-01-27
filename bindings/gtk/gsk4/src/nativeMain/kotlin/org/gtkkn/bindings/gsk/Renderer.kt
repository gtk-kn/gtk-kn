// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.Region
import org.gtkkn.bindings.gdk.Display
import org.gtkkn.bindings.gdk.Surface
import org.gtkkn.bindings.gdk.Texture
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.graphene.Rect
import org.gtkkn.bindings.gsk.Gsk.resolveException
import org.gtkkn.bindings.gsk.annotations.GskVersion4_14
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskRenderer
import org.gtkkn.native.gsk.gsk_renderer_get_surface
import org.gtkkn.native.gsk.gsk_renderer_get_type
import org.gtkkn.native.gsk.gsk_renderer_is_realized
import org.gtkkn.native.gsk.gsk_renderer_new_for_surface
import org.gtkkn.native.gsk.gsk_renderer_realize
import org.gtkkn.native.gsk.gsk_renderer_realize_for_display
import org.gtkkn.native.gsk.gsk_renderer_render
import org.gtkkn.native.gsk.gsk_renderer_render_texture
import org.gtkkn.native.gsk.gsk_renderer_unrealize
import kotlin.Boolean
import kotlin.Result
import kotlin.Unit

/**
 * `GskRenderer` is a class that renders a scene graph defined via a
 * tree of [class@Gsk.RenderNode] instances.
 *
 * Typically you will use a `GskRenderer` instance to repeatedly call
 * [method@Gsk.Renderer.render] to update the contents of its associated
 * [class@Gdk.Surface].
 *
 * It is necessary to realize a `GskRenderer` instance using
 * [method@Gsk.Renderer.realize] before calling [method@Gsk.Renderer.render],
 * in order to create the appropriate windowing system resources needed
 * to render the scene.
 *
 * ## Skipped during bindings generation
 *
 * - method `realized`: Property has no getter nor setter
 */
public abstract class Renderer(public val gskRendererPointer: CPointer<GskRenderer>) :
    Object(gskRendererPointer.reinterpret()),
    KGTyped {
    /**
     * The surface associated with renderer.
     */
    public open val surface: Surface?
        /**
         * Retrieves the `GdkSurface` set using gsk_enderer_realize().
         *
         * If the renderer has not been realized yet, null will be returned.
         *
         * @return a `GdkSurface`
         */
        get() = gsk_renderer_get_surface(gskRendererPointer)?.run {
            Surface.SurfaceImpl(this)
        }

    /**
     * Creates an appropriate `GskRenderer` instance for the given @surface.
     *
     * If the `GSK_RENDERER` environment variable is set, GSK will
     * try that renderer first, before trying the backend-specific
     * default. The ultimate fallback is the cairo renderer.
     *
     * The renderer will be realized before it is returned.
     *
     * @param surface a `GdkSurface`
     * @return a `GskRenderer`
     */
    public constructor(surface: Surface) : this(gsk_renderer_new_for_surface(surface.gdkSurfacePointer)!!.reinterpret())

    /**
     * Checks whether the @renderer is realized or not.
     *
     * @return true if the `GskRenderer` was realized, and false otherwise
     */
    public open fun isRealized(): Boolean = gsk_renderer_is_realized(gskRendererPointer).asBoolean()

    /**
     * Creates the resources needed by the @renderer to render the scene
     * graph.
     *
     * Since GTK 4.6, the surface may be `NULL`, which allows using
     * renderers without having to create a surface.
     * Since GTK 4.14, it is recommended to use [method@Gsk.Renderer.realize_for_display]
     * instead.
     *
     * Note that it is mandatory to call [method@Gsk.Renderer.unrealize] before
     * destroying the renderer.
     *
     * @param surface the `GdkSurface` renderer will be used on
     * @return Whether the renderer was successfully realized
     */
    public open fun realize(surface: Surface? = null): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gsk_renderer_realize(gskRendererPointer, surface?.gdkSurfacePointer, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Creates the resources needed by the @renderer to render the scene
     * graph.
     *
     * Note that it is mandatory to call [method@Gsk.Renderer.unrealize] before
     * destroying the renderer.
     *
     * @param display the `GdkDisplay` renderer will be used on
     * @return Whether the renderer was successfully realized
     * @since 4.14
     */
    @GskVersion4_14
    public open fun realizeForDisplay(display: Display): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gsk_renderer_realize_for_display(
            gskRendererPointer,
            display.gdkDisplayPointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Renders the scene graph, described by a tree of `GskRenderNode` instances
     * to the renderer's surface,  ensuring that the given @region gets redrawn.
     *
     * If the renderer has no associated surface, this function does nothing.
     *
     * Renderers must ensure that changes of the contents given by the @root
     * node as well as the area given by @region are redrawn. They are however
     * free to not redraw any pixel outside of @region if they can guarantee that
     * it didn't change.
     *
     * The @renderer will acquire a reference on the `GskRenderNode` tree while
     * the rendering is in progress.
     *
     * @param root a `GskRenderNode`
     * @param region the `cairo_region_t` that must be redrawn or null
     *   for the whole window
     */
    public open fun render(root: RenderNode, region: Region? = null): Unit =
        gsk_renderer_render(gskRendererPointer, root.gskRenderNodePointer, region?.cairoRegionPointer)

    /**
     * Renders the scene graph, described by a tree of `GskRenderNode` instances,
     * to a `GdkTexture`.
     *
     * The @renderer will acquire a reference on the `GskRenderNode` tree while
     * the rendering is in progress.
     *
     * If you want to apply any transformations to @root, you should put it into a
     * transform node and pass that node instead.
     *
     * @param root a `GskRenderNode`
     * @param viewport the section to draw or null to use @root's bounds
     * @return a `GdkTexture` with the rendered contents of @root.
     */
    public open fun renderTexture(root: RenderNode, viewport: Rect? = null): Texture = gsk_renderer_render_texture(
        gskRendererPointer,
        root.gskRenderNodePointer,
        viewport?.grapheneRectPointer
    )!!.run {
        Texture.TextureImpl(this)
    }

    /**
     * Releases all the resources created by gsk_renderer_realize().
     */
    public open fun unrealize(): Unit = gsk_renderer_unrealize(gskRendererPointer)

    /**
     * The RendererImpl type represents a native instance of the abstract Renderer class.
     *
     * @constructor Creates a new instance of Renderer for the provided [CPointer].
     */
    public class RendererImpl(pointer: CPointer<GskRenderer>) : Renderer(pointer)

    public companion object : TypeCompanion<Renderer> {
        override val type: GeneratedClassKGType<Renderer> =
            GeneratedClassKGType(getTypeOrNull("gsk_renderer_get_type")!!) { RendererImpl(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of Renderer
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_renderer_get_type()
    }
}
