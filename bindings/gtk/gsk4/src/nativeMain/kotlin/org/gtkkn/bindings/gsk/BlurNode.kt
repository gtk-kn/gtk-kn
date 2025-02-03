// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskBlurNode
import org.gtkkn.native.gsk.gsk_blur_node_get_child
import org.gtkkn.native.gsk.gsk_blur_node_get_radius
import org.gtkkn.native.gsk.gsk_blur_node_get_type
import org.gtkkn.native.gsk.gsk_blur_node_new
import org.gtkkn.native.gsk.gsk_render_node_unref

/**
 * A render node applying a blur effect to its single child.
 */
public open class BlurNode(public val gskBlurNodePointer: CPointer<GskBlurNode>) :
    RenderNode(gskBlurNodePointer.reinterpret()),
    KGTyped {
    init {
        Gsk
    }

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
    ) : this(gsk_blur_node_new(child.gskRenderNodePointer, radius)!!.reinterpret()) {
        MemoryCleaner.setFreeFunc(this, owned = true) { gsk_render_node_unref(it.reinterpret()) }
    }

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
            GeneratedClassKGType(getTypeOrNull()!!) { BlurNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of BlurNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_blur_node_get_type()

        /**
         * Gets the GType of from the symbol `gsk_blur_node_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gsk_blur_node_get_type")
    }
}
