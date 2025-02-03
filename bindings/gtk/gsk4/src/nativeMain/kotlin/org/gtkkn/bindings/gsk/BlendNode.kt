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
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gsk.GskBlendNode
import org.gtkkn.native.gsk.gsk_blend_node_get_blend_mode
import org.gtkkn.native.gsk.gsk_blend_node_get_bottom_child
import org.gtkkn.native.gsk.gsk_blend_node_get_top_child
import org.gtkkn.native.gsk.gsk_blend_node_get_type
import org.gtkkn.native.gsk.gsk_blend_node_new
import org.gtkkn.native.gsk.gsk_render_node_unref

/**
 * A render node applying a blending function between its two child nodes.
 */
public open class BlendNode(public val gskBlendNodePointer: CPointer<GskBlendNode>) :
    RenderNode(gskBlendNodePointer.reinterpret()),
    KGTyped {
    init {
        Gsk
    }

    /**
     * Creates a `GskRenderNode` that will use @blend_mode to blend the @top
     * node onto the @bottom node.
     *
     * @param bottom The bottom node to be drawn
     * @param top The node to be blended onto the @bottom node
     * @param blendMode The blend mode to use
     * @return A new `GskRenderNode`
     */
    public constructor(
        bottom: RenderNode,
        top: RenderNode,
        blendMode: BlendMode,
    ) : this(
        gsk_blend_node_new(bottom.gskRenderNodePointer, top.gskRenderNodePointer, blendMode.nativeValue)!!.reinterpret()
    ) {
        MemoryCleaner.setFreeFunc(this, owned = true) { gsk_render_node_unref(it.reinterpret()) }
    }

    /**
     * Retrieves the blend mode used by @node.
     *
     * @return the blend mode
     */
    public open fun getBlendMode(): BlendMode = gsk_blend_node_get_blend_mode(gskBlendNodePointer.reinterpret()).run {
        BlendMode.fromNativeValue(this)
    }

    /**
     * Retrieves the bottom `GskRenderNode` child of the @node.
     *
     * @return the bottom child node
     */
    public open fun getBottomChild(): RenderNode =
        gsk_blend_node_get_bottom_child(gskBlendNodePointer.reinterpret())!!.run {
            RenderNode.RenderNodeImpl(this)
        }

    /**
     * Retrieves the top `GskRenderNode` child of the @node.
     *
     * @return the top child node
     */
    public open fun getTopChild(): RenderNode = gsk_blend_node_get_top_child(gskBlendNodePointer.reinterpret())!!.run {
        RenderNode.RenderNodeImpl(this)
    }

    public companion object : TypeCompanion<BlendNode> {
        override val type: GeneratedClassKGType<BlendNode> =
            GeneratedClassKGType(getTypeOrNull()!!) { BlendNode(it.reinterpret()) }

        init {
            GskTypeProvider.register()
        }

        /**
         * Get the GType of BlendNode
         *
         * @return the GType
         */
        public fun getType(): GType = gsk_blend_node_get_type()

        /**
         * Gets the GType of from the symbol `gsk_blend_node_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gsk_blend_node_get_type")
    }
}
