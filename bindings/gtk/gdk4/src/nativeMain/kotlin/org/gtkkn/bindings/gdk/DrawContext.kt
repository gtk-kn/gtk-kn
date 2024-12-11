// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkDrawContext
import org.gtkkn.native.gdk.gdk_draw_context_end_frame
import org.gtkkn.native.gdk.gdk_draw_context_get_display
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
 *
 * ## Skipped during bindings generation
 *
 * - parameter `region`: cairo.Region
 * - method `get_frame_region`: Return type cairo.Region is unsupported
 */
public open class DrawContext(pointer: CPointer<GdkDrawContext>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gdkDrawContextPointer: CPointer<GdkDrawContext>
        get() = gPointer.reinterpret()

    /**
     * The `GdkDisplay` used to create the `GdkDrawContext`.
     */
    public open val display: Display?
        /**
         * Retrieves the `GdkDisplay` the @context is created for
         *
         * @return the `GdkDisplay`
         */
        get() = gdk_draw_context_get_display(gdkDrawContextPointer.reinterpret())?.run {
            Display(reinterpret())
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
        get() = gdk_draw_context_get_surface(gdkDrawContextPointer.reinterpret())?.run {
            Surface(reinterpret())
        }

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
    public open fun endFrame(): Unit = gdk_draw_context_end_frame(gdkDrawContextPointer.reinterpret())

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
    public open fun isInFrame(): Boolean = gdk_draw_context_is_in_frame(gdkDrawContextPointer.reinterpret()).asBoolean()

    public companion object : TypeCompanion<DrawContext> {
        override val type: GeneratedClassKGType<DrawContext> =
            GeneratedClassKGType(gdk_draw_context_get_type()) { DrawContext(it.reinterpret()) }

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
