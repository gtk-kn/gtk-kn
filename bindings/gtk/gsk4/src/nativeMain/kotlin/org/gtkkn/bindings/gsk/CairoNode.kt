// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.graphene.Rect
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gsk.GskCairoNode
import org.gtkkn.native.gsk.gsk_cairo_node_get_type
import org.gtkkn.native.gsk.gsk_cairo_node_new

/**
 * A render node for a Cairo surface.
 *
 * ## Skipped during bindings generation
 *
 * - method `get_draw_context`: Return type cairo.Context is unsupported
 * - method `get_surface`: Return type cairo.Surface is unsupported
 */
public open class CairoNode(
    pointer: CPointer<GskCairoNode>,
) : RenderNode(pointer.reinterpret()),
    KGTyped {
    public val gskCairoNodePointer: CPointer<GskCairoNode>
        get() = gPointer.reinterpret()

    /**
     * Creates a `GskRenderNode` that will render a cairo surface
     * into the area given by @bounds.
     *
     * You can draw to the cairo surface using [method@Gsk.CairoNode.get_draw_context].
     *
     * @param bounds the rectangle to render to
     * @return A new `GskRenderNode`
     */
    public constructor(
        bounds: Rect,
    ) : this(gsk_cairo_node_new(bounds.grapheneRectPointer.reinterpret())!!.reinterpret())

    public companion object : TypeCompanion<CairoNode> {
        override val type: GeneratedClassKGType<CairoNode> =
            GeneratedClassKGType(gsk_cairo_node_get_type()) { CairoNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }
    }
}
