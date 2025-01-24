// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.cairo.Context
import org.gtkkn.bindings.cairo.Surface
import org.gtkkn.bindings.graphene.Rect
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskCairoNode
import org.gtkkn.native.gsk.gsk_cairo_node_get_draw_context
import org.gtkkn.native.gsk.gsk_cairo_node_get_surface
import org.gtkkn.native.gsk.gsk_cairo_node_get_type
import org.gtkkn.native.gsk.gsk_cairo_node_new

/**
 * A render node for a Cairo surface.
 */
public open class CairoNode(public val gskCairoNodePointer: CPointer<GskCairoNode>) :
    RenderNode(gskCairoNodePointer.reinterpret()),
    KGTyped {
    /**
     * Creates a `GskRenderNode` that will render a cairo surface
     * into the area given by @bounds.
     *
     * You can draw to the cairo surface using [method@Gsk.CairoNode.get_draw_context].
     *
     * @param bounds the rectangle to render to
     * @return A new `GskRenderNode`
     */
    public constructor(bounds: Rect) : this(gsk_cairo_node_new(bounds.grapheneRectPointer)!!.reinterpret())

    /**
     * Creates a Cairo context for drawing using the surface associated
     * to the render node.
     *
     * If no surface exists yet, a surface will be created optimized for
     * rendering to @renderer.
     *
     * @return a Cairo context used for drawing; use
     *   cairo_destroy() when done drawing
     */
    public open fun getDrawContext(): Context =
        gsk_cairo_node_get_draw_context(gskCairoNodePointer.reinterpret())!!.run {
            Context(this)
        }

    /**
     * Retrieves the Cairo surface used by the render node.
     *
     * @return a Cairo surface
     */
    public open fun getSurface(): Surface = gsk_cairo_node_get_surface(gskCairoNodePointer.reinterpret())!!.run {
        Surface(this)
    }

    public companion object : TypeCompanion<CairoNode> {
        override val type: GeneratedClassKGType<CairoNode> =
            GeneratedClassKGType(gsk_cairo_node_get_type()) { CairoNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of CairoNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_cairo_node_get_type()
    }
}
