// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.graphene.Matrix
import org.gtkkn.bindings.graphene.Vec4
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskColorMatrixNode
import org.gtkkn.native.gsk.gsk_color_matrix_node_get_child
import org.gtkkn.native.gsk.gsk_color_matrix_node_get_color_matrix
import org.gtkkn.native.gsk.gsk_color_matrix_node_get_color_offset
import org.gtkkn.native.gsk.gsk_color_matrix_node_get_type
import org.gtkkn.native.gsk.gsk_color_matrix_node_new
import org.gtkkn.native.gsk.gsk_render_node_unref

/**
 * A render node controlling the color matrix of its single child node.
 */
public open class ColorMatrixNode(public val gskColorMatrixNodePointer: CPointer<GskColorMatrixNode>) :
    RenderNode(gskColorMatrixNodePointer.reinterpret()),
    KGTyped {
    init {
        Gsk
    }

    /**
     * Creates a `GskRenderNode` that will drawn the @child with
     * @color_matrix.
     *
     * In particular, the node will transform colors by applying
     *
     *     pixel = transpose(color_matrix) * pixel + color_offset
     *
     * for every pixel. The transformation operates on unpremultiplied
     * colors, with color components ordered R, G, B, A.
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
            child.gskRenderNodePointer,
            colorMatrix.grapheneMatrixPointer,
            colorOffset.grapheneVec4Pointer
        )!!.reinterpret()
    ) {
        MemoryCleaner.setFreeFunc(this, owned = true) { gsk_render_node_unref(it.reinterpret()) }
    }

    /**
     * Gets the child node that is getting its colors modified by the given @node.
     *
     * @return The child that is getting its colors modified
     */
    public open fun getChild(): RenderNode =
        gsk_color_matrix_node_get_child(gskColorMatrixNodePointer.reinterpret())!!.run {
            RenderNode.RenderNodeImpl(this)
        }

    /**
     * Retrieves the color matrix used by the @node.
     *
     * @return a 4x4 color matrix
     */
    public open fun getColorMatrix(): Matrix =
        gsk_color_matrix_node_get_color_matrix(gskColorMatrixNodePointer.reinterpret())!!.run {
            Matrix(this)
        }

    /**
     * Retrieves the color offset used by the @node.
     *
     * @return a color vector
     */
    public open fun getColorOffset(): Vec4 =
        gsk_color_matrix_node_get_color_offset(gskColorMatrixNodePointer.reinterpret())!!.run {
            Vec4(this)
        }

    public companion object : TypeCompanion<ColorMatrixNode> {
        override val type: GeneratedClassKGType<ColorMatrixNode> =
            GeneratedClassKGType(getTypeOrNull()!!) { ColorMatrixNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of ColorMatrixNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_color_matrix_node_get_type()

        /**
         * Gets the GType of from the symbol `gsk_color_matrix_node_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gsk_color_matrix_node_get_type")
    }
}
