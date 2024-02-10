// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.graphene.Matrix
import org.gtkkn.bindings.graphene.Vec4
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gsk.GskColorMatrixNode
import org.gtkkn.native.gsk.gsk_color_matrix_node_get_child
import org.gtkkn.native.gsk.gsk_color_matrix_node_get_color_matrix
import org.gtkkn.native.gsk.gsk_color_matrix_node_get_color_offset
import org.gtkkn.native.gsk.gsk_color_matrix_node_get_type
import org.gtkkn.native.gsk.gsk_color_matrix_node_new

/**
 * A render node controlling the color matrix of its single child node.
 */
public open class ColorMatrixNode(
    pointer: CPointer<GskColorMatrixNode>,
) : RenderNode(pointer.reinterpret()), KGTyped {
    public val gskColorMatrixNodePointer: CPointer<GskColorMatrixNode>
        get() = gPointer.reinterpret()

    /**
     * Creates a `GskRenderNode` that will drawn the @child with
     * @color_matrix.
     *
     * In particular, the node will transform the operation
     *
     *     pixel = color_matrix * pixel + color_offset
     *
     * for every pixel.
     *
     * @param child The node to draw
     * @param colorMatrix The matrix to apply
     * @param colorOffset Values to add to the color
     * @return A new `GskRenderNode`
     */
    public constructor(
        child: RenderNode,
        colorMatrix: Matrix,
        colorOffset: Vec4,
    ) : this(
        gsk_color_matrix_node_new(
            child.gPointer.reinterpret(),
            colorMatrix.grapheneMatrixPointer,
            colorOffset.grapheneVec4Pointer
        )!!.reinterpret()
    )

    /**
     * Gets the child node that is getting its colors modified by the given @node.
     *
     * @return The child that is getting its colors modified
     */
    public open fun getChild(): RenderNode =
        gsk_color_matrix_node_get_child(gskColorMatrixNodePointer.reinterpret())!!.run {
            RenderNode(reinterpret())
        }

    /**
     * Retrieves the color matrix used by the @node.
     *
     * @return a 4x4 color matrix
     */
    public open fun getColorMatrix(): Matrix =
        gsk_color_matrix_node_get_color_matrix(gskColorMatrixNodePointer.reinterpret())!!.run {
            Matrix(reinterpret())
        }

    /**
     * Retrieves the color offset used by the @node.
     *
     * @return a color vector
     */
    public open fun getColorOffset(): Vec4 =
        gsk_color_matrix_node_get_color_offset(gskColorMatrixNodePointer.reinterpret())!!.run {
            Vec4(reinterpret())
        }

    public companion object : TypeCompanion<ColorMatrixNode> {
        override val type: GeneratedClassKGType<ColorMatrixNode> =
            GeneratedClassKGType(gsk_color_matrix_node_get_type()) {
                ColorMatrixNode(it.reinterpret())
            }

        init {
            GskTypeProvider.register()
        }
    }
}
