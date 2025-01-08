// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.Context
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkCairoContext
import org.gtkkn.native.gdk.gdk_cairo_context_cairo_create
import org.gtkkn.native.gdk.gdk_cairo_context_get_type
import org.gtkkn.native.gobject.GType

/**
 * `GdkCairoContext` is an object representing the platform-specific
 * draw context.
 *
 * `GdkCairoContext`s are created for a surface using
 * [method@Gdk.Surface.create_cairo_context], and the context
 * can then be used to draw on that surface.
 */
public open class CairoContext(pointer: CPointer<GdkCairoContext>) :
    DrawContext(pointer.reinterpret()),
    KGTyped {
    public val gdkCairoContextPointer: CPointer<GdkCairoContext>
        get() = gPointer.reinterpret()

    /**
     * Retrieves a Cairo context to be used to draw on the `GdkSurface`
     * of @context.
     *
     * A call to [method@Gdk.DrawContext.begin_frame] with this
     * @context must have been done or this function will return null.
     *
     * The returned context is guaranteed to be valid until
     * [method@Gdk.DrawContext.end_frame] is called.
     *
     * @return a Cairo context
     *   to draw on `GdkSurface
     */
    public open fun cairoCreate(): Context? = gdk_cairo_context_cairo_create(gdkCairoContextPointer)?.run {
        Context(this)
    }

    public companion object : TypeCompanion<CairoContext> {
        override val type: GeneratedClassKGType<CairoContext> =
            GeneratedClassKGType(gdk_cairo_context_get_type()) { CairoContext(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of CairoContext
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_cairo_context_get_type()
    }
}
