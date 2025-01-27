// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.Region
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkDrawContext
import org.gtkkn.native.gdk.gdk_draw_context_begin_frame
import org.gtkkn.native.gdk.gdk_draw_context_end_frame
import org.gtkkn.native.gdk.gdk_draw_context_get_display
import org.gtkkn.native.gdk.gdk_draw_context_get_frame_region
import org.gtkkn.native.gdk.gdk_draw_context_get_surface
import org.gtkkn.native.gdk.gdk_draw_context_get_type
import org.gtkkn.native.gdk.gdk_draw_context_is_in_frame
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Unit

/**
 * Base class for objects implementing different rendering methods.
 *
 * `GdkDrawContext` is the base object used by contexts implementing different
 * rendering methods, such as [class@Gdk.CairoContext] or [class@Gdk.GLContext].
 * It provides shared functionality between those contexts.
 *
 * You will always interact with one of those subclasses.
 *
 * A `GdkDrawContext` is always associated with a single toplevel surface.
 */
public abstract class DrawContext(public val gdkDrawContextPointer: CPointer<GdkDrawContext>) :
    Object(gdkDrawContextPointer.reinterpret()),
    KGTyped {
    /**
     * The `GdkDisplay` used to create the `GdkDrawContext`.
     */
    public open val display: Display?
        /**
         * Retrieves the `GdkDisplay` the @context is created for
         *
         * @return the `GdkDisplay`
         */
        get() = gdk_draw_context_get_display(gdkDrawContextPointer)?.run {
            Display(this)
        }

    /**
     * The `GdkSurface` the context is bound to.
     */
    public open val surface: Surface?
        /**
         * Retrieves the surface that @context is bound to.
         *
         * @return a `GdkSurface`
         */
        get() = gdk_draw_context_get_surface(gdkDrawContextPointer)?.run {
            Surface.SurfaceImpl(this)
        }

    /**
     * Indicates that you are beginning the process of redrawing @region
     * on the @context's surface.
     *
     * Calling this function begins a drawing operation using @context on the
     * surface that @context was created from. The actual requirements and
     * guarantees for the drawing operation vary for different implementations
     * of drawing, so a [class@Gdk.CairoContext] and a [class@Gdk.GLContext]
     * need to be treated differently.
     *
     * A call to this function is a requirement for drawing and must be
     * followed by a call to [method@Gdk.DrawContext.end_frame], which will
     * complete the drawing operation and ensure the contents become visible
     * on screen.
     *
     * Note that the @region passed to this function is the minimum region that
     * needs to be drawn and depending on implementation, windowing system and
     * hardware in use, it might be necessary to draw a larger region. Drawing
     * implementation must use [method@Gdk.DrawContext.get_frame_region] to
     * query the region that must be drawn.
     *
     * When using GTK, the widget system automatically places calls to
     * gdk_draw_context_begin_frame() and gdk_draw_context_end_frame() via the
     * use of [GskRenderer](../gsk4/class.Renderer.html)s, so application code
     * does not need to call these functions explicitly.
     *
     * @param region minimum region that should be drawn
     */
    public open fun beginFrame(region: Region): Unit =
        gdk_draw_context_begin_frame(gdkDrawContextPointer, region.cairoRegionPointer)

    /**
     * Ends a drawing operation started with gdk_draw_context_begin_frame().
     *
     * This makes the drawing available on screen.
     * See [method@Gdk.DrawContext.begin_frame] for more details about drawing.
     *
     * When using a [class@Gdk.GLContext], this function may call `glFlush()`
     * implicitly before returning; it is not recommended to call `glFlush()`
     * explicitly before calling this function.
     */
    public open fun endFrame(): Unit = gdk_draw_context_end_frame(gdkDrawContextPointer)

    /**
     * Retrieves the region that is currently being repainted.
     *
     * After a call to [method@Gdk.DrawContext.begin_frame] this function will
     * return a union of the region passed to that function and the area of the
     * surface that the @context determined needs to be repainted.
     *
     * If @context is not in between calls to [method@Gdk.DrawContext.begin_frame]
     * and [method@Gdk.DrawContext.end_frame], null will be returned.
     *
     * @return a Cairo region
     */
    public open fun getFrameRegion(): Region? = gdk_draw_context_get_frame_region(gdkDrawContextPointer)?.run {
        Region(this)
    }

    /**
     * Returns true if @context is in the process of drawing to its surface.
     *
     * This is the case between calls to [method@Gdk.DrawContext.begin_frame]
     * and [method@Gdk.DrawContext.end_frame]. In this situation, drawing commands
     * may be effecting the contents of the @context's surface.
     *
     * @return true if the context is between [method@Gdk.DrawContext.begin_frame]
     *   and [method@Gdk.DrawContext.end_frame] calls.
     */
    public open fun isInFrame(): Boolean = gdk_draw_context_is_in_frame(gdkDrawContextPointer).asBoolean()

    /**
     * The DrawContextImpl type represents a native instance of the abstract DrawContext class.
     *
     * @constructor Creates a new instance of DrawContext for the provided [CPointer].
     */
    public class DrawContextImpl(pointer: CPointer<GdkDrawContext>) : DrawContext(pointer)

    public companion object : TypeCompanion<DrawContext> {
        override val type: GeneratedClassKGType<DrawContext> =
            GeneratedClassKGType(getTypeOrNull("gdk_draw_context_get_type")!!) { DrawContextImpl(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of DrawContext
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_draw_context_get_type()
    }
}
