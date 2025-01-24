// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskBlurNode
import org.gtkkn.native.gsk.gsk_blur_node_get_child
import org.gtkkn.native.gsk.gsk_blur_node_get_radius
import org.gtkkn.native.gsk.gsk_blur_node_get_type
import org.gtkkn.native.gsk.gsk_blur_node_new

/**
 * A render node applying a blur effect to its single child.
 */
public open class BlurNode(public val gskBlurNodePointer: CPointer<GskBlurNode>) :
    RenderNode(gskBlurNodePointer.reinterpret()),
    KGTyped {
    /**
     * Creates a render node that blurs the child.
     *
     * @param child the child node to blur
     * @param radius the blur radius. Must be positive
     * @return a new `GskRenderNode`
     */
    public constructor(
        child: RenderNode,
        radius: gfloat,
    ) : this(gsk_blur_node_new(child.gskRenderNodePointer, radius)!!.reinterpret())

    /**
     * Retrieves the child `GskRenderNode` of the blur @node.
     *
     * @return the blurred child node
     */
    public open fun getChild(): RenderNode = gsk_blur_node_get_child(gskBlurNodePointer.reinterpret())!!.run {
        RenderNode.RenderNodeImpl(this)
    }

    /**
     * Retrieves the blur radius of the @node.
     *
     * @return the blur radius
     */
    public open fun getRadius(): gfloat = gsk_blur_node_get_radius(gskBlurNodePointer.reinterpret())

    public companion object : TypeCompanion<BlurNode> {
        override val type: GeneratedClassKGType<BlurNode> =
            GeneratedClassKGType(gsk_blur_node_get_type()) { BlurNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of BlurNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_blur_node_get_type()
    }
}
