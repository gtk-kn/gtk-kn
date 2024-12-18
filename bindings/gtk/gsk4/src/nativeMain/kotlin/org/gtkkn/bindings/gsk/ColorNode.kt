// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Rgba
import org.gtkkn.bindings.graphene.Rect
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskColorNode
import org.gtkkn.native.gsk.gsk_color_node_get_color
import org.gtkkn.native.gsk.gsk_color_node_get_type
import org.gtkkn.native.gsk.gsk_color_node_new

/**
 * A render node for a solid color.
 */
public open class ColorNode(pointer: CPointer<GskColorNode>) :
    RenderNode(pointer.reinterpret()),
    KGTyped {
    public val gskColorNodePointer: CPointer<GskColorNode>
        get() = gPointer.reinterpret()

    /**
     * Creates a `GskRenderNode` that will render the color specified by @rgba into
     * the area given by @bounds.
     *
     * @param rgba a `GdkRGBA` specifying a color
     * @param bounds the rectangle to render the color into
     * @return A new `GskRenderNode`
     */
    public constructor(
        rgba: Rgba,
        bounds: Rect,
    ) : this(
        gsk_color_node_new(rgba.gdkRGBAPointer.reinterpret(), bounds.grapheneRectPointer.reinterpret())!!.reinterpret()
    )

    /**
     * Retrieves the color of the given @node.
     *
     * @return the color of the node
     */
    public open fun getColor(): Rgba = gsk_color_node_get_color(gskColorNodePointer.reinterpret())!!.run {
        Rgba(reinterpret())
    }

    public companion object : TypeCompanion<ColorNode> {
        override val type: GeneratedClassKGType<ColorNode> =
            GeneratedClassKGType(gsk_color_node_get_type()) { ColorNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of ColorNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_color_node_get_type()
    }
}
