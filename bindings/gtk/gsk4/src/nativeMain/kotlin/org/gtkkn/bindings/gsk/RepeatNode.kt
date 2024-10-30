// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.graphene.Rect
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gsk.GskRepeatNode
import org.gtkkn.native.gsk.gsk_repeat_node_get_child
import org.gtkkn.native.gsk.gsk_repeat_node_get_child_bounds
import org.gtkkn.native.gsk.gsk_repeat_node_get_type
import org.gtkkn.native.gsk.gsk_repeat_node_new

/**
 * A render node repeating its single child node.
 */
public open class RepeatNode(
    pointer: CPointer<GskRepeatNode>,
) : RenderNode(pointer.reinterpret()),
    KGTyped {
    public val gskRepeatNodePointer: CPointer<GskRepeatNode>
        get() = gPointer.reinterpret()

    /**
     * Creates a `GskRenderNode` that will repeat the drawing of @child across
     * the given @bounds.
     *
     * @param bounds The bounds of the area to be painted
     * @param child The child to repeat
     * @param childBounds The area of the child to repeat or null to
     *     use the child's bounds
     * @return A new `GskRenderNode`
     */
    public constructor(
        bounds: Rect,
        child: RenderNode,
        childBounds: Rect? = null,
    ) : this(
        gsk_repeat_node_new(
            bounds.grapheneRectPointer,
            child.gPointer.reinterpret(),
            childBounds?.grapheneRectPointer
        )!!.reinterpret()
    )

    /**
     * Retrieves the child of @node.
     *
     * @return a `GskRenderNode`
     */
    public open fun getChild(): RenderNode =
        gsk_repeat_node_get_child(gskRepeatNodePointer.reinterpret())!!.run {
            RenderNode(reinterpret())
        }

    /**
     * Retrieves the bounding rectangle of the child of @node.
     *
     * @return a bounding rectangle
     */
    public open fun getChildBounds(): Rect =
        gsk_repeat_node_get_child_bounds(gskRepeatNodePointer.reinterpret())!!.run {
            Rect(reinterpret())
        }

    public companion object : TypeCompanion<RepeatNode> {
        override val type: GeneratedClassKGType<RepeatNode> =
            GeneratedClassKGType(gsk_repeat_node_get_type()) { RepeatNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }
    }
}
